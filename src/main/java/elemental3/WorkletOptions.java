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
public interface WorkletOptions {
  @JsOverlay
  @Nonnull
  static WorkletOptions create() {
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
  default WorkletOptions credentials(
      @MagicConstant(valuesFromClass = RequestCredentials.class) @Nonnull final String credentials) {
    setCredentials( credentials );
    return this;
  }
}
