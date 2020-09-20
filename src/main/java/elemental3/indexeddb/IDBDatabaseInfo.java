package elemental3.indexeddb;

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
public interface IDBDatabaseInfo {
  @JsOverlay
  @Nonnull
  static IDBDatabaseInfo create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "name"
  )
  String name();

  @JsProperty
  void setName(@Nonnull String name);

  @JsOverlay
  @Nonnull
  default IDBDatabaseInfo name(@Nonnull final String name) {
    setName( name );
    return this;
  }

  @JsProperty(
      name = "version"
  )
  int version();

  @JsProperty
  void setVersion(int version);

  @JsOverlay
  @Nonnull
  default IDBDatabaseInfo version(final int version) {
    setVersion( version );
    return this;
  }
}
