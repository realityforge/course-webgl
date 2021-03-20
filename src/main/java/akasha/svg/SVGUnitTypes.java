package akasha.svg;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The SVGUnitTypes interface defines a commonly used set of constants used for reflecting gradientUnits, patternContentUnits and other similar attributes.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGUnitTypes">SVGUnitTypes - MDN</a>
 * @see <a href="https://svgwg.org/svg2-draft/types.html#InterfaceSVGUnitTypes">SVGUnitTypes - Scalable Vector Graphics (SVG) 2</a>
 * @see <a href="https://www.w3.org/TR/SVG11/types.html#InterfaceSVGUnitTypes">SVGUnitTypes - Scalable Vector Graphics (SVG) 1.1 (Second Edition)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGUnitTypes"
)
public class SVGUnitTypes {
  @JsOverlay
  public static final int SVG_UNIT_TYPE_OBJECTBOUNDINGBOX = 2;

  @JsOverlay
  public static final int SVG_UNIT_TYPE_UNKNOWN = 0;

  @JsOverlay
  public static final int SVG_UNIT_TYPE_USERSPACEONUSE = 1;

  protected SVGUnitTypes() {
  }
}
