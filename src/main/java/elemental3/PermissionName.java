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

  final class Validator {
    private Validator() {
    }

    @PermissionName
    public static String cast(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return PermissionName.accelerometer.equals( value ) || PermissionName.ambient_light_sensor.equals( value ) || PermissionName.background_fetch.equals( value ) || PermissionName.background_sync.equals( value ) || PermissionName.bluetooth.equals( value ) || PermissionName.camera.equals( value ) || PermissionName.clipboard_read.equals( value ) || PermissionName.clipboard_write.equals( value ) || PermissionName.device_info.equals( value ) || PermissionName.display_capture.equals( value ) || PermissionName.geolocation.equals( value ) || PermissionName.gyroscope.equals( value ) || PermissionName.magnetometer.equals( value ) || PermissionName.microphone.equals( value ) || PermissionName.midi.equals( value ) || PermissionName.nfc.equals( value ) || PermissionName.notifications.equals( value ) || PermissionName.persistent_storage.equals( value ) || PermissionName.push.equals( value ) || PermissionName.speaker.equals( value );
    }
  }
}
