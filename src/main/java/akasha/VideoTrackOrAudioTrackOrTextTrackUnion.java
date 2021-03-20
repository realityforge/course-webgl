package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface VideoTrackOrAudioTrackOrTextTrackUnion {
  @JsOverlay
  @Nonnull
  static VideoTrackOrAudioTrackOrTextTrackUnion of(@Nonnull final VideoTrack value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static VideoTrackOrAudioTrackOrTextTrackUnion of(@Nonnull final AudioTrack value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static VideoTrackOrAudioTrackOrTextTrackUnion of(@Nonnull final TextTrack value) {
    return Js.cast( value );
  }
}
