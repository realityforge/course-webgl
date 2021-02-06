package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

/**
 * An enumerated value to indicate how the text track is meant to be used.
 */
@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = TrackKind.class
)
public @interface TrackKind {
  /**
   * Closed captions provide a transcription and possibly a translation of audio.
   * It may include important non-verbal information such as music cues or sound effects. It may indicate the cue's source (e.g. music, text, character).
   * Suitable for users who are deaf or when the sound is muted.
   */
  @Nonnull
  String captions = "captions";

  /**
   * Chapter titles are intended to be used when the user is navigating the media resource.
   */
  @Nonnull
  String chapters = "chapters";

  /**
   * Textual description of the video content.
   * Suitable for users who are blind or where the video cannot be seen.
   */
  @Nonnull
  String descriptions = "descriptions";

  /**
   * Tracks used by scripts. Not visible to the user.
   */
  @Nonnull
  String metadata = "metadata";

  /**
   * Subtitles provide translation of content that cannot be understood by the viewer. For example
   * dialogue or text that is not English in an English language film. Subtitles may contain additional
   * content, usually extra background information. For example the text at the beginning of the Star Wars
   * films, or the date, time, and location of a scene.
   */
  @Nonnull
  String subtitles = "subtitles";

  final class Validator {
    private Validator() {
    }

    @TrackKind
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return TrackKind.captions.equals( value ) || TrackKind.chapters.equals( value ) || TrackKind.descriptions.equals( value ) || TrackKind.metadata.equals( value ) || TrackKind.subtitles.equals( value );
    }
  }
}
