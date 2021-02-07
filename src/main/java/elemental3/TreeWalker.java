package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The TreeWalker object represents the nodes of a document subtree and a position within them.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TreeWalker">TreeWalker - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#interface-treewalker">TreeWalker - DOM</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Traversal-Range/traversal.html#Traversal-TreeWalker">TreeWalker - Document Object Model (DOM) Level 2 Traversal and Range Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TreeWalker"
)
public class TreeWalker {
  /**
   * The TreeWalker.currentNode property represents the Node on which the TreeWalker is currently pointing at.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TreeWalker/currentNode">TreeWalker.currentNode - MDN</a>
   */
  @Nonnull
  public Node currentNode;

  protected TreeWalker() {
  }

  /**
   * The TreeWalker.filter read-only property returns a NodeFilter that is the filtering object associated with the TreeWalker.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TreeWalker/filter">TreeWalker.filter - MDN</a>
   */
  @JsProperty(
      name = "filter"
  )
  @Nullable
  public native NodeFilter filter();

  /**
   * The TreeWalker.root read-only property returns the node that is the root of what the TreeWalker traverses.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TreeWalker/root">TreeWalker.root - MDN</a>
   */
  @JsProperty(
      name = "root"
  )
  @Nonnull
  public native Node root();

  /**
   * The TreeWalker.whatToShow read-only property returns an unsigned long being a bitmask made of constants describing the types of Node that must to be presented. Non-matching nodes are skipped, but their children may be included, if relevant. The possible values are:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TreeWalker/whatToShow">TreeWalker.whatToShow - MDN</a>
   */
  @JsProperty(
      name = "whatToShow"
  )
  public native int whatToShow();

  /**
   * The TreeWalker.firstChild() method moves the current Node to the first visible child of the current node, and returns the found child. It also moves the current node to this child. If no such child exists, returns null and the current node is not changed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TreeWalker/firstChild">TreeWalker.firstChild - MDN</a>
   */
  @Nullable
  public native Node firstChild();

  /**
   * The TreeWalker.lastChild() method moves the current Node to the last visible child of the current node, and returns the found child. It also moves the current node to this child. If no such child exists, returns null and the current node is not changed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TreeWalker/lastChild">TreeWalker.lastChild - MDN</a>
   */
  @Nullable
  public native Node lastChild();

  /**
   * The TreeWalker.nextNode() method moves the current Node to the next visible node in the document order, and returns the found node. It also moves the current node to this one. If no such node exists, returns null and the current node is not changed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TreeWalker/nextNode">TreeWalker.nextNode - MDN</a>
   */
  @Nullable
  public native Node nextNode();

  /**
   * The TreeWalker.nextSibling() method moves the current Node to its next sibling, if any, and returns the found sibling. If there is no such node, return null and the current node is not changed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TreeWalker/nextSibling">TreeWalker.nextSibling - MDN</a>
   */
  @Nullable
  public native Node nextSibling();

  /**
   * The TreeWalker.parentNode() method moves the current Node to the first visible ancestor node in the document order, and returns the found node. If no such node exists, or if it is above the TreeWalker's root node, returns null and the current node is not changed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TreeWalker/parentNode">TreeWalker.parentNode - MDN</a>
   */
  @Nullable
  public native Node parentNode();

  /**
   * The TreeWalker.previousNode() method moves the current Node to the previous visible node in the document order, and returns the found node. It also moves the current node to this one. If no such node exists,or if it is before that the root node defined at the object construction, returns null and the current node is not changed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TreeWalker/previousNode">TreeWalker.previousNode - MDN</a>
   */
  @Nullable
  public native Node previousNode();

  /**
   * The TreeWalker.previousSibling() method moves the current Node to its previous sibling, if any, and returns the found sibling. If there is no such node, return null and the current node is not changed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TreeWalker/previousSibling">TreeWalker.previousSibling - MDN</a>
   */
  @Nullable
  public native Node previousSibling();
}
