package elemental3.svg;

import elemental3.Animation;
import elemental3.CSSPseudoElement;
import elemental3.Element;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ShadowAnimation"
)
public class ShadowAnimation extends Animation {
  public ShadowAnimation(@Nonnull final Animation source,
      @Nonnull final CSSPseudoElement newTarget) {
  }

  public ShadowAnimation(@Nonnull final Animation source, @Nonnull final Element newTarget) {
  }

  @JsProperty(
      name = "sourceAnimation"
  )
  @Nonnull
  public native Animation sourceAnimation();
}
