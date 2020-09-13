package elemental3;

import elemental2.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The Web Audio API's AudioParam interface represents an audio-related parameter, usually a parameter of an AudioNode (such as GainNode.gain).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioParam">AudioParam - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioParam"
)
public class AudioParam {
  @Nonnull
  @MagicConstant(
      valuesFromClass = AutomationRate.class
  )
  public String automationRate;

  /**
   * The Web Audio API's AudioParam interface property value gets or sets the value of this AudioParam at the current time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioParam/value">AudioParam.value - MDN</a>
   */
  public float value;

  AudioParam() {
  }

  /**
   * The defaultValue read-only property of the AudioParam interface represents the initial value of the attributes as defined by the specific AudioNode creating the AudioParam.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioParam/defaultValue">AudioParam.defaultValue - MDN</a>
   */
  @JsProperty(
      name = "defaultValue"
  )
  public native float defaultValue();

  /**
   * The maxValue read-only property of the AudioParam interface represents the maximum possible value for the parameter's nominal (effective) range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioParam/maxValue">AudioParam.maxValue - MDN</a>
   */
  @JsProperty(
      name = "maxValue"
  )
  public native float maxValue();

  /**
   * The minValue read-only property of the AudioParam interface represents the minimum possible value for the parameter's nominal (effective) range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioParam/minValue">AudioParam.minValue - MDN</a>
   */
  @JsProperty(
      name = "minValue"
  )
  public native float minValue();

  /**
   * The cancelAndHoldAtTime() property of the AudioParam interface cancels all scheduled future changes to the AudioParam but holds its value at a given time until further changes are made using other methods.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioParam/cancelAndHoldAtTime">AudioParam.cancelAndHoldAtTime - MDN</a>
   */
  @Nonnull
  public native AudioParam cancelAndHoldAtTime(double cancelTime);

  /**
   * A reference to this AudioParam object. In some older implementations this method returns void.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioParam/cancelScheduledValues">AudioParam.cancelScheduledValues - MDN</a>
   */
  @Nonnull
  public native AudioParam cancelScheduledValues(double cancelTime);

  /**
   * A reference to this AudioParam object. In some browsers older implementations of this interface return void.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioParam/exponentialRampToValueAtTime">AudioParam.exponentialRampToValueAtTime - MDN</a>
   */
  @Nonnull
  public native AudioParam exponentialRampToValueAtTime(float value, double endTime);

  /**
   * A reference to this AudioParam object. In some browsers older implementations of this interface return void.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioParam/linearRampToValueAtTime">AudioParam.linearRampToValueAtTime - MDN</a>
   */
  @Nonnull
  public native AudioParam linearRampToValueAtTime(float value, double endTime);

  /**
   * The setTargetAtTime() method of the AudioParam interface schedules the start of a gradual change to the AudioParam value. This is useful for decay or release portions of ADSR envelopes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioParam/setTargetAtTime">AudioParam.setTargetAtTime - MDN</a>
   */
  @Nonnull
  public native AudioParam setTargetAtTime(float target, double startTime, float timeConstant);

  /**
   * The setValueAtTime() method of the AudioParam interface schedules an instant change to the AudioParam value at a precise time, as measured against AudioContext.currentTime. The new value is given in the value parameter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioParam/setValueAtTime">AudioParam.setValueAtTime - MDN</a>
   */
  @Nonnull
  public native AudioParam setValueAtTime(float value, double startTime);

  /**
   * The setValueCurveAtTime() method of the AudioParam interface schedules the parameter's value to change following a curve defined by a list of values.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioParam/setValueCurveAtTime">AudioParam.setValueCurveAtTime - MDN</a>
   */
  @Nonnull
  public native AudioParam setValueCurveAtTime(@Nonnull JsArray<Double> values, double startTime,
      double duration);

  /**
   * The setValueCurveAtTime() method of the AudioParam interface schedules the parameter's value to change following a curve defined by a list of values.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioParam/setValueCurveAtTime">AudioParam.setValueCurveAtTime - MDN</a>
   */
  @Nonnull
  public native AudioParam setValueCurveAtTime(@Nonnull Double[] values, double startTime,
      double duration);
}
