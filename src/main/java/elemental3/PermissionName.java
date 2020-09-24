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
  String ambient_light_sensor = "ambient_light_sensor";

  @Nonnull
  String background_sync = "background_sync";

  @Nonnull
  String bluetooth = "bluetooth";

  @Nonnull
  String camera = "camera";

  @Nonnull
  String clipboard = "clipboard";

  @Nonnull
  String device_info = "device_info";

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
  String notifications = "notifications";

  @Nonnull
  String persistent_storage = "persistent_storage";

  @Nonnull
  String push = "push";

  @Nonnull
  String speaker = "speaker";
}
