package elemental3.wasm;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
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

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return ImportExportKind.function.equals( value ) || ImportExportKind.global.equals( value ) || ImportExportKind.memory.equals( value ) || ImportExportKind.table.equals( value );
    }
  }
}
