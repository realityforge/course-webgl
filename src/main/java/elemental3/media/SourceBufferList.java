package elemental3.media;

import elemental3.EventHandler;
import elemental3.EventTarget;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SourceBufferList interface represents a simple container list for multiple SourceBuffer objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBufferList">SourceBufferList - MDN</a>
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
   */
  @JsProperty(
      name = "length"
  )
  public native int length();
}
