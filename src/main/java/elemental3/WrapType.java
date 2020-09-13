package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;

/**
 * An enumerated value to indicate how the control wraps text.
 */
@Generated("org.realityforge.webtack")
public final class WrapType {
  /**
   * The browser automatically inserts line breaks (CR+LF) so that each line has no more
   * than the width of the control; the cols attribute must also be specified for this to
   * take effect.
   */
  @Nonnull
  public static final String hard = "hard";

  /**
   * The browser ensures that all line breaks in the value consist of a CR+LF pair, but does
   * not insert any additional line breaks. This is the default value.
   */
  @Nonnull
  public static final String soft = "soft";

  private WrapType() {
  }
}
