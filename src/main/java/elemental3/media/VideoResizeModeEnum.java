package elemental3.media;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = VideoResizeModeEnum.class
)
public @interface VideoResizeModeEnum {
  @Nonnull
  String crop_and_scale = "crop-and-scale";

  @Nonnull
  String none = "none";
}
