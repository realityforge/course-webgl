package elemental3;

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
    name = "?"
)
public interface HashChangeEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static HashChangeEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "newURL"
  )
  String newURL();

  @JsProperty
  void setNewURL(@Nonnull String newURL);

  @JsOverlay
  @Nonnull
  default HashChangeEventInit newURL(@Nonnull final String newURL) {
    setNewURL( newURL );
    return this;
  }

  @JsProperty(
      name = "oldURL"
  )
  String oldURL();

  @JsProperty
  void setOldURL(@Nonnull String oldURL);

  @JsOverlay
  @Nonnull
  default HashChangeEventInit oldURL(@Nonnull final String oldURL) {
    setOldURL( oldURL );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default HashChangeEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default HashChangeEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default HashChangeEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
