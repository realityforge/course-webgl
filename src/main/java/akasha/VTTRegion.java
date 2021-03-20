package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The VTTRegion interface&mdash;part of the API for handling WebVTT (text tracks on media presentations)&mdash;describes a portion of the video to render a VTTCue onto.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VTTRegion">VTTRegion - MDN</a>
 * @see <a href="https://w3c.github.io/webvtt/">WebVTT: The Web Video Text Tracks Format</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "VTTRegion"
)
public class VTTRegion {
  @Nonnull
  public String id;

  public int lines;

  public double regionAnchorX;

  public double regionAnchorY;

  @Nonnull
  @ScrollSetting
  public String scroll;

  public double viewportAnchorX;

  public double viewportAnchorY;

  public double width;

  protected VTTRegion() {
  }
}
