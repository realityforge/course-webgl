package akasha;

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

  final class Util {
    private Util() {
    }

    @RequestDestination
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return RequestDestination.other.equals( value ) || RequestDestination.audio.equals( value ) || RequestDestination.audioworklet.equals( value ) || RequestDestination.document.equals( value ) || RequestDestination.embed.equals( value ) || RequestDestination.font.equals( value ) || RequestDestination.frame.equals( value ) || RequestDestination.iframe.equals( value ) || RequestDestination.image.equals( value ) || RequestDestination.manifest.equals( value ) || RequestDestination.object.equals( value ) || RequestDestination.paintworklet.equals( value ) || RequestDestination.report.equals( value ) || RequestDestination.script.equals( value ) || RequestDestination.sharedworker.equals( value ) || RequestDestination.style.equals( value ) || RequestDestination.track.equals( value ) || RequestDestination.video.equals( value ) || RequestDestination.worker.equals( value ) || RequestDestination.xslt.equals( value );
    }
  }
}
