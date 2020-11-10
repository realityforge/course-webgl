package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The NodeIterator interface represents an iterator over the members of a list of the nodes in a subtree of the DOM. The nodes will be returned in document order.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeIterator">NodeIterator - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "NodeIterator"
)
public class NodeIterator {
  protected NodeIterator() {
  }

  /**
   * The NodeIterator.filter read-only method returns a NodeFilter object, that is an object implement an acceptNode(node) method, used to screen nodes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeIterator/filter">NodeIterator.filter - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-nodeiterator-filter">The definition of 'NodeIterator.filter' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Traversal-Range/traversal.html#Traversal-NodeIterator-filter">The definition of 'NodeIterator.filter' in the 'Document Object Model (DOM) Level 2 Traversal and Range Specification' specification.</a>
   */
  @JsProperty(
      name = "filter"
  )
  @Nullable
  public native NodeFilter filter();

  /**
   * The NodeIterator.pointerBeforeReferenceNode read-only property returns a Boolean flag that indicates whether the NodeFilter is anchored before (if this value is true) or after (if this value is false) the anchor node indicated by the NodeIterator.referenceNode property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeIterator/pointerBeforeReferenceNode">NodeIterator.pointerBeforeReferenceNode - MDN</a>
   */
  @JsProperty(
      name = "pointerBeforeReferenceNode"
  )
  public native boolean pointerBeforeReferenceNode();

  /**
   * The NodeIterator.referenceNode read-only returns the Node to which the iterator is anchored; as new nodes are inserted, the iterator remains anchored to the reference node as specified by this property.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeIterator/referenceNode">NodeIterator.referenceNode - MDN</a>
   */
  @JsProperty(
      name = "referenceNode"
  )
  @Nonnull
  public native Node referenceNode();

  /**
   * The NodeIterator.root read-only property represents the Node that is the root of what the NodeIterator traverses.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeIterator/root">NodeIterator.root - MDN</a>
   */
  @JsProperty(
      name = "root"
  )
  @Nonnull
  public native Node root();

  /**
   * The NodeIterator.whatToShow read-only property represents an unsigned integer representing a bitmask signifying what types of nodes should be returned by the NodeIterator.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeIterator/whatToShow">NodeIterator.whatToShow - MDN</a>
   */
  @JsProperty(
      name = "whatToShow"
  )
  public native int whatToShow();

  /**
   * The NodeIterator.detach() method is a no-op, kept for backward compatibility only.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeIterator/detach">NodeIterator.detach - MDN</a>
   */
  public native void detach();

  /**
   * The NodeIterator.nextNode() method returns the next node in the set represented by the NodeIterator and advances the position of the iterator within the set.  The first call to nextNode() returns the first node in the set.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeIterator/nextNode">NodeIterator.nextNode - MDN</a>
   */
  @Nullable
  public native Node nextNode();

  /**
   * The NodeIterator.previousNode() method returns the previous node in the set represented by the NodeIterator and moves the position of the iterator backwards within the set.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeIterator/previousNode">NodeIterator.previousNode - MDN</a>
   */
  @Nullable
  public native Node previousNode();
}
