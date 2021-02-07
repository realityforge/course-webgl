package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLEmbedElement interface provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating &lt;embed&gt; elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLEmbedElement">HTMLEmbedElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlembedelement">HTMLEmbedElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#the-embed-element">HTMLEmbedElement - HTML5</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLEmbedElement"
)
public class HTMLEmbedElement extends HTMLElement {
  @Nonnull
  public String align;

  @Nonnull
  public String height;

  @Nonnull
  public String name;

  @Nonnull
  public String src;

  @Nonnull
  public String type;

  @Nonnull
  public String width;

  protected HTMLEmbedElement() {
  }

  @Nullable
  public native Document getSVGDocument();
}
