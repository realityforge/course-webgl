package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Attr interface represents one of a DOM element's attributes as an object. In most DOM methods, you will directly retrieve the attribute as a string (e.g., Element.getAttribute()), but certain functions (e.g., Element.getAttributeNode()) or means of iterating return Attr types.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Attr">Attr - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Attr"
)
public class Attr extends Node {
  @Nonnull
  public String value;

  protected Attr() {
  }

  /**
   * The Attr.localName read-only property returns the local part of the qualified name of an attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Attr/localName">Attr.localName - MDN</a>
   */
  @JsProperty(
      name = "localName"
  )
  @Nonnull
  public native String localName();

  @JsProperty(
      name = "name"
  )
  @Nonnull
  public native String name();

  /**
   * The Attr.namespaceURI read-only property returns the namespace URI of the attribute, or null if the element is not in a namespace.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Attr/namespaceURI">Attr.namespaceURI - MDN</a>
   */
  @JsProperty(
      name = "namespaceURI"
  )
  @Nullable
  public native String namespaceURI();

  @JsProperty(
      name = "ownerElement"
  )
  @Nullable
  public native Element ownerElement();

  /**
   * The Attr.prefix read-only property returns the namespace prefix of the specified attribute, or null if no prefix is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Attr/prefix">Attr.prefix - MDN</a>
   */
  @JsProperty(
      name = "prefix"
  )
  @Nullable
  public native String prefix();

  @JsProperty(
      name = "specified"
  )
  public native boolean specified();
}
