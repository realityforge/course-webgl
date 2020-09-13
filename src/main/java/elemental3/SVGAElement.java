package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGAElement interface provides access to the properties of a element, as well as methods to manipulate them.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGAElement">SVGAElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGAElement"
)
public class SVGAElement extends SVGGraphicsElement {
  @Nonnull
  public String download;

  @Nonnull
  public String hreflang;

  @Nonnull
  public String ping;

  @Nonnull
  public String referrerPolicy;

  @Nonnull
  public String rel;

  @Nonnull
  public String text;

  @Nonnull
  public String type;

  @Nonnull
  public String hash;

  @Nonnull
  public String host;

  @Nonnull
  public String hostname;

  @Nonnull
  public String password;

  @Nonnull
  public String pathname;

  @Nonnull
  public String port;

  @Nonnull
  public String protocol;

  @Nonnull
  public String search;

  @Nonnull
  public String username;

  @Nonnull
  public String href;

  SVGAElement() {
  }

  @JsProperty(
      name = "relList"
  )
  @Nonnull
  public native DOMTokenList relList();

  /**
   * The SVGAElement.target read-only property of SVGAElement returns an SVGAnimatedString object that specifies the portion of a target window, frame, pane into which a document is to be opened when a link is activated.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGAElement/target">SVGAElement.target - MDN</a>
   */
  @JsProperty(
      name = "target"
  )
  @Nonnull
  public native SVGAnimatedString target();

  @JsProperty(
      name = "origin"
  )
  @Nonnull
  public native String origin();
}
