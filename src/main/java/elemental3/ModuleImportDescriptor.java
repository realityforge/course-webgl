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
public interface ModuleImportDescriptor {
  @JsOverlay
  @Nonnull
  static ModuleImportDescriptor create(
      @MagicConstant(valuesFromClass = ImportExportKind.class) @Nonnull final String kind,
      @Nonnull final String module, @Nonnull final String name) {
    return Js.<ModuleImportDescriptor>uncheckedCast( JsPropertyMap.of() ).kind( kind ).module( module ).name( name );
  }

  @JsProperty(
      name = "kind"
  )
  @MagicConstant(
      valuesFromClass = ImportExportKind.class
  )
  @Nonnull
  String kind();

  @JsProperty
  void setKind(@MagicConstant(valuesFromClass = ImportExportKind.class) @Nonnull String kind);

  @JsOverlay
  @Nonnull
  default ModuleImportDescriptor kind(
      @MagicConstant(valuesFromClass = ImportExportKind.class) @Nonnull final String kind) {
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
