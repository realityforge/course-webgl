package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ResponseType.class
)
public @interface ResponseType {
  @Nonnull
  String basic = "basic";

  @Nonnull
  String cors = "cors";

  @Nonnull
  String default_ = "default";

  @Nonnull
  String error = "error";

  @Nonnull
  String opaque = "opaque";

  @Nonnull
  String opaqueredirect = "opaqueredirect";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return ResponseType.basic.equals( value ) || ResponseType.cors.equals( value ) || ResponseType.default_.equals( value ) || ResponseType.error.equals( value ) || ResponseType.opaque.equals( value ) || ResponseType.opaqueredirect.equals( value );
    }
  }
}
