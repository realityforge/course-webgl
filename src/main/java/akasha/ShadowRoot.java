package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The ShadowRoot interface of the Shadow DOM API is the root node of a DOM subtree that is rendered separately from a document's main DOM tree.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ShadowRoot">ShadowRoot - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#interface-shadowroot">Interface ShadowRoot - DOM</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ShadowRoot"
)
public class ShadowRoot extends DocumentFragment {
  /**
   * The innerHTML property of the ShadowRoot interface sets or returns a reference to the DOM tree inside the ShadowRoot.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ShadowRoot/innerHTML">ShadowRoot.innerHTML - MDN</a>
   */
  @Nonnull
  public String innerHTML;

  @Nullable
  public EventHandler onslotchange;

  protected ShadowRoot() {
  }

  /**
   * The activeElement read-only property of the Document and ShadowRoot interfaces returns the Element within the DOM or shadow DOM tree that currently has focus.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentOrShadowRoot/activeElement">DocumentOrShadowRoot.activeElement - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/interaction.html#dom-document-activeelement">activeElement - HTML Living Standard</a>
   */
  @JsProperty(
      name = "activeElement"
  )
  @Nullable
  public native Element activeElement();

  /**
   * The DocumentOrShadowRoot.fullscreenElement read-only property returns the Element that is currently being presented in full-screen mode in this document, or null if full-screen mode is not currently in use.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentOrShadowRoot/fullscreenElement">DocumentOrShadowRoot.fullscreenElement - MDN</a>
   * @see <a href="https://fullscreen.spec.whatwg.org/#dom-document-fullscreenelement">Document.fullscreenElement - Fullscreen API</a>
   */
  @JsProperty(
      name = "fullscreenElement"
  )
  @Nullable
  public native Element fullscreenElement();

  /**
   * The host read-only property of the ShadowRoot returns a reference to the DOM element the ShadowRoot is attached to.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ShadowRoot/host">ShadowRoot.host - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-shadowroot-host">ShadowRoot.host - DOM</a>
   */
  @JsProperty(
      name = "host"
  )
  @Nonnull
  public native Element host();

  /**
   * The mode property of the ShadowRoot specifies its mode &mdash; either open or closed. This defines whether or not the shadow root's internal features are accessible from JavaScript.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/ShadowRoot/mode">ShadowRoot.mode - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-shadowroot-mode">ShadowRoot.mode - DOM</a>
   */
  @JsProperty(
      name = "mode"
  )
  @Nonnull
  @ShadowRootMode
  public native String mode();

  /**
   * The pointerLockElement property of the Document and ShadowRoot interfaces provides the element set as the target for mouse events while the pointer is locked. It is null if lock is pending, pointer is unlocked, or the target is in another document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentOrShadowRoot/pointerLockElement">DocumentOrShadowRoot.pointerLockElement - MDN</a>
   * @see <a href="https://w3c.github.io/pointerlock/#extensions-to-the-documentorshadowroot-mixin">pointerLockElement - Pointer Lock</a>
   */
  @JsProperty(
      name = "pointerLockElement"
  )
  @Nullable
  public native Element pointerLockElement();

  /**
   * The styleSheets read-only property of the DocumentOrShadowRoot interface returns a StyleSheetList of CSSStyleSheet objects, for stylesheets explicitly linked into or embedded in a document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DocumentOrShadowRoot/styleSheets">DocumentOrShadowRoot.styleSheets - MDN</a>
   * @see <a href="https://w3c.github.io/webcomponents/spec/shadow/#extensions-to-the-documentorshadowroot-mixin">DocumentOrShadowRoot - Shadow DOM</a>
   */
  @JsProperty(
      name = "styleSheets"
  )
  @Nonnull
  public native StyleSheetList styleSheets();
}
