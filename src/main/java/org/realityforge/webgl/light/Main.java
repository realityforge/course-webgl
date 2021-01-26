package org.realityforge.webgl.light;

import com.google.gwt.core.client.EntryPoint;
import elemental3.Document;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.KeyboardEvent;
import elemental3.core.Float32Array;
import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import javax.annotation.Nonnull;
import org.realityforge.vecmath.Matrix4d;
import org.realityforge.vecmath.Vector3d;
import org.realityforge.vecmath.Vector3f;
import org.realityforge.webgl.util.Camera;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.GL;
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
    // The incoming normal of vertex
    "in vec3 normal;\n" +
    // The output vertex color that will be fed to the next shader
    "out vec4 fcolor;\n" +
    // The outgoing texture coordinate
    "out vec2 fTextureCoordinate;\n" +
    "out vec4 vertexWorldPosition;\n" +
    "out vec3 vertexNormal;\n" +
    "\n" +
    // The following are the unions (aka constant across multiple vertices)
    "uniform mat4 modelMatrix;\n" +
    "uniform mat4 viewMatrix;\n" +
    "uniform mat4 projectionMatrix;\n" +
    // The main program/kernel
    "void main()\n" +
    "{\n" +
    "  vertexWorldPosition = modelMatrix * vec4(position, 1);\n" +
    // Copy position from input to output, converting to vec4 by adding using 1 for 4th dimension
    // and transforming via model/view/project matrices
    "  gl_Position = projectionMatrix * viewMatrix * vertexWorldPosition;" +
    // Copy color from input to output
    "  fcolor = color;" +
    // Copy textureCoordinate from input to output
    "  fTextureCoordinate = textureCoordinate;" +
    // inverse(transpose(MM)) is required when we have a non-uniform scale.
    // In a uniform scale, the transpose of the identity is identity and the
    // inverse of an identity is identity and thus we could just use normal here
    // In a performant application, the calculation of normal matrix should be
    // done on the CPU so it is done once per-modelMatrix rather than once per
    // vertex
    "  vertexNormal = mat3(inverse(transpose(modelMatrix)))*normal;" +
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
    // The incoming interpolated vertex normal
    "in vec3 vertexNormal;\n" +
    // The position
    "in vec4 vertexWorldPosition;\n" +
    // The uniform for texture data
    "uniform sampler2D textureData0;\n" +
    // The uniform for other texture data
    "uniform sampler2D textureData1;\n" +
    // Ambient light color
    "uniform vec3 lightColor;\n" +
    // Position of the light giving the directional light
    "uniform vec3 lightPosition;\n" +
    // Position of the eye/camera
    "uniform vec3 cameraPosition;\n" +
    // The output fragment color
    "out vec4 finalColor;\n" +
    "" +
    // The main program/kernel
    "void main()\n" +
    "{\n" +
    // Calculate the ambient component of the light
    "  float ambientIntensity = 0.2;\n" +
    "  vec4 ambientComponent = vec4((ambientIntensity * lightColor), 1.0);\n" +
    // Due to interpolation this normal is no longer normalized
    "  vec3 normalizedNormal = normalize(vertexNormal);\n" +
    // Calculate the light direction in in world-space coordinates
    "  vec3 lightDirection = normalize(lightPosition - vec3(vertexWorldPosition));\n" +
    // Calculate the view direction in in world-space coordinates
    "  vec3 viewDirection = normalize(cameraPosition - vec3(vertexWorldPosition));\n" +

    // Calculate diffuse contribution based on normal on surface and position of light
    "  float diffuseFactor = 0.9;\n" +
    // max(x, 0) avoids the scenario where a fragment is lit from behind
    "  float diffuseIntensity = max(dot(normalizedNormal, lightDirection), 0.0);\n" +
    "  vec4 diffuseComponent = diffuseFactor * vec4(diffuseIntensity * lightColor, 1.0);\n" +

    // Calculate specular contribution based on position of light and position of eye.
    "  vec3 reflectedLightDirection = reflect(-lightDirection, normalizedNormal);\n" +
    // The specular intensity is based on the angle the eye and the reflected light beam
    "  float baseSpecularIntensity = max(dot(reflectedLightDirection, viewDirection), 0.0);\n" +
    // However the drop off is fast so we simulate this via pow function
    // as dot product is cosine which is less than 1 and pow will thus  increase drop off
    "  float specularIntensity = pow(baseSpecularIntensity, 128.0);\n" +
    "  vec4 specularComponent = vec4(specularIntensity * lightColor,1);\n" +

    "  finalColor = (ambientComponent + diffuseComponent + specularComponent) * mix( texture( textureData0, fTextureCoordinate ), texture( textureData1, fTextureCoordinate ), 0.5) * fcolor;" +
    "}\n";
  // The vertex shader for the "light" cube
  @GLSL
  @Nonnull
  private static final String LIGHT_VERTEX_SHADER_SOURCE =
    "#version 300 es\n" +
    "in vec3 position;\n" +
    "uniform mat4 modelMatrix;\n" +
    "uniform mat4 viewMatrix;\n" +
    "uniform mat4 projectionMatrix;\n" +
    "void main()\n" +
    "{\n" +
    "  gl_Position = projectionMatrix * viewMatrix * modelMatrix * vec4(position, 1);" +
    "}\n";
  // The fragment shader that will be run for every pixel
  @GLSL
  @Nonnull
  private static final String LIGHT_FRAGMENT_SHADER_SOURCE =
    "#version 300 es\n" +
    "precision lowp float;\n" +
    "uniform vec3 color;\n" +
    "out vec4 finalColor;\n" +
    "void main()\n" +
    "{\n" +
    "  finalColor = vec4(color,1);" +
    "}\n";
  @Nonnull
  private final Matrix4d _modelMatrix = new Matrix4d();
  @Nonnull
  private final Camera _camera = new Camera();
  @Nonnull
  private final Light _light = new Light();
  private Mesh _mesh;
  private LightMesh _lightMesh;
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
  private float _time;

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

    _mesh = new Mesh( gl,
                      CubeGeometryFactory.create( gl,
                                                  0.5,
                                                  CubeGeometryFactory.NORMALS |
                                                  CubeGeometryFactory.UVS |
                                                  CubeGeometryFactory.COLORS ),
                      VERTEX_SHADER_SOURCE,
                      FRAGMENT_SHADER_SOURCE );
    _lightMesh = new LightMesh( gl,
                                CubeGeometryFactory.create( gl, 0.2, 0 ),
                                LIGHT_VERTEX_SHADER_SOURCE,
                                LIGHT_FRAGMENT_SHADER_SOURCE );

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
    if ( null == _mesh.getTexture1() || null == _mesh.getTexture2() )
    {
      return;
    }
    else if ( !_sentToGpu )
    {
      // Have to send to GPU here as otherwise texture data has not loaded
      _mesh.getGeometry().allocate();
      _lightMesh.getGeometry().allocate();

      gl.useProgram( _mesh.getProgram() );
      GL.bindTexture( gl, _mesh.getTextureData0(), _mesh.getTexture1(), 0 );
      GL.bindTexture( gl, _mesh.getTextureData1(), _mesh.getTexture2(), 1 );
      _sentToGpu = true;
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

    // ModelMatrix should be calculated in the simulation loop rather than render loop
    // but they are effectively the same in out app so we can just recalculate in render loop
    _modelMatrix.setTranslation( 0, 0, -7 );
    _modelMatrix.rotateY( _angle );
    _modelMatrix.rotateX( 0.25 );

    final Matrix4d projectionMatrix = _camera.getProjection().getProjectionMatrix();

    _mesh.render( gl, _modelMatrix, viewMatrix, projectionMatrix, _light, _camera );

    _modelMatrix.setTranslation( 3, 0, -7 );
    _modelMatrix.rotateY( _angle );
    _modelMatrix.rotateX( 0.25 );

    _mesh.render( gl, _modelMatrix, viewMatrix, projectionMatrix, _light, _camera );

    _modelMatrix.setTranslation( -3, 0, -7 );
    _modelMatrix.rotateY( _angle );
    _modelMatrix.rotateX( 0.25 );

    _mesh.render( gl, _modelMatrix, viewMatrix, projectionMatrix, _light, _camera );

    _modelMatrix.setTranslation( position.x, position.y, position.z );
    _modelMatrix.scale( 0.2 );

    gl.useProgram( _lightMesh.getProgram() );
    gl.uniformMatrix4fv( _lightMesh.getModelMatrix().getLocation(), false, new Float32Array( _modelMatrix.toArray() ) );
    gl.uniformMatrix4fv( _lightMesh.getViewMatrix().getLocation(), false, new Float32Array( viewMatrix.toArray() ) );
    gl.uniformMatrix4fv( _lightMesh.getProjectionMatrix().getLocation(),
                         false,
                         new Float32Array( projectionMatrix.toArray() ) );
    final Vector3f color = _light.getColor();
    gl.uniform3f( _lightMesh.getColor().getLocation(), color.x, color.y, color.z );

    _lightMesh.getGeometry().draw();

    _angle += 0.01;
    _time += 0.1;
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
