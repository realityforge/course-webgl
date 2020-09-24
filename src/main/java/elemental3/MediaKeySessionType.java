package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = MediaKeySessionType.class
)
public @interface MediaKeySessionType {
  @Nonnull
  String persistent_license = "persistent-license";

  @Nonnull
  String temporary = "temporary";
}
