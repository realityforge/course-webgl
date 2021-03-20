package akasha.clipboard;

import akasha.PermissionDescriptor;
import akasha.PermissionName;
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
public interface ClipboardPermissionDescriptor extends PermissionDescriptor {
  @JsOverlay
  @Nonnull
  static ClipboardPermissionDescriptor create(@PermissionName @Nonnull final String name) {
    return Js.<ClipboardPermissionDescriptor>uncheckedCast( JsPropertyMap.of() ).name( name );
  }

  @JsProperty(
      name = "allowWithoutGesture"
  )
  boolean allowWithoutGesture();

  @JsProperty
  void setAllowWithoutGesture(boolean allowWithoutGesture);

  @JsOverlay
  @Nonnull
  default ClipboardPermissionDescriptor allowWithoutGesture(final boolean allowWithoutGesture) {
    setAllowWithoutGesture( allowWithoutGesture );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ClipboardPermissionDescriptor name(@PermissionName @Nonnull final String name) {
    setName( name );
    return this;
  }
}
