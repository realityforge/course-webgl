package akasha.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;

/**
 * The SVGLengthList defines a list of SVGLength objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGLengthList">SVGLengthList - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGLengthList"
)
public class SVGLengthList {
  protected SVGLengthList() {
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
  public native SVGLength appendItem(@Nonnull SVGLength newItem);

  public native void clear();

  @Nonnull
  public native SVGLength initialize(@Nonnull SVGLength newItem);

  @Nonnull
  public native SVGLength insertItemBefore(@Nonnull SVGLength newItem, int index);

  @Nonnull
  public native SVGLength removeItem(int index);

  @Nonnull
  public native SVGLength replaceItem(@Nonnull SVGLength newItem, int index);

  @Nonnull
  public native SVGLength getItem(int index);

  @JsOverlay
  public final void setAt(final int index, @Nonnull final SVGLength newItem) {
    Js.<JsArrayLike<SVGLength>>cast( this ).setAt( index, newItem );
  }
}
