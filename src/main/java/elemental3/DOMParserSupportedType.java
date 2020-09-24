package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = DOMParserSupportedType.class
)
public @interface DOMParserSupportedType {
  @Nonnull
  String application_xhtml_xml = "application_xhtml_xml";

  @Nonnull
  String application_xml = "application_xml";

  @Nonnull
  String image_svg_xml = "image_svg_xml";

  @Nonnull
  String text_html = "text_html";

  @Nonnull
  String text_xml = "text_xml";
}
