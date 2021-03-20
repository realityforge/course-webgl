package akasha.media;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The DoubleRange dictionary is used to define a range of permitted double-precision floating-point values for a property, with either or both a maximum and minimum value specified. The ConstrainDouble dictionary is based on this, augmenting it to support exact and ideal values as well.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DoubleRange">DoubleRange - MDN</a>
 * @see <a href="https://w3c.github.io/mediacapture-main/#dom-doublerange">DoubleRange - Media Capture and Streams</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface DoubleRange {
  @JsOverlay
  @Nonnull
  static DoubleRange create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "max"
  )
  double max();

  @JsProperty
  void setMax(double max);

  @JsOverlay
  @Nonnull
  default DoubleRange max(final double max) {
    setMax( max );
    return this;
  }

  @JsProperty(
      name = "min"
  )
  double min();

  @JsProperty
  void setMin(double min);

  @JsOverlay
  @Nonnull
  default DoubleRange min(final double min) {
    setMin( min );
    return this;
  }
}
