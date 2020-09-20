package elemental3.svg;

import javax.annotation.Generated;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The SVGPreserveAspectRatio interface corresponds to the preserveAspectRatio attribute, which is available for some of SVG's elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGPreserveAspectRatio">SVGPreserveAspectRatio - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGPreserveAspectRatio"
)
public class SVGPreserveAspectRatio {
  @JsOverlay
  public static final int SVG_MEETORSLICE_MEET = 1;

  @JsOverlay
  public static final int SVG_MEETORSLICE_SLICE = 2;

  @JsOverlay
  public static final int SVG_MEETORSLICE_UNKNOWN = 0;

  @JsOverlay
  public static final int SVG_PRESERVEASPECTRATIO_NONE = 1;

  @JsOverlay
  public static final int SVG_PRESERVEASPECTRATIO_UNKNOWN = 0;

  @JsOverlay
  public static final int SVG_PRESERVEASPECTRATIO_XMAXYMAX = 10;

  @JsOverlay
  public static final int SVG_PRESERVEASPECTRATIO_XMAXYMID = 7;

  @JsOverlay
  public static final int SVG_PRESERVEASPECTRATIO_XMAXYMIN = 4;

  @JsOverlay
  public static final int SVG_PRESERVEASPECTRATIO_XMIDYMAX = 9;

  @JsOverlay
  public static final int SVG_PRESERVEASPECTRATIO_XMIDYMID = 6;

  @JsOverlay
  public static final int SVG_PRESERVEASPECTRATIO_XMIDYMIN = 3;

  @JsOverlay
  public static final int SVG_PRESERVEASPECTRATIO_XMINYMAX = 8;

  @JsOverlay
  public static final int SVG_PRESERVEASPECTRATIO_XMINYMID = 5;

  @JsOverlay
  public static final int SVG_PRESERVEASPECTRATIO_XMINYMIN = 2;

  public int align;

  public int meetOrSlice;

  protected SVGPreserveAspectRatio() {
  }
}
