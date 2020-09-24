package elemental3.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCBundlePolicy.class
)
public @interface RTCBundlePolicy {
  @Nonnull
  String balanced = "balanced";

  @Nonnull
  String max_bundle = "max-bundle";

  @Nonnull
  String max_compat = "max-compat";
}
