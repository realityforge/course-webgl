package elemental3.wasm;

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
    name = "?"
)
public interface GlobalDescriptor {
  @JsOverlay
  @Nonnull
  static GlobalDescriptor create(@ValueType @Nonnull final String value) {
    return Js.<GlobalDescriptor>uncheckedCast( JsPropertyMap.of() ).value( value );
  }

  @JsProperty(
      name = "mutable"
  )
  boolean mutable();

  @JsProperty
  void setMutable(boolean mutable);

  @JsOverlay
  @Nonnull
  default GlobalDescriptor mutable(final boolean mutable) {
    setMutable( mutable );
    return this;
  }

  @JsProperty(
      name = "value"
  )
  @ValueType
  @Nonnull
  String value();

  @JsProperty
  void setValue(@ValueType @Nonnull String value);

  @JsOverlay
  @Nonnull
  default GlobalDescriptor value(@ValueType @Nonnull final String value) {
    setValue( value );
    return this;
  }
}
