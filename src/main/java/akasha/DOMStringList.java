package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * A type returned by some APIs which contains a list of DOMString (strings).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMStringList">DOMStringList - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/common-dom-interfaces.html#the-domstringlist-interface">DOMStringList - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DOMStringList"
)
public class DOMStringList {
  protected DOMStringList() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  public native boolean contains(@Nonnull String string);

  @Nullable
  public native String item(int index);
}
