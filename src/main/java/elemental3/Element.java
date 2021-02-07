package elemental3;

import elemental3.core.JsArray;
import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * Element is the most general base class from which all element objects (i.e. objects that represent elements) in a Document inherit. It only has methods and properties common to all kinds of elements. More specific classes inherit from Element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element">Element - MDN</a>
 * @see <a href="https://drafts.csswg.org/css-pseudo-4/#window-interface">Element - CSS Pseudo-Elements Level 4</a>
 * @see <a href="https://drafts.csswg.org/web-animations-1/">Web Animations</a>
 * @see <a href="https://dvcs.w3.org/hg/undomanager/raw-file/tip/undomanager.html">Element - UndoManager and DOMTransaction</a>
 * @see <a href="https://www.w3.org/TR/pointerevents2/#extensions-to-the-element-interface">Element - Pointer Events &ndash; Level 2</a>
 * @see <a href="https://www.w3.org/TR/pointerevents1/#extensions-to-the-element-interface">Element - Pointer Events</a>
 * @see <a href="https://www.w3.org/TR/selectors-api/#interface-definitions">Element - Selectors API Level 1</a>
 * @see <a href="https://w3c.github.io/pointerlock/#extensions-to-the-element-interface">Element - Pointer Lock</a>
 * @see <a href="https://fullscreen.spec.whatwg.org/#api">Element - Fullscreen API</a>
 * @see <a href="https://w3c.github.io/DOM-Parsing/#extensions-to-the-element-interface">Element - DOM Parsing and Serialization</a>
 * @see <a href="https://drafts.csswg.org/cssom-view/#extension-to-the-element-interface">Element - CSS Object Model (CSSOM) View Module</a>
 * @see <a href="https://www.w3.org/TR/ElementTraversal/#ecmascript-bindings">Element - Element Traversal Specification</a>
 * @see <a href="https://dom.spec.whatwg.org/#interface-element">Element - DOM</a>
 * @see <a href="https://www.w3.org/TR/dom/#interface-element">Element - DOM4</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-745549614">Element - Document Object Model (DOM) Level 3 Core Specification</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-745549614">Element - Document Object Model (DOM) Level 2 Core Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-core.html#ID-745549614">Element - Document Object Model (DOM) Level 1 Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Element"
)
public class Element extends Node {
  @Nonnull
  public String ariaAtomic;

  @Nonnull
  public String ariaAutoComplete;

  @Nonnull
  public String ariaBusy;

  @Nonnull
  public String ariaChecked;

  @Nonnull
  public String ariaColCount;

  @Nonnull
  public String ariaColIndex;

  @Nonnull
  public String ariaColIndexText;

  @Nonnull
  public String ariaColSpan;

  @Nonnull
  public String ariaCurrent;

  @Nonnull
  public String ariaDescription;

  @Nonnull
  public String ariaDisabled;

  @Nonnull
  public String ariaExpanded;

  @Nonnull
  public String ariaHasPopup;

  @Nonnull
  public String ariaHidden;

  @Nonnull
  public String ariaInvalid;

  @Nonnull
  public String ariaKeyShortcuts;

  @Nonnull
  public String ariaLabel;

  @Nonnull
  public String ariaLevel;

  @Nonnull
  public String ariaLive;

  @Nonnull
  public String ariaModal;

  @Nonnull
  public String ariaMultiLine;

  @Nonnull
  public String ariaMultiSelectable;

  @Nonnull
  public String ariaOrientation;

  @Nonnull
  public String ariaPlaceholder;

  @Nonnull
  public String ariaPosInSet;

  @Nonnull
  public String ariaPressed;

  @Nonnull
  public String ariaReadOnly;

  @Nonnull
  public String ariaRequired;

  @Nonnull
  public String ariaRoleDescription;

  @Nonnull
  public String ariaRowCount;

  @Nonnull
  public String ariaRowIndex;

  @Nonnull
  public String ariaRowIndexText;

  @Nonnull
  public String ariaRowSpan;

  @Nonnull
  public String ariaSelected;

  @Nonnull
  public String ariaSetSize;

  @Nonnull
  public String ariaSort;

  @Nonnull
  public String ariaValueMax;

  @Nonnull
  public String ariaValueMin;

  @Nonnull
  public String ariaValueNow;

  @Nonnull
  public String ariaValueText;

  /**
   * The className property of the Element interface gets and sets the value of the class attribute of the specified element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/className">Element.className - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-element-classname">element.className - DOM</a>
   * @see <a href="https://www.w3.org/TR/dom/#dom-element-classname">element.className - DOM4</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-95362176">element.className - Document Object Model (DOM) Level 2 HTML Specification</a>
   */
  @Nonnull
  public String className;

  /**
   * The id property of the Element interface represents the element's identifier, reflecting the id global attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/id">Element.id - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-element-id">id - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-63534901">id - Document Object Model (DOM) Level 2 HTML Specification</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-63534901">id - Document Object Model (DOM) Level 1 Specification</a>
   */
  @Nonnull
  public String id;

  /**
   * The Element property innerHTML gets or sets the HTML or XML markup contained within the element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/innerHTML">Element.innerHTML - MDN</a>
   */
  @Nonnull
  public String innerHTML;

  /**
   * The Element interface's onfullscreenchange property is an event handler for the fullscreenchange event that is fired when the element has transitioned into or out of full-screen mode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/onfullscreenchange">Element.onfullscreenchange - MDN</a>
   * @see <a href="https://fullscreen.spec.whatwg.org/#handler-document-onfullscreenchange">onfullscreenchange - Fullscreen API</a>
   */
  @Nullable
  public EventHandler onfullscreenchange;

  /**
   * The Element interface's onfullscreenerror property is an event handler for the fullscreenerror event which is sent to the element when an error occurs while attempting to transition into or out of full-screen mode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/onfullscreenerror">Element.onfullscreenerror - MDN</a>
   * @see <a href="https://fullscreen.spec.whatwg.org/#dom-element-onfullscreenerror">onfullscreenerror - Fullscreen API</a>
   */
  @Nullable
  public EventHandler onfullscreenerror;

  /**
   * The outerHTML attribute of the Element DOM interface gets the serialized HTML fragment describing the element including its descendants. It can also be set to replace the element with nodes parsed from the given string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/outerHTML">Element.outerHTML - MDN</a>
   */
  @Nonnull
  public String outerHTML;

  @Nullable
  public String role;

  /**
   * The Element.scrollLeft property gets or sets the number of pixels that an element's content is scrolled from its left edge.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollLeft">Element.scrollLeft - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-element-scrollleft">scrollLeft - CSS Object Model (CSSOM) View Module</a>
   */
  public double scrollLeft;

  /**
   * The Element.scrollTop property gets or sets the number of pixels that an element's content is scrolled vertically.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollTop">Element.scrollTop - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-element-scrolltop">scrollTop - CSS Object Model (CSSOM) View Module</a>
   */
  public double scrollTop;

  /**
   * The slot property of the Element interface returns the name of the shadow DOM slot the element is inserted in.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/slot">Element.slot - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-element-slot">slot - DOM</a>
   */
  @Nonnull
  public String slot;

  protected Element() {
  }

  /**
   * The assignedSlot read-only property of the Slottable interface returns an HTMLSlotElement representing the slot element the node is inserted in.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Slottable/assignedSlot">Slottable.assignedSlot - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-slotable-assignedslot">assignedSlot - DOM</a>
   */
  @JsProperty(
      name = "assignedSlot"
  )
  @Nullable
  public native HTMLSlotElement assignedSlot();

  /**
   * The Element.attributes property returns a live collection of all attribute nodes registered to the specified node. It is a NamedNodeMap, not an Array, so it has no Array methods and the Attr nodes' indexes may differ among browsers. To be more specific, attributes is a key/value pair of strings that represents any information regarding that attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/attributes">Element.attributes - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-element-attributes">Element.attributes - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-84CF096">Element.attributes - Document Object Model (DOM) Level 3 Core Specification</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-84CF096">Element.attributes - Document Object Model (DOM) Level 2 Core Specification</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-core.html#ID-84CF096">Element.attributes - Document Object Model (DOM) Level 1 Specification</a>
   */
  @JsProperty(
      name = "attributes"
  )
  @Nonnull
  public native NamedNodeMap attributes();

  /**
   * The ParentNode.childElementCount read-only property returns an unsigned long representing the number of child elements of the given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/childElementCount">Element.childElementCount - MDN</a>
   */
  @JsProperty(
      name = "childElementCount"
  )
  public native int childElementCount();

  /**
   * The ParentNode property children is a read-only property that returns a live HTMLCollection which contains all of the child elements of the node upon which it was called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/children">Element.children - MDN</a>
   */
  @JsProperty(
      name = "children"
  )
  @Nonnull
  public native HTMLCollection children();

  /**
   * The Element.classList is a read-only property that returns a live DOMTokenList collection of the class attributes of the element. This can then be used to manipulate the class list.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/classList">Element.classList - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-element-classlist">Element.classList - DOM</a>
   * @see <a href="https://www.w3.org/TR/dom/#dom-element-classlist">Element.classList - DOM4</a>
   */
  @JsProperty(
      name = "classList"
  )
  @Nonnull
  public native DOMTokenList classList();

  /**
   * The Element.clientHeight read-only property is zero for elements with no CSS or inline layout boxes; otherwise, it's the inner height of an element in pixels. It includes padding but excludes borders, margins, and horizontal scrollbars (if present).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/clientHeight">Element.clientHeight - MDN</a>
   */
  @JsProperty(
      name = "clientHeight"
  )
  public native int clientHeight();

  /**
   * The width of the left border of an element in pixels. It includes the width of the vertical scrollbar if the text direction of the element is right&ndash;to&ndash;left and if there is an overflow causing a left vertical scrollbar to be rendered. clientLeft does not include the left margin or the left padding. clientLeft is read-only.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/clientLeft">Element.clientLeft - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-element-clientleft">clientLeft - CSS Object Model (CSSOM) View Module</a>
   */
  @JsProperty(
      name = "clientLeft"
  )
  public native int clientLeft();

  /**
   * The width of the top border of an element in pixels. It is a read-only, integer property of element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/clientTop">Element.clientTop - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-element-clienttop">clientTop - CSS Object Model (CSSOM) View Module</a>
   */
  @JsProperty(
      name = "clientTop"
  )
  public native int clientTop();

  /**
   * The Element.clientWidth property is zero for inline elements and elements with no CSS; otherwise, it's the inner width of an element in pixels. It includes padding but excludes borders, margins, and vertical scrollbars (if present).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/clientWidth">Element.clientWidth - MDN</a>
   */
  @JsProperty(
      name = "clientWidth"
  )
  public native int clientWidth();

  /**
   * The ParentNode.firstElementChild read-only property returns the object's first child Element, or null if there are no child elements.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/firstElementChild">Element.firstElementChild - MDN</a>
   */
  @JsProperty(
      name = "firstElementChild"
  )
  @Nullable
  public native Element firstElementChild();

  /**
   * The ParentNode.lastElementChild read-only property returns the object's last child Element or null if there are no child elements.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/lastElementChild">Element.lastElementChild - MDN</a>
   */
  @JsProperty(
      name = "lastElementChild"
  )
  @Nullable
  public native Element lastElementChild();

  /**
   * The Element.localName read-only property returns the local part of the qualified name of an element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/localName">Element.localName - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-element-localname">Element.localName - DOM</a>
   */
  @JsProperty(
      name = "localName"
  )
  @Nonnull
  public native String localName();

  /**
   * The Element.namespaceURI read-only property returns the namespace URI of the element, or null if the element is not in a namespace.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/namespaceURI">Element.namespaceURI - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-element-namespaceuri">Element: namespaceURI - DOM</a>
   */
  @JsProperty(
      name = "namespaceURI"
  )
  @Nullable
  public native String namespaceURI();

  /**
   * The NonDocumentTypeChildNode.nextElementSibling read-only property returns the element immediately following the specified one in its parent's children list, or null if the specified element is the last one in the list.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/nextElementSibling">Element.nextElementSibling - MDN</a>
   */
  @JsProperty(
      name = "nextElementSibling"
  )
  @Nullable
  public native Element nextElementSibling();

  /**
   * The Element.prefix read-only property returns the namespace prefix of the specified element, or null if no prefix is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/prefix">Element.prefix - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-element-prefix">Element: prefix - DOM</a>
   */
  @JsProperty(
      name = "prefix"
  )
  @Nullable
  public native String prefix();

  /**
   * The NonDocumentTypeChildNode.previousElementSibling read-only property returns the Element immediately prior to the specified one in its parent's children list, or null if the specified element is the first one in the list.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/previousElementSibling">Element.previousElementSibling - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-nondocumenttypechildnode-previouselementsibling">NonDocumentTypeChildNode.previousElementSibling - DOM</a>
   * @see <a href="https://www.w3.org/TR/ElementTraversal/#attribute-previousElementSibling">ElementTraversal.previousElementSibling - Element Traversal Specification</a>
   */
  @JsProperty(
      name = "previousElementSibling"
  )
  @Nullable
  public native Element previousElementSibling();

  /**
   * The Element.scrollHeight read-only property is a measurement of the height of an element's content, including content not visible on the screen due to overflow.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollHeight">Element.scrollHeight - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-element-scrollheight">Element.scrollHeight - CSS Object Model (CSSOM) View Module</a>
   */
  @JsProperty(
      name = "scrollHeight"
  )
  public native int scrollHeight();

  /**
   * The Element.scrollWidth read-only property is a measurement of the width of an element's content, including content not visible on the screen due to overflow.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollWidth">Element.scrollWidth - MDN</a>
   */
  @JsProperty(
      name = "scrollWidth"
  )
  public native int scrollWidth();

  /**
   * The Element.shadowRoot read-only property represents the shadow root hosted by the element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/shadowRoot">Element.shadowRoot - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-element-shadowroot">shadowRoot - DOM</a>
   */
  @JsProperty(
      name = "shadowRoot"
  )
  @Nullable
  public native ShadowRoot shadowRoot();

  /**
   * The tagName read-only property of the Element interface returns the tag name of the element on which it's called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/tagName">Element.tagName - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-element-tagname">Element: tagName - DOM</a>
   */
  @JsProperty(
      name = "tagName"
  )
  @Nonnull
  public native String tagName();

  /**
   * The Element.attachShadow() method attaches a shadow DOM tree to the specified element and returns a reference to its ShadowRoot.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/attachShadow">Element.attachShadow - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-element-attachshadow">attachShadow() - DOM</a>
   */
  @Nonnull
  public native ShadowRoot attachShadow(@Nonnull ShadowRootInit init);

  /**
   * The closest() method traverses the Element and its parents (heading toward the document root) until it finds a node that matches the provided selector string. Will return itself or the matching ancestor. If no such element exists, it returns null.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/closest">Element.closest - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-element-closest">Element.closest() - DOM</a>
   */
  @Nullable
  public native Element closest(@Nonnull String selectors);

  /**
   * The getAttribute() method of the Element interface returns the value of a specified attribute on the element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/getAttribute">Element.getAttribute - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-element-getattribute">getAttribute() - DOM</a>
   */
  @Nullable
  public native String getAttribute(@Nonnull String qualifiedName);

  /**
   * The getAttributeNS() method of the Element interface returns the string value of the attribute with the specified namespace and name. If the named attribute does not exist, the value returned will either be null or &quot;&quot; (the empty string); see Notes for details.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/getAttributeNS">Element.getAttributeNS - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-element-getattributens">Element.getAttributeNS() - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/#ID-ElGetAttrNS">Element.getAttributeNS() - Document Object Model (DOM) Level 3 Core Specification</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/#ID-ElGetAttrNS">Element.getAttributeNS() - Document Object Model (DOM) Level 2 Core Specification</a>
   */
  @Nullable
  public native String getAttributeNS(@Nullable String namespace, @Nonnull String localName);

  /**
   * The getAttributeNames() method of the Element interface returns the attribute names of the element as an Array of strings. If the element has no attributes it returns an empty array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/getAttributeNames">Element.getAttributeNames - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-element-getattributenames">Element.getAttributeNames - DOM</a>
   */
  @Nonnull
  public native JsArray<String> getAttributeNames();

  /**
   * Returns the specified attribute of the specified element, as an Attr node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/getAttributeNode">Element.getAttributeNode - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-element-getattributenode">getAttributeNode() - DOM</a>
   */
  @Nullable
  public native Attr getAttributeNode(@Nonnull String qualifiedName);

  /**
   * Returns the Attr node for the attribute with the given namespace and name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/getAttributeNodeNS">Element.getAttributeNodeNS - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-element-getattributenodens">getAttributeNodeNS() - DOM</a>
   */
  @Nullable
  public native Attr getAttributeNodeNS(@Nullable String namespace, @Nonnull String localName);

  /**
   * The Element method getElementsByClassName() returns a live HTMLCollection which contains every descendant element which has the specified class name or names.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/getElementsByClassName">Element.getElementsByClassName - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-element-getelementsbyclassname">Element.getElementsByClassName() - DOM</a>
   */
  @Nonnull
  public native HTMLCollection getElementsByClassName(@Nonnull String classNames);

  /**
   * The Element.getElementsByTagName() method returns a live HTMLCollection of elements with the given tag name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/getElementsByTagName">Element.getElementsByTagName - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-element-getelementsbytagname">Element.getElementsByTagName() - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-1938918D">Element.getElementsByTagName() - Document Object Model (DOM) Level 3 Core Specification</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-1938918D">Element.getElementsByTagName() - Document Object Model (DOM) Level 2 Core Specification</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-core.html#ID-1938918D">Element.getElementsByTagName() - Document Object Model (DOM) Level 1 Specification</a>
   */
  @Nonnull
  public native HTMLCollection getElementsByTagName(@Nonnull String qualifiedName);

  /**
   * The Element.getElementsByTagNameNS() method returns a live HTMLCollection of elements with the given tag name belonging to the given namespace. It is similar to Document.getElementsByTagNameNS, except that its search is restricted to descendants of the specified element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/getElementsByTagNameNS">Element.getElementsByTagNameNS - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-element-getelementsbytagnamens">Element.getElementsByTagNameNS() - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-A6C90942">Element.getElementsByTagNameNS() - Document Object Model (DOM) Level 3 Core Specification</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-A6C90942">Element.getElementsByTagNameNS() - Document Object Model (DOM) Level 2 Core Specification</a>
   */
  @Nonnull
  public native HTMLCollection getElementsByTagNameNS(@Nullable String namespace,
      @Nonnull String localName);

  /**
   * The Element.hasAttribute() method returns a Boolean value indicating whether the specified element has the specified attribute or not.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/hasAttribute">Element.hasAttribute - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-element-hasattribute">Element.hasAttribute() - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-ElHasAttr">Element.hasAttribute() - Document Object Model (DOM) Level 3 Core Specification</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-ElHasAttr">Element.hasAttribute() - Document Object Model (DOM) Level 2 Core Specification</a>
   */
  public native boolean hasAttribute(@Nonnull String qualifiedName);

  /**
   * hasAttributeNS returns a boolean value indicating whether the current element has the specified attribute.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/hasAttributeNS">Element.hasAttributeNS - MDN</a>
   */
  public native boolean hasAttributeNS(@Nullable String namespace, @Nonnull String localName);

  /**
   * The hasAttributes() method of the Element interface returns a Boolean indicating whether the current element has any attributes or not.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/hasAttributes">Element.hasAttributes - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-element-hasattributes">Element.hasAttributes() - DOM</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/#ID-NodeHasAttrs">hasAttributes() - Document Object Model (DOM) Level 3 Core Specification</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/#ID-NodeHasAttrs">hasAttributes() - Document Object Model (DOM) Level 2 Core Specification</a>
   */
  public native boolean hasAttributes();

  /**
   * The insertAdjacentElement() method of the Element interface inserts a given element node at a given position relative to the element it is invoked upon.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/insertAdjacentElement">Element.insertAdjacentElement - MDN</a>
   */
  @Nullable
  public native Element insertAdjacentElement(@Nonnull String where, @Nonnull Element element);

  /**
   * The insertAdjacentText() method of the Element interface inserts a given text node at a given position relative to the element it is invoked upon.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/insertAdjacentText">Element.insertAdjacentText - MDN</a>
   */
  public native void insertAdjacentText(@Nonnull String where, @Nonnull String data);

  /**
   * The matches() method checks to see if the Element would be selected by the provided selectorString -- in other words -- checks if the element &quot;is&quot; the selector.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/matches">Element.matches - MDN</a>
   */
  public native boolean matches(@Nonnull String selectors);

  /**
   * The Element method removeAttribute() removes the attribute with the specified name from the element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/removeAttribute">Element.removeAttribute - MDN</a>
   */
  public native void removeAttribute(@Nonnull String qualifiedName);

  /**
   * The removeAttributeNS() method of the Element interface removes the specified attribute from an element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/removeAttributeNS">Element.removeAttributeNS - MDN</a>
   */
  public native void removeAttributeNS(@Nullable String namespace, @Nonnull String localName);

  /**
   * The removeAttributeNode() method of the Element object removes the specified attribute from the current element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/removeAttributeNode">Element.removeAttributeNode - MDN</a>
   */
  @Nonnull
  public native Attr removeAttributeNode(@Nonnull Attr attr);

  /**
   * Sets the value of an attribute on the specified element. If the attribute already exists, the value is updated; otherwise a new attribute is added with the specified name and value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/setAttribute">Element.setAttribute - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-element-setattribute">setAttribute() - DOM</a>
   */
  public native void setAttribute(@Nonnull String qualifiedName, @Nonnull String value);

  /**
   * setAttributeNS adds a new attribute or changes the value of an attribute with the given namespace and name.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/setAttributeNS">Element.setAttributeNS - MDN</a>
   */
  public native void setAttributeNS(@Nullable String namespace, @Nonnull String qualifiedName,
      @Nonnull String value);

  /**
   * The setAttributeNode() method adds a new Attr node to the specified element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/setAttributeNode">Element.setAttributeNode - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-element-setattributenode">setAttributeNode() - DOM</a>
   */
  @Nullable
  public native Attr setAttributeNode(@Nonnull Attr attr);

  /**
   * setAttributeNodeNS adds a new namespaced attribute node to an element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/setAttributeNodeNS">Element.setAttributeNodeNS - MDN</a>
   */
  @Nullable
  public native Attr setAttributeNodeNS(@Nonnull Attr attr);

  /**
   * The toggleAttribute() method of the Element interface toggles a Boolean attribute (removing it if it is present and adding it if it is not present) on the given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/toggleAttribute">Element.toggleAttribute - MDN</a>
   */
  public native boolean toggleAttribute(@Nonnull String qualifiedName, boolean force);

  /**
   * The toggleAttribute() method of the Element interface toggles a Boolean attribute (removing it if it is present and adding it if it is not present) on the given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/toggleAttribute">Element.toggleAttribute - MDN</a>
   */
  public native boolean toggleAttribute(@Nonnull String qualifiedName);

  public native boolean webkitMatchesSelector(@Nonnull String selectors);

  @Nullable
  public native CSSPseudoElement pseudo(@Nonnull String type);

  /**
   * The Element.getBoundingClientRect() method returns a DOMRect object providing information about the size of an element and its position relative to the viewport.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/getBoundingClientRect">Element.getBoundingClientRect - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-element-getboundingclientrect">Element.getBoundingClientRect() - CSS Object Model (CSSOM) View Module</a>
   */
  @Nonnull
  public native DOMRect getBoundingClientRect();

  /**
   * The getClientRects() method of the Element interface returns a collection of DOMRect objects that indicate the bounding rectangles for each CSS border box in a client.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/getClientRects">Element.getClientRects - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-element-getclientrects">Element.getClientRects() - CSS Object Model (CSSOM) View Module</a>
   */
  @Nonnull
  public native DOMRectList getClientRects();

  /**
   * The scroll() method of the Element interface scrolls the element to a particular set of coordinates inside a given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/scroll">Element.scroll - MDN</a>
   */
  public native void scroll(@Nonnull ScrollToOptions options);

  /**
   * The scroll() method of the Element interface scrolls the element to a particular set of coordinates inside a given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/scroll">Element.scroll - MDN</a>
   */
  public native void scroll();

  /**
   * The scroll() method of the Element interface scrolls the element to a particular set of coordinates inside a given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/scroll">Element.scroll - MDN</a>
   */
  public native void scroll(double x, double y);

  /**
   * The scrollBy() method of the Element interface scrolls an element by the given amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollBy">Element.scrollBy - MDN</a>
   */
  public native void scrollBy(@Nonnull ScrollToOptions options);

  /**
   * The scrollBy() method of the Element interface scrolls an element by the given amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollBy">Element.scrollBy - MDN</a>
   */
  public native void scrollBy();

  /**
   * The scrollBy() method of the Element interface scrolls an element by the given amount.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollBy">Element.scrollBy - MDN</a>
   */
  public native void scrollBy(double x, double y);

  /**
   * The Element interface's scrollIntoView() method scrolls the element's parent container such that the element on which scrollIntoView() is called is visible to the user
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollIntoView">Element.scrollIntoView - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-element-scrollintoview">Element.scrollIntoView() - CSS Object Model (CSSOM) View Module</a>
   */
  public native void scrollIntoView(boolean arg);

  /**
   * The Element interface's scrollIntoView() method scrolls the element's parent container such that the element on which scrollIntoView() is called is visible to the user
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollIntoView">Element.scrollIntoView - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-element-scrollintoview">Element.scrollIntoView() - CSS Object Model (CSSOM) View Module</a>
   */
  public native void scrollIntoView(@Nonnull ScrollIntoViewOptions arg);

  /**
   * The Element interface's scrollIntoView() method scrolls the element's parent container such that the element on which scrollIntoView() is called is visible to the user
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollIntoView">Element.scrollIntoView - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-element-scrollintoview">Element.scrollIntoView() - CSS Object Model (CSSOM) View Module</a>
   */
  public native void scrollIntoView();

  /**
   * The scrollTo() method of the Element interface scrolls to a particular set of coordinates inside a given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollTo">Element.scrollTo - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-element-scrollto-options-options">element.scrollTo() - CSS Object Model (CSSOM) View Module</a>
   */
  public native void scrollTo(@Nonnull ScrollToOptions options);

  /**
   * The scrollTo() method of the Element interface scrolls to a particular set of coordinates inside a given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollTo">Element.scrollTo - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-element-scrollto-options-options">element.scrollTo() - CSS Object Model (CSSOM) View Module</a>
   */
  public native void scrollTo();

  /**
   * The scrollTo() method of the Element interface scrolls to a particular set of coordinates inside a given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollTo">Element.scrollTo - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-element-scrollto-options-options">element.scrollTo() - CSS Object Model (CSSOM) View Module</a>
   */
  public native void scrollTo(double x, double y);

  /**
   * The insertAdjacentHTML() method of the Element interface parses the specified text as HTML or XML and inserts the resulting nodes into the DOM tree at a specified position. It does not reparse the element it is being used on, and thus it does not corrupt the existing elements inside that element. This avoids the extra step of serialization, making it much faster than direct innerHTML manipulation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/insertAdjacentHTML">Element.insertAdjacentHTML - MDN</a>
   */
  public native void insertAdjacentHTML(@Nonnull String position, @Nonnull String text);

  /**
   * The hasPointerCapture() method of the Element interface sets whether the element on which it is invoked has pointer capture for the pointer identified by the given pointer ID.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/hasPointerCapture">Element.hasPointerCapture - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#dom-element-haspointercapture">hasPointerCapture() - Pointer Events &ndash; Level 2</a>
   */
  public native boolean hasPointerCapture(int pointerId);

  /**
   * The releasePointerCapture() method of the Element interface releases (stops) pointer capture that was previously set for a specific (PointerEvent) pointer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/releasePointerCapture">Element.releasePointerCapture - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#idl-def-element-releasepointercapture-pointerid">releasePointerCapture - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-Element-releasePointerCapture-void-long-pointerId">releasePointerCapture - Pointer Events</a>
   */
  public native void releasePointerCapture(int pointerId);

  /**
   * The setPointerCapture() method of the Element interface is used to designate a specific element as the capture target of future pointer events. Subsequent events for the pointer will be targeted at the capture element until capture is released (via Element.releasePointerCapture()).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/setPointerCapture">Element.setPointerCapture - MDN</a>
   * @see <a href="https://www.w3.org/TR/pointerevents2/#idl-def-element-setpointercapture-pointerid">setPointerCapture - Pointer Events &ndash; Level 2</a>
   * @see <a href="https://www.w3.org/TR/pointerevents1/#widl-Element-setPointerCapture-void-long-pointerId">setPointerCapture - Pointer Events</a>
   */
  public native void setPointerCapture(int pointerId);

  /**
   * The Element.requestPointerLock() method lets you asynchronously ask for the pointer to be locked on the given element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/requestPointerLock">Element.requestPointerLock - MDN</a>
   * @see <a href="https://w3c.github.io/pointerlock/#dom-element-requestpointerlock">requestPointerLock() - Pointer Lock</a>
   */
  public native void requestPointerLock();

  /**
   * The Element.requestFullscreen() method issues an asynchronous request to make the element be displayed in full-screen mode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/requestFullscreen">Element.requestFullscreen - MDN</a>
   * @see <a href="https://fullscreen.spec.whatwg.org/#dom-element-requestfullscreen">Element.requestFullscreen() - Fullscreen API</a>
   */
  @Nonnull
  public native Promise<Void> requestFullscreen(@Nonnull FullscreenOptions options);

  /**
   * The Element.requestFullscreen() method issues an asynchronous request to make the element be displayed in full-screen mode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/requestFullscreen">Element.requestFullscreen - MDN</a>
   * @see <a href="https://fullscreen.spec.whatwg.org/#dom-element-requestfullscreen">Element.requestFullscreen() - Fullscreen API</a>
   */
  @Nonnull
  public native Promise<Void> requestFullscreen();

  /**
   * The ParentNode.append() method inserts a set of Node objects or DOMString objects after the last child of the ParentNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ParentNode/append">ParentNode.append - MDN</a>
   */
  public native void append(@Nonnull Node... nodes);

  /**
   * The ParentNode.append() method inserts a set of Node objects or DOMString objects after the last child of the ParentNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ParentNode/append">ParentNode.append - MDN</a>
   */
  public native void append(@Nonnull String... nodes);

  /**
   * The ParentNode.prepend() method inserts a set of Node objects or DOMString objects before the first child of the ParentNode. DOMString objects are inserted as equivalent Text nodes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ParentNode/prepend">ParentNode.prepend - MDN</a>
   */
  public native void prepend(@Nonnull Node... nodes);

  /**
   * The ParentNode.prepend() method inserts a set of Node objects or DOMString objects before the first child of the ParentNode. DOMString objects are inserted as equivalent Text nodes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ParentNode/prepend">ParentNode.prepend - MDN</a>
   */
  public native void prepend(@Nonnull String... nodes);

  /**
   * The querySelector() method of the Element interface returns the first element that is a descendant of the element on which it is invoked that matches the specified group of selectors.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/querySelector">Element.querySelector - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-parentnode-queryselectorall">querySelector() - DOM</a>
   * @see <a href="https://dev.w3.org/2006/webapi/selectors-api2/#queryselectorall">querySelectorAll() - Selectors API Level 2</a>
   * @see <a href="https://www.w3.org/TR/selectors-api/#queryselectorall">querySelectorAll() - Selectors API Level 1</a>
   */
  @Nullable
  public native Element querySelector(@Nonnull String selectors);

  /**
   * The Element method querySelectorAll() returns a static (not live) NodeList representing a list of elements matching the specified group of selectors which are descendants of the element on which the method was called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/querySelectorAll">Element.querySelectorAll - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-parentnode-queryselectorall">ParentNode.querySelectorAll() - DOM</a>
   * @see <a href="https://dev.w3.org/2006/webapi/selectors-api2/#dom-parentnode-queryselectorall">ParentNode.querySelectorAll() - Selectors API Level 2</a>
   * @see <a href="https://www.w3.org/TR/dom/#dom-parentnode-queryselectorall">ParentNode.querySelectorAll() - DOM4</a>
   * @see <a href="https://www.w3.org/TR/selectors-api/#interface-definitions">document.querySelector() - Selectors API Level 1</a>
   */
  @Nonnull
  public native NodeList querySelectorAll(@Nonnull String selectors);

  /**
   * The ParentNode.replaceChildren() method replaces the existing children of a Node with a specified new set of children. These can be DOMString or Node objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ParentNode/replaceChildren">ParentNode.replaceChildren - MDN</a>
   */
  public native void replaceChildren(@Nonnull Node... nodes);

  /**
   * The ParentNode.replaceChildren() method replaces the existing children of a Node with a specified new set of children. These can be DOMString or Node objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ParentNode/replaceChildren">ParentNode.replaceChildren - MDN</a>
   */
  public native void replaceChildren(@Nonnull String... nodes);

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
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/remove">Element.remove - MDN</a>
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

  /**
   * The Element interface's animate() method is a shortcut method which creates a new Animation, applies it to the element, then plays the animation. It returns the created Animation object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/animate">Element.animate - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-2/#dom-keyframeeffect-iterationcomposite">KeyframeAnimationOptions.iterationComposite - Web Animations Level 2</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#animatable">animate() - Web Animations</a>
   */
  @Nonnull
  public native Animation animate(@Nullable Object keyframes, double options);

  /**
   * The Element interface's animate() method is a shortcut method which creates a new Animation, applies it to the element, then plays the animation. It returns the created Animation object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/animate">Element.animate - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-2/#dom-keyframeeffect-iterationcomposite">KeyframeAnimationOptions.iterationComposite - Web Animations Level 2</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#animatable">animate() - Web Animations</a>
   */
  @Nonnull
  public native Animation animate(@Nullable Object keyframes,
      @Nonnull KeyframeAnimationOptions options);

  /**
   * The Element interface's animate() method is a shortcut method which creates a new Animation, applies it to the element, then plays the animation. It returns the created Animation object instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/animate">Element.animate - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-2/#dom-keyframeeffect-iterationcomposite">KeyframeAnimationOptions.iterationComposite - Web Animations Level 2</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#animatable">animate() - Web Animations</a>
   */
  @Nonnull
  public native Animation animate(@Nullable Object keyframes);

  /**
   * The getAnimations() method of the Element interface (specified on the Animatable mixin) returns an array of all Animation objects affecting this element or which are scheduled to do so in future. It can optionally return Animation objects for descendant elements too.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Element/getAnimations">Element.getAnimations - MDN</a>
   * @see <a href="https://drafts.csswg.org/web-animations-1/#dom-animatable-getanimations">Animatable.getAnimations() - Web Animations</a>
   */
  @Nonnull
  public native JsArray<Animation> getAnimations();

  @JsOverlay
  public final void addCancelListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "cancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCancelListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "cancel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addCancelListener(@Nonnull final EventListener callback) {
    addEventListener( "cancel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeCancelListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "cancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCancelListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "cancel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeCancelListener(@Nonnull final EventListener callback) {
    removeEventListener( "cancel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addFullscreenchangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "fullscreenchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addFullscreenchangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "fullscreenchange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addFullscreenchangeListener(@Nonnull final EventListener callback) {
    addEventListener( "fullscreenchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeFullscreenchangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "fullscreenchange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeFullscreenchangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "fullscreenchange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeFullscreenchangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "fullscreenchange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addFullscreenerrorListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "fullscreenerror", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addFullscreenerrorListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "fullscreenerror", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addFullscreenerrorListener(@Nonnull final EventListener callback) {
    addEventListener( "fullscreenerror", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeFullscreenerrorListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "fullscreenerror", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeFullscreenerrorListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "fullscreenerror", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeFullscreenerrorListener(@Nonnull final EventListener callback) {
    removeEventListener( "fullscreenerror", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addScrollListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "scroll", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addScrollListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "scroll", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addScrollListener(@Nonnull final EventListener callback) {
    addEventListener( "scroll", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeScrollListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "scroll", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeScrollListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "scroll", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeScrollListener(@Nonnull final EventListener callback) {
    removeEventListener( "scroll", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addShowListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "show", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addShowListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "show", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addShowListener(@Nonnull final EventListener callback) {
    addEventListener( "show", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeShowListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "show", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeShowListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "show", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeShowListener(@Nonnull final EventListener callback) {
    removeEventListener( "show", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addDOMActivateListener(@Nonnull final MouseEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "DOMActivate", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDOMActivateListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    addEventListener( "DOMActivate", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addDOMActivateListener(@Nonnull final MouseEventListener callback) {
    addEventListener( "DOMActivate", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDOMActivateListener(@Nonnull final MouseEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "DOMActivate", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDOMActivateListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    removeEventListener( "DOMActivate", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeDOMActivateListener(@Nonnull final MouseEventListener callback) {
    removeEventListener( "DOMActivate", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addAuxclickListener(@Nonnull final MouseEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "auxclick", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAuxclickListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    addEventListener( "auxclick", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addAuxclickListener(@Nonnull final MouseEventListener callback) {
    addEventListener( "auxclick", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAuxclickListener(@Nonnull final MouseEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "auxclick", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAuxclickListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    removeEventListener( "auxclick", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeAuxclickListener(@Nonnull final MouseEventListener callback) {
    removeEventListener( "auxclick", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addBlurListener(@Nonnull final FocusEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "blur", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addBlurListener(@Nonnull final FocusEventListener callback,
      final boolean useCapture) {
    addEventListener( "blur", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addBlurListener(@Nonnull final FocusEventListener callback) {
    addEventListener( "blur", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeBlurListener(@Nonnull final FocusEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "blur", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeBlurListener(@Nonnull final FocusEventListener callback,
      final boolean useCapture) {
    removeEventListener( "blur", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeBlurListener(@Nonnull final FocusEventListener callback) {
    removeEventListener( "blur", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addClickListener(@Nonnull final MouseEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "click", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addClickListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    addEventListener( "click", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addClickListener(@Nonnull final MouseEventListener callback) {
    addEventListener( "click", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeClickListener(@Nonnull final MouseEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "click", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeClickListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    removeEventListener( "click", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeClickListener(@Nonnull final MouseEventListener callback) {
    removeEventListener( "click", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addCompositionendListener(@Nonnull final CompositionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "compositionend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCompositionendListener(@Nonnull final CompositionEventListener callback,
      final boolean useCapture) {
    addEventListener( "compositionend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addCompositionendListener(@Nonnull final CompositionEventListener callback) {
    addEventListener( "compositionend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeCompositionendListener(@Nonnull final CompositionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "compositionend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCompositionendListener(@Nonnull final CompositionEventListener callback,
      final boolean useCapture) {
    removeEventListener( "compositionend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeCompositionendListener(@Nonnull final CompositionEventListener callback) {
    removeEventListener( "compositionend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addCompositionstartListener(@Nonnull final CompositionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "compositionstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCompositionstartListener(@Nonnull final CompositionEventListener callback,
      final boolean useCapture) {
    addEventListener( "compositionstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addCompositionstartListener(@Nonnull final CompositionEventListener callback) {
    addEventListener( "compositionstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeCompositionstartListener(@Nonnull final CompositionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "compositionstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCompositionstartListener(@Nonnull final CompositionEventListener callback,
      final boolean useCapture) {
    removeEventListener( "compositionstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeCompositionstartListener(
      @Nonnull final CompositionEventListener callback) {
    removeEventListener( "compositionstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addCompositionupdateListener(@Nonnull final CompositionEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "compositionupdate", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCompositionupdateListener(@Nonnull final CompositionEventListener callback,
      final boolean useCapture) {
    addEventListener( "compositionupdate", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addCompositionupdateListener(@Nonnull final CompositionEventListener callback) {
    addEventListener( "compositionupdate", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeCompositionupdateListener(
      @Nonnull final CompositionEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "compositionupdate", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCompositionupdateListener(
      @Nonnull final CompositionEventListener callback, final boolean useCapture) {
    removeEventListener( "compositionupdate", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeCompositionupdateListener(
      @Nonnull final CompositionEventListener callback) {
    removeEventListener( "compositionupdate", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addContextmenuListener(@Nonnull final MouseEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "contextmenu", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addContextmenuListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    addEventListener( "contextmenu", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addContextmenuListener(@Nonnull final MouseEventListener callback) {
    addEventListener( "contextmenu", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeContextmenuListener(@Nonnull final MouseEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "contextmenu", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeContextmenuListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    removeEventListener( "contextmenu", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeContextmenuListener(@Nonnull final MouseEventListener callback) {
    removeEventListener( "contextmenu", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addCopyListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "copy", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCopyListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    addEventListener( "copy", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addCopyListener(@Nonnull final ClipboardEventListener callback) {
    addEventListener( "copy", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeCopyListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "copy", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCopyListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    removeEventListener( "copy", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeCopyListener(@Nonnull final ClipboardEventListener callback) {
    removeEventListener( "copy", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addCutListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "cut", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addCutListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    addEventListener( "cut", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addCutListener(@Nonnull final ClipboardEventListener callback) {
    addEventListener( "cut", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeCutListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "cut", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeCutListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    removeEventListener( "cut", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeCutListener(@Nonnull final ClipboardEventListener callback) {
    removeEventListener( "cut", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addDblclickListener(@Nonnull final MouseEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "dblclick", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addDblclickListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    addEventListener( "dblclick", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addDblclickListener(@Nonnull final MouseEventListener callback) {
    addEventListener( "dblclick", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeDblclickListener(@Nonnull final MouseEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "dblclick", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeDblclickListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    removeEventListener( "dblclick", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeDblclickListener(@Nonnull final MouseEventListener callback) {
    removeEventListener( "dblclick", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addFocusListener(@Nonnull final FocusEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "focus", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addFocusListener(@Nonnull final FocusEventListener callback,
      final boolean useCapture) {
    addEventListener( "focus", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addFocusListener(@Nonnull final FocusEventListener callback) {
    addEventListener( "focus", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeFocusListener(@Nonnull final FocusEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "focus", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeFocusListener(@Nonnull final FocusEventListener callback,
      final boolean useCapture) {
    removeEventListener( "focus", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeFocusListener(@Nonnull final FocusEventListener callback) {
    removeEventListener( "focus", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addFocusinListener(@Nonnull final FocusEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "focusin", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addFocusinListener(@Nonnull final FocusEventListener callback,
      final boolean useCapture) {
    addEventListener( "focusin", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addFocusinListener(@Nonnull final FocusEventListener callback) {
    addEventListener( "focusin", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeFocusinListener(@Nonnull final FocusEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "focusin", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeFocusinListener(@Nonnull final FocusEventListener callback,
      final boolean useCapture) {
    removeEventListener( "focusin", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeFocusinListener(@Nonnull final FocusEventListener callback) {
    removeEventListener( "focusin", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addFocusoutListener(@Nonnull final FocusEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "focusout", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addFocusoutListener(@Nonnull final FocusEventListener callback,
      final boolean useCapture) {
    addEventListener( "focusout", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addFocusoutListener(@Nonnull final FocusEventListener callback) {
    addEventListener( "focusout", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeFocusoutListener(@Nonnull final FocusEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "focusout", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeFocusoutListener(@Nonnull final FocusEventListener callback,
      final boolean useCapture) {
    removeEventListener( "focusout", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeFocusoutListener(@Nonnull final FocusEventListener callback) {
    removeEventListener( "focusout", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addMousedownListener(@Nonnull final MouseEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "mousedown", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMousedownListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    addEventListener( "mousedown", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addMousedownListener(@Nonnull final MouseEventListener callback) {
    addEventListener( "mousedown", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeMousedownListener(@Nonnull final MouseEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "mousedown", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMousedownListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    removeEventListener( "mousedown", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeMousedownListener(@Nonnull final MouseEventListener callback) {
    removeEventListener( "mousedown", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addMouseenterListener(@Nonnull final MouseEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "mouseenter", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMouseenterListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    addEventListener( "mouseenter", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addMouseenterListener(@Nonnull final MouseEventListener callback) {
    addEventListener( "mouseenter", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeMouseenterListener(@Nonnull final MouseEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "mouseenter", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMouseenterListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    removeEventListener( "mouseenter", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeMouseenterListener(@Nonnull final MouseEventListener callback) {
    removeEventListener( "mouseenter", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addMouseleaveListener(@Nonnull final MouseEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "mouseleave", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMouseleaveListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    addEventListener( "mouseleave", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addMouseleaveListener(@Nonnull final MouseEventListener callback) {
    addEventListener( "mouseleave", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeMouseleaveListener(@Nonnull final MouseEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "mouseleave", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMouseleaveListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    removeEventListener( "mouseleave", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeMouseleaveListener(@Nonnull final MouseEventListener callback) {
    removeEventListener( "mouseleave", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addMousemoveListener(@Nonnull final MouseEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "mousemove", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMousemoveListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    addEventListener( "mousemove", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addMousemoveListener(@Nonnull final MouseEventListener callback) {
    addEventListener( "mousemove", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeMousemoveListener(@Nonnull final MouseEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "mousemove", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMousemoveListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    removeEventListener( "mousemove", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeMousemoveListener(@Nonnull final MouseEventListener callback) {
    removeEventListener( "mousemove", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addMouseoutListener(@Nonnull final MouseEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "mouseout", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMouseoutListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    addEventListener( "mouseout", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addMouseoutListener(@Nonnull final MouseEventListener callback) {
    addEventListener( "mouseout", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeMouseoutListener(@Nonnull final MouseEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "mouseout", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMouseoutListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    removeEventListener( "mouseout", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeMouseoutListener(@Nonnull final MouseEventListener callback) {
    removeEventListener( "mouseout", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addMouseoverListener(@Nonnull final MouseEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "mouseover", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMouseoverListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    addEventListener( "mouseover", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addMouseoverListener(@Nonnull final MouseEventListener callback) {
    addEventListener( "mouseover", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeMouseoverListener(@Nonnull final MouseEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "mouseover", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMouseoverListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    removeEventListener( "mouseover", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeMouseoverListener(@Nonnull final MouseEventListener callback) {
    removeEventListener( "mouseover", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addMouseupListener(@Nonnull final MouseEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "mouseup", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMouseupListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    addEventListener( "mouseup", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addMouseupListener(@Nonnull final MouseEventListener callback) {
    addEventListener( "mouseup", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeMouseupListener(@Nonnull final MouseEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "mouseup", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMouseupListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    removeEventListener( "mouseup", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeMouseupListener(@Nonnull final MouseEventListener callback) {
    removeEventListener( "mouseup", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addPasteListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "paste", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addPasteListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    addEventListener( "paste", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addPasteListener(@Nonnull final ClipboardEventListener callback) {
    addEventListener( "paste", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removePasteListener(@Nonnull final ClipboardEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "paste", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removePasteListener(@Nonnull final ClipboardEventListener callback,
      final boolean useCapture) {
    removeEventListener( "paste", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removePasteListener(@Nonnull final ClipboardEventListener callback) {
    removeEventListener( "paste", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTouchcancelListener(@Nonnull final TouchEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "touchcancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTouchcancelListener(@Nonnull final TouchEventListener callback,
      final boolean useCapture) {
    addEventListener( "touchcancel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addTouchcancelListener(@Nonnull final TouchEventListener callback) {
    addEventListener( "touchcancel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTouchcancelListener(@Nonnull final TouchEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "touchcancel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTouchcancelListener(@Nonnull final TouchEventListener callback,
      final boolean useCapture) {
    removeEventListener( "touchcancel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeTouchcancelListener(@Nonnull final TouchEventListener callback) {
    removeEventListener( "touchcancel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTouchendListener(@Nonnull final TouchEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "touchend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTouchendListener(@Nonnull final TouchEventListener callback,
      final boolean useCapture) {
    addEventListener( "touchend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addTouchendListener(@Nonnull final TouchEventListener callback) {
    addEventListener( "touchend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTouchendListener(@Nonnull final TouchEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "touchend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTouchendListener(@Nonnull final TouchEventListener callback,
      final boolean useCapture) {
    removeEventListener( "touchend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeTouchendListener(@Nonnull final TouchEventListener callback) {
    removeEventListener( "touchend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTouchmoveListener(@Nonnull final TouchEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "touchmove", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTouchmoveListener(@Nonnull final TouchEventListener callback,
      final boolean useCapture) {
    addEventListener( "touchmove", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addTouchmoveListener(@Nonnull final TouchEventListener callback) {
    addEventListener( "touchmove", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTouchmoveListener(@Nonnull final TouchEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "touchmove", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTouchmoveListener(@Nonnull final TouchEventListener callback,
      final boolean useCapture) {
    removeEventListener( "touchmove", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeTouchmoveListener(@Nonnull final TouchEventListener callback) {
    removeEventListener( "touchmove", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTouchstartListener(@Nonnull final TouchEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "touchstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTouchstartListener(@Nonnull final TouchEventListener callback,
      final boolean useCapture) {
    addEventListener( "touchstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addTouchstartListener(@Nonnull final TouchEventListener callback) {
    addEventListener( "touchstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTouchstartListener(@Nonnull final TouchEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "touchstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTouchstartListener(@Nonnull final TouchEventListener callback,
      final boolean useCapture) {
    removeEventListener( "touchstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeTouchstartListener(@Nonnull final TouchEventListener callback) {
    removeEventListener( "touchstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addWebkitmouseforcechangedListener(@Nonnull final MouseEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "webkitmouseforcechanged", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addWebkitmouseforcechangedListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    addEventListener( "webkitmouseforcechanged", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addWebkitmouseforcechangedListener(@Nonnull final MouseEventListener callback) {
    addEventListener( "webkitmouseforcechanged", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeWebkitmouseforcechangedListener(
      @Nonnull final MouseEventListener callback, @Nonnull final EventListenerOptions options) {
    removeEventListener( "webkitmouseforcechanged", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeWebkitmouseforcechangedListener(
      @Nonnull final MouseEventListener callback, final boolean useCapture) {
    removeEventListener( "webkitmouseforcechanged", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeWebkitmouseforcechangedListener(
      @Nonnull final MouseEventListener callback) {
    removeEventListener( "webkitmouseforcechanged", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addWebkitmouseforcedownListener(@Nonnull final MouseEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "webkitmouseforcedown", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addWebkitmouseforcedownListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    addEventListener( "webkitmouseforcedown", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addWebkitmouseforcedownListener(@Nonnull final MouseEventListener callback) {
    addEventListener( "webkitmouseforcedown", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeWebkitmouseforcedownListener(@Nonnull final MouseEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "webkitmouseforcedown", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeWebkitmouseforcedownListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    removeEventListener( "webkitmouseforcedown", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeWebkitmouseforcedownListener(@Nonnull final MouseEventListener callback) {
    removeEventListener( "webkitmouseforcedown", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addWebkitmouseforceupListener(@Nonnull final MouseEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "webkitmouseforceup", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addWebkitmouseforceupListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    addEventListener( "webkitmouseforceup", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addWebkitmouseforceupListener(@Nonnull final MouseEventListener callback) {
    addEventListener( "webkitmouseforceup", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeWebkitmouseforceupListener(@Nonnull final MouseEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "webkitmouseforceup", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeWebkitmouseforceupListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    removeEventListener( "webkitmouseforceup", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeWebkitmouseforceupListener(@Nonnull final MouseEventListener callback) {
    removeEventListener( "webkitmouseforceup", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addWebkitmouseforcewillbeginListener(@Nonnull final MouseEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "webkitmouseforcewillbegin", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addWebkitmouseforcewillbeginListener(@Nonnull final MouseEventListener callback,
      final boolean useCapture) {
    addEventListener( "webkitmouseforcewillbegin", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addWebkitmouseforcewillbeginListener(
      @Nonnull final MouseEventListener callback) {
    addEventListener( "webkitmouseforcewillbegin", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeWebkitmouseforcewillbeginListener(
      @Nonnull final MouseEventListener callback, @Nonnull final EventListenerOptions options) {
    removeEventListener( "webkitmouseforcewillbegin", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeWebkitmouseforcewillbeginListener(
      @Nonnull final MouseEventListener callback, final boolean useCapture) {
    removeEventListener( "webkitmouseforcewillbegin", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeWebkitmouseforcewillbeginListener(
      @Nonnull final MouseEventListener callback) {
    removeEventListener( "webkitmouseforcewillbegin", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addWheelListener(@Nonnull final WheelEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "wheel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addWheelListener(@Nonnull final WheelEventListener callback,
      final boolean useCapture) {
    addEventListener( "wheel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addWheelListener(@Nonnull final WheelEventListener callback) {
    addEventListener( "wheel", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeWheelListener(@Nonnull final WheelEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "wheel", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeWheelListener(@Nonnull final WheelEventListener callback,
      final boolean useCapture) {
    removeEventListener( "wheel", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeWheelListener(@Nonnull final WheelEventListener callback) {
    removeEventListener( "wheel", Js.cast( callback ) );
  }
}
