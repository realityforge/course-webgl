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
public interface ImageBitmapOptions {
  @JsOverlay
  @Nonnull
  static ImageBitmapOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "colorSpaceConversion"
  )
  @ColorSpaceConversion
  String colorSpaceConversion();

  @JsProperty
  void setColorSpaceConversion(@ColorSpaceConversion @Nonnull String colorSpaceConversion);

  @JsOverlay
  @Nonnull
  default ImageBitmapOptions colorSpaceConversion(
      @ColorSpaceConversion @Nonnull final String colorSpaceConversion) {
    setColorSpaceConversion( colorSpaceConversion );
    return this;
  }

  @JsProperty(
      name = "imageOrientation"
  )
  @ImageOrientation
  String imageOrientation();

  @JsProperty
  void setImageOrientation(@ImageOrientation @Nonnull String imageOrientation);

  @JsOverlay
  @Nonnull
  default ImageBitmapOptions imageOrientation(
      @ImageOrientation @Nonnull final String imageOrientation) {
    setImageOrientation( imageOrientation );
    return this;
  }

  @JsProperty(
      name = "premultiplyAlpha"
  )
  @PremultiplyAlpha
  String premultiplyAlpha();

  @JsProperty
  void setPremultiplyAlpha(@PremultiplyAlpha @Nonnull String premultiplyAlpha);

  @JsOverlay
  @Nonnull
  default ImageBitmapOptions premultiplyAlpha(
      @PremultiplyAlpha @Nonnull final String premultiplyAlpha) {
    setPremultiplyAlpha( premultiplyAlpha );
    return this;
  }

  @JsProperty(
      name = "resizeHeight"
  )
  int resizeHeight();

  @JsProperty
  void setResizeHeight(int resizeHeight);

  @JsOverlay
  @Nonnull
  default ImageBitmapOptions resizeHeight(final int resizeHeight) {
    setResizeHeight( resizeHeight );
    return this;
  }

  @JsProperty(
      name = "resizeQuality"
  )
  @ResizeQuality
  String resizeQuality();

  @JsProperty
  void setResizeQuality(@ResizeQuality @Nonnull String resizeQuality);

  @JsOverlay
  @Nonnull
  default ImageBitmapOptions resizeQuality(@ResizeQuality @Nonnull final String resizeQuality) {
    setResizeQuality( resizeQuality );
    return this;
  }

  @JsProperty(
      name = "resizeWidth"
  )
  int resizeWidth();

  @JsProperty
  void setResizeWidth(int resizeWidth);

  @JsOverlay
  @Nonnull
  default ImageBitmapOptions resizeWidth(final int resizeWidth) {
    setResizeWidth( resizeWidth );
    return this;
  }
}
