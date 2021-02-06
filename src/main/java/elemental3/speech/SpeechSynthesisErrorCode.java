package elemental3.speech;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = SpeechSynthesisErrorCode.class
)
public @interface SpeechSynthesisErrorCode {
  @Nonnull
  String audio_busy = "audio-busy";

  @Nonnull
  String audio_hardware = "audio-hardware";

  @Nonnull
  String canceled = "canceled";

  @Nonnull
  String interrupted = "interrupted";

  @Nonnull
  String invalid_argument = "invalid-argument";

  @Nonnull
  String language_unavailable = "language-unavailable";

  @Nonnull
  String network = "network";

  @Nonnull
  String not_allowed = "not-allowed";

  @Nonnull
  String synthesis_failed = "synthesis-failed";

  @Nonnull
  String synthesis_unavailable = "synthesis-unavailable";

  @Nonnull
  String text_too_long = "text-too-long";

  @Nonnull
  String voice_unavailable = "voice-unavailable";

  final class Validator {
    private Validator() {
    }

    @SpeechSynthesisErrorCode
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return SpeechSynthesisErrorCode.audio_busy.equals( value ) || SpeechSynthesisErrorCode.audio_hardware.equals( value ) || SpeechSynthesisErrorCode.canceled.equals( value ) || SpeechSynthesisErrorCode.interrupted.equals( value ) || SpeechSynthesisErrorCode.invalid_argument.equals( value ) || SpeechSynthesisErrorCode.language_unavailable.equals( value ) || SpeechSynthesisErrorCode.network.equals( value ) || SpeechSynthesisErrorCode.not_allowed.equals( value ) || SpeechSynthesisErrorCode.synthesis_failed.equals( value ) || SpeechSynthesisErrorCode.synthesis_unavailable.equals( value ) || SpeechSynthesisErrorCode.text_too_long.equals( value ) || SpeechSynthesisErrorCode.voice_unavailable.equals( value );
    }
  }
}
