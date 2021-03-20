package akasha.wasm;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface TableDescriptor {
  @JsOverlay
  @Nonnull
  static TableDescriptor create(@TableKind @Nonnull final String element, final int initial) {
    return Js.<TableDescriptor>uncheckedCast( JsPropertyMap.of() ).element( element ).initial( initial );
  }

  @JsProperty(
      name = "element"
  )
  @TableKind
  @Nonnull
  String element();

  @JsProperty
  void setElement(@TableKind @Nonnull String element);

  @JsOverlay
  @Nonnull
  default TableDescriptor element(@TableKind @Nonnull final String element) {
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
