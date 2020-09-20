package elemental3.indexeddb;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
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
