package elemental3.svg;

import elemental3.DOMTokenList;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGAElement interface provides access to the properties of a element, as well as methods to manipulate them.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGAElement">SVGAElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGAElement"
)
public class SVGAElement extends SVGGraphicsElement {
  @Nonnull
  public String download;

  /**
   * The HTMLHyperlinkElementUtils.hash property returns a USVString containing a '#' followed by the fragment identifier of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLHyperlinkElementUtils/hash">HTMLHyperlinkElementUtils.hash - MDN</a>
   */
  @Nonnull
  public String hash;

  /**
   * The HTMLHyperlinkElementUtils.host property is a USVString containing the host, that is the hostname, and then, if the port of the URL is nonempty, a ':', and the port of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLHyperlinkElementUtils/host">HTMLHyperlinkElementUtils.host - MDN</a>
   */
  @Nonnull
  public String host;

  /**
   * The HTMLHyperlinkElementUtils.hostname property is a USVString containing the domain of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLHyperlinkElementUtils/hostname">HTMLHyperlinkElementUtils.hostname - MDN</a>
   */
  @Nonnull
  public String hostname;

  /**
   * The HTMLHyperlinkElementUtils.href property is a stringifier that returns a USVString containing the whole URL, and allows the href to be updated.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLHyperlinkElementUtils/href">HTMLHyperlinkElementUtils.href - MDN</a>
   */
  @Nonnull
  public String href;

  @Nonnull
  public String hreflang;

  /**
   * The HTMLHyperlinkElementUtils.password property is a USVString containing the password specified before the domain name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLHyperlinkElementUtils/password">HTMLHyperlinkElementUtils.password - MDN</a>
   */
  @Nonnull
  public String password;

  /**
   * The HTMLHyperlinkElementUtils.pathname property is a USVString containing an initial '/' followed by the path of the URL (or the empty string if there is no path).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLHyperlinkElementUtils/pathname">HTMLHyperlinkElementUtils.pathname - MDN</a>
   */
  @Nonnull
  public String pathname;

  @Nonnull
  public String ping;

  /**
   * The HTMLHyperlinkElementUtils.port property is a USVString containing the port number of the URL. If the URL does not contain an explicit port number, it will be set to ''.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLHyperlinkElementUtils/port">HTMLHyperlinkElementUtils.port - MDN</a>
   */
  @Nonnull
  public String port;

  /**
   * The HTMLHyperlinkElementUtils.protocol property is a USVString representing the protocol scheme of the URL, including the final ':'.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLHyperlinkElementUtils/protocol">HTMLHyperlinkElementUtils.protocol - MDN</a>
   */
  @Nonnull
  public String protocol;

  @Nonnull
  public String referrerPolicy;

  @Nonnull
  public String rel;

  /**
   * The HTMLHyperlinkElementUtils.search property is a search string, also called a query string, that is USVString containing a '?' followed by the parameters of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLHyperlinkElementUtils/search">HTMLHyperlinkElementUtils.search - MDN</a>
   */
  @Nonnull
  public String search;

  @Nonnull
  public String text;

  @Nonnull
  public String type;

  /**
   * The HTMLHyperlinkElementUtils.username property is a USVString containing the username specified before the domain name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLHyperlinkElementUtils/username">HTMLHyperlinkElementUtils.username - MDN</a>
   */
  @Nonnull
  public String username;

  protected SVGAElement() {
  }

  /**
   * The HTMLHyperlinkElementUtils.origin read-only property is a USVString containing the Unicode serialization of the origin of the represented URL
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLHyperlinkElementUtils/origin">HTMLHyperlinkElementUtils.origin - MDN</a>
   */
  @JsProperty(
      name = "origin"
  )
  @Nonnull
  public native String origin();

  @JsProperty(
      name = "relList"
  )
  @Nonnull
  public native DOMTokenList relList();

  /**
   * The SVGAElement.target read-only property of SVGAElement returns an SVGAnimatedString object that specifies the portion of a target window, frame, pane into which a document is to be opened when a link is activated.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGAElement/target">SVGAElement.target - MDN</a>
   */
  @JsProperty(
      name = "target"
  )
  @Nonnull
  public native SVGAnimatedString target();
}
