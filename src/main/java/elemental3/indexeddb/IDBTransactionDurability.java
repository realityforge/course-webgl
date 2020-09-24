package elemental3.indexeddb;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = IDBTransactionDurability.class
)
public @interface IDBTransactionDurability {
  @Nonnull
  String default_ = "default";

  @Nonnull
  String relaxed = "relaxed";

  @Nonnull
  String strict = "strict";
}
