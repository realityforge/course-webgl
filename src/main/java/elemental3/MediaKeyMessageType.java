package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = MediaKeyMessageType.class
)
public @interface MediaKeyMessageType {
  @Nonnull
  String individualization_request = "individualization-request";

  @Nonnull
  String license_release = "license-release";

  @Nonnull
  String license_renewal = "license-renewal";

  @Nonnull
  String license_request = "license-request";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return MediaKeyMessageType.individualization_request.equals( value ) || MediaKeyMessageType.license_release.equals( value ) || MediaKeyMessageType.license_renewal.equals( value ) || MediaKeyMessageType.license_request.equals( value );
    }
  }
}
