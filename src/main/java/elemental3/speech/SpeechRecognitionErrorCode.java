package elemental3.speech;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = SpeechRecognitionErrorCode.class
)
public @interface SpeechRecognitionErrorCode {
  @Nonnull
  String aborted = "aborted";

  @Nonnull
  String audio_capture = "audio_capture";

  @Nonnull
  String bad_grammar = "bad_grammar";

  @Nonnull
  String language_not_supported = "language_not_supported";

  @Nonnull
  String network = "network";

  @Nonnull
  String no_speech = "no_speech";

  @Nonnull
  String not_allowed = "not_allowed";

  @Nonnull
  String service_not_allowed = "service_not_allowed";
}
