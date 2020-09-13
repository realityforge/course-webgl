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
public interface TrackEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static TrackEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "track"
  )
  @Nullable
  VideoTrackOrAudioTrackOrTextTrackUnion track();

  @JsProperty
  void setTrack(@Nullable VideoTrackOrAudioTrackOrTextTrackUnion track);

  @JsOverlay
  default void setTrack(@Nonnull final VideoTrack track) {
    setTrack( VideoTrackOrAudioTrackOrTextTrackUnion.of( track ) );
  }

  @JsOverlay
  @Nonnull
  default TrackEventInit track(@Nonnull final VideoTrack track) {
    setTrack( track );
    return this;
  }

  @JsOverlay
  default void setTrack(@Nonnull final AudioTrack track) {
    setTrack( VideoTrackOrAudioTrackOrTextTrackUnion.of( track ) );
  }

  @JsOverlay
  @Nonnull
  default TrackEventInit track(@Nonnull final AudioTrack track) {
    setTrack( track );
    return this;
  }

  @JsOverlay
  default void setTrack(@Nonnull final TextTrack track) {
    setTrack( VideoTrackOrAudioTrackOrTextTrackUnion.of( track ) );
  }

  @JsOverlay
  @Nonnull
  default TrackEventInit track(@Nonnull final TextTrack track) {
    setTrack( track );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default TrackEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default TrackEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default TrackEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
