package elemental3;

import javax.annotation.Generated;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The CDATASection interface represents a CDATA section that can be used within XML to include extended portions of unescaped text. The symbols  and &amp; don&rsquo;t need escaping as they normally do when inside a CDATA section.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CDATASection">CDATASection - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CDATASection"
)
public class CDATASection extends Text {
  protected CDATASection() {
  }
}
