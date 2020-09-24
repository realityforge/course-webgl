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
}
