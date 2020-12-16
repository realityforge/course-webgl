package elemental3.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCQualityLimitationReason.class
)
public @interface RTCQualityLimitationReason {
  @Nonnull
  String bandwidth = "bandwidth";

  @Nonnull
  String cpu = "cpu";

  @Nonnull
  String none = "none";

  @Nonnull
  String other = "other";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCQualityLimitationReason.bandwidth.equals( value ) || RTCQualityLimitationReason.cpu.equals( value ) || RTCQualityLimitationReason.none.equals( value ) || RTCQualityLimitationReason.other.equals( value );
    }
  }
}
