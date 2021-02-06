package elemental3.media;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = DisplayCaptureSurfaceType.class
)
public @interface DisplayCaptureSurfaceType {
  @Nonnull
  String application = "application";

  @Nonnull
  String browser = "browser";

  @Nonnull
  String monitor = "monitor";

  @Nonnull
  String window = "window";

  final class Validator {
    private Validator() {
    }

    @DisplayCaptureSurfaceType
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return DisplayCaptureSurfaceType.application.equals( value ) || DisplayCaptureSurfaceType.browser.equals( value ) || DisplayCaptureSurfaceType.monitor.equals( value ) || DisplayCaptureSurfaceType.window.equals( value );
    }
  }
}
