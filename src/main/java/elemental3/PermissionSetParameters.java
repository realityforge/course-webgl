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
public interface PermissionSetParameters {
  @JsOverlay
  @Nonnull
  static PermissionSetParameters create(@Nonnull final PermissionDescriptor descriptor,
      @PermissionState @Nonnull final String state) {
    return Js.<PermissionSetParameters>uncheckedCast( JsPropertyMap.of() ).descriptor( descriptor ).state( state );
  }

  @JsProperty(
      name = "descriptor"
  )
  @Nonnull
  PermissionDescriptor descriptor();

  @JsProperty
  void setDescriptor(@Nonnull PermissionDescriptor descriptor);

  @JsOverlay
  @Nonnull
  default PermissionSetParameters descriptor(@Nonnull final PermissionDescriptor descriptor) {
    setDescriptor( descriptor );
    return this;
  }

  @JsProperty(
      name = "oneRealm"
  )
  boolean oneRealm();

  @JsProperty
  void setOneRealm(boolean oneRealm);

  @JsOverlay
  @Nonnull
  default PermissionSetParameters oneRealm(final boolean oneRealm) {
    setOneRealm( oneRealm );
    return this;
  }

  @JsProperty(
      name = "state"
  )
  @PermissionState
  @Nonnull
  String state();

  @JsProperty
  void setState(@PermissionState @Nonnull String state);

  @JsOverlay
  @Nonnull
  default PermissionSetParameters state(@PermissionState @Nonnull final String state) {
    setState( state );
    return this;
  }
}
