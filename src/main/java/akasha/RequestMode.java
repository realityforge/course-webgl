package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RequestMode.class
)
public @interface RequestMode {
  @Nonnull
  String cors = "cors";

  @Nonnull
  String navigate = "navigate";

  @Nonnull
  String no_cors = "no-cors";

  @Nonnull
  String same_origin = "same-origin";

  final class Util {
    private Util() {
    }

    @RequestMode
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RequestMode.cors.equals( value ) || RequestMode.navigate.equals( value ) || RequestMode.no_cors.equals( value ) || RequestMode.same_origin.equals( value );
    }
  }
}
