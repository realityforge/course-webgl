package elemental3;

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
public interface ImageBitmapRenderingContextSettings {
  @JsOverlay
  @Nonnull
  static ImageBitmapRenderingContextSettings create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "alpha"
  )
  boolean alpha();

  @JsProperty
  void setAlpha(boolean alpha);

  @JsOverlay
  @Nonnull
  default ImageBitmapRenderingContextSettings alpha(final boolean alpha) {
    setAlpha( alpha );
    return this;
  }
}
