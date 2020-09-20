package elemental3.wasm;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@MagicConstant(
    valuesFromClass = ImportExportKind.class
)
public @interface ImportExportKind {
  @Nonnull
  String function = "function";

  @Nonnull
  String global = "global";

  @Nonnull
  String memory = "memory";

  @Nonnull
  String table = "table";
}
