package elemental3.media;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The MediaStreamConstraints dictionary is used when calling getUserMedia() to specify what kinds of tracks should be included in the returned MediaStream, and, optionally, to establish constraints for those tracks' settings.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaStreamConstraints">MediaStreamConstraints - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface MediaStreamConstraints {
  @JsOverlay
  @Nonnull
  static MediaStreamConstraints create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "audio"
  )
  BooleanOrMediaTrackConstraintsUnion audio();

  @JsProperty
  void setAudio(@Nonnull BooleanOrMediaTrackConstraintsUnion audio);

  @JsOverlay
  default void setAudio(final boolean audio) {
    setAudio( BooleanOrMediaTrackConstraintsUnion.of( audio ) );
  }

  @JsOverlay
  @Nonnull
  default MediaStreamConstraints audio(final boolean audio) {
    setAudio( audio );
    return this;
  }

  @JsOverlay
  default void setAudio(@Nonnull final MediaTrackConstraints audio) {
    setAudio( BooleanOrMediaTrackConstraintsUnion.of( audio ) );
  }

  @JsOverlay
  @Nonnull
  default MediaStreamConstraints audio(@Nonnull final MediaTrackConstraints audio) {
    setAudio( audio );
    return this;
  }

  @JsProperty(
      name = "video"
  )
  BooleanOrMediaTrackConstraintsUnion video();

  @JsProperty
  void setVideo(@Nonnull BooleanOrMediaTrackConstraintsUnion video);

  @JsOverlay
  default void setVideo(final boolean video) {
    setVideo( BooleanOrMediaTrackConstraintsUnion.of( video ) );
  }

  @JsOverlay
  @Nonnull
  default MediaStreamConstraints video(final boolean video) {
    setVideo( video );
    return this;
  }

  @JsOverlay
  default void setVideo(@Nonnull final MediaTrackConstraints video) {
    setVideo( BooleanOrMediaTrackConstraintsUnion.of( video ) );
  }

  @JsOverlay
  @Nonnull
  default MediaStreamConstraints video(@Nonnull final MediaTrackConstraints video) {
    setVideo( video );
    return this;
  }

  @JsProperty(
      name = "peerIdentity"
  )
  String peerIdentity();

  @JsProperty
  void setPeerIdentity(@Nonnull String peerIdentity);

  @JsOverlay
  @Nonnull
  default MediaStreamConstraints peerIdentity(@Nonnull final String peerIdentity) {
    setPeerIdentity( peerIdentity );
    return this;
  }
}
