package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGMarkerElement"
)
public class SVGMarkerElement extends SVGElement {
  @JsOverlay
  public static final int SVG_MARKERUNITS_STROKEWIDTH = 2;

  @JsOverlay
  public static final int SVG_MARKERUNITS_UNKNOWN = 0;

  @JsOverlay
  public static final int SVG_MARKERUNITS_USERSPACEONUSE = 1;

  @JsOverlay
  public static final int SVG_MARKER_ORIENT_ANGLE = 2;

  @JsOverlay
  public static final int SVG_MARKER_ORIENT_AUTO = 1;

  @JsOverlay
  public static final int SVG_MARKER_ORIENT_UNKNOWN = 0;

  @Nonnull
  public String orient;

  protected SVGMarkerElement() {
  }

  @JsProperty(
      name = "markerHeight"
  )
  @Nonnull
  public native SVGAnimatedLength markerHeight();

  @JsProperty(
      name = "markerUnits"
  )
  @Nonnull
  public native SVGAnimatedEnumeration markerUnits();

  @JsProperty(
      name = "markerWidth"
  )
  @Nonnull
  public native SVGAnimatedLength markerWidth();

  @JsProperty(
      name = "orientAngle"
  )
  @Nonnull
  public native SVGAnimatedAngle orientAngle();

  @JsProperty(
      name = "orientType"
  )
  @Nonnull
  public native SVGAnimatedEnumeration orientType();

  @JsProperty(
      name = "preserveAspectRatio"
  )
  @Nonnull
  public native SVGAnimatedPreserveAspectRatio preserveAspectRatio();

  @JsProperty(
      name = "refX"
  )
  @Nonnull
  public native SVGAnimatedLength refX();

  @JsProperty(
      name = "refY"
  )
  @Nonnull
  public native SVGAnimatedLength refY();

  @JsProperty(
      name = "viewBox"
  )
  @Nonnull
  public native SVGAnimatedRect viewBox();

  public native void setOrientToAngle(@Nonnull SVGAngle angle);

  public native void setOrientToAuto();
}
