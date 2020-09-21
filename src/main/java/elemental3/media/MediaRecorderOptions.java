package elemental3.media;

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
public interface MediaRecorderOptions {
  @JsOverlay
  @Nonnull
  static MediaRecorderOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "audioBitrateMode"
  )
  @BitrateMode
  String audioBitrateMode();

  @JsProperty
  void setAudioBitrateMode(@BitrateMode @Nonnull String audioBitrateMode);

  @JsOverlay
  @Nonnull
  default MediaRecorderOptions audioBitrateMode(
      @BitrateMode @Nonnull final String audioBitrateMode) {
    setAudioBitrateMode( audioBitrateMode );
    return this;
  }

  @JsProperty(
      name = "audioBitsPerSecond"
  )
  int audioBitsPerSecond();

  @JsProperty
  void setAudioBitsPerSecond(int audioBitsPerSecond);

  @JsOverlay
  @Nonnull
  default MediaRecorderOptions audioBitsPerSecond(final int audioBitsPerSecond) {
    setAudioBitsPerSecond( audioBitsPerSecond );
    return this;
  }

  @JsProperty(
      name = "bitsPerSecond"
  )
  int bitsPerSecond();

  @JsProperty
  void setBitsPerSecond(int bitsPerSecond);

  @JsOverlay
  @Nonnull
  default MediaRecorderOptions bitsPerSecond(final int bitsPerSecond) {
    setBitsPerSecond( bitsPerSecond );
    return this;
  }

  @JsProperty(
      name = "mimeType"
  )
  String mimeType();

  @JsProperty
  void setMimeType(@Nonnull String mimeType);

  @JsOverlay
  @Nonnull
  default MediaRecorderOptions mimeType(@Nonnull final String mimeType) {
    setMimeType( mimeType );
    return this;
  }

  @JsProperty(
      name = "videoBitsPerSecond"
  )
  int videoBitsPerSecond();

  @JsProperty
  void setVideoBitsPerSecond(int videoBitsPerSecond);

  @JsOverlay
  @Nonnull
  default MediaRecorderOptions videoBitsPerSecond(final int videoBitsPerSecond) {
    setVideoBitsPerSecond( videoBitsPerSecond );
    return this;
  }
}
