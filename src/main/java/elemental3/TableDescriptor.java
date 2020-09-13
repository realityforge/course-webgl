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
public interface TableDescriptor {
  @JsOverlay
  @Nonnull
  static TableDescriptor create(
      @MagicConstant(valuesFromClass = TableKind.class) @Nonnull final String element,
      final int initial) {
    return Js.<TableDescriptor>uncheckedCast( JsPropertyMap.of() ).element( element ).initial( initial );
  }

  @JsProperty(
      name = "element"
  )
  @MagicConstant(
      valuesFromClass = TableKind.class
  )
  @Nonnull
  String element();

  @JsProperty
  void setElement(@MagicConstant(valuesFromClass = TableKind.class) @Nonnull String element);

  @JsOverlay
  @Nonnull
  default TableDescriptor element(
      @MagicConstant(valuesFromClass = TableKind.class) @Nonnull final String element) {
    setElement( element );
    return this;
  }

  @JsProperty(
      name = "initial"
  )
  int initial();

  @JsProperty
  void setInitial(int initial);

  @JsOverlay
  @Nonnull
  default TableDescriptor initial(final int initial) {
    setInitial( initial );
    return this;
  }

  @JsProperty(
      name = "maximum"
  )
  int maximum();

  @JsProperty
  void setMaximum(int maximum);

  @JsOverlay
  @Nonnull
  default TableDescriptor maximum(final int maximum) {
    setMaximum( maximum );
    return this;
  }
}
