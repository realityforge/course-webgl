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
public interface AssignedNodesOptions {
  @JsOverlay
  @Nonnull
  static AssignedNodesOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "flatten"
  )
  boolean flatten();

  @JsProperty
  void setFlatten(boolean flatten);

  @JsOverlay
  @Nonnull
  default AssignedNodesOptions flatten(final boolean flatten) {
    setFlatten( flatten );
    return this;
  }
}
