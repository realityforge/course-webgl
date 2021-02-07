package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The DOM StaticRange interface extends AbstractRange to provide a method to specify a range of content in the DOM whose contents don't update to reflect changes which occur within the DOM tree.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StaticRange">StaticRange - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#interface-staticrange">StaticRange - DOM</a>
 * @see <a href="https://w3c.github.io/staticrange/#interface-staticrange">StaticRange - Static Range</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "StaticRange"
)
public class StaticRange extends AbstractRange {
  /**
   * The StaticRange() constructor creates a new StaticRange object representing a span of content within the DOM.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StaticRange/StaticRange">StaticRange.StaticRange - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-staticrange-staticrange">StaticRange() - DOM</a>
   */
  public StaticRange(@Nonnull final StaticRangeInit init) {
  }
}
