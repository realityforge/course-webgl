package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    intValues = {
        Event.NONE,
        Event.CAPTURING_PHASE,
        Event.AT_TARGET,
        Event.BUBBLING_PHASE
    }
)
public @interface EventPhase {
  final class Validator {
    private Validator() {
    }

    public static void assertValid(final int value) {
      assert isValid( value );
    }

    public static boolean isValid(final int value) {
      return Event.NONE == value || Event.CAPTURING_PHASE == value || Event.AT_TARGET == value || Event.BUBBLING_PHASE == value;
    }
  }
}
