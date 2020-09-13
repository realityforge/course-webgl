package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The AnimationPlaybackEvent interface of the Web Animations API represents animation events.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnimationPlaybackEvent">AnimationPlaybackEvent - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AnimationPlaybackEvent"
)
public class AnimationPlaybackEvent extends Event {
  public AnimationPlaybackEvent(@Nonnull final String type,
      @Nonnull final AnimationPlaybackEventInit eventInitDict) {
    super( null );
  }

  public AnimationPlaybackEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "currentTime"
  )
  @Nullable
  public native Double currentTime();

  @JsProperty(
      name = "timelineTime"
  )
  @Nullable
  public native Double timelineTime();
}
