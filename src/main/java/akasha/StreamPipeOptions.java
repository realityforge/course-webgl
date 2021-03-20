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
public interface StreamPipeOptions {
  @JsOverlay
  @Nonnull
  static StreamPipeOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "preventClose"
  )
  boolean preventClose();

  @JsProperty
  void setPreventClose(boolean preventClose);

  @JsOverlay
  @Nonnull
  default StreamPipeOptions preventClose(final boolean preventClose) {
    setPreventClose( preventClose );
    return this;
  }

  @JsProperty(
      name = "preventAbort"
  )
  boolean preventAbort();

  @JsProperty
  void setPreventAbort(boolean preventAbort);

  @JsOverlay
  @Nonnull
  default StreamPipeOptions preventAbort(final boolean preventAbort) {
    setPreventAbort( preventAbort );
    return this;
  }

  @JsProperty(
      name = "preventCancel"
  )
  boolean preventCancel();

  @JsProperty
  void setPreventCancel(boolean preventCancel);

  @JsOverlay
  @Nonnull
  default StreamPipeOptions preventCancel(final boolean preventCancel) {
    setPreventCancel( preventCancel );
    return this;
  }

  @JsProperty(
      name = "signal"
  )
  AbortSignal signal();

  @JsProperty
  void setSignal(@Nonnull AbortSignal signal);

  @JsOverlay
  @Nonnull
  default StreamPipeOptions signal(@Nonnull final AbortSignal signal) {
    setSignal( signal );
    return this;
  }
}
