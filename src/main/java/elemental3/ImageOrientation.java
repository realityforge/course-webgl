package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ImageOrientation.class
)
public @interface ImageOrientation {
  @Nonnull
  String flipY = "flipY";

  @Nonnull
  String none = "none";

  final class Validator {
    private Validator() {
    }

    @ImageOrientation
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return ImageOrientation.flipY.equals( value ) || ImageOrientation.none.equals( value );
    }
  }
}
