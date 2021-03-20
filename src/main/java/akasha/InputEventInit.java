package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
public interface InputEventInit extends UIEventInit {
  @JsOverlay
  @Nonnull
  static InputEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "data"
  )
  @Nullable
  String data();

  @JsProperty
  void setData(@Nullable String data);

  @JsOverlay
  @Nonnull
  default InputEventInit data(@Nullable final String data) {
    setData( data );
    return this;
  }

  @JsProperty(
      name = "inputType"
  )
  String inputType();

  @JsProperty
  void setInputType(@Nonnull String inputType);

  @JsOverlay
  @Nonnull
  default InputEventInit inputType(@Nonnull final String inputType) {
    setInputType( inputType );
    return this;
  }

  @JsProperty(
      name = "isComposing"
  )
  boolean isComposing();

  @JsProperty
  void setIsComposing(boolean isComposing);

  @JsOverlay
  @Nonnull
  default InputEventInit isComposing(final boolean isComposing) {
    setIsComposing( isComposing );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default InputEventInit detail(final int detail) {
    setDetail( detail );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default InputEventInit view(@Nullable final Window view) {
    setView( view );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default InputEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default InputEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default InputEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
