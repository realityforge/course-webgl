package elemental3.rtc;

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
public interface RTCTransportStats extends RTCStats {
  @JsOverlay
  @Nonnull
  static RTCTransportStats create(@Nonnull final String id, final double timestamp,
      @RTCStatsType @Nonnull final String type,
      @RTCDtlsTransportState @Nonnull final String dtlsState) {
    return Js.<RTCTransportStats>uncheckedCast( JsPropertyMap.of() ).id( id ).timestamp( timestamp ).type( type ).dtlsState( dtlsState );
  }

  @JsProperty(
      name = "bytesReceived"
  )
  int bytesReceived();

  @JsProperty
  void setBytesReceived(int bytesReceived);

  @JsOverlay
  @Nonnull
  default RTCTransportStats bytesReceived(final int bytesReceived) {
    setBytesReceived( bytesReceived );
    return this;
  }

  @JsProperty(
      name = "bytesSent"
  )
  int bytesSent();

  @JsProperty
  void setBytesSent(int bytesSent);

  @JsOverlay
  @Nonnull
  default RTCTransportStats bytesSent(final int bytesSent) {
    setBytesSent( bytesSent );
    return this;
  }

  @JsProperty(
      name = "dtlsCipher"
  )
  String dtlsCipher();

  @JsProperty
  void setDtlsCipher(@Nonnull String dtlsCipher);

  @JsOverlay
  @Nonnull
  default RTCTransportStats dtlsCipher(@Nonnull final String dtlsCipher) {
    setDtlsCipher( dtlsCipher );
    return this;
  }

  @JsProperty(
      name = "dtlsState"
  )
  @RTCDtlsTransportState
  @Nonnull
  String dtlsState();

  @JsProperty
  void setDtlsState(@RTCDtlsTransportState @Nonnull String dtlsState);

  @JsOverlay
  @Nonnull
  default RTCTransportStats dtlsState(@RTCDtlsTransportState @Nonnull final String dtlsState) {
    setDtlsState( dtlsState );
    return this;
  }

  @JsProperty(
      name = "iceLocalUsernameFragment"
  )
  String iceLocalUsernameFragment();

  @JsProperty
  void setIceLocalUsernameFragment(@Nonnull String iceLocalUsernameFragment);

  @JsOverlay
  @Nonnull
  default RTCTransportStats iceLocalUsernameFragment(
      @Nonnull final String iceLocalUsernameFragment) {
    setIceLocalUsernameFragment( iceLocalUsernameFragment );
    return this;
  }

  @JsProperty(
      name = "iceRole"
  )
  @RTCIceRole
  String iceRole();

  @JsProperty
  void setIceRole(@RTCIceRole @Nonnull String iceRole);

  @JsOverlay
  @Nonnull
  default RTCTransportStats iceRole(@RTCIceRole @Nonnull final String iceRole) {
    setIceRole( iceRole );
    return this;
  }

  @JsProperty(
      name = "iceState"
  )
  @RTCIceTransportState
  String iceState();

  @JsProperty
  void setIceState(@RTCIceTransportState @Nonnull String iceState);

  @JsOverlay
  @Nonnull
  default RTCTransportStats iceState(@RTCIceTransportState @Nonnull final String iceState) {
    setIceState( iceState );
    return this;
  }

  @JsProperty(
      name = "localCertificateId"
  )
  String localCertificateId();

  @JsProperty
  void setLocalCertificateId(@Nonnull String localCertificateId);

  @JsOverlay
  @Nonnull
  default RTCTransportStats localCertificateId(@Nonnull final String localCertificateId) {
    setLocalCertificateId( localCertificateId );
    return this;
  }

  @JsProperty(
      name = "packetsReceived"
  )
  int packetsReceived();

  @JsProperty
  void setPacketsReceived(int packetsReceived);

  @JsOverlay
  @Nonnull
  default RTCTransportStats packetsReceived(final int packetsReceived) {
    setPacketsReceived( packetsReceived );
    return this;
  }

  @JsProperty(
      name = "packetsSent"
  )
  int packetsSent();

  @JsProperty
  void setPacketsSent(int packetsSent);

  @JsOverlay
  @Nonnull
  default RTCTransportStats packetsSent(final int packetsSent) {
    setPacketsSent( packetsSent );
    return this;
  }

  @JsProperty(
      name = "remoteCertificateId"
  )
  String remoteCertificateId();

  @JsProperty
  void setRemoteCertificateId(@Nonnull String remoteCertificateId);

  @JsOverlay
  @Nonnull
  default RTCTransportStats remoteCertificateId(@Nonnull final String remoteCertificateId) {
    setRemoteCertificateId( remoteCertificateId );
    return this;
  }

  @JsProperty(
      name = "rtcpTransportStatsId"
  )
  String rtcpTransportStatsId();

  @JsProperty
  void setRtcpTransportStatsId(@Nonnull String rtcpTransportStatsId);

  @JsOverlay
  @Nonnull
  default RTCTransportStats rtcpTransportStatsId(@Nonnull final String rtcpTransportStatsId) {
    setRtcpTransportStatsId( rtcpTransportStatsId );
    return this;
  }

  @JsProperty(
      name = "selectedCandidatePairChanges"
  )
  int selectedCandidatePairChanges();

  @JsProperty
  void setSelectedCandidatePairChanges(int selectedCandidatePairChanges);

  @JsOverlay
  @Nonnull
  default RTCTransportStats selectedCandidatePairChanges(final int selectedCandidatePairChanges) {
    setSelectedCandidatePairChanges( selectedCandidatePairChanges );
    return this;
  }

  @JsProperty(
      name = "selectedCandidatePairId"
  )
  String selectedCandidatePairId();

  @JsProperty
  void setSelectedCandidatePairId(@Nonnull String selectedCandidatePairId);

  @JsOverlay
  @Nonnull
  default RTCTransportStats selectedCandidatePairId(@Nonnull final String selectedCandidatePairId) {
    setSelectedCandidatePairId( selectedCandidatePairId );
    return this;
  }

  @JsProperty(
      name = "srtpCipher"
  )
  String srtpCipher();

  @JsProperty
  void setSrtpCipher(@Nonnull String srtpCipher);

  @JsOverlay
  @Nonnull
  default RTCTransportStats srtpCipher(@Nonnull final String srtpCipher) {
    setSrtpCipher( srtpCipher );
    return this;
  }

  @JsProperty(
      name = "tlsGroup"
  )
  String tlsGroup();

  @JsProperty
  void setTlsGroup(@Nonnull String tlsGroup);

  @JsOverlay
  @Nonnull
  default RTCTransportStats tlsGroup(@Nonnull final String tlsGroup) {
    setTlsGroup( tlsGroup );
    return this;
  }

  @JsProperty(
      name = "tlsVersion"
  )
  String tlsVersion();

  @JsProperty
  void setTlsVersion(@Nonnull String tlsVersion);

  @JsOverlay
  @Nonnull
  default RTCTransportStats tlsVersion(@Nonnull final String tlsVersion) {
    setTlsVersion( tlsVersion );
    return this;
  }

  /**
   * The id property of the RTCStats dictionary is a string which uniquely identifies the object for which this RTCStats object provides statistics.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/id">RTCStats.id - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-id">The definition of 'RTCStats.id' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCTransportStats id(@Nonnull final String id) {
    setId( id );
    return this;
  }

  /**
   * The timestamp property of the RTCStats dictionary is a DOMHighResTimeStamp object specifying the time at which the data in the object was sampled.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/timestamp">RTCStats.timestamp - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-timestamp">The definition of 'RTCStats.timestamp' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCTransportStats timestamp(final double timestamp) {
    setTimestamp( timestamp );
    return this;
  }

  /**
   * The RTCStats dictionary's property type is a string which specifies the type of statistic represented by the object, where the permitted values are drawn from the enum type RTCStatsType.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCStats/type">RTCStats.type - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcstats-type">The definition of 'RTCStats.type' in the 'WebRTC 1.0: Real-time Communication Between Browsers' specification.</a>
   */
  @JsOverlay
  @Nonnull
  @Override
  default RTCTransportStats type(@RTCStatsType @Nonnull final String type) {
    setType( type );
    return this;
  }
}
