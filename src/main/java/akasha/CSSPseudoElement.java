package akasha;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The CSSPseudoElement interface represents a pseudo-element that may be the target of an event or animated using the Web Animations API. Instances of this interface may be obtained by calling Element.pseudo().
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSPseudoElement">CSSPseudoElement - MDN</a>
 * @see <a href="https://drafts.csswg.org/css-pseudo-4/#CSSPseudoElement-interface">CSSPseudoElement - CSS Pseudo-Elements Level 4</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSPseudoElement"
)
public class CSSPseudoElement extends EventTarget {
  protected CSSPseudoElement() {
  }

  /**
   * The element read-only property of the CSSPseudoElement interface returns a reference to the originating element of the pseudo-element, in other words its parent element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSPseudoElement/element">CSSPseudoElement.element - MDN</a>
   * @see <a href="https://drafts.csswg.org/css-pseudo-4/#dom-csspseudoelement-element">element - CSS Pseudo-Elements Level 4</a>
   */
  @JsProperty(
      name = "element"
  )
  @Nonnull
  public native Element element();

  /**
   * The type read-only property of the CSSPseudoElement interface returns the type of the pseudo-element as a string, represented in the form of a CSS selector.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSPseudoElement/type">CSSPseudoElement.type - MDN</a>
   * @see <a href="https://drafts.csswg.org/css-pseudo-4/#dom-csspseudoelement-type">type - CSS Pseudo-Elements Level 4</a>
   */
  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();

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

  @Nonnull
  public native Animation animate(@Nullable Object keyframes, double options);

  @Nonnull
  public native Animation animate(@Nullable Object keyframes,
      @Nonnull KeyframeAnimationOptions options);

  @Nonnull
  public native Animation animate(@Nullable Object keyframes);

  @Nonnull
  public native JsArray<Animation> getAnimations();
}
