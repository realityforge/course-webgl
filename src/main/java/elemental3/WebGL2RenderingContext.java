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
  public static final int ACTIVE_UNIFORM_BLOCKS = 0x8A36;

  @JsOverlay
  public static final int ALIASED_LINE_WIDTH_RANGE = 0x846E;

  @JsOverlay
  public static final int ALIASED_POINT_SIZE_RANGE = 0x846D;

  @JsOverlay
  public static final int ALPHA = 0x1906;

  @JsOverlay
  public static final int ALPHA_BITS = 0x0D55;

  @JsOverlay
  public static final int ALREADY_SIGNALED = 0x911A;

  @JsOverlay
  public static final int ALWAYS = 0x0207;

  @JsOverlay
  public static final int ANY_SAMPLES_PASSED = 0x8C2F;

  @JsOverlay
  public static final int ANY_SAMPLES_PASSED_CONSERVATIVE = 0x8D6A;

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
  public static final int COLOR = 0x1800;

  @JsOverlay
  public static final int COLOR_ATTACHMENT0 = 0x8CE0;

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
  public static final int COLOR_BUFFER_BIT = 0x00004000;

  @JsOverlay
  public static final int COLOR_CLEAR_VALUE = 0x0C22;

  @JsOverlay
  public static final int COLOR_WRITEMASK = 0x0C23;

  @JsOverlay
  public static final int COMPARE_REF_TO_TEXTURE = 0x884E;

  @JsOverlay
  public static final int COMPILE_STATUS = 0x8B81;

  @JsOverlay
  public static final int COMPRESSED_TEXTURE_FORMATS = 0x86A3;

  @JsOverlay
  public static final int CONDITION_SATISFIED = 0x911C;

  @JsOverlay
  public static final int CONSTANT_ALPHA = 0x8003;

  @JsOverlay
  public static final int CONSTANT_COLOR = 0x8001;

  @JsOverlay
  public static final int CONTEXT_LOST_WEBGL = 0x9242;

  @JsOverlay
  public static final int COPY_READ_BUFFER = 0x8F36;

  @JsOverlay
  public static final int COPY_READ_BUFFER_BINDING = 0x8F36;

  @JsOverlay
  public static final int COPY_WRITE_BUFFER = 0x8F37;

  @JsOverlay
  public static final int COPY_WRITE_BUFFER_BINDING = 0x8F37;

  @JsOverlay
  public static final int CULL_FACE = 0x0B44;

  @JsOverlay
  public static final int CULL_FACE_MODE = 0x0B45;

  @JsOverlay
  public static final int CURRENT_PROGRAM = 0x8B8D;

  @JsOverlay
  public static final int CURRENT_QUERY = 0x8865;

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
  public static final int DEPTH = 0x1801;

  @JsOverlay
  public static final int DEPTH24_STENCIL8 = 0x88F0;

  @JsOverlay
  public static final int DEPTH32F_STENCIL8 = 0x8CAD;

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
  public static final int DEPTH_COMPONENT24 = 0x81A6;

  @JsOverlay
  public static final int DEPTH_COMPONENT32F = 0x8CAC;

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
  public static final int DST_ALPHA = 0x0304;

  @JsOverlay
  public static final int DST_COLOR = 0x0306;

  @JsOverlay
  public static final int DYNAMIC_COPY = 0x88EA;

  @JsOverlay
  public static final int DYNAMIC_DRAW = 0x88E8;

  @JsOverlay
  public static final int DYNAMIC_READ = 0x88E9;

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
  public static final int FLOAT_32_UNSIGNED_INT_24_8_REV = 0x8DAD;

  @JsOverlay
  public static final int FLOAT_MAT2 = 0x8B5A;

  @JsOverlay
  public static final int FLOAT_MAT2x3 = 0x8B65;

  @JsOverlay
  public static final int FLOAT_MAT2x4 = 0x8B66;

  @JsOverlay
  public static final int FLOAT_MAT3 = 0x8B5B;

  @JsOverlay
  public static final int FLOAT_MAT3x2 = 0x8B67;

  @JsOverlay
  public static final int FLOAT_MAT3x4 = 0x8B68;

  @JsOverlay
  public static final int FLOAT_MAT4 = 0x8B5C;

  @JsOverlay
  public static final int FLOAT_MAT4x2 = 0x8B69;

  @JsOverlay
  public static final int FLOAT_MAT4x3 = 0x8B6A;

  @JsOverlay
  public static final int FLOAT_VEC2 = 0x8B50;

  @JsOverlay
  public static final int FLOAT_VEC3 = 0x8B51;

  @JsOverlay
  public static final int FLOAT_VEC4 = 0x8B52;

  @JsOverlay
  public static final int FRAGMENT_SHADER = 0x8B30;

  @JsOverlay
  public static final int FRAGMENT_SHADER_DERIVATIVE_HINT = 0x8B8B;

  @JsOverlay
  public static final int FRAMEBUFFER = 0x8D40;

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
  public static final int FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 0x8CD1;

  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 0x8CD0;

  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_RED_SIZE = 0x8212;

  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = 0x8217;

  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3;

  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 0x8CD4;

  @JsOverlay
  public static final int FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 0x8CD2;

  @JsOverlay
  public static final int FRAMEBUFFER_BINDING = 0x8CA6;

  @JsOverlay
  public static final int FRAMEBUFFER_COMPLETE = 0x8CD5;

  @JsOverlay
  public static final int FRAMEBUFFER_DEFAULT = 0x8218;

  @JsOverlay
  public static final int FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 0x8CD6;

  @JsOverlay
  public static final int FRAMEBUFFER_INCOMPLETE_DIMENSIONS = 0x8CD9;

  @JsOverlay
  public static final int FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7;

  @JsOverlay
  public static final int FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 0x8D56;

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
  public static final int HALF_FLOAT = 0x140B;

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
  public static final int INVALID_INDEX = 0xFFFFFFFF;

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
  public static final int MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x8B4D;

  @JsOverlay
  public static final int MAX_COMBINED_UNIFORM_BLOCKS = 0x8A2E;

  @JsOverlay
  public static final int MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 0x8A31;

  @JsOverlay
  public static final int MAX_CUBE_MAP_TEXTURE_SIZE = 0x851C;

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
  public static final int MAX_FRAGMENT_UNIFORM_VECTORS = 0x8DFD;

  @JsOverlay
  public static final int MAX_PROGRAM_TEXEL_OFFSET = 0x8905;

  @JsOverlay
  public static final int MAX_RENDERBUFFER_SIZE = 0x84E8;

  @JsOverlay
  public static final int MAX_SAMPLES = 0x8D57;

  @JsOverlay
  public static final int MAX_SERVER_WAIT_TIMEOUT = 0x9111;

  @JsOverlay
  public static final int MAX_TEXTURE_IMAGE_UNITS = 0x8872;

  @JsOverlay
  public static final int MAX_TEXTURE_LOD_BIAS = 0x84FD;

  @JsOverlay
  public static final int MAX_TEXTURE_SIZE = 0x0D33;

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
  public static final int MAX_VARYING_VECTORS = 0x8DFC;

  @JsOverlay
  public static final int MAX_VERTEX_ATTRIBS = 0x8869;

  @JsOverlay
  public static final int MAX_VERTEX_OUTPUT_COMPONENTS = 0x9122;

  @JsOverlay
  public static final int MAX_VERTEX_TEXTURE_IMAGE_UNITS = 0x8B4C;

  @JsOverlay
  public static final int MAX_VERTEX_UNIFORM_BLOCKS = 0x8A2B;

  @JsOverlay
  public static final int MAX_VERTEX_UNIFORM_COMPONENTS = 0x8B4A;

  @JsOverlay
  public static final int MAX_VERTEX_UNIFORM_VECTORS = 0x8DFB;

  @JsOverlay
  public static final int MAX_VIEWPORT_DIMS = 0x0D3A;

  @JsOverlay
  public static final int MEDIUM_FLOAT = 0x8DF1;

  @JsOverlay
  public static final int MEDIUM_INT = 0x8DF4;

  @JsOverlay
  public static final int MIN = 0x8007;

  @JsOverlay
  public static final int MIN_PROGRAM_TEXEL_OFFSET = 0x8904;

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
  public static final int OBJECT_TYPE = 0x9112;

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
  public static final int POINTS = 0x0000;

  @JsOverlay
  public static final int POLYGON_OFFSET_FACTOR = 0x8038;

  @JsOverlay
  public static final int POLYGON_OFFSET_FILL = 0x8037;

  @JsOverlay
  public static final int POLYGON_OFFSET_UNITS = 0x2A00;

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
  public static final int RED_BITS = 0x0D52;

  @JsOverlay
  public static final int RED_INTEGER = 0x8D94;

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
  public static final int RENDERBUFFER_SAMPLES = 0x8CAB;

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
  public static final int RGB = 0x1907;

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
  public static final int RGB565 = 0x8D62;

  @JsOverlay
  public static final int RGB5_A1 = 0x8057;

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
  public static final int RGBA = 0x1908;

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
  public static final int RGBA4 = 0x8056;

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
  public static final int SAMPLER_2D = 0x8B5E;

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
  public static final int SAMPLER_CUBE = 0x8B60;

  @JsOverlay
  public static final int SAMPLER_CUBE_SHADOW = 0x8DC5;

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
  public static final int SEPARATE_ATTRIBS = 0x8C8D;

  @JsOverlay
  public static final int SHADER_TYPE = 0x8B4F;

  @JsOverlay
  public static final int SHADING_LANGUAGE_VERSION = 0x8B8C;

  @JsOverlay
  public static final int SHORT = 0x1402;

  @JsOverlay
  public static final int SIGNALED = 0x9119;

  @JsOverlay
  public static final int SIGNED_NORMALIZED = 0x8F9C;

  @JsOverlay
  public static final int SRC_ALPHA = 0x0302;

  @JsOverlay
  public static final int SRC_ALPHA_SATURATE = 0x0308;

  @JsOverlay
  public static final int SRC_COLOR = 0x0300;

  @JsOverlay
  public static final int SRGB = 0x8C40;

  @JsOverlay
  public static final int SRGB8 = 0x8C41;

  @JsOverlay
  public static final int SRGB8_ALPHA8 = 0x8C43;

  @JsOverlay
  public static final int STATIC_COPY = 0x88E6;

  @JsOverlay
  public static final int STATIC_DRAW = 0x88E4;

  @JsOverlay
  public static final int STATIC_READ = 0x88E5;

  @JsOverlay
  public static final int STENCIL = 0x1802;

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
  public static final int STREAM_COPY = 0x88E2;

  @JsOverlay
  public static final int STREAM_DRAW = 0x88E0;

  @JsOverlay
  public static final int STREAM_READ = 0x88E1;

  @JsOverlay
  public static final int SUBPIXEL_BITS = 0x0D50;

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
  public static final int TEXTURE_2D_ARRAY = 0x8C1A;

  @JsOverlay
  public static final int TEXTURE_3D = 0x806F;

  @JsOverlay
  public static final int TEXTURE_BASE_LEVEL = 0x813C;

  @JsOverlay
  public static final int TEXTURE_BINDING_2D = 0x8069;

  @JsOverlay
  public static final int TEXTURE_BINDING_2D_ARRAY = 0x8C1D;

  @JsOverlay
  public static final int TEXTURE_BINDING_3D = 0x806A;

  @JsOverlay
  public static final int TEXTURE_BINDING_CUBE_MAP = 0x8514;

  @JsOverlay
  public static final int TEXTURE_COMPARE_FUNC = 0x884D;

  @JsOverlay
  public static final int TEXTURE_COMPARE_MODE = 0x884C;

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
  public static final int TEXTURE_IMMUTABLE_FORMAT = 0x912F;

  @JsOverlay
  public static final int TEXTURE_IMMUTABLE_LEVELS = 0x82DF;

  @JsOverlay
  public static final int TEXTURE_MAG_FILTER = 0x2800;

  @JsOverlay
  public static final int TEXTURE_MAX_LEVEL = 0x813D;

  @JsOverlay
  public static final int TEXTURE_MAX_LOD = 0x813B;

  @JsOverlay
  public static final int TEXTURE_MIN_FILTER = 0x2801;

  @JsOverlay
  public static final int TEXTURE_MIN_LOD = 0x813A;

  @JsOverlay
  public static final int TEXTURE_WRAP_R = 0x8072;

  @JsOverlay
  public static final int TEXTURE_WRAP_S = 0x2802;

  @JsOverlay
  public static final int TEXTURE_WRAP_T = 0x2803;

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
  public static final int TRIANGLES = 0x0004;

  @JsOverlay
  public static final int TRIANGLE_FAN = 0x0006;

  @JsOverlay
  public static final int TRIANGLE_STRIP = 0x0005;

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
  public static final int UNPACK_ALIGNMENT = 0x0CF5;

  @JsOverlay
  public static final int UNPACK_COLORSPACE_CONVERSION_WEBGL = 0x9243;

  @JsOverlay
  public static final int UNPACK_FLIP_Y_WEBGL = 0x9240;

  @JsOverlay
  public static final int UNPACK_IMAGE_HEIGHT = 0x806E;

  @JsOverlay
  public static final int UNPACK_PREMULTIPLY_ALPHA_WEBGL = 0x9241;

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
  public static final int UNSIGNED_BYTE = 0x1401;

  @JsOverlay
  public static final int UNSIGNED_INT = 0x1405;

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
  public static final int VERTEX_ARRAY_BINDING = 0x85B5;

  @JsOverlay
  public static final int VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 0x889F;

  @JsOverlay
  public static final int VERTEX_ATTRIB_ARRAY_DIVISOR = 0x88FE;

  @JsOverlay
  public static final int VERTEX_ATTRIB_ARRAY_ENABLED = 0x8622;

  @JsOverlay
  public static final int VERTEX_ATTRIB_ARRAY_INTEGER = 0x88FD;

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
  public static final int WAIT_FAILED = 0x911D;

  @JsOverlay
  public static final int ZERO = 0;

  WebGL2RenderingContext() {
  }

  /**
   * The read-only WebGLRenderingContext.drawingBufferHeight property represents the actual height of the current drawing buffer. It should match the height attribute of the canvas element associated with this context, but might differ if the implementation is not able to provide the requested height.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/drawingBufferHeight">WebGLRenderingContext.drawingBufferHeight - MDN</a>
   */
  @JsProperty(
      name = "drawingBufferHeight"
  )
  public native int drawingBufferHeight();

  /**
   * The read-only WebGLRenderingContext.drawingBufferWidth property represents the actual width of the current drawing buffer. It should match the width attribute of the canvas element associated with this context, but might differ if the implementation is not able to provide the requested width.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/drawingBufferWidth">WebGLRenderingContext.drawingBufferWidth - MDN</a>
   */
  @JsProperty(
      name = "drawingBufferWidth"
  )
  public native int drawingBufferWidth();

  /**
   * The WebGLRenderingContext.activeTexture() method of the WebGL API specifies which texture unit to make active.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/activeTexture">WebGLRenderingContext.activeTexture - MDN</a>
   */
  public native void activeTexture(int texture);

  /**
   * The WebGLRenderingContext.attachShader() method of the WebGL API attaches either a fragment or vertex WebGLShader to a WebGLProgram.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/attachShader">WebGLRenderingContext.attachShader - MDN</a>
   */
  public native void attachShader(@Nonnull WebGLProgram program, @Nonnull WebGLShader shader);

  /**
   * The WebGLRenderingContext.bindAttribLocation() method of the WebGL API binds a generic vertex index to an attribute variable.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bindAttribLocation">WebGLRenderingContext.bindAttribLocation - MDN</a>
   */
  public native void bindAttribLocation(@Nonnull WebGLProgram program, int index,
      @Nonnull String name);

  /**
   * The WebGLRenderingContext.bindBuffer() method of the WebGL API binds a given WebGLBuffer to a target.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bindBuffer">WebGLRenderingContext.bindBuffer - MDN</a>
   */
  public native void bindBuffer(int target, @Nullable WebGLBuffer buffer);

  /**
   * The WebGLRenderingContext.bindFramebuffer() method of the WebGL API binds a given WebGLFramebuffer to a target.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bindFramebuffer">WebGLRenderingContext.bindFramebuffer - MDN</a>
   */
  public native void bindFramebuffer(int target, @Nullable WebGLFramebuffer framebuffer);

  /**
   * The WebGLRenderingContext.bindRenderbuffer() method of the WebGL API binds a given WebGLRenderbuffer to a target, which must be gl.RENDERBUFFER.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bindRenderbuffer">WebGLRenderingContext.bindRenderbuffer - MDN</a>
   */
  public native void bindRenderbuffer(int target, @Nullable WebGLRenderbuffer renderbuffer);

  /**
   * The WebGLRenderingContext.bindTexture() method of the WebGL API binds a given WebGLTexture to a target (binding point).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bindTexture">WebGLRenderingContext.bindTexture - MDN</a>
   */
  public native void bindTexture(int target, @Nullable WebGLTexture texture);

  /**
   * The WebGLRenderingContext.blendColor() method of the WebGL API is used to set the source and destination blending factors.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/blendColor">WebGLRenderingContext.blendColor - MDN</a>
   */
  public native void blendColor(float red, float green, float blue, float alpha);

  /**
   * The WebGLRenderingContext.blendEquation() method of the WebGL API is used to set both the RGB blend equation and alpha blend equation to a single equation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/blendEquation">WebGLRenderingContext.blendEquation - MDN</a>
   */
  public native void blendEquation(int mode);

  /**
   * The WebGLRenderingContext.blendEquationSeparate() method of the WebGL API is used to set the RGB blend equation and alpha blend equation separately.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/blendEquationSeparate">WebGLRenderingContext.blendEquationSeparate - MDN</a>
   */
  public native void blendEquationSeparate(int modeRGB, int modeAlpha);

  /**
   * The WebGLRenderingContext.blendFunc() method of the WebGL API defines which function is used for blending pixel arithmetic.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/blendFunc">WebGLRenderingContext.blendFunc - MDN</a>
   */
  public native void blendFunc(int sfactor, int dfactor);

  /**
   * The WebGLRenderingContext.blendFuncSeparate() method of the WebGL API defines which function is used for blending pixel arithmetic for RGB and alpha components separately.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/blendFuncSeparate">WebGLRenderingContext.blendFuncSeparate - MDN</a>
   */
  public native void blendFuncSeparate(int srcRGB, int dstRGB, int srcAlpha, int dstAlpha);

  /**
   * The WebGLRenderingContext.checkFramebufferStatus() method of the WebGL API returns the completeness status of the WebGLFramebuffer object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/checkFramebufferStatus">WebGLRenderingContext.checkFramebufferStatus - MDN</a>
   */
  public native int checkFramebufferStatus(int target);

  /**
   * The WebGLRenderingContext.clear() method of the WebGL API clears buffers to preset values.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/clear">WebGLRenderingContext.clear - MDN</a>
   */
  public native void clear(int mask);

  /**
   * The WebGLRenderingContext.clearColor() method of the WebGL API specifies the color values used when clearing color buffers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/clearColor">WebGLRenderingContext.clearColor - MDN</a>
   */
  public native void clearColor(float red, float green, float blue, float alpha);

  /**
   * The WebGLRenderingContext.clearDepth() method of the WebGL API specifies the clear value for the depth buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/clearDepth">WebGLRenderingContext.clearDepth - MDN</a>
   */
  public native void clearDepth(float depth);

  /**
   * The WebGLRenderingContext.clearStencil() method of the WebGL API specifies the clear value for the stencil buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/clearStencil">WebGLRenderingContext.clearStencil - MDN</a>
   */
  public native void clearStencil(int s);

  /**
   * The WebGLRenderingContext.colorMask() method of the WebGL API sets which color components to enable or to disable when drawing or rendering to a WebGLFramebuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/colorMask">WebGLRenderingContext.colorMask - MDN</a>
   */
  public native void colorMask(boolean red, boolean green, boolean blue, boolean alpha);

  /**
   * The WebGLRenderingContext.compileShader() method of the WebGL API compiles a GLSL shader into binary data so that it can be used by a WebGLProgram.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compileShader">WebGLRenderingContext.compileShader - MDN</a>
   */
  public native void compileShader(@Nonnull WebGLShader shader);

  /**
   * The WebGLRenderingContext.copyTexImage2D() method of the WebGL API copies pixels from the current WebGLFramebuffer into a 2D texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/copyTexImage2D">WebGLRenderingContext.copyTexImage2D - MDN</a>
   */
  public native void copyTexImage2D(int target, int level, int internalformat, int x, int y,
      int width, int height, int border);

  /**
   * The WebGLRenderingContext.copyTexSubImage2D() method of the WebGL API copies pixels from the current WebGLFramebuffer into an existing 2D texture sub-image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/copyTexSubImage2D">WebGLRenderingContext.copyTexSubImage2D - MDN</a>
   */
  public native void copyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x,
      int y, int width, int height);

  /**
   * The WebGLRenderingContext.createBuffer() method of the WebGL API creates and initializes a WebGLBuffer storing data such as vertices or colors.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/createBuffer">WebGLRenderingContext.createBuffer - MDN</a>
   */
  @Nullable
  public native WebGLBuffer createBuffer();

  /**
   * The WebGLRenderingContext.createFramebuffer() method of the WebGL API creates and initializes a WebGLFramebuffer object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/createFramebuffer">WebGLRenderingContext.createFramebuffer - MDN</a>
   */
  @Nullable
  public native WebGLFramebuffer createFramebuffer();

  /**
   * The WebGLRenderingContext.createProgram() method of the WebGL API creates and initializes a WebGLProgram object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/createProgram">WebGLRenderingContext.createProgram - MDN</a>
   */
  @Nullable
  public native WebGLProgram createProgram();

  /**
   * The WebGLRenderingContext.createRenderbuffer() method of the WebGL API creates and initializes a WebGLRenderbuffer object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/createRenderbuffer">WebGLRenderingContext.createRenderbuffer - MDN</a>
   */
  @Nullable
  public native WebGLRenderbuffer createRenderbuffer();

  /**
   * The WebGLRenderingContext method createShader() of the WebGL API creates a WebGLShader that can then be configured further using WebGLRenderingContext.shaderSource() and WebGLRenderingContext.compileShader().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/createShader">WebGLRenderingContext.createShader - MDN</a>
   */
  @Nullable
  public native WebGLShader createShader(int type);

  /**
   * The WebGLRenderingContext.createTexture() method of the WebGL API creates and initializes a WebGLTexture object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/createTexture">WebGLRenderingContext.createTexture - MDN</a>
   */
  @Nullable
  public native WebGLTexture createTexture();

  /**
   * The WebGLRenderingContext.cullFace() method of the WebGL API specifies whether or not front- and/or back-facing polygons can be culled.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/cullFace">WebGLRenderingContext.cullFace - MDN</a>
   */
  public native void cullFace(int mode);

  /**
   * The WebGLRenderingContext.deleteBuffer() method of the WebGL API deletes a given WebGLBuffer. This method has no effect if the buffer has already been deleted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/deleteBuffer">WebGLRenderingContext.deleteBuffer - MDN</a>
   */
  public native void deleteBuffer(@Nullable WebGLBuffer buffer);

  /**
   * The WebGLRenderingContext.deleteFramebuffer() method of the WebGL API deletes a given WebGLFramebuffer object. This method has no effect if the frame buffer has already been deleted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/deleteFramebuffer">WebGLRenderingContext.deleteFramebuffer - MDN</a>
   */
  public native void deleteFramebuffer(@Nullable WebGLFramebuffer framebuffer);

  /**
   * The WebGLRenderingContext.deleteProgram() method of the WebGL API deletes a given WebGLProgram object. This method has no effect if the program has already been deleted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/deleteProgram">WebGLRenderingContext.deleteProgram - MDN</a>
   */
  public native void deleteProgram(@Nullable WebGLProgram program);

  /**
   * The WebGLRenderingContext.deleteRenderbuffer() method of the WebGL API deletes a given WebGLRenderbuffer object. This method has no effect if the render buffer has already been deleted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/deleteRenderbuffer">WebGLRenderingContext.deleteRenderbuffer - MDN</a>
   */
  public native void deleteRenderbuffer(@Nullable WebGLRenderbuffer renderbuffer);

  /**
   * The WebGLRenderingContext.deleteShader() method of the WebGL API marks a given WebGLShader object for deletion. It will then be deleted whenever the shader is no longer in use. This method has no effect if the shader has already been deleted, and the WebGLShader is automatically marked for deletion when it is destroyed by the garbage collector.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/deleteShader">WebGLRenderingContext.deleteShader - MDN</a>
   */
  public native void deleteShader(@Nullable WebGLShader shader);

  /**
   * The WebGLRenderingContext.deleteTexture() method of the WebGL API deletes a given WebGLTexture object. This method has no effect if the texture has already been deleted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/deleteTexture">WebGLRenderingContext.deleteTexture - MDN</a>
   */
  public native void deleteTexture(@Nullable WebGLTexture texture);

  /**
   * The WebGLRenderingContext.depthFunc() method of the WebGL API specifies a function that compares incoming pixel depth to the current depth buffer value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/depthFunc">WebGLRenderingContext.depthFunc - MDN</a>
   */
  public native void depthFunc(int func);

  /**
   * The WebGLRenderingContext.depthMask() method of the WebGL API sets whether writing into the depth buffer is enabled or disabled.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/depthMask">WebGLRenderingContext.depthMask - MDN</a>
   */
  public native void depthMask(boolean flag);

  /**
   * The WebGLRenderingContext.depthRange() method of the WebGL API specifies the depth range mapping from normalized device coordinates to window or viewport coordinates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/depthRange">WebGLRenderingContext.depthRange - MDN</a>
   */
  public native void depthRange(float zNear, float zFar);

  /**
   * The WebGLRenderingContext.detachShader() method of the WebGL API detaches a previously attached WebGLShader from a WebGLProgram.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/detachShader">WebGLRenderingContext.detachShader - MDN</a>
   */
  public native void detachShader(@Nonnull WebGLProgram program, @Nonnull WebGLShader shader);

  /**
   * The WebGLRenderingContext.disable() method of the WebGL API disables specific WebGL capabilities for this context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/disable">WebGLRenderingContext.disable - MDN</a>
   */
  public native void disable(int cap);

  /**
   * The WebGLRenderingContext.disableVertexAttribArray() method of the WebGL API turns the generic vertex attribute array off at a given index position.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/disableVertexAttribArray">WebGLRenderingContext.disableVertexAttribArray - MDN</a>
   */
  public native void disableVertexAttribArray(int index);

  /**
   * The WebGLRenderingContext.drawArrays() method of the WebGL API renders primitives from array data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/drawArrays">WebGLRenderingContext.drawArrays - MDN</a>
   */
  public native void drawArrays(int mode, int first, int count);

  /**
   * The WebGLRenderingContext.drawElements() method of the WebGL API renders primitives from array data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/drawElements">WebGLRenderingContext.drawElements - MDN</a>
   */
  public native void drawElements(int mode, int count, int type, int offset);

  /**
   * The WebGLRenderingContext.enable() method of the WebGL API enables specific WebGL capabilities for this context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/enable">WebGLRenderingContext.enable - MDN</a>
   */
  public native void enable(int cap);

  /**
   * The WebGLRenderingContext method enableVertexAttribArray(), part of the WebGL API, turns on the generic vertex attribute array at the specified index into the list of attribute arrays.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/enableVertexAttribArray">WebGLRenderingContext.enableVertexAttribArray - MDN</a>
   */
  public native void enableVertexAttribArray(int index);

  /**
   * The WebGLRenderingContext.finish() method of the WebGL API blocks execution until all previously called commands are finished.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/finish">WebGLRenderingContext.finish - MDN</a>
   */
  public native void finish();

  /**
   * The WebGLRenderingContext.flush() method of the WebGL API empties different buffer commands, causing all commands to be executed as quickly as possible.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/flush">WebGLRenderingContext.flush - MDN</a>
   */
  public native void flush();

  /**
   * The WebGLRenderingContext.framebufferRenderbuffer() method of the WebGL API attaches a WebGLRenderbuffer object to a WebGLFramebuffer object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/framebufferRenderbuffer">WebGLRenderingContext.framebufferRenderbuffer - MDN</a>
   */
  public native void framebufferRenderbuffer(int target, int attachment, int renderbuffertarget,
      @Nullable WebGLRenderbuffer renderbuffer);

  /**
   * The WebGLRenderingContext.framebufferTexture2D() method of the WebGL API attaches a texture to a WebGLFramebuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/framebufferTexture2D">WebGLRenderingContext.framebufferTexture2D - MDN</a>
   */
  public native void framebufferTexture2D(int target, int attachment, int textarget,
      @Nullable WebGLTexture texture, int level);

  /**
   * The WebGLRenderingContext.frontFace() method of the WebGL API specifies whether polygons are front- or back-facing by setting a winding orientation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/frontFace">WebGLRenderingContext.frontFace - MDN</a>
   */
  public native void frontFace(int mode);

  /**
   * The WebGLRenderingContext.generateMipmap() method of the WebGL API generates a set of mipmaps for a WebGLTexture object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/generateMipmap">WebGLRenderingContext.generateMipmap - MDN</a>
   */
  public native void generateMipmap(int target);

  /**
   * The WebGLRenderingContext.getActiveAttrib() method of the WebGL API returns a WebGLActiveInfo object containing size, type, and name of a vertex attribute. It is generally used when querying unknown attributes either for debugging or generic library creation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getActiveAttrib">WebGLRenderingContext.getActiveAttrib - MDN</a>
   */
  @Nullable
  public native WebGLActiveInfo getActiveAttrib(@Nonnull WebGLProgram program, int index);

  /**
   * The WebGLRenderingContext.getActiveUniform() method of the WebGL API returns a WebGLActiveInfo object containing size, type, and name of a uniform attribute. It is generally used when querying unknown uniforms either for debugging or generic library creation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getActiveUniform">WebGLRenderingContext.getActiveUniform - MDN</a>
   */
  @Nullable
  public native WebGLActiveInfo getActiveUniform(@Nonnull WebGLProgram program, int index);

  /**
   * The WebGLRenderingContext.getAttachedShaders() method of the WebGL API returns a list of WebGLShader objects attached to a WebGLProgram.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getAttachedShaders">WebGLRenderingContext.getAttachedShaders - MDN</a>
   */
  @Nullable
  public native JsArray<WebGLShader> getAttachedShaders(@Nonnull WebGLProgram program);

  /**
   * The WebGLRenderingContext.getAttribLocation() method of the WebGL API returns the location of an attribute variable in a given WebGLProgram.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getAttribLocation">WebGLRenderingContext.getAttribLocation - MDN</a>
   */
  public native int getAttribLocation(@Nonnull WebGLProgram program, @Nonnull String name);

  /**
   * The WebGLRenderingContext.getBufferParameter() method of the WebGL API returns information about the buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getBufferParameter">WebGLRenderingContext.getBufferParameter - MDN</a>
   */
  @Nullable
  public native Any getBufferParameter(int target, int pname);

  /**
   * The WebGLRenderingContext.getContextAttributes() method returns a WebGLContextAttributes object that contains the actual context parameters. Might return null, if the context is lost.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getContextAttributes">WebGLRenderingContext.getContextAttributes - MDN</a>
   */
  @Nullable
  public native WebGLContextAttributes getContextAttributes();

  /**
   * The WebGLRenderingContext.getError() method of the WebGL API returns error information.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getError">WebGLRenderingContext.getError - MDN</a>
   */
  public native int getError();

  /**
   * The WebGLRenderingContext.getExtension() method enables a WebGL extension.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getExtension">WebGLRenderingContext.getExtension - MDN</a>
   */
  @Nullable
  public native Object getExtension(@Nonnull String name);

  /**
   * The WebGLRenderingContext.getFramebufferAttachmentParameter() method of the WebGL API returns information about a framebuffer's attachment.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getFramebufferAttachmentParameter">WebGLRenderingContext.getFramebufferAttachmentParameter - MDN</a>
   */
  @Nullable
  public native Any getFramebufferAttachmentParameter(int target, int attachment, int pname);

  /**
   * The WebGLRenderingContext.getParameter() method of the WebGL API returns a value for the passed parameter name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getParameter">WebGLRenderingContext.getParameter - MDN</a>
   */
  @Nullable
  public native Any getParameter(int pname);

  /**
   * The WebGLRenderingContext.getProgramInfoLog returns the information log for the specified WebGLProgram object. It contains errors that occurred during failed linking or validation of WebGLProgram objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getProgramInfoLog">WebGLRenderingContext.getProgramInfoLog - MDN</a>
   */
  @Nullable
  public native String getProgramInfoLog(@Nonnull WebGLProgram program);

  /**
   * The WebGLRenderingContext.getProgramParameter() method of the WebGL API returns information about the given program.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getProgramParameter">WebGLRenderingContext.getProgramParameter - MDN</a>
   */
  @Nullable
  public native Any getProgramParameter(@Nonnull WebGLProgram program, int pname);

  /**
   * The WebGLRenderingContext.getRenderbufferParameter() method of the WebGL API returns information about the renderbuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getRenderbufferParameter">WebGLRenderingContext.getRenderbufferParameter - MDN</a>
   */
  @Nullable
  public native Any getRenderbufferParameter(int target, int pname);

  /**
   * The WebGLRenderingContext.getShaderInfoLog returns the information log for the specified WebGLShader object. It contains warnings, debugging and compile information.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getShaderInfoLog">WebGLRenderingContext.getShaderInfoLog - MDN</a>
   */
  @Nullable
  public native String getShaderInfoLog(@Nonnull WebGLShader shader);

  /**
   * The WebGLRenderingContext.getShaderParameter() method of the WebGL API returns information about the given shader.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getShaderParameter">WebGLRenderingContext.getShaderParameter - MDN</a>
   */
  @Nullable
  public native Any getShaderParameter(@Nonnull WebGLShader shader, int pname);

  /**
   * The WebGLRenderingContext.getShaderPrecisionFormat() method of the WebGL API returns a new WebGLShaderPrecisionFormat object describing the range and precision for the specified shader numeric format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getShaderPrecisionFormat">WebGLRenderingContext.getShaderPrecisionFormat - MDN</a>
   */
  @Nullable
  public native WebGLShaderPrecisionFormat getShaderPrecisionFormat(int shadertype,
      int precisiontype);

  /**
   * The WebGLRenderingContext.getShaderSource() method of the WebGL API returns the source code of a WebGLShader as a DOMString.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getShaderSource">WebGLRenderingContext.getShaderSource - MDN</a>
   */
  @Nullable
  public native String getShaderSource(@Nonnull WebGLShader shader);

  /**
   * The WebGLRenderingContext.getSupportedExtensions() method returns a list of all the supported WebGL extensions.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getSupportedExtensions">WebGLRenderingContext.getSupportedExtensions - MDN</a>
   */
  @Nullable
  public native JsArray<String> getSupportedExtensions();

  /**
   * The WebGLRenderingContext.getTexParameter() method of the WebGL API returns information about the given texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getTexParameter">WebGLRenderingContext.getTexParameter - MDN</a>
   */
  @Nullable
  public native Any getTexParameter(int target, int pname);

  /**
   * The WebGLRenderingContext.getUniform() method of the WebGL API returns the value of a uniform variable at a given location.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getUniform">WebGLRenderingContext.getUniform - MDN</a>
   */
  @Nullable
  public native Any getUniform(@Nonnull WebGLProgram program,
      @Nonnull WebGLUniformLocation location);

  /**
   * Part of the WebGL API, the WebGLRenderingContext method getUniformLocation() returns the location of a specific uniform variable which is part of a given WebGLProgram.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getUniformLocation">WebGLRenderingContext.getUniformLocation - MDN</a>
   */
  @Nullable
  public native WebGLUniformLocation getUniformLocation(@Nonnull WebGLProgram program,
      @Nonnull String name);

  /**
   * The WebGLRenderingContext.getVertexAttrib() method of the WebGL API returns information about a vertex attribute at a given position.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getVertexAttrib">WebGLRenderingContext.getVertexAttrib - MDN</a>
   */
  @Nullable
  public native Any getVertexAttrib(int index, int pname);

  /**
   * The WebGLRenderingContext.getVertexAttribOffset() method of the WebGL API returns the address of a specified vertex attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/getVertexAttribOffset">WebGLRenderingContext.getVertexAttribOffset - MDN</a>
   */
  public native int getVertexAttribOffset(int index, int pname);

  /**
   * The WebGLRenderingContext.hint() method of the WebGL API specifies hints for certain behaviors. The interpretation of these hints depend on the implementation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/hint">WebGLRenderingContext.hint - MDN</a>
   */
  public native void hint(int target, int mode);

  /**
   * The WebGLRenderingContext.isBuffer() method of the WebGL API returns true if the passed WebGLBuffer is valid and false otherwise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isBuffer">WebGLRenderingContext.isBuffer - MDN</a>
   */
  public native boolean isBuffer(@Nullable WebGLBuffer buffer);

  /**
   * The WebGLRenderingContext.isContextLost() method returns a Boolean indicating whether or not the WebGL context has been lost and must be re-established before rendering can resume.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isContextLost">WebGLRenderingContext.isContextLost - MDN</a>
   */
  public native boolean isContextLost();

  /**
   * The WebGLRenderingContext.isEnabled() method of the WebGL API tests whether a specific WebGL capability is enabled or not for this context.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isEnabled">WebGLRenderingContext.isEnabled - MDN</a>
   */
  public native boolean isEnabled(int cap);

  /**
   * The WebGLRenderingContext.isFramebuffer() method of the WebGL API returns true if the passed WebGLFramebuffer is valid and false otherwise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isFramebuffer">WebGLRenderingContext.isFramebuffer - MDN</a>
   */
  public native boolean isFramebuffer(@Nullable WebGLFramebuffer framebuffer);

  /**
   * The WebGLRenderingContext.isProgram() method of the WebGL API returns true if the passed WebGLProgram is valid, false otherwise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isProgram">WebGLRenderingContext.isProgram - MDN</a>
   */
  public native boolean isProgram(@Nullable WebGLProgram program);

  /**
   * The WebGLRenderingContext.isRenderbuffer() method of the WebGL API returns true if the passed WebGLRenderbuffer is valid and false otherwise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isRenderbuffer">WebGLRenderingContext.isRenderbuffer - MDN</a>
   */
  public native boolean isRenderbuffer(@Nullable WebGLRenderbuffer renderbuffer);

  /**
   * The WebGLRenderingContext.isShader() method of the WebGL API returns true if the passed WebGLShader is valid, false otherwise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isShader">WebGLRenderingContext.isShader - MDN</a>
   */
  public native boolean isShader(@Nullable WebGLShader shader);

  /**
   * The WebGLRenderingContext.isTexture() method of the WebGL API returns true if the passed WebGLTexture is valid and false otherwise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/isTexture">WebGLRenderingContext.isTexture - MDN</a>
   */
  public native boolean isTexture(@Nullable WebGLTexture texture);

  /**
   * The WebGLRenderingContext.lineWidth() method of the WebGL API sets the line width of rasterized lines.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/lineWidth">WebGLRenderingContext.lineWidth - MDN</a>
   */
  public native void lineWidth(float width);

  /**
   * The WebGLRenderingContext interface's linkProgram() method links a given WebGLProgram, completing the process of preparing the GPU code for the program's fragment and vertex shaders.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/linkProgram">WebGLRenderingContext.linkProgram - MDN</a>
   */
  public native void linkProgram(@Nonnull WebGLProgram program);

  /**
   * The WebGLRenderingContext.pixelStorei() method of the WebGL API specifies the pixel storage modes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/pixelStorei">WebGLRenderingContext.pixelStorei - MDN</a>
   */
  public native void pixelStorei(int pname, int param);

  /**
   * The WebGLRenderingContext.polygonOffset() method of the WebGL API specifies the scale factors and units to calculate depth values.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/polygonOffset">WebGLRenderingContext.polygonOffset - MDN</a>
   */
  public native void polygonOffset(float factor, float units);

  /**
   * The WebGLRenderingContext.renderbufferStorage() method of the WebGL API creates and initializes a renderbuffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/renderbufferStorage">WebGLRenderingContext.renderbufferStorage - MDN</a>
   */
  public native void renderbufferStorage(int target, int internalformat, int width, int height);

  /**
   * The WebGLRenderingContext.sampleCoverage() method of the WebGL API specifies multi-sample coverage parameters for anti-aliasing effects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/sampleCoverage">WebGLRenderingContext.sampleCoverage - MDN</a>
   */
  public native void sampleCoverage(float value, boolean invert);

  /**
   * The WebGLRenderingContext.scissor() method of the WebGL API sets a scissor box, which limits the drawing to a specified rectangle.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/scissor">WebGLRenderingContext.scissor - MDN</a>
   */
  public native void scissor(int x, int y, int width, int height);

  /**
   * The WebGLRenderingContext.shaderSource() method of the WebGL API sets the source code of a WebGLShader.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/shaderSource">WebGLRenderingContext.shaderSource - MDN</a>
   */
  public native void shaderSource(@Nonnull WebGLShader shader, @Nonnull String source);

  /**
   * The WebGLRenderingContext.stencilFunc() method of the WebGL API sets the front and back function and reference value for stencil testing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/stencilFunc">WebGLRenderingContext.stencilFunc - MDN</a>
   */
  public native void stencilFunc(int func, int ref, int mask);

  /**
   * The WebGLRenderingContext.stencilFuncSeparate() method of the WebGL API sets the front and/or back function and reference value for stencil testing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/stencilFuncSeparate">WebGLRenderingContext.stencilFuncSeparate - MDN</a>
   */
  public native void stencilFuncSeparate(int face, int func, int ref, int mask);

  /**
   * The WebGLRenderingContext.stencilMask() method of the WebGL API controls enabling and disabling of both the front and back writing of individual bits in the stencil planes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/stencilMask">WebGLRenderingContext.stencilMask - MDN</a>
   */
  public native void stencilMask(int mask);

  /**
   * The WebGLRenderingContext.stencilMaskSeparate() method of the WebGL API controls enabling and disabling of front and/or back writing of individual bits in the stencil planes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/stencilMaskSeparate">WebGLRenderingContext.stencilMaskSeparate - MDN</a>
   */
  public native void stencilMaskSeparate(int face, int mask);

  /**
   * The WebGLRenderingContext.stencilOp() method of the WebGL API sets both the front and back-facing stencil test actions.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/stencilOp">WebGLRenderingContext.stencilOp - MDN</a>
   */
  public native void stencilOp(int fail, int zfail, int zpass);

  /**
   * The WebGLRenderingContext.stencilOpSeparate() method of the WebGL API sets the front and/or back-facing stencil test actions.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/stencilOpSeparate">WebGLRenderingContext.stencilOpSeparate - MDN</a>
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
   */
  public native void useProgram(@Nullable WebGLProgram program);

  /**
   * The WebGLRenderingContext.validateProgram() method of the WebGL API validates a WebGLProgram. It checks if it is successfully linked and if it can be used in the current WebGL state.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/validateProgram">WebGLRenderingContext.validateProgram - MDN</a>
   */
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

  /**
   * The WebGLRenderingContext.vertexAttribPointer() method of the WebGL API binds the buffer currently bound to gl.ARRAY_BUFFER to a generic vertex attribute of the current vertex buffer object and specifies its layout.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttribPointer">WebGLRenderingContext.vertexAttribPointer - MDN</a>
   */
  public native void vertexAttribPointer(int index, int size, int type, boolean normalized,
      int stride, int offset);

  /**
   * The WebGLRenderingContext.viewport() method of the WebGL API sets the viewport, which specifies the affine transformation of x and y from normalized device coordinates to window coordinates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/viewport">WebGLRenderingContext.viewport - MDN</a>
   */
  public native void viewport(int x, int y, int width, int height);

  @Nonnull
  public native Promise<Void> makeXRCompatible();

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, int size, int usage);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nullable BufferSource srcData, int usage);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull ArrayBufferView srcData, int usage);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Int8Array srcData, int usage);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Int16Array srcData, int usage);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Int32Array srcData, int usage);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Uint8Array srcData, int usage);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Uint16Array srcData, int usage);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Uint32Array srcData, int usage);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Uint8ClampedArray srcData, int usage);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Float32Array srcData, int usage);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Float64Array srcData, int usage);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull DataView srcData, int usage);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull ArrayBuffer srcData, int usage);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull ArrayBufferView srcData, int usage,
      int srcOffset, int length);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Int8Array srcData, int usage, int srcOffset,
      int length);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Int16Array srcData, int usage, int srcOffset,
      int length);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Int32Array srcData, int usage, int srcOffset,
      int length);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Uint8Array srcData, int usage, int srcOffset,
      int length);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Uint16Array srcData, int usage, int srcOffset,
      int length);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Uint32Array srcData, int usage, int srcOffset,
      int length);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Uint8ClampedArray srcData, int usage,
      int srcOffset, int length);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Float32Array srcData, int usage, int srcOffset,
      int length);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Float64Array srcData, int usage, int srcOffset,
      int length);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull DataView srcData, int usage, int srcOffset,
      int length);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull ArrayBufferView srcData, int usage,
      int srcOffset);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Int8Array srcData, int usage, int srcOffset);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Int16Array srcData, int usage, int srcOffset);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Int32Array srcData, int usage, int srcOffset);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Uint8Array srcData, int usage, int srcOffset);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Uint16Array srcData, int usage, int srcOffset);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Uint32Array srcData, int usage, int srcOffset);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Uint8ClampedArray srcData, int usage,
      int srcOffset);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Float32Array srcData, int usage,
      int srcOffset);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull Float64Array srcData, int usage,
      int srcOffset);

  /**
   * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferData">WebGLRenderingContext.bufferData - MDN</a>
   */
  public native void bufferData(int target, @Nonnull DataView srcData, int usage, int srcOffset);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull BufferSource srcData);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull ArrayBufferView srcData);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Int8Array srcData);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Int16Array srcData);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Int32Array srcData);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Uint8Array srcData);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Uint16Array srcData);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Uint32Array srcData);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset,
      @Nonnull Uint8ClampedArray srcData);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Float32Array srcData);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Float64Array srcData);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull DataView srcData);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull ArrayBuffer srcData);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull ArrayBufferView srcData,
      int srcOffset, int length);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Int8Array srcData,
      int srcOffset, int length);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Int16Array srcData,
      int srcOffset, int length);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Int32Array srcData,
      int srcOffset, int length);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Uint8Array srcData,
      int srcOffset, int length);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Uint16Array srcData,
      int srcOffset, int length);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Uint32Array srcData,
      int srcOffset, int length);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset,
      @Nonnull Uint8ClampedArray srcData, int srcOffset, int length);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Float32Array srcData,
      int srcOffset, int length);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Float64Array srcData,
      int srcOffset, int length);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull DataView srcData,
      int srcOffset, int length);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull ArrayBufferView srcData,
      int srcOffset);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Int8Array srcData,
      int srcOffset);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Int16Array srcData,
      int srcOffset);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Int32Array srcData,
      int srcOffset);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Uint8Array srcData,
      int srcOffset);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Uint16Array srcData,
      int srcOffset);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Uint32Array srcData,
      int srcOffset);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset,
      @Nonnull Uint8ClampedArray srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Float32Array srcData,
      int srcOffset);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
  public native void bufferSubData(int target, int dstByteOffset, @Nonnull Float64Array srcData,
      int srcOffset);

  /**
   * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data store.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/bufferSubData">WebGLRenderingContext.bufferSubData - MDN</a>
   */
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

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, int imageSize, int offset);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull ArrayBufferView srcData, int srcOffset,
      int srcLengthOverride);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Int8Array srcData, int srcOffset,
      int srcLengthOverride);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Int16Array srcData, int srcOffset,
      int srcLengthOverride);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Int32Array srcData, int srcOffset,
      int srcLengthOverride);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint8Array srcData, int srcOffset,
      int srcLengthOverride);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint16Array srcData, int srcOffset,
      int srcLengthOverride);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint32Array srcData, int srcOffset,
      int srcLengthOverride);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint8ClampedArray srcData, int srcOffset,
      int srcLengthOverride);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Float32Array srcData, int srcOffset,
      int srcLengthOverride);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Float64Array srcData, int srcOffset,
      int srcLengthOverride);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull DataView srcData, int srcOffset,
      int srcLengthOverride);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull ArrayBufferView srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Int8Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Int16Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Int32Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint8Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint16Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint32Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint8ClampedArray srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Float32Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Float64Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull DataView srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull ArrayBufferView srcData);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Int8Array srcData);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Int16Array srcData);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Int32Array srcData);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint8Array srcData);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint16Array srcData);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint32Array srcData);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Uint8ClampedArray srcData);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Float32Array srcData);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull Float64Array srcData);

  /**
   * The WebGLRenderingContext.compressedTexSubImage2D() method of the WebGL API specifies a two-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D">WebGLRenderingContext.compressedTexSubImage2D - MDN</a>
   */
  public native void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset,
      int width, int height, int format, @Nonnull DataView srcData);

  /**
   * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into an ArrayBufferView object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels">WebGLRenderingContext.readPixels - MDN</a>
   */
  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nullable ArrayBufferView dstData);

  /**
   * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into an ArrayBufferView object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels">WebGLRenderingContext.readPixels - MDN</a>
   */
  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Int8Array dstData);

  /**
   * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into an ArrayBufferView object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels">WebGLRenderingContext.readPixels - MDN</a>
   */
  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Int16Array dstData);

  /**
   * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into an ArrayBufferView object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels">WebGLRenderingContext.readPixels - MDN</a>
   */
  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Int32Array dstData);

  /**
   * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into an ArrayBufferView object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels">WebGLRenderingContext.readPixels - MDN</a>
   */
  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Uint8Array dstData);

  /**
   * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into an ArrayBufferView object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels">WebGLRenderingContext.readPixels - MDN</a>
   */
  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Uint16Array dstData);

  /**
   * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into an ArrayBufferView object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels">WebGLRenderingContext.readPixels - MDN</a>
   */
  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Uint32Array dstData);

  /**
   * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into an ArrayBufferView object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels">WebGLRenderingContext.readPixels - MDN</a>
   */
  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Uint8ClampedArray dstData);

  /**
   * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into an ArrayBufferView object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels">WebGLRenderingContext.readPixels - MDN</a>
   */
  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Float32Array dstData);

  /**
   * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into an ArrayBufferView object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels">WebGLRenderingContext.readPixels - MDN</a>
   */
  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Float64Array dstData);

  /**
   * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into an ArrayBufferView object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels">WebGLRenderingContext.readPixels - MDN</a>
   */
  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull DataView dstData);

  /**
   * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into an ArrayBufferView object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels">WebGLRenderingContext.readPixels - MDN</a>
   */
  public native void readPixels(int x, int y, int width, int height, int format, int type,
      int offset);

  /**
   * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into an ArrayBufferView object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels">WebGLRenderingContext.readPixels - MDN</a>
   */
  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull ArrayBufferView dstData, int dstOffset);

  /**
   * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into an ArrayBufferView object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels">WebGLRenderingContext.readPixels - MDN</a>
   */
  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Int8Array dstData, int dstOffset);

  /**
   * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into an ArrayBufferView object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels">WebGLRenderingContext.readPixels - MDN</a>
   */
  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Int16Array dstData, int dstOffset);

  /**
   * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into an ArrayBufferView object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels">WebGLRenderingContext.readPixels - MDN</a>
   */
  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Int32Array dstData, int dstOffset);

  /**
   * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into an ArrayBufferView object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels">WebGLRenderingContext.readPixels - MDN</a>
   */
  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Uint8Array dstData, int dstOffset);

  /**
   * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into an ArrayBufferView object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels">WebGLRenderingContext.readPixels - MDN</a>
   */
  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Uint16Array dstData, int dstOffset);

  /**
   * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into an ArrayBufferView object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels">WebGLRenderingContext.readPixels - MDN</a>
   */
  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Uint32Array dstData, int dstOffset);

  /**
   * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into an ArrayBufferView object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels">WebGLRenderingContext.readPixels - MDN</a>
   */
  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Uint8ClampedArray dstData, int dstOffset);

  /**
   * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into an ArrayBufferView object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels">WebGLRenderingContext.readPixels - MDN</a>
   */
  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Float32Array dstData, int dstOffset);

  /**
   * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into an ArrayBufferView object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels">WebGLRenderingContext.readPixels - MDN</a>
   */
  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull Float64Array dstData, int dstOffset);

  /**
   * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle of the current color framebuffer into an ArrayBufferView object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/readPixels">WebGLRenderingContext.readPixels - MDN</a>
   */
  public native void readPixels(int x, int y, int width, int height, int format, int type,
      @Nonnull DataView dstData, int dstOffset);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nullable ArrayBufferView pixels);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Int8Array pixels);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Int16Array pixels);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Int32Array pixels);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Uint8Array pixels);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Uint16Array pixels);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Uint32Array pixels);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Uint8ClampedArray pixels);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Float32Array pixels);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Float64Array pixels);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull DataView pixels);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int format, int type,
      @Nonnull TexImageSource source);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int format, int type,
      @Nonnull ImageBitmap source);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int format, int type,
      @Nonnull ImageData source);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int format, int type,
      @Nonnull HTMLImageElement source);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int format, int type,
      @Nonnull HTMLCanvasElement source);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int format, int type,
      @Nonnull HTMLVideoElement source);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int format, int type,
      @Nonnull OffscreenCanvas source);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, int pboOffset);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull TexImageSource source);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull ImageBitmap source);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull ImageData source);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull HTMLImageElement source);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull HTMLCanvasElement source);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull HTMLVideoElement source);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull OffscreenCanvas source);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull ArrayBufferView srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Int8Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Int16Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Int32Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Uint8Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Uint16Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Uint32Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Uint8ClampedArray srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Float32Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull Float64Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texImage2D() method of the WebGL API specifies a two-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D">WebGLRenderingContext.texImage2D - MDN</a>
   */
  public native void texImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, @Nonnull DataView srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nullable ArrayBufferView pixels);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Int8Array pixels);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Int16Array pixels);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Int32Array pixels);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Uint8Array pixels);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Uint16Array pixels);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Uint32Array pixels);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Uint8ClampedArray pixels);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Float32Array pixels);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Float64Array pixels);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull DataView pixels);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int format,
      int type, @Nonnull TexImageSource source);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int format,
      int type, @Nonnull ImageBitmap source);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int format,
      int type, @Nonnull ImageData source);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int format,
      int type, @Nonnull HTMLImageElement source);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int format,
      int type, @Nonnull HTMLCanvasElement source);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int format,
      int type, @Nonnull HTMLVideoElement source);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int format,
      int type, @Nonnull OffscreenCanvas source);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, int pboOffset);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull TexImageSource source);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull ImageBitmap source);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull ImageData source);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull HTMLImageElement source);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull HTMLCanvasElement source);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull HTMLVideoElement source);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull OffscreenCanvas source);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull ArrayBufferView srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Int8Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Int16Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Int32Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Uint8Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Uint16Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Uint32Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Uint8ClampedArray srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Float32Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
  public native void texSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, @Nonnull Float64Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texSubImage2D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texSubImage2D">WebGLRenderingContext.texSubImage2D - MDN</a>
   */
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

  /**
   * The WebGL2RenderingContext.beginQuery() method of the WebGL 2 API starts an asynchronous query. The target parameter indicates which kind of query to begin.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/beginQuery">WebGL2RenderingContext.beginQuery - MDN</a>
   */
  public native void beginQuery(int target, @Nonnull WebGLQuery query);

  /**
   * The WebGL2RenderingContext.beginTransformFeedback() method of the WebGL 2 API starts a transform feedback operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/beginTransformFeedback">WebGL2RenderingContext.beginTransformFeedback - MDN</a>
   */
  public native void beginTransformFeedback(int primitiveMode);

  /**
   * The WebGL2RenderingContext.bindBufferBase() method of the WebGL 2 API binds a given WebGLBuffer to a given binding point (target) at a given index.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/bindBufferBase">WebGL2RenderingContext.bindBufferBase - MDN</a>
   */
  public native void bindBufferBase(int target, int index, @Nullable WebGLBuffer buffer);

  /**
   * The WebGL2RenderingContext.bindBufferRange() method of the WebGL 2 API binds a range of a given WebGLBuffer to a given binding point (target) at a given index.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/bindBufferRange">WebGL2RenderingContext.bindBufferRange - MDN</a>
   */
  public native void bindBufferRange(int target, int index, @Nullable WebGLBuffer buffer,
      int offset, int size);

  /**
   * The WebGL2RenderingContext.bindSampler() method of the WebGL 2 API binds a passed WebGLSampler object to the texture unit at the passed index.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/bindSampler">WebGL2RenderingContext.bindSampler - MDN</a>
   */
  public native void bindSampler(int unit, @Nullable WebGLSampler sampler);

  /**
   * The WebGL2RenderingContext.bindTransformFeedback() method of the WebGL 2 API binds a passed WebGLTransformFeedback object to the current GL state.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/bindTransformFeedback">WebGL2RenderingContext.bindTransformFeedback - MDN</a>
   */
  public native void bindTransformFeedback(int target, @Nullable WebGLTransformFeedback tf);

  /**
   * The WebGL2RenderingContext.bindVertexArray() method of the WebGL 2 API binds a passed WebGLVertexArrayObject object to the buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/bindVertexArray">WebGL2RenderingContext.bindVertexArray - MDN</a>
   */
  public native void bindVertexArray(@Nullable WebGLVertexArrayObject array);

  /**
   * The WebGL2RenderingContext.blitFramebuffer() method of the WebGL 2 API transfers a block of pixels from the read framebuffer to the draw framebuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/blitFramebuffer">WebGL2RenderingContext.blitFramebuffer - MDN</a>
   */
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

  /**
   * The WebGL2RenderingContext.clientWaitSync() method of the WebGL 2 API blocks and waits for a WebGLSync object to become signaled or a given timeout to be passed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/clientWaitSync">WebGL2RenderingContext.clientWaitSync - MDN</a>
   */
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

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, int imageSize, int offset);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull ArrayBufferView srcData,
      int srcOffset, int srcLengthOverride);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Int8Array srcData,
      int srcOffset, int srcLengthOverride);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Int16Array srcData,
      int srcOffset, int srcLengthOverride);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Int32Array srcData,
      int srcOffset, int srcLengthOverride);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Uint8Array srcData,
      int srcOffset, int srcLengthOverride);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Uint16Array srcData,
      int srcOffset, int srcLengthOverride);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Uint32Array srcData,
      int srcOffset, int srcLengthOverride);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Uint8ClampedArray srcData,
      int srcOffset, int srcLengthOverride);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Float32Array srcData,
      int srcOffset, int srcLengthOverride);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Float64Array srcData,
      int srcOffset, int srcLengthOverride);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull DataView srcData,
      int srcOffset, int srcLengthOverride);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull ArrayBufferView srcData,
      int srcOffset);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Int8Array srcData,
      int srcOffset);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Int16Array srcData,
      int srcOffset);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Int32Array srcData,
      int srcOffset);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Uint8Array srcData,
      int srcOffset);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Uint16Array srcData,
      int srcOffset);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Uint32Array srcData,
      int srcOffset);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Uint8ClampedArray srcData,
      int srcOffset);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Float32Array srcData,
      int srcOffset);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Float64Array srcData,
      int srcOffset);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull DataView srcData,
      int srcOffset);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull ArrayBufferView srcData);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Int8Array srcData);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Int16Array srcData);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Int32Array srcData);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Uint8Array srcData);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Uint16Array srcData);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Uint32Array srcData);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format,
      @Nonnull Uint8ClampedArray srcData);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Float32Array srcData);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull Float64Array srcData);

  /**
   * The WebGL2RenderingContext.compressedTexSubImage3D() method of the WebGL API specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/compressedTexSubImage3D">WebGL2RenderingContext.compressedTexSubImage3D - MDN</a>
   */
  public native void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset,
      int zoffset, int width, int height, int depth, int format, @Nonnull DataView srcData);

  /**
   * The WebGL2RenderingContext.copyBufferSubData() method of the WebGL 2 API copies part of the data of a buffer to another buffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/copyBufferSubData">WebGL2RenderingContext.copyBufferSubData - MDN</a>
   */
  public native void copyBufferSubData(int readTarget, int writeTarget, int readOffset,
      int writeOffset, int size);

  /**
   * The WebGL2RenderingContext.copyTexSubImage3D() method of the WebGL API copies pixels from the current WebGLFramebuffer into an existing 3D texture sub-image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/copyTexSubImage3D">WebGL2RenderingContext.copyTexSubImage3D - MDN</a>
   */
  public native void copyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int x, int y, int width, int height);

  /**
   * The WebGL2RenderingContext.createQuery() method of the WebGL 2 API creates and initializes WebGLQuery objects, which provide ways to asynchronously query for information.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/createQuery">WebGL2RenderingContext.createQuery - MDN</a>
   */
  @Nullable
  public native WebGLQuery createQuery();

  /**
   * The WebGL2RenderingContext.createSampler() method of the WebGL 2 API creates and initializes WebGLSampler objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/createSampler">WebGL2RenderingContext.createSampler - MDN</a>
   */
  @Nullable
  public native WebGLSampler createSampler();

  /**
   * The WebGL2RenderingContext.createTransformFeedback() method of the WebGL 2 API creates and initializes WebGLTransformFeedback objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/createTransformFeedback">WebGL2RenderingContext.createTransformFeedback - MDN</a>
   */
  @Nullable
  public native WebGLTransformFeedback createTransformFeedback();

  /**
   * The WebGL2RenderingContext.createVertexArray() method of the WebGL 2 API creates and initializes a WebGLVertexArrayObject object that represents a vertex array object (VAO) pointing to vertex array data and which provides names for different sets of vertex data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/createVertexArray">WebGL2RenderingContext.createVertexArray - MDN</a>
   */
  @Nullable
  public native WebGLVertexArrayObject createVertexArray();

  /**
   * The WebGL2RenderingContext.deleteQuery() method of the WebGL 2 API deletes a given WebGLQuery object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/deleteQuery">WebGL2RenderingContext.deleteQuery - MDN</a>
   */
  public native void deleteQuery(@Nullable WebGLQuery query);

  /**
   * The WebGL2RenderingContext.deleteSampler() method of the WebGL 2 API deletes a given WebGLSampler object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/deleteSampler">WebGL2RenderingContext.deleteSampler - MDN</a>
   */
  public native void deleteSampler(@Nullable WebGLSampler sampler);

  /**
   * The WebGL2RenderingContext.deleteSync() method of the WebGL 2 API deletes a given WebGLSync object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/deleteSync">WebGL2RenderingContext.deleteSync - MDN</a>
   */
  public native void deleteSync(@Nullable WebGLSync sync);

  /**
   * The WebGL2RenderingContext.deleteTransformFeedback() method of the WebGL 2 API deletes a given WebGLTransformFeedback object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/deleteTransformFeedback">WebGL2RenderingContext.deleteTransformFeedback - MDN</a>
   */
  public native void deleteTransformFeedback(@Nullable WebGLTransformFeedback tf);

  /**
   * The WebGL2RenderingContext.deleteVertexArray() method of the WebGL 2 API deletes a given WebGLVertexArrayObject object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/deleteVertexArray">WebGL2RenderingContext.deleteVertexArray - MDN</a>
   */
  public native void deleteVertexArray(@Nullable WebGLVertexArrayObject vertexArray);

  /**
   * The WebGL2RenderingContext.drawArraysInstanced() method of the WebGL 2 API renders primitives from array data like the gl.drawArrays() method. In addition, it can execute multiple instances of the range of elements.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/drawArraysInstanced">WebGL2RenderingContext.drawArraysInstanced - MDN</a>
   */
  public native void drawArraysInstanced(int mode, int first, int count, int instanceCount);

  /**
   * The WebGL2RenderingContext.drawBuffers() method of the WebGL 2 API defines draw buffers to which fragment colors are written into. The draw buffer settings are part of the state of the currently bound framebuffer or the drawingbuffer if no framebuffer is bound.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/drawBuffers">WebGL2RenderingContext.drawBuffers - MDN</a>
   */
  public native void drawBuffers(@Nonnull JsArray<Double> buffers);

  /**
   * The WebGL2RenderingContext.drawBuffers() method of the WebGL 2 API defines draw buffers to which fragment colors are written into. The draw buffer settings are part of the state of the currently bound framebuffer or the drawingbuffer if no framebuffer is bound.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/drawBuffers">WebGL2RenderingContext.drawBuffers - MDN</a>
   */
  public native void drawBuffers(@Nonnull Double[] buffers);

  /**
   * The WebGL2RenderingContext.drawElementsInstanced() method of the WebGL 2 API renders primitives from array data like the gl.drawElements() method. In addition, it can execute multiple instances of a set of elements.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/drawElementsInstanced">WebGL2RenderingContext.drawElementsInstanced - MDN</a>
   */
  public native void drawElementsInstanced(int mode, int count, int type, int offset,
      int instanceCount);

  /**
   * The WebGL2RenderingContext.drawRangeElements() method of the WebGL API renders primitives from array data in a given range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/drawRangeElements">WebGL2RenderingContext.drawRangeElements - MDN</a>
   */
  public native void drawRangeElements(int mode, int start, int end, int count, int type,
      int offset);

  /**
   * The WebGL2RenderingContext.endQuery() method of the WebGL 2 API marks the end of a given query target.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/endQuery">WebGL2RenderingContext.endQuery - MDN</a>
   */
  public native void endQuery(int target);

  /**
   * The WebGL2RenderingContext.endTransformFeedback() method of the WebGL 2 API ends a transform feedback operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/endTransformFeedback">WebGL2RenderingContext.endTransformFeedback - MDN</a>
   */
  public native void endTransformFeedback();

  /**
   * The WebGL2RenderingContext.fenceSync() method of the WebGL 2 API creates a new WebGLSync object and inserts it into the GL command stream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/fenceSync">WebGL2RenderingContext.fenceSync - MDN</a>
   */
  @Nullable
  public native WebGLSync fenceSync(int condition, int flags);

  /**
   * The WebGL2RenderingContext.framebufferTextureLayer() method of the WebGL 2 API attaches a single layer of a texture to a framebuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/framebufferTextureLayer">WebGL2RenderingContext.framebufferTextureLayer - MDN</a>
   */
  public native void framebufferTextureLayer(int target, int attachment,
      @Nullable WebGLTexture texture, int level, int layer);

  /**
   * The WebGL2RenderingContext.getActiveUniformBlockName() method of the WebGL 2 API retrieves the name of the active uniform block at a given index within a WebGLProgram.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getActiveUniformBlockName">WebGL2RenderingContext.getActiveUniformBlockName - MDN</a>
   */
  @Nullable
  public native String getActiveUniformBlockName(@Nonnull WebGLProgram program,
      int uniformBlockIndex);

  /**
   * The WebGL2RenderingContext.getActiveUniformBlockParameter() method of the WebGL 2 API retrieves information about an active uniform block within a WebGLProgram.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getActiveUniformBlockParameter">WebGL2RenderingContext.getActiveUniformBlockParameter - MDN</a>
   */
  @Nullable
  public native Any getActiveUniformBlockParameter(@Nonnull WebGLProgram program,
      int uniformBlockIndex, int pname);

  /**
   * The WebGL2RenderingContext.getActiveUniforms() method of the WebGL 2 API retrieves information about active uniforms within a WebGLProgram.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getActiveUniforms">WebGL2RenderingContext.getActiveUniforms - MDN</a>
   */
  @Nullable
  public native Any getActiveUniforms(@Nonnull WebGLProgram program,
      @Nonnull JsArray<Double> uniformIndices, int pname);

  /**
   * The WebGL2RenderingContext.getActiveUniforms() method of the WebGL 2 API retrieves information about active uniforms within a WebGLProgram.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getActiveUniforms">WebGL2RenderingContext.getActiveUniforms - MDN</a>
   */
  @Nullable
  public native Any getActiveUniforms(@Nonnull WebGLProgram program,
      @Nonnull Double[] uniformIndices, int pname);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull ArrayBufferView dstBuffer, int dstOffset, int length);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Int8Array dstBuffer,
      int dstOffset, int length);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Int16Array dstBuffer,
      int dstOffset, int length);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Int32Array dstBuffer,
      int dstOffset, int length);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Uint8Array dstBuffer,
      int dstOffset, int length);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Uint16Array dstBuffer,
      int dstOffset, int length);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Uint32Array dstBuffer,
      int dstOffset, int length);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull Uint8ClampedArray dstBuffer, int dstOffset, int length);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull Float32Array dstBuffer, int dstOffset, int length);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull Float64Array dstBuffer, int dstOffset, int length);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull DataView dstBuffer,
      int dstOffset, int length);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull ArrayBufferView dstBuffer, int dstOffset);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Int8Array dstBuffer,
      int dstOffset);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Int16Array dstBuffer,
      int dstOffset);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Int32Array dstBuffer,
      int dstOffset);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Uint8Array dstBuffer,
      int dstOffset);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Uint16Array dstBuffer,
      int dstOffset);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Uint32Array dstBuffer,
      int dstOffset);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull Uint8ClampedArray dstBuffer, int dstOffset);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull Float32Array dstBuffer, int dstOffset);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull Float64Array dstBuffer, int dstOffset);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull DataView dstBuffer,
      int dstOffset);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull ArrayBufferView dstBuffer);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Int8Array dstBuffer);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Int16Array dstBuffer);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Int32Array dstBuffer);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull Uint8Array dstBuffer);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull Uint16Array dstBuffer);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull Uint32Array dstBuffer);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull Uint8ClampedArray dstBuffer);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull Float32Array dstBuffer);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset,
      @Nonnull Float64Array dstBuffer);

  /**
   * The WebGL2RenderingContext.getBufferSubData() method of the WebGL 2 API reads data from a buffer binding point and writes them to an ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getBufferSubData">WebGL2RenderingContext.getBufferSubData - MDN</a>
   */
  public native void getBufferSubData(int target, int srcByteOffset, @Nonnull DataView dstBuffer);

  /**
   * The WebGL2RenderingContext.getFragDataLocation() method of the WebGL 2 API returns the binding of color numbers to user-defined varying out variables.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getFragDataLocation">WebGL2RenderingContext.getFragDataLocation - MDN</a>
   */
  public native int getFragDataLocation(@Nonnull WebGLProgram program, @Nonnull String name);

  /**
   * The WebGL2RenderingContext.getIndexedParameter() method of the WebGL 2 API returns indexed information about a given target.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getIndexedParameter">WebGL2RenderingContext.getIndexedParameter - MDN</a>
   */
  @Nullable
  public native Any getIndexedParameter(int target, int index);

  /**
   * The WebGL2RenderingContext.getInternalformatParameter() method of the WebGL 2 API returns information about implementation-dependent support for internal formats.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getInternalformatParameter">WebGL2RenderingContext.getInternalformatParameter - MDN</a>
   */
  @Nullable
  public native Any getInternalformatParameter(int target, int internalformat, int pname);

  /**
   * The WebGL2RenderingContext.getQuery() method of the WebGL 2 API returns the currently active WebGLQuery for the target, or null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getQuery">WebGL2RenderingContext.getQuery - MDN</a>
   */
  @Nullable
  public native WebGLQuery getQuery(int target, int pname);

  /**
   * The WebGL2RenderingContext.getQueryParameter() method of the WebGL 2 API returns parameter information of a WebGLQuery object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getQueryParameter">WebGL2RenderingContext.getQueryParameter - MDN</a>
   */
  @Nullable
  public native Any getQueryParameter(@Nonnull WebGLQuery query, int pname);

  /**
   * The WebGL2RenderingContext.getSamplerParameter() method of the WebGL 2 API returns parameter information of a WebGLSampler object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getSamplerParameter">WebGL2RenderingContext.getSamplerParameter - MDN</a>
   */
  @Nullable
  public native Any getSamplerParameter(@Nonnull WebGLSampler sampler, int pname);

  /**
   * The WebGL2RenderingContext.getSyncParameter() method of the WebGL 2 API returns parameter information of a WebGLSync object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getSyncParameter">WebGL2RenderingContext.getSyncParameter - MDN</a>
   */
  @Nullable
  public native Any getSyncParameter(@Nonnull WebGLSync sync, int pname);

  /**
   * The WebGL2RenderingContext.getTransformFeedbackVarying() method of the WebGL 2 API returns information about varying variables from WebGLTransformFeedback buffers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getTransformFeedbackVarying">WebGL2RenderingContext.getTransformFeedbackVarying - MDN</a>
   */
  @Nullable
  public native WebGLActiveInfo getTransformFeedbackVarying(@Nonnull WebGLProgram program,
      int index);

  /**
   * The WebGL2RenderingContext.getUniformBlockIndex() method of the WebGL 2 API retrieves the index of a uniform block within a WebGLProgram.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getUniformBlockIndex">WebGL2RenderingContext.getUniformBlockIndex - MDN</a>
   */
  public native int getUniformBlockIndex(@Nonnull WebGLProgram program,
      @Nonnull String uniformBlockName);

  /**
   * The WebGL2RenderingContext.getUniformIndices() method of the WebGL 2 API retrieves the indices of a number of uniforms within a WebGLProgram.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getUniformIndices">WebGL2RenderingContext.getUniformIndices - MDN</a>
   */
  @Nullable
  public native JsArray<Double> getUniformIndices(@Nonnull WebGLProgram program,
      @Nonnull JsArray<String> uniformNames);

  /**
   * The WebGL2RenderingContext.getUniformIndices() method of the WebGL 2 API retrieves the indices of a number of uniforms within a WebGLProgram.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/getUniformIndices">WebGL2RenderingContext.getUniformIndices - MDN</a>
   */
  @Nullable
  public native JsArray<Double> getUniformIndices(@Nonnull WebGLProgram program,
      @Nonnull String[] uniformNames);

  /**
   * The WebGL2RenderingContext.invalidateFramebuffer() method of the WebGL 2 API invalidates the contents of attachments in a framebuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/invalidateFramebuffer">WebGL2RenderingContext.invalidateFramebuffer - MDN</a>
   */
  public native void invalidateFramebuffer(int target, @Nonnull JsArray<Double> attachments);

  /**
   * The WebGL2RenderingContext.invalidateFramebuffer() method of the WebGL 2 API invalidates the contents of attachments in a framebuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/invalidateFramebuffer">WebGL2RenderingContext.invalidateFramebuffer - MDN</a>
   */
  public native void invalidateFramebuffer(int target, @Nonnull Double[] attachments);

  /**
   * The WebGL2RenderingContext.invalidateSubFramebuffer() method of the WebGL 2 API invalidates portions of the contents of attachments in a framebuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/invalidateSubFramebuffer">WebGL2RenderingContext.invalidateSubFramebuffer - MDN</a>
   */
  public native void invalidateSubFramebuffer(int target, @Nonnull JsArray<Double> attachments,
      int x, int y, int width, int height);

  /**
   * The WebGL2RenderingContext.invalidateSubFramebuffer() method of the WebGL 2 API invalidates portions of the contents of attachments in a framebuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/invalidateSubFramebuffer">WebGL2RenderingContext.invalidateSubFramebuffer - MDN</a>
   */
  public native void invalidateSubFramebuffer(int target, @Nonnull Double[] attachments, int x,
      int y, int width, int height);

  /**
   * The WebGL2RenderingContext.isQuery() method of the WebGL 2 API returns true if the passed object is a valid WebGLQuery object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/isQuery">WebGL2RenderingContext.isQuery - MDN</a>
   */
  public native boolean isQuery(@Nullable WebGLQuery query);

  /**
   * The WebGL2RenderingContext.isSampler() method of the WebGL 2 API returns true if the passed object is a valid WebGLSampler object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/isSampler">WebGL2RenderingContext.isSampler - MDN</a>
   */
  public native boolean isSampler(@Nullable WebGLSampler sampler);

  /**
   * The WebGL2RenderingContext.isSync() method of the WebGL 2 API returns true if the passed object is a valid WebGLSync object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/isSync">WebGL2RenderingContext.isSync - MDN</a>
   */
  public native boolean isSync(@Nullable WebGLSync sync);

  /**
   * The WebGL2RenderingContext.isTransformFeedback() method of the WebGL 2 API returns true if the passed object is a valid WebGLTransformFeedback object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/isTransformFeedback">WebGL2RenderingContext.isTransformFeedback - MDN</a>
   */
  public native boolean isTransformFeedback(@Nullable WebGLTransformFeedback tf);

  /**
   * The WebGL2RenderingContext.isVertexArray() method of the WebGL API returns true if the passed object is a valid WebGLVertexArrayObject object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/isVertexArray">WebGL2RenderingContext.isVertexArray - MDN</a>
   */
  public native boolean isVertexArray(@Nullable WebGLVertexArrayObject vertexArray);

  /**
   * The WebGL2RenderingContext.pauseTransformFeedback() method of the WebGL 2 API pauses a transform feedback operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/pauseTransformFeedback">WebGL2RenderingContext.pauseTransformFeedback - MDN</a>
   */
  public native void pauseTransformFeedback();

  /**
   * The WebGL2RenderingContext.readBuffer() method of the WebGL 2 API selects a color buffer as the source for pixels for subsequent calls to copyTexImage2D, copyTexSubImage2D, copyTexSubImage3D or readPixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/readBuffer">WebGL2RenderingContext.readBuffer - MDN</a>
   */
  public native void readBuffer(int src);

  /**
   * The WebGL2RenderingContext.renderbufferStorageMultisample() method of the WebGL 2 API returns creates and initializes a renderbuffer object's data store and allows specifying a number of samples to be used.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/renderbufferStorageMultisample">WebGL2RenderingContext.renderbufferStorageMultisample - MDN</a>
   */
  public native void renderbufferStorageMultisample(int target, int samples, int internalformat,
      int width, int height);

  /**
   * The WebGL2RenderingContext.resumeTransformFeedback() method of the WebGL 2 API resumes a transform feedback operation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/resumeTransformFeedback">WebGL2RenderingContext.resumeTransformFeedback - MDN</a>
   */
  public native void resumeTransformFeedback();

  public native void samplerParameterf(@Nonnull WebGLSampler sampler, int pname, float param);

  public native void samplerParameteri(@Nonnull WebGLSampler sampler, int pname, int param);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, int pboOffset);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull TexImageSource source);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull ImageBitmap source);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull ImageData source);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull HTMLImageElement source);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull HTMLCanvasElement source);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull HTMLVideoElement source);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull OffscreenCanvas source);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nullable ArrayBufferView srcData);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Int8Array srcData);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Int16Array srcData);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Int32Array srcData);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Uint8Array srcData);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Uint16Array srcData);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Uint32Array srcData);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Uint8ClampedArray srcData);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Float32Array srcData);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Float64Array srcData);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull DataView srcData);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull ArrayBufferView srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Int8Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Int16Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Int32Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Uint8Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Uint16Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Uint32Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Uint8ClampedArray srcData,
      int srcOffset);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Float32Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull Float64Array srcData, int srcOffset);

  /**
   * The WebGLRenderingContext.texImage3D() method of the WebGL API specifies a three-dimensional texture image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texImage3D">WebGL2RenderingContext.texImage3D - MDN</a>
   */
  public native void texImage3D(int target, int level, int internalformat, int width, int height,
      int depth, int border, int format, int type, @Nonnull DataView srcData, int srcOffset);

  /**
   * The WebGL2RenderingContext.texStorage2D() method of the WebGL API specifies all levels of two-dimensional texture storage.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texStorage2D">WebGL2RenderingContext.texStorage2D - MDN</a>
   */
  public native void texStorage2D(int target, int levels, int internalformat, int width,
      int height);

  /**
   * The WebGL2RenderingContext.texStorage3D() method of the WebGL API specifies all levels of a three-dimensional texture or two-dimensional array texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texStorage3D">WebGL2RenderingContext.texStorage3D - MDN</a>
   */
  public native void texStorage3D(int target, int levels, int internalformat, int width, int height,
      int depth);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, int pboOffset);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull TexImageSource source);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull ImageBitmap source);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull ImageData source);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull HTMLImageElement source);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull HTMLCanvasElement source);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull HTMLVideoElement source);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull OffscreenCanvas source);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nullable ArrayBufferView srcData,
      int srcOffset);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Int8Array srcData,
      int srcOffset);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Int16Array srcData,
      int srcOffset);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Int32Array srcData,
      int srcOffset);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Uint8Array srcData,
      int srcOffset);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Uint16Array srcData,
      int srcOffset);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Uint32Array srcData,
      int srcOffset);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Uint8ClampedArray srcData,
      int srcOffset);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Float32Array srcData,
      int srcOffset);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Float64Array srcData,
      int srcOffset);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull DataView srcData,
      int srcOffset);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nullable ArrayBufferView srcData);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Int8Array srcData);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Int16Array srcData);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Int32Array srcData);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Uint8Array srcData);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Uint16Array srcData);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Uint32Array srcData);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Uint8ClampedArray srcData);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Float32Array srcData);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull Float64Array srcData);

  /**
   * The WebGL2RenderingContext.texSubImage3D() method of the WebGL API specifies a sub-rectangle of the current texture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/texSubImage3D">WebGL2RenderingContext.texSubImage3D - MDN</a>
   */
  public native void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset,
      int width, int height, int depth, int format, int type, @Nonnull DataView srcData);

  /**
   * The WebGL2RenderingContext.transformFeedbackVaryings() method of the WebGL 2 API specifies values to record in WebGLTransformFeedback buffers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/transformFeedbackVaryings">WebGL2RenderingContext.transformFeedbackVaryings - MDN</a>
   */
  public native void transformFeedbackVaryings(@Nonnull WebGLProgram program,
      @Nonnull JsArray<String> varyings, int bufferMode);

  /**
   * The WebGL2RenderingContext.transformFeedbackVaryings() method of the WebGL 2 API specifies values to record in WebGLTransformFeedback buffers.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/transformFeedbackVaryings">WebGL2RenderingContext.transformFeedbackVaryings - MDN</a>
   */
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

  /**
   * The WebGL2RenderingContext.uniformBlockBinding() method of the WebGL 2 API assigns binding points for active uniform blocks.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/uniformBlockBinding">WebGL2RenderingContext.uniformBlockBinding - MDN</a>
   */
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

  /**
   * The WebGL2RenderingContext.vertexAttribDivisor() method of the WebGL 2 API modifies the rate at which generic vertex attributes advance when rendering multiple instances of primitives with gl.drawArraysInstanced() and gl.drawElementsInstanced().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/vertexAttribDivisor">WebGL2RenderingContext.vertexAttribDivisor - MDN</a>
   */
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

  /**
   * The WebGL2RenderingContext.vertexAttribIPointer() method of the WebGL 2 API specifies integer data formats and locations of vertex attributes in a vertex attributes array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/vertexAttribIPointer">WebGL2RenderingContext.vertexAttribIPointer - MDN</a>
   */
  public native void vertexAttribIPointer(int index, int size, int type, int stride, int offset);

  /**
   * The WebGL2RenderingContext.waitSync() method of the WebGL 2 API returns immediately, but waits on the GL server until the given WebGLSync object is signaled.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/waitSync">WebGL2RenderingContext.waitSync - MDN</a>
   */
  public native void waitSync(@Nonnull WebGLSync sync, int flags, int timeout);
}
