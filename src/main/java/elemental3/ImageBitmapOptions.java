package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.intellij.lang.annotations.MagicConstant;

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
  @MagicConstant(
      valuesFromClass = ColorSpaceConversion.class
  )
  String colorSpaceConversion();

  @JsProperty
  void setColorSpaceConversion(
      @MagicConstant(valuesFromClass = ColorSpaceConversion.class) @Nonnull String colorSpaceConversion);

  @JsOverlay
  @Nonnull
  default ImageBitmapOptions colorSpaceConversion(
      @MagicConstant(valuesFromClass = ColorSpaceConversion.class) @Nonnull final String colorSpaceConversion) {
    setColorSpaceConversion( colorSpaceConversion );
    return this;
  }

  @JsProperty(
      name = "imageOrientation"
  )
  @MagicConstant(
      valuesFromClass = ImageOrientation.class
  )
  String imageOrientation();

  @JsProperty
  void setImageOrientation(
      @MagicConstant(valuesFromClass = ImageOrientation.class) @Nonnull String imageOrientation);

  @JsOverlay
  @Nonnull
  default ImageBitmapOptions imageOrientation(
      @MagicConstant(valuesFromClass = ImageOrientation.class) @Nonnull final String imageOrientation) {
    setImageOrientation( imageOrientation );
    return this;
  }

  @JsProperty(
      name = "premultiplyAlpha"
  )
  @MagicConstant(
      valuesFromClass = PremultiplyAlpha.class
  )
  String premultiplyAlpha();

  @JsProperty
  void setPremultiplyAlpha(
      @MagicConstant(valuesFromClass = PremultiplyAlpha.class) @Nonnull String premultiplyAlpha);

  @JsOverlay
  @Nonnull
  default ImageBitmapOptions premultiplyAlpha(
      @MagicConstant(valuesFromClass = PremultiplyAlpha.class) @Nonnull final String premultiplyAlpha) {
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
  @MagicConstant(
      valuesFromClass = ResizeQuality.class
  )
  String resizeQuality();

  @JsProperty
  void setResizeQuality(
      @MagicConstant(valuesFromClass = ResizeQuality.class) @Nonnull String resizeQuality);

  @JsOverlay
  @Nonnull
  default ImageBitmapOptions resizeQuality(
      @MagicConstant(valuesFromClass = ResizeQuality.class) @Nonnull final String resizeQuality) {
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
