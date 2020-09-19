package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
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
}
