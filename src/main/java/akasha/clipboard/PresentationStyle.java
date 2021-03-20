package akasha.clipboard;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = PresentationStyle.class
)
public @interface PresentationStyle {
  @Nonnull
  String attachment = "attachment";

  @Nonnull
  String inline = "inline";

  @Nonnull
  String unspecified = "unspecified";

  final class Util {
    private Util() {
    }

    @PresentationStyle
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return PresentationStyle.attachment.equals( value ) || PresentationStyle.inline.equals( value ) || PresentationStyle.unspecified.equals( value );
    }
  }
}
