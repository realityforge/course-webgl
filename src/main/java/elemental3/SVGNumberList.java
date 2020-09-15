package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGNumberList defines a list of SVGNumber objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGNumberList">SVGNumberList - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGNumberList"
)
public class SVGNumberList {
  SVGNumberList() {
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
  public native SVGNumber appendItem(@Nonnull SVGNumber newItem);

  public native void clear();

  @Nonnull
  public native SVGNumber initialize(@Nonnull SVGNumber newItem);

  @Nonnull
  public native SVGNumber insertItemBefore(@Nonnull SVGNumber newItem, int index);

  @Nonnull
  public native SVGNumber removeItem(int index);

  @Nonnull
  public native SVGNumber replaceItem(@Nonnull SVGNumber newItem, int index);

  @Nonnull
  public native SVGNumber getItem(int index);
}