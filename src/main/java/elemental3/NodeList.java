package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * NodeList objects are collections of nodes, usually returned by properties such as Node.childNodes and methods such as document.querySelectorAll().
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeList">NodeList - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "NodeList"
)
public class NodeList {
  NodeList() {
  }

  /**
   * The NodeList.length property returns the number of items in a NodeList.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeList/length">NodeList.length - MDN</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * Returns a node from a NodeList by index. This method doesn't throw exceptions as long as you provide arguments. A value of null is returned if the index is out of range, and a TypeError is thrown if no argument is provided.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeList/item">NodeList.item - MDN</a>
   */
  @Nullable
  public native Node item(int index);
}
