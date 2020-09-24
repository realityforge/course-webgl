package elemental3.media;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = EndOfStreamError.class
)
public @interface EndOfStreamError {
  @Nonnull
  String decode = "decode";

  @Nonnull
  String network = "network";
}
