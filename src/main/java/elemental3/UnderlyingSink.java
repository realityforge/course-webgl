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
public interface UnderlyingSink {
  @JsOverlay
  @Nonnull
  static UnderlyingSink create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "start"
  )
  UnderlyingSinkStartCallback start();

  @JsProperty
  void setStart(@Nonnull UnderlyingSinkStartCallback start);

  @JsOverlay
  @Nonnull
  default UnderlyingSink start(@Nonnull final UnderlyingSinkStartCallback start) {
    setStart( start );
    return this;
  }

  @JsProperty(
      name = "write"
  )
  UnderlyingSinkWriteCallback write();

  @JsProperty
  void setWrite(@Nonnull UnderlyingSinkWriteCallback write);

  @JsOverlay
  @Nonnull
  default UnderlyingSink write(@Nonnull final UnderlyingSinkWriteCallback write) {
    setWrite( write );
    return this;
  }

  @JsProperty(
      name = "close"
  )
  UnderlyingSinkCloseCallback close();

  @JsProperty
  void setClose(@Nonnull UnderlyingSinkCloseCallback close);

  @JsOverlay
  @Nonnull
  default UnderlyingSink close(@Nonnull final UnderlyingSinkCloseCallback close) {
    setClose( close );
    return this;
  }

  @JsProperty(
      name = "abort"
  )
  UnderlyingSinkAbortCallback abort();

  @JsProperty
  void setAbort(@Nonnull UnderlyingSinkAbortCallback abort);

  @JsOverlay
  @Nonnull
  default UnderlyingSink abort(@Nonnull final UnderlyingSinkAbortCallback abort) {
    setAbort( abort );
    return this;
  }

  @JsProperty(
      name = "type"
  )
  @Nullable
  Any type();

  @JsProperty
  void setType(@DoNotAutobox @Nullable Object type);

  @JsOverlay
  @Nonnull
  default UnderlyingSink type(@DoNotAutobox @Nullable final Object type) {
    setType( type );
    return this;
  }
}
