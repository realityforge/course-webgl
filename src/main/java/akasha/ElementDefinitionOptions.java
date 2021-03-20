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
public interface ElementDefinitionOptions {
  @JsOverlay
  @Nonnull
  static ElementDefinitionOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "extends"
  )
  String extends_();

  @JsProperty
  void setExtends(@Nonnull String extends_);

  @JsOverlay
  @Nonnull
  default ElementDefinitionOptions extends_(@Nonnull final String extends_) {
    setExtends( extends_ );
    return this;
  }
}
