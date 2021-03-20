package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The HTMLSourceElement interface provides special properties (beyond the regular HTMLElement object interface it also has available to it by inheritance) for manipulating &lt;source&gt; elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLSourceElement">HTMLSourceElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlsourceelement">HTMLSourceElement - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLSourceElement"
)
public class HTMLSourceElement extends HTMLElement {
  public int height;

  @Nonnull
  public String media;

  @Nonnull
  public String sizes;

  @Nonnull
  public String src;

  @Nonnull
  public String srcset;

  @Nonnull
  public String type;

  public int width;

  protected HTMLSourceElement() {
  }
}
