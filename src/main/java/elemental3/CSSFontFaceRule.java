package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSFontFaceRule"
)
public class CSSFontFaceRule extends CSSRule {
  protected CSSFontFaceRule() {
  }

  @JsProperty(
      name = "style"
  )
  @Nonnull
  public native CSSStyleDeclaration style();
}
