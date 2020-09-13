package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.intellij.lang.annotations.MagicConstant;

/**
 * An instance of the WebRTC API's RTCRtpEncodingParameters dictionary describes a single configuration of a codec for an RTCRtpSender.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpEncodingParameters">RTCRtpEncodingParameters - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface RTCRtpEncodingParameters extends RTCRtpCodingParameters {
  @JsOverlay
  @Nonnull
  static RTCRtpEncodingParameters create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "active"
  )
  boolean active();

  @JsProperty
  void setActive(boolean active);

  @JsOverlay
  @Nonnull
  default RTCRtpEncodingParameters active(final boolean active) {
    setActive( active );
    return this;
  }

  /**
   * The RTCRtpEncodingParameters dictionary's maxBitrate property specifies the maximum number of bits per second to allow a track encoded with this encoding to use.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpEncodingParameters/maxBitrate">RTCRtpEncodingParameters.maxBitrate - MDN</a>
   */
  @JsProperty(
      name = "maxBitrate"
  )
  int maxBitrate();

  /**
   * The RTCRtpEncodingParameters dictionary's maxBitrate property specifies the maximum number of bits per second to allow a track encoded with this encoding to use.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpEncodingParameters/maxBitrate">RTCRtpEncodingParameters.maxBitrate - MDN</a>
   */
  @JsProperty
  void setMaxBitrate(int maxBitrate);

  /**
   * The RTCRtpEncodingParameters dictionary's maxBitrate property specifies the maximum number of bits per second to allow a track encoded with this encoding to use.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpEncodingParameters/maxBitrate">RTCRtpEncodingParameters.maxBitrate - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default RTCRtpEncodingParameters maxBitrate(final int maxBitrate) {
    setMaxBitrate( maxBitrate );
    return this;
  }

  /**
   * The RTCRtpEncodingParameters dictionary's scaleResolutionDownBy property can be used to specify a factor by which to reduce the size of a video track during encoding.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpEncodingParameters/scaleResolutionDownBy">RTCRtpEncodingParameters.scaleResolutionDownBy - MDN</a>
   */
  @JsProperty(
      name = "scaleResolutionDownBy"
  )
  double scaleResolutionDownBy();

  /**
   * The RTCRtpEncodingParameters dictionary's scaleResolutionDownBy property can be used to specify a factor by which to reduce the size of a video track during encoding.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpEncodingParameters/scaleResolutionDownBy">RTCRtpEncodingParameters.scaleResolutionDownBy - MDN</a>
   */
  @JsProperty
  void setScaleResolutionDownBy(double scaleResolutionDownBy);

  /**
   * The RTCRtpEncodingParameters dictionary's scaleResolutionDownBy property can be used to specify a factor by which to reduce the size of a video track during encoding.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCRtpEncodingParameters/scaleResolutionDownBy">RTCRtpEncodingParameters.scaleResolutionDownBy - MDN</a>
   */
  @JsOverlay
  @Nonnull
  default RTCRtpEncodingParameters scaleResolutionDownBy(final double scaleResolutionDownBy) {
    setScaleResolutionDownBy( scaleResolutionDownBy );
    return this;
  }

  @JsProperty(
      name = "networkPriority"
  )
  @MagicConstant(
      valuesFromClass = RTCPriorityType.class
  )
  String networkPriority();

  @JsProperty
  void setNetworkPriority(
      @MagicConstant(valuesFromClass = RTCPriorityType.class) @Nonnull String networkPriority);

  @JsOverlay
  @Nonnull
  default RTCRtpEncodingParameters networkPriority(
      @MagicConstant(valuesFromClass = RTCPriorityType.class) @Nonnull final String networkPriority) {
    setNetworkPriority( networkPriority );
    return this;
  }

  @JsProperty(
      name = "priority"
  )
  @MagicConstant(
      valuesFromClass = RTCPriorityType.class
  )
  String priority();

  @JsProperty
  void setPriority(
      @MagicConstant(valuesFromClass = RTCPriorityType.class) @Nonnull String priority);

  @JsOverlay
  @Nonnull
  default RTCRtpEncodingParameters priority(
      @MagicConstant(valuesFromClass = RTCPriorityType.class) @Nonnull final String priority) {
    setPriority( priority );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default RTCRtpEncodingParameters rid(@Nonnull final String rid) {
    setRid( rid );
    return this;
  }
}
