package akasha;

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
 * @see <a href="https://drafts.csswg.org/web-animations-1/#the-animationplaybackevent-interface">AnimationPlaybackEvent - Web Animations</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AnimationPlaybackEvent"
)
public class AnimationPlaybackEvent extends Event {
  /**
   * The AnimationPlaybackEvent() constructor of the Web Animations API returns a new AnimationPlaybackEvent object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnimationPlaybackEvent/AnimationPlaybackEvent">AnimationPlaybackEvent.AnimationPlaybackEvent - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animationplaybackevent-animationplaybackevent">AnimationPlaybackEvent() - Web Animations</a>
   */
  public AnimationPlaybackEvent(@Nonnull final String type,
      @Nonnull final AnimationPlaybackEventInit eventInitDict) {
    super( null );
  }

  /**
   * The AnimationPlaybackEvent() constructor of the Web Animations API returns a new AnimationPlaybackEvent object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnimationPlaybackEvent/AnimationPlaybackEvent">AnimationPlaybackEvent.AnimationPlaybackEvent - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animationplaybackevent-animationplaybackevent">AnimationPlaybackEvent() - Web Animations</a>
   */
  public AnimationPlaybackEvent(@Nonnull final String type) {
    super( null );
  }

  /**
   * The currentTime read-only property of the AnimationPlaybackEvent interface represents the current time of the animation that generated the event at the moment the event is queued. This will be unresolved if the animation was idle at the time the event was generated.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnimationPlaybackEvent/currentTime">AnimationPlaybackEvent.currentTime - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animationplaybackevent-currenttime">AnimationPlaybackEvent.currentTime - Web Animations</a>
   */
  @JsProperty(
      name = "currentTime"
  )
  @Nullable
  public native Double currentTime();

  /**
   * The timelineTime read-only property of the AnimationPlaybackEvent interface represents the time value of the animation's timeline at the moment the event is queued. This will be unresolved if the animation was not associated with a timeline at the time the event was generated or if the associated timeline was inactive.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnimationPlaybackEvent/timelineTime">AnimationPlaybackEvent.timelineTime - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animationplaybackevent-timelinetime">AnimationPlaybackEvent.timelineTime - Web Animations</a>
   */
  @JsProperty(
      name = "timelineTime"
  )
  @Nullable
  public native Double timelineTime();
}
