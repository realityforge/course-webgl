package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = CanvasTextAlign.class
)
public @interface CanvasTextAlign {
  @Nonnull
  String center = "center";

  @Nonnull
  String end = "end";

  @Nonnull
  String left = "left";

  @Nonnull
  String right = "right";

  @Nonnull
  String start = "start";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return CanvasTextAlign.center.equals( value ) || CanvasTextAlign.end.equals( value ) || CanvasTextAlign.left.equals( value ) || CanvasTextAlign.right.equals( value ) || CanvasTextAlign.start.equals( value );
    }
  }
}
