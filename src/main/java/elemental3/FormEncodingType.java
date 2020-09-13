package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;

/**
 * An enumeration specifying the HTTP method to submit the form with.
 */
@Generated("org.realityforge.webtack")
public final class FormEncodingType {
  /**
   * The default value.
   */
  @Nonnull
  public static final String application_x_www_form_urlencoded = "application/x-www-form-urlencoded";

  /**
   * Use this if the form contains <code>&lt;input&gt;</code> elements with type=file.
   */
  @Nonnull
  public static final String multipart_form_data = "multipart/form-data";

  /**
   * Introduced by HTML5 for debugging purposes.
   */
  @Nonnull
  public static final String text_plain = "text/plain";

  private FormEncodingType() {
  }
}
