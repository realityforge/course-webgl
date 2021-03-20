package akasha.audio;

import akasha.AddEventListenerOptions;
import akasha.EventHandler;
import akasha.EventListener;
import akasha.EventListenerOptions;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The AudioScheduledSourceNode interface&mdash;part of the Web Audio API&mdash;is a parent interface for several types of audio source node interfaces which share the ability to be started and stopped, optionally at specified times. Specifically, this interface defines the start() and stop() methods, as well as the onended event handler.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioScheduledSourceNode">AudioScheduledSourceNode - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#AudioScheduledSourceNode">AudioScheduledSourceNode - Web Audio API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioScheduledSourceNode"
)
public class AudioScheduledSourceNode extends AudioNode {
  /**
   * The onended event handler for the AudioScheduledSourceNode interface specifies an EventHandler to be executed when the ended event occurs on the node. This event is sent to the node when the concrete interface (such as AudioBufferSourceNode, OscillatorNode, or ConstantSourceNode) determines that it has stopped playing.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioScheduledSourceNode/onended">AudioScheduledSourceNode.onended - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audioscheduledsourcenode-onended">onended - Web Audio API</a>
   */
  @Nullable
  public EventHandler onended;

  protected AudioScheduledSourceNode() {
  }

  /**
   * The start() method on AudioScheduledSourceNode schedules a sound to begin playback at the specified time. If no time is specified, then the sound begins playing immediately.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioScheduledSourceNode/start">AudioScheduledSourceNode.start - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audioscheduledsourcenode-start">start() - Web Audio API</a>
   */
  public native void start(double when);

  /**
   * The start() method on AudioScheduledSourceNode schedules a sound to begin playback at the specified time. If no time is specified, then the sound begins playing immediately.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioScheduledSourceNode/start">AudioScheduledSourceNode.start - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audioscheduledsourcenode-start">start() - Web Audio API</a>
   */
  public native void start();

  /**
   * The stop() method on AudioScheduledSourceNode schedules a sound to cease playback at the specified time. If no time is specified, then the sound stops playing immediately.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioScheduledSourceNode/stop">AudioScheduledSourceNode.stop - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audioscheduledsourcenode-stop">stop() - Web Audio API</a>
   */
  public native void stop(double when);

  /**
   * The stop() method on AudioScheduledSourceNode schedules a sound to cease playback at the specified time. If no time is specified, then the sound stops playing immediately.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioScheduledSourceNode/stop">AudioScheduledSourceNode.stop - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-audioscheduledsourcenode-stop">stop() - Web Audio API</a>
   */
  public native void stop();

  @JsOverlay
  public final void addEndedListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "ended", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addEndedListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "ended", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addEndedListener(@Nonnull final EventListener callback) {
    addEventListener( "ended", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeEndedListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "ended", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeEndedListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "ended", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeEndedListener(@Nonnull final EventListener callback) {
    removeEventListener( "ended", Js.cast( callback ) );
  }
}
