package elemental3;

import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface ReadableStreamDefaultReadResult {
  @JsOverlay
  @Nonnull
  static ReadableStreamDefaultReadResult create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "value"
  )
  @Nullable
  Any value();

  @JsProperty
  void setValue(@DoNotAutobox @Nullable Object value);

  @JsOverlay
  @Nonnull
  default ReadableStreamDefaultReadResult value(@DoNotAutobox @Nullable final Object value) {
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
  default ReadableStreamDefaultReadResult done(final boolean done) {
    setDone( done );
    return this;
  }
}
