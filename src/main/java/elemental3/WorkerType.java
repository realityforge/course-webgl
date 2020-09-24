package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = WorkerType.class
)
public @interface WorkerType {
  @Nonnull
  String classic = "classic";

  @Nonnull
  String module = "module";
}
