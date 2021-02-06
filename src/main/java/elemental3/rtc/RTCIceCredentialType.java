package elemental3.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCIceCredentialType.class
)
public @interface RTCIceCredentialType {
  @Nonnull
  String password = "password";

  final class Validator {
    private Validator() {
    }

    @RTCIceCredentialType
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCIceCredentialType.password.equals( value );
    }
  }
}
