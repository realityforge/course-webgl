package elemental3.svg;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SVGFEMergeNodeElement interface corresponds to the feMergeNode element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SVGFEMergeNodeElement">SVGFEMergeNodeElement - MDN</a>
 * @see <a href="https://drafts.fxtf.org/filter-effects/#InterfaceSVGFEMergeNodeElement">The definition of 'SVGFEMergeNodeElement' in the 'Filter Effects Module Level 1' specification.</a>
 * @see <a href="https://www.w3.org/TR/SVG11/filters.html#InterfaceSVGFEMergeNodeElement">The definition of 'SVGFEMergeNodeElement' in the 'Scalable Vector Graphics (SVG) 1.1 (Second Edition)' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SVGFEMergeNodeElement"
)
public class SVGFEMergeNodeElement extends SVGElement {
  protected SVGFEMergeNodeElement() {
  }

  @JsProperty(
      name = "in1"
  )
  @Nonnull
  public native SVGAnimatedString in1();
}
