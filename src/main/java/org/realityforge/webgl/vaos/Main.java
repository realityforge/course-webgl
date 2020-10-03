package org.realityforge.webgl.vaos;

import com.google.gwt.core.client.EntryPoint;
import elemental3.Document;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.KeyboardEvent;
import elemental3.gl.WebGL2RenderingContext;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;
import org.realityforge.vecmath.Vector3f;
import org.realityforge.webgl.util.Camera;
import org.realityforge.webgl.util.CanvasUtil;

public final class Main
  implements EntryPoint
{
  public static final int KEY_UP = 38;
  public static final int KEY_DOWN = 40;
  public static final int KEY_LEFT = 37;
  public static final int KEY_RIGHT = 39;
  @Nonnull
  private final Matrix4d _modelMatrix = new Matrix4d();
  @Nonnull
  private final Matrix4d _projectionMatrix = new Matrix4d();
  @Nonnull
  private final Camera _camera = new Camera();
  @Nonnull
  private final Light _light = new Light();
  private Mesh _mesh;
  private LightMesh _lightMesh;
  private double _angle;
  private boolean _forwardPressed;
  private boolean _backwardPressed;
  private boolean _leftPressed;
  private boolean _rightPressed;
  private boolean _pitchUpPressed;
  private boolean _pitchDownPressed;
  private boolean _yawLeftPressed;
  private boolean _yawRightPressed;
  private float _time;

  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = CanvasUtil.createCanvas();
    final WebGL2RenderingContext gl = CanvasUtil.getWebGL2RenderingContext( canvas );

    _projectionMatrix.perspective( 45 * Math.PI / 180.0, canvas.width / ( (double) canvas.height ), 0.1, 10.0 );

    _mesh = CubeTemplate.create( gl );
    _lightMesh = CubeTemplate.createLightCube( gl );

    final Global global = Global.globalThis();
    final Document document = global.document();
    document.addKeydownListener( this::onKeyDown );
    document.addKeyupListener( this::onKeyUp );

    global.requestAnimationFrame( t -> renderFrame( canvas, gl ) );
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
    CanvasUtil.resize( gl, canvas );
    Global.globalThis().requestAnimationFrame( t -> renderFrame( canvas, gl ) );
    if ( !_mesh.areTexturesLoaded() )
    {
      return;
    }

    gl.clearColor( 0, 0, 0, 1 );
    gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT | WebGL2RenderingContext.DEPTH_BUFFER_BIT );
    gl.enable( WebGL2RenderingContext.DEPTH_TEST );

    // UpdateCamera should be done in the sim loop ... but we are inlining in render loop
    updateCamera();

    final Vector3f position = _light.getPosition();
    position.y = (float) ( 2 * Math.sin( 0.1 * ( _time + position.y ) ) );
    position.x = (float) ( -2 * Math.sin( 0.1 * ( _time + position.x ) ) );
    _camera.updateViewMatrix();
    final Matrix4d viewMatrix = _camera.getViewMatrix();

    gl.useProgram( _mesh.getProgram() );
    gl.bindVertexArray( _mesh.getGeometry().getVao() );

    // ModelMatrix should be calculated in the simulation loop rather than render loop
    // but they are effectively the same in out app so we can just recalculate in render loop
    _modelMatrix.identity();
    _modelMatrix.translate( 0, 0, -7 );
    _modelMatrix.rotateY( _angle );
    _modelMatrix.rotateX( 0.25 );

    _mesh.render( gl, _modelMatrix, viewMatrix, _projectionMatrix, _light, _camera );

    _modelMatrix.identity();
    _modelMatrix.translate( 3, 0, -7 );
    _modelMatrix.rotateY( _angle );
    _modelMatrix.rotateX( 0.25 );

    _mesh.render( gl, _modelMatrix, viewMatrix, _projectionMatrix, _light, _camera );

    _modelMatrix.identity();
    _modelMatrix.translate( -3, 0, -7 );
    _modelMatrix.rotateY( _angle );
    _modelMatrix.rotateX( 0.25 );

    _mesh.render( gl, _modelMatrix, viewMatrix, _projectionMatrix, _light, _camera );

    gl.useProgram( _lightMesh.getProgram() );
    gl.bindVertexArray( _lightMesh.getGeometry().getVao() );

    _modelMatrix.identity();
    _modelMatrix.translate( position.x, position.y, position.z );
    _modelMatrix.scale( 0.2 );

    _lightMesh.render( gl, _modelMatrix, viewMatrix, _projectionMatrix, _light );

    _angle += 0.01;
    _time += 0.1;
  }

  private void updateCamera()
  {
    _camera.computeDirection();
    final Vector3f direction = _camera.getDirection();
    final Vector3f position = _camera.getPosition();
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
      position.add( new Vector3f( -1 * (float) Math.sin( _camera.getYaw() ),
                                  0,
                                  (float) Math.cos( _camera.getYaw() ) ).mul( -0.1F ) );
    }
    if ( _rightPressed )
    {
      position.add( new Vector3f( -1 * (float) Math.sin( _camera.getYaw() ),
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
