package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = TextTrackKind.class
)
public @interface TextTrackKind {
  @Nonnull
  String captions = "captions";

  @Nonnull
  String chapters = "chapters";

  @Nonnull
  String descriptions = "descriptions";

  @Nonnull
  String metadata = "metadata";

  @Nonnull
  String subtitles = "subtitles";

  final class Validator {
    private Validator() {
    }

    @TextTrackKind
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return TextTrackKind.captions.equals( value ) || TextTrackKind.chapters.equals( value ) || TextTrackKind.descriptions.equals( value ) || TextTrackKind.metadata.equals( value ) || TextTrackKind.subtitles.equals( value );
    }
  }
}
