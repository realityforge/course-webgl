package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The TextMetrics interface represents the dimensions of a piece of text in the canvas; a TextMetrics instance can be retrieved using the CanvasRenderingContext2D.measureText() method.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics">TextMetrics - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/the-canvas-element.html#textmetrics">TextMetrics - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TextMetrics"
)
public class TextMetrics {
  protected TextMetrics() {
  }

  /**
   * The read-only actualBoundingBoxAscent property of the TextMetrics interface is a double giving the distance from the horizontal line indicated by the CanvasRenderingContext2D.textBaseline attribute to the top of the bounding rectangle used to render the text, in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics/actualBoundingBoxAscent">TextMetrics.actualBoundingBoxAscent - MDN</a>
   */
  @JsProperty(
      name = "actualBoundingBoxAscent"
  )
  public native double actualBoundingBoxAscent();

  /**
   * The read-only actualBoundingBoxDescent property of the TextMetrics interface is a double giving the distance from the horizontal line indicated by the CanvasRenderingContext2D.textBaseline attribute to the bottom of the bounding rectangle used to render the text, in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics/actualBoundingBoxDescent">TextMetrics.actualBoundingBoxDescent - MDN</a>
   */
  @JsProperty(
      name = "actualBoundingBoxDescent"
  )
  public native double actualBoundingBoxDescent();

  /**
   * The read-only actualBoundingBoxLeft property of the TextMetrics interface is a double giving the distance parallel to the baseline from the alignment point given by the CanvasRenderingContext2D.textAlign property to the left side of the bounding rectangle of the given text, in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics/actualBoundingBoxLeft">TextMetrics.actualBoundingBoxLeft - MDN</a>
   */
  @JsProperty(
      name = "actualBoundingBoxLeft"
  )
  public native double actualBoundingBoxLeft();

  /**
   * The read-only actualBoundingBoxRight property of the TextMetrics interface is a double giving the distance parallel to the baseline from the alignment point given by the CanvasRenderingContext2D.textAlign property to the right side of the bounding rectangle of the given text, in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics/actualBoundingBoxRight">TextMetrics.actualBoundingBoxRight - MDN</a>
   */
  @JsProperty(
      name = "actualBoundingBoxRight"
  )
  public native double actualBoundingBoxRight();

  /**
   * The read-only alphabeticBaseline property of the TextMetrics interface is a double giving the distance from the horizontal line indicated by the CanvasRenderingContext2D.textBaseline property to the alphabetic baseline of the line box, in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics/alphabeticBaseline">TextMetrics.alphabeticBaseline - MDN</a>
   */
  @JsProperty(
      name = "alphabeticBaseline"
  )
  public native double alphabeticBaseline();

  /**
   * The read-only emHeightAscent property of the TextMetrics interface is a double giving the distance from the horizontal line indicated by the CanvasRenderingContext2D.textBaseline property to the top of the em square in the line box, in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics/emHeightAscent">TextMetrics.emHeightAscent - MDN</a>
   */
  @JsProperty(
      name = "emHeightAscent"
  )
  public native double emHeightAscent();

  /**
   * The read-only emHeightDescent property of the TextMetrics interface is a double giving the distance from the horizontal line indicated by the CanvasRenderingContext2D.textBaseline property to the bottom of the em square in the line box, in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics/emHeightDescent">TextMetrics.emHeightDescent - MDN</a>
   */
  @JsProperty(
      name = "emHeightDescent"
  )
  public native double emHeightDescent();

  /**
   * The read-only fontBoundingBoxAscent property of the TextMetrics interface is a double giving the distance from the horizontal line indicated by the CanvasRenderingContext2D.textBaseline attribute to the top of the highest bounding rectangle of all the fonts used to render the text, in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics/fontBoundingBoxAscent">TextMetrics.fontBoundingBoxAscent - MDN</a>
   */
  @JsProperty(
      name = "fontBoundingBoxAscent"
  )
  public native double fontBoundingBoxAscent();

  /**
   * The read-only fontBoundingBoxDescent property of the TextMetrics interface is a double giving the distance from the horizontal line indicated by the CanvasRenderingContext2D.textBaseline attribute to the bottom of the bounding rectangle of all the fonts used to render the text, in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics/fontBoundingBoxDescent">TextMetrics.fontBoundingBoxDescent - MDN</a>
   */
  @JsProperty(
      name = "fontBoundingBoxDescent"
  )
  public native double fontBoundingBoxDescent();

  /**
   * The read-only hangingBaseline property of the TextMetrics interface is a double giving the distance from the horizontal line indicated by the CanvasRenderingContext2D.textBaseline property to the hanging baseline of the line box, in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics/hangingBaseline">TextMetrics.hangingBaseline - MDN</a>
   */
  @JsProperty(
      name = "hangingBaseline"
  )
  public native double hangingBaseline();

  /**
   * The read-only ideographicBaseline property of the TextMetrics interface is a double giving the distance from the horizontal line indicated by the CanvasRenderingContext2D.textBaseline property to the ideographic baseline of the line box, in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics/ideographicBaseline">TextMetrics.ideographicBaseline - MDN</a>
   */
  @JsProperty(
      name = "ideographicBaseline"
  )
  public native double ideographicBaseline();

  /**
   * The read-only width property of the TextMetrics interface contains the text's advance width (the width of that inline box) in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextMetrics/width">TextMetrics.width - MDN</a>
   */
  @JsProperty(
      name = "width"
  )
  public native double width();
}
