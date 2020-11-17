package org.realityforge.webgl.multi_pass;

import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;
import org.realityforge.vecmath.Vector3f;
import org.realityforge.webgl.util.AppState;
import org.realityforge.webgl.util.Attribute;
import org.realityforge.webgl.util.Float32Buffer;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.Geometry;
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
    final Geometry geometry = new Geometry( 36, new Attribute( positionAttribute ) );
    setGeometry( geometry );
    geometry.getAttribute( 0 ).setLocation( GL.getAttribLocation( gl, program, "position" ) );
    geometry.uploadToCpu();
  }

  void render( @Nonnull final WebGL2RenderingContext gl,
               @Nonnull final Matrix4d modelMatrix,
               @Nonnull final Matrix4d viewMatrix,
               @Nonnull final Matrix4d projectionMatrix,
               @Nonnull final Light light )
  {
    AppState.get().useProgram( getProgram() );
    final Vector3f color = light.getColor();
    gl.uniform3f( _color.getLocation(), color.x, color.y, color.z );

    super.render( gl, modelMatrix, viewMatrix, projectionMatrix );
  }
}