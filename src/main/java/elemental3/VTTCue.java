package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * This interface also inherits properties from TextTrackCue.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VTTCue">VTTCue - MDN</a>
 * @see <a href="https://w3c.github.io/webvtt/">WebVTT: The Web Video Text Tracks Format</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "VTTCue"
)
public class VTTCue extends TextTrackCue {
  @Nonnull
  @AlignSetting
  public String align;

  @Nonnull
  public LineAndPositionSetting line;

  @Nonnull
  @LineAlignSetting
  public String lineAlign;

  @Nonnull
  public LineAndPositionSetting position;

  @Nonnull
  @PositionAlignSetting
  public String positionAlign;

  @Nullable
  public VTTRegion region;

  public double size;

  public boolean snapToLines;

  @Nonnull
  public String text;

  @Nonnull
  @DirectionSetting
  public String vertical;

  /**
   * The VTTCue() constructor creates and returns a new VTTCue object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VTTCue/VTTCue">VTTCue.VTTCue - MDN</a>
   * @see <a href="https://w3c.github.io/webvtt/#dom-vttcue-vttcue">The definition of 'VTTCue()' in the 'WebVTT: The Web Video Text Tracks Format' specification.</a>
   */
  public VTTCue(final double startTime, final double endTime, @Nonnull final String text) {
  }

  @Nonnull
  public native DocumentFragment getCueAsHTML();
}
