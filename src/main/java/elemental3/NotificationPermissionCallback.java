package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface NotificationPermissionCallback {
  void onInvoke(
      @MagicConstant(valuesFromClass = NotificationPermission.class) @Nonnull String permission);
}
