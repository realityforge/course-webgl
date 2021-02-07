package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The AnimationTimeline interface of the Web Animations API represents the timeline of an animation. This interface exists to define timeline features (inherited by DocumentTimeline and future timeline types) and is not itself directly used by developers. Anywhere you see AnimationTimeline, you should use DocumentTimeline or any other timeline type instead.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnimationTimeline">AnimationTimeline - MDN</a>
 * @see <a href="https://drafts.csswg.org/web-animations-1/#the-animationtimeline-interface">AnimationTimeline - Web Animations</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AnimationTimeline"
)
public class AnimationTimeline {
  protected AnimationTimeline() {
  }

  /**
   * The currentTime read-only property of the Web Animations API's AnimationTimeline interface returns the timeline's current time in milliseconds, or null if the timeline is inactive.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AnimationTimeline/currentTime">AnimationTimeline.currentTime - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animationtimeline-currenttime">currentTime - Web Animations</a>
   */
  @JsProperty(
      name = "currentTime"
  )
  @Nullable
  public native Double currentTime();
}
