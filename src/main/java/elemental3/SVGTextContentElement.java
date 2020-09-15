package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGTextContentElement interface is implemented by elements that support rendering child text content. It is inherited by various text-related interfaces, such as SVGTextElement, SVGTSpanElement, SVGTRefElement, SVGAltGlyphElement and SVGTextPathElement.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGTextContentElement">SVGTextContentElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGTextContentElement"
)
public class SVGTextContentElement extends SVGGraphicsElement {
  @JsOverlay
  public static final int LENGTHADJUST_SPACING = 1;

  @JsOverlay
  public static final int LENGTHADJUST_SPACINGANDGLYPHS = 2;

  @JsOverlay
  public static final int LENGTHADJUST_UNKNOWN = 0;

  SVGTextContentElement() {
  }

  @JsProperty(
      name = "lengthAdjust"
  )
  @Nonnull
  public native SVGAnimatedEnumeration lengthAdjust();

  @JsProperty(
      name = "textLength"
  )
  @Nonnull
  public native SVGAnimatedLength textLength();

  public native int getCharNumAtPosition(@Nonnull DOMPointInit point);

  public native int getCharNumAtPosition();

  public native float getComputedTextLength();

  @Nonnull
  public native DOMPoint getEndPositionOfChar(int charnum);

  @Nonnull
  public native DOMRect getExtentOfChar(int charnum);

  public native int getNumberOfChars();

  public native float getRotationOfChar(int charnum);

  @Nonnull
  public native DOMPoint getStartPositionOfChar(int charnum);

  public native float getSubStringLength(int charnum, int nchars);

  public native void selectSubString(int charnum, int nchars);
}