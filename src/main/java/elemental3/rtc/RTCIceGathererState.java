package elemental3.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCIceGathererState.class
)
public @interface RTCIceGathererState {
  @Nonnull
  String complete = "complete";

  @Nonnull
  String gathering = "gathering";

  @Nonnull
  String new_ = "new";

  final class Validator {
    private Validator() {
    }

    @RTCIceGathererState
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCIceGathererState.complete.equals( value ) || RTCIceGathererState.gathering.equals( value ) || RTCIceGathererState.new_.equals( value );
    }
  }
}
