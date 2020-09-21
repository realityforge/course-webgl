package elemental3.media;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = MediaDeviceKind.class
)
public @interface MediaDeviceKind {
  @Nonnull
  String audioinput = "audioinput";

  @Nonnull
  String audiooutput = "audiooutput";

  @Nonnull
  String videoinput = "videoinput";
}
