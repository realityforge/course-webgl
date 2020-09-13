package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;

/**
 * An enumeration specifying the HTTP method to submit the form with.
 */
@Generated("org.realityforge.webtack")
public final class FormMethodType {
  /**
   * The POST method; form data sent as the request body.
   */
  @Nonnull
  public static final String post = "post";

  /**
   * The GET method; form data appended to the action URL with a ? separator. Use this method when the form has no side-effects.
   */
  @Nonnull
  public static final String get = "get";

  /**
   * When the form is inside a &lt;dialog&gt;, closes the dialog on submission.
   */
  @Nonnull
  public static final String dialog = "dialog";

  private FormMethodType() {
  }
}
