package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = DocumentReadyState.class
)
public @interface DocumentReadyState {
  @Nonnull
  String complete = "complete";

  @Nonnull
  String interactive = "interactive";

  @Nonnull
  String loading = "loading";
}
