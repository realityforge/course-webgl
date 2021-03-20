package akasha.audio;

import akasha.HTMLMediaElement;
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
public interface MediaElementAudioSourceOptions {
  @JsOverlay
  @Nonnull
  static MediaElementAudioSourceOptions create(@Nonnull final HTMLMediaElement mediaElement) {
    return Js.<MediaElementAudioSourceOptions>uncheckedCast( JsPropertyMap.of() ).mediaElement( mediaElement );
  }

  @JsProperty(
      name = "mediaElement"
  )
  @Nonnull
  HTMLMediaElement mediaElement();

  @JsProperty
  void setMediaElement(@Nonnull HTMLMediaElement mediaElement);

  @JsOverlay
  @Nonnull
  default MediaElementAudioSourceOptions mediaElement(
      @Nonnull final HTMLMediaElement mediaElement) {
    setMediaElement( mediaElement );
    return this;
  }
}
