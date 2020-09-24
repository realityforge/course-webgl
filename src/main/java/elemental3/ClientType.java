package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = ClientType.class
)
public @interface ClientType {
  @Nonnull
  String all = "all";

  @Nonnull
  String sharedworker = "sharedworker";

  @Nonnull
  String window = "window";

  @Nonnull
  String worker = "worker";
}
