package elemental3;

import elemental2.core.ArrayBuffer;
import elemental2.core.DataView;
import elemental2.core.Float32Array;
import elemental2.core.Float64Array;
import elemental2.core.Int16Array;
import elemental2.core.Int32Array;
import elemental2.core.Int8Array;
import elemental2.core.JsArray;
import elemental2.core.Uint16Array;
import elemental2.core.Uint32Array;
import elemental2.core.Uint8Array;
import elemental2.core.Uint8ClampedArray;
import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The WebGLRenderingContext interface provides an interface to the OpenGL ES 2.0 graphics rendering context for the drawing surface of an HTML canvas element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext">WebGLRenderingContext - MDN</a>
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

  WebGLRenderingContext() {
  }

  @JsProperty(
      name = "drawingBufferHeight"
  )
  public native int drawingBufferHeight();

  @JsProperty(
      name = "drawingBufferWidth"
  )
  public native int drawingBufferWidth();

  public native void bufferData(int target, int size, int usage);

  public native void bufferData(int target, @Nullable BufferSource data, int usage);

  public native void bufferData(int target, @Nonnull ArrayBufferView data, int usage);

  public native void bufferData(int target, @Nonnull Int8Array data, int usage);

  public native void bufferData(int target, @Nonnull Int16Array data, int usage);

  public native void bufferData(int target, @Nonnull Int32Array data, int usage);

  public native void bufferData(int target, @Nonnull Uint8Array data, int usage);

  public native void bufferData(int target, @Nonnull Uint16Array data, int usage);

  public native void bufferData(int target, @Nonnull Uint32Array data, int usage);

  public native void bufferData(int target, @Nonnull Uint8ClampedArray data, int usage);

  public native void bufferData(int target, @Nonnull Float32Array data, int usage);

  public native void bufferData(int target, @Nonnull Float64Array data, int usage);

  public native void bufferData(int target, @Nonnull DataView data, int usage);

  public native void bufferData(int target, @Nonnull ArrayBuffer data, int usage);

  public native void bufferSubData(int target, int offset, @Nonnull BufferSource data);

  public native void bufferSubData(int target, int offset, @Nonnull ArrayBufferView data);

  public native void bufferSubData(int target, int offset, @Nonnull Int8Array data);

  public native void bufferSubData(int target, int offset, @Nonnull Int16Array data);

  public native void bufferSubData(int target, int offset, @Nonnull Int32Array data);

  public native void bufferSubData(int target, int offset, @Nonnull Uint8Array data);

  public native void bufferSubData(int target, int offset, @Nonnull Uint16Array data);

  public native void bufferSubData(int target, int offset, @Nonnull Uint32Array data);

  public native void bufferSubData(int target, int offset, @Nonnull Uint8ClampedArray data);

  public native void bufferSubData(int target, int offset, @Nonnull Float32Array data);

  public native void bufferSubData(int target, int offset, @Nonnull Float64Array data);

  public native void bufferSubData(int target, int offset, @Nonnull DataView data);

  public native void bufferSubData(int target, int offset, @Nonnull ArrayBuffer data);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull ArrayBufferView data);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Int8Array data);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Int16Array data);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Int32Array data);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Uint8Array data);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Uint16Array data);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Uint32Array data);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Uint8ClampedArray data);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Float32Array data);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Float64Array data);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull DataView data);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull ArrayBufferView data);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Int8Array data);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Int16Array data);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Int32Array data);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint8Array data);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint16Array data);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint32Array data);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint8ClampedArray data);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Float32Array data);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Float64Array data);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull DataView data);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nullable ArrayBufferView pixels);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Int8Array pixels);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Int16Array pixels);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Int32Array pixels);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Uint8Array pixels);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Uint16Array pixels);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Uint32Array pixels);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Uint8ClampedArray pixels);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Float32Array pixels);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Float64Array pixels);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull DataView pixels);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nullable ArrayBufferView pixels);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Int8Array pixels);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Int16Array pixels);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Int32Array pixels);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Uint8Array pixels);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Uint16Array pixels);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Uint32Array pixels);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Uint8ClampedArray pixels);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Float32Array pixels);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Float64Array pixels);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull DataView pixels);

  public native void texImage2D(int target, int level, int internalformat, int format, int type,
      @Nonnull TexImageSource source);

  public native void texImage2D(int target, int level, int internalformat, int format, int type,
      @Nonnull ImageBitmap source);

  public native void texImage2D(int target, int level, int internalformat, int format, int type,
      @Nonnull ImageData source);

  public native void texImage2D(int target, int level, int internalformat, int format, int type,
      @Nonnull HTMLImageElement source);

  public native void texImage2D(int target, int level, int internalformat, int format, int type,
      @Nonnull HTMLCanvasElement source);

  public native void texImage2D(int target, int level, int internalformat, int format, int type,
      @Nonnull HTMLVideoElement source);

  public native void texImage2D(int target, int level, int internalformat, int format, int type,
      @Nonnull OffscreenCanvas source);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nullable ArrayBufferView pixels);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Int8Array pixels);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Int16Array pixels);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Int32Array pixels);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Uint8Array pixels);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Uint16Array pixels);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Uint32Array pixels);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Uint8ClampedArray pixels);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Float32Array pixels);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Float64Array pixels);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull DataView pixels);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int format,
      int type, @Nonnull TexImageSource source);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int format,
      int type, @Nonnull ImageBitmap source);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int format,
      int type, @Nonnull ImageData source);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int format,
      int type, @Nonnull HTMLImageElement source);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int format,
      int type, @Nonnull HTMLCanvasElement source);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int format,
      int type, @Nonnull HTMLVideoElement source);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int format,
      int type, @Nonnull OffscreenCanvas source);

  public native void uniform1fv(@Nullable WebGLUniformLocation location, @Nonnull Float32List v);

  public native void uniform1fv(@Nullable WebGLUniformLocation location, @Nonnull Float32Array v);

  public native void uniform1fv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> v);

  public native void uniform1fv(@Nullable WebGLUniformLocation location, @Nonnull Double[] v);

  public native void uniform1iv(@Nullable WebGLUniformLocation location, @Nonnull Int32List v);

  public native void uniform1iv(@Nullable WebGLUniformLocation location, @Nonnull Int32Array v);

  public native void uniform1iv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> v);

  public native void uniform1iv(@Nullable WebGLUniformLocation location, @Nonnull Double[] v);

  public native void uniform2fv(@Nullable WebGLUniformLocation location, @Nonnull Float32List v);

  public native void uniform2fv(@Nullable WebGLUniformLocation location, @Nonnull Float32Array v);

  public native void uniform2fv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> v);

  public native void uniform2fv(@Nullable WebGLUniformLocation location, @Nonnull Double[] v);

  public native void uniform2iv(@Nullable WebGLUniformLocation location, @Nonnull Int32List v);

  public native void uniform2iv(@Nullable WebGLUniformLocation location, @Nonnull Int32Array v);

  public native void uniform2iv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> v);

  public native void uniform2iv(@Nullable WebGLUniformLocation location, @Nonnull Double[] v);

  public native void uniform3fv(@Nullable WebGLUniformLocation location, @Nonnull Float32List v);

  public native void uniform3fv(@Nullable WebGLUniformLocation location, @Nonnull Float32Array v);

  public native void uniform3fv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> v);

  public native void uniform3fv(@Nullable WebGLUniformLocation location, @Nonnull Double[] v);

  public native void uniform3iv(@Nullable WebGLUniformLocation location, @Nonnull Int32List v);

  public native void uniform3iv(@Nullable WebGLUniformLocation location, @Nonnull Int32Array v);

  public native void uniform3iv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> v);

  public native void uniform3iv(@Nullable WebGLUniformLocation location, @Nonnull Double[] v);

  public native void uniform4fv(@Nullable WebGLUniformLocation location, @Nonnull Float32List v);

  public native void uniform4fv(@Nullable WebGLUniformLocation location, @Nonnull Float32Array v);

  public native void uniform4fv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> v);

  public native void uniform4fv(@Nullable WebGLUniformLocation location, @Nonnull Double[] v);

  public native void uniform4iv(@Nullable WebGLUniformLocation location, @Nonnull Int32List v);

  public native void uniform4iv(@Nullable WebGLUniformLocation location, @Nonnull Int32Array v);

  public native void uniform4iv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> v);

  public native void uniform4iv(@Nullable WebGLUniformLocation location, @Nonnull Double[] v);

  public native void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List value);

  public native void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array value);

  public native void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> value);

  public native void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] value);

  public native void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List value);

  public native void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array value);

  public native void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> value);

  public native void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] value);

  public native void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List value);

  public native void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array value);

  public native void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> value);

  public native void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] value);

  public native void activeTexture(int texture);

  public native void attachShader(@Nonnull WebGLProgram program, @Nonnull WebGLShader shader);

  public native void bindAttribLocation(@Nonnull WebGLProgram program, int index,
      @Nonnull String name);

  public native void bindBuffer(int target, @Nullable WebGLBuffer buffer);

  public native void bindFramebuffer(int target, @Nullable WebGLFramebuffer framebuffer);

  public native void bindRenderbuffer(int target, @Nullable WebGLRenderbuffer renderbuffer);

  public native void bindTexture(int target, @Nullable WebGLTexture texture);

  public native void blendColor(float red, float green, float blue, float alpha);

  public native void blendEquation(int mode);

  public native void blendEquationSeparate(int modeRGB, int modeAlpha);

  public native void blendFunc(int sfactor, int dfactor);

  public native void blendFuncSeparate(int srcRGB, int dstRGB, int srcAlpha, int dstAlpha);

  public native int checkFramebufferStatus(int target);

  public native void clear(int mask);

  public native void clearColor(float red, float green, float blue, float alpha);

  public native void clearDepth(float depth);

  public native void clearStencil(int s);

  public native void colorMask(boolean red, boolean green, boolean blue, boolean alpha);

  public native void compileShader(@Nonnull WebGLShader shader);

  public native void copyTexImage2D(int target, int level, int internalformat, int x, int y,
      int width, int height, int border);

  public native void copyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x,
      int y, int width, int height);

  @Nullable
  public native WebGLBuffer createBuffer();

  @Nullable
  public native WebGLFramebuffer createFramebuffer();

  @Nullable
  public native WebGLProgram createProgram();

  @Nullable
  public native WebGLRenderbuffer createRenderbuffer();

  @Nullable
  public native WebGLShader createShader(int type);

  @Nullable
  public native WebGLTexture createTexture();

  public native void cullFace(int mode);

  public native void deleteBuffer(@Nullable WebGLBuffer buffer);

  public native void deleteFramebuffer(@Nullable WebGLFramebuffer framebuffer);

  public native void deleteProgram(@Nullable WebGLProgram program);

  public native void deleteRenderbuffer(@Nullable WebGLRenderbuffer renderbuffer);

  public native void deleteShader(@Nullable WebGLShader shader);

  public native void deleteTexture(@Nullable WebGLTexture texture);

  public native void depthFunc(int func);

  public native void depthMask(boolean flag);

  public native void depthRange(float zNear, float zFar);

  public native void detachShader(@Nonnull WebGLProgram program, @Nonnull WebGLShader shader);

  public native void disable(int cap);

  public native void disableVertexAttribArray(int index);

  public native void drawArrays(int mode, int first, int count);

  public native void drawElements(int mode, int count, int type, int offset);

  public native void enable(int cap);

  public native void enableVertexAttribArray(int index);

  public native void finish();

  public native void flush();

  public native void framebufferRenderbuffer(int target, int attachment, int renderbuffertarget,
      @Nullable WebGLRenderbuffer renderbuffer);

  public native void framebufferTexture2D(int target, int attachment, int textarget,
      @Nullable WebGLTexture texture, int level);

  public native void frontFace(int mode);

  public native void generateMipmap(int target);

  @Nullable
  public native WebGLActiveInfo getActiveAttrib(@Nonnull WebGLProgram program, int index);

  @Nullable
  public native WebGLActiveInfo getActiveUniform(@Nonnull WebGLProgram program, int index);

  @Nullable
  public native JsArray<WebGLShader> getAttachedShaders(@Nonnull WebGLProgram program);

  public native int getAttribLocation(@Nonnull WebGLProgram program, @Nonnull String name);

  @Nullable
  public native Any getBufferParameter(int target, int pname);

  @Nullable
  public native WebGLContextAttributes getContextAttributes();

  public native int getError();

  @Nullable
  public native Object getExtension(@Nonnull String name);

  @Nullable
  public native Any getFramebufferAttachmentParameter(int target, int attachment, int pname);

  @Nullable
  public native Any getParameter(int pname);

  @Nullable
  public native String getProgramInfoLog(@Nonnull WebGLProgram program);

  @Nullable
  public native Any getProgramParameter(@Nonnull WebGLProgram program, int pname);

  @Nullable
  public native Any getRenderbufferParameter(int target, int pname);

  @Nullable
  public native String getShaderInfoLog(@Nonnull WebGLShader shader);

  @Nullable
  public native Any getShaderParameter(@Nonnull WebGLShader shader, int pname);

  @Nullable
  public native WebGLShaderPrecisionFormat getShaderPrecisionFormat(int shadertype,
      int precisiontype);

  @Nullable
  public native String getShaderSource(@Nonnull WebGLShader shader);

  @Nullable
  public native JsArray<String> getSupportedExtensions();

  @Nullable
  public native Any getTexParameter(int target, int pname);

  @Nullable
  public native Any getUniform(@Nonnull WebGLProgram program,
      @Nonnull WebGLUniformLocation location);

  @Nullable
  public native WebGLUniformLocation getUniformLocation(@Nonnull WebGLProgram program,
      @Nonnull String name);

  @Nullable
  public native Any getVertexAttrib(int index, int pname);

  public native int getVertexAttribOffset(int index, int pname);

  public native void hint(int target, int mode);

  public native boolean isBuffer(@Nullable WebGLBuffer buffer);

  public native boolean isContextLost();

  public native boolean isEnabled(int cap);

  public native boolean isFramebuffer(@Nullable WebGLFramebuffer framebuffer);

  public native boolean isProgram(@Nullable WebGLProgram program);

  public native boolean isRenderbuffer(@Nullable WebGLRenderbuffer renderbuffer);

  public native boolean isShader(@Nullable WebGLShader shader);

  public native boolean isTexture(@Nullable WebGLTexture texture);

  public native void lineWidth(float width);

  public native void linkProgram(@Nonnull WebGLProgram program);

  public native void pixelStorei(int pname, int param);

  public native void polygonOffset(float factor, float units);

  public native void renderbufferStorage(int target, int internalformat, int width, int height);

  public native void sampleCoverage(float value, boolean invert);

  public native void scissor(int x, int y, int width, int height);

  public native void shaderSource(@Nonnull WebGLShader shader, @Nonnull String source);

  public native void stencilFunc(int func, int ref, int mask);

  public native void stencilFuncSeparate(int face, int func, int ref, int mask);

  public native void stencilMask(int mask);

  public native void stencilMaskSeparate(int face, int mask);

  public native void stencilOp(int fail, int zfail, int zpass);

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

  public native void useProgram(@Nullable WebGLProgram program);

  public native void validateProgram(@Nonnull WebGLProgram program);

  public native void vertexAttrib1f(int index, float x);

  public native void vertexAttrib1fv(int index, @Nonnull Float32List values);

  public native void vertexAttrib1fv(int index, @Nonnull Float32Array values);

  public native void vertexAttrib1fv(int index, @Nonnull JsArray<Double> values);

  public native void vertexAttrib1fv(int index, @Nonnull Double[] values);

  public native void vertexAttrib2f(int index, float x, float y);

  public native void vertexAttrib2fv(int index, @Nonnull Float32List values);

  public native void vertexAttrib2fv(int index, @Nonnull Float32Array values);

  public native void vertexAttrib2fv(int index, @Nonnull JsArray<Double> values);

  public native void vertexAttrib2fv(int index, @Nonnull Double[] values);

  public native void vertexAttrib3f(int index, float x, float y, float z);

  public native void vertexAttrib3fv(int index, @Nonnull Float32List values);

  public native void vertexAttrib3fv(int index, @Nonnull Float32Array values);

  public native void vertexAttrib3fv(int index, @Nonnull JsArray<Double> values);

  public native void vertexAttrib3fv(int index, @Nonnull Double[] values);

  public native void vertexAttrib4f(int index, float x, float y, float z, float w);

  public native void vertexAttrib4fv(int index, @Nonnull Float32List values);

  public native void vertexAttrib4fv(int index, @Nonnull Float32Array values);

  public native void vertexAttrib4fv(int index, @Nonnull JsArray<Double> values);

  public native void vertexAttrib4fv(int index, @Nonnull Double[] values);

  public native void vertexAttribPointer(int index, int size, int type, boolean normalized,
      int stride, int offset);

  public native void viewport(int x, int y, int width, int height);

  @Nonnull
  public native Promise<Void> makeXRCompatible();
}
