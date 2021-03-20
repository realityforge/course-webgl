package akasha.bluetooth;

import akasha.Event;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ValueEvent"
)
public class ValueEvent extends Event {
  public ValueEvent(@Nonnull final String type, @Nonnull final ValueEventInit initDict) {
    super( null );
  }

  public ValueEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "value"
  )
  @Nullable
  public native Any value();
}
