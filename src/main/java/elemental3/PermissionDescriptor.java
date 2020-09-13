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
public interface PermissionDescriptor {
  @JsOverlay
  @Nonnull
  static PermissionDescriptor create(
      @MagicConstant(valuesFromClass = PermissionName.class) @Nonnull final String name) {
    return Js.<PermissionDescriptor>uncheckedCast( JsPropertyMap.of() ).name( name );
  }

  @JsProperty(
      name = "name"
  )
  @MagicConstant(
      valuesFromClass = PermissionName.class
  )
  @Nonnull
  String name();

  @JsProperty
  void setName(@MagicConstant(valuesFromClass = PermissionName.class) @Nonnull String name);

  @JsOverlay
  @Nonnull
  default PermissionDescriptor name(
      @MagicConstant(valuesFromClass = PermissionName.class) @Nonnull final String name) {
    setName( name );
    return this;
  }
}
