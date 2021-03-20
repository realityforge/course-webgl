package akasha.clipboard;

import akasha.DataTransfer;
import akasha.EventInit;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
public interface ClipboardEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static ClipboardEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "clipboardData"
  )
  @Nullable
  DataTransfer clipboardData();

  @JsProperty
  void setClipboardData(@Nullable DataTransfer clipboardData);

  @JsOverlay
  @Nonnull
  default ClipboardEventInit clipboardData(@Nullable final DataTransfer clipboardData) {
    setClipboardData( clipboardData );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ClipboardEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ClipboardEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ClipboardEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
