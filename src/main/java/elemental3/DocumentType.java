package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The DocumentType interface represents a Node containing a doctype.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentType">DocumentType - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#documenttype">DocumentType - DOM</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-412266927">DocumentType - Document Object Model (DOM) Level 3 Core Specification</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-412266927">DocumentType - Document Object Model (DOM) Level 2 Core Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-core.html#ID-412266927">DocumentType - Document Object Model (DOM) Level 1 Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DocumentType"
)
public class DocumentType extends Node {
  protected DocumentType() {
  }

  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();

  @JsProperty(
      name = "publicId"
  )
  @Nonnull
  public native String publicId();

  @JsProperty(
      name = "systemId"
  )
  @Nonnull
  public native String systemId();

  /**
   * The ChildNode.after() method inserts a set of Node or DOMString objects in the children list of this ChildNode's parent, just after this ChildNode. DOMString objects are inserted as equivalent Text nodes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ChildNode/after">ChildNode.after - MDN</a>
   */
  public native void after(@Nonnull Node... nodes);

  /**
   * The ChildNode.after() method inserts a set of Node or DOMString objects in the children list of this ChildNode's parent, just after this ChildNode. DOMString objects are inserted as equivalent Text nodes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ChildNode/after">ChildNode.after - MDN</a>
   */
  public native void after(@Nonnull String... nodes);

  /**
   * The ChildNode.before() method inserts a set of Node or DOMString objects in the children list of this ChildNode's parent, just before this ChildNode. DOMString objects are inserted as equivalent Text nodes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ChildNode/before">ChildNode.before - MDN</a>
   */
  public native void before(@Nonnull Node... nodes);

  /**
   * The ChildNode.before() method inserts a set of Node or DOMString objects in the children list of this ChildNode's parent, just before this ChildNode. DOMString objects are inserted as equivalent Text nodes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ChildNode/before">ChildNode.before - MDN</a>
   */
  public native void before(@Nonnull String... nodes);

  /**
   * The ChildNode.remove() method removes the object from the tree it belongs to.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentType/remove">DocumentType.remove - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-childnode-remove">ChildNode.remove - DOM</a>
   */
  public native void remove();

  /**
   * The ChildNode.replaceWith() method replaces this ChildNode in the children list of its parent with a set of Node or DOMString objects. DOMString objects are inserted as equivalent Text nodes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ChildNode/replaceWith">ChildNode.replaceWith - MDN</a>
   */
  public native void replaceWith(@Nonnull Node... nodes);

  /**
   * The ChildNode.replaceWith() method replaces this ChildNode in the children list of its parent with a set of Node or DOMString objects. DOMString objects are inserted as equivalent Text nodes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ChildNode/replaceWith">ChildNode.replaceWith - MDN</a>
   */
  public native void replaceWith(@Nonnull String... nodes);
}
