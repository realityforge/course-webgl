package elemental3;

import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The WakeLockSentinel interface of the Screen Wake Lock API provides a handle to the underlying platform wake lock and can be manually released and reacquired. An Object representing the wake lock is returned via the navigator.wakelock.request() method.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WakeLockSentinel">WakeLockSentinel - MDN</a>
 * @see <a href="https://w3c.github.io/screen-wake-lock/#the-wakelocksentinel-interface">WakeLockSentinel - Screen Wake Lock API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WakeLockSentinel"
)
public class WakeLockSentinel extends EventTarget {
  @Nullable
  public EventHandler onrelease;

  protected WakeLockSentinel() {
  }

  /**
   * The read-only released property of the WakeLockSentinel interface returns a boolean that indicates whether a WakeLockSentinel has been released yet.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WakeLockSentinel/released">WakeLockSentinel.released - MDN</a>
   * @see <a href="https://w3c.github.io/screen-wake-lock/#dom-wakelocksentinel-released">released - Screen Wake Lock API</a>
   */
  @JsProperty(
      name = "released"
  )
  public native boolean released();

  /**
   * The read-only type property of the WakeLockSentinel interface returns a String representation of the currently acquired WakeLockSentinel type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WakeLockSentinel/type">WakeLockSentinel.type - MDN</a>
   * @see <a href="https://w3c.github.io/screen-wake-lock/#the-wakelocktype-enum">WakeLockType - Screen Wake Lock API</a>
   */
  @JsProperty(
      name = "type"
  )
  @Nonnull
  @WakeLockType
  public native String type();

  /**
   * The release() method of the WakeLockSentinel interface releases the WakeLockSentinel, returning a Promise that is resolved once the sentinel has been successfully released.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WakeLockSentinel/release">WakeLockSentinel.release - MDN</a>
   * @see <a href="https://w3c.github.io/screen-wake-lock/#the-release-method">release() - Screen Wake Lock API</a>
   */
  @Nonnull
  public native Promise<Void> release();
}
