package org.realityforge.webgl.light;

import elemental3.core.Float32Array;
import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLProgram;
import elemental3.gl.WebGLShader;
import java.util.Objects;
import javax.annotation.Nonnull;
import org.realityforge.vecmath.Matrix4d;
import org.realityforge.vecmath.Vector3f;
import org.realityforge.webgl.util.Attribute;
import org.realityforge.webgl.util.Buffer;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.Uniform;

final class LightMesh
{
  @Nonnull
  private final Attribute _position;
  @Nonnull
  private final WebGLProgram _program;
  @Nonnull
  private final Uniform _modelMatrix;
  @Nonnull
  private final Uniform _viewMatrix;
  @Nonnull
  private final Uniform _projectionMatrix;
  @Nonnull
  private final Uniform _color;
  @Nonnull
  private final Buffer _positionAttribute;

  LightMesh( @Nonnull final WebGL2RenderingContext gl,
             @Nonnull final Buffer positionAttribute,
             @GLSL @Nonnull final String vertexShaderSource,
             @GLSL @Nonnull final String fragmentShaderSource )
  {
    final WebGLShader vertexShader = GL.createShader( gl, WebGL2RenderingContext.VERTEX_SHADER, vertexShaderSource );
    final WebGLShader fragmentShader =
      GL.createShader( gl, WebGL2RenderingContext.FRAGMENT_SHADER, fragmentShaderSource );
    assert null != vertexShader;
    assert null != fragmentShader;
    final WebGLProgram program = GL.createProgram( gl, vertexShader, fragmentShader );
    assert null != program;
    _program = program;
    _modelMatrix = new Uniform( gl, program, "modelMatrix" );
    _viewMatrix = new Uniform( gl, program, "viewMatrix" );
    _projectionMatrix = new Uniform( gl, program, "projectionMatrix" );
    _color = new Uniform( gl, program, "color" );

    _positionAttribute = Objects.requireNonNull( positionAttribute );
    _position = new Attribute( positionAttribute, GL.getAttribLocation( gl, program, "position" ) );
  }

  @Nonnull
  WebGLProgram getProgram()
  {
    return _program;
  }

  void render( @Nonnull final WebGL2RenderingContext gl,
               @Nonnull final Matrix4d modelMatrix,
               @Nonnull final Matrix4d viewMatrix,
               @Nonnull final Matrix4d projectionMatrix,
               @Nonnull final Light light )
  {
    gl.uniformMatrix4fv( _modelMatrix.getLocation(), false, new Float32Array( modelMatrix.toArray() ) );
    gl.uniformMatrix4fv( _viewMatrix.getLocation(), false, new Float32Array( viewMatrix.toArray() ) );
    gl.uniformMatrix4fv( _projectionMatrix.getLocation(), false, new Float32Array( projectionMatrix.toArray() ) );
    final Vector3f color = light.getColor();
    gl.uniform3f( _color.getLocation(), color.x, color.y, color.z );

    gl.drawArrays( WebGL2RenderingContext.TRIANGLES, 0, 36 );
  }

  void sendToGpu( @Nonnull final WebGL2RenderingContext gl )
  {
    _positionAttribute.uploadToGpu();
    _position.sendToGpu( gl );
  }
}
