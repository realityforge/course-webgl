package elemental3.notifications;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface NotificationPermissionCallback {
  void onInvoke(@NotificationPermission @Nonnull String permission);
}
