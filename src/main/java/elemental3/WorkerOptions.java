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
public interface WorkerOptions {
  @JsOverlay
  @Nonnull
  static WorkerOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "credentials"
  )
  @MagicConstant(
      valuesFromClass = RequestCredentials.class
  )
  String credentials();

  @JsProperty
  void setCredentials(
      @MagicConstant(valuesFromClass = RequestCredentials.class) @Nonnull String credentials);

  @JsOverlay
  @Nonnull
  default WorkerOptions credentials(
      @MagicConstant(valuesFromClass = RequestCredentials.class) @Nonnull final String credentials) {
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
  @MagicConstant(
      valuesFromClass = WorkerType.class
  )
  String type();

  @JsProperty
  void setType(@MagicConstant(valuesFromClass = WorkerType.class) @Nonnull String type);

  @JsOverlay
  @Nonnull
  default WorkerOptions type(
      @MagicConstant(valuesFromClass = WorkerType.class) @Nonnull final String type) {
    setType( type );
    return this;
  }
}
