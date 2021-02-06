package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = AttestationConveyancePreference.class
)
public @interface AttestationConveyancePreference {
  @Nonnull
  String direct = "direct";

  @Nonnull
  String indirect = "indirect";

  @Nonnull
  String none = "none";

  final class Validator {
    private Validator() {
    }

    @AttestationConveyancePreference
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return AttestationConveyancePreference.direct.equals( value ) || AttestationConveyancePreference.indirect.equals( value ) || AttestationConveyancePreference.none.equals( value );
    }
  }
}
