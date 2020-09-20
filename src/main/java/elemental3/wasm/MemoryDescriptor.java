package elemental3.wasm;

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
public interface MemoryDescriptor {
  @JsOverlay
  @Nonnull
  static MemoryDescriptor create(final int initial) {
    return Js.<MemoryDescriptor>uncheckedCast( JsPropertyMap.of() ).initial( initial );
  }

  @JsProperty(
      name = "initial"
  )
  int initial();

  @JsProperty
  void setInitial(int initial);

  @JsOverlay
  @Nonnull
  default MemoryDescriptor initial(final int initial) {
    setInitial( initial );
    return this;
  }

  @JsProperty(
      name = "maximum"
  )
  int maximum();

  @JsProperty
  void setMaximum(int maximum);

  @JsOverlay
  @Nonnull
  default MemoryDescriptor maximum(final int maximum) {
    setMaximum( maximum );
    return this;
  }
}
