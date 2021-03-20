package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = TokenBindingStatus.class
)
public @interface TokenBindingStatus {
  @Nonnull
  String present = "present";

  @Nonnull
  String supported = "supported";

  final class Util {
    private Util() {
    }

    @TokenBindingStatus
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return TokenBindingStatus.present.equals( value ) || TokenBindingStatus.supported.equals( value );
    }
  }
}
