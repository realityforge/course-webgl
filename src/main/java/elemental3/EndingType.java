package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = EndingType.class
)
public @interface EndingType {
  @Nonnull
  String native_ = "native";

  @Nonnull
  String transparent = "transparent";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return EndingType.native_.equals( value ) || EndingType.transparent.equals( value );
    }
  }
}
