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
public interface TokenBinding {
  @JsOverlay
  @Nonnull
  static TokenBinding create(
      @MagicConstant(valuesFromClass = TokenBindingStatus.class) @Nonnull final String status) {
    return Js.<TokenBinding>uncheckedCast( JsPropertyMap.of() ).status( status );
  }

  @JsProperty(
      name = "id"
  )
  String id();

  @JsProperty
  void setId(@Nonnull String id);

  @JsOverlay
  @Nonnull
  default TokenBinding id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  @JsProperty(
      name = "status"
  )
  @MagicConstant(
      valuesFromClass = TokenBindingStatus.class
  )
  @Nonnull
  String status();

  @JsProperty
  void setStatus(@MagicConstant(valuesFromClass = TokenBindingStatus.class) @Nonnull String status);

  @JsOverlay
  @Nonnull
  default TokenBinding status(
      @MagicConstant(valuesFromClass = TokenBindingStatus.class) @Nonnull final String status) {
    setStatus( status );
    return this;
  }
}
