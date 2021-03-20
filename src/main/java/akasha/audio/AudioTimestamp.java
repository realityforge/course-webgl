package akasha.audio;

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
public interface AudioTimestamp {
  @JsOverlay
  @Nonnull
  static AudioTimestamp create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "contextTime"
  )
  double contextTime();

  @JsProperty
  void setContextTime(double contextTime);

  @JsOverlay
  @Nonnull
  default AudioTimestamp contextTime(final double contextTime) {
    setContextTime( contextTime );
    return this;
  }

  @JsProperty(
      name = "performanceTime"
  )
  double performanceTime();

  @JsProperty
  void setPerformanceTime(double performanceTime);

  @JsOverlay
  @Nonnull
  default AudioTimestamp performanceTime(final double performanceTime) {
    setPerformanceTime( performanceTime );
    return this;
  }
}
