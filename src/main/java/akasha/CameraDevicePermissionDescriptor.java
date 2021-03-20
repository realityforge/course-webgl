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
public interface CameraDevicePermissionDescriptor extends DevicePermissionDescriptor {
  @JsOverlay
  @Nonnull
  static CameraDevicePermissionDescriptor create(@PermissionName @Nonnull final String name) {
    return Js.<CameraDevicePermissionDescriptor>uncheckedCast( JsPropertyMap.of() ).name( name );
  }

  @JsProperty(
      name = "panTiltZoom"
  )
  boolean panTiltZoom();

  @JsProperty
  void setPanTiltZoom(boolean panTiltZoom);

  @JsOverlay
  @Nonnull
  default CameraDevicePermissionDescriptor panTiltZoom(final boolean panTiltZoom) {
    setPanTiltZoom( panTiltZoom );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default CameraDevicePermissionDescriptor deviceId(@Nonnull final String deviceId) {
    setDeviceId( deviceId );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default CameraDevicePermissionDescriptor name(@PermissionName @Nonnull final String name) {
    setName( name );
    return this;
  }
}
