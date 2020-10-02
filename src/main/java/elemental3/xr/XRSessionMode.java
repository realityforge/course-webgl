package elemental3.xr;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = XRSessionMode.class
)
public @interface XRSessionMode {
  @Nonnull
  String immersive_ar = "immersive-ar";

  @Nonnull
  String immersive_vr = "immersive-vr";

  @Nonnull
  String inline = "inline";
}
