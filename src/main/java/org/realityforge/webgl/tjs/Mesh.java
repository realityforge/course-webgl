package org.realityforge.webgl.tjs;

import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLTexture;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;
import org.joml.Vector3d;
import org.joml.Vector3f;
import org.realityforge.webgl.annotations.GLSL;
import org.realityforge.webgl.util.BufferAttributeBinding;
import org.realityforge.webgl.util.Float32Buffer;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.UniformBinding;

final class Mesh
  extends Object3D
{
  @Nonnull
  private final UniformBinding _textureData0;
  @Nonnull
  private final UniformBinding _textureData1;
  @Nonnull
  private final UniformBinding _lightColor;
  @Nonnull
  private final UniformBinding _lightPosition;
  @Nonnull
  private final UniformBinding _cameraPosition;
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
    _textureData0 = new UniformBinding( gl, program, "textureData0" );
    _textureData1 = new UniformBinding( gl, program, "textureData1" );
    _lightColor = new UniformBinding( gl, program, "lightColor" );
    _lightPosition = new UniformBinding( gl, program, "lightPosition" );
    _cameraPosition = new UniformBinding( gl, program, "cameraPosition" );
    loadTexture( gl, "img/wood.jpg", 0 );
    loadTexture( gl, "img/StoreLogo.png", 1 );

    setGeometry( new Geometry( gl,
                               new BufferAttributeBinding( gl, program, "position", positionAttribute ),
                               new BufferAttributeBinding( gl, program, "normal", normalsAttribute ),
                               new BufferAttributeBinding( gl, program, "color", colorAttribute ),
                               new BufferAttributeBinding( gl,
                                                           program,
                                                           "textureCoordinate",
                                                           textureCoordinatesAttribute ) ) );
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
    if ( !_uploaded )
    {
      final WebGLProgram program = getProgram();
      gl.useProgram( program );
      GL.bindTexture( gl, _textureData0, _textures[ 0 ], 0 );
      GL.bindTexture( gl, _textureData1, _textures[ 1 ], 1 );
      _uploaded = true;
    }

    final Vector3f color = light.getColor();
    gl.uniform3f( _lightColor.getLocation(), color.x, color.y, color.z );
    final Vector3f lightPosition = light.getPosition();
    gl.uniform3f( _lightPosition.getLocation(), lightPosition.x, lightPosition.y, lightPosition.z );

    final Vector3d cameraPosition = camera.getPosition();
    gl.uniform3f( _cameraPosition.getLocation(),
                  (float) cameraPosition.x,
                  (float) cameraPosition.y,
                  (float) cameraPosition.z );

    super.render( gl, modelMatrix, viewMatrix, projectionMatrix );
  }
}
