package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TextTrackCueList"
)
public class TextTrackCueList {
  protected TextTrackCueList() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @Nullable
  public native TextTrackCue getCueById(@Nonnull String id);
}
