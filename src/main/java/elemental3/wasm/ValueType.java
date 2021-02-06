package elemental3.wasm;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
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

  final class Validator {
    private Validator() {
    }

    @ValueType
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return ValueType.f32.equals( value ) || ValueType.f64.equals( value ) || ValueType.i32.equals( value ) || ValueType.i64.equals( value );
    }
  }
}
