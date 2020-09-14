package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The URL interface is used to parse, construct, normalize, and encode URLs. It works by providing properties which allow you to easily read and modify the components of a URL.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URL">URL - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "URL"
)
public class URL {
  /**
   * The hash property of the URL interface is a USVString containing a '#' followed by the fragment identifier of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URL/hash">URL.hash - MDN</a>
   */
  @Nonnull
  public String hash;

  /**
   * The host property of the URL interface is a USVString containing the host, that is the hostname, and then, if the port of the URL is nonempty, a ':', followed by the port of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URL/host">URL.host - MDN</a>
   */
  @Nonnull
  public String host;

  /**
   * The hostname property of the URL interface is a USVString containing the domain name of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URL/hostname">URL.hostname - MDN</a>
   */
  @Nonnull
  public String hostname;

  /**
   * The href property of the URL interface is a USVString containing the whole URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URL/href">URL.href - MDN</a>
   */
  @Nonnull
  public String href;

  /**
   * The password property of the URL interface is a USVString containing the password specified before the domain name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URL/password">URL.password - MDN</a>
   */
  @Nonnull
  public String password;

  /**
   * The pathname property of the URL interface is a USVString containing an initial '/' followed by the path of the URL (or the empty string if there is no path).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URL/pathname">URL.pathname - MDN</a>
   */
  @Nonnull
  public String pathname;

  /**
   * The port property of the URL interface is a USVString containing the port number of the URL. If the URL does not contain an explicit port number, it will be set to ''.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URL/port">URL.port - MDN</a>
   */
  @Nonnull
  public String port;

  /**
   * The protocol property of the URL interface is a USVString representing the protocol scheme of the URL, including the final ':'.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URL/protocol">URL.protocol - MDN</a>
   */
  @Nonnull
  public String protocol;

  /**
   * The search property of the URL interface is a search string, also called a query string, that is a USVString containing a '?' followed by the parameters of the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URL/search">URL.search - MDN</a>
   */
  @Nonnull
  public String search;

  /**
   * The username property of the URL interface is a USVString containing the username specified before the domain name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URL/username">URL.username - MDN</a>
   */
  @Nonnull
  public String username;

  public URL(@Nonnull final String url, @Nonnull final String base) {
  }

  public URL(@Nonnull final String url) {
  }

  /**
   * The origin read-only property of the URL interface returns a USVString containing the Unicode serialization of the origin of the represented URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URL/origin">URL.origin - MDN</a>
   */
  @JsProperty(
      name = "origin"
  )
  @Nonnull
  public native String origin();

  /**
   * The searchParams readonly property of the URL interface returns a URLSearchParams object allowing access to the GET decoded query arguments contained in the URL.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URL/searchParams">URL.searchParams - MDN</a>
   */
  @JsProperty(
      name = "searchParams"
  )
  @Nonnull
  public native URLSearchParams searchParams();

  /**
   * The toJSON() method of the URL interface returns a USVString containing a serialized version of the URL, although in practice it seems to have the same effect as URL.toString().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URL/toJSON">URL.toJSON - MDN</a>
   */
  @Nonnull
  public native String toJSON();

  /**
   * The URL.revokeObjectURL() static method releases an existing object URL which was previously created by calling URL.createObjectURL().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URL/revokeObjectURL">URL.revokeObjectURL - MDN</a>
   */
  public static native void revokeObjectURL(@Nonnull String url);

  /**
   * The URL.createObjectURL() static method creates a DOMString containing a URL representing the object given in the parameter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URL/createObjectURL">URL.createObjectURL - MDN</a>
   */
  @Nonnull
  public static native String createObjectURL(@Nonnull Blob blob);

  /**
   * The URL.createObjectURL() static method creates a DOMString containing a URL representing the object given in the parameter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/URL/createObjectURL">URL.createObjectURL - MDN</a>
   */
  @Nonnull
  public static native String createObjectURL(@Nonnull MediaSource mediaSource);
}
