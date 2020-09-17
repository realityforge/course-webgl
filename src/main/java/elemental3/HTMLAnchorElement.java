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
  @Nonnull
  public String charset;

  @Nonnull
  public String coords;

  /**
   * The HTMLAnchorElement.download property is a DOMString indicating that the linked resource is intended to be downloaded rather than displayed in the browser. The value, if any, specifies the default file name for use in labeling the resource in a local file system. If the name is not a valid file name in the underlying OS, the browser will adjust it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAnchorElement/download">HTMLAnchorElement.download - MDN</a>
   */
  @Nonnull
  public String download;

  /**
   * The HTMLHyperlinkElementUtils.hash property returns a USVString containing a '#' followed by the fragment identifier of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAnchorElement/hash">HTMLAnchorElement.hash - MDN</a>
   */
  @Nonnull
  public String hash;

  /**
   * The HTMLHyperlinkElementUtils.host property is a USVString containing the host, that is the hostname, and then, if the port of the URL is nonempty, a ':', and the port of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAnchorElement/host">HTMLAnchorElement.host - MDN</a>
   */
  @Nonnull
  public String host;

  /**
   * The HTMLHyperlinkElementUtils.hostname property is a USVString containing the domain of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAnchorElement/hostname">HTMLAnchorElement.hostname - MDN</a>
   */
  @Nonnull
  public String hostname;

  /**
   * The HTMLHyperlinkElementUtils.href property is a stringifier that returns a USVString containing the whole URL, and allows the href to be updated.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAnchorElement/href">HTMLAnchorElement.href - MDN</a>
   */
  @Nonnull
  public String href;

  @Nonnull
  public String hreflang;

  @Nonnull
  public String name;

  /**
   * The HTMLHyperlinkElementUtils.password property is a USVString containing the password specified before the domain name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAnchorElement/password">HTMLAnchorElement.password - MDN</a>
   */
  @Nonnull
  public String password;

  /**
   * The HTMLHyperlinkElementUtils.pathname property is a USVString containing an initial '/' followed by the path of the URL (or the empty string if there is no path).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAnchorElement/pathname">HTMLAnchorElement.pathname - MDN</a>
   */
  @Nonnull
  public String pathname;

  @Nonnull
  public String ping;

  /**
   * The HTMLHyperlinkElementUtils.port property is a USVString containing the port number of the URL. If the URL does not contain an explicit port number, it will be set to ''.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAnchorElement/port">HTMLAnchorElement.port - MDN</a>
   */
  @Nonnull
  public String port;

  /**
   * The HTMLHyperlinkElementUtils.protocol property is a USVString representing the protocol scheme of the URL, including the final ':'.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAnchorElement/protocol">HTMLAnchorElement.protocol - MDN</a>
   */
  @Nonnull
  public String protocol;

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

  /**
   * The HTMLAnchorElement.rel property reflects the rel attribute. It is a DOMString containing a space-separated list of link types indicating the relationship between the resource represented by the a element and the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAnchorElement/rel">HTMLAnchorElement.rel - MDN</a>
   */
  @Nonnull
  public String rel;

  @Nonnull
  public String rev;

  /**
   * The HTMLHyperlinkElementUtils.search property is a search string, also called a query string, that is USVString containing a '?' followed by the parameters of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAnchorElement/search">HTMLAnchorElement.search - MDN</a>
   */
  @Nonnull
  public String search;

  @Nonnull
  public String shape;

  @Nonnull
  public String target;

  @Nonnull
  public String text;

  @Nonnull
  public String type;

  /**
   * The HTMLHyperlinkElementUtils.username property is a USVString containing the username specified before the domain name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAnchorElement/username">HTMLAnchorElement.username - MDN</a>
   */
  @Nonnull
  public String username;

  public HTMLAnchorElement() {
  }

  /**
   * The HTMLHyperlinkElementUtils.origin read-only property is a USVString containing the Unicode serialization of the origin of the represented URL
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAnchorElement/origin">HTMLAnchorElement.origin - MDN</a>
   */
  @JsProperty(
      name = "origin"
  )
  @Nonnull
  public native String origin();

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
}
