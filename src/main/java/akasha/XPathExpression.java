package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * This interface is a compiled XPath expression that can be evaluated on a document or specific node to return information from its DOM tree.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathExpression">XPathExpression - MDN</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathExpression">XPathExpression - Document Object Model (DOM) Level 3 XPath Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XPathExpression"
)
public class XPathExpression {
  protected XPathExpression() {
  }

  /**
   * The evaluate() method of the XPathExpression interface executes an XPath expression on the given node or document and returns an XPathResult.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathExpression/evaluate">XPathExpression.evaluate - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathExpression-evaluate">XPathExpression.evaluate() - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @Nonnull
  public native XPathResult evaluate(@Nonnull Node contextNode, int type,
      @Nullable XPathResult result);

  /**
   * The evaluate() method of the XPathExpression interface executes an XPath expression on the given node or document and returns an XPathResult.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathExpression/evaluate">XPathExpression.evaluate - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathExpression-evaluate">XPathExpression.evaluate() - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @Nonnull
  public native XPathResult evaluate(@Nonnull Node contextNode, int type);

  /**
   * The evaluate() method of the XPathExpression interface executes an XPath expression on the given node or document and returns an XPathResult.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathExpression/evaluate">XPathExpression.evaluate - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathExpression-evaluate">XPathExpression.evaluate() - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @Nonnull
  public native XPathResult evaluate(@Nonnull Node contextNode);
}
