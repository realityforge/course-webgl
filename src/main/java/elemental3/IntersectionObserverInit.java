package elemental3;

import elemental2.core.JsArray;
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
public interface IntersectionObserverInit {
  @JsOverlay
  @Nonnull
  static IntersectionObserverInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "root"
  )
  @Nullable
  Element root();

  @JsProperty
  void setRoot(@Nullable Element root);

  @JsOverlay
  @Nonnull
  default IntersectionObserverInit root(@Nullable final Element root) {
    setRoot( root );
    return this;
  }

  @JsProperty(
      name = "rootMargin"
  )
  String rootMargin();

  @JsProperty
  void setRootMargin(@Nonnull String rootMargin);

  @JsOverlay
  @Nonnull
  default IntersectionObserverInit rootMargin(@Nonnull final String rootMargin) {
    setRootMargin( rootMargin );
    return this;
  }

  @JsProperty(
      name = "threshold"
  )
  DoubleOrDoubleArrayUnion threshold();

  @JsProperty
  void setThreshold(@Nonnull DoubleOrDoubleArrayUnion threshold);

  @JsOverlay
  default void setThreshold(final double threshold) {
    setThreshold( DoubleOrDoubleArrayUnion.of( threshold ) );
  }

  @JsOverlay
  @Nonnull
  default IntersectionObserverInit threshold(final double threshold) {
    setThreshold( threshold );
    return this;
  }

  @JsOverlay
  default void setThreshold(@Nonnull final JsArray<Double> threshold) {
    setThreshold( DoubleOrDoubleArrayUnion.of( threshold ) );
  }

  @JsOverlay
  @Nonnull
  default IntersectionObserverInit threshold(@Nonnull final JsArray<Double> threshold) {
    setThreshold( threshold );
    return this;
  }

  @JsOverlay
  default void setThreshold(@Nonnull final Double... threshold) {
    setThreshold( DoubleOrDoubleArrayUnion.of( threshold ) );
  }

  @JsOverlay
  @Nonnull
  default IntersectionObserverInit threshold(@Nonnull final Double... threshold) {
    setThreshold( threshold );
    return this;
  }
}
