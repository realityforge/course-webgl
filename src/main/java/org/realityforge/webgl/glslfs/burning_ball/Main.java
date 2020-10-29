package org.realityforge.webgl.glslfs.burning_ball;

import com.google.gwt.core.client.EntryPoint;
import elemental3.Global;
import elemental3.HTMLCanvasElement;
import elemental3.gl.GLSL;
import elemental3.gl.WebGL2RenderingContext;
import elemental3.gl.WebGLTexture;
import javax.annotation.Nonnull;
import org.joml.Matrix4d;
import org.realityforge.vecmath.Vector3f;
import org.realityforge.webgl.util.AppState;
import org.realityforge.webgl.util.CanvasUtil;
import org.realityforge.webgl.util.GL;
import org.realityforge.webgl.util.MathUtil;
import org.realityforge.webgl.util.Scene;
import org.realityforge.webgl.util.geometries.PolyhedronGeometryFactory;

public final class Main
  implements EntryPoint
{
  @GLSL
  @Nonnull
  private static final String VERTEX_SHADER_SOURCE =

    "#version 300 es\n" +
    "//\n" +
    "// GLSL textureless classic 3D noise \"cnoise\",\n" +
    "// with an RSL-style periodic variant \"pnoise\".\n" +
    "// Author:  Stefan Gustavson (stefan.gustavson@liu.se)\n" +
    "// Version: 2011-10-11\n" +
    "//\n" +
    "// Many thanks to Ian McEwan of Ashima Arts for the\n" +
    "// ideas for permutation and gradient selection.\n" +
    "//\n" +
    "// Copyright (c) 2011 Stefan Gustavson. All rights reserved.\n" +
    "// Distributed under the MIT license. See LICENSE file.\n" +
    "// https://github.com/ashima/webgl-noise\n" +
    "//\n" +
    "\n" +
    "vec3 mod289(vec3 x)\n" +
    "{\n" +
    "  return x - floor(x * (1.0 / 289.0)) * 289.0;\n" +
    "}\n" +
    "\n" +
    "vec4 mod289(vec4 x)\n" +
    "{\n" +
    "  return x - floor(x * (1.0 / 289.0)) * 289.0;\n" +
    "}\n" +
    "\n" +
    "vec4 permute(vec4 x)\n" +
    "{\n" +
    "  return mod289(((x*34.0)+1.0)*x);\n" +
    "}\n" +
    "\n" +
    "vec4 taylorInvSqrt(vec4 r)\n" +
    "{\n" +
    "  return 1.79284291400159 - 0.85373472095314 * r;\n" +
    "}\n" +
    "\n" +
    "vec3 fade(vec3 t) {\n" +
    "  return t*t*t*(t*(t*6.0-15.0)+10.0);\n" +
    "}\n" +
    "\n" +
    "// Classic Perlin noise\n" +
    "float cnoise(vec3 P)\n" +
    "{\n" +
    "  vec3 Pi0 = floor(P); // Integer part for indexing\n" +
    "  vec3 Pi1 = Pi0 + vec3(1.0); // Integer part + 1\n" +
    "  Pi0 = mod289(Pi0);\n" +
    "  Pi1 = mod289(Pi1);\n" +
    "  vec3 Pf0 = fract(P); // Fractional part for interpolation\n" +
    "  vec3 Pf1 = Pf0 - vec3(1.0); // Fractional part - 1.0\n" +
    "  vec4 ix = vec4(Pi0.x, Pi1.x, Pi0.x, Pi1.x);\n" +
    "  vec4 iy = vec4(Pi0.yy, Pi1.yy);\n" +
    "  vec4 iz0 = Pi0.zzzz;\n" +
    "  vec4 iz1 = Pi1.zzzz;\n" +
    "\n" +
    "  vec4 ixy = permute(permute(ix) + iy);\n" +
    "  vec4 ixy0 = permute(ixy + iz0);\n" +
    "  vec4 ixy1 = permute(ixy + iz1);\n" +
    "\n" +
    "  vec4 gx0 = ixy0 * (1.0 / 7.0);\n" +
    "  vec4 gy0 = fract(floor(gx0) * (1.0 / 7.0)) - 0.5;\n" +
    "  gx0 = fract(gx0);\n" +
    "  vec4 gz0 = vec4(0.5) - abs(gx0) - abs(gy0);\n" +
    "  vec4 sz0 = step(gz0, vec4(0.0));\n" +
    "  gx0 -= sz0 * (step(0.0, gx0) - 0.5);\n" +
    "  gy0 -= sz0 * (step(0.0, gy0) - 0.5);\n" +
    "\n" +
    "  vec4 gx1 = ixy1 * (1.0 / 7.0);\n" +
    "  vec4 gy1 = fract(floor(gx1) * (1.0 / 7.0)) - 0.5;\n" +
    "  gx1 = fract(gx1);\n" +
    "  vec4 gz1 = vec4(0.5) - abs(gx1) - abs(gy1);\n" +
    "  vec4 sz1 = step(gz1, vec4(0.0));\n" +
    "  gx1 -= sz1 * (step(0.0, gx1) - 0.5);\n" +
    "  gy1 -= sz1 * (step(0.0, gy1) - 0.5);\n" +
    "\n" +
    "  vec3 g000 = vec3(gx0.x,gy0.x,gz0.x);\n" +
    "  vec3 g100 = vec3(gx0.y,gy0.y,gz0.y);\n" +
    "  vec3 g010 = vec3(gx0.z,gy0.z,gz0.z);\n" +
    "  vec3 g110 = vec3(gx0.w,gy0.w,gz0.w);\n" +
    "  vec3 g001 = vec3(gx1.x,gy1.x,gz1.x);\n" +
    "  vec3 g101 = vec3(gx1.y,gy1.y,gz1.y);\n" +
    "  vec3 g011 = vec3(gx1.z,gy1.z,gz1.z);\n" +
    "  vec3 g111 = vec3(gx1.w,gy1.w,gz1.w);\n" +
    "\n" +
    "  vec4 norm0 = taylorInvSqrt(vec4(dot(g000, g000), dot(g010, g010), dot(g100, g100), dot(g110, g110)));\n" +
    "  g000 *= norm0.x;\n" +
    "  g010 *= norm0.y;\n" +
    "  g100 *= norm0.z;\n" +
    "  g110 *= norm0.w;\n" +
    "  vec4 norm1 = taylorInvSqrt(vec4(dot(g001, g001), dot(g011, g011), dot(g101, g101), dot(g111, g111)));\n" +
    "  g001 *= norm1.x;\n" +
    "  g011 *= norm1.y;\n" +
    "  g101 *= norm1.z;\n" +
    "  g111 *= norm1.w;\n" +
    "\n" +
    "  float n000 = dot(g000, Pf0);\n" +
    "  float n100 = dot(g100, vec3(Pf1.x, Pf0.yz));\n" +
    "  float n010 = dot(g010, vec3(Pf0.x, Pf1.y, Pf0.z));\n" +
    "  float n110 = dot(g110, vec3(Pf1.xy, Pf0.z));\n" +
    "  float n001 = dot(g001, vec3(Pf0.xy, Pf1.z));\n" +
    "  float n101 = dot(g101, vec3(Pf1.x, Pf0.y, Pf1.z));\n" +
    "  float n011 = dot(g011, vec3(Pf0.x, Pf1.yz));\n" +
    "  float n111 = dot(g111, Pf1);\n" +
    "\n" +
    "  vec3 fade_xyz = fade(Pf0);\n" +
    "  vec4 n_z = mix(vec4(n000, n100, n010, n110), vec4(n001, n101, n011, n111), fade_xyz.z);\n" +
    "  vec2 n_yz = mix(n_z.xy, n_z.zw, fade_xyz.y);\n" +
    "  float n_xyz = mix(n_yz.x, n_yz.y, fade_xyz.x);\n" +
    "  return 2.2 * n_xyz;\n" +
    "}\n" +
    "\n" +
    "// Classic Perlin noise, periodic variant\n" +
    "float pnoise(vec3 P, vec3 rep)\n" +
    "{\n" +
    "  vec3 Pi0 = mod(floor(P), rep); // Integer part, modulo period\n" +
    "  vec3 Pi1 = mod(Pi0 + vec3(1.0), rep); // Integer part + 1, mod period\n" +
    "  Pi0 = mod289(Pi0);\n" +
    "  Pi1 = mod289(Pi1);\n" +
    "  vec3 Pf0 = fract(P); // Fractional part for interpolation\n" +
    "  vec3 Pf1 = Pf0 - vec3(1.0); // Fractional part - 1.0\n" +
    "  vec4 ix = vec4(Pi0.x, Pi1.x, Pi0.x, Pi1.x);\n" +
    "  vec4 iy = vec4(Pi0.yy, Pi1.yy);\n" +
    "  vec4 iz0 = Pi0.zzzz;\n" +
    "  vec4 iz1 = Pi1.zzzz;\n" +
    "\n" +
    "  vec4 ixy = permute(permute(ix) + iy);\n" +
    "  vec4 ixy0 = permute(ixy + iz0);\n" +
    "  vec4 ixy1 = permute(ixy + iz1);\n" +
    "\n" +
    "  vec4 gx0 = ixy0 * (1.0 / 7.0);\n" +
    "  vec4 gy0 = fract(floor(gx0) * (1.0 / 7.0)) - 0.5;\n" +
    "  gx0 = fract(gx0);\n" +
    "  vec4 gz0 = vec4(0.5) - abs(gx0) - abs(gy0);\n" +
    "  vec4 sz0 = step(gz0, vec4(0.0));\n" +
    "  gx0 -= sz0 * (step(0.0, gx0) - 0.5);\n" +
    "  gy0 -= sz0 * (step(0.0, gy0) - 0.5);\n" +
    "\n" +
    "  vec4 gx1 = ixy1 * (1.0 / 7.0);\n" +
    "  vec4 gy1 = fract(floor(gx1) * (1.0 / 7.0)) - 0.5;\n" +
    "  gx1 = fract(gx1);\n" +
    "  vec4 gz1 = vec4(0.5) - abs(gx1) - abs(gy1);\n" +
    "  vec4 sz1 = step(gz1, vec4(0.0));\n" +
    "  gx1 -= sz1 * (step(0.0, gx1) - 0.5);\n" +
    "  gy1 -= sz1 * (step(0.0, gy1) - 0.5);\n" +
    "\n" +
    "  vec3 g000 = vec3(gx0.x,gy0.x,gz0.x);\n" +
    "  vec3 g100 = vec3(gx0.y,gy0.y,gz0.y);\n" +
    "  vec3 g010 = vec3(gx0.z,gy0.z,gz0.z);\n" +
    "  vec3 g110 = vec3(gx0.w,gy0.w,gz0.w);\n" +
    "  vec3 g001 = vec3(gx1.x,gy1.x,gz1.x);\n" +
    "  vec3 g101 = vec3(gx1.y,gy1.y,gz1.y);\n" +
    "  vec3 g011 = vec3(gx1.z,gy1.z,gz1.z);\n" +
    "  vec3 g111 = vec3(gx1.w,gy1.w,gz1.w);\n" +
    "\n" +
    "  vec4 norm0 = taylorInvSqrt(vec4(dot(g000, g000), dot(g010, g010), dot(g100, g100), dot(g110, g110)));\n" +
    "  g000 *= norm0.x;\n" +
    "  g010 *= norm0.y;\n" +
    "  g100 *= norm0.z;\n" +
    "  g110 *= norm0.w;\n" +
    "  vec4 norm1 = taylorInvSqrt(vec4(dot(g001, g001), dot(g011, g011), dot(g101, g101), dot(g111, g111)));\n" +
    "  g001 *= norm1.x;\n" +
    "  g011 *= norm1.y;\n" +
    "  g101 *= norm1.z;\n" +
    "  g111 *= norm1.w;\n" +
    "\n" +
    "  float n000 = dot(g000, Pf0);\n" +
    "  float n100 = dot(g100, vec3(Pf1.x, Pf0.yz));\n" +
    "  float n010 = dot(g010, vec3(Pf0.x, Pf1.y, Pf0.z));\n" +
    "  float n110 = dot(g110, vec3(Pf1.xy, Pf0.z));\n" +
    "  float n001 = dot(g001, vec3(Pf0.xy, Pf1.z));\n" +
    "  float n101 = dot(g101, vec3(Pf1.x, Pf0.y, Pf1.z));\n" +
    "  float n011 = dot(g011, vec3(Pf0.x, Pf1.yz));\n" +
    "  float n111 = dot(g111, Pf1);\n" +
    "\n" +
    "  vec3 fade_xyz = fade(Pf0);\n" +
    "  vec4 n_z = mix(vec4(n000, n100, n010, n110), vec4(n001, n101, n011, n111), fade_xyz.z);\n" +
    "  vec2 n_yz = mix(n_z.xy, n_z.zw, fade_xyz.y);\n" +
    "  float n_xyz = mix(n_yz.x, n_yz.y, fade_xyz.x);\n" +
    "  return 2.2 * n_xyz;\n" +
    "}\n" +
    "\n" +
    "in vec3 position;\n" +
    "in vec3 normal;\n" +
    "out float v_noise;\n" +

    "uniform mat4 modelMatrix;\n" +
    "uniform mat4 viewMatrix;\n" +
    "uniform mat4 projectionMatrix;\n" +
    "uniform float u_time;\n" +
    "\n" +
    "float turbulence( vec3 p ) {\n" +
    "  float w = 100.0;\n" +
    "  float t = -.5;\n" +
    "  for (float f = 1.0 ; f <= 10.0 ; f++ ){\n" +
    "    float power = pow( 2.0, f );\n" +
    "    t += abs( pnoise( vec3( power * p ), vec3( 10.0, 10.0, 10.0 ) ) / power );\n" +
    "  }\n" +
    "  return t;\n" +
    "}\n" +
    "\n" +
    "void main()\n" +
    "{\n" +
    // get a turbulent 3d noise using the normal, normal to high freq
    // and add time to the noise parameters so it's animated
    "  v_noise = 10.0 * -0.1 * turbulence(0.5 * normal + u_time);\n" +

    // get a 3d noise using the position, low frequency
    // and add time to the noise parameters so it's animated
    "  float b = 5.0 * pnoise(0.05 * position + vec3( 2.0 * u_time ), vec3(100.0));\n" +
    // compose both noises
    //b = 5.0 * cnoise(position.xy);//spiky
    //b = 5.0 * cnoise(vUv);//smooth
    //b = 5.0 * cnoise(position);//super-spiky
    //b = turbulence(position);//smooth
    //b = srnoise(vUv, 0.0);
    "  float displacement = b - 10.0 * v_noise;\n" +

    // move the position along the normal and transform it
    "  vec3 newPosition = position + (normal *  displacement);\n" +

    "  gl_Position = projectionMatrix * viewMatrix * modelMatrix * vec4(newPosition, 1);\n" +
    "}\n";
  @GLSL
  private static final String FRAGMENT_SHADER_SOURCE =
    "#version 300 es\n" +
    "precision mediump float;\n" +
    "in float v_noise;\n" +
    "uniform sampler2D u_tex;\n" +
    "out vec4 color;\n" +

    // <https://www.shadertoy.com/view/4dS3Wd>
    // By Morgan McGuire @morgan3d, http://graphicscodex.com

    //https://www.clicktorelease.com/blog/vertex-displacement-noise-3d-webgl-glsl-three-js/
    "float random( vec3 scale, float seed ){\n" +
    "  return fract( sin( dot( gl_FragCoord.xyz + seed, scale ) ) * 43758.5453 + seed ) ;\n" +
    "}\n" +
    "void main()\n" +
    "{\n" +
    // get a random offset
    "  float r = .01 * random( vec3( 12.9898, 78.233, 151.7182 ), 0.0 );\n" +
    // lookup vertically in the texture, using noise and offset
    // to get the right RGB colour
    "  vec2 uv = vec2( 0, 1.0 - (1.3 * v_noise + r) );\n" +
    "  color = vec4( texture( u_tex, uv ).rgb, 1.0 );\n" +
    "}\n";
  @Nonnull
  private final Matrix4d _modelMatrix = new Matrix4d();
  @Nonnull
  private final Matrix4d _viewMatrix = new Matrix4d();
  @Nonnull
  private final Matrix4d _projectionMatrix = new Matrix4d();
  @Nonnull
  private final Scene _scene = new Scene();
  private Mesh _mesh;
  private final long startedAt = System.currentTimeMillis();
  private WebGLTexture _texture;

  @Override
  public void onModuleLoad()
  {
    final HTMLCanvasElement canvas = CanvasUtil.createCanvas();
    final AppState appState = AppState.create( CanvasUtil.getWebGL2RenderingContext( canvas ) );

    _projectionMatrix.perspective( MathUtil.degreesToRadians( 45 ), CanvasUtil.getAspect( canvas ), 1, 10000 );

    appState.in( () -> {
      // This dynamic composition of shaders should be done at compile time
      final WebGL2RenderingContext gl = appState.gl();
      final Mesh mesh = new Mesh( PolyhedronGeometryFactory.createIsocahedron( WebGL2RenderingContext.TRIANGLES,
                                                                               20,
                                                                               20,
                                                                               PolyhedronGeometryFactory.NORMALS ),
                                  new Material( gl, VERTEX_SHADER_SOURCE, FRAGMENT_SHADER_SOURCE ) );
      mesh.sendToGpu( gl );
      _mesh = mesh;
    } );
    appState.in( () -> {
      final WebGL2RenderingContext gl = appState.gl();
      GL.loadTexture( gl, "img/explosion.png" ).thenAccept( texture -> _texture = texture );
    } );

    Global.globalThis().requestAnimationFrame( t -> renderFrame( canvas, appState ) );
  }

  private void renderFrame( @Nonnull final HTMLCanvasElement canvas, @Nonnull final AppState appState )
  {
    Global.globalThis().requestAnimationFrame( t -> renderFrame( canvas, appState ) );
    if ( null == _mesh || null == _texture )
    {
      return;
    }
    appState.in( () -> {
      final WebGL2RenderingContext gl = appState.gl();

      CanvasUtil.resize( gl, canvas );

      final Vector3f backgroundColor = _scene.getBackgroundColor();
      gl.clearColor( backgroundColor.x, backgroundColor.y, backgroundColor.z, 1 );
      gl.clear( WebGL2RenderingContext.COLOR_BUFFER_BIT | WebGL2RenderingContext.DEPTH_BUFFER_BIT );
      gl.enable( WebGL2RenderingContext.DEPTH_TEST );

      _modelMatrix.translation( 0, 0, -100 );
      _modelMatrix.rotateY( 0 );
      _modelMatrix.rotateX( 0.25 );

      _viewMatrix.identity();

      final float time = ( System.currentTimeMillis() - startedAt ) * 0.00025F;
      _mesh.render( _modelMatrix, _viewMatrix, _projectionMatrix, _texture, time );
    } );
  }
}
