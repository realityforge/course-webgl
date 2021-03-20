package akasha.svg;

import akasha.Animation;
import akasha.CSSPseudoElement;
import akasha.Element;
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
