package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
public interface SubmitEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static SubmitEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "submitter"
  )
  @Nullable
  HTMLElement submitter();

  @JsProperty
  void setSubmitter(@Nullable HTMLElement submitter);

  @JsOverlay
  @Nonnull
  default SubmitEventInit submitter(@Nullable final HTMLElement submitter) {
    setSubmitter( submitter );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SubmitEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SubmitEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SubmitEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
