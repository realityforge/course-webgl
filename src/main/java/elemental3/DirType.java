package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;

/**
 * An enumerated attribute indicating the directionality of the element's text.
 */
@Generated("org.realityforge.webtack")
public final class DirType {
  /**
   * Left to right direction which is to be used for languages that are written from the left to the right, such as English.
   */
  @Nonnull
  public static final String ltr = "ltr";

  /**
   * Right to left direction which is to be used for languages that are written from the right to the left, such as Arabic.
   */
  @Nonnull
  public static final String rtl = "rtl";

  /**
   * Auto direction which lets the user agent decide. It uses a basic algorithm as it parses the characters inside the element until it finds a character with a strong directionality, then it applies that directionality to the whole element.
   */
  @Nonnull
  public static final String auto = "auto";

  private DirType() {
  }
}
