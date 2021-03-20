package akasha.rtc;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RTCStatsType.class
)
public @interface RTCStatsType {
  @Nonnull
  String candidate_pair = "candidate-pair";

  @Nonnull
  String certificate = "certificate";

  @Nonnull
  String codec = "codec";

  @Nonnull
  String csrc = "csrc";

  @Nonnull
  String data_channel = "data-channel";

  @Nonnull
  String ice_server = "ice-server";

  @Nonnull
  String inbound_rtp = "inbound-rtp";

  @Nonnull
  String local_candidate = "local-candidate";

  @Nonnull
  String media_source = "media-source";

  @Nonnull
  String outbound_rtp = "outbound-rtp";

  @Nonnull
  String peer_connection = "peer-connection";

  @Nonnull
  String receiver = "receiver";

  @Nonnull
  String remote_candidate = "remote-candidate";

  @Nonnull
  String remote_inbound_rtp = "remote-inbound-rtp";

  @Nonnull
  String remote_outbound_rtp = "remote-outbound-rtp";

  @Nonnull
  String sctp_transport = "sctp-transport";

  @Nonnull
  String sender = "sender";

  @Nonnull
  String stream = "stream";

  @Nonnull
  String track = "track";

  @Nonnull
  String transceiver = "transceiver";

  @Nonnull
  String transport = "transport";

  final class Util {
    private Util() {
    }

    @RTCStatsType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RTCStatsType.candidate_pair.equals( value ) || RTCStatsType.certificate.equals( value ) || RTCStatsType.codec.equals( value ) || RTCStatsType.csrc.equals( value ) || RTCStatsType.data_channel.equals( value ) || RTCStatsType.ice_server.equals( value ) || RTCStatsType.inbound_rtp.equals( value ) || RTCStatsType.local_candidate.equals( value ) || RTCStatsType.media_source.equals( value ) || RTCStatsType.outbound_rtp.equals( value ) || RTCStatsType.peer_connection.equals( value ) || RTCStatsType.receiver.equals( value ) || RTCStatsType.remote_candidate.equals( value ) || RTCStatsType.remote_inbound_rtp.equals( value ) || RTCStatsType.remote_outbound_rtp.equals( value ) || RTCStatsType.sctp_transport.equals( value ) || RTCStatsType.sender.equals( value ) || RTCStatsType.stream.equals( value ) || RTCStatsType.track.equals( value ) || RTCStatsType.transceiver.equals( value ) || RTCStatsType.transport.equals( value );
    }
  }
}
