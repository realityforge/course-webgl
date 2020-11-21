package elemental3;

import elemental3.promise.Promise;
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
 * @see <a href="https://drafts.csswg.org/web-animations-1/#the-animation-interface">The definition of 'Animation' in the 'Web Animations' specification.</a>
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
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animation-currenttime">The definition of 'currentTime' in the 'Web Animations' specification.</a>
   */
  @Nullable
  public Double currentTime;

  /**
   * The Animation.effect property of the Web Animations API gets and sets the target effect of an animation. The target effect may be either an effect object of a type based on AnimationEffectReadOnly, such as KeyframeEffect, or null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/effect">Animation.effect - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animation-effect">The definition of 'Animation.effect' in the 'Web Animations' specification.</a>
   */
  @Nullable
  public AnimationEffect effect;

  /**
   * The Animation.id property of the Web Animations API returns or sets a string used to identify the animation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/id">Animation.id - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animation-id">The definition of 'Animation.id' in the 'Web Animations' specification.</a>
   */
  @Nonnull
  public String id;

  /**
   * The oncancel property of the Web Animations API's Animation interface is the event handler for the cancel event.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/oncancel">Animation.oncancel - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animation-oncancel">The definition of 'Animation.oncancel' in the 'Web Animations' specification.</a>
   */
  @Nullable
  public EventHandler oncancel;

  /**
   * The Animation interface's onfinish property (from the Web Animations API) is the event handler for the finish event. This event is sent when the animation finishes playing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/onfinish">Animation.onfinish - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animation-onfinish">The definition of 'Animation.onfinish' in the 'Web Animations' specification.</a>
   */
  @Nullable
  public EventHandler onfinish;

  /**
   * The Animation.playbackRate property of the Web Animations API returns or sets the playback rate of the animation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/playbackRate">Animation.playbackRate - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animation-playbackrate">The definition of 'Animation.playbackRate' in the 'Web Animations' specification.</a>
   */
  public double playbackRate;

  /**
   * The Animation.startTime property of the Animation interface is a double-precision floating-point value which indicates the scheduled time when an animation's playback should begin.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/startTime">Animation.startTime - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animation-starttime">The definition of 'Animation.startTime' in the 'Web Animations' specification.</a>
   */
  @Nullable
  public Double startTime;

  /**
   * The Animation.timeline property of the Animation interface returns or sets the timeline associated with this animation. A timeline is a source of time values for synchronization purposes, and is an AnimationTimeline-based object. By default, the animation's timeline and the Document's timeline are the same.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/timeline">Animation.timeline - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animation-timeline">The definition of 'Animation.timeline' in the 'Web Animations' specification.</a>
   */
  @Nullable
  public AnimationTimeline timeline;

  /**
   * The Animation() constructor of the Web Animations API returns a new Animation object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/Animation">Animation.Animation - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animation-animation">The definition of 'Animation()' in the 'Web Animations' specification.</a>
   */
  public Animation(@Nullable final AnimationEffect effect,
      @Nullable final AnimationTimeline timeline) {
  }

  /**
   * The Animation() constructor of the Web Animations API returns a new Animation object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/Animation">Animation.Animation - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animation-animation">The definition of 'Animation()' in the 'Web Animations' specification.</a>
   */
  public Animation(@Nullable final AnimationEffect effect) {
  }

  /**
   * The Animation() constructor of the Web Animations API returns a new Animation object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/Animation">Animation.Animation - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animation-animation">The definition of 'Animation()' in the 'Web Animations' specification.</a>
   */
  public Animation() {
  }

  /**
   * The Animation.finished read-only property of the Web Animations API returns a Promise which resolves once the animation has finished playing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/finished">Animation.finished - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animation-finished">The definition of 'Animation.finished' in the 'Web Animations' specification.</a>
   */
  @JsProperty(
      name = "finished"
  )
  @Nonnull
  public native Promise<Animation> finished();

  /**
   * The read-only Animation.pending property of the Web Animations API indicates whether the animation is currently waiting for an asynchronous operation such as initiating playback or pausing a running animation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/pending">Animation.pending - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animation-currenttime">The definition of 'pending' in the 'Web Animations' specification.</a>
   */
  @JsProperty(
      name = "pending"
  )
  public native boolean pending();

  /**
   * The Animation.playState property of the Web Animations API returns and sets an enumerated value describing the playback state of an animation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/playState">Animation.playState - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#play-state">The definition of 'playState' in the 'Web Animations' specification.</a>
   */
  @JsProperty(
      name = "playState"
  )
  @Nonnull
  @AnimationPlayState
  public native String playState();

  /**
   * The read-only Animation.ready property of the Web Animations API returns a Promise which resolves when the animation is ready to play. A new promise is created every time the animation enters the &quot;pending&quot; play state as well as when the animation is canceled, since in both of those scenarios, the animation is ready to be started again.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/ready">Animation.ready - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animation-ready">The definition of 'Animation.ready' in the 'Web Animations' specification.</a>
   */
  @JsProperty(
      name = "ready"
  )
  @Nonnull
  public native Promise<Animation> ready();

  /**
   * The Web Animations API's cancel() method of the Animation interface clears all KeyframeEffects caused by this animation and aborts its playback.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/cancel">Animation.cancel - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animation-cancel">The definition of 'Animation.cancel()' in the 'Web Animations' specification.</a>
   */
  public native void cancel();

  /**
   * The finish() method of the Web Animations API's Animation Interface sets the current playback time to the end of the animation corresponding to the current playback direction.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/finish">Animation.finish - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animation-finish">The definition of 'finish()' in the 'Web Animations' specification.</a>
   */
  public native void finish();

  /**
   * The pause() method of the Web Animations API's Animation interface suspends playback of the animation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/pause">Animation.pause - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animation-pause">The definition of 'play()' in the 'Web Animations' specification.</a>
   */
  public native void pause();

  /**
   * The play() method of the Web Animations API's Animation Interface starts or resumes playing of an animation. If the animation is finished, calling play() restarts the animation, playing it from the beginning.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/play">Animation.play - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animation-play">The definition of 'play()' in the 'Web Animations' specification.</a>
   */
  public native void play();

  /**
   * The Animation.reverse() method of the Animation Interface reverses the playback direction, meaning the animation ends at its beginning. If called on an unplayed animation, the whole animation is played backwards. If called on a paused animation, the animation will continue in reverse.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/reverse">Animation.reverse - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animation-reverse">The definition of 'reverse()' in the 'Web Animations' specification.</a>
   */
  public native void reverse();

  /**
   * The updatePlaybackRate() method of the Web Animations API's Animation Interface sets the speed of an animation after first synchronizing its playback position.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Animation/updatePlaybackRate">Animation.updatePlaybackRate - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animation-updateplaybackrate">The definition of 'updatePlaybackRate()' in the 'Web Animations' specification.</a>
   */
  public native void updatePlaybackRate(double playbackRate);
}
