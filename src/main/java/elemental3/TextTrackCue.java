package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * TextTrackCue is an abstract class which is used as the basis for the various derived cue types, such as VTTCue; you will instead work with those derived types.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextTrackCue">TextTrackCue - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TextTrackCue"
)
public class TextTrackCue extends EventTarget {
  public double endTime;

  @Nonnull
  public String id;

  @Nullable
  public EventHandler onenter;

  @Nullable
  public EventHandler onexit;

  public boolean pauseOnExit;

  public double startTime;

  TextTrackCue() {
  }

  @JsProperty(
      name = "track"
  )
  @Nullable
  public native TextTrack track();
}
