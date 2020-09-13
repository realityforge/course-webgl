package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;

/**
 * An enumerated value to indicates which referrer to send when fetching the resource.
 *
 * @see <a href="https://w3c.github.io/webappsec-referrer-policy/#referrer-policies">ReferrerPolicy - Specification</a>
 */
@Generated("org.realityforge.webtack")
public final class ReferrerPolicy {
  /**
   * The Referer header will not be sent.
   */
  @Nonnull
  public static final String no_referrer = "no-referrer";

  /**
   * The Referer header will not be sent to origins without TLS. This is the default value.
   */
  @Nonnull
  public static final String no_referrer_when_downgrade = "no-referrer-when-downgrade";

  /**
   * The sent referrer will be limited to the origin of the referring page: its scheme, host, and port.
   */
  @Nonnull
  public static final String origin = "origin";

  /**
   * The referrer sent to other origins will be limited to the scheme, the host, and the port. Navigations on the same origin will still include the path.
   */
  @Nonnull
  public static final String origin_when_cross_origin = "origin-when-cross-origin";

  /**
   * A referrer will be sent for same origin, but cross-origin requests will contain no referrer information.
   */
  @Nonnull
  public static final String same_origin = "same-origin";

  /**
   * Only send the origin of the document as the referrer when the protocol security level stays the same (e.g. HTTPS &#8594; HTTPS), but don't send it to a less secure destination (e.g. HTTPS &#8594; HTTP).
   */
  @Nonnull
  public static final String strict_origin = "strict-origin";

  /**
   * Send a full URL when performing a same-origin request, but only send the origin when the protocol security level stays the same (e.g.HTTPS &#8594; HTTPS), and send no header to a less secure destination (e.g. HTTPS &#8594; HTTP).
   */
  @Nonnull
  public static final String strict_origin_when_cross_origin = "strict-origin-when-cross-origin";

  /**
   * The referrer will include the origin and the path (but not the fragment, password, or username). This value is unsafe, because it leaks origins and paths from TLS-protected resources to insecure origins.
   */
  @Nonnull
  public static final String unsafe_url = "unsafe-url";

  private ReferrerPolicy() {
  }
}
