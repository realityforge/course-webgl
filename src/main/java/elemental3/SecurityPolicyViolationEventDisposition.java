package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = SecurityPolicyViolationEventDisposition.class
)
public @interface SecurityPolicyViolationEventDisposition {
  @Nonnull
  String enforce = "enforce";

  @Nonnull
  String report = "report";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return SecurityPolicyViolationEventDisposition.enforce.equals( value ) || SecurityPolicyViolationEventDisposition.report.equals( value );
    }
  }
}
