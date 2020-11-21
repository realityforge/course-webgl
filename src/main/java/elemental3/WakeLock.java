package elemental3;

import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The WakeLock interface of the Screen Wake Lock API prevents device screens from dimming or locking when an application needs to keep running.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WakeLock">WakeLock - MDN</a>
 * @see <a href="https://w3c.github.io/screen-wake-lock/#the-wakelock-interface">The definition of 'WakeLock' in the 'Screen Wake Lock API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WakeLock"
)
public class WakeLock {
  protected WakeLock() {
  }

  @Nonnull
  public native Promise<WakeLockSentinel> request(@WakeLockType @Nonnull String type);

  @Nonnull
  public native Promise<WakeLockSentinel> request();
}
