package org.realityforge.webgl.tjs;

import elemental3.Float32Array;
import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import javax.annotation.Nonnull;
import org.realityforge.webgl.util.Float32Buffer;

final class CubeTemplate
{
  // Vertices position data
  private static final double[] POSITIONS = new double[]
    {
      -0.5, -0.5, -0.5,
      0.5, -0.5, -0.5,
      0.5, 0.5, -0.5,
      0.5, 0.5, -0.5,
      -0.5, 0.5, -0.5,
      -0.5, -0.5, -0.5,

      -0.5, -0.5, 0.5,
      0.5, -0.5, 0.5,
      0.5, 0.5, 0.5,
      0.5, 0.5, 0.5,
      -0.5, 0.5, 0.5,
      -0.5, -0.5, 0.5,

      -0.5, 0.5, 0.5,
      -0.5, 0.5, -0.5,
      -0.5, -0.5, -0.5,
      -0.5, -0.5, -0.5,
      -0.5, -0.5, 0.5,
      -0.5, 0.5, 0.5,

      0.5, 0.5, 0.5,
      0.5, 0.5, -0.5,
      0.5, -0.5, -0.5,
      0.5, -0.5, -0.5,
      0.5, -0.5, 0.5,
      0.5, 0.5, 0.5,

      -0.5, -0.5, -0.5,
      0.5, -0.5, -0.5,
      0.5, -0.5, 0.5,
      0.5, -0.5, 0.5,
      -0.5, -0.5, 0.5,
      -0.5, -0.5, -0.5,

      -0.5, 0.5, -0.5,
      0.5, 0.5, -0.5,
      0.5, 0.5, 0.5,
      0.5, 0.5, 0.5,
      -0.5, 0.5, 0.5,
      -0.5, 0.5, -0.5
    };
  // Vertices color data in RGBA form
  private static final double[] COLORS = new double[]
    {
      1.0, 0.0, 0.0, 1.0, // Front face
      1.0, 0.0, 0.0, 1.0, // Front face
      1.0, 0.0, 0.0, 1.0, // Front face
      1.0, 0.0, 0.0, 1.0, // Front face
      1.0, 0.0, 0.0, 1.0, // Front face
      1.0, 0.0, 0.0, 1.0, // Front face

      0.0, 1.0, 0.0, 1.0, // Back face
      0.0, 1.0, 0.0, 1.0, // Back face
      0.0, 1.0, 0.0, 1.0, // Back face
      0.0, 1.0, 0.0, 1.0, // Back face
      0.0, 1.0, 0.0, 1.0, // Back face
      0.0, 1.0, 0.0, 1.0, // Back face

      0.0, 0.0, 1.0, 1.0, // Top face
      0.0, 0.0, 1.0, 1.0, // Top face
      0.0, 0.0, 1.0, 1.0, // Top face
      0.0, 0.0, 1.0, 1.0, // Top face
      0.0, 0.0, 1.0, 1.0, // Top face
      0.0, 0.0, 1.0, 1.0, // Top face

      1.0, 1.0, 0.0, 1.0, // Bottom face
      1.0, 1.0, 0.0, 1.0, // Bottom face
      1.0, 1.0, 0.0, 1.0, // Bottom face
      1.0, 1.0, 0.0, 1.0, // Bottom face
      1.0, 1.0, 0.0, 1.0, // Bottom face
      1.0, 1.0, 0.0, 1.0, // Bottom face

      1.0, 0.0, 1.0, 1.0, // Right face
      1.0, 0.0, 1.0, 1.0, // Right face
      1.0, 0.0, 1.0, 1.0, // Right face
      1.0, 0.0, 1.0, 1.0, // Right face
      1.0, 0.0, 1.0, 1.0, // Right face
      1.0, 0.0, 1.0, 1.0, // Right face

      0.0, 1.0, 1.0, 1.0, // Left face
      0.0, 1.0, 1.0, 1.0, // Left face
      0.0, 1.0, 1.0, 1.0, // Left face
      0.0, 1.0, 1.0, 1.0, // Left face
      0.0, 1.0, 1.0, 1.0, // Left face
      0.0, 1.0, 1.0, 1.0 // Left face
    };
  private static final double[] VERTEX_NORMALS = new double[]
    {
      0.0, 0.0, -1.0,
      0.0, 0.0, -1.0,
      0.0, 0.0, -1.0,
      0.0, 0.0, -1.0,
      0.0, 0.0, -1.0,
      0.0, 0.0, -1.0,

      0.0, 0.0, 1.0,
      0.0, 0.0, 1.0,
      0.0, 0.0, 1.0,
      0.0, 0.0, 1.0,
      0.0, 0.0, 1.0,
      0.0, 0.0, 1.0,

      -1.0, 0.0, 0.0,
      -1.0, 0.0, 0.0,
      -1.0, 0.0, 0.0,
      -1.0, 0.0, 0.0,
      -1.0, 0.0, 0.0,
      -1.0, 0.0, 0.0,

      1.0, 0.0, 0.0,
      1.0, 0.0, 0.0,
      1.0, 0.0, 0.0,
      1.0, 0.0, 0.0,
      1.0, 0.0, 0.0,
      1.0, 0.0, 0.0,

      0.0, -1.0, 0.0,
      0.0, -1.0, 0.0,
      0.0, -1.0, 0.0,
      0.0, -1.0, 0.0,
      0.0, -1.0, 0.0,
      0.0, -1.0, 0.0,

      0.0, 1.0, 0.0,
      0.0, 1.0, 0.0,
      0.0, 1.0, 0.0,
      0.0, 1.0, 0.0,
      0.0, 1.0, 0.0,
      0.0, 1.0, 0.0
    };
  private static final double[] TEXTURE_COORDINATES = new double[]
    {
      0.0, 1.0,
      1.0, 1.0,
      1.0, 0.0,
      1.0, 0.0,
      0.0, 0.0,
      0.0, 1.0,

      0.0, 1.0,
      1.0, 1.0,
      1.0, 0.0,
      1.0, 0.0,
      0.0, 0.0,
      0.0, 1.0,

      1.0, 1.0,
      1.0, 0.0,
      0.0, 0.0,
      0.0, 0.0,
      0.0, 1.0,
      1.0, 1.0,

      1.0, 1.0,
      1.0, 0.0,
      0.0, 0.0,
      0.0, 0.0,
      0.0, 1.0,
      1.0, 1.0,

      0.0, 0.0,
      1.0, 0.0,
      1.0, 1.0,
      1.0, 1.0,
      0.0, 1.0,
      0.0, 0.0,

      0.0, 0.0,
      1.0, 0.0,
      1.0, 1.0,
      1.0, 1.0,
      0.0, 1.0,
      0.0, 0.0
    };
  // The vertex shader that will be run for every vertex
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

  private CubeTemplate()
  {
  }

  @Nonnull
  public static LightMesh createLightCube( @Nonnull final WebGL2RenderingContext gl )
  {
    return new LightMesh( gl,
                          new Float32Buffer( new Float32Array( POSITIONS ), 3 ),
                          LIGHT_VERTEX_SHADER_SOURCE,
                          LIGHT_FRAGMENT_SHADER_SOURCE );
  }

  @Nonnull
  public static Mesh create( @Nonnull final WebGL2RenderingContext gl )
  {
    return new Mesh( gl,
                     new Float32Buffer( new Float32Array( POSITIONS ), 3 ),
                     new Float32Buffer( new Float32Array( VERTEX_NORMALS ), 3 ),
                     new Float32Buffer( new Float32Array( COLORS ), 4 ),
                     new Float32Buffer( new Float32Array( TEXTURE_COORDINATES ), 2 ),
                     VERTEX_SHADER_SOURCE,
                     FRAGMENT_SHADER_SOURCE );
  }
}
