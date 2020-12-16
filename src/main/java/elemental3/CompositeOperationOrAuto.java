package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = CompositeOperationOrAuto.class
)
public @interface CompositeOperationOrAuto {
  @Nonnull
  String accumulate = "accumulate";

  @Nonnull
  String add = "add";

  @Nonnull
  String auto = "auto";

  @Nonnull
  String replace = "replace";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return CompositeOperationOrAuto.accumulate.equals( value ) || CompositeOperationOrAuto.add.equals( value ) || CompositeOperationOrAuto.auto.equals( value ) || CompositeOperationOrAuto.replace.equals( value );
    }
  }
}
