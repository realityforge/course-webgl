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
public interface MidiPermissionDescriptor extends PermissionDescriptor {
  @JsOverlay
  @Nonnull
  static MidiPermissionDescriptor create(@PermissionName @Nonnull final String name) {
    return Js.<MidiPermissionDescriptor>uncheckedCast( JsPropertyMap.of() ).name( name );
  }

  @JsProperty(
      name = "sysex"
  )
  boolean sysex();

  @JsProperty
  void setSysex(boolean sysex);

  @JsOverlay
  @Nonnull
  default MidiPermissionDescriptor sysex(final boolean sysex) {
    setSysex( sysex );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MidiPermissionDescriptor name(@PermissionName @Nonnull final String name) {
    setName( name );
    return this;
  }
}
