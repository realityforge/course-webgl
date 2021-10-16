package org.realityforge.webgl.webgpu.compute_boids;

import akasha.HTMLCanvasElement;
import akasha.WindowGlobal;
import akasha.core.Float32Array;
import akasha.core.JsMath;
import akasha.gpu.GPUAdapter;
import akasha.gpu.GPUBindGroup;
import akasha.gpu.GPUBindGroupDescriptor;
import akasha.gpu.GPUBindGroupEntry;
import akasha.gpu.GPUBuffer;
import akasha.gpu.GPUBufferBinding;
import akasha.gpu.GPUBufferDescriptor;
import akasha.gpu.GPUBufferUsage;
import akasha.gpu.GPUCanvasConfiguration;
import akasha.gpu.GPUCanvasContext;
import akasha.gpu.GPUColorDict;
import akasha.gpu.GPUColorTargetState;
import akasha.gpu.GPUCommandEncoder;
import akasha.gpu.GPUComputePassEncoder;
import akasha.gpu.GPUComputePipeline;
import akasha.gpu.GPUComputePipelineDescriptor;
import akasha.gpu.GPUDevice;
import akasha.gpu.GPUFragmentState;
import akasha.gpu.GPUPrimitiveState;
import akasha.gpu.GPUPrimitiveTopology;
import akasha.gpu.GPUProgrammableStage;
import akasha.gpu.GPURenderPassColorAttachment;
import akasha.gpu.GPURenderPassDescriptor;
import akasha.gpu.GPURenderPassEncoder;
import akasha.gpu.GPURenderPipeline;
import akasha.gpu.GPURenderPipelineDescriptor;
import akasha.gpu.GPUShaderModule;
import akasha.gpu.GPUShaderModuleDescriptor;
import akasha.gpu.GPUStoreOp;
import akasha.gpu.GPUTextureFormat;
import akasha.gpu.GPUTextureView;
import akasha.gpu.GPUVertexAttribute;
import akasha.gpu.GPUVertexBufferLayout;
import akasha.gpu.GPUVertexFormat;
import akasha.gpu.GPUVertexState;
import akasha.gpu.GPUVertexStepMode;
import akasha.gpu.WGSL;
import akasha.lang.JsArray;
import com.google.gwt.core.client.EntryPoint;
import javax.annotation.Nonnull;
import org.realityforge.webgl.webgpu.util.WebGpuKit;

@SuppressWarnings( "UnstableApiUsage" )
public final class Main
  implements EntryPoint
{
  private static final int NUM_PARTICLES = 1500;
  private final SimulationParameters _simParams = new SimulationParameters();
  private GPUDevice _device;
  private GPURenderPipeline _renderPipeline;
  private GPUCanvasContext _gl;
  private GPUAdapter _adapter;
  private GPUBuffer _simParamBuffer;
  private GPUComputePipeline _computePipeline;
  private GPUBindGroup[] _particleBindGroups;
  private int _simFrame;
  private GPUBuffer[] _particleBuffers;
  private GPUBuffer _spriteVertexBuffer;

  @Override
  public void onModuleLoad()
  {
    WindowGlobal.navigator().gpu().requestAdapter().then( adapter -> {
      _adapter = adapter;
      return adapter.requestDevice();
    } ).thenAccept( this::onStart );
  }

  private void onStart( @Nonnull final GPUDevice device )
  {
    _device = device;
    final HTMLCanvasElement canvas = WebGpuKit.createFullWindowCanvas();

    _gl = WebGpuKit.getGpuCanvasContext( canvas );

    // Use the preferred format of adapter instead of hardcoding to a specific format ala bgra8unorm.
    @GPUTextureFormat
    final String textureFormat = _gl.getPreferredFormat( _adapter );

    _gl.configure( GPUCanvasConfiguration
                     .create( _device, textureFormat )
                     //Ensure the configured size takes into account the device pixel ratio.
                     .size( WebGpuKit.calcGpuExtent3D( canvas ) ) );

    @WGSL
    final String shader =
      "[[stage(vertex)]]\n" +
      "fn vert_main([[location(0)]] a_particlePos : vec2<f32>,\n" +
      "             [[location(1)]] a_particleVel : vec2<f32>,\n" +
      "             [[location(2)]] a_pos : vec2<f32>) -> [[builtin(position)]] vec4<f32> {\n" +
      "  var angle = -atan2(a_particleVel.x, a_particleVel.y);\n" +
      "  var pos = vec2<f32>(\n" +
      "      (a_pos.x * cos(angle)) - (a_pos.y * sin(angle)),\n" +
      "      (a_pos.x * sin(angle)) + (a_pos.y * cos(angle)));\n" +
      "  return vec4<f32>(pos + a_particlePos, 0.0, 1.0);\n" +
      "}\n" +
      "\n" +
      "[[stage(fragment)]]\n" +
      "fn frag_main() -> [[location(0)]] vec4<f32> {\n" +
      "  return vec4<f32>(1.0, 1.0, 1.0, 1.0);\n" +
      "}\n";
    final GPUShaderModule shaderModule = _device.createShaderModule( GPUShaderModuleDescriptor.code( shader ) );

    // instanced particles buffer
    final GPUVertexBufferLayout instancedParticlesBuffer =
      GPUVertexBufferLayout
        .create( Float.BYTES * 4,
                 // instance position
                 GPUVertexAttribute.create( GPUVertexFormat.float32x2,
                                            0,
                                            0 ),
                 // instance velocity
                 GPUVertexAttribute.create( GPUVertexFormat.float32x2,
                                            2 * Float.BYTES,
                                            1 ) )
        .stepMode( GPUVertexStepMode.instance );
    // vertex buffer
    final GPUVertexBufferLayout vertexBuffer =
      GPUVertexBufferLayout
        .create( Float.BYTES * 2,
                 // vertex positions
                 GPUVertexAttribute.create( GPUVertexFormat.float32x2, 0, 2 ) )
        .stepMode( GPUVertexStepMode.vertex );
    final GPUVertexState.Builder vertexState =
      GPUVertexState.create( shaderModule,
                             "vert_main" )
        .buffers( new JsArray<GPUVertexBufferLayout>().concat( instancedParticlesBuffer, vertexBuffer ) );
    final GPUFragmentState fragmentState =
      GPUFragmentState.create( shaderModule,
                               "frag_main",
                               GPUColorTargetState.format( textureFormat ) );

    _renderPipeline =
      _device.createRenderPipeline( GPURenderPipelineDescriptor
                                      .vertex( vertexState )
                                      .fragment( fragmentState )
                                      .primitive( GPUPrimitiveState
                                                    .create()
                                                    .topology( GPUPrimitiveTopology.triangle_list ) ) );

    @WGSL
    final String computerShader =
      "struct Particle {\n" +
      "  pos : vec2<f32>;\n" +
      "  vel : vec2<f32>;\n" +
      "};\n" +
      "[[block]] struct SimParams {\n" +
      "  deltaT : f32;\n" +
      "  rule1Distance : f32;\n" +
      "  rule2Distance : f32;\n" +
      "  rule3Distance : f32;\n" +
      "  rule1Scale : f32;\n" +
      "  rule2Scale : f32;\n" +
      "  rule3Scale : f32;\n" +
      "};\n" +
      "[[block]] struct Particles {\n" +
      "  particles : [[stride(16)]] array<Particle>;\n" +
      "};\n" +
      "[[binding(0), group(0)]] var<uniform> params : SimParams;\n" +
      "[[binding(1), group(0)]] var<storage, read> particlesA : Particles;\n" +
      "[[binding(2), group(0)]] var<storage, read_write> particlesB : Particles;\n" +
      "\n" +
      "// https://github.com/austinEng/Project6-Vulkan-Flocking/blob/master/data/shaders/computeparticles/particle.comp\n" +
      "[[stage(compute), workgroup_size(64)]]\n" +
      "fn main([[builtin(global_invocation_id)]] GlobalInvocationID : vec3<u32>) {\n" +
      "  var index : u32 = GlobalInvocationID.x;\n" +
      "\n" +
      "  var vPos = particlesA.particles[index].pos;\n" +
      "  var vVel = particlesA.particles[index].vel;\n" +
      "  var cMass = vec2<f32>(0.0, 0.0);\n" +
      "  var cVel = vec2<f32>(0.0, 0.0);\n" +
      "  var colVel = vec2<f32>(0.0, 0.0);\n" +
      "  var cMassCount : u32 = 0u;\n" +
      "  var cVelCount : u32 = 0u;\n" +
      "  var pos : vec2<f32>;\n" +
      "  var vel : vec2<f32>;\n" +
      "\n" +
      "  for (var i : u32 = 0u; i < arrayLength(&particlesA.particles); i = i + 1u) {\n" +
      "    if (i == index) {\n" +
      "      continue;\n" +
      "    }\n" +
      "\n" +
      "    pos = particlesA.particles[i].pos.xy;\n" +
      "    vel = particlesA.particles[i].vel.xy;\n" +
      "    if (distance(pos, vPos) < params.rule1Distance) {\n" +
      "      cMass = cMass + pos;\n" +
      "      cMassCount = cMassCount + 1u;\n" +
      "    }\n" +
      "    if (distance(pos, vPos) < params.rule2Distance) {\n" +
      "      colVel = colVel - (pos - vPos);\n" +
      "    }\n" +
      "    if (distance(pos, vPos) < params.rule3Distance) {\n" +
      "      cVel = cVel + vel;\n" +
      "      cVelCount = cVelCount + 1u;\n" +
      "    }\n" +
      "  }\n" +
      "  if (cMassCount > 0u) {\n" +
      "    var temp = f32(cMassCount);\n" +
      "    cMass = (cMass / vec2<f32>(temp, temp)) - vPos;\n" +
      "  }\n" +
      "  if (cVelCount > 0u) {\n" +
      "    var temp = f32(cVelCount);\n" +
      "    cVel = cVel / vec2<f32>(temp, temp);\n" +
      "  }\n" +
      "  vVel = vVel + (cMass * params.rule1Scale) + (colVel * params.rule2Scale) +\n" +
      "      (cVel * params.rule3Scale);\n" +
      "\n" +
      "  // clamp velocity for a more pleasing simulation\n" +
      "  vVel = normalize(vVel) * clamp(length(vVel), 0.0, 0.1);\n" +
      "  // kinematic update\n" +
      "  vPos = vPos + (vVel * params.deltaT);\n" +
      "  // Wrap around boundary\n" +
      "  if (vPos.x < -1.0) {\n" +
      "    vPos.x = 1.0;\n" +
      "  }\n" +
      "  if (vPos.x > 1.0) {\n" +
      "    vPos.x = -1.0;\n" +
      "  }\n" +
      "  if (vPos.y < -1.0) {\n" +
      "    vPos.y = 1.0;\n" +
      "  }\n" +
      "  if (vPos.y > 1.0) {\n" +
      "    vPos.y = -1.0;\n" +
      "  }\n" +
      "  // Write back\n" +
      "  particlesB.particles[index].pos = vPos;\n" +
      "  particlesB.particles[index].vel = vVel;\n" +
      "}\n";
    final GPUProgrammableStage vertexData =
      GPUProgrammableStage.create( _device.createShaderModule( GPUShaderModuleDescriptor.code( computerShader ) ),
                                   "main" );
    _computePipeline =
      _device.createComputePipeline( GPUComputePipelineDescriptor.compute( vertexData ) );
    final Float32Array vertexBufferData =
      new Float32Array( new double[]{ -0.01, -0.02, 0.01,
                                      -0.02, 0.0, 0.02 } );

    _spriteVertexBuffer =
      _device.createBuffer( GPUBufferDescriptor
                              .create( vertexBufferData.byteLength(), GPUBufferUsage.VERTEX )
                              .mappedAtCreation( true ) );
    new Float32Array( _spriteVertexBuffer.getMappedRange() ).set( vertexBufferData );
    _spriteVertexBuffer.unmap();

    _simParamBuffer =
      device.createBuffer( GPUBufferDescriptor.create( 7 * Float32Array.BYTES_PER_ELEMENT,
                                                       GPUBufferUsage.UNIFORM | GPUBufferUsage.COPY_DST ) );

    // Update the bugger that contains the simulation parameters
    uploadSimParameters();

    final Float32Array initialParticleData = new Float32Array( NUM_PARTICLES * 4 );
    for ( int i = 0; i < NUM_PARTICLES; i++ )
    {
      initialParticleData.setAt( 4 * i, (float) ( 2 * ( Math.random() - 0.5 ) ) );
      initialParticleData.setAt( 4 * i + 1, (float) ( 2 * ( Math.random() - 0.5 ) ) );
      initialParticleData.setAt( 4 * i + 2, (float) ( 2 * ( Math.random() - 0.5 ) * 0.1 ) );
      initialParticleData.setAt( 4 * i + 3, (float) ( 2 * ( Math.random() - 0.5 ) * 0.1 ) );
    }

    _particleBuffers = new GPUBuffer[ 2 ];
    _particleBindGroups = new GPUBindGroup[ 2 ];

    // Setup particle buffers
    for ( int i = 0; i < 2; i++ )
    {
      final GPUBuffer buffer =
        device.createBuffer( GPUBufferDescriptor
                               .create( initialParticleData.byteLength(),
                                        GPUBufferUsage.VERTEX | GPUBufferUsage.STORAGE )
                               .mappedAtCreation( true ) );
      new Float32Array( buffer.getMappedRange() ).set( initialParticleData );
      buffer.unmap();
      _particleBuffers[ i ] = buffer;
    }

    // Setup bind groups
    for ( int i = 0; i < 2; i++ )
    {
      _particleBindGroups[ i ] = device.createBindGroup(
        GPUBindGroupDescriptor.create( _computePipeline.getBindGroupLayout( 0 ),
                                       GPUBindGroupEntry.create( 0, GPUBufferBinding.buffer( _simParamBuffer ) ),
                                       GPUBindGroupEntry.create( 1,
                                                                 GPUBufferBinding
                                                                   .buffer( _particleBuffers[ i ] )
                                                                   .offset( 0 )
                                                                   .size( initialParticleData.byteLength() ) ),
                                       GPUBindGroupEntry.create( 2,
                                                                 GPUBufferBinding
                                                                   .buffer( _particleBuffers[ ( i + 1 ) % 2 ] )
                                                                   .offset( 0 )
                                                                   .size( initialParticleData.byteLength() ) ) ) );
    }

    WindowGlobal.requestAnimationFrame( t -> renderFrame() );
  }

  private void renderFrame()
  {
    WindowGlobal.requestAnimationFrame( t -> renderFrame() );
    _simFrame++;

    final GPUCommandEncoder commandEncoder = _device.createCommandEncoder();
    final GPUTextureView textureView = _gl.getCurrentTexture().createView();

    final GPURenderPassColorAttachment attachment =
      GPURenderPassColorAttachment.create( textureView,
                                           GPUColorDict.create( 0, 0, 0, 1 ),
                                           GPUStoreOp.store );
    {
      final GPUComputePassEncoder passEncoder = commandEncoder.beginComputePass();
      passEncoder.setPipeline( _computePipeline );
      passEncoder.setBindGroup( 0, _particleBindGroups[ _simFrame % 2 ] );
      passEncoder.dispatch( JsMath.ceil( NUM_PARTICLES / 64.0 ) );
      passEncoder.endPass();
    }
    {
      final GPURenderPassEncoder passEncoder =
        commandEncoder.beginRenderPass( GPURenderPassDescriptor.colorAttachments( attachment ) );
      passEncoder.setPipeline( _renderPipeline );
      passEncoder.setVertexBuffer( 0, _particleBuffers[ ( _simFrame + 1 ) % 2 ] );
      passEncoder.setVertexBuffer( 1, _spriteVertexBuffer );
      passEncoder.draw( 3, NUM_PARTICLES, 0, 0 );

      passEncoder.draw( 3, 1, 0, 0 );
      passEncoder.endPass();
    }

    _device.queue().submit( commandEncoder.finish() );
  }

  private void uploadSimParameters()
  {
    _device.queue().writeBuffer( _simParamBuffer,
                                 0,
                                 new Float32Array( new double[]{ _simParams.deltaT,
                                                                 _simParams.rule1Distance,
                                                                 _simParams.rule2Distance,
                                                                 _simParams.rule3Distance,
                                                                 _simParams.rule1Scale,
                                                                 _simParams.rule2Scale,
                                                                 _simParams.rule3Scale, } ) );
  }

  public static class SimulationParameters
  {
    public double deltaT = 0.04;
    public double rule1Distance = 0.1;
    public double rule2Distance = 0.025;
    public double rule3Distance = 0.025;
    public double rule1Scale = 0.02;
    public double rule2Scale = 0.05;
    public double rule3Scale = 0.005;
  }
}
