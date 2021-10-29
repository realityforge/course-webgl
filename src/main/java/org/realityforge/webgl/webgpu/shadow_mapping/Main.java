package org.realityforge.webgl.webgpu.shadow_mapping;

import akasha.Console;
import akasha.HTMLCanvasElement;
import akasha.WindowGlobal;
import akasha.core.Float32Array;
import akasha.core.JsNumber;
import akasha.core.Uint32Array;
import akasha.gpu.GPUAdapter;
import akasha.gpu.GPUBindGroup;
import akasha.gpu.GPUBindGroupDescriptor;
import akasha.gpu.GPUBindGroupEntry;
import akasha.gpu.GPUBindGroupLayout;
import akasha.gpu.GPUBindGroupLayoutDescriptor;
import akasha.gpu.GPUBindGroupLayoutEntry;
import akasha.gpu.GPUBuffer;
import akasha.gpu.GPUBufferBinding;
import akasha.gpu.GPUBufferBindingLayout;
import akasha.gpu.GPUBufferBindingType;
import akasha.gpu.GPUBufferDescriptor;
import akasha.gpu.GPUBufferUsage;
import akasha.gpu.GPUCanvasConfiguration;
import akasha.gpu.GPUCanvasContext;
import akasha.gpu.GPUColorDict;
import akasha.gpu.GPUColorTargetState;
import akasha.gpu.GPUCommandEncoder;
import akasha.gpu.GPUCompareFunction;
import akasha.gpu.GPUCullMode;
import akasha.gpu.GPUDepthStencilState;
import akasha.gpu.GPUDevice;
import akasha.gpu.GPUExtent3DDict;
import akasha.gpu.GPUFragmentState;
import akasha.gpu.GPUPipelineLayout;
import akasha.gpu.GPUPipelineLayoutDescriptor;
import akasha.gpu.GPUPrimitiveState;
import akasha.gpu.GPUPrimitiveTopology;
import akasha.gpu.GPURenderPassColorAttachment;
import akasha.gpu.GPURenderPassDepthStencilAttachment;
import akasha.gpu.GPURenderPassDescriptor;
import akasha.gpu.GPURenderPassEncoder;
import akasha.gpu.GPURenderPipeline;
import akasha.gpu.GPURenderPipelineDescriptor;
import akasha.gpu.GPUSamplerBindingLayout;
import akasha.gpu.GPUSamplerBindingType;
import akasha.gpu.GPUSamplerDescriptor;
import akasha.gpu.GPUShaderModule;
import akasha.gpu.GPUShaderStage;
import akasha.gpu.GPUStoreOp;
import akasha.gpu.GPUTexture;
import akasha.gpu.GPUTextureBindingLayout;
import akasha.gpu.GPUTextureDescriptor;
import akasha.gpu.GPUTextureFormat;
import akasha.gpu.GPUTextureSampleType;
import akasha.gpu.GPUTextureUsage;
import akasha.gpu.GPUTextureView;
import akasha.gpu.GPUVertexAttribute;
import akasha.gpu.GPUVertexBufferLayout;
import akasha.gpu.GPUVertexFormat;
import akasha.gpu.GPUVertexState;
import akasha.gpu.WGSL;
import akasha.lang.JsArray;
import com.google.gwt.core.client.EntryPoint;
import javax.annotation.Nonnull;
import jsinterop.base.Js;
import org.realityforge.vecmath.Matrix4d;
import org.realityforge.vecmath.Vector3d;
import org.realityforge.vecmath.Vector3f;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.MathUtil;
import org.realityforge.webgl.webgpu.util.WebGpuKit;
import org.realityforge.webgl.webgpu.util.dragon.Asset;

@SuppressWarnings( "UnstableApiUsage" )
public final class Main
  implements EntryPoint
{
  private static final int SHADOW_DEPTH_TEXTURE_SIZE = 1024;
  private GPUDevice _device;
  private GPURenderPipeline _pipeline;
  private GPUCanvasContext _gl;
  private GPUAdapter _adapter;
  private GPUBuffer _verticesBuffer;
  private GPUBuffer _indexBuffer;
  private GPURenderPassDescriptor _renderPassDescriptor;
  private Asset _asset;
  private GPURenderPipeline _shadowPipeline;
  private GPUBuffer _sceneUniformBuffer;
  @Nonnull
  private final Matrix4d _projectionMatrix = new Matrix4d();
  @Nonnull
  private final Matrix4d _lightViewMatrix = new Matrix4d();
  @Nonnull
  private final Matrix4d _lightProjectionMatrix = new Matrix4d();
  @Nonnull
  private final Matrix4d _lightViewProjectionMatrix = new Matrix4d();
  private GPURenderPassDescriptor _shadowRenderPassDescriptor;
  private GPUBindGroup _sceneBindGroupForShadow;
  private GPUBindGroup _sceneBindGroupForRender;
  private GPUBindGroup _modelBindGroup;

  @Override
  public void onModuleLoad()
  {
    Asset.loadStanfordDragon().thenAccept( data -> {
      patchDragonData( data );
      _asset = data;
      WindowGlobal.navigator().gpu().requestAdapter().then( adapter -> {
        _adapter = adapter;
        return adapter.requestDevice();
      } ).thenAccept( this::onStart );
    } );
  }

  @SuppressWarnings( "ConstantConditions" )
  private void patchDragonData( @Nonnull final Asset data )
  {
    // This is so very ugly and breaks java type rules ... but it is an attempt to emulate
    // the behaviour of the original example ...
    //
    // but it does not seem to work as the extra triangles are not rendered ...

    double minX = 0;
    double maxX = 0;
    double minY = 0;
    double maxY = 0;
    double minZ = 0;
    double maxZ = 0;

    final int components = data.components();
    for ( int i = 0; i < data.getVertices().length; i += components )
    {
      minX = Math.min( minX, data.getVertices()[ i ] );
      maxX = Math.max( maxX, data.getVertices()[ i ] );
      minY = Math.min( minY, data.getVertices()[ i + 1 ] );
      maxY = Math.max( maxY, data.getVertices()[ i + 1 ] );
      minZ = Math.min( minZ, data.getVertices()[ i + 2 ] );
      maxZ = Math.max( maxZ, data.getVertices()[ i + 2 ] );
    }

    final double xSpan = maxX - minX;
    final double ySpan = maxY - minY;
    final double zSpan = maxZ - minZ;

    final double xHalfSpan = xSpan / 2;
    final double yHalfSpan = ySpan / 2;
    final double zHalfSpan = zSpan / 2;

    final double xCenter = maxX - xHalfSpan;
    final double yCenter = maxY - yHalfSpan;
    final double zCenter = maxZ - zHalfSpan;

    // The next block of code adds indices and vertex attributes for an additional ground plane
    final JsArray<Double> vertices = Js.cast( data.getVertices() );
    final JsArray<Double> indexes = Js.cast( data.getIndices() );

    final double length = vertices.length;
    indexes.push( length, length + 2, length + 1,
                  length, length + 1, length + 3 );

    final double groundMinX = xCenter - xHalfSpan * 3;
    final double groundMaxX = xCenter + xHalfSpan * 3;
    final double groundY = minY;
    final double groundMinZ = zCenter - zHalfSpan * 3;
    final double groundMaxZ = zCenter + zHalfSpan * 3;

    // - 3 floats for position vertex,
    // - 3 floats for vertex normal,
    // - 2 floats for uv coordinates
    vertices.push(
      //vertex 1
      groundMinX, groundY, groundMinZ,
      0D, 1D, 0D,
      0D, 0D,

      //vertex 2
      groundMaxX, groundY, groundMaxZ,
      0D, 1D, 0D,
      1D, 1D,

      //vertex 3
      groundMinX, groundY, groundMaxZ,
      0D, 1D, 0D,
      0D, 1D,

      //vertex 4
      groundMaxX, groundY, groundMinZ,
      0D, 1D, 0D,
      1D, 0D
    );
  }

  private void onStart( @Nonnull final GPUDevice device )
  {
    _device = device;

    device.onuncapturederror = event -> {
      Console.log( event );
      Js.debugger();
    };

    final HTMLCanvasElement canvas = WebGpuKit.createFullWindowCanvas();

    _gl = WebGpuKit.getGpuCanvasContext( canvas );

    // Use the preferred format of adapter instead of hardcoding to a specific format ala bgra8unorm.
    @GPUTextureFormat
    final String textureFormat = _gl.getPreferredFormat( _adapter );

    final GPUExtent3DDict presentationSize = WebGpuKit.calcGpuExtent3D( canvas );
    _gl.configure( GPUCanvasConfiguration
                     .device( device )
                     .format( textureFormat )
                     //Ensure the configured size takes into account the device pixel ratio.
                     .size( presentationSize ) );

    // Create a vertex buffer
    _verticesBuffer =
      device.createBuffer( GPUBufferDescriptor
                             .size( _asset.vertexByteCount() )
                             .usage( GPUBufferUsage.VERTEX )
                             .mappedAtCreation( true ) );
    new Float32Array( _verticesBuffer.getMappedRange() ).set( _asset.getVertices() );
    _verticesBuffer.unmap();

    _indexBuffer = device.createBuffer( GPUBufferDescriptor
                                          .size( _asset.indexByteCount() )
                                          .usage( GPUBufferUsage.INDEX )
                                          .mappedAtCreation( true ) );
    new Uint32Array( _indexBuffer.getMappedRange() ).set( _asset.getIndices() );
    _indexBuffer.unmap();

    // Create the depth texture for rendering/sampling the shadow map.
    final GPUTexture shadowDepthTexture =
      device
        .createTexture( GPUTextureDescriptor
                          .size( GPUExtent3DDict
                                   .width( SHADOW_DEPTH_TEXTURE_SIZE )
                                   .height( SHADOW_DEPTH_TEXTURE_SIZE )
                                   .depthOrArrayLayers( 1 ) )
                          .format( GPUTextureFormat.depth32float )
                          .usage( GPUTextureUsage.RENDER_ATTACHMENT |
                                  GPUTextureUsage.TEXTURE_BINDING ) );
    final GPUTextureView shadowDepthTextureView = shadowDepthTexture.createView();

    // Create some common descriptors used for both the shadow pipeline
    // and the color rendering pipeline.
    final GPUVertexBufferLayout vertexBuffers =
      GPUVertexBufferLayout
        .arrayStride( _asset.vertexStride() )
        .attributes(
          // position
          GPUVertexAttribute.format( GPUVertexFormat.float32x3 ).offset( 0 ).shaderLocation( 0 ),
          // normal
          GPUVertexAttribute
            .format( GPUVertexFormat.float32x3 )
            .offset( Vector3f.BYTES )
            .shaderLocation( 1 )
        );

    final GPUPrimitiveState primitiveState =
      GPUPrimitiveState.of().topology( GPUPrimitiveTopology.triangle_list ).cullMode( GPUCullMode.back );

    final GPUBindGroupLayout uniformBufferBindGroupLayout =
      device.createBindGroupLayout( GPUBindGroupLayoutDescriptor
                                      .entries( GPUBindGroupLayoutEntry
                                                  .binding( 0 )
                                                  .visibility( GPUShaderStage.VERTEX )
                                                  .buffer( GPUBufferBindingLayout
                                                             .of()
                                                             .type( GPUBufferBindingType.uniform ) ) ) );
    @WGSL
    final String shadowShader =
      "[[block]] struct Scene {\n" +
      "  lightViewProjMatrix : mat4x4<f32>;\n" +
      "  cameraViewProjMatrix : mat4x4<f32>;\n" +
      "  lightPos : vec3<f32>;\n" +
      "};\n" +
      "\n" +
      "[[block]] struct Model {\n" +
      "  modelMatrix : mat4x4<f32>;\n" +
      "};\n" +
      "\n" +
      "[[group(0), binding(0)]] var<uniform> scene : Scene;\n" +
      "[[group(1), binding(0)]] var<uniform> model : Model;\n" +
      "\n" +
      "[[stage(vertex)]]\n" +
      "fn vertex_main([[location(0)]] position : vec3<f32>)\n" +
      "     -> [[builtin(position)]] vec4<f32> {\n" +
      "  return scene.lightViewProjMatrix * model.modelMatrix * vec4<f32>(position, 1.0);\n" +
      "}\n" +
      "[[stage(fragment)]]\n" +
      "fn fragment_main() {\n" +
      "}\n";
    final GPUShaderModule shadowShaderModule = WebGpuKit.createShaderModule( device, shadowShader );
    final GPUPipelineLayout shadowPipelineLayout =
      device.createPipelineLayout( GPUPipelineLayoutDescriptor.bindGroupLayouts( uniformBufferBindGroupLayout,
                                                                                 uniformBufferBindGroupLayout ) );
    _shadowPipeline =
      device.createRenderPipeline( GPURenderPipelineDescriptor
                                     .vertex( GPUVertexState
                                                .module( shadowShaderModule )
                                                .entryPoint( "vertex_main" )
                                                .buffers( vertexBuffers ) )
                                     // The fragment shader should be omitted and we can use a vertex-only
                                     // pipeline, but it's not yet implemented.
                                     .fragment( GPUFragmentState
                                                  .module( shadowShaderModule )
                                                  .entryPoint( "fragment_main" )
                                                  .targets() )
                                     .primitive( primitiveState )
                                     .layout( shadowPipelineLayout )
                                     .depthStencil( GPUDepthStencilState
                                                      .format( GPUTextureFormat.depth32float )
                                                      .depthCompare( GPUCompareFunction.less )
                                                      .depthWriteEnabled( true ) ) );

    // Create a bind group layout which holds the scene uniforms and
    // the texture+sampler for depth. We create it manually because the WebGPU
    // implementation doesn't infer this from the shader (yet).
    final GPUBindGroupLayout bglForRender =
      device.createBindGroupLayout(
        GPUBindGroupLayoutDescriptor.entries( GPUBindGroupLayoutEntry
                                                .binding( 0 )
                                                .visibility( GPUShaderStage.VERTEX | GPUShaderStage.FRAGMENT )
                                                .buffer( GPUBufferBindingLayout
                                                           .of()
                                                           .type( GPUBufferBindingType.uniform ) ),
                                              GPUBindGroupLayoutEntry
                                                .binding( 1 )
                                                .visibility( GPUShaderStage.VERTEX | GPUShaderStage.FRAGMENT )
                                                .texture( GPUTextureBindingLayout
                                                            .of()
                                                            .sampleType( GPUTextureSampleType.depth ) ),
                                              GPUBindGroupLayoutEntry
                                                .binding( 2 )
                                                .visibility( GPUShaderStage.VERTEX | GPUShaderStage.FRAGMENT )
                                                .sampler( GPUSamplerBindingLayout
                                                            .of()
                                                            .type( GPUSamplerBindingType.comparison ) ) ) );

    @WGSL
    final String vertexShader =
      "[[block]] struct Scene {\n" +
      "  lightViewProjMatrix : mat4x4<f32>;\n" +
      "  cameraViewProjMatrix : mat4x4<f32>;\n" +
      "  lightPos : vec3<f32>;\n" +
      "};\n" +
      "\n" +
      "[[block]] struct Model {\n" +
      "  modelMatrix : mat4x4<f32>;\n" +
      "};\n" +
      "\n" +
      "[[group(0), binding(0)]] var<uniform> scene : Scene;\n" +
      "[[group(1), binding(0)]] var<uniform> model : Model;\n" +
      "\n" +
      "struct VertexOutput {\n" +
      "  [[location(0)]] shadowPos : vec3<f32>;\n" +
      "  [[location(1)]] fragPos : vec3<f32>;\n" +
      "  [[location(2)]] fragNorm : vec3<f32>;\n" +
      "\n" +
      "  [[builtin(position)]] Position : vec4<f32>;\n" +
      "};\n" +
      "\n" +
      "[[stage(vertex)]]\n" +
      "fn vertex_main([[location(0)]] position : vec3<f32>,\n" +
      "        [[location(1)]] normal : vec3<f32>) -> VertexOutput {\n" +
      "  var output : VertexOutput;\n" +
      "\n" +
      "  // XY is in (-1, 1) space, Z is in (0, 1) space\n" +
      "  let posFromLight : vec4<f32> = scene.lightViewProjMatrix * model.modelMatrix * vec4<f32>(position, 1.0);\n" +
      "\n" +
      "  // Convert XY to (0, 1)\n" +
      "  // Y is flipped because texture coords are Y-down.\n" +
      "  output.shadowPos = vec3<f32>(\n" +
      "    posFromLight.xy * vec2<f32>(0.5, -0.5) + vec2<f32>(0.5, 0.5),\n" +
      "    posFromLight.z\n" +
      "  );\n" +
      "\n" +
      "  output.Position = scene.cameraViewProjMatrix * model.modelMatrix * vec4<f32>(position, 1.0);\n" +
      "  output.fragPos = output.Position.xyz;\n" +
      "  output.fragNorm = normal;\n" +
      "  return output;\n" +
      "}\n";
    final GPUVertexState vertexState =
      GPUVertexState
        .module( WebGpuKit.createShaderModule( device, vertexShader ) )
        .entryPoint( "vertex_main" )
        .buffers( vertexBuffers );

    @WGSL
    final String fragmentShader =
      "[[block]] struct Scene {\n" +
      "  lightViewProjMatrix : mat4x4<f32>;\n" +
      "  cameraViewProjMatrix : mat4x4<f32>;\n" +
      "  lightPos : vec3<f32>;\n" +
      "};\n" +
      "\n" +
      "[[group(0), binding(0)]] var<uniform> scene : Scene;\n" +
      "[[group(0), binding(1)]] var shadowMap: texture_depth_2d;\n" +
      "[[group(0), binding(2)]] var shadowSampler: sampler_comparison;\n" +
      "\n" +
      "struct FragmentInput {\n" +
      "  [[location(0)]] shadowPos : vec3<f32>;\n" +
      "  [[location(1)]] fragPos : vec3<f32>;\n" +
      "  [[location(2)]] fragNorm : vec3<f32>;\n" +
      "};\n" +
      "\n" +
      "let albedo : vec3<f32> = vec3<f32>(0.9, 0.9, 0.9);\n" +
      "let ambientFactor : f32 = 0.2;\n" +
      "\n" +
      "[[stage(fragment)]]\n" +
      "fn fragment_main(input : FragmentInput) -> [[location(0)]] vec4<f32> {\n" +
      "  // Percentage-closer filtering. Sample texels in the region\n" +
      "  // to smooth the result.\n" +
      "  var visibility : f32 = 0.0;\n" +
      "  for (var y : i32 = -1 ; y <= 1 ; y = y + 1) {\n" +
      "      for (var x : i32 = -1 ; x <= 1 ; x = x + 1) {\n" +
      "        let offset : vec2<f32> = vec2<f32>(\n" +
      "          f32(x) * " + new JsNumber( 1F / SHADOW_DEPTH_TEXTURE_SIZE ) + ",\n" +
      "          f32(y) * " + new JsNumber( 1F / SHADOW_DEPTH_TEXTURE_SIZE ) + ");\n" +
      "\n" +
      "          visibility = visibility + textureSampleCompare(\n" +
      "          shadowMap, shadowSampler,\n" +
      "          input.shadowPos.xy + offset, input.shadowPos.z - 0.007);\n" +
      "      }\n" +
      "  }\n" +
      "  visibility = visibility / 9.0;\n" +
      "\n" +
      "  let lambertFactor : f32 = max(dot(normalize(scene.lightPos - input.fragPos), input.fragNorm), 0.0);\n" +
      "\n" +
      "  let lightingFactor : f32 = min(ambientFactor + visibility * lambertFactor, 1.0);\n" +
      "  return vec4<f32>(lightingFactor * albedo, 1.0);\n" +
      "}";
    final GPUFragmentState fragmentState =
      GPUFragmentState
        .module( WebGpuKit.createShaderModule( device, fragmentShader ) )
        .entryPoint( "fragment_main" )
        .targets( GPUColorTargetState.format( textureFormat ) );

    final GPUPipelineLayout pipelineLayout =
      device.createPipelineLayout( GPUPipelineLayoutDescriptor
                                     .bindGroupLayouts( bglForRender, uniformBufferBindGroupLayout ) );
    _pipeline =
      device.createRenderPipeline( GPURenderPipelineDescriptor
                                     .vertex( vertexState )
                                     .fragment( fragmentState )
                                     .primitive( primitiveState )
                                     .layout( pipelineLayout )
                                     .depthStencil( GPUDepthStencilState
                                                      .format( GPUTextureFormat.depth24plus_stencil8 )
                                                      .depthCompare( GPUCompareFunction.less )
                                                      .depthWriteEnabled( true ) ) );
    final GPUTexture depthTexture =
      device.createTexture( GPUTextureDescriptor
                              .size( presentationSize )
                              .format( GPUTextureFormat.depth24plus_stencil8 )
                              .usage( GPUTextureUsage.RENDER_ATTACHMENT ) );

    // 4x4 matrix
    GPUBuffer modelUniformBuffer =
      device.createBuffer( GPUBufferDescriptor
                             .size( Matrix4d.FLOAT_BYTES )
                             .usage( GPUBufferUsage.UNIFORM | GPUBufferUsage.COPY_DST ) );

    // Two 4x4 viewProj matrices,
    // one for the camera and one for the light.
    // Then a vec3 for the light position.
    _sceneUniformBuffer =
      device.createBuffer( GPUBufferDescriptor
                             .size( Matrix4d.FLOAT_BYTES + Matrix4d.FLOAT_BYTES + Vector3f.BYTES )
                             .usage( GPUBufferUsage.UNIFORM | GPUBufferUsage.COPY_DST ) );

    _sceneBindGroupForShadow =
      device.createBindGroup( GPUBindGroupDescriptor
                                .layout( uniformBufferBindGroupLayout )
                                .entries( GPUBindGroupEntry
                                            .binding( 0 )
                                            .resource( GPUBufferBinding.buffer( _sceneUniformBuffer ) ) ) );

    _sceneBindGroupForRender =
      device.createBindGroup( GPUBindGroupDescriptor
                                .layout( bglForRender )
                                .entries( GPUBindGroupEntry
                                            .binding( 0 )
                                            .resource( GPUBufferBinding.buffer( _sceneUniformBuffer ) ),
                                          GPUBindGroupEntry.binding( 1 ).resource( shadowDepthTextureView ),
                                          GPUBindGroupEntry
                                            .binding( 2 )
                                            .resource( device.createSampler( GPUSamplerDescriptor
                                                                               .of()
                                                                               .compare( GPUCompareFunction.less ) ) )
                                )
      );

    _modelBindGroup =
      device.createBindGroup( GPUBindGroupDescriptor
                                .layout( uniformBufferBindGroupLayout )
                                .entries( GPUBindGroupEntry
                                            .binding( 0 )
                                            .resource( GPUBufferBinding.buffer( modelUniformBuffer ) ) ) );

    final Vector3d upVector = new Vector3d( 0, 1, 0 );
    final Vector3d origin = new Vector3d( 0, 0, 0 );

    _projectionMatrix.setPerspective( MathUtil.degreesToRadians( 45 ), CanvasUtil.getAspect( canvas ), 1, 100 );

    final Vector3d lightPosition = new Vector3d( 50, 100, -100 );
    _lightViewMatrix.lookAt( lightPosition, origin, upVector );
    _lightProjectionMatrix.setOrthographic( -80, 80, 80, -80, -200, 300 );

    Matrix4d.multiply( _lightViewProjectionMatrix, _lightViewMatrix, _lightProjectionMatrix );

    // The lights aren't moving, so write them into buffers now.
    {
      final Float32Array lightMatrixData = new Float32Array( _lightViewProjectionMatrix.toArray() );
      device
        .queue()
        .writeBuffer( _sceneUniformBuffer,
                      0,
                      lightMatrixData.buffer(),
                      lightMatrixData.byteOffset(),
                      lightMatrixData.byteLength() );
      uploadTransformMatrix();

      final Float32Array lightData = new Float32Array( lightPosition.toArray() );
      device
        .queue()
        .writeBuffer( _sceneUniformBuffer,
                      Matrix4d.FLOAT_BYTES + Matrix4d.FLOAT_BYTES,
                      lightData.buffer(),
                      lightData.byteOffset(),
                      lightData.byteLength() );
    }
    {
      final Matrix4d modelMatrix = new Matrix4d();
      modelMatrix.setTranslation( 0, 0, 0 );
      final Float32Array modelData = new Float32Array( modelMatrix.toArray() );
      device
        .queue()
        .writeBuffer( modelUniformBuffer,
                      0,
                      modelData.buffer(),
                      modelData.byteOffset(),
                      modelData.byteLength() );
    }

    final GPUTextureView textureView = _gl.getCurrentTexture().createView();

    final GPURenderPassColorAttachment attachment =
      GPURenderPassColorAttachment
        .view( textureView )
        .loadValue( GPUColorDict.r( 0 ).g( 0 ).b( 0 ).a( 1 ) )
        .storeOp( GPUStoreOp.store );

    _renderPassDescriptor =
      GPURenderPassDescriptor
        .colorAttachments( attachment )
        .depthStencilAttachment( GPURenderPassDepthStencilAttachment
                                   .view( depthTexture.createView() )
                                   .depthLoadValue( 1 )
                                   .depthStoreOp( GPUStoreOp.store )
                                   .stencilLoadValue( 0 )
                                   .stencilStoreOp( GPUStoreOp.store ) );

    _shadowRenderPassDescriptor =
      GPURenderPassDescriptor
        .colorAttachments( new GPURenderPassColorAttachment[ 0 ] )
        .depthStencilAttachment( GPURenderPassDepthStencilAttachment
                                   .view( shadowDepthTextureView )
                                   .depthLoadValue( 1 )
                                   .depthStoreOp( GPUStoreOp.store )
                                   .stencilLoadValue( 0 )
                                   .stencilStoreOp( GPUStoreOp.store ) );

    scheduleRender();
  }

  private void scheduleRender()
  {
    WindowGlobal.requestAnimationFrame( t -> renderFrame() );
  }

  @Nonnull
  private Float32Array getTransformationMatrix()
  {
    final Vector3d eyePosition = new Vector3d( 0, 20, -20 );
    final Vector3d upVector = new Vector3d( 0, 1, 0 );
    final Vector3d origin = new Vector3d( 0, 0, 0 );

    final Matrix4d m = new Matrix4d();

    final double rad = Math.PI * ( System.currentTimeMillis() / 5000.0 );
    m.rotateY( rad );
    eyePosition.mul( m );

    final Matrix4d viewMatrix = new Matrix4d();
    viewMatrix.lookAt( eyePosition, origin, upVector );

    final Matrix4d modelViewProjectionMatrix = new Matrix4d();
    Matrix4d.multiply( modelViewProjectionMatrix, viewMatrix, _projectionMatrix );

    return new Float32Array( modelViewProjectionMatrix.toArray() );
  }

  private void renderFrame()
  {
    scheduleRender();

    uploadTransformMatrix();

    _renderPassDescriptor.colorAttachments().getAt( 0 ).setView( _gl.getCurrentTexture().createView() );

    final GPUCommandEncoder commandEncoder = _device.createCommandEncoder();

    {
      final GPURenderPassEncoder shadowPassEncoder = commandEncoder.beginRenderPass( _shadowRenderPassDescriptor );

      shadowPassEncoder.setPipeline( _shadowPipeline );
      shadowPassEncoder.setBindGroup( 0, _sceneBindGroupForShadow );
      shadowPassEncoder.setBindGroup( 1, _modelBindGroup );
      shadowPassEncoder.setVertexBuffer( 0, _verticesBuffer );
      shadowPassEncoder.setIndexBuffer( _indexBuffer, _asset.indexFormat() );
      shadowPassEncoder.drawIndexed( _asset.getIndices().length );
      shadowPassEncoder.endPass();
    }

    {
      final GPURenderPassEncoder passEncoder = commandEncoder.beginRenderPass( _renderPassDescriptor );

      passEncoder.setPipeline( _pipeline );
      passEncoder.setBindGroup( 0, _sceneBindGroupForRender );
      passEncoder.setBindGroup( 1, _modelBindGroup );
      passEncoder.setVertexBuffer( 0, _verticesBuffer );
      passEncoder.setIndexBuffer( _indexBuffer, _asset.indexFormat() );
      passEncoder.drawIndexed( _asset.indexCount() );
      passEncoder.endPass();
    }

    _device.queue().submit( commandEncoder.finish() );
  }

  private void uploadTransformMatrix()
  {
    final Float32Array transformationMatrix = getTransformationMatrix();
    _device.queue().writeBuffer( _sceneUniformBuffer,
                                 Matrix4d.FLOAT_BYTES,
                                 transformationMatrix.buffer(),
                                 transformationMatrix.byteOffset(),
                                 transformationMatrix.byteLength() );
  }
}
