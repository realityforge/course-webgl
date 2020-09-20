package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * This interface is a compiled XPath expression that can be evaluated on a document or specific node to return information from its DOM tree.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathExpression">XPathExpression - MDN</a>
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
   */
  @Nonnull
  public native XPathResult evaluate(@Nonnull Node contextNode, int type,
      @Nullable XPathResult result);

  /**
   * The evaluate() method of the XPathExpression interface executes an XPath expression on the given node or document and returns an XPathResult.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathExpression/evaluate">XPathExpression.evaluate - MDN</a>
   */
  @Nonnull
  public native XPathResult evaluate(@Nonnull Node contextNode, int type);

  /**
   * The evaluate() method of the XPathExpression interface executes an XPath expression on the given node or document and returns an XPathResult.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathExpression/evaluate">XPathExpression.evaluate - MDN</a>
   */
  @Nonnull
  public native XPathResult evaluate(@Nonnull Node contextNode);
}
