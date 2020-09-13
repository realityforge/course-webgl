package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface IDBTransactionOptions {
  @JsOverlay
  @Nonnull
  static IDBTransactionOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "durability"
  )
  @MagicConstant(
      valuesFromClass = IDBTransactionDurability.class
  )
  String durability();

  @JsProperty
  void setDurability(
      @MagicConstant(valuesFromClass = IDBTransactionDurability.class) @Nonnull String durability);

  @JsOverlay
  @Nonnull
  default IDBTransactionOptions durability(
      @MagicConstant(valuesFromClass = IDBTransactionDurability.class) @Nonnull final String durability) {
    setDurability( durability );
    return this;
  }
}
