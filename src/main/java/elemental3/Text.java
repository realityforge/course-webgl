package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Text interface represents the textual content of Element or Attr.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Text">Text - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#text">The definition of 'Text' in the 'DOM' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-1312295772">The definition of 'Text' in the 'Document Object Model (DOM) Level 3 Core Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-1312295772">The definition of 'Text' in the 'Document Object Model (DOM) Level 2 Core Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-core.html#ID-1312295772">The definition of 'Text' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Text"
)
public class Text extends CharacterData {
  /**
   * The Text() constructor returns a newly created Text object with the optional DOMString given in parameter as its textual content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Text/Text">Text.Text - MDN</a>
   */
  public Text(@Nonnull final String data) {
  }

  /**
   * The Text() constructor returns a newly created Text object with the optional DOMString given in parameter as its textual content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Text/Text">Text.Text - MDN</a>
   */
  public Text() {
  }

  /**
   * The assignedSlot property of the Text interface returns the HTMLSlotElement object associated with the element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Text/assignedSlot">Text.assignedSlot - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-slotable-assignedslot">The definition of 'assignedSlot' in the 'DOM' specification.</a>
   */
  @JsProperty(
      name = "assignedSlot"
  )
  @Nullable
  public native HTMLSlotElement assignedSlot();

  /**
   * The Text.wholeText read-only property returns the full text of all Text nodes logically adjacent to the node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Text/wholeText">Text.wholeText - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-text-wholetext">The definition of 'Text.wholeText' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#Text3-wholeText">The definition of 'Text.wholeText' in the 'Document Object Model (DOM) Level 3 Core Specification' specification.</a>
   */
  @JsProperty(
      name = "wholeText"
  )
  @Nonnull
  public native String wholeText();

  /**
   * The Text.splitText() method breaks the Text node into two nodes at the specified offset, keeping both nodes in the tree as siblings.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Text/splitText">Text.splitText - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-text-splittext">The definition of 'Text.splitText' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-38853C1D">The definition of 'Text.splitText' in the 'Document Object Model (DOM) Level 3 Core Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-38853C1D">The definition of 'Text.splitText' in the 'Document Object Model (DOM) Level 2 Core Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-core.html#ID-38853C1D">The definition of 'Text.splitText' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  @Nonnull
  public native Text splitText(int offset);
}
