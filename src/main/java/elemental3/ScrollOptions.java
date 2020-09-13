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
public interface ScrollOptions {
  @JsOverlay
  @Nonnull
  static ScrollOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "behavior"
  )
  @MagicConstant(
      valuesFromClass = ScrollBehavior.class
  )
  String behavior();

  @JsProperty
  void setBehavior(@MagicConstant(valuesFromClass = ScrollBehavior.class) @Nonnull String behavior);

  @JsOverlay
  @Nonnull
  default ScrollOptions behavior(
      @MagicConstant(valuesFromClass = ScrollBehavior.class) @Nonnull final String behavior) {
    setBehavior( behavior );
    return this;
  }
}
