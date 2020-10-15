package org.realityforge.webgl.tjs;

import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;
import org.realityforge.vecmath.Vector3f;
import org.realityforge.webgl.util.BufferAttribute;
import org.realityforge.webgl.util.Float32Buffer;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.Uniform;

final class LightMesh
  extends Object3D
{
  @Nonnull
  private final Uniform _color;

  LightMesh( @Nonnull final WebGL2RenderingContext gl,
             @Nonnull final Float32Buffer positionAttribute,
             @GLSL @Nonnull final String vertexShaderSource,
             @GLSL @Nonnull final String fragmentShaderSource )
  {
    super( gl, vertexShaderSource, fragmentShaderSource );
    final WebGLProgram program = getProgram();
    _color = new Uniform( gl, program, "color" );
    final Geometry geometry = new Geometry( new BufferAttribute( positionAttribute ) );
    setGeometry( geometry );
    geometry.getBindings()[ 0 ].setLocation( GL.getAttribLocation( gl, program, "position" ) );
    geometry.uploadToCpu( gl );
  }

  void render( @Nonnull final WebGL2RenderingContext gl,
               @Nonnull final Matrix4d modelMatrix,
               @Nonnull final Matrix4d viewMatrix,
               @Nonnull final Matrix4d projectionMatrix,
               @Nonnull final Light light )
  {
    final Vector3f color = light.getColor();
    gl.uniform3f( _color.getLocation(), color.x, color.y, color.z );

    super.render( gl, modelMatrix, viewMatrix, projectionMatrix );
  }
}
