package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The TouchList interface represents a list of contact points on a touch surface. For example, if the user has three fingers on the touch surface (such as a screen or trackpad), the corresponding TouchList object would have one Touch object for each finger, for a total of three entries.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TouchList">TouchList - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TouchList"
)
public class TouchList {
  protected TouchList() {
  }

  /**
   * The length read-only property indicates the number of items (touch points) in a given TouchList.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TouchList/length">TouchList.length - MDN</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The item() method returns the Touch object at the specified index in the TouchList.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TouchList/item">TouchList.item - MDN</a>
   */
  @Nullable
  public native Touch item(int index);
}
