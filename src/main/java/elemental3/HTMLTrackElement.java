package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The HTMLTrackElement interface represents an HTML track element within the DOM. This element can be used as a child of either audio or video to specify a text track containing information such as closed captions or subtitles.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTrackElement">HTMLTrackElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLTrackElement"
)
public class HTMLTrackElement extends HTMLElement {
  @JsOverlay
  public static final int ERROR = 3;

  @JsOverlay
  public static final int LOADED = 2;

  @JsOverlay
  public static final int LOADING = 1;

  @JsOverlay
  public static final int NONE = 0;

  @JsProperty(
      name = "default"
  )
  public boolean default_;

  @Nonnull
  @MagicConstant(
      valuesFromClass = TrackKind.class
  )
  public String kind;

  @Nonnull
  public String label;

  /**
   * The HTMLTrackElement.src property reflects the value of the track element's src attribute, which indicates the URL of the text track's data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTrackElement/src">HTMLTrackElement.src - MDN</a>
   */
  @Nonnull
  public String src;

  @Nonnull
  public String srclang;

  public HTMLTrackElement() {
  }

  @JsProperty(
      name = "readyState"
  )
  public native int readyState();

  @JsProperty(
      name = "track"
  )
  @Nonnull
  public native TextTrack track();

  @JsOverlay
  public final void addCuechangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "cuechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCuechangeListener(@Nonnull final EventListener callback,
      final boolean options) {
    addEventListener( "cuechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCuechangeListener(@Nonnull final EventListener callback) {
    addEventListener( "cuechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeCuechangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "cuechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCuechangeListener(@Nonnull final EventListener callback,
      final boolean options) {
    removeEventListener( "cuechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCuechangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "cuechange", Js.cast( callback ) );
  }
}