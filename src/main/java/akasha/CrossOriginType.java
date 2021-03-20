package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

/**
 * An enumerated value to indicate whether to use CORS to fetch resources.
 */
@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = CrossOriginType.class
)
public @interface CrossOriginType {
  /**
   * Sends a cross-origin request without a credential. In other words, it sends
   * the <code>Origin:</code> HTTP header without a cookie, X.509 certificate, or performing HTTP
   * Basic authentication. If the server does not give credentials to the origin site (by not setting
   * the <code>Access-Control-Allow-Origin:</code> HTTP header), the image will be tainted, and its
   * usage restricted.
   */
  @Nonnull
  String anonymous = "anonymous";

  /**
   * Sends a cross-origin request with a credential. In other words, it sends the
   * <code>Origin:</code> HTTP header with a cookie, a certificate, or performing
   * HTTP Basic authentication. If the server does not give credentials to the origin
   * site (through <code>Access-Control-Allow-Credentials:</code> HTTP header), the
   * image will be tainted and its usage restricted.
   */
  @Nonnull
  String use_credentials = "use-credentials";

  final class Util {
    private Util() {
    }

    @CrossOriginType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return CrossOriginType.anonymous.equals( value ) || CrossOriginType.use_credentials.equals( value );
    }
  }
}
