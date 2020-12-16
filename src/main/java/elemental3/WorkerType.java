package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = WorkerType.class
)
public @interface WorkerType {
  @Nonnull
  String classic = "classic";

  @Nonnull
  String module = "module";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return WorkerType.classic.equals( value ) || WorkerType.module.equals( value );
    }
  }
}
