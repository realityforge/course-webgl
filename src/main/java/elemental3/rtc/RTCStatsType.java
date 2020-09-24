package elemental3.rtc;

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
  String candidate_pair = "candidate_pair";

  @Nonnull
  String certificate = "certificate";

  @Nonnull
  String codec = "codec";

  @Nonnull
  String csrc = "csrc";

  @Nonnull
  String data_channel = "data_channel";

  @Nonnull
  String ice_server = "ice_server";

  @Nonnull
  String inbound_rtp = "inbound_rtp";

  @Nonnull
  String local_candidate = "local_candidate";

  @Nonnull
  String media_source = "media_source";

  @Nonnull
  String outbound_rtp = "outbound_rtp";

  @Nonnull
  String peer_connection = "peer_connection";

  @Nonnull
  String receiver = "receiver";

  @Nonnull
  String remote_candidate = "remote_candidate";

  @Nonnull
  String remote_inbound_rtp = "remote_inbound_rtp";

  @Nonnull
  String remote_outbound_rtp = "remote_outbound_rtp";

  @Nonnull
  String sctp_transport = "sctp_transport";

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
}
