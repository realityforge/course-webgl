package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGComponentTransferFunctionElement interface defines a base interface used by the component transfer function interfaces.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGComponentTransferFunctionElement">SVGComponentTransferFunctionElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGComponentTransferFunctionElement"
)
public class SVGComponentTransferFunctionElement extends SVGElement {
  @JsOverlay
  public static final int SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE = 3;

  @JsOverlay
  public static final int SVG_FECOMPONENTTRANSFER_TYPE_GAMMA = 5;

  @JsOverlay
  public static final int SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY = 1;

  @JsOverlay
  public static final int SVG_FECOMPONENTTRANSFER_TYPE_LINEAR = 4;

  @JsOverlay
  public static final int SVG_FECOMPONENTTRANSFER_TYPE_TABLE = 2;

  @JsOverlay
  public static final int SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN = 0;

  SVGComponentTransferFunctionElement() {
  }

  @JsProperty(
      name = "amplitude"
  )
  @Nonnull
  public native SVGAnimatedNumber amplitude();

  @JsProperty(
      name = "exponent"
  )
  @Nonnull
  public native SVGAnimatedNumber exponent();

  @JsProperty(
      name = "intercept"
  )
  @Nonnull
  public native SVGAnimatedNumber intercept();

  @JsProperty(
      name = "offset"
  )
  @Nonnull
  public native SVGAnimatedNumber offset();

  @JsProperty(
      name = "slope"
  )
  @Nonnull
  public native SVGAnimatedNumber slope();

  @JsProperty(
      name = "tableValues"
  )
  @Nonnull
  public native SVGAnimatedNumberList tableValues();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native SVGAnimatedEnumeration type();
}
