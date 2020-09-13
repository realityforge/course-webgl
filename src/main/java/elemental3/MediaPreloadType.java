package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;

/**
 * An enumerated value to provide a hint to the browser about what the author thinks will lead to the best user experience.
 */
@Generated("org.realityforge.webtack")
public final class MediaPreloadType {
  /**
   * Indicates that the audio should not be preloaded.
   */
  @Nonnull
  public static final String none = "none";

  /**
   * Indicates that only audio metadata (e.g. length) is fetched.
   */
  @Nonnull
  public static final String metadata = "metadata";

  /**
   * Indicates that the whole audio file can be downloaded, even if the user is not expected to use it.
   */
  @Nonnull
  public static final String auto = "auto";

  private MediaPreloadType() {
  }
}
