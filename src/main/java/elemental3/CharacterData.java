package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The CharacterData abstract interface represents a Node object that contains characters. This is an abstract interface, meaning there aren't any object of type CharacterData: it is implemented by other interfaces, like Text, Comment, or ProcessingInstruction which aren't abstract.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CharacterData">CharacterData - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CharacterData"
)
public class CharacterData extends Node {
  @Nonnull
  public String data;

  protected CharacterData() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The NonDocumentTypeChildNode.nextElementSibling read-only property returns the element immediately following the specified one in its parent's children list, or null if the specified element is the last one in the list.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CharacterData/nextElementSibling">CharacterData.nextElementSibling - MDN</a>
   */
  @JsProperty(
      name = "nextElementSibling"
  )
  @Nullable
  public native Element nextElementSibling();

  /**
   * The NonDocumentTypeChildNode.previousElementSibling read-only property returns the Element immediately prior to the specified one in its parent's children list, or null if the specified element is the first one in the list.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CharacterData/previousElementSibling">CharacterData.previousElementSibling - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-nondocumenttypechildnode-previouselementsibling">The definition of 'NonDocumentTypeChildNode.previousElementSibling' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/ElementTraversal/#attribute-previousElementSibling">The definition of 'ElementTraversal.previousElementSibling' in the 'Element Traversal Specification' specification.</a>
   */
  @JsProperty(
      name = "previousElementSibling"
  )
  @Nullable
  public native Element previousElementSibling();

  public native void appendData(@Nonnull String data);

  public native void deleteData(int offset, int count);

  public native void insertData(int offset, @Nonnull String data);

  public native void replaceData(int offset, int count, @Nonnull String data);

  @Nonnull
  public native String substringData(int offset, int count);

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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CharacterData/remove">CharacterData.remove - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-childnode-remove">The definition of 'ChildNode.remove' in the 'DOM' specification.</a>
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
