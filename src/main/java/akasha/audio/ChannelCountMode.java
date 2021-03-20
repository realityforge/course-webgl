package akasha.audio;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ChannelCountMode.class
)
public @interface ChannelCountMode {
  @Nonnull
  String clamped_max = "clamped-max";

  @Nonnull
  String explicit = "explicit";

  @Nonnull
  String max = "max";

  final class Util {
    private Util() {
    }

    @ChannelCountMode
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return ChannelCountMode.clamped_max.equals( value ) || ChannelCountMode.explicit.equals( value ) || ChannelCountMode.max.equals( value );
    }
  }
}
