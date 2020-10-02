package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Text interface represents the textual content of Element or Attr.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Text">Text - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Text"
)
public class Text extends CharacterData {
  /**
   * The Text() constructor returns a newly created Text object with the optional DOMString given in parameter as its textual content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Text/Text">Text.Text - MDN</a>
   */
  public Text(@Nonnull final String data) {
  }

  /**
   * The Text() constructor returns a newly created Text object with the optional DOMString given in parameter as its textual content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Text/Text">Text.Text - MDN</a>
   */
  public Text() {
  }

  /**
   * The assignedSlot property of the Text interface returns the HTMLSlotElement object associated with the element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Text/assignedSlot">Text.assignedSlot - MDN</a>
   */
  @JsProperty(
      name = "assignedSlot"
  )
  @Nullable
  public native HTMLSlotElement assignedSlot();

  /**
   * The Text.wholeText read-only property returns the full text of all Text nodes logically adjacent to the node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Text/wholeText">Text.wholeText - MDN</a>
   */
  @JsProperty(
      name = "wholeText"
  )
  @Nonnull
  public native String wholeText();

  /**
   * The Text.splitText() method breaks the Text node into two nodes at the specified offset, keeping both nodes in the tree as siblings.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Text/splitText">Text.splitText - MDN</a>
   */
  @Nonnull
  public native Text splitText(int offset);

  @Nonnull
  public native DOMPoint convertPointFromNode(@Nonnull DOMPointInit point,
      @Nonnull GeometryNode from, @Nonnull ConvertCoordinateOptions options);

  @Nonnull
  public native DOMPoint convertPointFromNode(@Nonnull DOMPointInit point, @Nonnull Text from,
      @Nonnull ConvertCoordinateOptions options);

  @Nonnull
  public native DOMPoint convertPointFromNode(@Nonnull DOMPointInit point, @Nonnull Element from,
      @Nonnull ConvertCoordinateOptions options);

  @Nonnull
  public native DOMPoint convertPointFromNode(@Nonnull DOMPointInit point,
      @Nonnull CSSPseudoElement from, @Nonnull ConvertCoordinateOptions options);

  @Nonnull
  public native DOMPoint convertPointFromNode(@Nonnull DOMPointInit point, @Nonnull Document from,
      @Nonnull ConvertCoordinateOptions options);

  @Nonnull
  public native DOMPoint convertPointFromNode(@Nonnull DOMPointInit point,
      @Nonnull GeometryNode from);

  @Nonnull
  public native DOMPoint convertPointFromNode(@Nonnull DOMPointInit point, @Nonnull Text from);

  @Nonnull
  public native DOMPoint convertPointFromNode(@Nonnull DOMPointInit point, @Nonnull Element from);

  @Nonnull
  public native DOMPoint convertPointFromNode(@Nonnull DOMPointInit point,
      @Nonnull CSSPseudoElement from);

  @Nonnull
  public native DOMPoint convertPointFromNode(@Nonnull DOMPointInit point, @Nonnull Document from);

  @Nonnull
  public native DOMQuad convertQuadFromNode(@Nonnull DOMQuadInit quad, @Nonnull GeometryNode from,
      @Nonnull ConvertCoordinateOptions options);

  @Nonnull
  public native DOMQuad convertQuadFromNode(@Nonnull DOMQuadInit quad, @Nonnull Text from,
      @Nonnull ConvertCoordinateOptions options);

  @Nonnull
  public native DOMQuad convertQuadFromNode(@Nonnull DOMQuadInit quad, @Nonnull Element from,
      @Nonnull ConvertCoordinateOptions options);

  @Nonnull
  public native DOMQuad convertQuadFromNode(@Nonnull DOMQuadInit quad,
      @Nonnull CSSPseudoElement from, @Nonnull ConvertCoordinateOptions options);

  @Nonnull
  public native DOMQuad convertQuadFromNode(@Nonnull DOMQuadInit quad, @Nonnull Document from,
      @Nonnull ConvertCoordinateOptions options);

  @Nonnull
  public native DOMQuad convertQuadFromNode(@Nonnull DOMQuadInit quad, @Nonnull GeometryNode from);

  @Nonnull
  public native DOMQuad convertQuadFromNode(@Nonnull DOMQuadInit quad, @Nonnull Text from);

  @Nonnull
  public native DOMQuad convertQuadFromNode(@Nonnull DOMQuadInit quad, @Nonnull Element from);

  @Nonnull
  public native DOMQuad convertQuadFromNode(@Nonnull DOMQuadInit quad,
      @Nonnull CSSPseudoElement from);

  @Nonnull
  public native DOMQuad convertQuadFromNode(@Nonnull DOMQuadInit quad, @Nonnull Document from);

  @Nonnull
  public native DOMQuad convertRectFromNode(@Nonnull DOMRectReadOnly rect,
      @Nonnull GeometryNode from, @Nonnull ConvertCoordinateOptions options);

  @Nonnull
  public native DOMQuad convertRectFromNode(@Nonnull DOMRectReadOnly rect, @Nonnull Text from,
      @Nonnull ConvertCoordinateOptions options);

  @Nonnull
  public native DOMQuad convertRectFromNode(@Nonnull DOMRectReadOnly rect, @Nonnull Element from,
      @Nonnull ConvertCoordinateOptions options);

  @Nonnull
  public native DOMQuad convertRectFromNode(@Nonnull DOMRectReadOnly rect,
      @Nonnull CSSPseudoElement from, @Nonnull ConvertCoordinateOptions options);

  @Nonnull
  public native DOMQuad convertRectFromNode(@Nonnull DOMRectReadOnly rect, @Nonnull Document from,
      @Nonnull ConvertCoordinateOptions options);

  @Nonnull
  public native DOMQuad convertRectFromNode(@Nonnull DOMRectReadOnly rect,
      @Nonnull GeometryNode from);

  @Nonnull
  public native DOMQuad convertRectFromNode(@Nonnull DOMRectReadOnly rect, @Nonnull Text from);

  @Nonnull
  public native DOMQuad convertRectFromNode(@Nonnull DOMRectReadOnly rect, @Nonnull Element from);

  @Nonnull
  public native DOMQuad convertRectFromNode(@Nonnull DOMRectReadOnly rect,
      @Nonnull CSSPseudoElement from);

  @Nonnull
  public native DOMQuad convertRectFromNode(@Nonnull DOMRectReadOnly rect, @Nonnull Document from);

  @Nonnull
  public native JsArray<DOMQuad> getBoxQuads(@Nonnull BoxQuadOptions options);

  @Nonnull
  public native JsArray<DOMQuad> getBoxQuads();
}
