package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;

/**
 * The SVGStringList defines a list of DOMString objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGStringList">SVGStringList - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGStringList"
)
public class SVGStringList {
  protected SVGStringList() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @JsProperty(
      name = "numberOfItems"
  )
  public native int numberOfItems();

  @Nonnull
  public native String appendItem(@Nonnull String newItem);

  public native void clear();

  @Nonnull
  public native String initialize(@Nonnull String newItem);

  @Nonnull
  public native String insertItemBefore(@Nonnull String newItem, int index);

  @Nonnull
  public native String removeItem(int index);

  @Nonnull
  public native String replaceItem(@Nonnull String newItem, int index);

  @Nonnull
  public native String getItem(int index);

  @JsOverlay
  public final void setAt(final int index, @Nonnull final String newItem) {
    Js.<JsArrayLike<String>>cast( this ).setAt( index, newItem );
  }
}
