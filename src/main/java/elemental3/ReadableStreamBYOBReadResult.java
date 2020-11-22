package elemental3;

import elemental3.core.ArrayBufferView;
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
    name = "?"
)
public interface ReadableStreamBYOBReadResult {
  @JsOverlay
  @Nonnull
  static ReadableStreamBYOBReadResult create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "value"
  )
  ArrayBufferView value();

  @JsProperty
  void setValue(@Nonnull ArrayBufferView value);

  @JsOverlay
  @Nonnull
  default ReadableStreamBYOBReadResult value(@Nonnull final ArrayBufferView value) {
    setValue( value );
    return this;
  }

  @JsProperty(
      name = "done"
  )
  boolean done();

  @JsProperty
  void setDone(boolean done);

  @JsOverlay
  @Nonnull
  default ReadableStreamBYOBReadResult done(final boolean done) {
    setDone( done );
    return this;
  }
}
