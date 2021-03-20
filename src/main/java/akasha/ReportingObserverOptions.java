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

/**
 * The ReportingObserverOptions dictionary of the Reporting API allows options to be set in the constructor when creating a ReportingObserver.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ReportingObserverOptions">ReportingObserverOptions - MDN</a>
 * @see <a href="https://w3c.github.io/reporting/#dictdef-reportingobserveroptions">ReportingObserverOptions - Reporting API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface ReportingObserverOptions {
  @JsOverlay
  @Nonnull
  static ReportingObserverOptions create() {
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
  default ReportingObserverOptions buffered(final boolean buffered) {
    setBuffered( buffered );
    return this;
  }

  @JsProperty(
      name = "types"
  )
  JsArray<String> types();

  @JsProperty
  void setTypes(@Nonnull JsArray<String> types);

  @JsOverlay
  @Nonnull
  default ReportingObserverOptions types(@Nonnull final JsArray<String> types) {
    setTypes( types );
    return this;
  }

  @JsOverlay
  default void setTypes(@Nonnull final String... types) {
    setTypes( Js.<JsArray<String>>uncheckedCast( types ) );
  }

  @JsOverlay
  @Nonnull
  default ReportingObserverOptions types(@Nonnull final String... types) {
    setTypes( types );
    return this;
  }
}
