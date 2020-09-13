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
public interface ProgressEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static ProgressEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "lengthComputable"
  )
  boolean lengthComputable();

  @JsProperty
  void setLengthComputable(boolean lengthComputable);

  @JsOverlay
  @Nonnull
  default ProgressEventInit lengthComputable(final boolean lengthComputable) {
    setLengthComputable( lengthComputable );
    return this;
  }

  @JsProperty(
      name = "loaded"
  )
  int loaded();

  @JsProperty
  void setLoaded(int loaded);

  @JsOverlay
  @Nonnull
  default ProgressEventInit loaded(final int loaded) {
    setLoaded( loaded );
    return this;
  }

  @JsProperty(
      name = "total"
  )
  int total();

  @JsProperty
  void setTotal(int total);

  @JsOverlay
  @Nonnull
  default ProgressEventInit total(final int total) {
    setTotal( total );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ProgressEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ProgressEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ProgressEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
