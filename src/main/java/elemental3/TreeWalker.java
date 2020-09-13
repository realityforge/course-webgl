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

  TreeWalker() {
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

  @Nullable
  public native Node firstChild();

  @Nullable
  public native Node lastChild();

  @Nullable
  public native Node nextNode();

  @Nullable
  public native Node nextSibling();

  @Nullable
  public native Node parentNode();

  @Nullable
  public native Node previousNode();

  @Nullable
  public native Node previousSibling();
}
