package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The HTMLAnchorElement interface represents hyperlink elements and provides special properties and methods (beyond those of the regular HTMLElement object interface that they inherit from) for manipulating the layout and presentation of such elements. This interface corresponds to a element; not to be confused with link, which is represented by HTMLLinkElement)
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAnchorElement">HTMLAnchorElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLAnchorElement"
)
public class HTMLAnchorElement extends HTMLElement {
  /**
   * The HTMLAnchorElement.download property is a DOMString indicating that the linked resource is intended to be downloaded rather than displayed in the browser. The value, if any, specifies the default file name for use in labeling the resource in a local file system. If the name is not a valid file name in the underlying OS, the browser will adjust it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAnchorElement/download">HTMLAnchorElement.download - MDN</a>
   */
  @Nonnull
  public String download;

  @Nonnull
  public String hreflang;

  @Nonnull
  public String ping;

  /**
   * The HTMLAnchorElement.rel property reflects the rel attribute. It is a DOMString containing a space-separated list of link types indicating the relationship between the resource represented by the a element and the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAnchorElement/rel">HTMLAnchorElement.rel - MDN</a>
   */
  @Nonnull
  public String rel;

  @Nonnull
  public String target;

  @Nonnull
  public String text;

  @Nonnull
  public String type;

  @Nonnull
  public String charset;

  @Nonnull
  public String coords;

  @Nonnull
  public String name;

  @Nonnull
  public String rev;

  @Nonnull
  public String shape;

  /**
   * The HTMLAnchorElement.referrerPolicy property reflect the HTML referrerpolicy attribute of the a element defining which referrer is sent when fetching the resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAnchorElement/referrerPolicy">HTMLAnchorElement.referrerPolicy - MDN</a>
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

  public HTMLAnchorElement() {
  }

  /**
   * The HTMLAnchorElement.relList read-only property reflects the rel attribute. It is a live DOMTokenList containing the set of link types indicating the relationship between the resource represented by the a element and the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAnchorElement/relList">HTMLAnchorElement.relList - MDN</a>
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
