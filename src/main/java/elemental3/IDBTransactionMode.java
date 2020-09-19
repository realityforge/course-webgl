package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
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
}
