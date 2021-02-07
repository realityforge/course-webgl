package elemental3;

import elemental3.gl.TexImageSource;
import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLImageElement interface represents an HTML &lt;img&gt; element, providing the properties and methods used to manipulate image elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement">HTMLImageElement - MDN</a>
 * @see <a href="https://drafts.csswg.org/cssom-view/#extensions-to-the-htmlimageelement-interface">Extensions to HTMLImageElement - CSS Object Model (CSSOM) View Module</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/#htmlimageelement">HTMLImageElement - HTML Living Standard</a>
 * @see <a href="https://www.w3.org/TR/html52/embedded-content-0.html#the-img-element">HTMLImageElement - HTML5</a>
 * @see <a href="https://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-17701901">HTMLImgElement - Document Object Model (DOM) Level 2 HTML Specification</a>
 * @see <a href="https://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html#ID-17701901">HTMLImgElement - Document Object Model (DOM) Level 1 Specification</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLImageElement"
)
public class HTMLImageElement extends HTMLElement implements TexImageSource {
  @Nonnull
  public String align;

  /**
   * The HTMLImageElement property alt provides fallback (alternate) text to display when the image specified by the img element is not loaded.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/alt">HTMLImageElement.alt - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-img-alt">HTMLImageElement.alt - HTML Living Standard</a>
   */
  @Nonnull
  public String alt;

  @Nonnull
  public String border;

  /**
   * The HTMLImageElement interface's crossOrigin attribute is a string which specifies the Cross-Origin Resource Sharing (CORS) setting to use when retrieving the image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/crossOrigin">HTMLImageElement.crossOrigin - MDN</a>
   */
  @Nullable
  @CrossOriginType
  public String crossOrigin;

  /**
   * The decoding property of the HTMLImageElement interface represents a hint given to the browser on how it should decode the image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/decoding">HTMLImageElement.decoding - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/embedded-content.html#dom-img-decoding">decoding - HTML Living Standard</a>
   */
  @Nonnull
  public String decoding;

  /**
   * The height property of the HTMLImageElement interface indicates the height at which the image is drawn, in CSS pixels if the image is being drawn or rendered to any visual medium such as the screen or a printer; otherwise, it's the natural, pixel density corrected height of the image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/height">HTMLImageElement.height - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-img-height">HTMLImageElement.height - HTML Living Standard</a>
   */
  public int height;

  public int hspace;

  /**
   * The HTMLImageElement proeprty isMap is a Boolean value which indicates that the image is to be used by a server-side image map. This may only be used on images located within an a element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/isMap">HTMLImageElement.isMap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-img-ismap">HTMLImageElement.isMap - HTML Living Standard</a>
   */
  public boolean isMap;

  /**
   * The HTMLImageElement property loading is a string whose value provides a hint to the user agent that tells the browser how to handle loading images which are currently outside the window's visual viewport.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/loading">HTMLImageElement.loading - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#attr-img-loading">HTMLImageElement.loading - HTML Living Standard</a>
   */
  @Nonnull
  @LoadingType
  public String loading;

  @Nonnull
  public String longDesc;

  @Nonnull
  public String lowsrc;

  /**
   * The HTMLImageElement interface's deprecated name property specifies a name for the element. This has been replaced by the id property available on all elements.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/name">HTMLImageElement.name - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#attr-img-name">HTMLImageElement.name - HTML Living Standard</a>
   * @see <a href="https://www.w3.org/TR/html401/struct/objects.html#adef-name-IMG">HTMLImageElement.name - HTML 4.01 Specification</a>
   */
  @Nonnull
  public String name;

  /**
   * The HTMLImageElement.referrerPolicy property reflects the HTML referrerpolicy attribute of the img element defining which referrer is sent when fetching the resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/referrerPolicy">HTMLImageElement.referrerPolicy - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-referrer-policy/#referrer-policy-delivery-referrer-attribute">referrerPolicy attribute - Referrer Policy</a>
   */
  @Nonnull
  @ReferrerPolicy
  public String referrerPolicy;

  /**
   * The HTMLImageElement property sizes allows you to specify the layout width of the image for each of a list of media conditions. This provides the ability to automatically select among different images&mdash;even images of different orientations or aspect ratios&mdash;as the document state changes to match different media conditions.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/sizes">HTMLImageElement.sizes - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-img-sizes">HTMLImageElement.sizes - HTML Living Standard</a>
   */
  @Nonnull
  public String sizes;

  /**
   * The HTMLImageElement property src, which reflects the HTML src attribute, specifies the image to display in the img element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/src">HTMLImageElement.src - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-img-src">HTMLImageElement.src - HTML Living Standard</a>
   */
  @Nonnull
  public String src;

  /**
   * The HTMLImageElement property srcset is a string which identifies one or more image candidate strings, separated using commas (,) each specifying image resources to use under given circumstances.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/srcset">HTMLImageElement.srcset - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-img-srcset">HTMLImageElement.srcset - HTML Living Standard</a>
   */
  @Nonnull
  public String srcset;

  /**
   * The useMap property on the HTMLImageElement interface reflects the value of the HTML usemap attribute, which is a string providing the name of the client-side image map to apply to the image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/useMap">HTMLImageElement.useMap - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-img-usemap">HTMLImageElement.useMap - HTML Living Standard</a>
   */
  @Nonnull
  public String useMap;

  public int vspace;

  /**
   * The width property of the HTMLImageElement interface indicates the width at which an image is drawn in CSS pixels if it's being drawn or rendered to any visual medium such as a screen or printer. Otherwise, it's the natural, pixel density-corrected width of the image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/width">HTMLImageElement.width - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-img-width">HTMLImageElement.width - HTML Living Standard</a>
   */
  public int width;

  protected HTMLImageElement() {
  }

  /**
   * The read-only HTMLImageElement interface's complete attribute is a Boolean value which indicates whether or not the image has completely loaded.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/complete">HTMLImageElement.complete - MDN</a>
   */
  @JsProperty(
      name = "complete"
  )
  public native boolean complete();

  /**
   * The read-only HTMLImageElement property currentSrc indicates the URL of the image which is currently presented in the img element it represents.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/currentSrc">HTMLImageElement.currentSrc - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-img-currentsrc">HTMLImageElement.currentSrc - HTML Living Standard</a>
   */
  @JsProperty(
      name = "currentSrc"
  )
  @Nonnull
  public native String currentSrc();

  /**
   * The HTMLImageElement interface's naturalHeight property is a read-only value which returns the intrinsic (natural), density-corrected height of the image in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/naturalHeight">HTMLImageElement.naturalHeight - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-img-naturalheight">HTMLImageElement.naturalheight - HTML Living Standard</a>
   */
  @JsProperty(
      name = "naturalHeight"
  )
  public native int naturalHeight();

  /**
   * The HTMLImageElement interface's read-only naturalWidth property returns the intrinsic (natural), density-corrected width of the image in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/naturalWidth">HTMLImageElement.naturalWidth - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-img-naturalwidth">HTMLImageElement.naturalWidth - HTML Living Standard</a>
   */
  @JsProperty(
      name = "naturalWidth"
  )
  public native int naturalWidth();

  /**
   * The read-only HTMLImageElement property x indicates the x-coordinate of the  img element's left border edge relative to the root element's origin.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/x">HTMLImageElement.x - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-htmlimageelement-x">HTMLImageElement.x - CSS Object Model (CSSOM) View Module</a>
   */
  @JsProperty(
      name = "x"
  )
  public native int x();

  /**
   * The read-only HTMLImageElement property y indicates the y-coordinate of the img element's top border edge relative to the root element's origin.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/y">HTMLImageElement.y - MDN</a>
   * @see <a href="https://drafts.csswg.org/cssom-view/#dom-htmlimageelement-y">HTMLImageElement.y - CSS Object Model (CSSOM) View Module</a>
   */
  @JsProperty(
      name = "y"
  )
  public native int y();

  /**
   * The decode() method of the HTMLImageElement interface returns a Promise that resolves when the image is decoded and it is safe to append the image to the DOM.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/decode">HTMLImageElement.decode - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-img-decode">decode() - HTML Living Standard</a>
   */
  @Nonnull
  public native Promise<Void> decode();
}
