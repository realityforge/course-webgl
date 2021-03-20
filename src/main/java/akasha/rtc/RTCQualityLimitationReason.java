package akasha.rtc;

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

  final class Util {
    private Util() {
    }

    @RTCQualityLimitationReason
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCQualityLimitationReason.bandwidth.equals( value ) || RTCQualityLimitationReason.cpu.equals( value ) || RTCQualityLimitationReason.none.equals( value ) || RTCQualityLimitationReason.other.equals( value );
    }
  }
}
