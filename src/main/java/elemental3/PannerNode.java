package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

/**
 * A PannerNode always has exactly one input and one output: the input can be mono or stereo but the output is always stereo (2 channels); you can't have panning effects without at least two audio channels!
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PannerNode">PannerNode - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PannerNode"
)
public class PannerNode extends AudioNode {
  public double coneInnerAngle;

  public double coneOuterAngle;

  public double coneOuterGain;

  @Nonnull
  @MagicConstant(
      valuesFromClass = DistanceModelType.class
  )
  public String distanceModel;

  public double maxDistance;

  @Nonnull
  @MagicConstant(
      valuesFromClass = PanningModelType.class
  )
  public String panningModel;

  public double refDistance;

  public double rolloffFactor;

  public PannerNode(@Nonnull final BaseAudioContext context, @Nonnull final PannerOptions options) {
  }

  public PannerNode(@Nonnull final BaseAudioContext context) {
  }

  @JsProperty(
      name = "orientationX"
  )
  @Nonnull
  public native AudioParam orientationX();

  @JsProperty(
      name = "orientationY"
  )
  @Nonnull
  public native AudioParam orientationY();

  @JsProperty(
      name = "orientationZ"
  )
  @Nonnull
  public native AudioParam orientationZ();

  @JsProperty(
      name = "positionX"
  )
  @Nonnull
  public native AudioParam positionX();

  @JsProperty(
      name = "positionY"
  )
  @Nonnull
  public native AudioParam positionY();

  @JsProperty(
      name = "positionZ"
  )
  @Nonnull
  public native AudioParam positionZ();

  public native void setOrientation(float x, float y, float z);

  /**
   * Void.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/setPosition">PannerNode.setPosition - MDN</a>
   */
  public native void setPosition(float x, float y, float z);
}
