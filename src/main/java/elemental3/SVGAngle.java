package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGAngle interface is used to represent a value that can be an angle or number value. An SVGAngle reflected through the animVal attribute is always read only.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGAngle">SVGAngle - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGAngle"
)
public class SVGAngle {
  @JsOverlay
  public static final int SVG_ANGLETYPE_DEG = 2;

  @JsOverlay
  public static final int SVG_ANGLETYPE_GRAD = 4;

  @JsOverlay
  public static final int SVG_ANGLETYPE_RAD = 3;

  @JsOverlay
  public static final int SVG_ANGLETYPE_UNKNOWN = 0;

  @JsOverlay
  public static final int SVG_ANGLETYPE_UNSPECIFIED = 1;

  public float value;

  @Nonnull
  public String valueAsString;

  public float valueInSpecifiedUnits;

  SVGAngle() {
  }

  @JsProperty(
      name = "unitType"
  )
  public native int unitType();

  public native void convertToSpecifiedUnits(int unitType);

  public native void newValueSpecifiedUnits(int unitType, float valueInSpecifiedUnits);
}
