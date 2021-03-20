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
public interface FocusEventInit extends UIEventInit {
  @JsOverlay
  @Nonnull
  static FocusEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "relatedTarget"
  )
  @Nullable
  EventTarget relatedTarget();

  @JsProperty
  void setRelatedTarget(@Nullable EventTarget relatedTarget);

  @JsOverlay
  @Nonnull
  default FocusEventInit relatedTarget(@Nullable final EventTarget relatedTarget) {
    setRelatedTarget( relatedTarget );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default FocusEventInit detail(final int detail) {
    setDetail( detail );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default FocusEventInit view(@Nullable final Window view) {
    setView( view );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default FocusEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default FocusEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default FocusEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
