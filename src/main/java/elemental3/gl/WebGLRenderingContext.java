package elemental3.gl;

import elemental3.core.ArrayBufferView;
import elemental3.core.BufferSource;
import elemental3.core.Float32Array;
import elemental3.core.Int32Array;
import elemental3.core.JsArray;
import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The WebGLRenderingContext interface provides an interface to the OpenGL ES 2.0 graphics rendering context for the drawing surface of an HTML &lt;canvas&gt; element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext">WebGLRenderingContext - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14">WebGLRenderingContext - WebGL 1.0</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WebGLRenderingContext"
)
public class WebGLRenderingContext {
  @JsOverlay
  public static final int ACTIVE_ATTRIBUTES = 0x8B89;

  @JsOverlay
  public static final int ACTIVE_TEXTURE = 0x84E0;

  @JsOverlay
  public static final int ACTIVE_UNIFORMS = 0x8B86;

  @JsOverlay
  public static final int ALIASED_LINE_WIDTH_RANGE = 0x846E;

  @JsOverlay
  public static final int ALIASED_POINT_SIZE_RANGE = 0x846D;

  @JsOverlay
  public static final int ALPHA = 0x1906;

  @JsOverlay
  public static final int ALPHA_BITS = 0x0D55;

  @JsOverlay
  public static final int ALWAYS = 0x0207;

  @JsOverlay
  public static final int ARRAY_BUFFER = 0x8892;

  @JsOverlay
  public static final int ARRAY_BUFFER_BINDING = 0x8894;

  @JsOverlay
  public static final int ATTACHED_SHADERS = 0x8B85;

  @JsOverlay
  public static final int BACK = 0x0405;

  @JsOverlay
  public static final int BLEND = 0x0BE2;

  @JsOverlay
  public static final int BLEND_COLOR = 0x8005;

  @JsOverlay
  public static final int BLEND_DST_ALPHA = 0x80CA;

  @JsOverlay
  public static final int BLEND_DST_RGB = 0x80C8;

  @JsOverlay
  public static final int BLEND_EQUATION = 0x8009;

  @JsOverlay
  public static final int BLEND_EQUATION_ALPHA = 0x883D;

  @JsOverlay
  public static final int BLEND_EQUATION_RGB = 0x8009;

  @JsOverlay
  public static final int BLEND_SRC_ALPHA = 0x80CB;

  @JsOverlay
  public static final int BLEND_SRC_RGB = 0x80C9;

  @JsOverlay
  public static final int BLUE_BITS = 0x0D54;

  @JsOverlay
  public static final int BOOL = 0x8B56;

  @JsOverlay
  public static final int BOOL_VEC2 = 0x8B57;

  @JsOverlay
  public static final int BOOL_VEC3 = 0x8B58;

  @JsOverlay
  public static final int BOOL_VEC4 = 0x8B59;

  @JsOverlay
  public static final int BROWSER_DEFAULT_WEBGL = 0x9244;

  @JsOverlay
  public static final int BUFFER_SIZE = 0x8764;

  @JsOverlay
  public static final int BUFFER_USAGE = 0x8765;

  @JsOverlay
  public static final int BYTE = 0x1400;

  @JsOverlay
  public static final int CCW = 0x0901;

  @JsOverlay
  public static final int CLAMP_TO_EDGE = 0x812F;

  @JsOverlay
  public static final int COLOR_ATTACHMENT0 = 0x8CE0;

  @JsOverlay
  public static final int COLOR_BUFFER_BIT = 0x00004000;

  @JsOverlay
  public static final int COLOR_CLEAR_VALUE = 0x0C22;

  @JsOverlay
  public static final int COLOR_WRITEMASK = 0x0C23;

  @JsOverlay
  public static final int COMPILE_STATUS = 0x8B81;

  @JsOverlay
  public static final int COMPRESSED_TEXTURE_FORMATS = 0x86A3;

  @JsOverlay
  public static final int CONSTANT_ALPHA = 0x8003;

  @JsOverlay
  public static final int CONSTANT_COLOR = 0x8001;

  @JsOverlay
  public static final int CONTEXT_LOST_WEBGL = 0x9242;

  @JsOverlay
  public static final int CULL_FACE = 0x0B44;

  @JsOverlay
  public static final int CULL_FACE_MODE = 0x0B45;

  @JsOverlay
  public static final int CURRENT_PROGRAM = 0x8B8D;

  @JsOverlay
  public static final int CURRENT_VERTEX_ATTRIB = 0x8626;

  @JsOverlay
  public static final int CW = 0x0900;

  @JsOverlay
  public static final int DECR = 0x1E03;

  @JsOverlay
  public static final int DECR_WRAP = 0x8508;

  @JsOverlay
  public static final int DELETE_STATUS = 0x8B80;

  @JsOverlay
  public static final int DEPTH_ATTACHMENT = 0x8D00;

  @JsOverlay
  public static final int DEPTH_BITS = 0x0D56;

  @JsOverlay
  public static final int DEPTH_BUFFER_BIT = 0x00000100;

  @JsOverlay
  public static final int DEPTH_CLEAR_VALUE = 0x0B73;

  @JsOverlay
  public static final int DEPTH_COMPONENT = 0x1902;

  @JsOverlay
  public static final int DEPTH_COMPONENT16 = 0x81A5;

  @JsOverlay
  public static final int DEPTH_FUNC = 0x0B74;

  @JsOverlay
  public static final int DEPTH_RANGE = 0x0B70;

  @JsOverlay
  public static final int DEPTH_STENCIL = 0x84F9;

  @JsOverlay
  public static final int DEPTH_STENCIL_ATTACHMENT = 0x821A;

  @JsOverlay
  public static final int DEPTH_TEST = 0x0B71;

  @JsOverlay
  public static final int DEPTH_WRITEMASK = 0x0B72;

  @JsOverlay
  public static final int DITHER = 0x0BD0;

  @JsOverlay
  public static final int DONT_CARE = 0x1100;

  @JsOverlay
  public static final int DST_ALPHA = 0x0304;

  @JsOverlay
  public static final int DST_COLOR = 0x0306;

  @JsOverlay
  public static final int DYNAMIC_DRAW = 0x88E8;

  @JsOverlay
  public static final int ELEMENT_ARRAY_BUFFER = 0x8893;

  @JsOverlay
  public static final int ELEMENT_ARRAY_BUFFER_BINDING = 0x8895;

  @JsOverlay
  public static final int EQUAL = 0x0202;

  @JsOverlay
  public static final int FASTEST = 0x1101;

  @JsOverlay
  public static final int FLOAT = 0x1406;

  @JsOverlay
  public static final int FLOAT_MAT2 = 0x8B5A;

  @JsOverlay
  public static final int FLOAT_MAT3 = 0x8B5B;

  @JsOverlay
  public static final int FLOAT_MAT4 = 0x8B5C;

  @JsOverlay
  public static final int FLOAT_VEC2 = 0x8B50;

  @JsOverlay
  public static final int FLOAT_VEC3 = 0x8B51;

  @JsOverlay
  public static final int FLOAT_VEC4 = 0x8B52;

  @JsOverlay
  public static final int FRAGMENT_SHADER = 0x8B30;

  @JsOverlay
  public static final int FRAMEBUFFER = 0x8D40;

  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 0x8CD1;

  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 0x8CD0;

  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3;

  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 0x8CD2;

  @JsOverlay
  public static final int FRAMEBUFFER_BINDING = 0x8CA6;

  @JsOverlay
  public static final int FRAMEBUFFER_COMPLETE = 0x8CD5;

  @JsOverlay
  public static final int FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 0x8CD6;

  @JsOverlay
  public static final int FRAMEBUFFER_INCOMPLETE_DIMENSIONS = 0x8CD9;

  @JsOverlay
  public static final int FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7;

  @JsOverlay
  public static final int FRAMEBUFFER_UNSUPPORTED = 0x8CDD;

  @JsOverlay
  public static final int FRONT = 0x0404;

  @JsOverlay
  public static final int FRONT_AND_BACK = 0x0408;

  @JsOverlay
  public static final int FRONT_FACE = 0x0B46;

  @JsOverlay
  public static final int FUNC_ADD = 0x8006;

  @JsOverlay
  public static final int FUNC_REVERSE_SUBTRACT = 0x800B;

  @JsOverlay
  public static final int FUNC_SUBTRACT = 0x800A;

  @JsOverlay
  public static final int GENERATE_MIPMAP_HINT = 0x8192;

  @JsOverlay
  public static final int GEQUAL = 0x0206;

  @JsOverlay
  public static final int GREATER = 0x0204;

  @JsOverlay
  public static final int GREEN_BITS = 0x0D53;

  @JsOverlay
  public static final int HIGH_FLOAT = 0x8DF2;

  @JsOverlay
  public static final int HIGH_INT = 0x8DF5;

  @JsOverlay
  public static final int IMPLEMENTATION_COLOR_READ_FORMAT = 0x8B9B;

  @JsOverlay
  public static final int IMPLEMENTATION_COLOR_READ_TYPE = 0x8B9A;

  @JsOverlay
  public static final int INCR = 0x1E02;

  @JsOverlay
  public static final int INCR_WRAP = 0x8507;

  @JsOverlay
  public static final int INT = 0x1404;

  @JsOverlay
  public static final int INT_VEC2 = 0x8B53;

  @JsOverlay
  public static final int INT_VEC3 = 0x8B54;

  @JsOverlay
  public static final int INT_VEC4 = 0x8B55;

  @JsOverlay
  public static final int INVALID_ENUM = 0x0500;

  @JsOverlay
  public static final int INVALID_FRAMEBUFFER_OPERATION = 0x0506;

  @JsOverlay
  public static final int INVALID_OPERATION = 0x0502;

  @JsOverlay
  public static final int INVALID_VALUE = 0x0501;

  @JsOverlay
  public static final int INVERT = 0x150A;

  @JsOverlay
  public static final int KEEP = 0x1E00;

  @JsOverlay
  public static final int LEQUAL = 0x0203;

  @JsOverlay
  public static final int LESS = 0x0201;

  @JsOverlay
  public static final int LINEAR = 0x2601;

  @JsOverlay
  public static final int LINEAR_MIPMAP_LINEAR = 0x2703;

  @JsOverlay
  public static final int LINEAR_MIPMAP_NEAREST = 0x2701;

  @JsOverlay
  public static final int LINES = 0x0001;

  @JsOverlay
  public static final int LINE_LOOP = 0x0002;

  @JsOverlay
  public static final int LINE_STRIP = 0x0003;

  @JsOverlay
  public static final int LINE_WIDTH = 0x0B21;

  @JsOverlay
  public static final int LINK_STATUS = 0x8B82;

  @JsOverlay
  public static final int LOW_FLOAT = 0x8DF0;

  @JsOverlay
  public static final int LOW_INT = 0x8DF3;

  @JsOverlay
  public static final int LUMINANCE = 0x1909;

  @JsOverlay
  public static final int LUMINANCE_ALPHA = 0x190A;

  @JsOverlay
  public static final int MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x8B4D;

  @JsOverlay
  public static final int MAX_CUBE_MAP_TEXTURE_SIZE = 0x851C;

  @JsOverlay
  public static final int MAX_FRAGMENT_UNIFORM_VECTORS = 0x8DFD;

  @JsOverlay
  public static final int MAX_RENDERBUFFER_SIZE = 0x84E8;

  @JsOverlay
  public static final int MAX_TEXTURE_IMAGE_UNITS = 0x8872;

  @JsOverlay
  public static final int MAX_TEXTURE_SIZE = 0x0D33;

  @JsOverlay
  public static final int MAX_VARYING_VECTORS = 0x8DFC;

  @JsOverlay
  public static final int MAX_VERTEX_ATTRIBS = 0x8869;

  @JsOverlay
  public static final int MAX_VERTEX_TEXTURE_IMAGE_UNITS = 0x8B4C;

  @JsOverlay
  public static final int MAX_VERTEX_UNIFORM_VECTORS = 0x8DFB;

  @JsOverlay
  public static final int MAX_VIEWPORT_DIMS = 0x0D3A;

  @JsOverlay
  public static final int MEDIUM_FLOAT = 0x8DF1;

  @JsOverlay
  public static final int MEDIUM_INT = 0x8DF4;

  @JsOverlay
  public static final int MIRRORED_REPEAT = 0x8370;

  @JsOverlay
  public static final int NEAREST = 0x2600;

  @JsOverlay
  public static final int NEAREST_MIPMAP_LINEAR = 0x2702;

  @JsOverlay
  public static final int NEAREST_MIPMAP_NEAREST = 0x2700;

  @JsOverlay
  public static final int NEVER = 0x0200;

  @JsOverlay
  public static final int NICEST = 0x1102;

  @JsOverlay
  public static final int NONE = 0;

  @JsOverlay
  public static final int NOTEQUAL = 0x0205;

  @JsOverlay
  public static final int NO_ERROR = 0;

  @JsOverlay
  public static final int ONE = 1;

  @JsOverlay
  public static final int ONE_MINUS_CONSTANT_ALPHA = 0x8004;

  @JsOverlay
  public static final int ONE_MINUS_CONSTANT_COLOR = 0x8002;

  @JsOverlay
  public static final int ONE_MINUS_DST_ALPHA = 0x0305;

  @JsOverlay
  public static final int ONE_MINUS_DST_COLOR = 0x0307;

  @JsOverlay
  public static final int ONE_MINUS_SRC_ALPHA = 0x0303;

  @JsOverlay
  public static final int ONE_MINUS_SRC_COLOR = 0x0301;

  @JsOverlay
  public static final int OUT_OF_MEMORY = 0x0505;

  @JsOverlay
  public static final int PACK_ALIGNMENT = 0x0D05;

  @JsOverlay
  public static final int POINTS = 0x0000;

  @JsOverlay
  public static final int POLYGON_OFFSET_FACTOR = 0x8038;

  @JsOverlay
  public static final int POLYGON_OFFSET_FILL = 0x8037;

  @JsOverlay
  public static final int POLYGON_OFFSET_UNITS = 0x2A00;

  @JsOverlay
  public static final int RED_BITS = 0x0D52;

  @JsOverlay
  public static final int RENDERBUFFER = 0x8D41;

  @JsOverlay
  public static final int RENDERBUFFER_ALPHA_SIZE = 0x8D53;

  @JsOverlay
  public static final int RENDERBUFFER_BINDING = 0x8CA7;

  @JsOverlay
  public static final int RENDERBUFFER_BLUE_SIZE = 0x8D52;

  @JsOverlay
  public static final int RENDERBUFFER_DEPTH_SIZE = 0x8D54;

  @JsOverlay
  public static final int RENDERBUFFER_GREEN_SIZE = 0x8D51;

  @JsOverlay
  public static final int RENDERBUFFER_HEIGHT = 0x8D43;

  @JsOverlay
  public static final int RENDERBUFFER_INTERNAL_FORMAT = 0x8D44;

  @JsOverlay
  public static final int RENDERBUFFER_RED_SIZE = 0x8D50;

  @JsOverlay
  public static final int RENDERBUFFER_STENCIL_SIZE = 0x8D55;

  @JsOverlay
  public static final int RENDERBUFFER_WIDTH = 0x8D42;

  @JsOverlay
  public static final int RENDERER = 0x1F01;

  @JsOverlay
  public static final int REPEAT = 0x2901;

  @JsOverlay
  public static final int REPLACE = 0x1E01;

  @JsOverlay
  public static final int RGB = 0x1907;

  @JsOverlay
  public static final int RGB565 = 0x8D62;

  @JsOverlay
  public static final int RGB5_A1 = 0x8057;

  @JsOverlay
  public static final int RGBA = 0x1908;

  @JsOverlay
  public static final int RGBA4 = 0x8056;

  @JsOverlay
  public static final int SAMPLER_2D = 0x8B5E;

  @JsOverlay
  public static final int SAMPLER_CUBE = 0x8B60;

  @JsOverlay
  public static final int SAMPLES = 0x80A9;

  @JsOverlay
  public static final int SAMPLE_ALPHA_TO_COVERAGE = 0x809E;

  @JsOverlay
  public static final int SAMPLE_BUFFERS = 0x80A8;

  @JsOverlay
  public static final int SAMPLE_COVERAGE = 0x80A0;

  @JsOverlay
  public static final int SAMPLE_COVERAGE_INVERT = 0x80AB;

  @JsOverlay
  public static final int SAMPLE_COVERAGE_VALUE = 0x80AA;

  @JsOverlay
  public static final int SCISSOR_BOX = 0x0C10;

  @JsOverlay
  public static final int SCISSOR_TEST = 0x0C11;

  @JsOverlay
  public static final int SHADER_TYPE = 0x8B4F;

  @JsOverlay
  public static final int SHADING_LANGUAGE_VERSION = 0x8B8C;

  @JsOverlay
  public static final int SHORT = 0x1402;

  @JsOverlay
  public static final int SRC_ALPHA = 0x0302;

  @JsOverlay
  public static final int SRC_ALPHA_SATURATE = 0x0308;

  @JsOverlay
  public static final int SRC_COLOR = 0x0300;

  @JsOverlay
  public static final int STATIC_DRAW = 0x88E4;

  @JsOverlay
  public static final int STENCIL_ATTACHMENT = 0x8D20;

  @JsOverlay
  public static final int STENCIL_BACK_FAIL = 0x8801;

  @JsOverlay
  public static final int STENCIL_BACK_FUNC = 0x8800;

  @JsOverlay
  public static final int STENCIL_BACK_PASS_DEPTH_FAIL = 0x8802;

  @JsOverlay
  public static final int STENCIL_BACK_PASS_DEPTH_PASS = 0x8803;

  @JsOverlay
  public static final int STENCIL_BACK_REF = 0x8CA3;

  @JsOverlay
  public static final int STENCIL_BACK_VALUE_MASK = 0x8CA4;

  @JsOverlay
  public static final int STENCIL_BACK_WRITEMASK = 0x8CA5;

  @JsOverlay
  public static final int STENCIL_BITS = 0x0D57;

  @JsOverlay
  public static final int STENCIL_BUFFER_BIT = 0x00000400;

  @JsOverlay
  public static final int STENCIL_CLEAR_VALUE = 0x0B91;

  @JsOverlay
  public static final int STENCIL_FAIL = 0x0B94;

  @JsOverlay
  public static final int STENCIL_FUNC = 0x0B92;

  @JsOverlay
  public static final int STENCIL_INDEX8 = 0x8D48;

  @JsOverlay
  public static final int STENCIL_PASS_DEPTH_FAIL = 0x0B95;

  @JsOverlay
  public static final int STENCIL_PASS_DEPTH_PASS = 0x0B96;

  @JsOverlay
  public static final int STENCIL_REF = 0x0B97;

  @JsOverlay
  public static final int STENCIL_TEST = 0x0B90;

  @JsOverlay
  public static final int STENCIL_VALUE_MASK = 0x0B93;

  @JsOverlay
  public static final int STENCIL_WRITEMASK = 0x0B98;

  @JsOverlay
  public static final int STREAM_DRAW = 0x88E0;

  @JsOverlay
  public static final int SUBPIXEL_BITS = 0x0D50;

  @JsOverlay
  public static final int TEXTURE = 0x1702;

  @JsOverlay
  public static final int TEXTURE0 = 0x84C0;

  @JsOverlay
  public static final int TEXTURE1 = 0x84C1;

  @JsOverlay
  public static final int TEXTURE10 = 0x84CA;

  @JsOverlay
  public static final int TEXTURE11 = 0x84CB;

  @JsOverlay
  public static final int TEXTURE12 = 0x84CC;

  @JsOverlay
  public static final int TEXTURE13 = 0x84CD;

  @JsOverlay
  public static final int TEXTURE14 = 0x84CE;

  @JsOverlay
  public static final int TEXTURE15 = 0x84CF;

  @JsOverlay
  public static final int TEXTURE16 = 0x84D0;

  @JsOverlay
  public static final int TEXTURE17 = 0x84D1;

  @JsOverlay
  public static final int TEXTURE18 = 0x84D2;

  @JsOverlay
  public static final int TEXTURE19 = 0x84D3;

  @JsOverlay
  public static final int TEXTURE2 = 0x84C2;

  @JsOverlay
  public static final int TEXTURE20 = 0x84D4;

  @JsOverlay
  public static final int TEXTURE21 = 0x84D5;

  @JsOverlay
  public static final int TEXTURE22 = 0x84D6;

  @JsOverlay
  public static final int TEXTURE23 = 0x84D7;

  @JsOverlay
  public static final int TEXTURE24 = 0x84D8;

  @JsOverlay
  public static final int TEXTURE25 = 0x84D9;

  @JsOverlay
  public static final int TEXTURE26 = 0x84DA;

  @JsOverlay
  public static final int TEXTURE27 = 0x84DB;

  @JsOverlay
  public static final int TEXTURE28 = 0x84DC;

  @JsOverlay
  public static final int TEXTURE29 = 0x84DD;

  @JsOverlay
  public static final int TEXTURE3 = 0x84C3;

  @JsOverlay
  public static final int TEXTURE30 = 0x84DE;

  @JsOverlay
  public static final int TEXTURE31 = 0x84DF;

  @JsOverlay
  public static final int TEXTURE4 = 0x84C4;

  @JsOverlay
  public static final int TEXTURE5 = 0x84C5;

  @JsOverlay
  public static final int TEXTURE6 = 0x84C6;

  @JsOverlay
  public static final int TEXTURE7 = 0x84C7;

  @JsOverlay
  public static final int TEXTURE8 = 0x84C8;

  @JsOverlay
  public static final int TEXTURE9 = 0x84C9;

  @JsOverlay
  public static final int TEXTURE_2D = 0x0DE1;

  @JsOverlay
  public static final int TEXTURE_BINDING_2D = 0x8069;

  @JsOverlay
  public static final int TEXTURE_BINDING_CUBE_MAP = 0x8514;

  @JsOverlay
  public static final int TEXTURE_CUBE_MAP = 0x8513;

  @JsOverlay
  public static final int TEXTURE_CUBE_MAP_NEGATIVE_X = 0x8516;

  @JsOverlay
  public static final int TEXTURE_CUBE_MAP_NEGATIVE_Y = 0x8518;

  @JsOverlay
  public static final int TEXTURE_CUBE_MAP_NEGATIVE_Z = 0x851A;

  @JsOverlay
  public static final int TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515;

  @JsOverlay
  public static final int TEXTURE_CUBE_MAP_POSITIVE_Y = 0x8517;

  @JsOverlay
  public static final int TEXTURE_CUBE_MAP_POSITIVE_Z = 0x8519;

  @JsOverlay
  public static final int TEXTURE_MAG_FILTER = 0x2800;

  @JsOverlay
  public static final int TEXTURE_MIN_FILTER = 0x2801;

  @JsOverlay
  public static final int TEXTURE_WRAP_S = 0x2802;

  @JsOverlay
  public static final int TEXTURE_WRAP_T = 0x2803;

  @JsOverlay
  public static final int TRIANGLES = 0x0004;

  @JsOverlay
  public static final int TRIANGLE_FAN = 0x0006;

  @JsOverlay
  public static final int TRIANGLE_STRIP = 0x0005;

  @JsOverlay
  public static final int UNPACK_ALIGNMENT = 0x0CF5;

  @JsOverlay
  public static final int UNPACK_COLORSPACE_CONVERSION_WEBGL = 0x9243;

  @JsOverlay
  public static final int UNPACK_FLIP_Y_WEBGL = 0x9240;

  @JsOverlay
  public static final int UNPACK_PREMULTIPLY_ALPHA_WEBGL = 0x9241;

  @JsOverlay
  public static final int UNSIGNED_BYTE = 0x1401;

  @JsOverlay
  public static final int UNSIGNED_INT = 0x1405;

  @JsOverlay
  public static final int UNSIGNED_SHORT = 0x1403;

  @JsOverlay
  public static final int UNSIGNED_SHORT_4_4_4_4 = 0x8033;

  @JsOverlay
  public static final int UNSIGNED_SHORT_5_5_5_1 = 0x8034;

  @JsOverlay
  public static final int UNSIGNED_SHORT_5_6_5 = 0x8363;

  @JsOverlay
  public static final int VALIDATE_STATUS = 0x8B83;

  @JsOverlay
  public static final int VENDOR = 0x1F00;

  @JsOverlay
  public static final int VERSION = 0x1F02;

  @JsOverlay
  public static final int VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 0x889F;

  @JsOverlay
  public static final int VERTEX_ATTRIB_ARRAY_ENABLED = 0x8622;

  @JsOverlay
  public static final int VERTEX_ATTRIB_ARRAY_NORMALIZED = 0x886A;

  @JsOverlay
  public static final int VERTEX_ATTRIB_ARRAY_POINTER = 0x8645;

  @JsOverlay
  public static final int VERTEX_ATTRIB_ARRAY_SIZE = 0x8623;

  @JsOverlay
  public static final int VERTEX_ATTRIB_ARRAY_STRIDE = 0x8624;

  @JsOverlay
  public static final int VERTEX_ATTRIB_ARRAY_TYPE = 0x8625;

  @JsOverlay
  public static final int VERTEX_SHADER = 0x8B31;

  @JsOverlay
  public static final int VIEWPORT = 0x0BA2;

  @JsOverlay
  public static final int ZERO = 0;

  protected WebGLRenderingContext() {
  }

  /**
   * The read-only WebGLRenderingContext.drawingBufferHeight property represents the actual height of the current drawing buffer. It should match the height attribute of the canvas element associated with this context, but might differ if the implementation is not able to provide the requested height.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/drawingBufferHeight">WebGLRenderingContext.drawingBufferHeight - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#DOM-WebGLRenderingContext-drawingBufferHeight">WebGLRenderingContext.drawingBufferHeight - WebGL 1.0</a>
   */
  @JsProperty(
      name = "drawingBufferHeight"
  )
  public native int drawingBufferHeight();

  /**
   * The read-only WebGLRenderingContext.drawingBufferWidth property represents the actual width of the current drawing buffer. It should match the width attribute of the canvas element associated with this context, but might differ if the implementation is not able to provide the requested width.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/drawingBufferWidth">WebGLRenderingContext.drawingBufferWidth - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#DOM-WebGLRenderingContext-drawingBufferWidth">WebGLRenderingContext.drawingBufferWidth - WebGL 1.0</a>
   */
  @JsProperty(
      name = "drawingBufferWidth"
  )
  public native int drawingBufferWidth();

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.5">bufferData - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glBufferData.xml">glBufferData - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glBufferData.xhtml">glBufferData - OpenGL ES 3.0</a>
   */
  public native void bufferData(int target, int size, int usage);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.5">bufferData - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glBufferData.xml">glBufferData - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glBufferData.xhtml">glBufferData - OpenGL ES 3.0</a>
   */
  public native void bufferData(int target, @Nullable BufferSource data, int usage);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.5">bufferSubData - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glBufferSubData.xml">glBufferSubData - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glBufferSubData.xhtml">glBufferSubData - OpenGL ES 3.0</a>
   */
  public native void bufferSubData(int target, int offset, @Nonnull BufferSource data);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull ArrayBufferView data);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#COMPRESSEDTEXSUBIMAGE2D">compressedTexSubImage2D - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glCompressedTexSubImage2D.xml">glCompressedTexSubImage2D - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glCompressedTexSubImage2D.xhtml">glCompressedTexSubImage2D - OpenGL ES 3.0</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull ArrayBufferView data);

  /**
   * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into an ArrayBufferView object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels">WebGLRenderingContext.readPixels - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.12">readPixels - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glReadPixels.xml">glReadPixels - OpenGL ES 2.0</a>
   */
  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nullable ArrayBufferView pixels);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.8">texImage2D - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glTexImage2D.xml">glTexImage2D - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/2.0/#3.7.6">texImage2D - WebGL 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glTexImage2D.xhtml">glTexImage2D - OpenGL ES 3.0</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nullable ArrayBufferView pixels);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.8">texImage2D - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glTexImage2D.xml">glTexImage2D - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/2.0/#3.7.6">texImage2D - WebGL 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glTexImage2D.xhtml">glTexImage2D - OpenGL ES 3.0</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int format, int type,
      @Nonnull TexImageSource source);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#TEXSUBIMAGE2D">texSubImage2D - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glTexSubImage2D.xml">glTexSubImage2D - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/2.0/#3.7.6">texSubImage2D - WebGL 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glTexSubImage2D.xhtml">glTexSubImage2D - OpenGL ES 3.0</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nullable ArrayBufferView pixels);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#TEXSUBIMAGE2D">texSubImage2D - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glTexSubImage2D.xml">glTexSubImage2D - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/2.0/#3.7.6">texSubImage2D - WebGL 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glTexSubImage2D.xhtml">glTexSubImage2D - OpenGL ES 3.0</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int format,
      int type, @Nonnull TexImageSource source);

  public native void uniform1fv(@Nullable WebGLUniformLocation location, @Nonnull Float32List v);

  public native void uniform1fv(@Nullable WebGLUniformLocation location, @Nonnull Float32Array v);

  public native void uniform1fv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> v);

  public native void uniform1fv(@Nullable WebGLUniformLocation location, @Nonnull double[] v);

  public native void uniform1iv(@Nullable WebGLUniformLocation location, @Nonnull Int32List v);

  public native void uniform1iv(@Nullable WebGLUniformLocation location, @Nonnull Int32Array v);

  public native void uniform1iv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> v);

  public native void uniform1iv(@Nullable WebGLUniformLocation location, @Nonnull double[] v);

  public native void uniform2fv(@Nullable WebGLUniformLocation location, @Nonnull Float32List v);

  public native void uniform2fv(@Nullable WebGLUniformLocation location, @Nonnull Float32Array v);

  public native void uniform2fv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> v);

  public native void uniform2fv(@Nullable WebGLUniformLocation location, @Nonnull double[] v);

  public native void uniform2iv(@Nullable WebGLUniformLocation location, @Nonnull Int32List v);

  public native void uniform2iv(@Nullable WebGLUniformLocation location, @Nonnull Int32Array v);

  public native void uniform2iv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> v);

  public native void uniform2iv(@Nullable WebGLUniformLocation location, @Nonnull double[] v);

  public native void uniform3fv(@Nullable WebGLUniformLocation location, @Nonnull Float32List v);

  public native void uniform3fv(@Nullable WebGLUniformLocation location, @Nonnull Float32Array v);

  public native void uniform3fv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> v);

  public native void uniform3fv(@Nullable WebGLUniformLocation location, @Nonnull double[] v);

  public native void uniform3iv(@Nullable WebGLUniformLocation location, @Nonnull Int32List v);

  public native void uniform3iv(@Nullable WebGLUniformLocation location, @Nonnull Int32Array v);

  public native void uniform3iv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> v);

  public native void uniform3iv(@Nullable WebGLUniformLocation location, @Nonnull double[] v);

  public native void uniform4fv(@Nullable WebGLUniformLocation location, @Nonnull Float32List v);

  public native void uniform4fv(@Nullable WebGLUniformLocation location, @Nonnull Float32Array v);

  public native void uniform4fv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> v);

  public native void uniform4fv(@Nullable WebGLUniformLocation location, @Nonnull double[] v);

  public native void uniform4iv(@Nullable WebGLUniformLocation location, @Nonnull Int32List v);

  public native void uniform4iv(@Nullable WebGLUniformLocation location, @Nonnull Int32Array v);

  public native void uniform4iv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> v);

  public native void uniform4iv(@Nullable WebGLUniformLocation location, @Nonnull double[] v);

  public native void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List value);

  public native void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array value);

  public native void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> value);

  public native void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull double[] value);

  public native void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List value);

  public native void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array value);

  public native void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> value);

  public native void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull double[] value);

  public native void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List value);

  public native void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array value);

  public native void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> value);

  public native void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull double[] value);

  /**
   * The WebGLRenderingContext.activeTexture() method of the WebGL API specifies which texture unit to make active.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/activeTexture">WebGLRenderingContext.activeTexture - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">activeTexture - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glActiveTexture.xml">glActiveTexture - OpenGL ES 2.0</a>
   */
  public native void activeTexture(int texture);

  /**
   * The WebGLRenderingContext.attachShader() method of the WebGL API attaches either a fragment or vertex WebGLShader to a WebGLProgram.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/attachShader">WebGLRenderingContext.attachShader - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.9">attachShader - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glAttachShader.xml">glAttachShader - OpenGL ES 2.0</a>
   */
  public native void attachShader(@Nonnull WebGLProgram program, @Nonnull WebGLShader shader);

  /**
   * The WebGLRenderingContext.bindAttribLocation() method of the WebGL API binds a generic vertex index to an attribute variable.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bindAttribLocation">WebGLRenderingContext.bindAttribLocation - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.9">bindAttribLocation - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glBindAttribLocation.xml">glBindAttribLocation - OpenGL ES 2.0</a>
   */
  public native void bindAttribLocation(@Nonnull WebGLProgram program, int index,
      @Nonnull String name);

  /**
   * The WebGLRenderingContext.bindBuffer() method of the WebGL API binds a given WebGLBuffer to a target.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bindBuffer">WebGLRenderingContext.bindBuffer - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.5">bindBuffer - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glBindBuffer.xml">glBindBuffer - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/2.0/#3.7.1">bindBuffer - WebGL 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glBindBuffer.xhtml">glBindBuffer - OpenGL ES 3.0</a>
   */
  public native void bindBuffer(int target, @Nullable WebGLBuffer buffer);

  /**
   * The WebGLRenderingContext.bindFramebuffer() method of the WebGL API binds a given WebGLFramebuffer to a target.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bindFramebuffer">WebGLRenderingContext.bindFramebuffer - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.6">bindFramebuffer - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glBindFramebuffer.xml">glBindFramebuffer - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/2.0/#3.7.1">bindFrameBuffer - WebGL 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glBindFramebuffer.xhtml">glBindFramebuffer - OpenGL ES 3.0</a>
   */
  public native void bindFramebuffer(int target, @Nullable WebGLFramebuffer framebuffer);

  /**
   * The WebGLRenderingContext.bindRenderbuffer() method of the WebGL API binds a given WebGLRenderbuffer to a target, which must be gl.RENDERBUFFER.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bindRenderbuffer">WebGLRenderingContext.bindRenderbuffer - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.7">bindRenderbuffer - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glBindRenderbuffer.xml">glBindRenderbuffer - OpenGL ES 2.0</a>
   */
  public native void bindRenderbuffer(int target, @Nullable WebGLRenderbuffer renderbuffer);

  /**
   * The WebGLRenderingContext.bindTexture() method of the WebGL API binds a given WebGLTexture to a target (binding point).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bindTexture">WebGLRenderingContext.bindTexture - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.8">bindTexture - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glBindTexture.xml">glBindTexture - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/2.0/#3.7.1">bindTexture - WebGL 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glBindTexture.xhtml">glBindTexture - OpenGL ES 3.0</a>
   */
  public native void bindTexture(int target, @Nullable WebGLTexture texture);

  /**
   * The WebGLRenderingContext.blendColor() method of the WebGL API is used to set the source and destination blending factors.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/blendColor">WebGLRenderingContext.blendColor - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">blendColor - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glBlendColor.xml">glBlendColor - OpenGL ES 2.0</a>
   */
  public native void blendColor(float red, float green, float blue, float alpha);

  /**
   * The WebGLRenderingContext.blendEquation() method of the WebGL API is used to set both the RGB blend equation and alpha blend equation to a single equation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/blendEquation">WebGLRenderingContext.blendEquation - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">blendEquation - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glBlendEquation.xml">glBlendEquation - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glBlendEquation.xml">glBlendEquation - OpenGL ES 3.0</a>
   */
  public native void blendEquation(int mode);

  /**
   * The WebGLRenderingContext.blendEquationSeparate() method of the WebGL API is used to set the RGB blend equation and alpha blend equation separately.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/blendEquationSeparate">WebGLRenderingContext.blendEquationSeparate - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">blendEquationSeparate - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glBlendEquationSeparate.xml">glBlendEquationSeparate - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glBlendEquationSeparate.xhtml">glBlendEquationSeparate - OpenGL ES 3.0</a>
   */
  public native void blendEquationSeparate(int modeRGB, int modeAlpha);

  /**
   * The WebGLRenderingContext.blendFunc() method of the WebGL API defines which function is used for blending pixel arithmetic.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/blendFunc">WebGLRenderingContext.blendFunc - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">blendFunc - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glBlendFunc.xml">glBlendFunc - OpenGL ES 2.0</a>
   */
  public native void blendFunc(int sfactor, int dfactor);

  /**
   * The WebGLRenderingContext.blendFuncSeparate() method of the WebGL API defines which function is used for blending pixel arithmetic for RGB and alpha components separately.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/blendFuncSeparate">WebGLRenderingContext.blendFuncSeparate - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">blendFunc - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glBlendFunc.xml">glBlendFunc - OpenGL ES 2.0</a>
   */
  public native void blendFuncSeparate(int srcRGB, int dstRGB, int srcAlpha, int dstAlpha);

  /**
   * The WebGLRenderingContext.checkFramebufferStatus() method of the WebGL API returns the completeness status of the WebGLFramebuffer object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/checkFramebufferStatus">WebGLRenderingContext.checkFramebufferStatus - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.6">checkFramebufferStatus - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glCheckFramebufferStatus.xml">glCheckFramebufferStatus - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/2.0/#3.7.4">checkFramebufferStatus - WebGL 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glCheckFramebufferStatus.xhtml">glCheckFramebufferStatus - OpenGL ES 3.0</a>
   */
  public native int checkFramebufferStatus(int target);

  /**
   * The WebGLRenderingContext.clear() method of the WebGL API clears buffers to preset values.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/clear">WebGLRenderingContext.clear - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.11">clear - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glClear.xml">glClear - OpenGL ES 2.0</a>
   */
  public native void clear(int mask);

  /**
   * The WebGLRenderingContext.clearColor() method of the WebGL API specifies the color values used when clearing color buffers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/clearColor">WebGLRenderingContext.clearColor - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">clearColor - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glClearColor.xml">glClearColor - OpenGL ES 2.0</a>
   */
  public native void clearColor(float red, float green, float blue, float alpha);

  /**
   * The WebGLRenderingContext.clearDepth() method of the WebGL API specifies the clear value for the depth buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/clearDepth">WebGLRenderingContext.clearDepth - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">clearDepth - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glClearDepthf.xml">glClearDepthf - OpenGL ES 2.0</a>
   */
  public native void clearDepth(float depth);

  /**
   * The WebGLRenderingContext.clearStencil() method of the WebGL API specifies the clear value for the stencil buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/clearStencil">WebGLRenderingContext.clearStencil - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">clearStencil - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glClearStencil.xml">glClearStencil - OpenGL ES 2.0</a>
   */
  public native void clearStencil(int s);

  /**
   * The WebGLRenderingContext.colorMask() method of the WebGL API sets which color components to enable or to disable when drawing or rendering to a WebGLFramebuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/colorMask">WebGLRenderingContext.colorMask - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">colorMask - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glColorMask.xml">glColorMask - OpenGL ES 2.0</a>
   */
  public native void colorMask(boolean red, boolean green, boolean blue, boolean alpha);

  /**
   * The WebGLRenderingContext.compileShader() method of the WebGL API compiles a GLSL shader into binary data so that it can be used by a WebGLProgram.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compileShader">WebGLRenderingContext.compileShader - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.9">compileShader - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glCompileShader.xml">glCompileShader - OpenGL ES 2.0</a>
   */
  public native void compileShader(@Nonnull WebGLShader shader);

  /**
   * The WebGLRenderingContext.copyTexImage2D() method of the WebGL API copies pixels from the current WebGLFramebuffer into a 2D texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/copyTexImage2D">WebGLRenderingContext.copyTexImage2D - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.8">copyTexImage2D - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glCopyTexImage2D.xml">glCopyTexImage2D - OpenGL ES 2.0</a>
   */
  public native void copyTexImage2D(int target, int level, int internalformat, int x, int y,
      int width, int height, int border);

  /**
   * The WebGLRenderingContext.copyTexSubImage2D() method of the WebGL API copies pixels from the current WebGLFramebuffer into an existing 2D texture sub-image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/copyTexSubImage2D">WebGLRenderingContext.copyTexSubImage2D - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.8">copyTexSubImage2D - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glCopyTexSubImage2D.xml">glCopyTexSubImage2D - OpenGL ES 2.0</a>
   */
  public native void copyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x,
      int y, int width, int height);

  /**
   * The WebGLRenderingContext.createBuffer() method of the WebGL API creates and initializes a WebGLBuffer storing data such as vertices or colors.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/createBuffer">WebGLRenderingContext.createBuffer - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.5">createBuffer - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGenBuffers.xml">glGenBuffers - OpenGL ES 2.0</a>
   */
  @Nullable
  public native WebGLBuffer createBuffer();

  /**
   * The WebGLRenderingContext.createFramebuffer() method of the WebGL API creates and initializes a WebGLFramebuffer object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/createFramebuffer">WebGLRenderingContext.createFramebuffer - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.6">createFramebuffer - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGenFramebuffers.xml">glGenFramebuffers - OpenGL ES 2.0</a>
   */
  @Nullable
  public native WebGLFramebuffer createFramebuffer();

  /**
   * The WebGLRenderingContext.createProgram() method of the WebGL API creates and initializes a WebGLProgram object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/createProgram">WebGLRenderingContext.createProgram - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.9">createProgram - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glCreateProgram.xml">glCreateProgram - OpenGL ES 2.0</a>
   */
  @Nullable
  public native WebGLProgram createProgram();

  /**
   * The WebGLRenderingContext.createRenderbuffer() method of the WebGL API creates and initializes a WebGLRenderbuffer object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/createRenderbuffer">WebGLRenderingContext.createRenderbuffer - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.7">createRenderbuffer - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGenRenderbuffers.xml">glGenRenderbuffers - OpenGL ES 2.0</a>
   */
  @Nullable
  public native WebGLRenderbuffer createRenderbuffer();

  /**
   * The WebGLRenderingContext method createShader() of the WebGL API creates a WebGLShader that can then be configured further using WebGLRenderingContext.shaderSource() and WebGLRenderingContext.compileShader().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/createShader">WebGLRenderingContext.createShader - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.9">createShader - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glCreateShader.xml">glCreateShader - OpenGL ES 2.0</a>
   */
  @Nullable
  public native WebGLShader createShader(int type);

  /**
   * The WebGLRenderingContext.createTexture() method of the WebGL API creates and initializes a WebGLTexture object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/createTexture">WebGLRenderingContext.createTexture - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.8">createTexture - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGenTextures.xml">glGenTextures - OpenGL ES 2.0</a>
   */
  @Nullable
  public native WebGLTexture createTexture();

  /**
   * The WebGLRenderingContext.cullFace() method of the WebGL API specifies whether or not front- and/or back-facing polygons can be culled.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/cullFace">WebGLRenderingContext.cullFace - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">cullFace - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glCullFace.xml">glCullFace - OpenGL ES 2.0</a>
   */
  public native void cullFace(int mode);

  /**
   * The WebGLRenderingContext.deleteBuffer() method of the WebGL API deletes a given WebGLBuffer. This method has no effect if the buffer has already been deleted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/deleteBuffer">WebGLRenderingContext.deleteBuffer - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.5">deleteBuffer - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glDeleteBuffers.xml">glDeleteBuffers - OpenGL ES 2.0</a>
   */
  public native void deleteBuffer(@Nullable WebGLBuffer buffer);

  /**
   * The WebGLRenderingContext.deleteFramebuffer() method of the WebGL API deletes a given WebGLFramebuffer object. This method has no effect if the frame buffer has already been deleted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/deleteFramebuffer">WebGLRenderingContext.deleteFramebuffer - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.6">deleteFramebuffer - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glDeleteFramebuffers.xml">glDeleteFramebuffers - OpenGL ES 2.0</a>
   */
  public native void deleteFramebuffer(@Nullable WebGLFramebuffer framebuffer);

  /**
   * The WebGLRenderingContext.deleteProgram() method of the WebGL API deletes a given WebGLProgram object. This method has no effect if the program has already been deleted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/deleteProgram">WebGLRenderingContext.deleteProgram - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.9">deleteProgram - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glDeleteProgram.xml">glDeleteProgram - OpenGL ES 2.0</a>
   */
  public native void deleteProgram(@Nullable WebGLProgram program);

  /**
   * The WebGLRenderingContext.deleteRenderbuffer() method of the WebGL API deletes a given WebGLRenderbuffer object. This method has no effect if the render buffer has already been deleted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/deleteRenderbuffer">WebGLRenderingContext.deleteRenderbuffer - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.7">deleteRenderbuffer - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glDeleteRenderbuffers.xml">glDeleteRenderbuffers - OpenGL ES 2.0</a>
   */
  public native void deleteRenderbuffer(@Nullable WebGLRenderbuffer renderbuffer);

  /**
   * The WebGLRenderingContext.deleteShader() method of the WebGL API marks a given WebGLShader object for deletion. It will then be deleted whenever the shader is no longer in use. This method has no effect if the shader has already been deleted, and the WebGLShader is automatically marked for deletion when it is destroyed by the garbage collector.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/deleteShader">WebGLRenderingContext.deleteShader - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.9">deleteShader - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glDeleteShader.xml">glDeleteShader - OpenGL ES 2.0</a>
   */
  public native void deleteShader(@Nullable WebGLShader shader);

  /**
   * The WebGLRenderingContext.deleteTexture() method of the WebGL API deletes a given WebGLTexture object. This method has no effect if the texture has already been deleted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/deleteTexture">WebGLRenderingContext.deleteTexture - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.8">deleteTexture - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glDeleteTextures.xml">glDeleteTextures - OpenGL ES 2.0</a>
   */
  public native void deleteTexture(@Nullable WebGLTexture texture);

  /**
   * The WebGLRenderingContext.depthFunc() method of the WebGL API specifies a function that compares incoming pixel depth to the current depth buffer value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/depthFunc">WebGLRenderingContext.depthFunc - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">depthFunc - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glDepthFunc.xml">glDepthFunc - OpenGL ES 2.0</a>
   */
  public native void depthFunc(int func);

  /**
   * The WebGLRenderingContext.depthMask() method of the WebGL API sets whether writing into the depth buffer is enabled or disabled.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/depthMask">WebGLRenderingContext.depthMask - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">depthMask - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glDepthMask.xml">glDepthMask - OpenGL ES 2.0</a>
   */
  public native void depthMask(boolean flag);

  /**
   * The WebGLRenderingContext.depthRange() method of the WebGL API specifies the depth range mapping from normalized device coordinates to window or viewport coordinates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/depthRange">WebGLRenderingContext.depthRange - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">depthRange - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glDepthRangef.xml">glDepthRangef - OpenGL ES 2.0</a>
   */
  public native void depthRange(float zNear, float zFar);

  /**
   * The WebGLRenderingContext.detachShader() method of the WebGL API detaches a previously attached WebGLShader from a WebGLProgram.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/detachShader">WebGLRenderingContext.detachShader - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.9">detachShader - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glDetachShader.xml">glDetachShader - OpenGL ES 2.0</a>
   */
  public native void detachShader(@Nonnull WebGLProgram program, @Nonnull WebGLShader shader);

  /**
   * The WebGLRenderingContext.disable() method of the WebGL API disables specific WebGL capabilities for this context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/disable">WebGLRenderingContext.disable - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">disable - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glDisable.xml">glDisable - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glEnable.xhtml">glDisable - OpenGL ES 3.0</a>
   */
  public native void disable(int cap);

  /**
   * The WebGLRenderingContext.disableVertexAttribArray() method of the WebGL API turns the generic vertex attribute array off at a given index position.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/disableVertexAttribArray">WebGLRenderingContext.disableVertexAttribArray - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.10">disableVertexAttribArray - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glEnableVertexAttribArray.xml">glDisableVertexAttribArray - OpenGL ES 2.0</a>
   */
  public native void disableVertexAttribArray(int index);

  /**
   * The WebGLRenderingContext.drawArrays() method of the WebGL API renders primitives from array data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/drawArrays">WebGLRenderingContext.drawArrays - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.11">drawArrays - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glDrawArrays.xml">glDrawArrays - OpenGL ES 2.0</a>
   */
  public native void drawArrays(int mode, int first, int count);

  /**
   * The WebGLRenderingContext.drawElements() method of the WebGL API renders primitives from array data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/drawElements">WebGLRenderingContext.drawElements - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.11">drawElements - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glDrawElements.xml">glDrawElements - OpenGL ES 2.0</a>
   */
  public native void drawElements(int mode, int count, int type, int offset);

  /**
   * The WebGLRenderingContext.enable() method of the WebGL API enables specific WebGL capabilities for this context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/enable">WebGLRenderingContext.enable - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">enable - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glEnable.xml">glEnable - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glEnable.xhtml">glEnable - OpenGL ES 3.0</a>
   */
  public native void enable(int cap);

  /**
   * The WebGLRenderingContext method enableVertexAttribArray(), part of the WebGL API, turns on the generic vertex attribute array at the specified index into the list of attribute arrays.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/enableVertexAttribArray">WebGLRenderingContext.enableVertexAttribArray - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.10">enableVertexAttribArray - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glEnableVertexAttribArray.xml">glEnableVertexAttribArray - OpenGL ES 2.0</a>
   */
  public native void enableVertexAttribArray(int index);

  /**
   * The WebGLRenderingContext.finish() method of the WebGL API blocks execution until all previously called commands are finished.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/finish">WebGLRenderingContext.finish - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.11">finish - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glFinish.xml">glFinish - OpenGL ES 2.0</a>
   */
  public native void finish();

  /**
   * The WebGLRenderingContext.flush() method of the WebGL API empties different buffer commands, causing all commands to be executed as quickly as possible.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/flush">WebGLRenderingContext.flush - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.11">flush - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glFlush.xml">glFlush - OpenGL ES 2.0</a>
   */
  public native void flush();

  /**
   * The WebGLRenderingContext.framebufferRenderbuffer() method of the WebGL API attaches a WebGLRenderbuffer object to a WebGLFramebuffer object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/framebufferRenderbuffer">WebGLRenderingContext.framebufferRenderbuffer - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.6">framebufferRenderbuffer - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glFramebufferRenderbuffer.xml">glFramebufferRenderbuffer - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glFramebufferRenderbuffer.xhtml">glFramebufferRenderbuffer - OpenGL ES 3.0</a>
   */
  public native void framebufferRenderbuffer(int target, int attachment, int renderbuffertarget,
      @Nullable WebGLRenderbuffer renderbuffer);

  /**
   * The WebGLRenderingContext.framebufferTexture2D() method of the WebGL API attaches a texture to a WebGLFramebuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/framebufferTexture2D">WebGLRenderingContext.framebufferTexture2D - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.6">framebufferTexture2D - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glFramebufferTexture2D.xml">glFramebufferTexture2D - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glFramebufferTexture2D.xhtml">glFramebufferTexture2D - OpenGL ES 3.0</a>
   */
  public native void framebufferTexture2D(int target, int attachment, int textarget,
      @Nullable WebGLTexture texture, int level);

  /**
   * The WebGLRenderingContext.frontFace() method of the WebGL API specifies whether polygons are front- or back-facing by setting a winding orientation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/frontFace">WebGLRenderingContext.frontFace - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">frontFace - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glFrontFace.xml">glFrontFace - OpenGL ES 2.0</a>
   */
  public native void frontFace(int mode);

  /**
   * The WebGLRenderingContext.generateMipmap() method of the WebGL API generates a set of mipmaps for a WebGLTexture object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/generateMipmap">WebGLRenderingContext.generateMipmap - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.8">generateMipmap - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGenerateMipmap.xml">glGenerateMipmap - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glGenerateMipmap.xhtml">glGenerateMipmap - OpenGL ES 3.0</a>
   */
  public native void generateMipmap(int target);

  /**
   * The WebGLRenderingContext.getActiveAttrib() method of the WebGL API returns a WebGLActiveInfo object containing size, type, and name of a vertex attribute. It is generally used when querying unknown attributes either for debugging or generic library creation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getActiveAttrib">WebGLRenderingContext.getActiveAttrib - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.10">getActiveAttrib - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGetActiveAttrib.xml">glGetActiveAttrib - OpenGL ES 2.0</a>
   */
  @Nullable
  public native WebGLActiveInfo getActiveAttrib(@Nonnull WebGLProgram program, int index);

  /**
   * The WebGLRenderingContext.getActiveUniform() method of the WebGL API returns a WebGLActiveInfo object containing size, type, and name of a uniform attribute. It is generally used when querying unknown uniforms either for debugging or generic library creation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getActiveUniform">WebGLRenderingContext.getActiveUniform - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.10">getActiveUniform - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGetActiveUniform.xml">glGetActiveUniform - OpenGL ES 2.0</a>
   */
  @Nullable
  public native WebGLActiveInfo getActiveUniform(@Nonnull WebGLProgram program, int index);

  /**
   * The WebGLRenderingContext.getAttachedShaders() method of the WebGL API returns a list of WebGLShader objects attached to a WebGLProgram.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getAttachedShaders">WebGLRenderingContext.getAttachedShaders - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.9">getAttachedShaders - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGetAttachedShaders.xml">glGetAttachedShaders - OpenGL ES 2.0</a>
   */
  @Nullable
  public native JsArray<WebGLShader> getAttachedShaders(@Nonnull WebGLProgram program);

  /**
   * The WebGLRenderingContext.getAttribLocation() method of the WebGL API returns the location of an attribute variable in a given WebGLProgram.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getAttribLocation">WebGLRenderingContext.getAttribLocation - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.10">getAttribLocation - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGetAttribLocation.xml">glGetAttribLocation - OpenGL ES 2.0</a>
   */
  public native int getAttribLocation(@Nonnull WebGLProgram program, @Nonnull String name);

  /**
   * The WebGLRenderingContext.getBufferParameter() method of the WebGL API returns information about the buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getBufferParameter">WebGLRenderingContext.getBufferParameter - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.5">getBufferParameter - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGetBufferParameteriv.xml">glGetBufferParameteriv - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/2.0/#3.7.3">getBufferParameter - WebGL 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glGetBufferParameter.xhtml">glGetBufferParameter - OpenGL ES 3.0</a>
   */
  @Nullable
  public native Any getBufferParameter(int target, int pname);

  /**
   * The WebGLRenderingContext.getContextAttributes() method returns a WebGLContextAttributes object that contains the actual context parameters. Might return null, if the context is lost.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getContextAttributes">WebGLRenderingContext.getContextAttributes - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.2">WebGLRenderingContext.getContextAttributes - WebGL 1.0</a>
   */
  @Nullable
  public native WebGLContextAttributes getContextAttributes();

  /**
   * The WebGLRenderingContext.getError() method of the WebGL API returns error information.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getError">WebGLRenderingContext.getError - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">getError - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGetError.xml">glGetError - OpenGL ES 2.0</a>
   */
  public native int getError();

  /**
   * The WebGLRenderingContext.getExtension() method enables a WebGL extension.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getExtension">WebGLRenderingContext.getExtension - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.14">WebGLRenderingContext.getExtension - WebGL 1.0</a>
   */
  @Nullable
  public native Object getExtension(@Nonnull String name);

  /**
   * The WebGLRenderingContext.getFramebufferAttachmentParameter() method of the WebGL API returns information about a framebuffer's attachment.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getFramebufferAttachmentParameter">WebGLRenderingContext.getFramebufferAttachmentParameter - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.6">getFramebufferAttachmentParameter - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGetFramebufferAttachmentParameteriv.xml">glGetFramebufferAttachmentParameteriv - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/2.0/#3.7.4">getFramebufferAttachmentParameter - WebGL 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glGetFramebufferAttachmentParameteriv.xhtml">glGetFramebufferAttachmentParameteriv - OpenGL ES 3.0</a>
   */
  @Nullable
  public native Any getFramebufferAttachmentParameter(int target, int attachment, int pname);

  /**
   * The WebGLRenderingContext.getParameter() method of the WebGL API returns a value for the passed parameter name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getParameter">WebGLRenderingContext.getParameter - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">getParameter - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/2.0/#3.7.2">getParameter - WebGL 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGet.xml">glGet - OpenGL ES 2.0</a>
   */
  @Nullable
  public native Any getParameter(int pname);

  /**
   * The WebGLRenderingContext.getProgramInfoLog returns the information log for the specified WebGLProgram object. It contains errors that occurred during failed linking or validation of WebGLProgram objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getProgramInfoLog">WebGLRenderingContext.getProgramInfoLog - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.9">getProgramInfoLog - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGetProgramInfoLog.xml">glGetProgramInfoLog - OpenGL ES 2.0</a>
   */
  @Nullable
  public native String getProgramInfoLog(@Nonnull WebGLProgram program);

  /**
   * The WebGLRenderingContext.getProgramParameter() method of the WebGL API returns information about the given program.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getProgramParameter">WebGLRenderingContext.getProgramParameter - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.9">getProgramParameter - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGetProgramiv.xml">glGetProgramiv - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/2.0/#3.7.7">getProgramParameter - WebGL 2.0</a>
   */
  @Nullable
  public native Any getProgramParameter(@Nonnull WebGLProgram program, int pname);

  /**
   * The WebGLRenderingContext.getRenderbufferParameter() method of the WebGL API returns information about the renderbuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getRenderbufferParameter">WebGLRenderingContext.getRenderbufferParameter - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.7">getRenderbufferParameter - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGetRenderbufferParameteriv.xml">glGetRenderbufferParameteriv - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/2.0/#3.7.5">getRenderbufferParameter - WebGL 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glGetRenderbufferParameteriv.xhtml">glGetRenderbufferParameteriv - OpenGL ES 3.0</a>
   */
  @Nullable
  public native Any getRenderbufferParameter(int target, int pname);

  /**
   * The WebGLRenderingContext.getShaderInfoLog returns the information log for the specified WebGLShader object. It contains warnings, debugging and compile information.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getShaderInfoLog">WebGLRenderingContext.getShaderInfoLog - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.9">getShaderInfoLog - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGetShaderInfoLog.xml">glGetShaderInfoLog - OpenGL ES 2.0</a>
   */
  @Nullable
  public native String getShaderInfoLog(@Nonnull WebGLShader shader);

  /**
   * The WebGLRenderingContext.getShaderParameter() method of the WebGL API returns information about the given shader.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getShaderParameter">WebGLRenderingContext.getShaderParameter - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.9">getShaderParameter - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGetShaderiv.xml">glGetShaderiv - OpenGL ES 2.0</a>
   */
  @Nullable
  public native Any getShaderParameter(@Nonnull WebGLShader shader, int pname);

  /**
   * The WebGLRenderingContext.getShaderPrecisionFormat() method of the WebGL API returns a new WebGLShaderPrecisionFormat object describing the range and precision for the specified shader numeric format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getShaderPrecisionFormat">WebGLRenderingContext.getShaderPrecisionFormat - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.9">getShaderPrecisionFormat - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGetShaderPrecisionFormat.xml">glGetShaderPrecisionFormat - OpenGL ES 2.0</a>
   */
  @Nullable
  public native WebGLShaderPrecisionFormat getShaderPrecisionFormat(int shadertype,
      int precisiontype);

  /**
   * The WebGLRenderingContext.getShaderSource() method of the WebGL API returns the source code of a WebGLShader as a DOMString.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getShaderSource">WebGLRenderingContext.getShaderSource - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.9">getShaderSource - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGetShaderSource.xml">glGetShaderSource - OpenGL ES 2.0</a>
   */
  @GLSL
  @Nullable
  public native String getShaderSource(@Nonnull WebGLShader shader);

  /**
   * The WebGLRenderingContext.getSupportedExtensions() method returns a list of all the supported WebGL extensions.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getSupportedExtensions">WebGLRenderingContext.getSupportedExtensions - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.14">WebGLRenderingContext.getSupportedExtensions - WebGL 1.0</a>
   */
  @Nullable
  public native JsArray<String> getSupportedExtensions();

  /**
   * The WebGLRenderingContext.getTexParameter() method of the WebGL API returns information about the given texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getTexParameter">WebGLRenderingContext.getTexParameter - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.8">getTexParameter - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGetTexParameter.xml">glGetTexParameter - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/2.0/#3.7.6">getTexParameter - WebGL 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glGetTexParameter.xhtml">glGetTexParameter - OpenGL ES 3.0</a>
   */
  @Nullable
  public native Any getTexParameter(int target, int pname);

  /**
   * The WebGLRenderingContext.getUniform() method of the WebGL API returns the value of a uniform variable at a given location.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getUniform">WebGLRenderingContext.getUniform - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.10">getUniform - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGetUniform.xml">glGetUniform - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/2.0/#3.7.8">getUniform - WebGL 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glGetUniform.xhtml">glGetUniform - OpenGL ES 3.0</a>
   */
  @Nullable
  public native Any getUniform(@Nonnull WebGLProgram program,
      @Nonnull WebGLUniformLocation location);

  /**
   * Part of the WebGL API, the WebGLRenderingContext method getUniformLocation() returns the location of a specific uniform variable which is part of a given WebGLProgram.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getUniformLocation">WebGLRenderingContext.getUniformLocation - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.10">getUniformLocation - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGetUniformLocation.xml">glGetUniformLocation - OpenGL ES 2.0</a>
   */
  @Nullable
  public native WebGLUniformLocation getUniformLocation(@Nonnull WebGLProgram program,
      @Nonnull String name);

  /**
   * The WebGLRenderingContext.getVertexAttrib() method of the WebGL API returns information about a vertex attribute at a given position.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getVertexAttrib">WebGLRenderingContext.getVertexAttrib - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.10">getVertexAttrib - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGetVertexAttrib.xml">glGetVertexAttrib - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/2.0/#3.7.8">getVertexAttrib - WebGL 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glGetVertexAttrib.xhtml">glGetVertexAttrib - OpenGL ES 3.0</a>
   */
  @Nullable
  public native Any getVertexAttrib(int index, int pname);

  /**
   * The WebGLRenderingContext.getVertexAttribOffset() method of the WebGL API returns the address of a specified vertex attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getVertexAttribOffset">WebGLRenderingContext.getVertexAttribOffset - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.10">getVertexAttribOffset - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glGetVertexAttribPointerv.xml">glGetVertexAttribPointerv - OpenGL ES 2.0</a>
   */
  public native int getVertexAttribOffset(int index, int pname);

  /**
   * The WebGLRenderingContext.hint() method of the WebGL API specifies hints for certain behaviors. The interpretation of these hints depend on the implementation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/hint">WebGLRenderingContext.hint - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">hint - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glHint.xml">glHint - OpenGL ES 2.0</a>
   */
  public native void hint(int target, int mode);

  /**
   * The WebGLRenderingContext.isBuffer() method of the WebGL API returns true if the passed WebGLBuffer is valid and false otherwise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isBuffer">WebGLRenderingContext.isBuffer - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.5">isBuffer - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glIsBuffer.xml">glIsBuffer - OpenGL ES 2.0</a>
   */
  public native boolean isBuffer(@Nullable WebGLBuffer buffer);

  /**
   * The WebGLRenderingContext.isContextLost() method returns a Boolean indicating whether or not the WebGL context has been lost and must be re-established before rendering can resume.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isContextLost">WebGLRenderingContext.isContextLost - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.13">WebGLRenderingContext.isContextLost - WebGL 1.0</a>
   */
  public native boolean isContextLost();

  /**
   * The WebGLRenderingContext.isEnabled() method of the WebGL API tests whether a specific WebGL capability is enabled or not for this context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isEnabled">WebGLRenderingContext.isEnabled - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">isEnabled - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glIsEnabled.xml">glIsEnabled - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/2.0/#3.7.2">isEnabled - WebGL 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glIsEnabled.xhtml">glIsEnabled - OpenGL ES 3.0</a>
   */
  public native boolean isEnabled(int cap);

  /**
   * The WebGLRenderingContext.isFramebuffer() method of the WebGL API returns true if the passed WebGLFramebuffer is valid and false otherwise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isFramebuffer">WebGLRenderingContext.isFramebuffer - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.6">isFramebuffer - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glIsFramebuffer.xml">glIsFramebuffer - OpenGL ES 2.0</a>
   */
  public native boolean isFramebuffer(@Nullable WebGLFramebuffer framebuffer);

  /**
   * The WebGLRenderingContext.isProgram() method of the WebGL API returns true if the passed WebGLProgram is valid, false otherwise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isProgram">WebGLRenderingContext.isProgram - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.9">isProgram - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glIsProgram.xml">glIsProgram - OpenGL ES 2.0</a>
   */
  public native boolean isProgram(@Nullable WebGLProgram program);

  /**
   * The WebGLRenderingContext.isRenderbuffer() method of the WebGL API returns true if the passed WebGLRenderbuffer is valid and false otherwise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isRenderbuffer">WebGLRenderingContext.isRenderbuffer - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.7">isRenderbuffer - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glIsRenderbuffer.xml">glIsRenderbuffer - OpenGL ES 2.0</a>
   */
  public native boolean isRenderbuffer(@Nullable WebGLRenderbuffer renderbuffer);

  /**
   * The WebGLRenderingContext.isShader() method of the WebGL API returns true if the passed WebGLShader is valid, false otherwise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isShader">WebGLRenderingContext.isShader - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.9">isShader - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glIsShader.xml">glIsShader - OpenGL ES 2.0</a>
   */
  public native boolean isShader(@Nullable WebGLShader shader);

  /**
   * The WebGLRenderingContext.isTexture() method of the WebGL API returns true if the passed WebGLTexture is valid and false otherwise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isTexture">WebGLRenderingContext.isTexture - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.8">isTexture - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glIsTexture.xml">glIsTexture - OpenGL ES 2.0</a>
   */
  public native boolean isTexture(@Nullable WebGLTexture texture);

  /**
   * The WebGLRenderingContext.lineWidth() method of the WebGL API sets the line width of rasterized lines.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/lineWidth">WebGLRenderingContext.lineWidth - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">lineWidth - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glLineWidth.xml">glLineWidth - OpenGL ES 2.0</a>
   */
  public native void lineWidth(float width);

  /**
   * The WebGLRenderingContext interface's linkProgram() method links a given WebGLProgram, completing the process of preparing the GPU code for the program's fragment and vertex shaders.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/linkProgram">WebGLRenderingContext.linkProgram - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.9">linkProgram - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glLinkProgram.xml">glLinkProgram - OpenGL ES 2.0</a>
   */
  public native void linkProgram(@Nonnull WebGLProgram program);

  /**
   * The WebGLRenderingContext.pixelStorei() method of the WebGL API specifies the pixel storage modes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/pixelStorei">WebGLRenderingContext.pixelStorei - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">pixelStorei - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#PIXEL_STORAGE_PARAMETERS">Pixel Storage Parameters - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glPixelStorei.xml">glPixelStorei - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/2.0/#3.7.2">pixelStorei - WebGL 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glPixelStorei.xhtml">glPixelStorei - OpenGL ES 3.0</a>
   */
  public native void pixelStorei(int pname, int param);

  /**
   * The WebGLRenderingContext.polygonOffset() method of the WebGL API specifies the scale factors and units to calculate depth values.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/polygonOffset">WebGLRenderingContext.polygonOffset - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">polygonOffset - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glPolygonOffset.xml">glPolygonOffset - OpenGL ES 2.0</a>
   */
  public native void polygonOffset(float factor, float units);

  /**
   * The WebGLRenderingContext.renderbufferStorage() method of the WebGL API creates and initializes a renderbuffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/renderbufferStorage">WebGLRenderingContext.renderbufferStorage - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.7">renderbufferStorage - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glRenderbufferStorage.xml">glRenderbufferStorage - OpenGL ES 2.0</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/2.0/#3.7.5">getRenderbufferParameter - WebGL 2.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glRenderbufferStorage.xhtml">glRenderbufferStorage - OpenGL ES 3.0</a>
   */
  public native void renderbufferStorage(int target, int internalformat, int width, int height);

  /**
   * The WebGLRenderingContext.sampleCoverage() method of the WebGL API specifies multi-sample coverage parameters for anti-aliasing effects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/sampleCoverage">WebGLRenderingContext.sampleCoverage - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">sampleCoverage - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glSampleCoverage.xml">glSampleCoverage - OpenGL ES 2.0</a>
   */
  public native void sampleCoverage(float value, boolean invert);

  /**
   * The WebGLRenderingContext.scissor() method of the WebGL API sets a scissor box, which limits the drawing to a specified rectangle.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/scissor">WebGLRenderingContext.scissor - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.4">scissor - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glScissor.xml">glScissor - OpenGL ES 2.0</a>
   */
  public native void scissor(int x, int y, int width, int height);

  /**
   * The WebGLRenderingContext.shaderSource() method of the WebGL API sets the source code of a WebGLShader.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/shaderSource">WebGLRenderingContext.shaderSource - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.9">shaderSource - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glShaderSource.xml">glShaderSource - OpenGL ES 2.0</a>
   */
  public native void shaderSource(@Nonnull WebGLShader shader, @GLSL @Nonnull String source);

  /**
   * The WebGLRenderingContext.stencilFunc() method of the WebGL API sets the front and back function and reference value for stencil testing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/stencilFunc">WebGLRenderingContext.stencilFunc - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">stencilFunc - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glStencilFunc.xml">glStencilFunc - OpenGL ES 2.0</a>
   */
  public native void stencilFunc(int func, int ref, int mask);

  /**
   * The WebGLRenderingContext.stencilFuncSeparate() method of the WebGL API sets the front and/or back function and reference value for stencil testing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/stencilFuncSeparate">WebGLRenderingContext.stencilFuncSeparate - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">stencilFuncSeparate - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glStencilFuncSeparate.xml">glStencilFuncSeparate - OpenGL ES 2.0</a>
   */
  public native void stencilFuncSeparate(int face, int func, int ref, int mask);

  /**
   * The WebGLRenderingContext.stencilMask() method of the WebGL API controls enabling and disabling of both the front and back writing of individual bits in the stencil planes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/stencilMask">WebGLRenderingContext.stencilMask - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">stencilMask - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glStencilMask.xml">glStencilMask - OpenGL ES 2.0</a>
   */
  public native void stencilMask(int mask);

  /**
   * The WebGLRenderingContext.stencilMaskSeparate() method of the WebGL API controls enabling and disabling of front and/or back writing of individual bits in the stencil planes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/stencilMaskSeparate">WebGLRenderingContext.stencilMaskSeparate - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">stencilMaskSeparate - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glStencilMaskSeparate.xml">glStencilMaskSeparate - OpenGL ES 2.0</a>
   */
  public native void stencilMaskSeparate(int face, int mask);

  /**
   * The WebGLRenderingContext.stencilOp() method of the WebGL API sets both the front and back-facing stencil test actions.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/stencilOp">WebGLRenderingContext.stencilOp - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">stencilOp - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glStencilOp.xml">glStencilOp - OpenGL ES 2.0</a>
   */
  public native void stencilOp(int fail, int zfail, int zpass);

  /**
   * The WebGLRenderingContext.stencilOpSeparate() method of the WebGL API sets the front and/or back-facing stencil test actions.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/stencilOpSeparate">WebGLRenderingContext.stencilOpSeparate - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.3">stencilOpSeparate - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glStencilOpSeparate.xml">glStencilOpSeparate - OpenGL ES 2.0</a>
   */
  public native void stencilOpSeparate(int face, int fail, int zfail, int zpass);

  public native void texParameterf(int target, int pname, float param);

  public native void texParameteri(int target, int pname, int param);

  public native void uniform1f(@Nullable WebGLUniformLocation location, float x);

  public native void uniform1i(@Nullable WebGLUniformLocation location, int x);

  public native void uniform2f(@Nullable WebGLUniformLocation location, float x, float y);

  public native void uniform2i(@Nullable WebGLUniformLocation location, int x, int y);

  public native void uniform3f(@Nullable WebGLUniformLocation location, float x, float y, float z);

  public native void uniform3i(@Nullable WebGLUniformLocation location, int x, int y, int z);

  public native void uniform4f(@Nullable WebGLUniformLocation location, float x, float y, float z,
      float w);

  public native void uniform4i(@Nullable WebGLUniformLocation location, int x, int y, int z, int w);

  /**
   * The WebGLRenderingContext.useProgram() method of the WebGL API sets the specified WebGLProgram as part of the current rendering state.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/useProgram">WebGLRenderingContext.useProgram - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.9">useProgram - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glUseProgram.xml">glUseProgram - OpenGL ES 2.0</a>
   */
  public native void useProgram(@Nullable WebGLProgram program);

  /**
   * The WebGLRenderingContext.validateProgram() method of the WebGL API validates a WebGLProgram. It checks if it is successfully linked and if it can be used in the current WebGL state.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/validateProgram">WebGLRenderingContext.validateProgram - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.9">validateProgram - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glValidateProgram.xml">glValidateProgram - OpenGL ES 2.0</a>
   */
  public native void validateProgram(@Nonnull WebGLProgram program);

  public native void vertexAttrib1f(int index, float x);

  public native void vertexAttrib1fv(int index, @Nonnull Float32List values);

  public native void vertexAttrib1fv(int index, @Nonnull Float32Array values);

  public native void vertexAttrib1fv(int index, @Nonnull JsArray<Double> values);

  public native void vertexAttrib1fv(int index, @Nonnull double[] values);

  public native void vertexAttrib2f(int index, float x, float y);

  public native void vertexAttrib2fv(int index, @Nonnull Float32List values);

  public native void vertexAttrib2fv(int index, @Nonnull Float32Array values);

  public native void vertexAttrib2fv(int index, @Nonnull JsArray<Double> values);

  public native void vertexAttrib2fv(int index, @Nonnull double[] values);

  public native void vertexAttrib3f(int index, float x, float y, float z);

  public native void vertexAttrib3fv(int index, @Nonnull Float32List values);

  public native void vertexAttrib3fv(int index, @Nonnull Float32Array values);

  public native void vertexAttrib3fv(int index, @Nonnull JsArray<Double> values);

  public native void vertexAttrib3fv(int index, @Nonnull double[] values);

  public native void vertexAttrib4f(int index, float x, float y, float z, float w);

  public native void vertexAttrib4fv(int index, @Nonnull Float32List values);

  public native void vertexAttrib4fv(int index, @Nonnull Float32Array values);

  public native void vertexAttrib4fv(int index, @Nonnull JsArray<Double> values);

  public native void vertexAttrib4fv(int index, @Nonnull double[] values);

  /**
   * The WebGLRenderingContext.vertexAttribPointer() method of the WebGL API binds the buffer currently bound to gl.ARRAY_BUFFER to a generic vertex attribute of the current vertex buffer object and specifies its layout.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttribPointer">WebGLRenderingContext.vertexAttribPointer - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.10">vertexAttribPointer - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glVertexAttribPointer.xml">glVertexAttribPointer - OpenGL ES 2.0</a>
   */
  public native void vertexAttribPointer(int index, int size, int type, boolean normalized,
      int stride, int offset);

  /**
   * The WebGLRenderingContext.viewport() method of the WebGL API sets the viewport, which specifies the affine transformation of x and y from normalized device coordinates to window coordinates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/viewport">WebGLRenderingContext.viewport - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/specs/latest/1.0/#5.14.4">viewport - WebGL 1.0</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man/xhtml/glViewport.xml">glViewport - OpenGL ES 2.0</a>
   */
  public native void viewport(int x, int y, int width, int height);

  @Nonnull
  public native Promise<Void> makeXRCompatible();
}
