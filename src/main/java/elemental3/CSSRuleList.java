package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * A CSSRuleList is an (indirect-modify only) array-like object containing an ordered collection of CSSRule objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CSSRuleList">CSSRuleList - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSSRuleList"
)
public class CSSRuleList {
  CSSRuleList() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @Nullable
  public native CSSRule item(int index);
}
