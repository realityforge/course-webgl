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
public interface UIEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static UIEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "detail"
  )
  int detail();

  @JsProperty
  void setDetail(int detail);

  @JsOverlay
  @Nonnull
  default UIEventInit detail(final int detail) {
    setDetail( detail );
    return this;
  }

  @JsProperty(
      name = "view"
  )
  @Nullable
  Window view();

  @JsProperty
  void setView(@Nullable Window view);

  @JsOverlay
  @Nonnull
  default UIEventInit view(@Nullable final Window view) {
    setView( view );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default UIEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default UIEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default UIEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
