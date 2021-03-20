package akasha;

import akasha.lang.JsArray;
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
public interface WindowPostMessageOptions extends PostMessageOptions {
  @JsOverlay
  @Nonnull
  static WindowPostMessageOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "targetOrigin"
  )
  String targetOrigin();

  @JsProperty
  void setTargetOrigin(@Nonnull String targetOrigin);

  @JsOverlay
  @Nonnull
  default WindowPostMessageOptions targetOrigin(@Nonnull final String targetOrigin) {
    setTargetOrigin( targetOrigin );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WindowPostMessageOptions transfer(@Nonnull final JsArray<Transferable> transfer) {
    setTransfer( transfer );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WindowPostMessageOptions transfer(@Nonnull final Transferable... transfer) {
    setTransfer( transfer );
    return this;
  }
}
