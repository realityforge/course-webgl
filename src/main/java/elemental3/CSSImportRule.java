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
    name = "CSSImportRule"
)
public class CSSImportRule extends CSSRule {
  protected CSSImportRule() {
  }

  @JsProperty(
      name = "href"
  )
  @Nonnull
  public native String href();

  @JsProperty(
      name = "media"
  )
  @Nonnull
  public native MediaList media();

  @JsProperty(
      name = "styleSheet"
  )
  @Nonnull
  public native CSSStyleSheet styleSheet();
}
