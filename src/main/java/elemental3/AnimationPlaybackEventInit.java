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
public interface AnimationPlaybackEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static AnimationPlaybackEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "currentTime"
  )
  @Nullable
  Double currentTime();

  @JsProperty
  void setCurrentTime(@Nullable Double currentTime);

  @JsOverlay
  @Nonnull
  default AnimationPlaybackEventInit currentTime(@Nullable final Double currentTime) {
    setCurrentTime( currentTime );
    return this;
  }

  @JsProperty(
      name = "timelineTime"
  )
  @Nullable
  Double timelineTime();

  @JsProperty
  void setTimelineTime(@Nullable Double timelineTime);

  @JsOverlay
  @Nonnull
  default AnimationPlaybackEventInit timelineTime(@Nullable final Double timelineTime) {
    setTimelineTime( timelineTime );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default AnimationPlaybackEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default AnimationPlaybackEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default AnimationPlaybackEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
