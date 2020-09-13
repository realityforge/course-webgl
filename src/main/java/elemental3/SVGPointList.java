package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGPointList"
)
public class SVGPointList {
  SVGPointList() {
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
}
