package org.realityforge.webgl.glslfs.box_sphere;

import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLVertexArrayObject;
import java.util.Objects;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;
import org.realityforge.webgl.util.BufferAttributeBinding;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.MathUtil;

final class Mesh
{
  @Nonnull
  private final Geometry _geometry;
  @Nonnull
  private final Material _material;

  Mesh( @Nonnull final Geometry geometry, @Nonnull final Material material )
  {
    _geometry = Objects.requireNonNull( geometry );
    _material = Objects.requireNonNull( material );
  }

  @Nonnull
  Material getMaterial()
  {
    return _material;
  }

  void setUniforms( @Nonnull final WebGL2RenderingContext gl,
                    @Nonnull final Matrix4d modelMatrix,
                    @Nonnull final Matrix4d viewMatrix,
                    @Nonnull final Matrix4d projectionMatrix )
  {
    gl.uniformMatrix4fv( _material.getModelMatrixLocation(), false, MathUtil.toFloat32Array( modelMatrix ) );
    gl.uniformMatrix4fv( _material.getViewMatrixLocation(), false, MathUtil.toFloat32Array( viewMatrix ) );
    gl.uniformMatrix4fv( _material.getProjectionMatrixLocation(), false, MathUtil.toFloat32Array( projectionMatrix ) );
  }

  void sendToGpu( @Nonnull final WebGL2RenderingContext gl )
  {
    final BufferAttributeBinding positionAttribute = _geometry.getPositionAttribute();
    final BufferAttributeBinding colorAttribute = _geometry.getColorAttribute();

    final WebGLProgram program = _material.getProgram();
    positionAttribute.setLocation( GL.getAttribLocation( gl, program, "position" ) );
    colorAttribute.setLocation( GL.getAttribLocation( gl, program, "color" ) );

    positionAttribute.getBuffer().uploadToGpu( gl );
    colorAttribute.getBuffer().uploadToGpu( gl );

    positionAttribute.sendToGpu( gl );
    colorAttribute.sendToGpu( gl );
  }
}
