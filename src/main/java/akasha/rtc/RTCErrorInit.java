package akasha.rtc;

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
public interface RTCErrorInit {
  @JsOverlay
  @Nonnull
  static RTCErrorInit create(@RTCErrorDetailType @Nonnull final String errorDetail) {
    return Js.<RTCErrorInit>uncheckedCast( JsPropertyMap.of() ).errorDetail( errorDetail );
  }

  @JsProperty(
      name = "errorDetail"
  )
  @RTCErrorDetailType
  @Nonnull
  String errorDetail();

  @JsProperty
  void setErrorDetail(@RTCErrorDetailType @Nonnull String errorDetail);

  @JsOverlay
  @Nonnull
  default RTCErrorInit errorDetail(@RTCErrorDetailType @Nonnull final String errorDetail) {
    setErrorDetail( errorDetail );
    return this;
  }

  @JsProperty(
      name = "receivedAlert"
  )
  int receivedAlert();

  @JsProperty
  void setReceivedAlert(int receivedAlert);

  @JsOverlay
  @Nonnull
  default RTCErrorInit receivedAlert(final int receivedAlert) {
    setReceivedAlert( receivedAlert );
    return this;
  }

  @JsProperty(
      name = "sctpCauseCode"
  )
  int sctpCauseCode();

  @JsProperty
  void setSctpCauseCode(int sctpCauseCode);

  @JsOverlay
  @Nonnull
  default RTCErrorInit sctpCauseCode(final int sctpCauseCode) {
    setSctpCauseCode( sctpCauseCode );
    return this;
  }

  @JsProperty(
      name = "sdpLineNumber"
  )
  int sdpLineNumber();

  @JsProperty
  void setSdpLineNumber(int sdpLineNumber);

  @JsOverlay
  @Nonnull
  default RTCErrorInit sdpLineNumber(final int sdpLineNumber) {
    setSdpLineNumber( sdpLineNumber );
    return this;
  }

  @JsProperty(
      name = "sentAlert"
  )
  int sentAlert();

  @JsProperty
  void setSentAlert(int sentAlert);

  @JsOverlay
  @Nonnull
  default RTCErrorInit sentAlert(final int sentAlert) {
    setSentAlert( sentAlert );
    return this;
  }

  @JsProperty(
      name = "httpRequestStatusCode"
  )
  int httpRequestStatusCode();

  @JsProperty
  void setHttpRequestStatusCode(int httpRequestStatusCode);

  @JsOverlay
  @Nonnull
  default RTCErrorInit httpRequestStatusCode(final int httpRequestStatusCode) {
    setHttpRequestStatusCode( httpRequestStatusCode );
    return this;
  }
}
