package akasha.idb;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = IDBCursorDirection.class
)
public @interface IDBCursorDirection {
  @Nonnull
  String next = "next";

  @Nonnull
  String nextunique = "nextunique";

  @Nonnull
  String prev = "prev";

  @Nonnull
  String prevunique = "prevunique";

  final class Util {
    private Util() {
    }

    @IDBCursorDirection
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return IDBCursorDirection.next.equals( value ) || IDBCursorDirection.nextunique.equals( value ) || IDBCursorDirection.prev.equals( value ) || IDBCursorDirection.prevunique.equals( value );
    }
  }
}
