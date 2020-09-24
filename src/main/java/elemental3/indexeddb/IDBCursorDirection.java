package elemental3.indexeddb;

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
}
