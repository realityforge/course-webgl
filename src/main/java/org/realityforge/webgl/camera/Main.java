package org.realityforge.webgl.camera;

import akasha.Document;
import akasha.Global;
import akasha.HTMLCanvasElement;
import akasha.core.Float32Array;
import akasha.gl.GLSL;
import akasha.gl.WebGL2RenderingContext;
import akasha.gl.WebGLProgram;
import com.google.gwt.core.client.EntryPoint;
import javax.annotation.Nonnull;
import org.realityforge.vecmath.Matrix4d;
import org.realityforge.webgl.util.Camera;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.Geometry2;
import org.realityforge.webgl.util.MathUtil;
import org.realityforge.webgl.util.controls.FirsPersonControl;
import org.realityforge.webgl.util.geometries.CubeGeometryFactory;

public final class Main
  implements EntryPoint
{
  @GLSL
  @Nonnull
  private static final String VERTEX_SHADER_SOURCE =
    // The shader language is OpenGL 3 (i.e. 300) ES and this version pragma must
    // be the first thing present in the shader source
    "#version 300 es\n" +
    // The incoming vertex position
    "in vec3 position;\n" +
    // The incoming vertex color
    "in vec4 color;\n" +
    // The incoming texture coordinate
    "in vec2 textureCoordinate;\n" +
    // The output vertex color that will be fed to the next shader
    "out vec4 fcolor;\n" +
    // The outgoing texture coordinate
    "out vec2 fTextureCoordinate;\n" +
    "\n" +
    // The following are the unions (aka constant across multiple vertices)
    "uniform mat4 modelMatrix;\n" +
    "uniform mat4 viewMatrix;\n" +
    "uniform mat4 projectionMatrix;\n" +
    // The main program/kernel
    "void main()\n" +
    "{\n" +
    // Copy position from input to output, converting to vec4 by adding using 1 for 4th dimension
    // and transforming via model/view/project matrices
    "  gl_Position = projectionMatrix * viewMatrix * modelMatrix * vec4(position, 1);" +
    // Copy color from input to output
    "  fcolor = color;" +
    // Copy textureCoordinate from input to output
    "  fTextureCoordinate = textureCoordinate;" +
    "}\n";
  // The fragment shader that will be run for every pixel
  @GLSL
  private static final String FRAGMENT_SHADER_SOURCE =
    // The version of language in use
    "#version 300 es\n" +
    // There is no default precision for floats in fragment shaders so specify it
    "precision mediump float;\n" +
    // The incoming fragment color
    "in vec4 fcolor;\n" +
    // The incoming fragment texture coordinate
    "in vec2 fTextureCoordinate;\n" +
    // The uniform for texture data
    "uniform sampler2D textureData0;\n" +
    // The uniform for other texture data
    "uniform sampler2D textureData1;\n" +
    // The output fragment color
    "out vec4 finalColor;\n" +
    "" +
    // The main program/kernel
    "void main()\n" +
    "{\n" +
    // Copy color from input to output
    "  finalColor = mix( texture( textureData0, fTextureCoordinate ), texture( textureData1, fTextureCoordinate ), 0.5) * fcolor;" +
    "}\n";
  @Nonnull
  private final Matrix4d _modelMatrix = new Matrix4d();
  @Nonnull
  private final Camera _camera = new Camera();
  private Material _material;
  private Geometry2 _geometry;
  private double _angle;
  private boolean _sentToGpu;
  private FirsPersonControl _control;

  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = CanvasUtil.createCanvas();
    final WebGL2RenderingContext gl = CanvasUtil.getWebGL2RenderingContext( canvas );

    _camera.getProjection()
      .getProjectionMatrix().setPerspective( MathUtil.degreesToRadians( 45 ),
                                             CanvasUtil.getAspect( canvas ),
                                             0.1,
                                             10.0 );

    _material = new Material( gl, VERTEX_SHADER_SOURCE, FRAGMENT_SHADER_SOURCE );
    final WebGLProgram program = _material.getProgram();
    _geometry = CubeGeometryFactory.create( gl, 0.5 );
    //TODO: Fix these so we don't have to magically know indexes
    _geometry.getAttribute( 0 ).setLocation( GL.getAttribLocation( gl, program, "position" ) );
    _geometry.getAttribute( 1 ).setLocation( GL.getAttribLocation( gl, program, "color" ) );
    _geometry.getAttribute( 2 ).setLocation( GL.getAttribLocation( gl, program, "textureCoordinate" ) );

    final Document document = Global.document();
    _control = new FirsPersonControl( _camera, document );

    CanvasUtil.renderLoop( canvas, gl, this::renderFrame );
  }

  private void renderFrame( @Nonnull final WebGL2RenderingContext gl )
  {
    if ( !_material.getTextureData0().isReady() || !_material.getTextureData1().isReady() )
    {
      return;
    }
    else if ( !_sentToGpu )
    {
      // Have to send to GPU here as otherwise texture data has not loaded
      _geometry.allocate();

      gl.useProgram( _material.getProgram() );

      _material.getTextureData0().sendToGpu( gl );
      _material.getTextureData1().sendToGpu( gl );
      _sentToGpu = true;
    }

    gl.clearColor( 0, 0, 0, 1 );
    gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT | WebGL2RenderingContext.DEPTH_BUFFER_BIT );
    gl.enable( WebGL2RenderingContext.DEPTH_TEST );

    // ModelMatrix should be calculated in the simulation loop rather than render loop
    // but they are effectively the same in out app so we can just recalculate in render loop
    _modelMatrix.setTranslation( 0, 0, -7 );
    _modelMatrix.rotateY( _angle );
    _modelMatrix.rotateX( 0.25 );

    // UpdateCamera should be done in the sim loop ... but we are inlining in render loop
    _control.updateCamera();

    gl.useProgram( _material.getProgram() );
    gl.uniformMatrix4fv( _material.getModelMatrix().getLocation(), false, new Float32Array( _modelMatrix.toArray() ) );
    gl.uniformMatrix4fv( _material.getViewMatrix().getLocation(),
                         false,
                         new Float32Array( _camera.getViewMatrix().toArray() ) );
    gl.uniformMatrix4fv( _material.getProjectionMatrix().getLocation(),
                         false,
                         new Float32Array( _camera.getProjection().getProjectionMatrix().toArray() ) );

    _geometry.draw();

    _angle += 0.01;
  }
}
