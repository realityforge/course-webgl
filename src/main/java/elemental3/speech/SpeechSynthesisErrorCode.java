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
  String audio_busy = "audio_busy";

  @Nonnull
  String audio_hardware = "audio_hardware";

  @Nonnull
  String canceled = "canceled";

  @Nonnull
  String interrupted = "interrupted";

  @Nonnull
  String invalid_argument = "invalid_argument";

  @Nonnull
  String language_unavailable = "language_unavailable";

  @Nonnull
  String network = "network";

  @Nonnull
  String not_allowed = "not_allowed";

  @Nonnull
  String synthesis_failed = "synthesis_failed";

  @Nonnull
  String synthesis_unavailable = "synthesis_unavailable";

  @Nonnull
  String text_too_long = "text_too_long";

  @Nonnull
  String voice_unavailable = "voice_unavailable";
}
