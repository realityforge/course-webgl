package akasha.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCPriorityType.class
)
public @interface RTCPriorityType {
  @Nonnull
  String high = "high";

  @Nonnull
  String low = "low";

  @Nonnull
  String medium = "medium";

  @Nonnull
  String very_low = "very-low";

  final class Util {
    private Util() {
    }

    @RTCPriorityType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCPriorityType.high.equals( value ) || RTCPriorityType.low.equals( value ) || RTCPriorityType.medium.equals( value ) || RTCPriorityType.very_low.equals( value );
    }
  }
}
