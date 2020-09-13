package elemental3;

import elemental2.core.JsArray;
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
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSPseudoElement"
)
public class CSSPseudoElement extends EventTarget {
  CSSPseudoElement() {
  }

  /**
   * The element read-only property of the CSSPseudoElement interface returns a reference to the originating element of the pseudo-element, in other words its parent element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSPseudoElement/element">CSSPseudoElement.element - MDN</a>
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
   */
  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();

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
