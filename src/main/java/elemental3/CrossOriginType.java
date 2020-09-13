package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;

/**
 * An enumerated value to indicate whether to use CORS to fetch resources.
 */
@Generated("org.realityforge.webtack")
public final class CrossOriginType {
  /**
   * Sends a cross-origin request without a credential. In other words, it sends
   * the <code>Origin:</code> HTTP header without a cookie, X.509 certificate, or performing HTTP
   * Basic authentication. If the server does not give credentials to the origin site (by not setting
   * the <code>Access-Control-Allow-Origin:</code> HTTP header), the image will be tainted, and its
   * usage restricted.
   */
  @Nonnull
  public static final String anonymous = "anonymous";

  /**
   * Sends a cross-origin request with a credential. In other words, it sends the
   * <code>Origin:</code> HTTP header with a cookie, a certificate, or performing
   * HTTP Basic authentication. If the server does not give credentials to the origin
   * site (through <code>Access-Control-Allow-Credentials:</code> HTTP header), the
   * image will be tainted and its usage restricted.
   */
  @Nonnull
  public static final String use_credentials = "use-credentials";

  private CrossOriginType() {
  }
}
