package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
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
