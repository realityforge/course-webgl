package elemental3;

import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The WakeLock interface of the Screen Wake Lock API prevents device screens from dimming or locking when an application needs to keep running.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/WakeLock">WakeLock - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WakeLock"
)
public class WakeLock {
  WakeLock() {
  }

  @Nonnull
  public native Promise<WakeLockSentinel> request(
      @MagicConstant(valuesFromClass = WakeLockType.class) @Nonnull String type);
}
