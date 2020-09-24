package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = TextTrackKind.class
)
public @interface TextTrackKind {
  @Nonnull
  String captions = "captions";

  @Nonnull
  String chapters = "chapters";

  @Nonnull
  String descriptions = "descriptions";

  @Nonnull
  String metadata = "metadata";

  @Nonnull
  String subtitles = "subtitles";
}
