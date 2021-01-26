package org.realityforge.webgl.camera;

import com.google.gwt.core.client.EntryPoint;
import elemental3.Document;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.KeyboardEvent;
import elemental3.core.Float32Array;
import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import javax.annotation.Nonnull;
import org.realityforge.vecmath.Matrix4d;
import org.realityforge.vecmath.Vector3d;
import org.realityforge.webgl.util.Camera;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.Geometry2;
import org.realityforge.webgl.util.MathUtil;
import org.realityforge.webgl.util.geometries.CubeGeometryFactory;

public final class Main
  implements EntryPoint
{
  public static final int KEY_UP = 38;
  public static final int KEY_DOWN = 40;
  public static final int KEY_LEFT = 37;
  public static final int KEY_RIGHT = 39;
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
  private boolean _forwardPressed;
  private boolean _backwardPressed;
  private boolean _leftPressed;
  private boolean _rightPressed;
  private boolean _pitchUpPressed;
  private boolean _pitchDownPressed;
  private boolean _yawLeftPressed;
  private boolean _yawRightPressed;

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
    document.addKeydownListener( this::onKeyDown );
    document.addKeyupListener( this::onKeyUp );

    Global.requestAnimationFrame( t -> renderFrame( canvas, gl ) );
  }

  private void onKeyDown( @Nonnull final KeyboardEvent event )
  {
    final String key = event.key();
    final int keyCode = event.keyCode();
    if ( "w".equals( key ) || KEY_UP == keyCode )
    {
      _forwardPressed = true;
    }
    else if ( "s".equals( key ) || KEY_DOWN == keyCode )
    {
      _backwardPressed = true;
    }
    else if ( "a".equals( key ) || KEY_LEFT == keyCode )
    {
      _leftPressed = true;
    }
    else if ( "d".equals( key ) || KEY_RIGHT == keyCode )
    {
      _rightPressed = true;
    }
    else if ( "y".equals( key ) )
    {
      _pitchUpPressed = true;
    }
    else if ( "h".equals( key ) )
    {
      _pitchDownPressed = true;
    }
    else if ( "g".equals( key ) )
    {
      _yawLeftPressed = true;
    }
    else if ( "j".equals( key ) )
    {
      _yawRightPressed = true;
    }
  }

  private void onKeyUp( @Nonnull final KeyboardEvent event )
  {
    final String key = event.key();
    final int keyCode = event.keyCode();
    if ( "w".equals( key ) || KEY_UP == keyCode )
    {
      _forwardPressed = false;
    }
    else if ( "s".equals( key ) || KEY_DOWN == keyCode )
    {
      _backwardPressed = false;
    }
    else if ( "a".equals( key ) || KEY_LEFT == keyCode )
    {
      _leftPressed = false;
    }
    else if ( "d".equals( key ) || KEY_RIGHT == keyCode )
    {
      _rightPressed = false;
    }
    else if ( "y".equals( key ) )
    {
      _pitchUpPressed = false;
    }
    else if ( "h".equals( key ) )
    {
      _pitchDownPressed = false;
    }
    else if ( "g".equals( key ) )
    {
      _yawLeftPressed = false;
    }
    else if ( "j".equals( key ) )
    {
      _yawRightPressed = false;
    }
  }

  private void renderFrame( @Nonnull final HTMLCanvasElement canvas, @Nonnull final WebGL2RenderingContext gl )
  {
    Global.requestAnimationFrame( t -> renderFrame( canvas, gl ) );
    CanvasUtil.resize( gl, canvas );
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
    updateCamera();

    _camera.updateViewMatrix();

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

  private void updateCamera()
  {
    _camera.computeDirection();
    final Vector3d direction = _camera.getDirection();
    final Vector3d position = _camera.getPosition();
    if ( _forwardPressed )
    {
      position.add( direction.dup().mul( 0.1F ) );
    }
    if ( _backwardPressed )
    {
      position.add( direction.dup().mul( -0.1F ) );
    }
    if ( _leftPressed )
    {
      // Calculate the "right" vector (We assume our view has no roll and thus can just use yaw) and
      // after right vector is calculated then use direction to calculate movement
      position.add( new Vector3d( -1 * (float) Math.sin( _camera.getYaw() ),
                                  0,
                                  (float) Math.cos( _camera.getYaw() ) ).mul( -0.1F ) );
    }
    if ( _rightPressed )
    {
      position.add( new Vector3d( -1 * (float) Math.sin( _camera.getYaw() ),
                                  0,
                                  (float) Math.cos( _camera.getYaw() ) ).mul( 0.1F ) );
    }
    if ( _pitchUpPressed )
    {
      _camera.setPitch( _camera.getPitch() + 0.02 );
    }
    if ( _pitchDownPressed )
    {
      _camera.setPitch( _camera.getPitch() - 0.02 );
    }
    if ( _yawLeftPressed )
    {
      _camera.setYaw( _camera.getYaw() - 0.02 );
    }
    if ( _yawRightPressed )
    {
      _camera.setYaw( _camera.getYaw() + 0.02 );
    }
  }
}
