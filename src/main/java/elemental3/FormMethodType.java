package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

/**
 * An enumeration specifying the HTTP method to submit the form with.
 */
@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = FormMethodType.class
)
public @interface FormMethodType {
  /**
   * When the form is inside a &lt;dialog&gt;, closes the dialog on submission.
   */
  @Nonnull
  String dialog = "dialog";

  /**
   * The GET method; form data appended to the action URL with a ? separator. Use this method when the form has no side-effects.
   */
  @Nonnull
  String get = "get";

  /**
   * The POST method; form data sent as the request body.
   */
  @Nonnull
  String post = "post";

  final class Validator {
    private Validator() {
    }

    @FormMethodType
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return FormMethodType.dialog.equals( value ) || FormMethodType.get.equals( value ) || FormMethodType.post.equals( value );
    }
  }
}
