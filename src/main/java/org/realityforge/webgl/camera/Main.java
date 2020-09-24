package org.realityforge.webgl.camera;

import com.google.gwt.core.client.EntryPoint;
import elemental3.Document;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.KeyboardEvent;
import elemental3.gl.WebGL2RenderingContext;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;
import org.joml.Vector3d;
import org.realityforge.webgl.util.CanvasUtil;

public final class Main
  implements EntryPoint
{
  @Nonnull
  private final Matrix4d _modelMatrix = new Matrix4d();
  @Nonnull
  private final Matrix4d _viewMatrix = new Matrix4d();
  @Nonnull
  private final Matrix4d _projectionMatrix = new Matrix4d();
  @Nonnull
  private final Camera _camera = new Camera();
  private Mesh _mesh;
  private double _angle;
  private boolean _sentToGpu;
  private boolean _forwardPressed;
  private boolean _backwardPressed;
  private boolean _leftPressed;
  private boolean _rightPressed;

  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = CanvasUtil.createCanvas();
    final WebGL2RenderingContext gl = CanvasUtil.getWebGL2RenderingContext( canvas );

    _projectionMatrix.perspective( 45 * Math.PI / 180.0, canvas.width / ( (double) canvas.height ), 0.1, 10.0 );

    _mesh = CubeTemplate.create( gl );

    final Global global = Global.globalThis();
    final Document document = global.document();
    document.addKeydownListener( this::onKeyDown );
    document.addKeyupListener( this::onKeyUp );

    global.requestAnimationFrame( t -> renderFrame( canvas, gl ) );
  }

  private void onKeyDown( @Nonnull final KeyboardEvent event )
  {
    final String key = event.key();
    //noinspection IfCanBeSwitch
    if ( "w".equals( key ) )
    {
      _forwardPressed = true;
    }
    else if ( "s".equals( key ) )
    {
      _backwardPressed = true;
    }
    else if ( "a".equals( key ) )
    {
      _leftPressed = true;
    }
    else if ( "d".equals( key ) )
    {
      _rightPressed = true;
    }
  }

  private void onKeyUp( @Nonnull final KeyboardEvent event )
  {
    final String key = event.key();
    //noinspection IfCanBeSwitch
    if ( "w".equals( key ) )
    {
      _forwardPressed = false;
    }
    else if ( "s".equals( key ) )
    {
      _backwardPressed = false;
    }
    else if ( "a".equals( key ) )
    {
      _leftPressed = false;
    }
    else if ( "d".equals( key ) )
    {
      _rightPressed = false;
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
    else if ( !_sentToGpu )
    {
      // Have to send to GPU here as otherwise texture data has not loaded
      _mesh.sendToGpu( gl );
      _sentToGpu = true;
    }

    gl.clearColor( 0, 0, 0, 1 );
    gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT | WebGL2RenderingContext.DEPTH_BUFFER_BIT );
    gl.enable( WebGL2RenderingContext.DEPTH_TEST );

    // ModelMatrix should be calculated in the simulation loop rather than render loop
    // but they are effectively the same in out app so we can just recalculate in render loop
    _modelMatrix.identity();
    _modelMatrix.translate( 0, 0, -7 );
    _modelMatrix.rotateY( _angle );
    _modelMatrix.rotateX( 0.25 );

    // UpdateCamera should be done in the sim loop ... but we are inlining in render loop
    updateCamera();

    _viewMatrix.identity();
    _viewMatrix.lookAt( _camera.getPosition(), _camera.getTarget(), _camera.getUp() );

    _mesh.render( gl, _modelMatrix, _viewMatrix, _projectionMatrix );

    _angle += 0.01;
  }

  private void updateCamera()
  {
    final Vector3d position = _camera.getPosition();
    if ( _forwardPressed )
    {
      position.z -= .1;
    }
    if ( _backwardPressed )
    {
      position.z += .1;
    }
    if ( _leftPressed )
    {
      position.x -= .1;
    }
    if ( _rightPressed )
    {
      position.x += .1;
    }
  }
}
