package akasha.media;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RecordingState.class
)
public @interface RecordingState {
  @Nonnull
  String inactive = "inactive";

  @Nonnull
  String paused = "paused";

  @Nonnull
  String recording = "recording";

  final class Util {
    private Util() {
    }

    @RecordingState
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RecordingState.inactive.equals( value ) || RecordingState.paused.equals( value ) || RecordingState.recording.equals( value );
    }
  }
}
