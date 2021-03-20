package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
  final class Util {
    private Util() {
    }

    @RangeCompareType
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@RangeCompareType annotated value must be one of [Range.START_TO_START, Range.START_TO_END, Range.END_TO_END, Range.END_TO_START] but is " + value;
    }

    public static boolean isValid(final int value) {
      return Range.START_TO_START == value || Range.START_TO_END == value || Range.END_TO_END == value || Range.END_TO_START == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return Range.START_TO_START == value ? "START_TO_START" : Range.START_TO_END == value ? "START_TO_END" : Range.END_TO_END == value ? "END_TO_END" : Range.END_TO_START == value ? "END_TO_START" : "Unknown value " + value;
    }
  }
}
