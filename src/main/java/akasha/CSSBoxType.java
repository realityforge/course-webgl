package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = CSSBoxType.class
)
public @interface CSSBoxType {
  @Nonnull
  String border = "border";

  @Nonnull
  String content = "content";

  @Nonnull
  String margin = "margin";

  @Nonnull
  String padding = "padding";

  final class Util {
    private Util() {
    }

    @CSSBoxType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return CSSBoxType.border.equals( value ) || CSSBoxType.content.equals( value ) || CSSBoxType.margin.equals( value ) || CSSBoxType.padding.equals( value );
    }
  }
}
