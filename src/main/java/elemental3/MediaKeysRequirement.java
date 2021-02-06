package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = MediaKeysRequirement.class
)
public @interface MediaKeysRequirement {
  @Nonnull
  String not_allowed = "not-allowed";

  @Nonnull
  String optional = "optional";

  @Nonnull
  String required = "required";

  final class Validator {
    private Validator() {
    }

    @MediaKeysRequirement
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return MediaKeysRequirement.not_allowed.equals( value ) || MediaKeysRequirement.optional.equals( value ) || MediaKeysRequirement.required.equals( value );
    }
  }
}
