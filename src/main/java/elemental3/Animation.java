package elemental3;

import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Animation interface of the Web Animations API represents a single animation player and provides playback controls and a timeline for an animation node or source.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation">Animation - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public class Animation extends EventTarget {
  /**
   * The Animation.currentTime property of the Web Animations API returns and sets the current time value of the animation in milliseconds, whether running or paused.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/currentTime">Animation.currentTime - MDN</a>
   */
  @Nullable
  public Double currentTime;

  @Nullable
  public AnimationEffect effect;

  @Nonnull
  public String id;

  @Nullable
  public EventHandler oncancel;

  @Nullable
  public EventHandler onfinish;

  public double playbackRate;

  @Nullable
  public Double startTime;

  @Nullable
  public AnimationTimeline timeline;

  /**
   * The Animation() constructor of the Web Animations API returns a new Animation object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/Animation">Animation.Animation - MDN</a>
   */
  public Animation(@Nullable final AnimationEffect effect,
      @Nullable final AnimationTimeline timeline) {
  }

  /**
   * The Animation() constructor of the Web Animations API returns a new Animation object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/Animation">Animation.Animation - MDN</a>
   */
  public Animation(@Nullable final AnimationEffect effect) {
  }

  /**
   * The Animation() constructor of the Web Animations API returns a new Animation object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/Animation">Animation.Animation - MDN</a>
   */
  public Animation() {
  }

  @JsProperty(
      name = "finished"
  )
  @Nonnull
  public native Promise<Animation> finished();

  @JsProperty(
      name = "pending"
  )
  public native boolean pending();

  @JsProperty(
      name = "playState"
  )
  @Nonnull
  public native String playState();

  @JsProperty(
      name = "ready"
  )
  @Nonnull
  public native Promise<Animation> ready();

  /**
   * The Web Animations API's cancel() method of the Animation interface clears all KeyframeEffects caused by this animation and aborts its playback.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/cancel">Animation.cancel - MDN</a>
   */
  public native void cancel();

  public native void finish();

  public native void pause();

  public native void play();

  public native void reverse();

  public native void updatePlaybackRate(double playbackRate);
}
