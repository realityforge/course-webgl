package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        Range.START_TO_START,
        Range.START_TO_END,
        Range.END_TO_END,
        Range.END_TO_START
    }
)
public @interface RangeCompareType {
  final class Validator {
    private Validator() {
    }

    public static void assertValid(final int value) {
      assert isValid( value );
    }

    public static boolean isValid(final int value) {
      return Range.START_TO_START == value || Range.START_TO_END == value || Range.END_TO_END == value || Range.END_TO_START == value;
    }
  }
}
