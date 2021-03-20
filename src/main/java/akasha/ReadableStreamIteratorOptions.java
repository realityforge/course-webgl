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
public interface ReadableStreamIteratorOptions {
  @JsOverlay
  @Nonnull
  static ReadableStreamIteratorOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "preventCancel"
  )
  boolean preventCancel();

  @JsProperty
  void setPreventCancel(boolean preventCancel);

  @JsOverlay
  @Nonnull
  default ReadableStreamIteratorOptions preventCancel(final boolean preventCancel) {
    setPreventCancel( preventCancel );
    return this;
  }
}
