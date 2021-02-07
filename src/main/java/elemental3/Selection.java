package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * A Selection object represents the range of text selected by the user or the current position of the caret. To obtain a Selection object for examination or manipulation, call window.getSelection().
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection">Selection - MDN</a>
 * @see <a href="https://w3c.github.io/selection-api/#selection-interface">Selection - Selection API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Selection"
)
public class Selection {
  protected Selection() {
  }

  /**
   * The Selection.anchorNode read-only property returns the Node in which the selection begins.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/anchorNode">Selection.anchorNode - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-anchornode">Selection.anchorNode - Selection API</a>
   */
  @JsProperty(
      name = "anchorNode"
  )
  @Nullable
  public native Node anchorNode();

  /**
   * The Selection.anchorOffset read-only property returns the number of characters that the selection's anchor is offset within the Selection.anchorNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/anchorOffset">Selection.anchorOffset - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-anchoroffset">Selection.anchorOffset - Selection API</a>
   */
  @JsProperty(
      name = "anchorOffset"
  )
  public native int anchorOffset();

  /**
   * The Selection.focusNode read-only property returns the Node in which the selection ends.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/focusNode">Selection.focusNode - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-focusnode">Selection.focusNode - Selection API</a>
   */
  @JsProperty(
      name = "focusNode"
  )
  @Nullable
  public native Node focusNode();

  /**
   * The Selection.focusOffset read-only property returns the number of characters that the selection's focus is offset within the Selection.focusNode.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/focusOffset">Selection.focusOffset - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-focusoffset">Selection.focusOffset - Selection API</a>
   */
  @JsProperty(
      name = "focusOffset"
  )
  public native int focusOffset();

  /**
   * The Selection.isCollapsed read-only property returns a Boolean which indicates whether or not there is currently any text selected. No text is selected when the selection's start and end points are at the same position in the content.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/isCollapsed">Selection.isCollapsed - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-iscollapsed">Selection.isCollapsed - Selection API</a>
   */
  @JsProperty(
      name = "isCollapsed"
  )
  public native boolean isCollapsed();

  /**
   * The Selection.rangeCount read-only property returns the number of ranges in the selection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/rangeCount">Selection.rangeCount - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-rangecount">Selection.rangeCount - Selection API</a>
   */
  @JsProperty(
      name = "rangeCount"
  )
  public native int rangeCount();

  /**
   * The type read-only property of the Selection interface returns a DOMString describing the type of the current selection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/type">Selection.type - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-type">Selection.type - Selection API</a>
   */
  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();

  /**
   * The Selection.addRange() method adds a Range to a Selection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/addRange">Selection.addRange - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-addrange">Selection.addRange() - Selection API</a>
   */
  public native void addRange(@Nonnull Range range);

  /**
   * The Selection.collapse() method collapses the current selection to a single point. The document is not modified. If the content is focused and editable, the caret will blink there.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/collapse">Selection.collapse - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-collapse">Selection.collapse() - Selection API</a>
   */
  public native void collapse(@Nullable Node node, int offset);

  /**
   * The Selection.collapse() method collapses the current selection to a single point. The document is not modified. If the content is focused and editable, the caret will blink there.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/collapse">Selection.collapse - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-collapse">Selection.collapse() - Selection API</a>
   */
  public native void collapse(@Nullable Node node);

  /**
   * The Selection.collapseToEnd() method collapses the selection to the end of the last range in the selection. If the content of the selection is focused and editable, the caret will blink there.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/collapseToEnd">Selection.collapseToEnd - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-collapsetoend">Selection.collapseToEnd() - Selection API</a>
   */
  public native void collapseToEnd();

  /**
   * The Selection.collapseToStart() method collapses the selection to the start of the first range in the selection. If the content of the selection is focused and editable, the caret will blink there.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/collapseToStart">Selection.collapseToStart - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-collapsetostart">Selection.collapseToStart() - Selection API</a>
   */
  public native void collapseToStart();

  /**
   * The Selection.containsNode() method indicates whether a specfied node is part of the selection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/containsNode">Selection.containsNode - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-containsnode">Selection.containsNode() - Selection API</a>
   */
  public native boolean containsNode(@Nonnull Node node, boolean allowPartialContainment);

  /**
   * The Selection.containsNode() method indicates whether a specfied node is part of the selection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/containsNode">Selection.containsNode - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-containsnode">Selection.containsNode() - Selection API</a>
   */
  public native boolean containsNode(@Nonnull Node node);

  /**
   * The deleteFromDocument() method of the Selection interface deletes the selected text from the document's DOM.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/deleteFromDocument">Selection.deleteFromDocument - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-deletefromdocument">Selection.deleteFromDocument() - Selection API</a>
   */
  public native void deleteFromDocument();

  /**
   * The Selection.removeAllRanges() method removes all ranges from the selection, leaving the anchorNode and focusNode properties equal to null and leaving nothing selected.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/empty">Selection.empty - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-removeallranges">Selection.removeAllRanges() - Selection API</a>
   */
  public native void empty();

  /**
   * The Selection.extend() method moves the focus of the selection to a specified point. The anchor of the selection does not move. The selection will be from the anchor to the new focus, regardless of direction.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/extend">Selection.extend - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-extend">Selection.extend() - Selection API</a>
   */
  public native void extend(@Nonnull Node node, int offset);

  /**
   * The Selection.extend() method moves the focus of the selection to a specified point. The anchor of the selection does not move. The selection will be from the anchor to the new focus, regardless of direction.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/extend">Selection.extend - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-extend">Selection.extend() - Selection API</a>
   */
  public native void extend(@Nonnull Node node);

  /**
   * The Selection.getRangeAt() method returns a range object representing one of the ranges currently selected.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/getRangeAt">Selection.getRangeAt - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-getrangeat">Selection: getRangeAt() - Selection API</a>
   */
  @Nonnull
  public native Range getRangeAt(int index);

  /**
   * The Selection.removeAllRanges() method removes all ranges from the selection, leaving the anchorNode and focusNode properties equal to null and leaving nothing selected.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/removeAllRanges">Selection.removeAllRanges - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-removeallranges">Selection.removeAllRanges() - Selection API</a>
   */
  public native void removeAllRanges();

  /**
   * The Selection.removeRange() method removes a range from a selection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/removeRange">Selection.removeRange - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-removerange">Selection.removeRange() - Selection API</a>
   */
  public native void removeRange(@Nonnull Range range);

  /**
   * The Selection.selectAllChildren() method adds all the children of the specified node to the selection. Previous selection is lost.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/selectAllChildren">Selection.selectAllChildren - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-selectallchildren">Selection.selectAllChildren() - Selection API</a>
   */
  public native void selectAllChildren(@Nonnull Node node);

  /**
   * The setBaseAndExtent() method of the Selection interface sets the selection to be a range including all or parts of two specified DOM nodes, and any content located between them.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/setBaseAndExtent">Selection.setBaseAndExtent - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-setbaseandextent">Selection.setBaseAndExtent() - Selection API</a>
   */
  public native void setBaseAndExtent(@Nonnull Node anchorNode, int anchorOffset,
      @Nonnull Node focusNode, int focusOffset);

  /**
   * The Selection.collapse() method collapses the current selection to a single point. The document is not modified. If the content is focused and editable, the caret will blink there.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/setPosition">Selection.setPosition - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-collapse">Selection.collapse() - Selection API</a>
   */
  public native void setPosition(@Nullable Node node, int offset);

  /**
   * The Selection.collapse() method collapses the current selection to a single point. The document is not modified. If the content is focused and editable, the caret will blink there.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Selection/setPosition">Selection.setPosition - MDN</a>
   * @see <a href="https://w3c.github.io/selection-api/#dom-selection-collapse">Selection.collapse() - Selection API</a>
   */
  public native void setPosition(@Nullable Node node);
}
