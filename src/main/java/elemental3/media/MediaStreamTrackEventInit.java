package elemental3.media;

import elemental3.EventInit;
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
public interface MediaStreamTrackEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static MediaStreamTrackEventInit create(@Nonnull final MediaStreamTrack track) {
    return Js.<MediaStreamTrackEventInit>uncheckedCast( JsPropertyMap.of() ).track( track );
  }

  @JsProperty(
      name = "track"
  )
  @Nonnull
  MediaStreamTrack track();

  @JsProperty
  void setTrack(@Nonnull MediaStreamTrack track);

  @JsOverlay
  @Nonnull
  default MediaStreamTrackEventInit track(@Nonnull final MediaStreamTrack track) {
    setTrack( track );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaStreamTrackEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaStreamTrackEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MediaStreamTrackEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
