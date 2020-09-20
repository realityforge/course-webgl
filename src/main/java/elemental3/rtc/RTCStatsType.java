package elemental3.rtc;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
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
}
