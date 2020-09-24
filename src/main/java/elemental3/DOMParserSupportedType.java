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
  String application_xhtml_xml = "application/xhtml+xml";

  @Nonnull
  String application_xml = "application/xml";

  @Nonnull
  String image_svg_xml = "image/svg+xml";

  @Nonnull
  String text_html = "text/html";

  @Nonnull
  String text_xml = "text/xml";
}
