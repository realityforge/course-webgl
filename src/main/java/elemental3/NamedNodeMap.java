package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The NamedNodeMap interface represents a collection of Attr objects. Objects inside a NamedNodeMap are not in any particular order, unlike NodeList, although they may be accessed by an index as in an array.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NamedNodeMap">NamedNodeMap - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#interface-namednodemap">NamedNodeMap - DOM</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-1780488922">NamedNodeMap - Document Object Model (DOM) Level 3 Core Specification</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-1780488922">NamedNodeMap - Document Object Model (DOM) Level 2 Core Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/core.html#ID-1780488922">NamedNodeMap - Document Object Model (DOM) Level 1 Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "NamedNodeMap"
)
public class NamedNodeMap {
  protected NamedNodeMap() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @Nullable
  public native Attr getNamedItemNS(@Nullable String namespace, @Nonnull String localName);

  @Nonnull
  public native Attr removeNamedItem(@Nonnull String qualifiedName);

  @Nonnull
  public native Attr removeNamedItemNS(@Nullable String namespace, @Nonnull String localName);

  @Nullable
  public native Attr setNamedItem(@Nonnull Attr attr);

  @Nullable
  public native Attr setNamedItemNS(@Nonnull Attr attr);

  /**
   * The getNamedItem() method of the NamedNodeMap interface returns the Attr corresponding to the given name, or null if there is no corresponding attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NamedNodeMap/getNamedItem">NamedNodeMap.getNamedItem - MDN</a>
   */
  @Nullable
  public native Attr getNamedItem(@Nonnull String qualifiedName);

  @Nullable
  public native Attr item(int index);
}
