package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * A NodeFilter interface represents an object used to filter the nodes in a NodeIterator or TreeWalker. A NodeFilter knows nothing about the document or traversing nodes; it only knows how to evaluate a single node against the provided filter.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeFilter">NodeFilter - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "NodeFilter"
)
@FunctionalInterface
public interface NodeFilter {
  @JsOverlay
  int FILTER_ACCEPT = 1;

  @JsOverlay
  int FILTER_REJECT = 2;

  @JsOverlay
  int FILTER_SKIP = 3;

  @JsOverlay
  int SHOW_ALL = 0xFFFFFFFF;

  @JsOverlay
  int SHOW_ATTRIBUTE = 0x2;

  @JsOverlay
  int SHOW_CDATA_SECTION = 0x8;

  @JsOverlay
  int SHOW_COMMENT = 0x80;

  @JsOverlay
  int SHOW_DOCUMENT = 0x100;

  @JsOverlay
  int SHOW_DOCUMENT_FRAGMENT = 0x400;

  @JsOverlay
  int SHOW_DOCUMENT_TYPE = 0x200;

  @JsOverlay
  int SHOW_ELEMENT = 0x1;

  @JsOverlay
  int SHOW_ENTITY = 0x20;

  @JsOverlay
  int SHOW_ENTITY_REFERENCE = 0x10;

  @JsOverlay
  int SHOW_NOTATION = 0x800;

  @JsOverlay
  int SHOW_PROCESSING_INSTRUCTION = 0x40;

  @JsOverlay
  int SHOW_TEXT = 0x4;

  /**
   * The NodeFilter.acceptNode() method returns an unsigned short that will be used to tell if a given Node must be accepted or not by the NodeIterator or TreeWalker iteration algorithm. This method is expected to be written by the user of a NodeFilter. Possible return values are:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/NodeFilter/acceptNode">NodeFilter.acceptNode - MDN</a>
   */
  int acceptNode(@Nonnull Node node);
}
