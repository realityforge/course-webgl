package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * PeriodicWave has no inputs or outputs; it is used to define custom oscillators when calling OscillatorNode.setPeriodicWave(). The PeriodicWave itself is created/returned by AudioContext.createPeriodicWave().
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PeriodicWave">PeriodicWave - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "PeriodicWave"
)
public class PeriodicWave {
  /**
   * The PeriodicWave() constructor of the Web Audio API creates a new PeriodicWave object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PeriodicWave/PeriodicWave">PeriodicWave.PeriodicWave - MDN</a>
   */
  public PeriodicWave(@Nonnull final BaseAudioContext context,
      @Nonnull final PeriodicWaveOptions options) {
  }

  /**
   * The PeriodicWave() constructor of the Web Audio API creates a new PeriodicWave object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/PeriodicWave/PeriodicWave">PeriodicWave.PeriodicWave - MDN</a>
   */
  public PeriodicWave(@Nonnull final BaseAudioContext context) {
  }
}
