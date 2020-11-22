package elemental3.media;

import elemental3.StringOrStringArrayUnion;
import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The ConstrainDOMString dictionary is used to specify a constraint for a property whose value is a string. It allows you to specify one or more exact string values from which one must be the parameter's value, or a set of ideal values which should be used if possible. You can also specify a single string (or an array of strings) which the user agent will do its best to match once all more stringent constraints have been applied.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ConstrainDOMStringParameters">ConstrainDOMStringParameters - MDN</a>
 * @see <a href="https://w3c.github.io/mediacapture-main/#dom-constraindomstring">The definition of 'ConstrainDOMString' in the 'Media Capture and Streams' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface ConstrainDOMStringParameters {
  @JsOverlay
  @Nonnull
  static ConstrainDOMStringParameters create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "exact"
  )
  StringOrStringArrayUnion exact();

  @JsProperty
  void setExact(@Nonnull StringOrStringArrayUnion exact);

  @JsOverlay
  default void setExact(@Nonnull final String exact) {
    setExact( StringOrStringArrayUnion.of( exact ) );
  }

  @JsOverlay
  @Nonnull
  default ConstrainDOMStringParameters exact(@Nonnull final String exact) {
    setExact( exact );
    return this;
  }

  @JsOverlay
  default void setExact(@Nonnull final JsArray<String> exact) {
    setExact( StringOrStringArrayUnion.of( exact ) );
  }

  @JsOverlay
  @Nonnull
  default ConstrainDOMStringParameters exact(@Nonnull final JsArray<String> exact) {
    setExact( exact );
    return this;
  }

  @JsOverlay
  default void setExact(@Nonnull final String... exact) {
    setExact( StringOrStringArrayUnion.of( exact ) );
  }

  @JsOverlay
  @Nonnull
  default ConstrainDOMStringParameters exact(@Nonnull final String... exact) {
    setExact( exact );
    return this;
  }

  @JsProperty(
      name = "ideal"
  )
  StringOrStringArrayUnion ideal();

  @JsProperty
  void setIdeal(@Nonnull StringOrStringArrayUnion ideal);

  @JsOverlay
  default void setIdeal(@Nonnull final String ideal) {
    setIdeal( StringOrStringArrayUnion.of( ideal ) );
  }

  @JsOverlay
  @Nonnull
  default ConstrainDOMStringParameters ideal(@Nonnull final String ideal) {
    setIdeal( ideal );
    return this;
  }

  @JsOverlay
  default void setIdeal(@Nonnull final JsArray<String> ideal) {
    setIdeal( StringOrStringArrayUnion.of( ideal ) );
  }

  @JsOverlay
  @Nonnull
  default ConstrainDOMStringParameters ideal(@Nonnull final JsArray<String> ideal) {
    setIdeal( ideal );
    return this;
  }

  @JsOverlay
  default void setIdeal(@Nonnull final String... ideal) {
    setIdeal( StringOrStringArrayUnion.of( ideal ) );
  }

  @JsOverlay
  @Nonnull
  default ConstrainDOMStringParameters ideal(@Nonnull final String... ideal) {
    setIdeal( ideal );
    return this;
  }
}
