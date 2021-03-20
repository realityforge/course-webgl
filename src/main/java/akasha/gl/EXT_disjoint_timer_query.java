package akasha.gl;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

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
public class EXT_disjoint_timer_query implements WebGL1Extension {
  @JsOverlay
  public static final int CURRENT_QUERY_EXT = 0x8865;

  @JsOverlay
  public static final int GPU_DISJOINT_EXT = 0x8FBB;

  @JsOverlay
  public static final String NAME = "EXT_disjoint_timer_query";

  @JsOverlay
  public static final int QUERY_COUNTER_BITS_EXT = 0x8864;

  @JsOverlay
  public static final int QUERY_RESULT_AVAILABLE_EXT = 0x8867;

  @JsOverlay
  public static final int QUERY_RESULT_EXT = 0x8866;

  @JsOverlay
  public static final int TIMESTAMP_EXT = 0x8E28;

  @JsOverlay
  public static final int TIME_ELAPSED_EXT = 0x88BF;

  protected EXT_disjoint_timer_query() {
  }

  public native void beginQueryEXT(int target, @Nonnull WebGLTimerQueryEXT query);

  @Nullable
  public native WebGLTimerQueryEXT createQueryEXT();

  public native void deleteQueryEXT(@Nullable WebGLTimerQueryEXT query);

  public native void endQueryEXT(int target);

  @Nullable
  public native Any getQueryEXT(int target, int pname);

  @Nullable
  public native Any getQueryObjectEXT(@Nonnull WebGLTimerQueryEXT query, int pname);

  public native boolean isQueryEXT(@Nullable WebGLTimerQueryEXT query);

  public native void queryCounterEXT(@Nonnull WebGLTimerQueryEXT query, int target);
}
