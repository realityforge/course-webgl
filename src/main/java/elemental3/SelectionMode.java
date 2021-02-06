package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = SelectionMode.class
)
public @interface SelectionMode {
  @Nonnull
  String end = "end";

  @Nonnull
  String preserve = "preserve";

  @Nonnull
  String select = "select";

  @Nonnull
  String start = "start";

  final class Validator {
    private Validator() {
    }

    @SelectionMode
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return SelectionMode.end.equals( value ) || SelectionMode.preserve.equals( value ) || SelectionMode.select.equals( value ) || SelectionMode.start.equals( value );
    }
  }
}
