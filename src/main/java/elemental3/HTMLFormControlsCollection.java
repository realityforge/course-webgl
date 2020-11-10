package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLFormControlsCollection interface represents a collection of HTML form control elements.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormControlsCollection">HTMLFormControlsCollection - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/infrastructure.html#htmlformcontrolscollection">The definition of 'HTMLFormControlsCollection' in the 'HTML Living Standard' specification.</a>
 * @see <a href="https://www.w3.org/TR/html52/infrastructure.html#htmlformcontrolscollection">The definition of 'HTMLFormControlsCollection' in the 'HTML5' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLFormControlsCollection"
)
public class HTMLFormControlsCollection {
  protected HTMLFormControlsCollection() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @Nullable
  public native RadioNodeListOrElementUnion item(int index);

  /**
   * The HTMLFormControlsCollection.namedItem() method returns the RadioNodeList or the Element in the collection whose name or id match the specified name, or null if no node matches.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLFormControlsCollection/namedItem">HTMLFormControlsCollection.namedItem - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-htmlformcontrolscollection-nameditem">The definition of 'HTMLFormControlsCollection.namedItem()' in the 'HTML Living Standard' specification.</a>
   * @see <a href="https://www.w3.org/TR/html52/infrastructure.html#htmlformcontrolscollection">The definition of 'HTMLFormControlsCollection' in the 'HTML5' specification.</a>
   */
  @Nullable
  public native RadioNodeListOrElementUnion namedItem(@Nonnull String name);
}
