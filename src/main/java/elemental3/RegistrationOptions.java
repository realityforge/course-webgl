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
public interface RegistrationOptions {
  @JsOverlay
  @Nonnull
  static RegistrationOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "scope"
  )
  String scope();

  @JsProperty
  void setScope(@Nonnull String scope);

  @JsOverlay
  @Nonnull
  default RegistrationOptions scope(@Nonnull final String scope) {
    setScope( scope );
    return this;
  }

  @JsProperty(
      name = "type"
  )
  @MagicConstant(
      valuesFromClass = WorkerType.class
  )
  String type();

  @JsProperty
  void setType(@MagicConstant(valuesFromClass = WorkerType.class) @Nonnull String type);

  @JsOverlay
  @Nonnull
  default RegistrationOptions type(
      @MagicConstant(valuesFromClass = WorkerType.class) @Nonnull final String type) {
    setType( type );
    return this;
  }

  @JsProperty(
      name = "updateViaCache"
  )
  @MagicConstant(
      valuesFromClass = ServiceWorkerUpdateViaCache.class
  )
  String updateViaCache();

  @JsProperty
  void setUpdateViaCache(
      @MagicConstant(valuesFromClass = ServiceWorkerUpdateViaCache.class) @Nonnull String updateViaCache);

  @JsOverlay
  @Nonnull
  default RegistrationOptions updateViaCache(
      @MagicConstant(valuesFromClass = ServiceWorkerUpdateViaCache.class) @Nonnull final String updateViaCache) {
    setUpdateViaCache( updateViaCache );
    return this;
  }
}
