package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLStyleElement interface represents a style element. It inherits properties and methods from its parent, HTMLElement, and from LinkStyle.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLStyleElement">HTMLStyleElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLStyleElement"
)
public class HTMLStyleElement extends HTMLElement {
  /**
   * The HTMLStyleElement.media property specifies the intended destination medium for style information.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLStyleElement/media">HTMLStyleElement.media - MDN</a>
   */
  @Nonnull
  public String media;

  /**
   * The HTMLStyleElement.type read-only property returns the type of the current style.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLStyleElement/type">HTMLStyleElement.type - MDN</a>
   */
  @Nonnull
  public String type;

  protected HTMLStyleElement() {
  }

  @JsProperty(
      name = "sheet"
  )
  @Nullable
  public native CSSStyleSheet sheet();
}
