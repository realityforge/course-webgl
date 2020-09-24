package elemental3.media;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = AppendMode.class
)
public @interface AppendMode {
  @Nonnull
  String segments = "segments";

  @Nonnull
  String sequence = "sequence";
}
