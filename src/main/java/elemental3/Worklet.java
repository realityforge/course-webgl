package elemental3;

import elemental2.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The Worklet interface is a lightweight version of Web Workers and gives developers access to low-level parts of the rendering pipeline.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Worklet">Worklet - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Worklet"
)
public class Worklet {
  Worklet() {
  }

  /**
   * The addModule() method of the Worklet interface loads the module in the given JavaScript file and adds it to the current Worklet.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Worklet/addModule">Worklet.addModule - MDN</a>
   */
  @Nonnull
  public native Promise<Void> addModule(@Nonnull String moduleURL, @Nonnull WorkletOptions options);

  /**
   * The addModule() method of the Worklet interface loads the module in the given JavaScript file and adds it to the current Worklet.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Worklet/addModule">Worklet.addModule - MDN</a>
   */
  @Nonnull
  public native Promise<Void> addModule(@Nonnull String moduleURL);
}