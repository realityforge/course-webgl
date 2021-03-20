package akasha.media;

import akasha.Blob;
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
public interface BlobEventInit {
  @JsOverlay
  @Nonnull
  static BlobEventInit create(@Nonnull final Blob data) {
    return Js.<BlobEventInit>uncheckedCast( JsPropertyMap.of() ).data( data );
  }

  @JsProperty(
      name = "data"
  )
  @Nonnull
  Blob data();

  @JsProperty
  void setData(@Nonnull Blob data);

  @JsOverlay
  @Nonnull
  default BlobEventInit data(@Nonnull final Blob data) {
    setData( data );
    return this;
  }

  @JsProperty(
      name = "timecode"
  )
  double timecode();

  @JsProperty
  void setTimecode(double timecode);

  @JsOverlay
  @Nonnull
  default BlobEventInit timecode(final double timecode) {
    setTimecode( timecode );
    return this;
  }
}
