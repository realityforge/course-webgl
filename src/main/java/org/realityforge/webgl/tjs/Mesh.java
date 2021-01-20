package org.realityforge.webgl.tjs;

import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLTexture;
import javax.annotation.Nonnull;
import org.realityforge.vecmath.Matrix4d;
import org.realityforge.vecmath.Vector3d;
import org.realityforge.vecmath.Vector3f;
import org.realityforge.webgl.util.AppState;
import org.realityforge.webgl.util.Attribute;
import org.realityforge.webgl.util.Camera;
import org.realityforge.webgl.util.Float32Buffer;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.Geometry;
import org.realityforge.webgl.util.Uniform;

final class Mesh
  extends Object3D
{
  @Nonnull
  private final Uniform _textureData0;
  @Nonnull
  private final Uniform _textureData1;
  @Nonnull
  private final Uniform _lightColor;
  @Nonnull
  private final Uniform _lightPosition;
  @Nonnull
  private final Uniform _cameraPosition;
  private int _texturesLoaded;
  @Nonnull
  private final WebGLTexture[] _textures = new WebGLTexture[ 2 ];
  private boolean _uploaded;

  Mesh( @Nonnull final WebGL2RenderingContext gl,
        @Nonnull final Float32Buffer positionAttribute,
        @Nonnull final Float32Buffer normalsAttribute,
        @Nonnull final Float32Buffer colorAttribute,
        @Nonnull final Float32Buffer textureCoordinatesAttribute,
        @GLSL @Nonnull final String vertexShaderSource,
        @GLSL @Nonnull final String fragmentShaderSource )
  {
    super( gl, vertexShaderSource, fragmentShaderSource );

    final WebGLProgram program = getProgram();
    _textureData0 = new Uniform( gl, program, "textureData0" );
    _textureData1 = new Uniform( gl, program, "textureData1" );
    _lightColor = new Uniform( gl, program, "lightColor" );
    _lightPosition = new Uniform( gl, program, "lightPosition" );
    _cameraPosition = new Uniform( gl, program, "cameraPosition" );
    loadTexture( gl, "img/wood.jpg", 0 );
    loadTexture( gl, "img/StoreLogo.png", 1 );

    //TODO: 36 can be derived...
    final Geometry geometry =
      new Geometry( 36,
                    new Attribute( positionAttribute ),
                    new Attribute( normalsAttribute ),
                    new Attribute( colorAttribute ),
                    new Attribute( textureCoordinatesAttribute ) );
    setGeometry( geometry );
    geometry.getAttribute( 0 ).setLocation( GL.getAttribLocation( gl, program, "position" ) );
    geometry.getAttribute( 1 ).setLocation( GL.getAttribLocation( gl, program, "normal" ) );
    geometry.getAttribute( 2 ).setLocation( GL.getAttribLocation( gl, program, "color" ) );
    geometry.getAttribute( 3 ).setLocation( GL.getAttribLocation( gl, program, "textureCoordinate" ) );
    geometry.uploadToGpu();

  }

  private void loadTexture( @Nonnull final WebGL2RenderingContext gl,
                            @Nonnull final String src,
                            final int textureUnitIndex )
  {
    GL.loadTexture( gl, src ).thenAccept( texture -> {
      _textures[ textureUnitIndex ] = texture;
      _texturesLoaded++;
    } );
  }

  boolean areTexturesLoaded()
  {
    return 2 == _texturesLoaded;
  }

  void render( @Nonnull final WebGL2RenderingContext gl,
               @Nonnull final Matrix4d modelMatrix,
               @Nonnull final Matrix4d viewMatrix,
               @Nonnull final Matrix4d projectionMatrix,
               @Nonnull final Light light,
               @Nonnull final Camera camera )
  {
    AppState.get().useProgram( getProgram() );
    if ( !_uploaded )
    {
      GL.bindTexture( gl, _textureData0, _textures[ 0 ], 0 );
      GL.bindTexture( gl, _textureData1, _textures[ 1 ], 1 );
      _uploaded = true;
    }

    final Vector3f color = light.getColor();
    gl.uniform3f( _lightColor.getLocation(), color.x, color.y, color.z );
    final Vector3f lightPosition = light.getPosition();
    gl.uniform3f( _lightPosition.getLocation(), lightPosition.x, lightPosition.y, lightPosition.z );

    final Vector3d eye = camera.getPosition();
    gl.uniform3f( _cameraPosition.getLocation(), (float) eye.x, (float) eye.y, (float) eye.z );

    super.render( gl, modelMatrix, viewMatrix, projectionMatrix );
  }
}
