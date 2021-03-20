package akasha;

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
public interface DevicePermissionDescriptor extends PermissionDescriptor {
  @JsOverlay
  @Nonnull
  static DevicePermissionDescriptor create(@PermissionName @Nonnull final String name) {
    return Js.<DevicePermissionDescriptor>uncheckedCast( JsPropertyMap.of() ).name( name );
  }

  @JsProperty(
      name = "deviceId"
  )
  String deviceId();

  @JsProperty
  void setDeviceId(@Nonnull String deviceId);

  @JsOverlay
  @Nonnull
  default DevicePermissionDescriptor deviceId(@Nonnull final String deviceId) {
    setDeviceId( deviceId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DevicePermissionDescriptor name(@PermissionName @Nonnull final String name) {
    setName( name );
    return this;
  }
}
