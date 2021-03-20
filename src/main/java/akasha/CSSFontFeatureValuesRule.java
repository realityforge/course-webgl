package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSFontFeatureValuesRule"
)
public class CSSFontFeatureValuesRule extends CSSRule {
  @Nonnull
  public String fontFamily;

  protected CSSFontFeatureValuesRule() {
  }

  @JsProperty(
      name = "annotation"
  )
  @Nonnull
  public native CSSFontFeatureValuesMap annotation();

  @JsProperty(
      name = "characterVariant"
  )
  @Nonnull
  public native CSSFontFeatureValuesMap characterVariant();

  @JsProperty(
      name = "ornaments"
  )
  @Nonnull
  public native CSSFontFeatureValuesMap ornaments();

  @JsProperty(
      name = "styleset"
  )
  @Nonnull
  public native CSSFontFeatureValuesMap styleset();

  @JsProperty(
      name = "stylistic"
  )
  @Nonnull
  public native CSSFontFeatureValuesMap stylistic();

  @JsProperty(
      name = "swash"
  )
  @Nonnull
  public native CSSFontFeatureValuesMap swash();
}
