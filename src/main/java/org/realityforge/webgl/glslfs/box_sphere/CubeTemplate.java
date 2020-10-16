package org.realityforge.webgl.glslfs.box_sphere;

import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import javax.annotation.Nonnull;
import org.realityforge.webgl.util.geometries.CuboidGeometryFactory;

final class CubeTemplate
{
  @GLSL
  @Nonnull
  private static final String VERTEX_SHADER_SOURCE =
    "#version 300 es\n" +
    "in vec3 position;\n" +
    "uniform mat4 modelMatrix;\n" +
    "uniform mat4 viewMatrix;\n" +
    "uniform mat4 projectionMatrix;\n" +
    "uniform float u_time;\n" +
    "void main()\n" +
    "{\n" +
    "  float delta = (sin(u_time) + 1.0) / 2.0;\n" +
    "  float radius = 2.0;\n" +
    "  vec3 circlePosition = normalize(position) * radius;\n" +
    "  vec3 finalPosition = mix(position, circlePosition, delta);\n" +
    "  gl_Position = projectionMatrix * viewMatrix * modelMatrix * vec4(finalPosition, 1);\n" +
    "}\n";
  @GLSL
  private static final String FRAGMENT_SHADER_SOURCE =
    "#version 300 es\n" +
    "precision mediump float;\n" +
    "out vec4 color;\n" +
    "void main()\n" +
    "{\n" +
    "  color = vec4(vec3(1.0), 1.0);" +
    "}\n";

  private CubeTemplate()
  {
  }

  @Nonnull
  public static Mesh create( @Nonnull final WebGL2RenderingContext gl )
  {
    return new Mesh( CuboidGeometryFactory.create( WebGL2RenderingContext.LINE_LOOP, 2, 2, 2, 5, 5, 5 ),
                     new Material( gl, VERTEX_SHADER_SOURCE, FRAGMENT_SHADER_SOURCE ) );
  }
}
