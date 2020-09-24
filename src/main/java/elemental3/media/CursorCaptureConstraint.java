package elemental3.media;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = CursorCaptureConstraint.class
)
public @interface CursorCaptureConstraint {
  @Nonnull
  String always = "always";

  @Nonnull
  String motion = "motion";

  @Nonnull
  String never = "never";
}
