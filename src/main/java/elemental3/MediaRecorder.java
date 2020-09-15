package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The MediaRecorder interface of the MediaStream Recording API provides functionality to easily record media. It is created using the MediaRecorder() constructor.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaRecorder">MediaRecorder - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaRecorder"
)
public class MediaRecorder extends EventTarget {
  @Nullable
  public EventHandler ondataavailable;

  /**
   * The MediaRecorder interface's onerror event handler is called by the MediaStream Recording API when an error occurs. You can provide an event handler to deal with errors that occur while creating or using a media recorder
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaRecorder/onerror">MediaRecorder.onerror - MDN</a>
   */
  @Nullable
  public MediaRecorderErrorEventHandler onerror;

  @Nullable
  public EventHandler onpause;

  @Nullable
  public EventHandler onresume;

  @Nullable
  public EventHandler onstart;

  @Nullable
  public EventHandler onstop;

  /**
   * The MediaRecorder() constructor creates a new MediaRecorder object that will record a specified MediaStream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaRecorder/MediaRecorder">MediaRecorder.MediaRecorder - MDN</a>
   */
  public MediaRecorder(@Nonnull final MediaStream stream,
      @Nonnull final MediaRecorderOptions options) {
  }

  /**
   * The MediaRecorder() constructor creates a new MediaRecorder object that will record a specified MediaStream.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaRecorder/MediaRecorder">MediaRecorder.MediaRecorder - MDN</a>
   */
  public MediaRecorder(@Nonnull final MediaStream stream) {
  }

  @JsProperty(
      name = "audioBitrateMode"
  )
  @Nonnull
  public native String audioBitrateMode();

  /**
   * The audioBitsPerSecond read-only property of the MediaRecorder interface returns the audio encoding bit rate in use.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaRecorder/audioBitsPerSecond">MediaRecorder.audioBitsPerSecond - MDN</a>
   */
  @JsProperty(
      name = "audioBitsPerSecond"
  )
  public native int audioBitsPerSecond();

  /**
   * The mimeType read-only property returns the MIME media type that was specified when creating the MediaRecorder object, or, if none was specified, which was chosen by the browser.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaRecorder/mimeType">MediaRecorder.mimeType - MDN</a>
   */
  @JsProperty(
      name = "mimeType"
  )
  @Nonnull
  public native String mimeType();

  /**
   * The MediaRecorder.state read-only property returns the current state of the current MediaRecorder object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaRecorder/state">MediaRecorder.state - MDN</a>
   */
  @JsProperty(
      name = "state"
  )
  @Nonnull
  public native String state();

  /**
   * The MediaRecorder.stream read-only property returns the stream that was passed into the MediaRecorder() constructor when the MediaRecorder was created.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaRecorder/stream">MediaRecorder.stream - MDN</a>
   */
  @JsProperty(
      name = "stream"
  )
  @Nonnull
  public native MediaStream stream();

  /**
   * The videoBitsPerSecond read-only property of the MediaRecorder interface returns the video encoding bit rate in use.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaRecorder/videoBitsPerSecond">MediaRecorder.videoBitsPerSecond - MDN</a>
   */
  @JsProperty(
      name = "videoBitsPerSecond"
  )
  public native int videoBitsPerSecond();

  /**
   * The MediaRecorder.isTypeSupported() static method returns a Boolean which is true if the MIME type specified is one the user agent should be able to successfully record.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaRecorder/isTypeSupported">MediaRecorder.isTypeSupported - MDN</a>
   */
  public static native boolean isTypeSupported(@Nonnull String type);

  /**
   * The Media.pause() method (part of the MediaRecorder API) is used to pause recording of media streams.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaRecorder/pause">MediaRecorder.pause - MDN</a>
   */
  public native void pause();

  /**
   * The MediaRecorder.requestData() method (part of the MediaRecorder API) is used to raise a dataavailable event containing a Blob object of the captured media as it was when the method was called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaRecorder/requestData">MediaRecorder.requestData - MDN</a>
   */
  public native void requestData();

  /**
   * The MediaRecorder.resume() method (part of the MediaRecorder API) is used to resume media recording when it has been previously paused.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaRecorder/resume">MediaRecorder.resume - MDN</a>
   */
  public native void resume();

  /**
   * The MediaRecorder method start(), which is part of the MediaStream Recording API, begins recording media into one or more Blob objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaRecorder/start">MediaRecorder.start - MDN</a>
   */
  public native void start(int timeslice);

  /**
   * The MediaRecorder method start(), which is part of the MediaStream Recording API, begins recording media into one or more Blob objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaRecorder/start">MediaRecorder.start - MDN</a>
   */
  public native void start();

  /**
   * The MediaRecorder.stop() method (part of the MediaRecorder API) is used to stop media capture.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaRecorder/stop">MediaRecorder.stop - MDN</a>
   */
  public native void stop();

  @JsOverlay
  public final void addErrorListener(@Nonnull final MediaRecorderErrorEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final MediaRecorderErrorEventListener callback,
      final boolean options) {
    addEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final MediaRecorderErrorEventListener callback) {
    addEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final MediaRecorderErrorEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final MediaRecorderErrorEventListener callback,
      final boolean options) {
    removeEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final MediaRecorderErrorEventListener callback) {
    removeEventListener( "error", Js.cast( callback ) );
  }
}