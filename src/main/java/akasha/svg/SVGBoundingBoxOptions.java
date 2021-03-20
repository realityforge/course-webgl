package akasha.svg;

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
public interface SVGBoundingBoxOptions {
  @JsOverlay
  @Nonnull
  static SVGBoundingBoxOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "clipped"
  )
  boolean clipped();

  @JsProperty
  void setClipped(boolean clipped);

  @JsOverlay
  @Nonnull
  default SVGBoundingBoxOptions clipped(final boolean clipped) {
    setClipped( clipped );
    return this;
  }

  @JsProperty(
      name = "fill"
  )
  boolean fill();

  @JsProperty
  void setFill(boolean fill);

  @JsOverlay
  @Nonnull
  default SVGBoundingBoxOptions fill(final boolean fill) {
    setFill( fill );
    return this;
  }

  @JsProperty(
      name = "markers"
  )
  boolean markers();

  @JsProperty
  void setMarkers(boolean markers);

  @JsOverlay
  @Nonnull
  default SVGBoundingBoxOptions markers(final boolean markers) {
    setMarkers( markers );
    return this;
  }

  @JsProperty(
      name = "stroke"
  )
  boolean stroke();

  @JsProperty
  void setStroke(boolean stroke);

  @JsOverlay
  @Nonnull
  default SVGBoundingBoxOptions stroke(final boolean stroke) {
    setStroke( stroke );
    return this;
  }
}
