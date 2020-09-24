package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = XMLHttpRequestResponseType.class
)
public @interface XMLHttpRequestResponseType {
  @Nonnull
  String default_text = "";

  @Nonnull
  String arraybuffer = "arraybuffer";

  @Nonnull
  String blob = "blob";

  @Nonnull
  String document = "document";

  @Nonnull
  String json = "json";

  @Nonnull
  String text = "text";
}
