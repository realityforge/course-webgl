package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Range interface represents a fragment of a document that can contain nodes and parts of text nodes.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range">Range - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#interface-range">Range - DOM</a>
 * @see <a href="https://w3c.github.io/DOM-Parsing/#extensions-to-the-range-interface">Extensions to Range - DOM Parsing and Serialization</a>
 * @see <a href="https://drafts.csswg.org/cssom-view/#extensions-to-the-range-interface">Extensions to Range - CSS Object Model (CSSOM) View Module</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Traversal-Range/ranges.html#Level-2-Range-Interface">Range - Document Object Model (DOM) Level 2 Traversal and Range Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Range"
)
public class Range extends AbstractRange {
  @JsOverlay
  public static final int END_TO_END = 2;

  @JsOverlay
  public static final int END_TO_START = 3;

  @JsOverlay
  public static final int START_TO_END = 1;

  @JsOverlay
  public static final int START_TO_START = 0;

  /**
   * The Range() constructor returns a newly created Range object whose start and end is the global Document object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/Range">Range.Range - MDN</a>
   */
  public Range() {
  }

  /**
   * The Range.commonAncestorContainer read-only property returns the deepest &mdash; or furthest down the document tree &mdash; Node that contains both boundary points of the Range. This means that if Range.startContainer and Range.endContainer both refer to the same node, this node is the common ancestor container.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/commonAncestorContainer">Range.commonAncestorContainer - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-range-commonancestorcontainer">Range.commonAncestorContainer - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Traversal-Range/ranges.html#Level-2-Range-attr-commonParent">Range.commonAncestorContainer - Document Object Model (DOM) Level 2 Traversal and Range Specification</a>
   */
  @JsProperty(
      name = "commonAncestorContainer"
  )
  @Nonnull
  public native Node commonAncestorContainer();

  /**
   * The Range.cloneContents() returns a DocumentFragment copying the objects of type Node included in the Range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/cloneContents">Range.cloneContents - MDN</a>
   */
  @Nonnull
  public native DocumentFragment cloneContents();

  /**
   * The Range.cloneRange() method returns a Range object with boundary points identical to the cloned Range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/cloneRange">Range.cloneRange - MDN</a>
   */
  @Nonnull
  public native Range cloneRange();

  /**
   * The Range.collapse() method collapses the Range to one of its boundary points.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/collapse">Range.collapse - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-range-collapse">Range.collapse() - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Traversal-Range/ranges.html#Level2-Range-method-collapse">Range.collapse() - Document Object Model (DOM) Level 2 Traversal and Range Specification</a>
   */
  public native void collapse(boolean toStart);

  /**
   * The Range.collapse() method collapses the Range to one of its boundary points.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/collapse">Range.collapse - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-range-collapse">Range.collapse() - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Traversal-Range/ranges.html#Level2-Range-method-collapse">Range.collapse() - Document Object Model (DOM) Level 2 Traversal and Range Specification</a>
   */
  public native void collapse();

  /**
   * The Range.compareBoundaryPoints() method compares the boundary points of the Range with those of another range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/compareBoundaryPoints">Range.compareBoundaryPoints - MDN</a>
   */
  public native short compareBoundaryPoints(@RangeCompareType int how, @Nonnull Range sourceRange);

  /**
   * The Range.comparePoint() method returns -1, 0, or 1 depending on whether the referenceNode is before, the same as, or after the Range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/comparePoint">Range.comparePoint - MDN</a>
   */
  public native short comparePoint(@Nonnull Node node, int offset);

  /**
   * The Range.deleteContents() method removes the contents of the Range from the Document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/deleteContents">Range.deleteContents - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-range-deletecontents">Range.deleteContents() - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Traversal-Range/ranges.html#Level2-Range-method-deleteContents">Range.deleteContents() - Document Object Model (DOM) Level 2 Traversal and Range Specification</a>
   */
  public native void deleteContents();

  /**
   * The Range.detach() method does nothing. It used to disable the Range object and enable the browser to release associated resources. The method has been kept for compatibility.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/detach">Range.detach - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-range-detach">Range.detach() - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Traversal-Range/ranges.html#Level2-Range-method-detach">Range.detach() - Document Object Model (DOM) Level 2 Traversal and Range Specification</a>
   */
  public native void detach();

  /**
   * The Range.extractContents() method moves contents of the Range from the document tree into a DocumentFragment.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/extractContents">Range.extractContents - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-range-extractcontents">Range.extractContents() - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Traversal-Range/ranges.html#Level2-Range-method-extractContents">Range.extractContents() - Document Object Model (DOM) Level 2 Traversal and Range Specification</a>
   */
  @Nonnull
  public native DocumentFragment extractContents();

  /**
   * The Range.insertNode() method inserts a node at the start of the Range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/insertNode">Range.insertNode - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-range-insertnode">Range.insertNode() - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Traversal-Range/ranges.html#Level2-Range-method-insertNode">Range.insertNode() - Document Object Model (DOM) Level 2 Traversal and Range Specification</a>
   */
  public native void insertNode(@Nonnull Node node);

  /**
   * The Range.intersectsNode() method returns a boolean indicating whether the given Node intersects the Range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/intersectsNode">Range.intersectsNode - MDN</a>
   */
  public native boolean intersectsNode(@Nonnull Node node);

  /**
   * The Range.isPointInRange() method returns a boolean indicating whether the given point is in the Range. It returns true if the point (cursor position) at offset within ReferenceNode is within this range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/isPointInRange">Range.isPointInRange - MDN</a>
   */
  public native boolean isPointInRange(@Nonnull Node node, int offset);

  /**
   * The Range.selectNode() method sets the Range to contain the Node and its contents. The parent Node of the start and end of the Range will be the same as the parent of the referenceNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/selectNode">Range.selectNode - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-range-selectnode">Range.selectNode() - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Traversal-Range/ranges.html#Level2-Range-method-selectNode">Range.selectNode() - Document Object Model (DOM) Level 2 Traversal and Range Specification</a>
   */
  public native void selectNode(@Nonnull Node node);

  /**
   * The Range.selectNodeContents() method sets the Range to contain the contents of a Node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/selectNodeContents">Range.selectNodeContents - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-range-selectnodecontents">Range.selectNodeContents() - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Traversal-Range/ranges.html#Level2-Range-method-selectNodeContents">Range.selectNodeContents() - Document Object Model (DOM) Level 2 Traversal and Range Specification</a>
   */
  public native void selectNodeContents(@Nonnull Node node);

  /**
   * The Range.setEnd() method sets the end position of a Range to be located at the given offset into the specified node x.Setting the end point above (higher in the document) than the start point will result in a collapsed range with the start and end points both set to the specified end position.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/setEnd">Range.setEnd - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-range-setend">Range.setEnd() - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Traversal-Range/ranges.html#Level2-Range-method-setEnd">Range.setEnd() - Document Object Model (DOM) Level 2 Traversal and Range Specification</a>
   */
  public native void setEnd(@Nonnull Node node, int offset);

  /**
   * The Range.setEndAfter() method sets the end position of a Range relative to another Node. The parent Node of end of the Range will be the same as that for the referenceNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/setEndAfter">Range.setEndAfter - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-range-setendafter">Range.setEndAfter() - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Traversal-Range/ranges.html#Level2-Range-method-setEndAfter">Range.setEndAfter() - Document Object Model (DOM) Level 2 Traversal and Range Specification</a>
   */
  public native void setEndAfter(@Nonnull Node node);

  /**
   * The Range.setEndBefore() method sets the end position of a Range relative to another Node. The parent Node of end of the Range will be the same as that for the referenceNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/setEndBefore">Range.setEndBefore - MDN</a>
   */
  public native void setEndBefore(@Nonnull Node node);

  /**
   * The Range.setStart() method sets the start position of a Range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/setStart">Range.setStart - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-range-setstart">Range.setStart() - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Traversal-Range/ranges.html#Level2-Range-method-setStart">Range.setStart() - Document Object Model (DOM) Level 2 Traversal and Range Specification</a>
   */
  public native void setStart(@Nonnull Node node, int offset);

  /**
   * The Range.setStartAfter() method sets the start position of a Range relative to a Node. The parent Node of the start of the Range will be the same as that for the referenceNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/setStartAfter">Range.setStartAfter - MDN</a>
   */
  public native void setStartAfter(@Nonnull Node node);

  /**
   * The Range.setStartBefore() method sets the start position of a Range relative to another Node. The parent Node of the start of the Range will be the same as that for the referenceNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/setStartBefore">Range.setStartBefore - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-range-setstartbefore">Range.setStartBefore() - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Traversal-Range/ranges.html#Level2-Range-setStartBefore">Range.setStartBefore() - Document Object Model (DOM) Level 2 Traversal and Range Specification</a>
   */
  public native void setStartBefore(@Nonnull Node node);

  /**
   * The Range.surroundContents() method moves content of the Range into a new node, placing the new node at the start of the specified range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/surroundContents">Range.surroundContents - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-range-surroundcontents">Range.surroundContents() - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Traversal-Range/ranges.html#Level2-Range-method-surroundContents">Range.surroundContents() - Document Object Model (DOM) Level 2 Traversal and Range Specification</a>
   */
  public native void surroundContents(@Nonnull Node newParent);

  /**
   * The Range.getBoundingClientRect() method returns a DOMRect object that bounds the contents of the range; this is a rectangle enclosing the union of the bounding rectangles for all the elements in the range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/getBoundingClientRect">Range.getBoundingClientRect - MDN</a>
   */
  @Nonnull
  public native DOMRect getBoundingClientRect();

  /**
   * The Range.getClientRects() method returns a list of DOMRect objects representing the area of the screen occupied by the range. This is created by aggregating the results of calls to Element.getClientRects() for all the elements in the range.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/getClientRects">Range.getClientRects - MDN</a>
   */
  @Nonnull
  public native DOMRectList getClientRects();

  /**
   * The Range.createContextualFragment() method returns a DocumentFragment by invoking the HTML fragment parsing algorithm or the XML fragment parsing algorithm with the start of the range (the parent of the selected node) as the context node. The HTML fragment parsing algorithm is used if the range belongs to a Document whose HTMLness bit is set. In the HTML case, if the context node would be html, for historical reasons the fragment parsing algorithm is invoked with body as the context instead.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Range/createContextualFragment">Range.createContextualFragment - MDN</a>
   */
  @Nonnull
  public native DocumentFragment createContextualFragment(@Nonnull String fragment);
}
