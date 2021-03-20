package akasha;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The XPathNSResolver interface permits prefix strings in an XPath expression to be properly bound to namespace URI strings.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathNSResolver">XPathNSResolver - MDN</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathNSResolver">XPathNSResolver - Document Object Model (DOM) Level 3 XPath Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
@FunctionalInterface
public interface XPathNSResolver {
  /**
   * The lookupNamespaceURI method looks up the namespace URI associated to the given namespace prefix within an XPath expression evaluated by the XPathEvaluator interface.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathNSResolver/lookupNamespaceURI">XPathNSResolver.lookupNamespaceURI - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathNSResolver-lookupNamespaceURI">XPathNSResolver.lookupNamespaceURI() - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @Nullable
  String lookupNamespaceURI(@Nullable String prefix);
}
