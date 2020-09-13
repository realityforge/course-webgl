package elemental3;

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
public interface EventSourceInit {
  @JsOverlay
  @Nonnull
  static EventSourceInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "withCredentials"
  )
  boolean withCredentials();

  @JsProperty
  void setWithCredentials(boolean withCredentials);

  @JsOverlay
  @Nonnull
  default EventSourceInit withCredentials(final boolean withCredentials) {
    setWithCredentials( withCredentials );
    return this;
  }
}
