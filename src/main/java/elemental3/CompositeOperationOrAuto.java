package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = CompositeOperationOrAuto.class
)
public @interface CompositeOperationOrAuto {
  @Nonnull
  String accumulate = "accumulate";

  @Nonnull
  String add = "add";

  @Nonnull
  String auto = "auto";

  @Nonnull
  String replace = "replace";
}
