package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = ValueType.class
)
public @interface ValueType {
  @Nonnull
  String f32 = "f32";

  @Nonnull
  String f64 = "f64";

  @Nonnull
  String i32 = "i32";

  @Nonnull
  String i64 = "i64";
}
