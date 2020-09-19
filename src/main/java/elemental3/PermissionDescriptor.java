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
public interface PermissionDescriptor {
  @JsOverlay
  @Nonnull
  static PermissionDescriptor create(@PermissionName @Nonnull final String name) {
    return Js.<PermissionDescriptor>uncheckedCast( JsPropertyMap.of() ).name( name );
  }

  @JsProperty(
      name = "name"
  )
  @PermissionName
  @Nonnull
  String name();

  @JsProperty
  void setName(@PermissionName @Nonnull String name);

  @JsOverlay
  @Nonnull
  default PermissionDescriptor name(@PermissionName @Nonnull final String name) {
    setName( name );
    return this;
  }
}
