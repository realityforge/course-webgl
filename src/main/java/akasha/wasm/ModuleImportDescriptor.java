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
public interface ModuleImportDescriptor {
  @JsOverlay
  @Nonnull
  static ModuleImportDescriptor create(@ImportExportKind @Nonnull final String kind,
      @Nonnull final String module, @Nonnull final String name) {
    return Js.<ModuleImportDescriptor>uncheckedCast( JsPropertyMap.of() ).kind( kind ).module( module ).name( name );
  }

  @JsProperty(
      name = "kind"
  )
  @ImportExportKind
  @Nonnull
  String kind();

  @JsProperty
  void setKind(@ImportExportKind @Nonnull String kind);

  @JsOverlay
  @Nonnull
  default ModuleImportDescriptor kind(@ImportExportKind @Nonnull final String kind) {
    setKind( kind );
    return this;
  }

  @JsProperty(
      name = "module"
  )
  @Nonnull
  String module();

  @JsProperty
  void setModule(@Nonnull String module);

  @JsOverlay
  @Nonnull
  default ModuleImportDescriptor module(@Nonnull final String module) {
    setModule( module );
    return this;
  }

  @JsProperty(
      name = "name"
  )
  @Nonnull
  String name();

  @JsProperty
  void setName(@Nonnull String name);

  @JsOverlay
  @Nonnull
  default ModuleImportDescriptor name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
