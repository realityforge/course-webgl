package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = MediaKeySessionType.class
)
public @interface MediaKeySessionType {
  @Nonnull
  String persistent_license = "persistent-license";

  @Nonnull
  String temporary = "temporary";

  final class Util {
    private Util() {
    }

    @MediaKeySessionType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return MediaKeySessionType.persistent_license.equals( value ) || MediaKeySessionType.temporary.equals( value );
    }
  }
}
