package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = RTCCodecType.class
)
public @interface RTCCodecType {
  @Nonnull
  String decode = "decode";

  @Nonnull
  String encode = "encode";
}
