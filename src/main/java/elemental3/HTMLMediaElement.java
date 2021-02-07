package elemental3;

import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The HTMLMediaElement interface adds to HTMLElement the properties and methods needed to support basic media-related capabilities that are common to audio and video.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement">HTMLMediaElement - MDN</a>
 * @see <a href="https://w3c.github.io/encrypted-media/#introduction">Encrypted Media Extensions - Encrypted Media Extensions</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/the-video-element.html#htmlmediaelement">HTMLMediaElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#htmlmediaelement">HTMLMediaElement - HTML5</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLMediaElement"
)
public class HTMLMediaElement extends HTMLElement {
  @JsOverlay
  public static final int HAVE_CURRENT_DATA = 2;

  @JsOverlay
  public static final int HAVE_ENOUGH_DATA = 4;

  @JsOverlay
  public static final int HAVE_FUTURE_DATA = 3;

  @JsOverlay
  public static final int HAVE_METADATA = 1;

  @JsOverlay
  public static final int HAVE_NOTHING = 0;

  @JsOverlay
  public static final int NETWORK_EMPTY = 0;

  @JsOverlay
  public static final int NETWORK_IDLE = 1;

  @JsOverlay
  public static final int NETWORK_LOADING = 2;

  @JsOverlay
  public static final int NETWORK_NO_SOURCE = 3;

  /**
   * The HTMLMediaElement.autoplay property reflects the autoplay HTML attribute, indicating whether playback should automatically begin as soon as enough media is available to do so without interruption.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/autoplay">HTMLMediaElement.autoplay - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/embedded-content.html#dom-media-autoplay">HTMLMediaElement.autoplay - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#htmlmediaelement">HTMLMediaElement.autoplay - HTML5</a>
   */
  public boolean autoplay;

  /**
   * The HTMLMediaElement.controls property reflects the controls HTML attribute, which controls whether user interface controls for playing the media item will be displayed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/controls">HTMLMediaElement.controls - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-media-controls">HTMLMediaElement.controls - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#htmlmediaelement">HTMLMediaElement.controls - HTML5</a>
   */
  public boolean controls;

  /**
   * The HTMLMediaElement.crossOrigin property is the CORS setting for this image element. See CORS settings attributes for details.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/crossOrigin">HTMLMediaElement.crossOrigin - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#attr-media-crossorigin">HTMLMediaElement.crossOrigin - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#htmlmediaelement">HTMLMediaElement.crossOrigin - HTML5</a>
   */
  @Nullable
  @CrossOriginType
  public String crossOrigin;

  /**
   * The HTMLMediaElement interface's currentTime property specifies the current playback time in seconds.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/currentTime">HTMLMediaElement.currentTime - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/embedded-content.html#dom-media-currenttime">HTMLMediaElement.currentTime - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#htmlmediaelement">HTMLMediaElement.currentTime - HTML5</a>
   */
  public double currentTime;

  /**
   * The HTMLMediaElement.defaultMuted property reflects the muted HTML attribute, which indicates whether the media element's audio output should be muted by default. This property has no dynamic effect. To mute and unmute the audio output, use the muted property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/defaultMuted">HTMLMediaElement.defaultMuted - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-media-defaultmuted">HTMLMediaElement.defaultMuted - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#htmlmediaelement">HTMLMediaElement.defaultMuted - HTML5</a>
   */
  public boolean defaultMuted;

  /**
   * The HTMLMediaElement.defaultPlaybackRate property indicates the default playback rate for the media.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/defaultPlaybackRate">HTMLMediaElement.defaultPlaybackRate - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-media-defaultplaybackrate">HTMLMediaElement.defaultPlaybackRate - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#htmlmediaelement">HTMLMediaElement.defaultPlaybackRate - HTML5</a>
   */
  public double defaultPlaybackRate;

  /**
   * The HTMLMediaElement.loop property reflects the loop HTML attribute, which controls whether the media element should start over when it reaches the end.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/loop">HTMLMediaElement.loop - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-media-loop">HTMLMediaElement.loop - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#htmlmediaelement">HTMLMediaElement.loop - HTML5</a>
   */
  public boolean loop;

  /**
   * The HTMLMediaElement.muted indicates whether the media element muted.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/muted">HTMLMediaElement.muted - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-media-muted">HTMLMediaElement.muted - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#htmlmediaelement">HTMLMediaElement.muted - HTML5</a>
   */
  public boolean muted;

  @Nullable
  public EventHandler onencrypted;

  @Nullable
  public EventHandler onwaitingforkey;

  /**
   * The HTMLMediaElement.playbackRate property sets the rate at which the media is being played back. This is used to implement user controls for fast forward, slow motion, and so forth. The normal playback rate is multiplied by this value to obtain the current rate, so a value of 1.0 indicates normal speed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/playbackRate">HTMLMediaElement.playbackRate - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-media-playbackrate">HTMLMediaElement.playbackRate - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#htmlmediaelement">HTMLMediaElement.playbackRate - HTML5</a>
   */
  public double playbackRate;

  @Nonnull
  @MediaPreloadType
  public String preload;

  public boolean preservesPitch;

  /**
   * The HTMLMediaElement.src property reflects the value of the HTML media element's src attribute, which indicates the URL of a media resource to use in the element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/src">HTMLMediaElement.src - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/embedded-content.html#dom-media-src">HTMLMediaElement.src - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#dom-media-src">HTMLMediaElement.src - HTML5</a>
   */
  @Nonnull
  public String src;

  /**
   * The srcObject property of the HTMLMediaElement interface sets or returns the object which serves as the source of the media associated with the HTMLMediaElement.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/srcObject">HTMLMediaElement.srcObject - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/embedded-content.html#dom-media-srcobject">srcObject - HTML Living Standard</a>
   */
  @Nullable
  public MediaProvider srcObject;

  /**
   * The HTMLMediaElement.volume property sets the volume at which the media will be played.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/volume">HTMLMediaElement.volume - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-media-volume">HTMLMediaElement.volume - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#htmlmediaelement">HTMLMediaElement.volume - HTML5</a>
   */
  public double volume;

  protected HTMLMediaElement() {
  }

  /**
   * The read-only audioTracks property on HTMLMediaElement objects returns an AudioTrackList object listing all of the  AudioTrack objects representing the media element's audio tracks.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/audioTracks">HTMLMediaElement.audioTracks - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-media-audiotracks">HTMLMediaElement.audioTracks - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#htmlmediaelement">HTMLMediaElement.audioTracks - HTML5</a>
   */
  @JsProperty(
      name = "audioTracks"
  )
  @Nonnull
  public native AudioTrackList audioTracks();

  /**
   * The HTMLMediaElement.buffered read-only property returns a new TimeRanges object that indicates the ranges of the media source that the browser has buffered (if any) at the moment the buffered property is accessed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/buffered">HTMLMediaElement.buffered - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/embedded-content.html#media-elements">HTMLMediaElement.buffered - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#htmlmediaelement">HTMLMediaElement.buffered - HTML5</a>
   */
  @JsProperty(
      name = "buffered"
  )
  @Nonnull
  public native TimeRanges buffered();

  /**
   * The HTMLMediaElement.currentSrc property contains the absolute URL of the chosen media resource. This could happen, for example, if the web server selects a media file based on the resolution of the user's display. The value is an empty string if the networkState property is EMPTY.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/currentSrc">HTMLMediaElement.currentSrc - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-media-currentsrc">HTMLMediaElement.currentSrc - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#htmlmediaelement">HTMLMediaElement.currentSrc - HTML5</a>
   */
  @JsProperty(
      name = "currentSrc"
  )
  @Nonnull
  public native String currentSrc();

  /**
   * The read-only HTMLMediaElement property duration indicates the length of the element's media in seconds.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/duration">HTMLMediaElement.duration - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-media-duration">HTMLMediaElement.duration - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#htmlmediaelement">HTMLMediaElement.duration - HTML5</a>
   */
  @JsProperty(
      name = "duration"
  )
  public native double duration();

  /**
   * The HTMLMediaElement.ended indicates whether the media element has ended playback.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/ended">HTMLMediaElement.ended - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-media-ended">HTMLMediaElement.ended - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#htmlmediaelement">HTMLMediaElement.ended - HTML5</a>
   */
  @JsProperty(
      name = "ended"
  )
  public native boolean ended();

  /**
   * The HTMLMediaElement.error is the MediaError object for the most recent error, or null if there has not been an error. When an error event is received by the element, you can determine details about what happened by examining this object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/error">HTMLMediaElement.error - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-media-error">HTMLMediaElement.error - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#htmlmediaelement">HTMLMediaElement.error - HTML5</a>
   */
  @JsProperty(
      name = "error"
  )
  @Nullable
  public native MediaError error();

  @JsProperty(
      name = "mediaKeys"
  )
  @Nullable
  public native MediaKeys mediaKeys();

  /**
   * The HTMLMediaElement.networkState property indicates the current state of the fetching of media over the network.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/networkState">HTMLMediaElement.networkState - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-media-networkstate">HTMLMediaElement.networkState - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#htmlmediaelement">HTMLMediaElement.networkState - HTML5</a>
   */
  @JsProperty(
      name = "networkState"
  )
  @HTMLMediaElementNetworkState
  public native int networkState();

  /**
   * The read-only HTMLMediaElement.paused property tells whether the media element is paused.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/paused">HTMLMediaElement.paused - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-media-paused">HTMLMediaElement.paused - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#htmlmediaelement">HTMLMediaElement.paused - HTML5</a>
   */
  @JsProperty(
      name = "paused"
  )
  public native boolean paused();

  @JsProperty(
      name = "played"
  )
  @Nonnull
  public native TimeRanges played();

  /**
   * The HTMLMediaElement.readyState property indicates the readiness state of the media.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/readyState">HTMLMediaElement.readyState - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-media-readystate">HTMLMediaElement.readyState - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#htmlmediaelement">HTMLMediaElement.readyState - HTML5</a>
   */
  @JsProperty(
      name = "readyState"
  )
  @HTMLMediaElementReadyState
  public native int readyState();

  /**
   * The seekable read-only property of the HTMLMediaElement returns a TimeRanges object that contains the time ranges that the user is able to seek to, if any.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/seekable">HTMLMediaElement.seekable - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/the-video-element.html#dom-media-seekable">HTMLMediaElement - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#dom-media-seekable">HTMLMediaElement - HTML5</a>
   * @see <a href="https://w3c.github.io/media-source/#htmlmediaelement-extensions">HTMLMediaElement extensions, like for seekable - Media Source Extensions</a>
   */
  @JsProperty(
      name = "seekable"
  )
  @Nonnull
  public native TimeRanges seekable();

  @JsProperty(
      name = "seeking"
  )
  public native boolean seeking();

  /**
   * The read-only textTracks property on HTMLMediaElement objects returns a TextTrackList object listing all of the TextTrack objects representing the media element's text tracks
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/textTracks">HTMLMediaElement.textTracks - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-media-texttracks">HTMLMediaElement.textTracks - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#htmlmediaelement">HTMLMediaElement.textTracks - HTML5</a>
   */
  @JsProperty(
      name = "textTracks"
  )
  @Nonnull
  public native TextTrackList textTracks();

  /**
   * The read-only videoTracks property on HTMLMediaElement objects returns a VideoTrackList object listing all of the VideoTrack objects representing the media element's video tracks.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/videoTracks">HTMLMediaElement.videoTracks - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-media-videotracks">HTMLMediaElement.videoTracks - HTML Living Standard</a>
   */
  @JsProperty(
      name = "videoTracks"
  )
  @Nonnull
  public native VideoTrackList videoTracks();

  @Nonnull
  public native TextTrack addTextTrack(@TextTrackKind @Nonnull String kind, @Nonnull String label,
      @Nonnull String language);

  @Nonnull
  public native TextTrack addTextTrack(@TextTrackKind @Nonnull String kind, @Nonnull String label);

  @Nonnull
  public native TextTrack addTextTrack(@TextTrackKind @Nonnull String kind);

  /**
   * The HTMLMediaElement method canPlayType() reports how likely it is that the current browser will be able to play media of a given MIME type.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/canPlayType">HTMLMediaElement.canPlayType - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-navigator-canplaytype">canplaytype - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#htmlmediaelement">HTMLMediaElement.canplaytype - HTML5</a>
   */
  @CanPlayTypeResult
  @Nonnull
  public native String canPlayType(@Nonnull String type);

  /**
   * The HTMLMediaElement.fastSeek() method quickly seeks the media to the new time with precision tradeoff.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/fastSeek">HTMLMediaElement.fastSeek - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/embedded-content.html#dom-media-fastseek">fastSeek() - HTML Living Standard</a>
   */
  public native void fastSeek(double time);

  @Nonnull
  public native Object getStartDate();

  /**
   * The HTMLMediaElement method load() resets the media element to its initial state and begins the process of selecting a media source and loading the media in preparation for playback to begin at the beginning.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/load">HTMLMediaElement.load - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/media.html#dom-media-load">HTMLMediaElement.load() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/semantics-embedded-content.html#dom-htmlmediaelement-load">HTMLMediaElement.load() - HTML5</a>
   */
  public native void load();

  /**
   * The HTMLMediaElement.pause() method will pause playback of the media, if the media is already in a paused state this method will have no effect.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/pause">HTMLMediaElement.pause - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/embedded-content.html#dom-media-pause">pause() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#dom-media-pause">pause() - HTML5</a>
   */
  public native void pause();

  /**
   * The HTMLMediaElement play() method attempts to begin playback of the media. It returns a Promise which is resolved when playback has been successfully started.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/play">HTMLMediaElement.play - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/embedded-content.html#dom-media-play">play() - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#dom-media-play">play() - HTML5</a>
   */
  @Nonnull
  public native Promise<Void> play();

  /**
   * The setMediaKeys() property of the HTMLMediaElement interface returns a Promise that resolves to the passed MediaKeys, which are those used to decrypt media during playback.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/setMediaKeys">HTMLMediaElement.setMediaKeys - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-htmlmediaelement-setmediakeys">setMediaKeys() - Encrypted Media Extensions</a>
   */
  @Nonnull
  public native Promise<Void> setMediaKeys(@Nullable MediaKeys mediaKeys);

  @JsOverlay
  public final void addAbortListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "abort", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAbortListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "abort", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addAbortListener(@Nonnull final EventListener callback) {
    addEventListener( "abort", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAbortListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "abort", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAbortListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "abort", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeAbortListener(@Nonnull final EventListener callback) {
    removeEventListener( "abort", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addCanplayListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "canplay", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCanplayListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "canplay", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addCanplayListener(@Nonnull final EventListener callback) {
    addEventListener( "canplay", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeCanplayListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "canplay", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCanplayListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "canplay", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeCanplayListener(@Nonnull final EventListener callback) {
    removeEventListener( "canplay", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addCanplaythroughListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "canplaythrough", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCanplaythroughListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "canplaythrough", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addCanplaythroughListener(@Nonnull final EventListener callback) {
    addEventListener( "canplaythrough", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeCanplaythroughListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "canplaythrough", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCanplaythroughListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "canplaythrough", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeCanplaythroughListener(@Nonnull final EventListener callback) {
    removeEventListener( "canplaythrough", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addDurationchangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "durationchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDurationchangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "durationchange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addDurationchangeListener(@Nonnull final EventListener callback) {
    addEventListener( "durationchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDurationchangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "durationchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDurationchangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "durationchange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeDurationchangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "durationchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addEmptiedListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "emptied", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addEmptiedListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "emptied", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addEmptiedListener(@Nonnull final EventListener callback) {
    addEventListener( "emptied", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeEmptiedListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "emptied", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeEmptiedListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "emptied", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeEmptiedListener(@Nonnull final EventListener callback) {
    removeEventListener( "emptied", Js.cast( callback ) );
  }

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

  @JsOverlay
  public final void addErrorListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "error", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final EventListener callback) {
    addEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "error", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final EventListener callback) {
    removeEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addLoadeddataListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "loadeddata", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLoadeddataListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "loadeddata", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addLoadeddataListener(@Nonnull final EventListener callback) {
    addEventListener( "loadeddata", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeLoadeddataListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "loadeddata", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLoadeddataListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "loadeddata", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeLoadeddataListener(@Nonnull final EventListener callback) {
    removeEventListener( "loadeddata", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addLoadedmetadataListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "loadedmetadata", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLoadedmetadataListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "loadedmetadata", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addLoadedmetadataListener(@Nonnull final EventListener callback) {
    addEventListener( "loadedmetadata", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeLoadedmetadataListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "loadedmetadata", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLoadedmetadataListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "loadedmetadata", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeLoadedmetadataListener(@Nonnull final EventListener callback) {
    removeEventListener( "loadedmetadata", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addLoadstartListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "loadstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLoadstartListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "loadstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addLoadstartListener(@Nonnull final EventListener callback) {
    addEventListener( "loadstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeLoadstartListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "loadstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLoadstartListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "loadstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeLoadstartListener(@Nonnull final EventListener callback) {
    removeEventListener( "loadstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPauseListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "pause", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPauseListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "pause", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addPauseListener(@Nonnull final EventListener callback) {
    addEventListener( "pause", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePauseListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "pause", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePauseListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "pause", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removePauseListener(@Nonnull final EventListener callback) {
    removeEventListener( "pause", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPlayListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "play", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPlayListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "play", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addPlayListener(@Nonnull final EventListener callback) {
    addEventListener( "play", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePlayListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "play", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePlayListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "play", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removePlayListener(@Nonnull final EventListener callback) {
    removeEventListener( "play", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPlayingListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "playing", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPlayingListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "playing", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addPlayingListener(@Nonnull final EventListener callback) {
    addEventListener( "playing", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePlayingListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "playing", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePlayingListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "playing", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removePlayingListener(@Nonnull final EventListener callback) {
    removeEventListener( "playing", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addProgressListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "progress", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addProgressListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "progress", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addProgressListener(@Nonnull final EventListener callback) {
    addEventListener( "progress", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeProgressListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "progress", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeProgressListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "progress", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeProgressListener(@Nonnull final EventListener callback) {
    removeEventListener( "progress", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addRatechangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "ratechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addRatechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "ratechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addRatechangeListener(@Nonnull final EventListener callback) {
    addEventListener( "ratechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeRatechangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "ratechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeRatechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "ratechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeRatechangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "ratechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addSeekedListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "seeked", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addSeekedListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "seeked", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addSeekedListener(@Nonnull final EventListener callback) {
    addEventListener( "seeked", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeSeekedListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "seeked", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeSeekedListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "seeked", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeSeekedListener(@Nonnull final EventListener callback) {
    removeEventListener( "seeked", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addSeekingListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "seeking", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addSeekingListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "seeking", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addSeekingListener(@Nonnull final EventListener callback) {
    addEventListener( "seeking", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeSeekingListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "seeking", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeSeekingListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "seeking", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeSeekingListener(@Nonnull final EventListener callback) {
    removeEventListener( "seeking", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addStalledListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "stalled", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addStalledListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "stalled", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addStalledListener(@Nonnull final EventListener callback) {
    addEventListener( "stalled", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeStalledListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "stalled", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeStalledListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "stalled", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeStalledListener(@Nonnull final EventListener callback) {
    removeEventListener( "stalled", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addSuspendListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "suspend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addSuspendListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "suspend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addSuspendListener(@Nonnull final EventListener callback) {
    addEventListener( "suspend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeSuspendListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "suspend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeSuspendListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "suspend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeSuspendListener(@Nonnull final EventListener callback) {
    removeEventListener( "suspend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTimeupdateListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "timeupdate", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTimeupdateListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "timeupdate", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addTimeupdateListener(@Nonnull final EventListener callback) {
    addEventListener( "timeupdate", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTimeupdateListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "timeupdate", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTimeupdateListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "timeupdate", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeTimeupdateListener(@Nonnull final EventListener callback) {
    removeEventListener( "timeupdate", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addVolumechangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "volumechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addVolumechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "volumechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addVolumechangeListener(@Nonnull final EventListener callback) {
    addEventListener( "volumechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeVolumechangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "volumechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeVolumechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "volumechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeVolumechangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "volumechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addWaitingListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "waiting", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addWaitingListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "waiting", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addWaitingListener(@Nonnull final EventListener callback) {
    addEventListener( "waiting", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeWaitingListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "waiting", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeWaitingListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "waiting", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeWaitingListener(@Nonnull final EventListener callback) {
    removeEventListener( "waiting", Js.cast( callback ) );
  }
}
