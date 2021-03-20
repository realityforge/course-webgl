package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface FormDataEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static FormDataEventInit create(@Nonnull final FormData formData) {
    return Js.<FormDataEventInit>uncheckedCast( JsPropertyMap.of() ).formData( formData );
  }

  @JsProperty(
      name = "formData"
  )
  @Nonnull
  FormData formData();

  @JsProperty
  void setFormData(@Nonnull FormData formData);

  @JsOverlay
  @Nonnull
  default FormDataEventInit formData(@Nonnull final FormData formData) {
    setFormData( formData );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default FormDataEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default FormDataEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default FormDataEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
