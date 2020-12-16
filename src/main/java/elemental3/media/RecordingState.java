package elemental3.media;

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

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RecordingState.inactive.equals( value ) || RecordingState.paused.equals( value ) || RecordingState.recording.equals( value );
    }
  }
}
