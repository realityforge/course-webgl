package elemental3.media;

import elemental3.EventHandler;
import elemental3.EventTarget;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;

/**
 * The SourceBufferList interface represents a simple container list for multiple SourceBuffer objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBufferList">SourceBufferList - MDN</a>
 * @see <a href="https://w3c.github.io/media-source/#sourcebufferlist">SourceBufferList - Media Source Extensions</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SourceBufferList"
)
public class SourceBufferList extends EventTarget {
  @Nullable
  public EventHandler onaddsourcebuffer;

  @Nullable
  public EventHandler onremovesourcebuffer;

  protected SourceBufferList() {
  }

  /**
   * The length read-only property of the SourceBufferList interface returns the number of SourceBuffer objects in the list.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBufferList/length">SourceBufferList.length - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#idl-def-sourcebufferlist-length">length - Media Source Extensions</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  @JsOverlay
  @Nonnull
  public final SourceBuffer getAt(final int index) {
    return Js.<JsArrayLike<SourceBuffer>>cast( this ).getAt( index );
  }
}
