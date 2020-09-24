package elemental3;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = RequestDestination.class
)
public @interface RequestDestination {
  @Nonnull
  String other = "";

  @Nonnull
  String audio = "audio";

  @Nonnull
  String audioworklet = "audioworklet";

  @Nonnull
  String document = "document";

  @Nonnull
  String embed = "embed";

  @Nonnull
  String font = "font";

  @Nonnull
  String frame = "frame";

  @Nonnull
  String iframe = "iframe";

  @Nonnull
  String image = "image";

  @Nonnull
  String manifest = "manifest";

  @Nonnull
  String object = "object";

  @Nonnull
  String paintworklet = "paintworklet";

  @Nonnull
  String report = "report";

  @Nonnull
  String script = "script";

  @Nonnull
  String sharedworker = "sharedworker";

  @Nonnull
  String style = "style";

  @Nonnull
  String track = "track";

  @Nonnull
  String video = "video";

  @Nonnull
  String worker = "worker";

  @Nonnull
  String xslt = "xslt";
}
