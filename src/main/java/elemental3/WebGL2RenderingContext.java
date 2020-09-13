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
 * The WebGL2RenderingContext interface provides the OpenGL ES 3.0 rendering context for the drawing surface of an HTML canvas element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext">WebGL2RenderingContext - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WebGL2RenderingContext"
)
public class WebGL2RenderingContext {
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

  @JsOverlay
  public static final int ACTIVE_UNIFORM_BLOCKS = 0x8A36;

  @JsOverlay
  public static final int ALREADY_SIGNALED = 0x911A;

  @JsOverlay
  public static final int ANY_SAMPLES_PASSED = 0x8C2F;

  @JsOverlay
  public static final int ANY_SAMPLES_PASSED_CONSERVATIVE = 0x8D6A;

  @JsOverlay
  public static final int COLOR = 0x1800;

  @JsOverlay
  public static final int COLOR_ATTACHMENT1 = 0x8CE1;

  @JsOverlay
  public static final int COLOR_ATTACHMENT10 = 0x8CEA;

  @JsOverlay
  public static final int COLOR_ATTACHMENT11 = 0x8CEB;

  @JsOverlay
  public static final int COLOR_ATTACHMENT12 = 0x8CEC;

  @JsOverlay
  public static final int COLOR_ATTACHMENT13 = 0x8CED;

  @JsOverlay
  public static final int COLOR_ATTACHMENT14 = 0x8CEE;

  @JsOverlay
  public static final int COLOR_ATTACHMENT15 = 0x8CEF;

  @JsOverlay
  public static final int COLOR_ATTACHMENT2 = 0x8CE2;

  @JsOverlay
  public static final int COLOR_ATTACHMENT3 = 0x8CE3;

  @JsOverlay
  public static final int COLOR_ATTACHMENT4 = 0x8CE4;

  @JsOverlay
  public static final int COLOR_ATTACHMENT5 = 0x8CE5;

  @JsOverlay
  public static final int COLOR_ATTACHMENT6 = 0x8CE6;

  @JsOverlay
  public static final int COLOR_ATTACHMENT7 = 0x8CE7;

  @JsOverlay
  public static final int COLOR_ATTACHMENT8 = 0x8CE8;

  @JsOverlay
  public static final int COLOR_ATTACHMENT9 = 0x8CE9;

  @JsOverlay
  public static final int COMPARE_REF_TO_TEXTURE = 0x884E;

  @JsOverlay
  public static final int CONDITION_SATISFIED = 0x911C;

  @JsOverlay
  public static final int COPY_READ_BUFFER = 0x8F36;

  @JsOverlay
  public static final int COPY_READ_BUFFER_BINDING = 0x8F36;

  @JsOverlay
  public static final int COPY_WRITE_BUFFER = 0x8F37;

  @JsOverlay
  public static final int COPY_WRITE_BUFFER_BINDING = 0x8F37;

  @JsOverlay
  public static final int CURRENT_QUERY = 0x8865;

  @JsOverlay
  public static final int DEPTH = 0x1801;

  @JsOverlay
  public static final int DEPTH24_STENCIL8 = 0x88F0;

  @JsOverlay
  public static final int DEPTH32F_STENCIL8 = 0x8CAD;

  @JsOverlay
  public static final int DEPTH_COMPONENT24 = 0x81A6;

  @JsOverlay
  public static final int DEPTH_COMPONENT32F = 0x8CAC;

  @JsOverlay
  public static final int DRAW_BUFFER0 = 0x8825;

  @JsOverlay
  public static final int DRAW_BUFFER1 = 0x8826;

  @JsOverlay
  public static final int DRAW_BUFFER10 = 0x882F;

  @JsOverlay
  public static final int DRAW_BUFFER11 = 0x8830;

  @JsOverlay
  public static final int DRAW_BUFFER12 = 0x8831;

  @JsOverlay
  public static final int DRAW_BUFFER13 = 0x8832;

  @JsOverlay
  public static final int DRAW_BUFFER14 = 0x8833;

  @JsOverlay
  public static final int DRAW_BUFFER15 = 0x8834;

  @JsOverlay
  public static final int DRAW_BUFFER2 = 0x8827;

  @JsOverlay
  public static final int DRAW_BUFFER3 = 0x8828;

  @JsOverlay
  public static final int DRAW_BUFFER4 = 0x8829;

  @JsOverlay
  public static final int DRAW_BUFFER5 = 0x882A;

  @JsOverlay
  public static final int DRAW_BUFFER6 = 0x882B;

  @JsOverlay
  public static final int DRAW_BUFFER7 = 0x882C;

  @JsOverlay
  public static final int DRAW_BUFFER8 = 0x882D;

  @JsOverlay
  public static final int DRAW_BUFFER9 = 0x882E;

  @JsOverlay
  public static final int DRAW_FRAMEBUFFER = 0x8CA9;

  @JsOverlay
  public static final int DRAW_FRAMEBUFFER_BINDING = 0x8CA6;

  @JsOverlay
  public static final int DYNAMIC_COPY = 0x88EA;

  @JsOverlay
  public static final int DYNAMIC_READ = 0x88E9;

  @JsOverlay
  public static final int FLOAT_32_UNSIGNED_INT_24_8_REV = 0x8DAD;

  @JsOverlay
  public static final int FLOAT_MAT2x3 = 0x8B65;

  @JsOverlay
  public static final int FLOAT_MAT2x4 = 0x8B66;

  @JsOverlay
  public static final int FLOAT_MAT3x2 = 0x8B67;

  @JsOverlay
  public static final int FLOAT_MAT3x4 = 0x8B68;

  @JsOverlay
  public static final int FLOAT_MAT4x2 = 0x8B69;

  @JsOverlay
  public static final int FLOAT_MAT4x3 = 0x8B6A;

  @JsOverlay
  public static final int FRAGMENT_SHADER_DERIVATIVE_HINT = 0x8B8B;

  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE = 0x8215;

  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_BLUE_SIZE = 0x8214;

  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING = 0x8210;

  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE = 0x8211;

  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE = 0x8216;

  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_GREEN_SIZE = 0x8213;

  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_RED_SIZE = 0x8212;

  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = 0x8217;

  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 0x8CD4;

  @JsOverlay
  public static final int FRAMEBUFFER_DEFAULT = 0x8218;

  @JsOverlay
  public static final int FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 0x8D56;

  @JsOverlay
  public static final int HALF_FLOAT = 0x140B;

  @JsOverlay
  public static final int INTERLEAVED_ATTRIBS = 0x8C8C;

  @JsOverlay
  public static final int INT_2_10_10_10_REV = 0x8D9F;

  @JsOverlay
  public static final int INT_SAMPLER_2D = 0x8DCA;

  @JsOverlay
  public static final int INT_SAMPLER_2D_ARRAY = 0x8DCF;

  @JsOverlay
  public static final int INT_SAMPLER_3D = 0x8DCB;

  @JsOverlay
  public static final int INT_SAMPLER_CUBE = 0x8DCC;

  @JsOverlay
  public static final int INVALID_INDEX = 0xFFFFFFFF;

  @JsOverlay
  public static final int MAX = 0x8008;

  @JsOverlay
  public static final int MAX_3D_TEXTURE_SIZE = 0x8073;

  @JsOverlay
  public static final int MAX_ARRAY_TEXTURE_LAYERS = 0x88FF;

  @JsOverlay
  public static final int MAX_CLIENT_WAIT_TIMEOUT_WEBGL = 0x9247;

  @JsOverlay
  public static final int MAX_COLOR_ATTACHMENTS = 0x8CDF;

  @JsOverlay
  public static final int MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 0x8A33;

  @JsOverlay
  public static final int MAX_COMBINED_UNIFORM_BLOCKS = 0x8A2E;

  @JsOverlay
  public static final int MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 0x8A31;

  @JsOverlay
  public static final int MAX_DRAW_BUFFERS = 0x8824;

  @JsOverlay
  public static final int MAX_ELEMENTS_INDICES = 0x80E9;

  @JsOverlay
  public static final int MAX_ELEMENTS_VERTICES = 0x80E8;

  @JsOverlay
  public static final int MAX_ELEMENT_INDEX = 0x8D6B;

  @JsOverlay
  public static final int MAX_FRAGMENT_INPUT_COMPONENTS = 0x9125;

  @JsOverlay
  public static final int MAX_FRAGMENT_UNIFORM_BLOCKS = 0x8A2D;

  @JsOverlay
  public static final int MAX_FRAGMENT_UNIFORM_COMPONENTS = 0x8B49;

  @JsOverlay
  public static final int MAX_PROGRAM_TEXEL_OFFSET = 0x8905;

  @JsOverlay
  public static final int MAX_SAMPLES = 0x8D57;

  @JsOverlay
  public static final int MAX_SERVER_WAIT_TIMEOUT = 0x9111;

  @JsOverlay
  public static final int MAX_TEXTURE_LOD_BIAS = 0x84FD;

  @JsOverlay
  public static final int MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 0x8C8A;

  @JsOverlay
  public static final int MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS = 0x8C8B;

  @JsOverlay
  public static final int MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS = 0x8C80;

  @JsOverlay
  public static final int MAX_UNIFORM_BLOCK_SIZE = 0x8A30;

  @JsOverlay
  public static final int MAX_UNIFORM_BUFFER_BINDINGS = 0x8A2F;

  @JsOverlay
  public static final int MAX_VARYING_COMPONENTS = 0x8B4B;

  @JsOverlay
  public static final int MAX_VERTEX_OUTPUT_COMPONENTS = 0x9122;

  @JsOverlay
  public static final int MAX_VERTEX_UNIFORM_BLOCKS = 0x8A2B;

  @JsOverlay
  public static final int MAX_VERTEX_UNIFORM_COMPONENTS = 0x8B4A;

  @JsOverlay
  public static final int MIN = 0x8007;

  @JsOverlay
  public static final int MIN_PROGRAM_TEXEL_OFFSET = 0x8904;

  @JsOverlay
  public static final int OBJECT_TYPE = 0x9112;

  @JsOverlay
  public static final int PACK_ROW_LENGTH = 0x0D02;

  @JsOverlay
  public static final int PACK_SKIP_PIXELS = 0x0D04;

  @JsOverlay
  public static final int PACK_SKIP_ROWS = 0x0D03;

  @JsOverlay
  public static final int PIXEL_PACK_BUFFER = 0x88EB;

  @JsOverlay
  public static final int PIXEL_PACK_BUFFER_BINDING = 0x88ED;

  @JsOverlay
  public static final int PIXEL_UNPACK_BUFFER = 0x88EC;

  @JsOverlay
  public static final int PIXEL_UNPACK_BUFFER_BINDING = 0x88EF;

  @JsOverlay
  public static final int QUERY_RESULT = 0x8866;

  @JsOverlay
  public static final int QUERY_RESULT_AVAILABLE = 0x8867;

  @JsOverlay
  public static final int R11F_G11F_B10F = 0x8C3A;

  @JsOverlay
  public static final int R16F = 0x822D;

  @JsOverlay
  public static final int R16I = 0x8233;

  @JsOverlay
  public static final int R16UI = 0x8234;

  @JsOverlay
  public static final int R32F = 0x822E;

  @JsOverlay
  public static final int R32I = 0x8235;

  @JsOverlay
  public static final int R32UI = 0x8236;

  @JsOverlay
  public static final int R8 = 0x8229;

  @JsOverlay
  public static final int R8I = 0x8231;

  @JsOverlay
  public static final int R8UI = 0x8232;

  @JsOverlay
  public static final int R8_SNORM = 0x8F94;

  @JsOverlay
  public static final int RASTERIZER_DISCARD = 0x8C89;

  @JsOverlay
  public static final int READ_BUFFER = 0x0C02;

  @JsOverlay
  public static final int READ_FRAMEBUFFER = 0x8CA8;

  @JsOverlay
  public static final int READ_FRAMEBUFFER_BINDING = 0x8CAA;

  @JsOverlay
  public static final int RED = 0x1903;

  @JsOverlay
  public static final int RED_INTEGER = 0x8D94;

  @JsOverlay
  public static final int RENDERBUFFER_SAMPLES = 0x8CAB;

  @JsOverlay
  public static final int RG = 0x8227;

  @JsOverlay
  public static final int RG16F = 0x822F;

  @JsOverlay
  public static final int RG16I = 0x8239;

  @JsOverlay
  public static final int RG16UI = 0x823A;

  @JsOverlay
  public static final int RG32F = 0x8230;

  @JsOverlay
  public static final int RG32I = 0x823B;

  @JsOverlay
  public static final int RG32UI = 0x823C;

  @JsOverlay
  public static final int RG8 = 0x822B;

  @JsOverlay
  public static final int RG8I = 0x8237;

  @JsOverlay
  public static final int RG8UI = 0x8238;

  @JsOverlay
  public static final int RG8_SNORM = 0x8F95;

  @JsOverlay
  public static final int RGB10_A2 = 0x8059;

  @JsOverlay
  public static final int RGB10_A2UI = 0x906F;

  @JsOverlay
  public static final int RGB16F = 0x881B;

  @JsOverlay
  public static final int RGB16I = 0x8D89;

  @JsOverlay
  public static final int RGB16UI = 0x8D77;

  @JsOverlay
  public static final int RGB32F = 0x8815;

  @JsOverlay
  public static final int RGB32I = 0x8D83;

  @JsOverlay
  public static final int RGB32UI = 0x8D71;

  @JsOverlay
  public static final int RGB8 = 0x8051;

  @JsOverlay
  public static final int RGB8I = 0x8D8F;

  @JsOverlay
  public static final int RGB8UI = 0x8D7D;

  @JsOverlay
  public static final int RGB8_SNORM = 0x8F96;

  @JsOverlay
  public static final int RGB9_E5 = 0x8C3D;

  @JsOverlay
  public static final int RGBA16F = 0x881A;

  @JsOverlay
  public static final int RGBA16I = 0x8D88;

  @JsOverlay
  public static final int RGBA16UI = 0x8D76;

  @JsOverlay
  public static final int RGBA32F = 0x8814;

  @JsOverlay
  public static final int RGBA32I = 0x8D82;

  @JsOverlay
  public static final int RGBA32UI = 0x8D70;

  @JsOverlay
  public static final int RGBA8 = 0x8058;

  @JsOverlay
  public static final int RGBA8I = 0x8D8E;

  @JsOverlay
  public static final int RGBA8UI = 0x8D7C;

  @JsOverlay
  public static final int RGBA8_SNORM = 0x8F97;

  @JsOverlay
  public static final int RGBA_INTEGER = 0x8D99;

  @JsOverlay
  public static final int RGB_INTEGER = 0x8D98;

  @JsOverlay
  public static final int RG_INTEGER = 0x8228;

  @JsOverlay
  public static final int SAMPLER_2D_ARRAY = 0x8DC1;

  @JsOverlay
  public static final int SAMPLER_2D_ARRAY_SHADOW = 0x8DC4;

  @JsOverlay
  public static final int SAMPLER_2D_SHADOW = 0x8B62;

  @JsOverlay
  public static final int SAMPLER_3D = 0x8B5F;

  @JsOverlay
  public static final int SAMPLER_BINDING = 0x8919;

  @JsOverlay
  public static final int SAMPLER_CUBE_SHADOW = 0x8DC5;

  @JsOverlay
  public static final int SEPARATE_ATTRIBS = 0x8C8D;

  @JsOverlay
  public static final int SIGNALED = 0x9119;

  @JsOverlay
  public static final int SIGNED_NORMALIZED = 0x8F9C;

  @JsOverlay
  public static final int SRGB = 0x8C40;

  @JsOverlay
  public static final int SRGB8 = 0x8C41;

  @JsOverlay
  public static final int SRGB8_ALPHA8 = 0x8C43;

  @JsOverlay
  public static final int STATIC_COPY = 0x88E6;

  @JsOverlay
  public static final int STATIC_READ = 0x88E5;

  @JsOverlay
  public static final int STENCIL = 0x1802;

  @JsOverlay
  public static final int STREAM_COPY = 0x88E2;

  @JsOverlay
  public static final int STREAM_READ = 0x88E1;

  @JsOverlay
  public static final int SYNC_CONDITION = 0x9113;

  @JsOverlay
  public static final int SYNC_FENCE = 0x9116;

  @JsOverlay
  public static final int SYNC_FLAGS = 0x9115;

  @JsOverlay
  public static final int SYNC_FLUSH_COMMANDS_BIT = 0x00000001;

  @JsOverlay
  public static final int SYNC_GPU_COMMANDS_COMPLETE = 0x9117;

  @JsOverlay
  public static final int SYNC_STATUS = 0x9114;

  @JsOverlay
  public static final int TEXTURE_2D_ARRAY = 0x8C1A;

  @JsOverlay
  public static final int TEXTURE_3D = 0x806F;

  @JsOverlay
  public static final int TEXTURE_BASE_LEVEL = 0x813C;

  @JsOverlay
  public static final int TEXTURE_BINDING_2D_ARRAY = 0x8C1D;

  @JsOverlay
  public static final int TEXTURE_BINDING_3D = 0x806A;

  @JsOverlay
  public static final int TEXTURE_COMPARE_FUNC = 0x884D;

  @JsOverlay
  public static final int TEXTURE_COMPARE_MODE = 0x884C;

  @JsOverlay
  public static final int TEXTURE_IMMUTABLE_FORMAT = 0x912F;

  @JsOverlay
  public static final int TEXTURE_IMMUTABLE_LEVELS = 0x82DF;

  @JsOverlay
  public static final int TEXTURE_MAX_LEVEL = 0x813D;

  @JsOverlay
  public static final int TEXTURE_MAX_LOD = 0x813B;

  @JsOverlay
  public static final int TEXTURE_MIN_LOD = 0x813A;

  @JsOverlay
  public static final int TEXTURE_WRAP_R = 0x8072;

  @JsOverlay
  public static final int TIMEOUT_EXPIRED = 0x911B;

  @JsOverlay
  public static final int TIMEOUT_IGNORED = -1;

  @JsOverlay
  public static final int TRANSFORM_FEEDBACK = 0x8E22;

  @JsOverlay
  public static final int TRANSFORM_FEEDBACK_ACTIVE = 0x8E24;

  @JsOverlay
  public static final int TRANSFORM_FEEDBACK_BINDING = 0x8E25;

  @JsOverlay
  public static final int TRANSFORM_FEEDBACK_BUFFER = 0x8C8E;

  @JsOverlay
  public static final int TRANSFORM_FEEDBACK_BUFFER_BINDING = 0x8C8F;

  @JsOverlay
  public static final int TRANSFORM_FEEDBACK_BUFFER_MODE = 0x8C7F;

  @JsOverlay
  public static final int TRANSFORM_FEEDBACK_BUFFER_SIZE = 0x8C85;

  @JsOverlay
  public static final int TRANSFORM_FEEDBACK_BUFFER_START = 0x8C84;

  @JsOverlay
  public static final int TRANSFORM_FEEDBACK_PAUSED = 0x8E23;

  @JsOverlay
  public static final int TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 0x8C88;

  @JsOverlay
  public static final int TRANSFORM_FEEDBACK_VARYINGS = 0x8C83;

  @JsOverlay
  public static final int UNIFORM_ARRAY_STRIDE = 0x8A3C;

  @JsOverlay
  public static final int UNIFORM_BLOCK_ACTIVE_UNIFORMS = 0x8A42;

  @JsOverlay
  public static final int UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = 0x8A43;

  @JsOverlay
  public static final int UNIFORM_BLOCK_BINDING = 0x8A3F;

  @JsOverlay
  public static final int UNIFORM_BLOCK_DATA_SIZE = 0x8A40;

  @JsOverlay
  public static final int UNIFORM_BLOCK_INDEX = 0x8A3A;

  @JsOverlay
  public static final int UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 0x8A46;

  @JsOverlay
  public static final int UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = 0x8A44;

  @JsOverlay
  public static final int UNIFORM_BUFFER = 0x8A11;

  @JsOverlay
  public static final int UNIFORM_BUFFER_BINDING = 0x8A28;

  @JsOverlay
  public static final int UNIFORM_BUFFER_OFFSET_ALIGNMENT = 0x8A34;

  @JsOverlay
  public static final int UNIFORM_BUFFER_SIZE = 0x8A2A;

  @JsOverlay
  public static final int UNIFORM_BUFFER_START = 0x8A29;

  @JsOverlay
  public static final int UNIFORM_IS_ROW_MAJOR = 0x8A3E;

  @JsOverlay
  public static final int UNIFORM_MATRIX_STRIDE = 0x8A3D;

  @JsOverlay
  public static final int UNIFORM_OFFSET = 0x8A3B;

  @JsOverlay
  public static final int UNIFORM_SIZE = 0x8A38;

  @JsOverlay
  public static final int UNIFORM_TYPE = 0x8A37;

  @JsOverlay
  public static final int UNPACK_IMAGE_HEIGHT = 0x806E;

  @JsOverlay
  public static final int UNPACK_ROW_LENGTH = 0x0CF2;

  @JsOverlay
  public static final int UNPACK_SKIP_IMAGES = 0x806D;

  @JsOverlay
  public static final int UNPACK_SKIP_PIXELS = 0x0CF4;

  @JsOverlay
  public static final int UNPACK_SKIP_ROWS = 0x0CF3;

  @JsOverlay
  public static final int UNSIGNALED = 0x9118;

  @JsOverlay
  public static final int UNSIGNED_INT_10F_11F_11F_REV = 0x8C3B;

  @JsOverlay
  public static final int UNSIGNED_INT_24_8 = 0x84FA;

  @JsOverlay
  public static final int UNSIGNED_INT_2_10_10_10_REV = 0x8368;

  @JsOverlay
  public static final int UNSIGNED_INT_5_9_9_9_REV = 0x8C3E;

  @JsOverlay
  public static final int UNSIGNED_INT_SAMPLER_2D = 0x8DD2;

  @JsOverlay
  public static final int UNSIGNED_INT_SAMPLER_2D_ARRAY = 0x8DD7;

  @JsOverlay
  public static final int UNSIGNED_INT_SAMPLER_3D = 0x8DD3;

  @JsOverlay
  public static final int UNSIGNED_INT_SAMPLER_CUBE = 0x8DD4;

  @JsOverlay
  public static final int UNSIGNED_INT_VEC2 = 0x8DC6;

  @JsOverlay
  public static final int UNSIGNED_INT_VEC3 = 0x8DC7;

  @JsOverlay
  public static final int UNSIGNED_INT_VEC4 = 0x8DC8;

  @JsOverlay
  public static final int UNSIGNED_NORMALIZED = 0x8C17;

  @JsOverlay
  public static final int VERTEX_ARRAY_BINDING = 0x85B5;

  @JsOverlay
  public static final int VERTEX_ATTRIB_ARRAY_DIVISOR = 0x88FE;

  @JsOverlay
  public static final int VERTEX_ATTRIB_ARRAY_INTEGER = 0x88FD;

  @JsOverlay
  public static final int WAIT_FAILED = 0x911D;

  WebGL2RenderingContext() {
  }

  @JsProperty(
      name = "drawingBufferHeight"
  )
  public native int drawingBufferHeight();

  @JsProperty(
      name = "drawingBufferWidth"
  )
  public native int drawingBufferWidth();

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

  public native void bufferData(int target, int size, int usage);

  public native void bufferData(int target, @Nullable BufferSource srcData, int usage);

  public native void bufferData(int target, @Nonnull ArrayBufferView srcData, int usage);

  public native void bufferData(int target, @Nonnull Int8Array srcData, int usage);

  public native void bufferData(int target, @Nonnull Int16Array srcData, int usage);

  public native void bufferData(int target, @Nonnull Int32Array srcData, int usage);

  public native void bufferData(int target, @Nonnull Uint8Array srcData, int usage);

  public native void bufferData(int target, @Nonnull Uint16Array srcData, int usage);

  public native void bufferData(int target, @Nonnull Uint32Array srcData, int usage);

  public native void bufferData(int target, @Nonnull Uint8ClampedArray srcData, int usage);

  public native void bufferData(int target, @Nonnull Float32Array srcData, int usage);

  public native void bufferData(int target, @Nonnull Float64Array srcData, int usage);

  public native void bufferData(int target, @Nonnull DataView srcData, int usage);

  public native void bufferData(int target, @Nonnull ArrayBuffer srcData, int usage);

  public native void bufferData(int target, @Nonnull ArrayBufferView srcData, int usage,
      int srcOffset, int length);

  public native void bufferData(int target, @Nonnull Int8Array srcData, int usage, int srcOffset,
      int length);

  public native void bufferData(int target, @Nonnull Int16Array srcData, int usage, int srcOffset,
      int length);

  public native void bufferData(int target, @Nonnull Int32Array srcData, int usage, int srcOffset,
      int length);

  public native void bufferData(int target, @Nonnull Uint8Array srcData, int usage, int srcOffset,
      int length);

  public native void bufferData(int target, @Nonnull Uint16Array srcData, int usage, int srcOffset,
      int length);

  public native void bufferData(int target, @Nonnull Uint32Array srcData, int usage, int srcOffset,
      int length);

  public native void bufferData(int target, @Nonnull Uint8ClampedArray srcData, int usage,
      int srcOffset, int length);

  public native void bufferData(int target, @Nonnull Float32Array srcData, int usage, int srcOffset,
      int length);

  public native void bufferData(int target, @Nonnull Float64Array srcData, int usage, int srcOffset,
      int length);

  public native void bufferData(int target, @Nonnull DataView srcData, int usage, int srcOffset,
      int length);

  public native void bufferData(int target, @Nonnull ArrayBufferView srcData, int usage,
      int srcOffset);

  public native void bufferData(int target, @Nonnull Int8Array srcData, int usage, int srcOffset);

  public native void bufferData(int target, @Nonnull Int16Array srcData, int usage, int srcOffset);

  public native void bufferData(int target, @Nonnull Int32Array srcData, int usage, int srcOffset);

  public native void bufferData(int target, @Nonnull Uint8Array srcData, int usage, int srcOffset);

  public native void bufferData(int target, @Nonnull Uint16Array srcData, int usage, int srcOffset);

  public native void bufferData(int target, @Nonnull Uint32Array srcData, int usage, int srcOffset);

  public native void bufferData(int target, @Nonnull Uint8ClampedArray srcData, int usage,
      int srcOffset);

  public native void bufferData(int target, @Nonnull Float32Array srcData, int usage,
      int srcOffset);

  public native void bufferData(int target, @Nonnull Float64Array srcData, int usage,
      int srcOffset);

  public native void bufferData(int target, @Nonnull DataView srcData, int usage, int srcOffset);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull BufferSource srcData);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull ArrayBufferView srcData);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Int8Array srcData);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Int16Array srcData);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Int32Array srcData);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Uint8Array srcData);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Uint16Array srcData);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Uint32Array srcData);

  public native void bufferSubData(int target, int dstByteOffset,
      @Nonnull Uint8ClampedArray srcData);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Float32Array srcData);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Float64Array srcData);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull DataView srcData);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull ArrayBuffer srcData);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull ArrayBufferView srcData,
      int srcOffset, int length);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Int8Array srcData,
      int srcOffset, int length);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Int16Array srcData,
      int srcOffset, int length);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Int32Array srcData,
      int srcOffset, int length);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Uint8Array srcData,
      int srcOffset, int length);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Uint16Array srcData,
      int srcOffset, int length);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Uint32Array srcData,
      int srcOffset, int length);

  public native void bufferSubData(int target, int dstByteOffset,
      @Nonnull Uint8ClampedArray srcData, int srcOffset, int length);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Float32Array srcData,
      int srcOffset, int length);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Float64Array srcData,
      int srcOffset, int length);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull DataView srcData,
      int srcOffset, int length);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull ArrayBufferView srcData,
      int srcOffset);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Int8Array srcData,
      int srcOffset);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Int16Array srcData,
      int srcOffset);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Int32Array srcData,
      int srcOffset);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Uint8Array srcData,
      int srcOffset);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Uint16Array srcData,
      int srcOffset);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Uint32Array srcData,
      int srcOffset);

  public native void bufferSubData(int target, int dstByteOffset,
      @Nonnull Uint8ClampedArray srcData, int srcOffset);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Float32Array srcData,
      int srcOffset);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Float64Array srcData,
      int srcOffset);

  public native void bufferSubData(int target, int dstByteOffset, @Nonnull DataView srcData,
      int srcOffset);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, int imageSize, int offset);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull ArrayBufferView srcData, int srcOffset,
      int srcLengthOverride);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Int8Array srcData, int srcOffset, int srcLengthOverride);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Int16Array srcData, int srcOffset, int srcLengthOverride);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Int32Array srcData, int srcOffset, int srcLengthOverride);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Uint8Array srcData, int srcOffset, int srcLengthOverride);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Uint16Array srcData, int srcOffset, int srcLengthOverride);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Uint32Array srcData, int srcOffset, int srcLengthOverride);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Uint8ClampedArray srcData, int srcOffset,
      int srcLengthOverride);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Float32Array srcData, int srcOffset, int srcLengthOverride);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Float64Array srcData, int srcOffset, int srcLengthOverride);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull DataView srcData, int srcOffset, int srcLengthOverride);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull ArrayBufferView srcData, int srcOffset);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Int8Array srcData, int srcOffset);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Int16Array srcData, int srcOffset);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Int32Array srcData, int srcOffset);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Uint8Array srcData, int srcOffset);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Uint16Array srcData, int srcOffset);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Uint32Array srcData, int srcOffset);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Uint8ClampedArray srcData, int srcOffset);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Float32Array srcData, int srcOffset);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Float64Array srcData, int srcOffset);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull DataView srcData, int srcOffset);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull ArrayBufferView srcData);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Int8Array srcData);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Int16Array srcData);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Int32Array srcData);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Uint8Array srcData);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Uint16Array srcData);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Uint32Array srcData);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Uint8ClampedArray srcData);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Float32Array srcData);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull Float64Array srcData);

  public native void compressedTexImage2D(int target, int level, int internalformat, int width,
      int height, int border, @Nonnull DataView srcData);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, int imageSize, int offset);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull ArrayBufferView srcData, int srcOffset,
      int srcLengthOverride);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Int8Array srcData, int srcOffset,
      int srcLengthOverride);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Int16Array srcData, int srcOffset,
      int srcLengthOverride);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Int32Array srcData, int srcOffset,
      int srcLengthOverride);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint8Array srcData, int srcOffset,
      int srcLengthOverride);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint16Array srcData, int srcOffset,
      int srcLengthOverride);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint32Array srcData, int srcOffset,
      int srcLengthOverride);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint8ClampedArray srcData, int srcOffset,
      int srcLengthOverride);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Float32Array srcData, int srcOffset,
      int srcLengthOverride);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Float64Array srcData, int srcOffset,
      int srcLengthOverride);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull DataView srcData, int srcOffset,
      int srcLengthOverride);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull ArrayBufferView srcData, int srcOffset);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Int8Array srcData, int srcOffset);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Int16Array srcData, int srcOffset);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Int32Array srcData, int srcOffset);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint8Array srcData, int srcOffset);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint16Array srcData, int srcOffset);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint32Array srcData, int srcOffset);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint8ClampedArray srcData, int srcOffset);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Float32Array srcData, int srcOffset);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Float64Array srcData, int srcOffset);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull DataView srcData, int srcOffset);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull ArrayBufferView srcData);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Int8Array srcData);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Int16Array srcData);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Int32Array srcData);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint8Array srcData);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint16Array srcData);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint32Array srcData);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint8ClampedArray srcData);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Float32Array srcData);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Float64Array srcData);

  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull DataView srcData);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nullable ArrayBufferView dstData);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Int8Array dstData);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Int16Array dstData);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Int32Array dstData);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Uint8Array dstData);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Uint16Array dstData);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Uint32Array dstData);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Uint8ClampedArray dstData);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Float32Array dstData);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Float64Array dstData);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull DataView dstData);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      int offset);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull ArrayBufferView dstData, int dstOffset);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Int8Array dstData, int dstOffset);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Int16Array dstData, int dstOffset);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Int32Array dstData, int dstOffset);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Uint8Array dstData, int dstOffset);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Uint16Array dstData, int dstOffset);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Uint32Array dstData, int dstOffset);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Uint8ClampedArray dstData, int dstOffset);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Float32Array dstData, int dstOffset);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Float64Array dstData, int dstOffset);

  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull DataView dstData, int dstOffset);

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

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, int pboOffset);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull TexImageSource source);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull ImageBitmap source);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull ImageData source);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull HTMLImageElement source);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull HTMLCanvasElement source);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull HTMLVideoElement source);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull OffscreenCanvas source);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull ArrayBufferView srcData, int srcOffset);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Int8Array srcData, int srcOffset);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Int16Array srcData, int srcOffset);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Int32Array srcData, int srcOffset);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Uint8Array srcData, int srcOffset);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Uint16Array srcData, int srcOffset);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Uint32Array srcData, int srcOffset);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Uint8ClampedArray srcData, int srcOffset);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Float32Array srcData, int srcOffset);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Float64Array srcData, int srcOffset);

  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull DataView srcData, int srcOffset);

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

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, int pboOffset);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull TexImageSource source);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull ImageBitmap source);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull ImageData source);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull HTMLImageElement source);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull HTMLCanvasElement source);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull HTMLVideoElement source);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull OffscreenCanvas source);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull ArrayBufferView srcData, int srcOffset);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Int8Array srcData, int srcOffset);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Int16Array srcData, int srcOffset);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Int32Array srcData, int srcOffset);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Uint8Array srcData, int srcOffset);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Uint16Array srcData, int srcOffset);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Uint32Array srcData, int srcOffset);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Uint8ClampedArray srcData, int srcOffset);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Float32Array srcData, int srcOffset);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Float64Array srcData, int srcOffset);

  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull DataView srcData, int srcOffset);

  public native void uniform1fv(@Nullable WebGLUniformLocation location, @Nonnull Float32List data,
      int srcOffset, int srcLength);

  public native void uniform1fv(@Nullable WebGLUniformLocation location, @Nonnull Float32Array data,
      int srcOffset, int srcLength);

  public native void uniform1fv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data, int srcOffset, int srcLength);

  public native void uniform1fv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data,
      int srcOffset, int srcLength);

  public native void uniform1fv(@Nullable WebGLUniformLocation location, @Nonnull Float32List data,
      int srcOffset);

  public native void uniform1fv(@Nullable WebGLUniformLocation location, @Nonnull Float32Array data,
      int srcOffset);

  public native void uniform1fv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data, int srcOffset);

  public native void uniform1fv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data,
      int srcOffset);

  public native void uniform1fv(@Nullable WebGLUniformLocation location, @Nonnull Float32List data);

  public native void uniform1fv(@Nullable WebGLUniformLocation location,
      @Nonnull Float32Array data);

  public native void uniform1fv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data);

  public native void uniform1fv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data);

  public native void uniform1iv(@Nullable WebGLUniformLocation location, @Nonnull Int32List data,
      int srcOffset, int srcLength);

  public native void uniform1iv(@Nullable WebGLUniformLocation location, @Nonnull Int32Array data,
      int srcOffset, int srcLength);

  public native void uniform1iv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data, int srcOffset, int srcLength);

  public native void uniform1iv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data,
      int srcOffset, int srcLength);

  public native void uniform1iv(@Nullable WebGLUniformLocation location, @Nonnull Int32List data,
      int srcOffset);

  public native void uniform1iv(@Nullable WebGLUniformLocation location, @Nonnull Int32Array data,
      int srcOffset);

  public native void uniform1iv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data, int srcOffset);

  public native void uniform1iv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data,
      int srcOffset);

  public native void uniform1iv(@Nullable WebGLUniformLocation location, @Nonnull Int32List data);

  public native void uniform1iv(@Nullable WebGLUniformLocation location, @Nonnull Int32Array data);

  public native void uniform1iv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data);

  public native void uniform1iv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data);

  public native void uniform2fv(@Nullable WebGLUniformLocation location, @Nonnull Float32List data,
      int srcOffset, int srcLength);

  public native void uniform2fv(@Nullable WebGLUniformLocation location, @Nonnull Float32Array data,
      int srcOffset, int srcLength);

  public native void uniform2fv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data, int srcOffset, int srcLength);

  public native void uniform2fv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data,
      int srcOffset, int srcLength);

  public native void uniform2fv(@Nullable WebGLUniformLocation location, @Nonnull Float32List data,
      int srcOffset);

  public native void uniform2fv(@Nullable WebGLUniformLocation location, @Nonnull Float32Array data,
      int srcOffset);

  public native void uniform2fv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data, int srcOffset);

  public native void uniform2fv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data,
      int srcOffset);

  public native void uniform2fv(@Nullable WebGLUniformLocation location, @Nonnull Float32List data);

  public native void uniform2fv(@Nullable WebGLUniformLocation location,
      @Nonnull Float32Array data);

  public native void uniform2fv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data);

  public native void uniform2fv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data);

  public native void uniform2iv(@Nullable WebGLUniformLocation location, @Nonnull Int32List data,
      int srcOffset, int srcLength);

  public native void uniform2iv(@Nullable WebGLUniformLocation location, @Nonnull Int32Array data,
      int srcOffset, int srcLength);

  public native void uniform2iv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data, int srcOffset, int srcLength);

  public native void uniform2iv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data,
      int srcOffset, int srcLength);

  public native void uniform2iv(@Nullable WebGLUniformLocation location, @Nonnull Int32List data,
      int srcOffset);

  public native void uniform2iv(@Nullable WebGLUniformLocation location, @Nonnull Int32Array data,
      int srcOffset);

  public native void uniform2iv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data, int srcOffset);

  public native void uniform2iv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data,
      int srcOffset);

  public native void uniform2iv(@Nullable WebGLUniformLocation location, @Nonnull Int32List data);

  public native void uniform2iv(@Nullable WebGLUniformLocation location, @Nonnull Int32Array data);

  public native void uniform2iv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data);

  public native void uniform2iv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data);

  public native void uniform3fv(@Nullable WebGLUniformLocation location, @Nonnull Float32List data,
      int srcOffset, int srcLength);

  public native void uniform3fv(@Nullable WebGLUniformLocation location, @Nonnull Float32Array data,
      int srcOffset, int srcLength);

  public native void uniform3fv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data, int srcOffset, int srcLength);

  public native void uniform3fv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data,
      int srcOffset, int srcLength);

  public native void uniform3fv(@Nullable WebGLUniformLocation location, @Nonnull Float32List data,
      int srcOffset);

  public native void uniform3fv(@Nullable WebGLUniformLocation location, @Nonnull Float32Array data,
      int srcOffset);

  public native void uniform3fv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data, int srcOffset);

  public native void uniform3fv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data,
      int srcOffset);

  public native void uniform3fv(@Nullable WebGLUniformLocation location, @Nonnull Float32List data);

  public native void uniform3fv(@Nullable WebGLUniformLocation location,
      @Nonnull Float32Array data);

  public native void uniform3fv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data);

  public native void uniform3fv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data);

  public native void uniform3iv(@Nullable WebGLUniformLocation location, @Nonnull Int32List data,
      int srcOffset, int srcLength);

  public native void uniform3iv(@Nullable WebGLUniformLocation location, @Nonnull Int32Array data,
      int srcOffset, int srcLength);

  public native void uniform3iv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data, int srcOffset, int srcLength);

  public native void uniform3iv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data,
      int srcOffset, int srcLength);

  public native void uniform3iv(@Nullable WebGLUniformLocation location, @Nonnull Int32List data,
      int srcOffset);

  public native void uniform3iv(@Nullable WebGLUniformLocation location, @Nonnull Int32Array data,
      int srcOffset);

  public native void uniform3iv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data, int srcOffset);

  public native void uniform3iv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data,
      int srcOffset);

  public native void uniform3iv(@Nullable WebGLUniformLocation location, @Nonnull Int32List data);

  public native void uniform3iv(@Nullable WebGLUniformLocation location, @Nonnull Int32Array data);

  public native void uniform3iv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data);

  public native void uniform3iv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data);

  public native void uniform4fv(@Nullable WebGLUniformLocation location, @Nonnull Float32List data,
      int srcOffset, int srcLength);

  public native void uniform4fv(@Nullable WebGLUniformLocation location, @Nonnull Float32Array data,
      int srcOffset, int srcLength);

  public native void uniform4fv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data, int srcOffset, int srcLength);

  public native void uniform4fv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data,
      int srcOffset, int srcLength);

  public native void uniform4fv(@Nullable WebGLUniformLocation location, @Nonnull Float32List data,
      int srcOffset);

  public native void uniform4fv(@Nullable WebGLUniformLocation location, @Nonnull Float32Array data,
      int srcOffset);

  public native void uniform4fv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data, int srcOffset);

  public native void uniform4fv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data,
      int srcOffset);

  public native void uniform4fv(@Nullable WebGLUniformLocation location, @Nonnull Float32List data);

  public native void uniform4fv(@Nullable WebGLUniformLocation location,
      @Nonnull Float32Array data);

  public native void uniform4fv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data);

  public native void uniform4fv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data);

  public native void uniform4iv(@Nullable WebGLUniformLocation location, @Nonnull Int32List data,
      int srcOffset, int srcLength);

  public native void uniform4iv(@Nullable WebGLUniformLocation location, @Nonnull Int32Array data,
      int srcOffset, int srcLength);

  public native void uniform4iv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data, int srcOffset, int srcLength);

  public native void uniform4iv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data,
      int srcOffset, int srcLength);

  public native void uniform4iv(@Nullable WebGLUniformLocation location, @Nonnull Int32List data,
      int srcOffset);

  public native void uniform4iv(@Nullable WebGLUniformLocation location, @Nonnull Int32Array data,
      int srcOffset);

  public native void uniform4iv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data, int srcOffset);

  public native void uniform4iv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data,
      int srcOffset);

  public native void uniform4iv(@Nullable WebGLUniformLocation location, @Nonnull Int32List data);

  public native void uniform4iv(@Nullable WebGLUniformLocation location, @Nonnull Int32Array data);

  public native void uniform4iv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data);

  public native void uniform4iv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data);

  public native void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data, int srcOffset, int srcLength);

  public native void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data, int srcOffset, int srcLength);

  public native void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data, int srcOffset, int srcLength);

  public native void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data, int srcOffset, int srcLength);

  public native void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data, int srcOffset);

  public native void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data, int srcOffset);

  public native void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data, int srcOffset);

  public native void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data, int srcOffset);

  public native void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data);

  public native void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data);

  public native void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data);

  public native void uniformMatrix2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data);

  public native void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data, int srcOffset, int srcLength);

  public native void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data, int srcOffset, int srcLength);

  public native void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data, int srcOffset, int srcLength);

  public native void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data, int srcOffset, int srcLength);

  public native void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data, int srcOffset);

  public native void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data, int srcOffset);

  public native void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data, int srcOffset);

  public native void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data, int srcOffset);

  public native void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data);

  public native void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data);

  public native void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data);

  public native void uniformMatrix3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data);

  public native void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data, int srcOffset, int srcLength);

  public native void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data, int srcOffset, int srcLength);

  public native void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data, int srcOffset, int srcLength);

  public native void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data, int srcOffset, int srcLength);

  public native void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data, int srcOffset);

  public native void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data, int srcOffset);

  public native void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data, int srcOffset);

  public native void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data, int srcOffset);

  public native void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data);

  public native void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data);

  public native void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data);

  public native void uniformMatrix4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data);

  public native void beginQuery(int target, @Nonnull WebGLQuery query);

  public native void beginTransformFeedback(int primitiveMode);

  public native void bindBufferBase(int target, int index, @Nullable WebGLBuffer buffer);

  public native void bindBufferRange(int target, int index, @Nullable WebGLBuffer buffer,
      int offset, int size);

  public native void bindSampler(int unit, @Nullable WebGLSampler sampler);

  public native void bindTransformFeedback(int target, @Nullable WebGLTransformFeedback tf);

  public native void bindVertexArray(@Nullable WebGLVertexArrayObject array);

  public native void blitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0,
      int dstY0, int dstX1, int dstY1, int mask, int filter);

  public native void clearBufferfi(int buffer, int drawbuffer, float depth, int stencil);

  public native void clearBufferfv(int buffer, int drawbuffer, @Nonnull Float32List values,
      int srcOffset);

  public native void clearBufferfv(int buffer, int drawbuffer, @Nonnull Float32Array values,
      int srcOffset);

  public native void clearBufferfv(int buffer, int drawbuffer, @Nonnull JsArray<Double> values,
      int srcOffset);

  public native void clearBufferfv(int buffer, int drawbuffer, @Nonnull Double[] values,
      int srcOffset);

  public native void clearBufferfv(int buffer, int drawbuffer, @Nonnull Float32List values);

  public native void clearBufferfv(int buffer, int drawbuffer, @Nonnull Float32Array values);

  public native void clearBufferfv(int buffer, int drawbuffer, @Nonnull JsArray<Double> values);

  public native void clearBufferfv(int buffer, int drawbuffer, @Nonnull Double[] values);

  public native void clearBufferiv(int buffer, int drawbuffer, @Nonnull Int32List values,
      int srcOffset);

  public native void clearBufferiv(int buffer, int drawbuffer, @Nonnull Int32Array values,
      int srcOffset);

  public native void clearBufferiv(int buffer, int drawbuffer, @Nonnull JsArray<Double> values,
      int srcOffset);

  public native void clearBufferiv(int buffer, int drawbuffer, @Nonnull Double[] values,
      int srcOffset);

  public native void clearBufferiv(int buffer, int drawbuffer, @Nonnull Int32List values);

  public native void clearBufferiv(int buffer, int drawbuffer, @Nonnull Int32Array values);

  public native void clearBufferiv(int buffer, int drawbuffer, @Nonnull JsArray<Double> values);

  public native void clearBufferiv(int buffer, int drawbuffer, @Nonnull Double[] values);

  public native void clearBufferuiv(int buffer, int drawbuffer, @Nonnull Uint32List values,
      int srcOffset);

  public native void clearBufferuiv(int buffer, int drawbuffer, @Nonnull Uint32Array values,
      int srcOffset);

  public native void clearBufferuiv(int buffer, int drawbuffer, @Nonnull JsArray<Double> values,
      int srcOffset);

  public native void clearBufferuiv(int buffer, int drawbuffer, @Nonnull Double[] values,
      int srcOffset);

  public native void clearBufferuiv(int buffer, int drawbuffer, @Nonnull Uint32List values);

  public native void clearBufferuiv(int buffer, int drawbuffer, @Nonnull Uint32Array values);

  public native void clearBufferuiv(int buffer, int drawbuffer, @Nonnull JsArray<Double> values);

  public native void clearBufferuiv(int buffer, int drawbuffer, @Nonnull Double[] values);

  public native int clientWaitSync(@Nonnull WebGLSync sync, int flags, int timeout);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, int imageSize, int offset);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull ArrayBufferView srcData, int srcOffset,
      int srcLengthOverride);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Int8Array srcData, int srcOffset,
      int srcLengthOverride);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Int16Array srcData, int srcOffset,
      int srcLengthOverride);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Int32Array srcData, int srcOffset,
      int srcLengthOverride);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Uint8Array srcData, int srcOffset,
      int srcLengthOverride);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Uint16Array srcData, int srcOffset,
      int srcLengthOverride);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Uint32Array srcData, int srcOffset,
      int srcLengthOverride);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Uint8ClampedArray srcData, int srcOffset,
      int srcLengthOverride);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Float32Array srcData, int srcOffset,
      int srcLengthOverride);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Float64Array srcData, int srcOffset,
      int srcLengthOverride);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull DataView srcData, int srcOffset,
      int srcLengthOverride);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull ArrayBufferView srcData, int srcOffset);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Int8Array srcData, int srcOffset);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Int16Array srcData, int srcOffset);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Int32Array srcData, int srcOffset);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Uint8Array srcData, int srcOffset);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Uint16Array srcData, int srcOffset);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Uint32Array srcData, int srcOffset);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Uint8ClampedArray srcData, int srcOffset);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Float32Array srcData, int srcOffset);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Float64Array srcData, int srcOffset);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull DataView srcData, int srcOffset);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull ArrayBufferView srcData);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Int8Array srcData);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Int16Array srcData);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Int32Array srcData);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Uint8Array srcData);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Uint16Array srcData);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Uint32Array srcData);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Uint8ClampedArray srcData);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Float32Array srcData);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull Float64Array srcData);

  public native void compressedTexImage3D(int target, int level, int internalformat, int width,
      int height, int depth, int border, @Nonnull DataView srcData);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, int imageSize, int offset);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull ArrayBufferView srcData,
      int srcOffset, int srcLengthOverride);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Int8Array srcData,
      int srcOffset, int srcLengthOverride);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Int16Array srcData,
      int srcOffset, int srcLengthOverride);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Int32Array srcData,
      int srcOffset, int srcLengthOverride);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Uint8Array srcData,
      int srcOffset, int srcLengthOverride);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Uint16Array srcData,
      int srcOffset, int srcLengthOverride);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Uint32Array srcData,
      int srcOffset, int srcLengthOverride);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Uint8ClampedArray srcData,
      int srcOffset, int srcLengthOverride);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Float32Array srcData,
      int srcOffset, int srcLengthOverride);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Float64Array srcData,
      int srcOffset, int srcLengthOverride);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull DataView srcData,
      int srcOffset, int srcLengthOverride);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull ArrayBufferView srcData,
      int srcOffset);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Int8Array srcData,
      int srcOffset);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Int16Array srcData,
      int srcOffset);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Int32Array srcData,
      int srcOffset);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Uint8Array srcData,
      int srcOffset);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Uint16Array srcData,
      int srcOffset);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Uint32Array srcData,
      int srcOffset);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Uint8ClampedArray srcData,
      int srcOffset);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Float32Array srcData,
      int srcOffset);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Float64Array srcData,
      int srcOffset);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull DataView srcData,
      int srcOffset);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull ArrayBufferView srcData);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Int8Array srcData);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Int16Array srcData);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Int32Array srcData);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Uint8Array srcData);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Uint16Array srcData);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Uint32Array srcData);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format,
      @Nonnull Uint8ClampedArray srcData);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Float32Array srcData);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Float64Array srcData);

  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull DataView srcData);

  public native void copyBufferSubData(int readTarget, int writeTarget, int readOffset,
      int writeOffset, int size);

  public native void copyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int x, int y, int width, int height);

  @Nullable
  public native WebGLQuery createQuery();

  @Nullable
  public native WebGLSampler createSampler();

  @Nullable
  public native WebGLTransformFeedback createTransformFeedback();

  @Nullable
  public native WebGLVertexArrayObject createVertexArray();

  public native void deleteQuery(@Nullable WebGLQuery query);

  public native void deleteSampler(@Nullable WebGLSampler sampler);

  public native void deleteSync(@Nullable WebGLSync sync);

  public native void deleteTransformFeedback(@Nullable WebGLTransformFeedback tf);

  public native void deleteVertexArray(@Nullable WebGLVertexArrayObject vertexArray);

  public native void drawArraysInstanced(int mode, int first, int count, int instanceCount);

  public native void drawBuffers(@Nonnull JsArray<Double> buffers);

  public native void drawBuffers(@Nonnull Double[] buffers);

  public native void drawElementsInstanced(int mode, int count, int type, int offset,
      int instanceCount);

  public native void drawRangeElements(int mode, int start, int end, int count, int type,
      int offset);

  public native void endQuery(int target);

  public native void endTransformFeedback();

  @Nullable
  public native WebGLSync fenceSync(int condition, int flags);

  public native void framebufferTextureLayer(int target, int attachment,
      @Nullable WebGLTexture texture, int level, int layer);

  @Nullable
  public native String getActiveUniformBlockName(@Nonnull WebGLProgram program,
      int uniformBlockIndex);

  @Nullable
  public native Any getActiveUniformBlockParameter(@Nonnull WebGLProgram program,
      int uniformBlockIndex, int pname);

  @Nullable
  public native Any getActiveUniforms(@Nonnull WebGLProgram program,
      @Nonnull JsArray<Double> uniformIndices, int pname);

  @Nullable
  public native Any getActiveUniforms(@Nonnull WebGLProgram program,
      @Nonnull Double[] uniformIndices, int pname);

  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull ArrayBufferView dstBuffer, int dstOffset, int length);

  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Int8Array dstBuffer,
      int dstOffset, int length);

  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Int16Array dstBuffer,
      int dstOffset, int length);

  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Int32Array dstBuffer,
      int dstOffset, int length);

  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Uint8Array dstBuffer,
      int dstOffset, int length);

  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Uint16Array dstBuffer,
      int dstOffset, int length);

  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Uint32Array dstBuffer,
      int dstOffset, int length);

  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull Uint8ClampedArray dstBuffer, int dstOffset, int length);

  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull Float32Array dstBuffer, int dstOffset, int length);

  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull Float64Array dstBuffer, int dstOffset, int length);

  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull DataView dstBuffer,
      int dstOffset, int length);

  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull ArrayBufferView dstBuffer, int dstOffset);

  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Int8Array dstBuffer,
      int dstOffset);

  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Int16Array dstBuffer,
      int dstOffset);

  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Int32Array dstBuffer,
      int dstOffset);

  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Uint8Array dstBuffer,
      int dstOffset);

  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Uint16Array dstBuffer,
      int dstOffset);

  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Uint32Array dstBuffer,
      int dstOffset);

  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull Uint8ClampedArray dstBuffer, int dstOffset);

  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull Float32Array dstBuffer, int dstOffset);

  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull Float64Array dstBuffer, int dstOffset);

  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull DataView dstBuffer,
      int dstOffset);

  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull ArrayBufferView dstBuffer);

  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Int8Array dstBuffer);

  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Int16Array dstBuffer);

  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Int32Array dstBuffer);

  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Uint8Array dstBuffer);

  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull Uint16Array dstBuffer);

  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull Uint32Array dstBuffer);

  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull Uint8ClampedArray dstBuffer);

  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull Float32Array dstBuffer);

  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull Float64Array dstBuffer);

  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull DataView dstBuffer);

  public native int getFragDataLocation(@Nonnull WebGLProgram program, @Nonnull String name);

  @Nullable
  public native Any getIndexedParameter(int target, int index);

  @Nullable
  public native Any getInternalformatParameter(int target, int internalformat, int pname);

  @Nullable
  public native WebGLQuery getQuery(int target, int pname);

  @Nullable
  public native Any getQueryParameter(@Nonnull WebGLQuery query, int pname);

  @Nullable
  public native Any getSamplerParameter(@Nonnull WebGLSampler sampler, int pname);

  @Nullable
  public native Any getSyncParameter(@Nonnull WebGLSync sync, int pname);

  @Nullable
  public native WebGLActiveInfo getTransformFeedbackVarying(@Nonnull WebGLProgram program,
      int index);

  public native int getUniformBlockIndex(@Nonnull WebGLProgram program,
      @Nonnull String uniformBlockName);

  @Nullable
  public native JsArray<Double> getUniformIndices(@Nonnull WebGLProgram program,
      @Nonnull JsArray<String> uniformNames);

  @Nullable
  public native JsArray<Double> getUniformIndices(@Nonnull WebGLProgram program,
      @Nonnull String[] uniformNames);

  public native void invalidateFramebuffer(int target, @Nonnull JsArray<Double> attachments);

  public native void invalidateFramebuffer(int target, @Nonnull Double[] attachments);

  public native void invalidateSubFramebuffer(int target, @Nonnull JsArray<Double> attachments,
      int x, int y, int width, int height);

  public native void invalidateSubFramebuffer(int target, @Nonnull Double[] attachments, int x,
      int y, int width, int height);

  public native boolean isQuery(@Nullable WebGLQuery query);

  public native boolean isSampler(@Nullable WebGLSampler sampler);

  public native boolean isSync(@Nullable WebGLSync sync);

  public native boolean isTransformFeedback(@Nullable WebGLTransformFeedback tf);

  public native boolean isVertexArray(@Nullable WebGLVertexArrayObject vertexArray);

  public native void pauseTransformFeedback();

  public native void readBuffer(int src);

  public native void renderbufferStorageMultisample(int target, int samples, int internalformat,
      int width, int height);

  public native void resumeTransformFeedback();

  public native void samplerParameterf(@Nonnull WebGLSampler sampler, int pname, float param);

  public native void samplerParameteri(@Nonnull WebGLSampler sampler, int pname, int param);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, int pboOffset);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull TexImageSource source);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull ImageBitmap source);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull ImageData source);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull HTMLImageElement source);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull HTMLCanvasElement source);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull HTMLVideoElement source);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull OffscreenCanvas source);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nullable ArrayBufferView srcData);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Int8Array srcData);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Int16Array srcData);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Int32Array srcData);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Uint8Array srcData);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Uint16Array srcData);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Uint32Array srcData);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Uint8ClampedArray srcData);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Float32Array srcData);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Float64Array srcData);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull DataView srcData);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull ArrayBufferView srcData, int srcOffset);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Int8Array srcData, int srcOffset);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Int16Array srcData, int srcOffset);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Int32Array srcData, int srcOffset);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Uint8Array srcData, int srcOffset);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Uint16Array srcData, int srcOffset);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Uint32Array srcData, int srcOffset);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Uint8ClampedArray srcData,
      int srcOffset);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Float32Array srcData, int srcOffset);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Float64Array srcData, int srcOffset);

  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull DataView srcData, int srcOffset);

  public native void texStorage2D(int target, int levels, int internalformat, int width,
      int height);

  public native void texStorage3D(int target, int levels, int internalformat, int width, int height,
      int depth);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, int pboOffset);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull TexImageSource source);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull ImageBitmap source);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull ImageData source);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull HTMLImageElement source);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull HTMLCanvasElement source);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull HTMLVideoElement source);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull OffscreenCanvas source);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nullable ArrayBufferView srcData,
      int srcOffset);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Int8Array srcData,
      int srcOffset);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Int16Array srcData,
      int srcOffset);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Int32Array srcData,
      int srcOffset);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Uint8Array srcData,
      int srcOffset);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Uint16Array srcData,
      int srcOffset);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Uint32Array srcData,
      int srcOffset);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Uint8ClampedArray srcData,
      int srcOffset);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Float32Array srcData,
      int srcOffset);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Float64Array srcData,
      int srcOffset);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull DataView srcData,
      int srcOffset);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nullable ArrayBufferView srcData);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Int8Array srcData);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Int16Array srcData);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Int32Array srcData);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Uint8Array srcData);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Uint16Array srcData);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Uint32Array srcData);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Uint8ClampedArray srcData);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Float32Array srcData);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Float64Array srcData);

  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull DataView srcData);

  public native void transformFeedbackVaryings(@Nonnull WebGLProgram program,
      @Nonnull JsArray<String> varyings, int bufferMode);

  public native void transformFeedbackVaryings(@Nonnull WebGLProgram program,
      @Nonnull String[] varyings, int bufferMode);

  public native void uniform1ui(@Nullable WebGLUniformLocation location, int v0);

  public native void uniform1uiv(@Nullable WebGLUniformLocation location, @Nonnull Uint32List data,
      int srcOffset, int srcLength);

  public native void uniform1uiv(@Nullable WebGLUniformLocation location, @Nonnull Uint32Array data,
      int srcOffset, int srcLength);

  public native void uniform1uiv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data, int srcOffset, int srcLength);

  public native void uniform1uiv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data,
      int srcOffset, int srcLength);

  public native void uniform1uiv(@Nullable WebGLUniformLocation location, @Nonnull Uint32List data,
      int srcOffset);

  public native void uniform1uiv(@Nullable WebGLUniformLocation location, @Nonnull Uint32Array data,
      int srcOffset);

  public native void uniform1uiv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data, int srcOffset);

  public native void uniform1uiv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data,
      int srcOffset);

  public native void uniform1uiv(@Nullable WebGLUniformLocation location, @Nonnull Uint32List data);

  public native void uniform1uiv(@Nullable WebGLUniformLocation location,
      @Nonnull Uint32Array data);

  public native void uniform1uiv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data);

  public native void uniform1uiv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data);

  public native void uniform2ui(@Nullable WebGLUniformLocation location, int v0, int v1);

  public native void uniform2uiv(@Nullable WebGLUniformLocation location, @Nonnull Uint32List data,
      int srcOffset, int srcLength);

  public native void uniform2uiv(@Nullable WebGLUniformLocation location, @Nonnull Uint32Array data,
      int srcOffset, int srcLength);

  public native void uniform2uiv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data, int srcOffset, int srcLength);

  public native void uniform2uiv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data,
      int srcOffset, int srcLength);

  public native void uniform2uiv(@Nullable WebGLUniformLocation location, @Nonnull Uint32List data,
      int srcOffset);

  public native void uniform2uiv(@Nullable WebGLUniformLocation location, @Nonnull Uint32Array data,
      int srcOffset);

  public native void uniform2uiv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data, int srcOffset);

  public native void uniform2uiv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data,
      int srcOffset);

  public native void uniform2uiv(@Nullable WebGLUniformLocation location, @Nonnull Uint32List data);

  public native void uniform2uiv(@Nullable WebGLUniformLocation location,
      @Nonnull Uint32Array data);

  public native void uniform2uiv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data);

  public native void uniform2uiv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data);

  public native void uniform3ui(@Nullable WebGLUniformLocation location, int v0, int v1, int v2);

  public native void uniform3uiv(@Nullable WebGLUniformLocation location, @Nonnull Uint32List data,
      int srcOffset, int srcLength);

  public native void uniform3uiv(@Nullable WebGLUniformLocation location, @Nonnull Uint32Array data,
      int srcOffset, int srcLength);

  public native void uniform3uiv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data, int srcOffset, int srcLength);

  public native void uniform3uiv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data,
      int srcOffset, int srcLength);

  public native void uniform3uiv(@Nullable WebGLUniformLocation location, @Nonnull Uint32List data,
      int srcOffset);

  public native void uniform3uiv(@Nullable WebGLUniformLocation location, @Nonnull Uint32Array data,
      int srcOffset);

  public native void uniform3uiv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data, int srcOffset);

  public native void uniform3uiv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data,
      int srcOffset);

  public native void uniform3uiv(@Nullable WebGLUniformLocation location, @Nonnull Uint32List data);

  public native void uniform3uiv(@Nullable WebGLUniformLocation location,
      @Nonnull Uint32Array data);

  public native void uniform3uiv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data);

  public native void uniform3uiv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data);

  public native void uniform4ui(@Nullable WebGLUniformLocation location, int v0, int v1, int v2,
      int v3);

  public native void uniform4uiv(@Nullable WebGLUniformLocation location, @Nonnull Uint32List data,
      int srcOffset, int srcLength);

  public native void uniform4uiv(@Nullable WebGLUniformLocation location, @Nonnull Uint32Array data,
      int srcOffset, int srcLength);

  public native void uniform4uiv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data, int srcOffset, int srcLength);

  public native void uniform4uiv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data,
      int srcOffset, int srcLength);

  public native void uniform4uiv(@Nullable WebGLUniformLocation location, @Nonnull Uint32List data,
      int srcOffset);

  public native void uniform4uiv(@Nullable WebGLUniformLocation location, @Nonnull Uint32Array data,
      int srcOffset);

  public native void uniform4uiv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data, int srcOffset);

  public native void uniform4uiv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data,
      int srcOffset);

  public native void uniform4uiv(@Nullable WebGLUniformLocation location, @Nonnull Uint32List data);

  public native void uniform4uiv(@Nullable WebGLUniformLocation location,
      @Nonnull Uint32Array data);

  public native void uniform4uiv(@Nullable WebGLUniformLocation location,
      @Nonnull JsArray<Double> data);

  public native void uniform4uiv(@Nullable WebGLUniformLocation location, @Nonnull Double[] data);

  public native void uniformBlockBinding(@Nonnull WebGLProgram program, int uniformBlockIndex,
      int uniformBlockBinding);

  public native void uniformMatrix2x3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data, int srcOffset, int srcLength);

  public native void uniformMatrix2x3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data, int srcOffset, int srcLength);

  public native void uniformMatrix2x3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data, int srcOffset, int srcLength);

  public native void uniformMatrix2x3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data, int srcOffset, int srcLength);

  public native void uniformMatrix2x3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data, int srcOffset);

  public native void uniformMatrix2x3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data, int srcOffset);

  public native void uniformMatrix2x3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data, int srcOffset);

  public native void uniformMatrix2x3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data, int srcOffset);

  public native void uniformMatrix2x3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data);

  public native void uniformMatrix2x3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data);

  public native void uniformMatrix2x3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data);

  public native void uniformMatrix2x3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data);

  public native void uniformMatrix2x4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data, int srcOffset, int srcLength);

  public native void uniformMatrix2x4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data, int srcOffset, int srcLength);

  public native void uniformMatrix2x4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data, int srcOffset, int srcLength);

  public native void uniformMatrix2x4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data, int srcOffset, int srcLength);

  public native void uniformMatrix2x4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data, int srcOffset);

  public native void uniformMatrix2x4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data, int srcOffset);

  public native void uniformMatrix2x4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data, int srcOffset);

  public native void uniformMatrix2x4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data, int srcOffset);

  public native void uniformMatrix2x4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data);

  public native void uniformMatrix2x4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data);

  public native void uniformMatrix2x4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data);

  public native void uniformMatrix2x4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data);

  public native void uniformMatrix3x2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data, int srcOffset, int srcLength);

  public native void uniformMatrix3x2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data, int srcOffset, int srcLength);

  public native void uniformMatrix3x2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data, int srcOffset, int srcLength);

  public native void uniformMatrix3x2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data, int srcOffset, int srcLength);

  public native void uniformMatrix3x2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data, int srcOffset);

  public native void uniformMatrix3x2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data, int srcOffset);

  public native void uniformMatrix3x2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data, int srcOffset);

  public native void uniformMatrix3x2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data, int srcOffset);

  public native void uniformMatrix3x2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data);

  public native void uniformMatrix3x2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data);

  public native void uniformMatrix3x2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data);

  public native void uniformMatrix3x2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data);

  public native void uniformMatrix3x4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data, int srcOffset, int srcLength);

  public native void uniformMatrix3x4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data, int srcOffset, int srcLength);

  public native void uniformMatrix3x4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data, int srcOffset, int srcLength);

  public native void uniformMatrix3x4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data, int srcOffset, int srcLength);

  public native void uniformMatrix3x4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data, int srcOffset);

  public native void uniformMatrix3x4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data, int srcOffset);

  public native void uniformMatrix3x4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data, int srcOffset);

  public native void uniformMatrix3x4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data, int srcOffset);

  public native void uniformMatrix3x4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data);

  public native void uniformMatrix3x4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data);

  public native void uniformMatrix3x4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data);

  public native void uniformMatrix3x4fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data);

  public native void uniformMatrix4x2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data, int srcOffset, int srcLength);

  public native void uniformMatrix4x2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data, int srcOffset, int srcLength);

  public native void uniformMatrix4x2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data, int srcOffset, int srcLength);

  public native void uniformMatrix4x2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data, int srcOffset, int srcLength);

  public native void uniformMatrix4x2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data, int srcOffset);

  public native void uniformMatrix4x2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data, int srcOffset);

  public native void uniformMatrix4x2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data, int srcOffset);

  public native void uniformMatrix4x2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data, int srcOffset);

  public native void uniformMatrix4x2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data);

  public native void uniformMatrix4x2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data);

  public native void uniformMatrix4x2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data);

  public native void uniformMatrix4x2fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data);

  public native void uniformMatrix4x3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data, int srcOffset, int srcLength);

  public native void uniformMatrix4x3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data, int srcOffset, int srcLength);

  public native void uniformMatrix4x3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data, int srcOffset, int srcLength);

  public native void uniformMatrix4x3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data, int srcOffset, int srcLength);

  public native void uniformMatrix4x3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data, int srcOffset);

  public native void uniformMatrix4x3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data, int srcOffset);

  public native void uniformMatrix4x3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data, int srcOffset);

  public native void uniformMatrix4x3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data, int srcOffset);

  public native void uniformMatrix4x3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32List data);

  public native void uniformMatrix4x3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Float32Array data);

  public native void uniformMatrix4x3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull JsArray<Double> data);

  public native void uniformMatrix4x3fv(@Nullable WebGLUniformLocation location, boolean transpose,
      @Nonnull Double[] data);

  public native void vertexAttribDivisor(int index, int divisor);

  public native void vertexAttribI4i(int index, int x, int y, int z, int w);

  public native void vertexAttribI4iv(int index, @Nonnull Int32List values);

  public native void vertexAttribI4iv(int index, @Nonnull Int32Array values);

  public native void vertexAttribI4iv(int index, @Nonnull JsArray<Double> values);

  public native void vertexAttribI4iv(int index, @Nonnull Double[] values);

  public native void vertexAttribI4ui(int index, int x, int y, int z, int w);

  public native void vertexAttribI4uiv(int index, @Nonnull Uint32List values);

  public native void vertexAttribI4uiv(int index, @Nonnull Uint32Array values);

  public native void vertexAttribI4uiv(int index, @Nonnull JsArray<Double> values);

  public native void vertexAttribI4uiv(int index, @Nonnull Double[] values);

  public native void vertexAttribIPointer(int index, int size, int type, int stride, int offset);

  public native void waitSync(@Nonnull WebGLSync sync, int flags, int timeout);
}
