package elemental3;

import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The HTMLImageElement interface represents an HTML img element, providing the properties and methods used to manipulate image elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement">HTMLImageElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLImageElement"
)
public class HTMLImageElement extends HTMLElement {
  /**
   * The HTMLImageElement property alt provides fallback (alternate) text to display when the image specified by the img element is not loaded.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/alt">HTMLImageElement.alt - MDN</a>
   */
  @Nonnull
  public String alt;

  /**
   * The decoding property of the HTMLImageElement interface represents a hint given to the browser on how it should decode the image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/decoding">HTMLImageElement.decoding - MDN</a>
   */
  @Nonnull
  public String decoding;

  /**
   * The height property of the HTMLImageElement interface indicates the height at which the image is drawn, in CSS pixels if the image is being drawn or rendered to any visual medium such as the screen or a printer; otherwise, it's the natural, pixel density corrected height of the image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/height">HTMLImageElement.height - MDN</a>
   */
  public int height;

  /**
   * The HTMLImageElement proeprty isMap is a Boolean value which indicates that the image is to be used by a server-side image map. This may only be used on images located within an a element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/isMap">HTMLImageElement.isMap - MDN</a>
   */
  public boolean isMap;

  /**
   * The HTMLImageElement property sizes allows you to specify the layout width of the image for each of a list of media conditions. This provides the ability to automatically select among different images&mdash;even images of different orientations or aspect ratios&mdash;as the document state changes to match different media conditions.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/sizes">HTMLImageElement.sizes - MDN</a>
   */
  @Nonnull
  public String sizes;

  /**
   * The HTMLImageElement property src, which reflects the HTML src attribute, specifies the image to display in the img element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/src">HTMLImageElement.src - MDN</a>
   */
  @Nonnull
  public String src;

  /**
   * The HTMLImageElement property srcset is a string which identifies one or more image candidate strings, separated using commas (,) each specifying image resources to use under given circumstances.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/srcset">HTMLImageElement.srcset - MDN</a>
   */
  @Nonnull
  public String srcset;

  /**
   * The useMap property on the HTMLImageElement interface reflects the value of the HTML usemap attribute, which is a string providing the name of the client-side image map to apply to the image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/useMap">HTMLImageElement.useMap - MDN</a>
   */
  @Nonnull
  public String useMap;

  /**
   * The width property of the HTMLImageElement interface indicates the width at which an image is drawn in CSS pixels if it's being drawn or rendered to any visual medium such as a screen or printer. Otherwise, it's the natural, pixel density-corrected width of the image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/width">HTMLImageElement.width - MDN</a>
   */
  public int width;

  @Nonnull
  public String align;

  @Nonnull
  public String border;

  public int hspace;

  @Nonnull
  public String longDesc;

  @Nonnull
  public String lowsrc;

  @Nonnull
  public String name;

  public int vspace;

  /**
   * The HTMLImageElement interface's crossOrigin attribute is a string which specifies the Cross-Origin Resource Sharing (CORS) setting to use when retrieving the image.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/crossOrigin">HTMLImageElement.crossOrigin - MDN</a>
   */
  @Nullable
  @MagicConstant(
      valuesFromClass = CrossOriginType.class
  )
  public String crossOrigin;

  /**
   * The HTMLImageElement.referrerPolicy property reflects the HTML referrerpolicy attribute of the img element defining which referrer is sent when fetching the resource.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/referrerPolicy">HTMLImageElement.referrerPolicy - MDN</a>
   */
  @Nonnull
  @MagicConstant(
      valuesFromClass = ReferrerPolicy.class
  )
  public String referrerPolicy;

  /**
   * The HTMLImageElement property loading is a string whose value provides a hint to the user agent that tells the browser how to handle loading images which are currently outside the window's visual viewport.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/loading">HTMLImageElement.loading - MDN</a>
   */
  @Nonnull
  @MagicConstant(
      valuesFromClass = LoadingType.class
  )
  public String loading;

  public HTMLImageElement() {
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
   */
  @JsProperty(
      name = "naturalHeight"
  )
  public native int naturalHeight();

  /**
   * The HTMLImageElement interface's read-only naturalWidth property returns the intrinsic (natural), density-corrected width of the image in CSS pixels.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/naturalWidth">HTMLImageElement.naturalWidth - MDN</a>
   */
  @JsProperty(
      name = "naturalWidth"
  )
  public native int naturalWidth();

  /**
   * The read-only HTMLImageElement property x indicates the x-coordinate of the  img element's left border edge relative to the root element's origin.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/x">HTMLImageElement.x - MDN</a>
   */
  @JsProperty(
      name = "x"
  )
  public native int x();

  /**
   * The read-only HTMLImageElement property y indicates the y-coordinate of the img element's top border edge relative to the root element's origin.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/y">HTMLImageElement.y - MDN</a>
   */
  @JsProperty(
      name = "y"
  )
  public native int y();

  /**
   * The decode() method of the HTMLImageElement interface returns a Promise that resolves when the image is decoded and it is safe to append the image to the DOM.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement/decode">HTMLImageElement.decode - MDN</a>
   */
  @Nonnull
  public native Promise<Void> decode();
}
