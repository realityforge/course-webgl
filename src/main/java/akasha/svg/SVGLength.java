package akasha.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGLength interface correspond to the &lt;length&gt; basic data type.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGLength">SVGLength - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGLength"
)
public class SVGLength {
  @JsOverlay
  public static final int SVG_LENGTHTYPE_CM = 6;

  @JsOverlay
  public static final int SVG_LENGTHTYPE_EMS = 3;

  @JsOverlay
  public static final int SVG_LENGTHTYPE_EXS = 4;

  @JsOverlay
  public static final int SVG_LENGTHTYPE_IN = 8;

  @JsOverlay
  public static final int SVG_LENGTHTYPE_MM = 7;

  @JsOverlay
  public static final int SVG_LENGTHTYPE_NUMBER = 1;

  @JsOverlay
  public static final int SVG_LENGTHTYPE_PC = 10;

  @JsOverlay
  public static final int SVG_LENGTHTYPE_PERCENTAGE = 2;

  @JsOverlay
  public static final int SVG_LENGTHTYPE_PT = 9;

  @JsOverlay
  public static final int SVG_LENGTHTYPE_PX = 5;

  @JsOverlay
  public static final int SVG_LENGTHTYPE_UNKNOWN = 0;

  public float value;

  @Nonnull
  public String valueAsString;

  public float valueInSpecifiedUnits;

  protected SVGLength() {
  }

  @JsProperty(
      name = "unitType"
  )
  public native int unitType();

  public native void convertToSpecifiedUnits(int unitType);

  public native void newValueSpecifiedUnits(int unitType, float valueInSpecifiedUnits);
}
