package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        KeyboardEvent.DOM_KEY_LOCATION_STANDARD,
        KeyboardEvent.DOM_KEY_LOCATION_LEFT,
        KeyboardEvent.DOM_KEY_LOCATION_RIGHT,
        KeyboardEvent.DOM_KEY_LOCATION_NUMPAD
    }
)
public @interface KeyboardEventLocation {
  final class Validator {
    private Validator() {
    }

    public static void assertValid(final int value) {
      assert isValid( value );
    }

    public static boolean isValid(final int value) {
      return KeyboardEvent.DOM_KEY_LOCATION_STANDARD == value || KeyboardEvent.DOM_KEY_LOCATION_LEFT == value || KeyboardEvent.DOM_KEY_LOCATION_RIGHT == value || KeyboardEvent.DOM_KEY_LOCATION_NUMPAD == value;
    }
  }
}
