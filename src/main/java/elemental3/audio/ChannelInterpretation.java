package elemental3.audio;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ChannelInterpretation.class
)
public @interface ChannelInterpretation {
  @Nonnull
  String discrete = "discrete";

  @Nonnull
  String speakers = "speakers";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return ChannelInterpretation.discrete.equals( value ) || ChannelInterpretation.speakers.equals( value );
    }
  }
}
