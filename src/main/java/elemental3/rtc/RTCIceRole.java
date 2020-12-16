package elemental3.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCIceRole.class
)
public @interface RTCIceRole {
  @Nonnull
  String controlled = "controlled";

  @Nonnull
  String controlling = "controlling";

  @Nonnull
  String unknown = "unknown";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCIceRole.controlled.equals( value ) || RTCIceRole.controlling.equals( value ) || RTCIceRole.unknown.equals( value );
    }
  }
}
