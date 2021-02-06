package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = BinaryType.class
)
public @interface BinaryType {
  @Nonnull
  String arraybuffer = "arraybuffer";

  @Nonnull
  String blob = "blob";

  final class Validator {
    private Validator() {
    }

    @BinaryType
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return BinaryType.arraybuffer.equals( value ) || BinaryType.blob.equals( value );
    }
  }
}
