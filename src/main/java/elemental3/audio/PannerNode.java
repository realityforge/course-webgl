package elemental3.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The PannerNode interface represents the position and behavior of an audio source signal in space. It is an AudioNode audio-processing module describing its position with right-hand Cartesian coordinates, its movement using a velocity vector and its directionality using a directionality cone.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PannerNode">PannerNode - MDN</a>
 * @see <a href="https://webaudio.github.io/web-audio-api/#pannernode">PannerNode - Web Audio API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PannerNode"
)
public class PannerNode extends AudioNode {
  /**
   * A double.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/coneInnerAngle">PannerNode.coneInnerAngle - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-pannernode-coneinnerangle">coneInnerAngle - Web Audio API</a>
   */
  public double coneInnerAngle;

  /**
   * A double.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/coneOuterAngle">PannerNode.coneOuterAngle - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-pannernode-coneouterangle">coneOuterAngle - Web Audio API</a>
   */
  public double coneOuterAngle;

  /**
   * The coneOuterGain property of the PannerNode interface is a double value, describing the amount of volume reduction outside the cone, defined by the coneOuterAngle attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/coneOuterGain">PannerNode.coneOuterGain - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-pannernode-coneoutergain">coneOuterGain - Web Audio API</a>
   */
  public double coneOuterGain;

  /**
   * A enum &mdash; see DistanceModelType.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/distanceModel">PannerNode.distanceModel - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-pannernode-distancemodel">distanceModel - Web Audio API</a>
   */
  @Nonnull
  @DistanceModelType
  public String distanceModel;

  /**
   * A double. The default is 10000, and non-positive values are not allowed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/maxDistance">PannerNode.maxDistance - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-pannernode-maxdistance">maxDistance - Web Audio API</a>
   */
  public double maxDistance;

  /**
   * A enum &mdash; see PanningModelType.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/panningModel">PannerNode.panningModel - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-pannernode-panningmodel">panningModel - Web Audio API</a>
   */
  @Nonnull
  @PanningModelType
  public String panningModel;

  /**
   * A non-negative number. If the value is set to less than 0, a RangeError is thrown.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/refDistance">PannerNode.refDistance - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-pannernode-refdistance">refDistance - Web Audio API</a>
   */
  public double refDistance;

  /**
   * A number whose range depends on the distanceModel of the panner as follows (negative values are not allowed):
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/rolloffFactor">PannerNode.rolloffFactor - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-pannernode-rollofffactor">rolloffFactor - Web Audio API</a>
   */
  public double rolloffFactor;

  /**
   * The PannerNode() constructor of the Web Audio API creates a new PannerNode object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/PannerNode">PannerNode.PannerNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-pannernode-pannernode">PannerNode() - Web Audio API</a>
   */
  public PannerNode(@Nonnull final BaseAudioContext context, @Nonnull final PannerOptions options) {
  }

  /**
   * The PannerNode() constructor of the Web Audio API creates a new PannerNode object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/PannerNode">PannerNode.PannerNode - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-pannernode-pannernode">PannerNode() - Web Audio API</a>
   */
  public PannerNode(@Nonnull final BaseAudioContext context) {
  }

  /**
   * An AudioParam whose value is the X component of the direction in which the audio source is facing, in 3D Cartesian coordinate space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/orientationX">PannerNode.orientationX - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-pannernode-orientationx">orientationX - Web Audio API</a>
   */
  @JsProperty(
      name = "orientationX"
  )
  @Nonnull
  public native AudioParam orientationX();

  /**
   * An AudioParam whose value is the Y component of the direction the audio source is facing, in 3D Cartesian coordinate space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/orientationY">PannerNode.orientationY - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-pannernode-orientationy">orientationY - Web Audio API</a>
   */
  @JsProperty(
      name = "orientationY"
  )
  @Nonnull
  public native AudioParam orientationY();

  /**
   * An AudioParam whose value is the Z component of the direction the audio source is facing, in 3D Cartesian coordinate space.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/orientationZ">PannerNode.orientationZ - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-pannernode-orientationz">orientationZ - Web Audio API</a>
   */
  @JsProperty(
      name = "orientationZ"
  )
  @Nonnull
  public native AudioParam orientationZ();

  /**
   * An AudioParam whose value is the X coordinate of the audio source's position, in 3D Cartesian coordinates. The default value is 0.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/positionX">PannerNode.positionX - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-pannernode-positionx">positionX - Web Audio API</a>
   */
  @JsProperty(
      name = "positionX"
  )
  @Nonnull
  public native AudioParam positionX();

  /**
   * An AudioParam whose value is the Y coordinate of the audio source's position, in 3D Cartesian coordinates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/positionY">PannerNode.positionY - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-pannernode-positiony">positionY - Web Audio API</a>
   */
  @JsProperty(
      name = "positionY"
  )
  @Nonnull
  public native AudioParam positionY();

  /**
   * An AudioParam whose value is the Z coordinate of the audio source's position, in 3D Cartesian coordinates.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/positionZ">PannerNode.positionZ - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-pannernode-positionz">positionZ - Web Audio API</a>
   */
  @JsProperty(
      name = "positionZ"
  )
  @Nonnull
  public native AudioParam positionZ();

  /**
   * Void.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/setOrientation">PannerNode.setOrientation - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-pannernode-setorientation">setOrientation() - Web Audio API</a>
   */
  public native void setOrientation(float x, float y, float z);

  /**
   * Void.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PannerNode/setPosition">PannerNode.setPosition - MDN</a>
   * @see <a href="https://webaudio.github.io/web-audio-api/#dom-pannernode-setposition">setPosition() - Web Audio API</a>
   */
  public native void setPosition(float x, float y, float z);
}
