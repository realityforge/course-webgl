package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The DOM Node interface is an abstract base class upon which many other DOM API objects are based, thus letting those object types to be used similarly and often interchangeably.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node">Node - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#interface-node">The definition of 'Node' in the 'DOM' specification.</a>
 * @see <a href="https://www.w3.org/TR/dom/#interface-node">The definition of 'Node' in the 'DOM4' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-1950641247">The definition of 'Node' in the 'Document Object Model (DOM) Level 3 Core Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-1950641247">The definition of 'Node' in the 'Document Object Model (DOM) Level 2 Core Specification' specification.</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-core.html#ID-1950641247">The definition of 'Node' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Node"
)
public class Node extends EventTarget {
  @JsOverlay
  public static final int ATTRIBUTE_NODE = 2;

  @JsOverlay
  public static final int CDATA_SECTION_NODE = 4;

  @JsOverlay
  public static final int COMMENT_NODE = 8;

  @JsOverlay
  public static final int DOCUMENT_FRAGMENT_NODE = 11;

  @JsOverlay
  public static final int DOCUMENT_NODE = 9;

  @JsOverlay
  public static final int DOCUMENT_POSITION_CONTAINED_BY = 0x10;

  @JsOverlay
  public static final int DOCUMENT_POSITION_CONTAINS = 0x08;

  @JsOverlay
  public static final int DOCUMENT_POSITION_DISCONNECTED = 0x01;

  @JsOverlay
  public static final int DOCUMENT_POSITION_FOLLOWING = 0x04;

  @JsOverlay
  public static final int DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC = 0x20;

  @JsOverlay
  public static final int DOCUMENT_POSITION_PRECEDING = 0x02;

  @JsOverlay
  public static final int DOCUMENT_TYPE_NODE = 10;

  @JsOverlay
  public static final int ELEMENT_NODE = 1;

  @JsOverlay
  public static final int ENTITY_NODE = 6;

  @JsOverlay
  public static final int ENTITY_REFERENCE_NODE = 5;

  @JsOverlay
  public static final int NOTATION_NODE = 12;

  @JsOverlay
  public static final int PROCESSING_INSTRUCTION_NODE = 7;

  @JsOverlay
  public static final int TEXT_NODE = 3;

  /**
   * The nodeValue property of the Node interface returns or sets the value of the current node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/nodeValue">Node.nodeValue - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-nodevalue">The definition of 'Node: nodeValue' in the 'DOM' specification.</a>
   */
  @Nullable
  public String nodeValue;

  /**
   * The textContent property of the Node interface represents the text content of the node and its descendants.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/textContent">Node.textContent - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-textcontent">The definition of 'Node.textContent' in the 'DOM' specification.</a>
   */
  @Nullable
  public String textContent;

  protected Node() {
  }

  /**
   * The baseURI read-only property returns the absolute base URL of a Node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/baseURI">Node.baseURI - MDN</a>
   */
  @JsProperty(
      name = "baseURI"
  )
  @Nonnull
  public native String baseURI();

  /**
   * The Node.childNodes read-only property returns a live NodeList of child nodes of the given element where the first child node is assigned index 0.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/childNodes">Node.childNodes - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-childnodes">The definition of 'Node.childNodes' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-1451460987">The definition of 'Node.childNodes' in the 'Document Object Model (DOM) Level 3 Core Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-1451460987">The definition of 'Node.childNodes' in the 'Document Object Model (DOM) Level 2 Core Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-core.html#ID-1451460987">The definition of 'Node.childNodes' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  @JsProperty(
      name = "childNodes"
  )
  @Nonnull
  public native NodeList childNodes();

  /**
   * The Node.firstChild read-only property returns the node's first child in the tree, or null if the node has no children.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/firstChild">Node.firstChild - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-firstchild">The definition of 'Node.firstChild' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-169727388">The definition of 'Node.firstChild' in the 'Document Object Model (DOM) Level 3 Core Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-169727388">The definition of 'Node.firstChild' in the 'Document Object Model (DOM) Level 2 Core Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-core.html#ID-169727388">The definition of 'Node.firstChild' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  @JsProperty(
      name = "firstChild"
  )
  @Nullable
  public native Node firstChild();

  /**
   * The isConnected read-only property of the Node interface returns a boolean indicating whether the node is connected (directly or indirectly) to the context object, for example the Document object in the case of the normal DOM, or the ShadowRoot in the case of a shadow DOM.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/isConnected">Node.isConnected - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-isconnected">The definition of 'isConnected' in the 'DOM' specification.</a>
   */
  @JsProperty(
      name = "isConnected"
  )
  public native boolean isConnected();

  /**
   * The Node.lastChild read-only property returns the last child of the node. If its parent is an element, then the child is generally an element node, a text node, or a comment node. It returns null if there are no child elements.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/lastChild">Node.lastChild - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-lastchild">The definition of 'Node.lastChild' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-61AD09FB">The definition of 'Node.lastChild' in the 'Document Object Model (DOM) Level 3 Core Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-61AD09FB">The definition of 'Node.lastChild' in the 'Document Object Model (DOM) Level 2 Core Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-core.html#ID-61AD09FB">The definition of 'Node.lastChild' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  @JsProperty(
      name = "lastChild"
  )
  @Nullable
  public native Node lastChild();

  /**
   * The Node.nextSibling read-only property returns the node immediately following the specified one in their parent's childNodes, or returns null if the specified node is the last child in the parent element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/nextSibling">Node.nextSibling - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-nextsibling">The definition of 'Node.nextSibling' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-6AC54C2F">The definition of 'Node.nextSibling' in the 'Document Object Model (DOM) Level 2 Core Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-core.html#attribute-nextSibling">The definition of 'Node.nextSibling' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  @JsProperty(
      name = "nextSibling"
  )
  @Nullable
  public native Node nextSibling();

  /**
   * The nodeName read-only property returns the name of the current Node as a string.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/nodeName">Node.nodeName - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-nodename">The definition of 'nodeName' in the 'DOM' specification.</a>
   */
  @JsProperty(
      name = "nodeName"
  )
  @Nonnull
  public native String nodeName();

  /**
   * The read-only Node.nodeType property is an integer that identifies what the node is. It distinguishes different kind of nodes from each other, such as elements, text and comments.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/nodeType">Node.nodeType - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-nodetype">The definition of 'Node.nodeType' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-1950641247">The definition of 'Node.nodeType' in the 'Document Object Model (DOM) Level 3 Core Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-111237558">The definition of 'Node.nodeType' in the 'Document Object Model (DOM) Level 2 Core Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-core.html#ID-111237558">The definition of 'Node.nodeType' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  @JsProperty(
      name = "nodeType"
  )
  @NodeType
  public native int nodeType();

  /**
   * The ownerDocument read-only property of the Node interface returns the top-level document object of the node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/ownerDocument">Node.ownerDocument - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-ownerdocument">The definition of 'Node: ownerDocument' in the 'DOM' specification.</a>
   */
  @JsProperty(
      name = "ownerDocument"
  )
  @Nullable
  public native Document ownerDocument();

  /**
   * The Node.parentElement read-only property returns the DOM node's parent Element, or null if the node either has no parent, or its parent isn't a DOM Element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/parentElement">Node.parentElement - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-parentelement">The definition of 'parentElement' in the 'DOM' specification.</a>
   */
  @JsProperty(
      name = "parentElement"
  )
  @Nullable
  public native Element parentElement();

  /**
   * The Node.parentNode read-only property returns the parent of the specified node in the DOM tree.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/parentNode">Node.parentNode - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-parentnode">The definition of 'Node: parentNode' in the 'DOM' specification.</a>
   */
  @JsProperty(
      name = "parentNode"
  )
  @Nullable
  public native Node parentNode();

  /**
   * The Node.previousSibling read-only property returns the node immediately preceding the specified one in its parent's childNodes list, or null if the specified node is the first in that list.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/previousSibling">Node.previousSibling - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-previoussibling">The definition of 'Node.previousSibling' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-640FB3C8">The definition of 'Node.previousSibling' in the 'Document Object Model (DOM) Level 3 Core Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-640FB3C8">The definition of 'Node.previousSibling' in the 'Document Object Model (DOM) Level 2 Core Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-core.html#attribute-previousSibling">The definition of 'Node.previousSibling' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  @JsProperty(
      name = "previousSibling"
  )
  @Nullable
  public native Node previousSibling();

  /**
   * The Node.appendChild() method adds a node to the end of the list of children of a specified parent node. If the given child is a reference to an existing node in the document, appendChild() moves it from its current position to the new position (there is no requirement to remove the node from its parent node before appending it to some other node).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/appendChild">Node.appendChild - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-appendchild">The definition of 'Node.appendChild()' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-184E7107">The definition of 'Node.appendChild()' in the 'Document Object Model (DOM) Level 3 Core Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-184E7107">The definition of 'Node.appendChild()' in the 'Document Object Model (DOM) Level 2 Core Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-core.html#ID-184E7107">The definition of 'Node.appendChild()' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  @Nonnull
  public native Node appendChild(@Nonnull Node node);

  /**
   * The Node.cloneNode() method returns a duplicate of the node on which this method was called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/cloneNode">Node.cloneNode - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-clonenode">The definition of 'Node.cloneNode()' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-3A0ED0A4">The definition of 'Node.cloneNode()' in the 'Document Object Model (DOM) Level 3 Core Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-3A0ED0A4">The definition of 'Node.cloneNode()' in the 'Document Object Model (DOM) Level 2 Core Specification' specification.</a>
   */
  @Nonnull
  public native Node cloneNode(boolean deep);

  /**
   * The Node.cloneNode() method returns a duplicate of the node on which this method was called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/cloneNode">Node.cloneNode - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-clonenode">The definition of 'Node.cloneNode()' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-3A0ED0A4">The definition of 'Node.cloneNode()' in the 'Document Object Model (DOM) Level 3 Core Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-3A0ED0A4">The definition of 'Node.cloneNode()' in the 'Document Object Model (DOM) Level 2 Core Specification' specification.</a>
   */
  @Nonnull
  public native Node cloneNode();

  /**
   * The Node.compareDocumentPosition() method reports the position of the given node relative to another node in any document &mdash; not just the given node&rsquo;s document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/compareDocumentPosition">Node.compareDocumentPosition - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-comparedocumentposition">The definition of 'Node.compareDocumentPosition()' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#Node3-compareDocumentPosition">The definition of 'Node.compareDocumentPosition()' in the 'Document Object Model (DOM) Level 3 Core Specification' specification.</a>
   */
  public native int compareDocumentPosition(@Nonnull Node other);

  /**
   * The Node.contains() method returns a Boolean value indicating whether a node is a descendant of a given node, i.e. the node itself, one of its direct children (childNodes), one of the children's direct children, and so on.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/contains">Node.contains - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-contains">The definition of 'Node.contains()' in the 'DOM' specification.</a>
   */
  public native boolean contains(@Nullable Node other);

  /**
   * The getRootNode() method of the Node interface returns the context object's root, which optionally includes the shadow root if it is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/getRootNode">Node.getRootNode - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-getrootnode">The definition of 'getRootNode()' in the 'DOM' specification.</a>
   */
  @Nonnull
  public native Node getRootNode(@Nonnull GetRootNodeOptions options);

  /**
   * The getRootNode() method of the Node interface returns the context object's root, which optionally includes the shadow root if it is available.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/getRootNode">Node.getRootNode - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-getrootnode">The definition of 'getRootNode()' in the 'DOM' specification.</a>
   */
  @Nonnull
  public native Node getRootNode();

  /**
   * The Node.hasChildNodes() method returns a Boolean value indicating whether the given Node has child nodes or not.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/hasChildNodes">Node.hasChildNodes - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-haschildnodes">The definition of 'Node: hasChildNodes' in the 'DOM' specification.</a>
   */
  public native boolean hasChildNodes();

  /**
   * The Node.insertBefore() method inserts a node before a reference node as a child of a specified parent node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/insertBefore">Node.insertBefore - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-insertbefore">The definition of 'Node.insertBefore' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/dom/#dom-node-insertbefore">The definition of 'Node.insertBefore' in the 'DOM4' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#ID-952280727">The definition of 'Node.insertBefore' in the 'Document Object Model (DOM) Level 3 Core Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-952280727">The definition of 'Node.insertBefore' in the 'Document Object Model (DOM) Level 2 Core Specification' specification.</a>
   * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-core.html#method-insertBefore">The definition of 'Node.insertBefore' in the 'Document Object Model (DOM) Level 1 Specification' specification.</a>
   */
  @Nonnull
  public native Node insertBefore(@Nonnull Node node, @Nullable Node child);

  /**
   * The Node.isDefaultNamespace() method accepts a namespace URI as an argument and returns a Boolean with a value of true if the namespace is the default namespace on the given node or false if not.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/isDefaultNamespace">Node.isDefaultNamespace - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-isdefaultnamespace">The definition of 'Node: isDefaultNamespace' in the 'DOM' specification.</a>
   */
  public native boolean isDefaultNamespace(@Nullable String namespace);

  /**
   * The Node.isEqualNode() method tests whether two nodes are equal. Two nodes are equal when they have the same type, defining characteristics (for elements, this would be their ID, number of children, and so forth), its attributes match, and so on. The specific set of data points that must match varies depending on the types of the nodes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/isEqualNode">Node.isEqualNode - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-isequalnode">The definition of 'Node.isEqualNode' in the 'DOM' specification.</a>
   */
  public native boolean isEqualNode(@Nullable Node otherNode);

  /**
   * The isSameNode() method for Node objects tests whether two nodes are the same (that is, whether they reference the same object).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/isSameNode">Node.isSameNode - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-issamenode">The definition of 'Node: isSameNode' in the 'DOM' specification.</a>
   * @see <a href="https://www.w3.org/TR/DOM-Level-3-Core/core.html#Node3-isSameNode">The definition of 'Node.isSameNode()' in the 'Document Object Model (DOM) Level 3 Core Specification' specification.</a>
   */
  public native boolean isSameNode(@Nullable Node otherNode);

  /**
   * The Node.lookupNamespaceURI() method accepts a prefix and returns the namespace URI associated with it on the given node if found (and null if not).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/lookupNamespaceURI">Node.lookupNamespaceURI - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-lookupnamespaceuri">The definition of 'Node: lookupNamespaceURI' in the 'DOM' specification.</a>
   */
  @Nullable
  public native String lookupNamespaceURI(@Nullable String prefix);

  /**
   * The Node.lookupPrefix() method returns a DOMString containing the prefix for a given namespace URI, if present, and null if not. When multiple prefixes are possible, the result is implementation-dependent.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/lookupPrefix">Node.lookupPrefix - MDN</a>
   */
  @Nullable
  public native String lookupPrefix(@Nullable String namespace);

  /**
   * The Node.normalize() method puts the specified node and all of its sub-tree into a &quot;normalized&quot; form. In a normalized sub-tree, no text nodes in the sub-tree are empty and there are no adjacent text nodes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/normalize">Node.normalize - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-normalize">The definition of 'Node: normalize' in the 'DOM' specification.</a>
   */
  public native void normalize();

  /**
   * The Node.removeChild() method removes a child node from the DOM and returns the removed node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/removeChild">Node.removeChild - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-removechild">The definition of 'Node: removeChild' in the 'DOM' specification.</a>
   */
  @Nonnull
  public native Node removeChild(@Nonnull Node child);

  /**
   * The Node.replaceChild() method replaces a child node within the given (parent) node.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Node/replaceChild">Node.replaceChild - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-node-replacechild">The definition of 'Node: replaceChild' in the 'DOM' specification.</a>
   */
  @Nonnull
  public native Node replaceChild(@Nonnull Node node, @Nonnull Node child);
}
