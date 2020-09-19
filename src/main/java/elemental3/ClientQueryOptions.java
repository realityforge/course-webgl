package elemental3;

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
public interface ClientQueryOptions {
  @JsOverlay
  @Nonnull
  static ClientQueryOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "includeUncontrolled"
  )
  boolean includeUncontrolled();

  @JsProperty
  void setIncludeUncontrolled(boolean includeUncontrolled);

  @JsOverlay
  @Nonnull
  default ClientQueryOptions includeUncontrolled(final boolean includeUncontrolled) {
    setIncludeUncontrolled( includeUncontrolled );
    return this;
  }

  @JsProperty(
      name = "type"
  )
  @ClientType
  String type();

  @JsProperty
  void setType(@ClientType @Nonnull String type);

  @JsOverlay
  @Nonnull
  default ClientQueryOptions type(@ClientType @Nonnull final String type) {
    setType( type );
    return this;
  }
}
