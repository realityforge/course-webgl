package akasha;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The MutationObserverInit dictionary describes the configuration of a mutation observer. As such, it's primarily used as the type of the options parameter on the MutationObserver.observe() method.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserverInit">MutationObserverInit - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#dictdef-mutationobserverinit">MutationObserverInit - DOM</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface MutationObserverInit {
  @JsOverlay
  @Nonnull
  static MutationObserverInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  /**
   * The MutationObserverInit dictionary's optional attributeFilter property is an array of strings specifying the names of the attributes whose values are to be monitored for changes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserverInit/attributeFilter">MutationObserverInit.attributeFilter - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-mutationobserverinit-attributefilter">MutationObserverInit: attributeFilter - DOM</a>
   */
  @JsProperty(
      name = "attributeFilter"
  )
  JsArray<String> attributeFilter();

  /**
   * The MutationObserverInit dictionary's optional attributeFilter property is an array of strings specifying the names of the attributes whose values are to be monitored for changes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserverInit/attributeFilter">MutationObserverInit.attributeFilter - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-mutationobserverinit-attributefilter">MutationObserverInit: attributeFilter - DOM</a>
   */
  @JsProperty
  void setAttributeFilter(@Nonnull JsArray<String> attributeFilter);

  /**
   * The MutationObserverInit dictionary's optional attributeFilter property is an array of strings specifying the names of the attributes whose values are to be monitored for changes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserverInit/attributeFilter">MutationObserverInit.attributeFilter - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-mutationobserverinit-attributefilter">MutationObserverInit: attributeFilter - DOM</a>
   */
  @JsOverlay
  @Nonnull
  default MutationObserverInit attributeFilter(@Nonnull final JsArray<String> attributeFilter) {
    setAttributeFilter( attributeFilter );
    return this;
  }

  /**
   * The MutationObserverInit dictionary's optional attributeFilter property is an array of strings specifying the names of the attributes whose values are to be monitored for changes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserverInit/attributeFilter">MutationObserverInit.attributeFilter - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-mutationobserverinit-attributefilter">MutationObserverInit: attributeFilter - DOM</a>
   */
  @JsOverlay
  default void setAttributeFilter(@Nonnull final String... attributeFilter) {
    setAttributeFilter( Js.<JsArray<String>>uncheckedCast( attributeFilter ) );
  }

  /**
   * The MutationObserverInit dictionary's optional attributeFilter property is an array of strings specifying the names of the attributes whose values are to be monitored for changes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserverInit/attributeFilter">MutationObserverInit.attributeFilter - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-mutationobserverinit-attributefilter">MutationObserverInit: attributeFilter - DOM</a>
   */
  @JsOverlay
  @Nonnull
  default MutationObserverInit attributeFilter(@Nonnull final String... attributeFilter) {
    setAttributeFilter( attributeFilter );
    return this;
  }

  /**
   * The MutationObserverInit dictionary's optional attributeOldValue property is used to specify whether or not to record the prior value of the altered attribute in MutationRecord objects denoting attribute value changes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserverInit/attributeOldValue">MutationObserverInit.attributeOldValue - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-mutationobserverinit-attributeoldvalue">MutationObserverInit.attributeOldValue - DOM</a>
   */
  @JsProperty(
      name = "attributeOldValue"
  )
  boolean attributeOldValue();

  /**
   * The MutationObserverInit dictionary's optional attributeOldValue property is used to specify whether or not to record the prior value of the altered attribute in MutationRecord objects denoting attribute value changes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserverInit/attributeOldValue">MutationObserverInit.attributeOldValue - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-mutationobserverinit-attributeoldvalue">MutationObserverInit.attributeOldValue - DOM</a>
   */
  @JsProperty
  void setAttributeOldValue(boolean attributeOldValue);

  /**
   * The MutationObserverInit dictionary's optional attributeOldValue property is used to specify whether or not to record the prior value of the altered attribute in MutationRecord objects denoting attribute value changes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserverInit/attributeOldValue">MutationObserverInit.attributeOldValue - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-mutationobserverinit-attributeoldvalue">MutationObserverInit.attributeOldValue - DOM</a>
   */
  @JsOverlay
  @Nonnull
  default MutationObserverInit attributeOldValue(final boolean attributeOldValue) {
    setAttributeOldValue( attributeOldValue );
    return this;
  }

  /**
   * The MutationObserverInit dictionary's optional attributes property is used to specify whether or not to watch for attribute value changes on the node or nodes being observed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserverInit/attributes">MutationObserverInit.attributes - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-mutationobserverinit-attributes">MutationObserverInit.attributes - DOM</a>
   */
  @JsProperty(
      name = "attributes"
  )
  boolean attributes();

  /**
   * The MutationObserverInit dictionary's optional attributes property is used to specify whether or not to watch for attribute value changes on the node or nodes being observed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserverInit/attributes">MutationObserverInit.attributes - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-mutationobserverinit-attributes">MutationObserverInit.attributes - DOM</a>
   */
  @JsProperty
  void setAttributes(boolean attributes);

  /**
   * The MutationObserverInit dictionary's optional attributes property is used to specify whether or not to watch for attribute value changes on the node or nodes being observed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserverInit/attributes">MutationObserverInit.attributes - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-mutationobserverinit-attributes">MutationObserverInit.attributes - DOM</a>
   */
  @JsOverlay
  @Nonnull
  default MutationObserverInit attributes(final boolean attributes) {
    setAttributes( attributes );
    return this;
  }

  /**
   * The MutationObserverInit dictionary's optional characterData property is used to specify whether or not to monitor the node or nodes being observed for changes to their textual contents.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserverInit/characterData">MutationObserverInit.characterData - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-mutationobserverinit-characterdata">MutationObserverInit.characterData - DOM</a>
   */
  @JsProperty(
      name = "characterData"
  )
  boolean characterData();

  /**
   * The MutationObserverInit dictionary's optional characterData property is used to specify whether or not to monitor the node or nodes being observed for changes to their textual contents.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserverInit/characterData">MutationObserverInit.characterData - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-mutationobserverinit-characterdata">MutationObserverInit.characterData - DOM</a>
   */
  @JsProperty
  void setCharacterData(boolean characterData);

  /**
   * The MutationObserverInit dictionary's optional characterData property is used to specify whether or not to monitor the node or nodes being observed for changes to their textual contents.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserverInit/characterData">MutationObserverInit.characterData - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-mutationobserverinit-characterdata">MutationObserverInit.characterData - DOM</a>
   */
  @JsOverlay
  @Nonnull
  default MutationObserverInit characterData(final boolean characterData) {
    setCharacterData( characterData );
    return this;
  }

  /**
   * The MutationObserverInit dictionary's optional characterDataOldValue property is used to specify whether or not the MutationRecord.oldValue property for DOM mutations should be set to the previous value of text nodes which changed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserverInit/characterDataOldValue">MutationObserverInit.characterDataOldValue - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-mutationobserverinit-characterdataoldvalue">MutationObserverInit.characterDataOldValue - DOM</a>
   */
  @JsProperty(
      name = "characterDataOldValue"
  )
  boolean characterDataOldValue();

  /**
   * The MutationObserverInit dictionary's optional characterDataOldValue property is used to specify whether or not the MutationRecord.oldValue property for DOM mutations should be set to the previous value of text nodes which changed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserverInit/characterDataOldValue">MutationObserverInit.characterDataOldValue - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-mutationobserverinit-characterdataoldvalue">MutationObserverInit.characterDataOldValue - DOM</a>
   */
  @JsProperty
  void setCharacterDataOldValue(boolean characterDataOldValue);

  /**
   * The MutationObserverInit dictionary's optional characterDataOldValue property is used to specify whether or not the MutationRecord.oldValue property for DOM mutations should be set to the previous value of text nodes which changed.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserverInit/characterDataOldValue">MutationObserverInit.characterDataOldValue - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-mutationobserverinit-characterdataoldvalue">MutationObserverInit.characterDataOldValue - DOM</a>
   */
  @JsOverlay
  @Nonnull
  default MutationObserverInit characterDataOldValue(final boolean characterDataOldValue) {
    setCharacterDataOldValue( characterDataOldValue );
    return this;
  }

  /**
   * The MutationObserverInit dictionary's optional childList property indicates whether or not to monitor the specified node or nodes for the addition or removal of new child nodes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserverInit/childList">MutationObserverInit.childList - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-mutationobserverinit-childlist">MutationObserverInit.childList - DOM</a>
   */
  @JsProperty(
      name = "childList"
  )
  boolean childList();

  /**
   * The MutationObserverInit dictionary's optional childList property indicates whether or not to monitor the specified node or nodes for the addition or removal of new child nodes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserverInit/childList">MutationObserverInit.childList - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-mutationobserverinit-childlist">MutationObserverInit.childList - DOM</a>
   */
  @JsProperty
  void setChildList(boolean childList);

  /**
   * The MutationObserverInit dictionary's optional childList property indicates whether or not to monitor the specified node or nodes for the addition or removal of new child nodes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserverInit/childList">MutationObserverInit.childList - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-mutationobserverinit-childlist">MutationObserverInit.childList - DOM</a>
   */
  @JsOverlay
  @Nonnull
  default MutationObserverInit childList(final boolean childList) {
    setChildList( childList );
    return this;
  }

  /**
   * The MutationObserverInit dictionary's optional subtree property can be set to true to monitor the targeted node and all of its descendants.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserverInit/subtree">MutationObserverInit.subtree - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-mutationobserverinit-subtree">MutationObserverInit.subtree - DOM</a>
   */
  @JsProperty(
      name = "subtree"
  )
  boolean subtree();

  /**
   * The MutationObserverInit dictionary's optional subtree property can be set to true to monitor the targeted node and all of its descendants.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserverInit/subtree">MutationObserverInit.subtree - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-mutationobserverinit-subtree">MutationObserverInit.subtree - DOM</a>
   */
  @JsProperty
  void setSubtree(boolean subtree);

  /**
   * The MutationObserverInit dictionary's optional subtree property can be set to true to monitor the targeted node and all of its descendants.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MutationObserverInit/subtree">MutationObserverInit.subtree - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-mutationobserverinit-subtree">MutationObserverInit.subtree - DOM</a>
   */
  @JsOverlay
  @Nonnull
  default MutationObserverInit subtree(final boolean subtree) {
    setSubtree( subtree );
    return this;
  }
}
