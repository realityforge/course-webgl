package elemental3.media;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
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
}
