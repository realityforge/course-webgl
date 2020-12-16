package elemental3.indexeddb;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = IDBTransactionMode.class
)
public @interface IDBTransactionMode {
  @Nonnull
  String readonly = "readonly";

  @Nonnull
  String readwrite = "readwrite";

  @Nonnull
  String versionchange = "versionchange";

  final class Validator {
    private Validator() {
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return IDBTransactionMode.readonly.equals( value ) || IDBTransactionMode.readwrite.equals( value ) || IDBTransactionMode.versionchange.equals( value );
    }
  }
}
