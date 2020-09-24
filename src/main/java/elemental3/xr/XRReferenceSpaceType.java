package elemental3.xr;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = XRReferenceSpaceType.class
)
public @interface XRReferenceSpaceType {
  @Nonnull
  String bounded_floor = "bounded-floor";

  @Nonnull
  String local = "local";

  @Nonnull
  String local_floor = "local-floor";

  @Nonnull
  String unbounded = "unbounded";

  @Nonnull
  String viewer = "viewer";
}
