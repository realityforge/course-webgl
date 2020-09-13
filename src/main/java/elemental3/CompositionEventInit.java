package elemental3;

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
    name = "?"
)
public interface CompositionEventInit extends UIEventInit {
  @JsOverlay
  @Nonnull
  static CompositionEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "data"
  )
  String data();

  @JsProperty
  void setData(@Nonnull String data);

  @JsOverlay
  @Nonnull
  default CompositionEventInit data(@Nonnull final String data) {
    setData( data );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default CompositionEventInit detail(final int detail) {
    setDetail( detail );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default CompositionEventInit view(@Nullable final Window view) {
    setView( view );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default CompositionEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default CompositionEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default CompositionEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
