package akasha.perf;

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
public interface PerformanceObserverInit {
  @JsOverlay
  @Nonnull
  static PerformanceObserverInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "buffered"
  )
  boolean buffered();

  @JsProperty
  void setBuffered(boolean buffered);

  @JsOverlay
  @Nonnull
  default PerformanceObserverInit buffered(final boolean buffered) {
    setBuffered( buffered );
    return this;
  }

  @JsProperty(
      name = "entryTypes"
  )
  JsArray<String> entryTypes();

  @JsProperty
  void setEntryTypes(@Nonnull JsArray<String> entryTypes);

  @JsOverlay
  @Nonnull
  default PerformanceObserverInit entryTypes(@Nonnull final JsArray<String> entryTypes) {
    setEntryTypes( entryTypes );
    return this;
  }

  @JsOverlay
  default void setEntryTypes(@Nonnull final String... entryTypes) {
    setEntryTypes( Js.<JsArray<String>>uncheckedCast( entryTypes ) );
  }

  @JsOverlay
  @Nonnull
  default PerformanceObserverInit entryTypes(@Nonnull final String... entryTypes) {
    setEntryTypes( entryTypes );
    return this;
  }

  @JsProperty(
      name = "type"
  )
  String type();

  @JsProperty
  void setType(@Nonnull String type);

  @JsOverlay
  @Nonnull
  default PerformanceObserverInit type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
