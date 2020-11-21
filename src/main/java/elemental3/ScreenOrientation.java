package elemental3;

import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The ScreenOrientation interface of the the Screen Orientation API provides information about the current orientation of the document.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScreenOrientation">ScreenOrientation - MDN</a>
 * @see <a href="https://w3c.github.io/screen-orientation/#screenorientation-interface">The definition of 'ScreenOrientation' in the 'Screen Orientation API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ScreenOrientation"
)
public class ScreenOrientation extends EventTarget {
  /**
   * The onchange property of the ScreenOrientation is an event handler fired whenever is the EventHandler called when the screen changes orientation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScreenOrientation/onchange">ScreenOrientation.onchange - MDN</a>
   * @see <a href="https://w3c.github.io/screen-orientation/#dom-screenorientation-onchange">The definition of 'onchange' in the 'Screen Orientation API' specification.</a>
   */
  @Nullable
  public EventHandler onchange;

  protected ScreenOrientation() {
  }

  /**
   * The angle read-only property of the ScreenOrientation interface returns the document's current orientation angle.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScreenOrientation/angle">ScreenOrientation.angle - MDN</a>
   * @see <a href="https://w3c.github.io/screen-orientation/#dom-screenorientation-angle">The definition of 'angle' in the 'Screen Orientation API' specification.</a>
   */
  @JsProperty(
      name = "angle"
  )
  public native int angle();

  /**
   * The type read-only property of the ScreenOrientation interface returns the document's current orientation type, one of &quot;portrait-primary&quot;, &quot;portrait-secondary&quot;, &quot;landscape-primary&quot;, or &quot;landscape-secondary&quot;.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScreenOrientation/type">ScreenOrientation.type - MDN</a>
   * @see <a href="https://w3c.github.io/screen-orientation/#dom-screenorientation-type">The definition of 'type' in the 'Screen Orientation API' specification.</a>
   */
  @JsProperty(
      name = "type"
  )
  @Nonnull
  @OrientationType
  public native String type();

  /**
   * The lock() property of the ScreenOrientation interface locks the orientation of the containing document to its default orientation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScreenOrientation/lock">ScreenOrientation.lock - MDN</a>
   * @see <a href="https://w3c.github.io/screen-orientation/#dom-screenorientation-lock">The definition of 'lock()' in the 'Screen Orientation API' specification.</a>
   */
  @Nonnull
  public native Promise<Void> lock(@OrientationLockType @Nonnull String orientation);

  /**
   * The unlock() property of the ScreenOrientation interface unlocks the orientation of the containing document from its default orientation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ScreenOrientation/unlock">ScreenOrientation.unlock - MDN</a>
   * @see <a href="https://w3c.github.io/screen-orientation/#dom-screenorientation-unlock">The definition of 'unlock()' in the 'Screen Orientation API' specification.</a>
   */
  public native void unlock();
}
