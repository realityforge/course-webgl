package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLEmbedElement interface provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating embed elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLEmbedElement">HTMLEmbedElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLEmbedElement"
)
public class HTMLEmbedElement extends HTMLElement {
  @Nonnull
  public String height;

  @Nonnull
  public String src;

  @Nonnull
  public String type;

  @Nonnull
  public String width;

  @Nonnull
  public String align;

  @Nonnull
  public String name;

  public HTMLEmbedElement() {
  }

  @Nullable
  public native Document getSVGDocument();
}
