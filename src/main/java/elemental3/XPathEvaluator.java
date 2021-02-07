package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The XPathEvaluator interface allows to compile and evaluate XPath expressions.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathEvaluator">XPathEvaluator - MDN</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathEvaluator">XPathEvaluator - Document Object Model (DOM) Level 3 XPath Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XPathEvaluator"
)
public class XPathEvaluator {
  public XPathEvaluator() {
  }

  /**
   * This method compiles an XPathExpression which can then be used for (repeated) evaluations of the XPath expression.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathEvaluator/createExpression">XPathEvaluator.createExpression - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathEvaluator-createExpression">XPathEvaluator.createExpression() - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @Nonnull
  public native XPathExpression createExpression(@Nonnull String expression,
      @Nullable XPathNSResolver resolver);

  /**
   * This method compiles an XPathExpression which can then be used for (repeated) evaluations of the XPath expression.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathEvaluator/createExpression">XPathEvaluator.createExpression - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathEvaluator-createExpression">XPathEvaluator.createExpression() - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @Nonnull
  public native XPathExpression createExpression(@Nonnull String expression);

  /**
   * This method adapts any DOM node to resolve namespaces so that an XPath expression can be easily evaluated relative to the context of the node where it appeared within the document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathEvaluator/createNSResolver">XPathEvaluator.createNSResolver - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathEvaluator-createNSResolver">XPathEvaluator.createNSResolver() - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @Nonnull
  public native XPathNSResolver createNSResolver(@Nonnull Node nodeResolver);

  /**
   * The evaluate() method of the XPathEvaluator interface executes an XPath expression on the given node or document and returns an XPathResult.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathEvaluator/evaluate">XPathEvaluator.evaluate - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathEvaluator-evaluate">XPathEvaluator.evaluate() - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @Nonnull
  public native XPathResult evaluate(@Nonnull String expression, @Nonnull Node contextNode,
      @Nullable XPathNSResolver resolver, int type, @Nullable XPathResult result);

  /**
   * The evaluate() method of the XPathEvaluator interface executes an XPath expression on the given node or document and returns an XPathResult.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathEvaluator/evaluate">XPathEvaluator.evaluate - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathEvaluator-evaluate">XPathEvaluator.evaluate() - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @Nonnull
  public native XPathResult evaluate(@Nonnull String expression, @Nonnull Node contextNode,
      @Nullable XPathNSResolver resolver, int type);

  /**
   * The evaluate() method of the XPathEvaluator interface executes an XPath expression on the given node or document and returns an XPathResult.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathEvaluator/evaluate">XPathEvaluator.evaluate - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathEvaluator-evaluate">XPathEvaluator.evaluate() - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @Nonnull
  public native XPathResult evaluate(@Nonnull String expression, @Nonnull Node contextNode,
      @Nullable XPathNSResolver resolver);

  /**
   * The evaluate() method of the XPathEvaluator interface executes an XPath expression on the given node or document and returns an XPathResult.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XPathEvaluator/evaluate">XPathEvaluator.evaluate - MDN</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-XPath/xpath.html#XPathEvaluator-evaluate">XPathEvaluator.evaluate() - Document Object Model (DOM) Level 3 XPath Specification</a>
   */
  @Nonnull
  public native XPathResult evaluate(@Nonnull String expression, @Nonnull Node contextNode);
}
