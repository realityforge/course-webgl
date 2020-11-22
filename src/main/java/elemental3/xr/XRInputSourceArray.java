package elemental3.xr;

import elemental3.core.JsArray;
import elemental3.core.JsIterator;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;

/**
 * The interface XRInputSourceArray represents a live list of WebXR input sources, and is used as the return value of the XRSession property inputSources.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceArray">XRInputSourceArray - MDN</a>
 * @see <a href="https://immersive-web.github.io/webxr/#xrinputsourcearray-interface">The definition of 'XRInputSourceArray' in the 'WebXR Device API' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XRInputSourceArray"
)
public class XRInputSourceArray {
  protected XRInputSourceArray() {
  }

  /**
   * The read-only length property returns an integer value indicating the number of items in the input source list represented by the XRInputSourceArray object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceArray/length">XRInputSourceArray.length - MDN</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  @JsOverlay
  @Nonnull
  public final XRInputSource getAt(final int index) {
    return Js.<JsArrayLike<XRInputSource>>cast( this ).getAt( index );
  }

  /**
   * The keys() method in the XRInputSourceArray interface returns a JavaScript iterator which can then be used to iterate over the keys used to reference each item in the array of input sources.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceArray/keys">XRInputSourceArray.keys - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#xrinputsourcearray">The definition of 'XRInputSourceArray' in the 'WebXR Device API' specification.</a>
   */
  @Nonnull
  public native JsIterator<Double> keys();

  /**
   * The XRInputSourceArray method  values() returns a JavaScript iterator that can walk over the list of XRInputSource objects contained in the array, from first to last.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceArray/values">XRInputSourceArray.values - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#xrinputsourcearray">The definition of 'XRInputSourceArray' in the 'WebXR Device API' specification.</a>
   */
  @Nonnull
  public native JsIterator<XRInputSource> values();

  /**
   * The XRInputSourceArray interface's entries() method returns a JavaScript iterator which can then be used to iterate over the key/value pairs in the input source array.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceArray/entries">XRInputSourceArray.entries - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#xrinputsourcearray">The definition of 'XRInputSourceArray' in the 'WebXR Device API' specification.</a>
   */
  @Nonnull
  public native JsIterator<Entry> entries();

  /**
   * The XRInputSourceArray method forEach() executes the specified callback once for each input source in the array, starting at index 0 and progressing until the end of the list.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceArray/forEach">XRInputSourceArray.forEach - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#xrinputsourcearray">The definition of 'XRInputSourceArray' in the 'WebXR Device API' specification.</a>
   */
  public native void forEach(@Nonnull ForEachCallback callback);

  /**
   * The XRInputSourceArray method forEach() executes the specified callback once for each input source in the array, starting at index 0 and progressing until the end of the list.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceArray/forEach">XRInputSourceArray.forEach - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#xrinputsourcearray">The definition of 'XRInputSourceArray' in the 'WebXR Device API' specification.</a>
   */
  public native void forEach(@Nonnull ForEachCallback2 callback);

  /**
   * The XRInputSourceArray method forEach() executes the specified callback once for each input source in the array, starting at index 0 and progressing until the end of the list.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XRInputSourceArray/forEach">XRInputSourceArray.forEach - MDN</a>
   * @see <a href="https://immersive-web.github.io/webxr/#xrinputsourcearray">The definition of 'XRInputSourceArray' in the 'WebXR Device API' specification.</a>
   */
  public native void forEach(@Nonnull ForEachCallback3 callback);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Array"
  )
  public static final class Entry extends JsArray<Object> {
    @JsOverlay
    public final int index() {
      return getAtAsAny( 0 ).asInt();
    }

    @JsOverlay
    @Nonnull
    public final XRInputSource value() {
      return getAtAsAny( 1 ).cast();
    }
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback {
    void item(@Nonnull XRInputSource value);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback2 {
    void item(@Nonnull XRInputSource value, int index);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback3 {
    void item(@Nonnull XRInputSource value, int index, @Nonnull XRInputSourceArray iterable);
  }
}
