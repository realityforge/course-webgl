package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The XMLSerializer interface provides the serializeToString() method to construct an XML string representing a DOM tree.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLSerializer">XMLSerializer - MDN</a>
 * @see <a href="https://w3c.github.io/DOM-Parsing/#the-xmlserializer-interface">XMLSerializer - DOM Parsing and Serialization</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XMLSerializer"
)
public class XMLSerializer {
  public XMLSerializer() {
  }

  /**
   * The XMLSerializer method serializeToString() constructs a string representing the specified DOM tree in XML form.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLSerializer/serializeToString">XMLSerializer.serializeToString - MDN</a>
   * @see <a href="https://w3c.github.io/DOM-Parsing/#dom-xmlserializer-serializetostring">serializeToString() - DOM Parsing and Serialization</a>
   */
  @Nonnull
  public native String serializeToString(@Nonnull Node root);
}
