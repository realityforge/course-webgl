package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Math"
)
public final class MathNamespace {
  private MathNamespace() {
  }

  public native double abs(@Nonnull String x);

  public native double abs(double x);
}
