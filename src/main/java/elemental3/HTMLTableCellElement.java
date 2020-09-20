package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The HTMLTableCellElement interface provides special properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of table cells, either header or data cells, in an HTML document.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableCellElement">HTMLTableCellElement - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLTableCellElement"
)
public class HTMLTableCellElement extends HTMLElement {
  @Nonnull
  public String abbr;

  @Nonnull
  public String align;

  @Nonnull
  public String axis;

  @Nonnull
  public String bgColor;

  @Nonnull
  public String ch;

  @Nonnull
  public String chOff;

  public int colSpan;

  @Nonnull
  public String headers;

  @Nonnull
  public String height;

  public boolean noWrap;

  public int rowSpan;

  @Nonnull
  @ScopeType
  public String scope;

  @Nonnull
  public String vAlign;

  @Nonnull
  public String width;

  protected HTMLTableCellElement() {
  }

  @JsProperty(
      name = "cellIndex"
  )
  public native int cellIndex();
}
