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
public interface WorkerOptions {
  @JsOverlay
  @Nonnull
  static WorkerOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "credentials"
  )
  @RequestCredentials
  String credentials();

  @JsProperty
  void setCredentials(@RequestCredentials @Nonnull String credentials);

  @JsOverlay
  @Nonnull
  default WorkerOptions credentials(@RequestCredentials @Nonnull final String credentials) {
    setCredentials( credentials );
    return this;
  }

  @JsProperty(
      name = "name"
  )
  String name();

  @JsProperty
  void setName(@Nonnull String name);

  @JsOverlay
  @Nonnull
  default WorkerOptions name(@Nonnull final String name) {
    setName( name );
    return this;
  }

  @JsProperty(
      name = "type"
  )
  @WorkerType
  String type();

  @JsProperty
  void setType(@WorkerType @Nonnull String type);

  @JsOverlay
  @Nonnull
  default WorkerOptions type(@WorkerType @Nonnull final String type) {
    setType( type );
    return this;
  }
}
