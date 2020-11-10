package elemental3.media;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The ULongRange dictionary is used to define a range of permitted integer values for a property, with either or both a maximum and minimum value specified. The ConstrainULongRange dictionary is based on this, augmenting it to support exact and ideal values as well.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ULongRange">ULongRange - MDN</a>
 * @see <a href="https://w3c.github.io/mediacapture-main/#dom-ulongrange">The definition of 'ULongRange' in the 'Media Capture and Streams' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface ULongRange {
  @JsOverlay
  @Nonnull
  static ULongRange create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "max"
  )
  int max();

  @JsProperty
  void setMax(int max);

  @JsOverlay
  @Nonnull
  default ULongRange max(final int max) {
    setMax( max );
    return this;
  }

  @JsProperty(
      name = "min"
  )
  int min();

  @JsProperty
  void setMin(int min);

  @JsOverlay
  @Nonnull
  default ULongRange min(final int min) {
    setMin( min );
    return this;
  }
}
