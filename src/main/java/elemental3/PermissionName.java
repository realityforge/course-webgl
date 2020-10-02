package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = PermissionName.class
)
public @interface PermissionName {
  @Nonnull
  String accelerometer = "accelerometer";

  @Nonnull
  String ambient_light_sensor = "ambient-light-sensor";

  @Nonnull
  String background_fetch = "background-fetch";

  @Nonnull
  String background_sync = "background-sync";

  @Nonnull
  String bluetooth = "bluetooth";

  @Nonnull
  String camera = "camera";

  @Nonnull
  String clipboard_read = "clipboard-read";

  @Nonnull
  String clipboard_write = "clipboard-write";

  @Nonnull
  String device_info = "device-info";

  @Nonnull
  String display_capture = "display-capture";

  @Nonnull
  String geolocation = "geolocation";

  @Nonnull
  String gyroscope = "gyroscope";

  @Nonnull
  String magnetometer = "magnetometer";

  @Nonnull
  String microphone = "microphone";

  @Nonnull
  String midi = "midi";

  @Nonnull
  String nfc = "nfc";

  @Nonnull
  String notifications = "notifications";

  @Nonnull
  String persistent_storage = "persistent-storage";

  @Nonnull
  String push = "push";

  @Nonnull
  String speaker = "speaker";
}
