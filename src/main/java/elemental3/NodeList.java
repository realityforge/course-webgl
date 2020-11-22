package elemental3;

import elemental3.core.JsArray;
import elemental3.core.JsIterator;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * NodeList objects are collections of nodes, usually returned by properties such as Node.childNodes and methods such as document.querySelectorAll().
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeList">NodeList - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#interface-nodelist">The definition of 'NodeList' in the 'DOM' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-536297177">The definition of 'NodeList' in the 'Document Object Model (DOM) Level 3 Core Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-536297177">The definition of 'NodeList' in the 'Document Object Model (DOM) Level 2 Core Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-core.html#ID-536297177">The definition of 'NodeList' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "NodeList"
)
public class NodeList {
  protected NodeList() {
  }

  /**
   * The NodeList.length property returns the number of items in a NodeList.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeList/length">NodeList.length - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-nodelist-length">The definition of 'NodeList: length' in the 'DOM' specification.</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * Returns a node from a NodeList by index. This method doesn't throw exceptions as long as you provide arguments. A value of null is returned if the index is out of range, and a TypeError is thrown if no argument is provided.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeList/item">NodeList.item - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-nodelist-item">The definition of 'NodeList: item' in the 'DOM' specification.</a>
   */
  @Nullable
  public native Node item(int index);

  /**
   * The NodeList.keys() method returns an iterator allowing to go through all keys contained in this object. The keys are unsigned integer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeList/keys">NodeList.keys - MDN</a>
   */
  @Nonnull
  public native JsIterator<Double> keys();

  /**
   * The NodeList.values() method returns an iterator allowing to go through all values contained in this object. The values are Node objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeList/values">NodeList.values - MDN</a>
   */
  @Nonnull
  public native JsIterator<Node> values();

  /**
   * The NodeList.entries() method returns an iterator allowing to go through all key/value pairs contained in this object. The values are Node objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeList/entries">NodeList.entries - MDN</a>
   */
  @Nonnull
  public native JsIterator<Entry> entries();

  /**
   * The forEach() method of the NodeList interface calls the callback given in parameter once for each value pair in the list, in insertion order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeList/forEach">NodeList.forEach - MDN</a>
   * @see <a href="https://heycam.github.io/webidl/#es-forEach">The definition of 'forEach' in the 'Web IDL' specification.</a>
   */
  public native void forEach(@Nonnull ForEachCallback callback);

  /**
   * The forEach() method of the NodeList interface calls the callback given in parameter once for each value pair in the list, in insertion order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeList/forEach">NodeList.forEach - MDN</a>
   * @see <a href="https://heycam.github.io/webidl/#es-forEach">The definition of 'forEach' in the 'Web IDL' specification.</a>
   */
  public native void forEach(@Nonnull ForEachCallback2 callback);

  /**
   * The forEach() method of the NodeList interface calls the callback given in parameter once for each value pair in the list, in insertion order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeList/forEach">NodeList.forEach - MDN</a>
   * @see <a href="https://heycam.github.io/webidl/#es-forEach">The definition of 'forEach' in the 'Web IDL' specification.</a>
   */
  public native void forEach(@Nonnull ForEachCallback3 callback);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Array"
  )
  public static final class Entry extends JsArray<Object> {
    @JsOverlay
    public final int index() {
      return getAtAsAny( 0 ).asInt();
    }

    @JsOverlay
    @Nonnull
    public final Node value() {
      return getAtAsAny( 1 ).cast();
    }
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback {
    void item(@Nonnull Node value);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback2 {
    void item(@Nonnull Node value, int index);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback3 {
    void item(@Nonnull Node value, int index, @Nonnull NodeList iterable);
  }
}
