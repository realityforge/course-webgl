package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The DocumentFragment interface represents a minimal document object that has no parent. It is used as a lightweight version of Document that stores a segment of a document structure comprised of nodes just like a standard document.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentFragment">DocumentFragment - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#interface-documentfragment">DocumentFragment - DOM</a>
 * @see <a href="https://www.w3.org/TR/selectors-api/#the-apis">DocumentFragment - Selectors API Level 1</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-B63ED1A3">DocumentFragment - Document Object Model (DOM) Level 3 Core Specification</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-B63ED1A3">DocumentFragment - Document Object Model (DOM) Level 2 Core Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-core.html#ID-B63ED1A3">DocumentFragment - Document Object Model (DOM) Level 1 Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DocumentFragment"
)
public class DocumentFragment extends Node {
  /**
   * The DocumentFragment() constructor returns a new, empty DocumentFragment object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentFragment/DocumentFragment">DocumentFragment.DocumentFragment - MDN</a>
   */
  public DocumentFragment() {
  }

  /**
   * The ParentNode.childElementCount read-only property returns an unsigned long representing the number of child elements of the given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentFragment/childElementCount">DocumentFragment.childElementCount - MDN</a>
   */
  @JsProperty(
      name = "childElementCount"
  )
  public native int childElementCount();

  /**
   * The ParentNode property children is a read-only property that returns a live HTMLCollection which contains all of the child elements of the node upon which it was called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentFragment/children">DocumentFragment.children - MDN</a>
   */
  @JsProperty(
      name = "children"
  )
  @Nonnull
  public native HTMLCollection children();

  /**
   * The ParentNode.firstElementChild read-only property returns the object's first child Element, or null if there are no child elements.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentFragment/firstElementChild">DocumentFragment.firstElementChild - MDN</a>
   */
  @JsProperty(
      name = "firstElementChild"
  )
  @Nullable
  public native Element firstElementChild();

  /**
   * The ParentNode.lastElementChild read-only property returns the object's last child Element or null if there are no child elements.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentFragment/lastElementChild">DocumentFragment.lastElementChild - MDN</a>
   */
  @JsProperty(
      name = "lastElementChild"
  )
  @Nullable
  public native Element lastElementChild();

  /**
   * The ParentNode.append() method inserts a set of Node objects or DOMString objects after the last child of the ParentNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ParentNode/append">ParentNode.append - MDN</a>
   */
  public native void append(@Nonnull Node... nodes);

  /**
   * The ParentNode.append() method inserts a set of Node objects or DOMString objects after the last child of the ParentNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ParentNode/append">ParentNode.append - MDN</a>
   */
  public native void append(@Nonnull String... nodes);

  /**
   * The ParentNode.prepend() method inserts a set of Node objects or DOMString objects before the first child of the ParentNode. DOMString objects are inserted as equivalent Text nodes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ParentNode/prepend">ParentNode.prepend - MDN</a>
   */
  public native void prepend(@Nonnull Node... nodes);

  /**
   * The ParentNode.prepend() method inserts a set of Node objects or DOMString objects before the first child of the ParentNode. DOMString objects are inserted as equivalent Text nodes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ParentNode/prepend">ParentNode.prepend - MDN</a>
   */
  public native void prepend(@Nonnull String... nodes);

  /**
   * The DocumentFragment.querySelector() method returns the first element, or null if no matches are found, within the DocumentFragment (using depth-first pre-order traversal of the document's nodes) that matches the specified group of selectors.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentFragment/querySelector">DocumentFragment.querySelector - MDN</a>
   */
  @Nullable
  public native Element querySelector(@Nonnull String selectors);

  /**
   * The DocumentFragment.querySelectorAll() method returns a NodeList of elements within the DocumentFragment (using depth-first pre-order traversal of the document's nodes) that matches the specified group of selectors.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentFragment/querySelectorAll">DocumentFragment.querySelectorAll - MDN</a>
   * @see <a href="https://www.w3.org/TR/selectors-api/#queryselector">DocumentFragment.querySelectorAll - Selectors API Level 1</a>
   */
  @Nonnull
  public native NodeList querySelectorAll(@Nonnull String selectors);

  /**
   * The ParentNode.replaceChildren() method replaces the existing children of a Node with a specified new set of children. These can be DOMString or Node objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ParentNode/replaceChildren">ParentNode.replaceChildren - MDN</a>
   */
  public native void replaceChildren(@Nonnull Node... nodes);

  /**
   * The ParentNode.replaceChildren() method replaces the existing children of a Node with a specified new set of children. These can be DOMString or Node objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ParentNode/replaceChildren">ParentNode.replaceChildren - MDN</a>
   */
  public native void replaceChildren(@Nonnull String... nodes);

  @Nullable
  public native Element getElementById(@Nonnull String elementId);
}
