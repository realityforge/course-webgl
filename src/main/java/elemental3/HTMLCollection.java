package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLCollection interface represents a generic collection (array-like object similar to arguments) of elements (in document order) and offers methods and properties for selecting from the list.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCollection">HTMLCollection - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#htmlcollection">HTMLCollection - DOM</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLCollection"
)
public class HTMLCollection {
  protected HTMLCollection() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The HTMLCollection method item() returns the node located at the specified offset into the collection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLCollection/item">HTMLCollection.item - MDN</a>
   */
  @Nullable
  public native Element item(int index);

  @Nullable
  public native Element namedItem(@Nonnull String name);
}
