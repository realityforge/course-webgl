package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

/**
 * An enumerated value to provide a hint to the browser about what the author thinks will lead to the best user experience.
 */
@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = MediaPreloadType.class
)
public @interface MediaPreloadType {
  /**
   * Indicates that the whole audio file can be downloaded, even if the user is not expected to use it.
   */
  @Nonnull
  String auto = "auto";

  /**
   * Indicates that only audio metadata (e.g. length) is fetched.
   */
  @Nonnull
  String metadata = "metadata";

  /**
   * Indicates that the audio should not be preloaded.
   */
  @Nonnull
  String none = "none";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return MediaPreloadType.auto.equals( value ) || MediaPreloadType.metadata.equals( value ) || MediaPreloadType.none.equals( value );
    }
  }
}
