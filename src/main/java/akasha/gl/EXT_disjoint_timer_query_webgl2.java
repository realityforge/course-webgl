package akasha.gl;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The EXT_disjoint_timer_query extension is part of the WebGL API and provides a way to measure the duration of a set of GL commands, without stalling the rendering pipeline.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/EXT_disjoint_timer_query">EXT_disjoint_timer_query - MDN</a>
 * @see <a href="https://www.khronos.org/registry/webgl/extensions/EXT_disjoint_timer_query/">EXT_disjoint_timer_query - EXT_disjoint_timer_query</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class EXT_disjoint_timer_query_webgl2 implements WebGLExtension {
  @JsOverlay
  public static final int GPU_DISJOINT_EXT = 0x8FBB;

  @JsOverlay
  public static final String NAME = "EXT_disjoint_timer_query_webgl2";

  @JsOverlay
  public static final int QUERY_COUNTER_BITS_EXT = 0x8864;

  @JsOverlay
  public static final int TIMESTAMP_EXT = 0x8E28;

  @JsOverlay
  public static final int TIME_ELAPSED_EXT = 0x88BF;

  protected EXT_disjoint_timer_query_webgl2() {
  }

  public native void queryCounterEXT(@Nonnull WebGLQuery query, int target);
}
