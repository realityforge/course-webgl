package elemental3.gl;

import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The WEBGL_draw_buffers extension is part of the WebGL API and enables a fragment shader to write to several textures, which is useful for deferred shading, for example.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WEBGL_draw_buffers">WEBGL_draw_buffers - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/WEBGL_draw_buffers/">WEBGL_draw_buffers - WEBGL_draw_buffers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class WEBGL_draw_buffers {
  @JsOverlay
  public static final int COLOR_ATTACHMENT0_WEBGL = 0x8CE0;

  @JsOverlay
  public static final int COLOR_ATTACHMENT10_WEBGL = 0x8CEA;

  @JsOverlay
  public static final int COLOR_ATTACHMENT11_WEBGL = 0x8CEB;

  @JsOverlay
  public static final int COLOR_ATTACHMENT12_WEBGL = 0x8CEC;

  @JsOverlay
  public static final int COLOR_ATTACHMENT13_WEBGL = 0x8CED;

  @JsOverlay
  public static final int COLOR_ATTACHMENT14_WEBGL = 0x8CEE;

  @JsOverlay
  public static final int COLOR_ATTACHMENT15_WEBGL = 0x8CEF;

  @JsOverlay
  public static final int COLOR_ATTACHMENT1_WEBGL = 0x8CE1;

  @JsOverlay
  public static final int COLOR_ATTACHMENT2_WEBGL = 0x8CE2;

  @JsOverlay
  public static final int COLOR_ATTACHMENT3_WEBGL = 0x8CE3;

  @JsOverlay
  public static final int COLOR_ATTACHMENT4_WEBGL = 0x8CE4;

  @JsOverlay
  public static final int COLOR_ATTACHMENT5_WEBGL = 0x8CE5;

  @JsOverlay
  public static final int COLOR_ATTACHMENT6_WEBGL = 0x8CE6;

  @JsOverlay
  public static final int COLOR_ATTACHMENT7_WEBGL = 0x8CE7;

  @JsOverlay
  public static final int COLOR_ATTACHMENT8_WEBGL = 0x8CE8;

  @JsOverlay
  public static final int COLOR_ATTACHMENT9_WEBGL = 0x8CE9;

  @JsOverlay
  public static final int DRAW_BUFFER0_WEBGL = 0x8825;

  @JsOverlay
  public static final int DRAW_BUFFER10_WEBGL = 0x882F;

  @JsOverlay
  public static final int DRAW_BUFFER11_WEBGL = 0x8830;

  @JsOverlay
  public static final int DRAW_BUFFER12_WEBGL = 0x8831;

  @JsOverlay
  public static final int DRAW_BUFFER13_WEBGL = 0x8832;

  @JsOverlay
  public static final int DRAW_BUFFER14_WEBGL = 0x8833;

  @JsOverlay
  public static final int DRAW_BUFFER15_WEBGL = 0x8834;

  @JsOverlay
  public static final int DRAW_BUFFER1_WEBGL = 0x8826;

  @JsOverlay
  public static final int DRAW_BUFFER2_WEBGL = 0x8827;

  @JsOverlay
  public static final int DRAW_BUFFER3_WEBGL = 0x8828;

  @JsOverlay
  public static final int DRAW_BUFFER4_WEBGL = 0x8829;

  @JsOverlay
  public static final int DRAW_BUFFER5_WEBGL = 0x882A;

  @JsOverlay
  public static final int DRAW_BUFFER6_WEBGL = 0x882B;

  @JsOverlay
  public static final int DRAW_BUFFER7_WEBGL = 0x882C;

  @JsOverlay
  public static final int DRAW_BUFFER8_WEBGL = 0x882D;

  @JsOverlay
  public static final int DRAW_BUFFER9_WEBGL = 0x882E;

  @JsOverlay
  public static final int MAX_COLOR_ATTACHMENTS_WEBGL = 0x8CDF;

  @JsOverlay
  public static final int MAX_DRAW_BUFFERS_WEBGL = 0x8824;

  protected WEBGL_draw_buffers() {
  }

  /**
   * The WEBGL_draw_buffers.drawBuffersWEBGL() method is part of the WebGL API and allows you to define the draw buffers to which all fragment colors are written.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WEBGL_draw_buffers/drawBuffersWEBGL">WEBGL_draw_buffers.drawBuffersWEBGL - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/extensions/WEBGL_draw_buffers/">WEBGL_draw_buffers - WEBGL_draw_buffers</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glDrawBuffers.xhtml">glDrawBuffers - OpenGL ES 3.0</a>
   */
  public native void drawBuffersWEBGL(@Nonnull JsArray<Double> buffers);

  /**
   * The WEBGL_draw_buffers.drawBuffersWEBGL() method is part of the WebGL API and allows you to define the draw buffers to which all fragment colors are written.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WEBGL_draw_buffers/drawBuffersWEBGL">WEBGL_draw_buffers.drawBuffersWEBGL - MDN</a>
   * @see <a href="https://www.khronos.org/registry/webgl/extensions/WEBGL_draw_buffers/">WEBGL_draw_buffers - WEBGL_draw_buffers</a>
   * @see <a href="https://www.khronos.org/opengles/sdk/docs/man3/html/glDrawBuffers.xhtml">glDrawBuffers - OpenGL ES 3.0</a>
   */
  public native void drawBuffersWEBGL(@Nonnull double[] buffers);
}
