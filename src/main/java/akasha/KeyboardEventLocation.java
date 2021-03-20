package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
  final class Util {
    private Util() {
    }

    @KeyboardEventLocation
    public static int requireValid(final int value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(final int value) {
      assert isValid( value ) : "@KeyboardEventLocation annotated value must be one of [KeyboardEvent.DOM_KEY_LOCATION_STANDARD, KeyboardEvent.DOM_KEY_LOCATION_LEFT, KeyboardEvent.DOM_KEY_LOCATION_RIGHT, KeyboardEvent.DOM_KEY_LOCATION_NUMPAD] but is " + value;
    }

    public static boolean isValid(final int value) {
      return KeyboardEvent.DOM_KEY_LOCATION_STANDARD == value || KeyboardEvent.DOM_KEY_LOCATION_LEFT == value || KeyboardEvent.DOM_KEY_LOCATION_RIGHT == value || KeyboardEvent.DOM_KEY_LOCATION_NUMPAD == value;
    }

    @Nonnull
    public static String describe(final int value) {
      return KeyboardEvent.DOM_KEY_LOCATION_STANDARD == value ? "DOM_KEY_LOCATION_STANDARD" : KeyboardEvent.DOM_KEY_LOCATION_LEFT == value ? "DOM_KEY_LOCATION_LEFT" : KeyboardEvent.DOM_KEY_LOCATION_RIGHT == value ? "DOM_KEY_LOCATION_RIGHT" : KeyboardEvent.DOM_KEY_LOCATION_NUMPAD == value ? "DOM_KEY_LOCATION_NUMPAD" : "Unknown value " + value;
    }
  }
}
