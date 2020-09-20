package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGUseElement interface corresponds to the use element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGUseElement">SVGUseElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGUseElement"
)
public class SVGUseElement extends SVGGraphicsElement {
  protected SVGUseElement() {
  }

  @JsProperty(
      name = "animatedInstanceRoot"
  )
  @Nullable
  public native SVGElement animatedInstanceRoot();

  @JsProperty(
      name = "height"
  )
  @Nonnull
  public native SVGAnimatedLength height();

  @JsProperty(
      name = "href"
  )
  @Nonnull
  public native SVGAnimatedString href();

  @JsProperty(
      name = "instanceRoot"
  )
  @Nullable
  public native SVGElement instanceRoot();

  @JsProperty(
      name = "width"
  )
  @Nonnull
  public native SVGAnimatedLength width();

  @JsProperty(
      name = "x"
  )
  @Nonnull
  public native SVGAnimatedLength x();

  @JsProperty(
      name = "y"
  )
  @Nonnull
  public native SVGAnimatedLength y();
}
