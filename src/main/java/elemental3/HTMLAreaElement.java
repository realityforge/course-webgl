package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLAreaElement interface provides special properties and methods (beyond those of the regular object HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of &lt;area&gt; elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAreaElement">HTMLAreaElement - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlareaelement">HTMLAreaElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#the-area-element">HTMLAreaElement - HTML5</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-26019118">HTMLAreaElement - Document Object Model (DOM) Level 2 HTML Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-26019118">HTMLAreaElement - Document Object Model (DOM) Level 1 Specification</a>
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

  /**
   * The HTMLHyperlinkElementUtils.hash property returns a USVString containing a '#' followed by the fragment identifier of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAreaElement/hash">HTMLAreaElement.hash - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-hyperlink-hash">HTMLHyperlinkElementUtils.hash - HTML Living Standard</a>
   */
  @Nonnull
  public String hash;

  /**
   * The HTMLHyperlinkElementUtils.host property is a USVString containing the host, that is the hostname, and then, if the port of the URL is nonempty, a ':', and the port of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAreaElement/host">HTMLAreaElement.host - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-hyperlink-host">HTMLHyperlinkElementUtils.host - HTML Living Standard</a>
   */
  @Nonnull
  public String host;

  /**
   * The HTMLHyperlinkElementUtils.hostname property is a USVString containing the domain of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAreaElement/hostname">HTMLAreaElement.hostname - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-hyperlink-hostname">HTMLHyperlinkElementUtils.hostname - HTML Living Standard</a>
   */
  @Nonnull
  public String hostname;

  /**
   * The HTMLHyperlinkElementUtils.href property is a stringifier that returns a USVString containing the whole URL, and allows the href to be updated.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAreaElement/href">HTMLAreaElement.href - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-hyperlink-href">HTMLHyperlinkElementUtils.href - HTML Living Standard</a>
   */
  @Nonnull
  public String href;

  public boolean noHref;

  /**
   * The HTMLHyperlinkElementUtils.password property is a USVString containing the password specified before the domain name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAreaElement/password">HTMLAreaElement.password - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-hyperlink-password">HTMLHyperlinkElementUtils.password - HTML Living Standard</a>
   */
  @Nonnull
  public String password;

  /**
   * The HTMLHyperlinkElementUtils.pathname property is a USVString containing an initial '/' followed by the path of the URL (or the empty string if there is no path).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAreaElement/pathname">HTMLAreaElement.pathname - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-hyperlink-pathname">HTMLHyperlinkElementUtils.pathname - HTML Living Standard</a>
   */
  @Nonnull
  public String pathname;

  @Nonnull
  public String ping;

  /**
   * The HTMLHyperlinkElementUtils.port property is a USVString containing the port number of the URL. If the URL does not contain an explicit port number, it will be set to ''.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAreaElement/port">HTMLAreaElement.port - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-hyperlink-port">HTMLHyperlinkElementUtils.port - HTML Living Standard</a>
   */
  @Nonnull
  public String port;

  /**
   * The HTMLHyperlinkElementUtils.protocol property is a USVString representing the protocol scheme of the URL, including the final ':'.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAreaElement/protocol">HTMLAreaElement.protocol - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-hyperlink-protocol">HTMLHyperlinkElementUtils.protocol - HTML Living Standard</a>
   */
  @Nonnull
  public String protocol;

  /**
   * The HTMLAreaElement.referrerPolicy property reflect the HTML referrerpolicy attribute of the area element defining which referrer is sent when fetching the resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAreaElement/referrerPolicy">HTMLAreaElement.referrerPolicy - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-referrer-policy/#referrer-policy-delivery-referrer-attribute">referrerpolicy attribute - Referrer Policy</a>
   */
  @Nonnull
  @ReferrerPolicy
  public String referrerPolicy;

  /**
   * The HTMLAreaElement.rel property reflects the rel attribute. It is a DOMString containing a space-separated list of link types indicating the relationship between the resource represented by the area element and the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAreaElement/rel">HTMLAreaElement.rel - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-area-rel">rel - HTML Living Standard</a>
   */
  @Nonnull
  public String rel;

  /**
   * The HTMLHyperlinkElementUtils.search property is a search string, also called a query string, that is USVString containing a '?' followed by the parameters of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAreaElement/search">HTMLAreaElement.search - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-hyperlink-search">HTMLHyperlinkElementUtils.search - HTML Living Standard</a>
   */
  @Nonnull
  public String search;

  @Nonnull
  public String shape;

  @Nonnull
  public String target;

  /**
   * The HTMLHyperlinkElementUtils.username property is a USVString containing the username specified before the domain name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAreaElement/username">HTMLAreaElement.username - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-hyperlink-username">HTMLHyperlinkElementUtils.username - HTML Living Standard</a>
   */
  @Nonnull
  public String username;

  protected HTMLAreaElement() {
  }

  /**
   * The HTMLHyperlinkElementUtils.origin read-only property is a USVString containing the Unicode serialization of the origin of the represented URL
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAreaElement/origin">HTMLAreaElement.origin - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-hyperlink-origin">HTMLHyperlinkElementUtils.origin - HTML Living Standard</a>
   */
  @JsProperty(
      name = "origin"
  )
  @Nonnull
  public native String origin();

  /**
   * The HTMLAreaElement.relList read-only property reflects the rel attribute. It is a live DOMTokenList containing the set of link types indicating the relationship between the resource represented by the area element and the current document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLAreaElement/relList">HTMLAreaElement.relList - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/embedded-content.html#dom-area-rellist">relList - HTML Living Standard</a>
   */
  @JsProperty(
      name = "relList"
  )
  @Nonnull
  public native DOMTokenList relList();
}
