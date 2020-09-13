package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * This interface inherits the methods of its parent, HTMLCollection.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLOptionsCollection">HTMLOptionsCollection - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLOptionsCollection"
)
public class HTMLOptionsCollection extends HTMLCollection {
  public int length;

  public int selectedIndex;

  HTMLOptionsCollection() {
  }

  public native void add(@Nonnull HTMLOptionElement element, @Nonnull HTMLElement before);

  public native void add(@Nonnull HTMLOptGroupElement element, @Nonnull HTMLElement before);

  public native void add(@Nonnull HTMLOptionElement element, int before);

  public native void add(@Nonnull HTMLOptGroupElement element, int before);

  public native void add(@Nonnull HTMLOptionElement element);

  public native void add(@Nonnull HTMLOptGroupElement element);

  public native void remove(int index);
}
