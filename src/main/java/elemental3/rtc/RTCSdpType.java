package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = RTCSdpType.class
)
public @interface RTCSdpType {
  @Nonnull
  String answer = "answer";

  @Nonnull
  String offer = "offer";

  @Nonnull
  String pranswer = "pranswer";

  @Nonnull
  String rollback = "rollback";
}