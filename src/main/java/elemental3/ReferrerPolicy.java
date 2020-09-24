package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

/**
 * An enumerated value to indicates which referrer to send when fetching the resource.
 *
 * @see <a href="https://w3c.github.io/webappsec-referrer-policy/#referrer-policies">ReferrerPolicy - Specification</a>
 */
@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ReferrerPolicy.class
)
public @interface ReferrerPolicy {
  /**
   * The Referer header will not be sent.
   */
  @Nonnull
  String no_referrer = "no_referrer";

  /**
   * The Referer header will not be sent to origins without TLS. This is the default value.
   */
  @Nonnull
  String no_referrer_when_downgrade = "no_referrer_when_downgrade";

  /**
   * The sent referrer will be limited to the origin of the referring page: its scheme, host, and port.
   */
  @Nonnull
  String origin = "origin";

  /**
   * The referrer sent to other origins will be limited to the scheme, the host, and the port. Navigations on the same origin will still include the path.
   */
  @Nonnull
  String origin_when_cross_origin = "origin_when_cross_origin";

  /**
   * A referrer will be sent for same origin, but cross-origin requests will contain no referrer information.
   */
  @Nonnull
  String same_origin = "same_origin";

  /**
   * Only send the origin of the document as the referrer when the protocol security level stays the same (e.g. HTTPS &#8594; HTTPS), but don't send it to a less secure destination (e.g. HTTPS &#8594; HTTP).
   */
  @Nonnull
  String strict_origin = "strict_origin";

  /**
   * Send a full URL when performing a same-origin request, but only send the origin when the protocol security level stays the same (e.g.HTTPS &#8594; HTTPS), and send no header to a less secure destination (e.g. HTTPS &#8594; HTTP).
   */
  @Nonnull
  String strict_origin_when_cross_origin = "strict_origin_when_cross_origin";

  /**
   * The referrer will include the origin and the path (but not the fragment, password, or username). This value is unsafe, because it leaks origins and paths from TLS-protected resources to insecure origins.
   */
  @Nonnull
  String unsafe_url = "unsafe_url";
}
