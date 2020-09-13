package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The HTMLAreaElement interface provides special properties and methods (beyond those of the regular object HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of area elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAreaElement">HTMLAreaElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLAreaElement"
)
public class HTMLAreaElement extends HTMLElement {
  @Nonnull
  public String alt;

  @Nonnull
  public String coords;

  @Nonnull
  public String download;

  @Nonnull
  public String ping;

  /**
   * The HTMLAreaElement.rel property reflects the rel attribute. It is a DOMString containing a space-separated list of link types indicating the relationship between the resource represented by the area element and the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAreaElement/rel">HTMLAreaElement.rel - MDN</a>
   */
  @Nonnull
  public String rel;

  @Nonnull
  public String shape;

  @Nonnull
  public String target;

  public boolean noHref;

  /**
   * The HTMLAreaElement.referrerPolicy property reflect the HTML referrerpolicy attribute of the area element defining which referrer is sent when fetching the resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAreaElement/referrerPolicy">HTMLAreaElement.referrerPolicy - MDN</a>
   */
  @Nonnull
  @MagicConstant(
      valuesFromClass = ReferrerPolicy.class
  )
  public String referrerPolicy;

  @Nonnull
  public String hash;

  @Nonnull
  public String host;

  @Nonnull
  public String hostname;

  @Nonnull
  public String password;

  @Nonnull
  public String pathname;

  @Nonnull
  public String port;

  @Nonnull
  public String protocol;

  @Nonnull
  public String search;

  @Nonnull
  public String username;

  @Nonnull
  public String href;

  public HTMLAreaElement() {
  }

  /**
   * The HTMLAreaElement.relList read-only property reflects the rel attribute. It is a live DOMTokenList containing the set of link types indicating the relationship between the resource represented by the area element and the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAreaElement/relList">HTMLAreaElement.relList - MDN</a>
   */
  @JsProperty(
      name = "relList"
  )
  @Nonnull
  public native DOMTokenList relList();

  @JsProperty(
      name = "origin"
  )
  @Nonnull
  public native String origin();
}
