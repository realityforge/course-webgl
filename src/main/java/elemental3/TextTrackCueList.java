package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;

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

  @JsOverlay
  @Nonnull
  public final TextTrackCue getAt(final int index) {
    return Js.<JsArrayLike<TextTrackCue>>cast( this ).getAt( index );
  }
}
