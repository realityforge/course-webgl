package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RequestCredentials.class
)
public @interface RequestCredentials {
  @Nonnull
  String include = "include";

  @Nonnull
  String omit = "omit";

  @Nonnull
  String same_origin = "same-origin";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RequestCredentials.include.equals( value ) || RequestCredentials.omit.equals( value ) || RequestCredentials.same_origin.equals( value );
    }
  }
}
