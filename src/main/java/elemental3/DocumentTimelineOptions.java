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
public interface DocumentTimelineOptions {
  @JsOverlay
  @Nonnull
  static DocumentTimelineOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "originTime"
  )
  double originTime();

  @JsProperty
  void setOriginTime(double originTime);

  @JsOverlay
  @Nonnull
  default DocumentTimelineOptions originTime(final double originTime) {
    setOriginTime( originTime );
    return this;
  }
}
