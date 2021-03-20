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
public interface MediaQueryListEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static MediaQueryListEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "matches"
  )
  boolean matches();

  @JsProperty
  void setMatches(boolean matches);

  @JsOverlay
  @Nonnull
  default MediaQueryListEventInit matches(final boolean matches) {
    setMatches( matches );
    return this;
  }

  @JsProperty(
      name = "media"
  )
  String media();

  @JsProperty
  void setMedia(@Nonnull String media);

  @JsOverlay
  @Nonnull
  default MediaQueryListEventInit media(@Nonnull final String media) {
    setMedia( media );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaQueryListEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaQueryListEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaQueryListEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
