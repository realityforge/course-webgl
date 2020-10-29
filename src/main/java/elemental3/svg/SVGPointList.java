package elemental3.svg;

import elemental3.DOMPoint;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGPointList"
)
public class SVGPointList {
  protected SVGPointList() {
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
  public native DOMPoint appendItem(@Nonnull DOMPoint newItem);

  public native void clear();

  @Nonnull
  public native DOMPoint initialize(@Nonnull DOMPoint newItem);

  @Nonnull
  public native DOMPoint insertItemBefore(@Nonnull DOMPoint newItem, int index);

  @Nonnull
  public native DOMPoint removeItem(int index);

  @Nonnull
  public native DOMPoint replaceItem(@Nonnull DOMPoint newItem, int index);

  @Nonnull
  public native DOMPoint getItem(int index);

  @JsOverlay
  public final void setAt(final int index, @Nonnull final DOMPoint newItem) {
    Js.<JsArrayLike<DOMPoint>>cast( this ).setAt( index, newItem );
  }
}
