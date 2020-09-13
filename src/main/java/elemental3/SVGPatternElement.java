package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGPatternElement interface corresponds to the pattern element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGPatternElement">SVGPatternElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGPatternElement"
)
public class SVGPatternElement extends SVGElement {
  SVGPatternElement() {
  }

  @JsProperty(
      name = "height"
  )
  @Nonnull
  public native SVGAnimatedLength height();

  @JsProperty(
      name = "patternContentUnits"
  )
  @Nonnull
  public native SVGAnimatedEnumeration patternContentUnits();

  @JsProperty(
      name = "patternTransform"
  )
  @Nonnull
  public native SVGAnimatedTransformList patternTransform();

  @JsProperty(
      name = "patternUnits"
  )
  @Nonnull
  public native SVGAnimatedEnumeration patternUnits();

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

  @JsProperty(
      name = "preserveAspectRatio"
  )
  @Nonnull
  public native SVGAnimatedPreserveAspectRatio preserveAspectRatio();

  @JsProperty(
      name = "viewBox"
  )
  @Nonnull
  public native SVGAnimatedRect viewBox();

  @JsProperty(
      name = "href"
  )
  @Nonnull
  public native SVGAnimatedString href();
}
