package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The AbstractRange abstract interface is the base class upon which all DOM range types are defined. A range is an object that indicates the start and end points of a section of content within the document.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AbstractRange">AbstractRange - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#abstractrange">AbstractRange - DOM</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AbstractRange"
)
public class AbstractRange {
  protected AbstractRange() {
  }

  /**
   * The collapsed read-only property of the AbstractRange interface returns true if the range's start position and end position are the same.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AbstractRange/collapsed">AbstractRange.collapsed - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-range-collapsed">collapsed - DOM</a>
   * @see <a href="https://w3c.github.io/staticrange/#dom-AbstractRange-collapsed">collapsed - Static Range</a>
   */
  @JsProperty(
      name = "collapsed"
  )
  public native boolean collapsed();

  /**
   * The endContainer property of the AbstractRange interface returns the Node in which the end of the range is located.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AbstractRange/endContainer">AbstractRange.endContainer - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-range-endcontainer">endContainer - DOM</a>
   * @see <a href="https://w3c.github.io/staticrange/#dom-AbstractRange-endcontainer">endContainer - Static Range</a>
   */
  @JsProperty(
      name = "endContainer"
  )
  @Nonnull
  public native Node endContainer();

  /**
   * The endOffset property of the AbstractRange interface returns the offset into the end node of the range's end position.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AbstractRange/endOffset">AbstractRange.endOffset - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-range-endoffset">endOffset - DOM</a>
   * @see <a href="https://w3c.github.io/staticrange/#dom-AbstractRange-endoffset">endOffset - Static Range</a>
   */
  @JsProperty(
      name = "endOffset"
  )
  public native int endOffset();

  /**
   * The read-only startContainer property of the AbstractRange interface returns the start Node for the range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AbstractRange/startContainer">AbstractRange.startContainer - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-range-startcontainer">startContainer  - DOM</a>
   * @see <a href="https://w3c.github.io/staticrange/#dom-AbstractRange-startcontainer">startContainer - Static Range</a>
   */
  @JsProperty(
      name = "startContainer"
  )
  @Nonnull
  public native Node startContainer();

  /**
   * The read-only startOffset property of the AbstractRange interface returns the offset into the start node of the range's start position.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AbstractRange/startOffset">AbstractRange.startOffset - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-range-startoffset">startOffset - DOM</a>
   * @see <a href="https://w3c.github.io/staticrange/#dom-AbstractRange-startoffset">startOffset - Static Range</a>
   */
  @JsProperty(
      name = "startOffset"
  )
  public native int startOffset();
}
