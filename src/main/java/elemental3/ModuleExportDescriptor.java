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
public interface ModuleExportDescriptor {
  @JsOverlay
  @Nonnull
  static ModuleExportDescriptor create(
      @MagicConstant(valuesFromClass = ImportExportKind.class) @Nonnull final String kind,
      @Nonnull final String name) {
    return Js.<ModuleExportDescriptor>uncheckedCast( JsPropertyMap.of() ).kind( kind ).name( name );
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
  default ModuleExportDescriptor kind(
      @MagicConstant(valuesFromClass = ImportExportKind.class) @Nonnull final String kind) {
    setKind( kind );
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
  default ModuleExportDescriptor name(@Nonnull final String name) {
    setName( name );
    return this;
  }
}
