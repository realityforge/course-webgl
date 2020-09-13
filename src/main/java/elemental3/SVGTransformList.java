package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGTransformList defines a list of SVGTransform objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGTransformList">SVGTransformList - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGTransformList"
)
public class SVGTransformList {
  SVGTransformList() {
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
  public native SVGTransform appendItem(@Nonnull SVGTransform newItem);

  public native void clear();

  @Nullable
  public native SVGTransform consolidate();

  @Nonnull
  public native SVGTransform createSVGTransformFromMatrix(@Nonnull DOMMatrixReadOnly matrix);

  @Nonnull
  public native SVGTransform initialize(@Nonnull SVGTransform newItem);

  @Nonnull
  public native SVGTransform insertItemBefore(@Nonnull SVGTransform newItem, int index);

  @Nonnull
  public native SVGTransform removeItem(int index);

  @Nonnull
  public native SVGTransform replaceItem(@Nonnull SVGTransform newItem, int index);

  @Nonnull
  public native SVGTransform getItem(int index);
}
