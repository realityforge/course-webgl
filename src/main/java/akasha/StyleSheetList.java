package akasha;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The StyleSheetList interface represents a list of StyleSheet.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StyleSheetList">StyleSheetList - MDN</a>
 * @see <a href="https://drafts.csswg.org/cssom/#the-stylesheetlist-interface">CSSStyleSheetList - CSS Object Model (CSSOM)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "StyleSheetList"
)
public class StyleSheetList {
  protected StyleSheetList() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @Nullable
  public native CSSStyleSheet item(int index);
}
