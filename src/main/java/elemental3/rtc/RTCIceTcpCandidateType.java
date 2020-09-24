package elemental3.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCIceTcpCandidateType.class
)
public @interface RTCIceTcpCandidateType {
  @Nonnull
  String active = "active";

  @Nonnull
  String passive = "passive";

  @Nonnull
  String so = "so";
}
