package elemental3;

import elemental3.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The Worklet interface is a lightweight version of Web Workers and gives developers access to low-level parts of the rendering pipeline.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Worklet">Worklet - MDN</a>
 * @see <a href="https://drafts.css-houdini.org/worklets/#worklet">The definition of 'Worklet' in the 'Worklets Level 1' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Worklet"
)
public class Worklet {
  protected Worklet() {
  }

  /**
   * The addModule() method of the Worklet interface loads the module in the given JavaScript file and adds it to the current Worklet.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Worklet/addModule">Worklet.addModule - MDN</a>
   * @see <a href="https://drafts.css-houdini.org/worklets/#dom-worklet-addmodule">The definition of 'addModule()' in the 'Worklets Level 1' specification.</a>
   */
  @Nonnull
  public native Promise<Void> addModule(@Nonnull String moduleURL, @Nonnull WorkletOptions options);

  /**
   * The addModule() method of the Worklet interface loads the module in the given JavaScript file and adds it to the current Worklet.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Worklet/addModule">Worklet.addModule - MDN</a>
   * @see <a href="https://drafts.css-houdini.org/worklets/#dom-worklet-addmodule">The definition of 'addModule()' in the 'Worklets Level 1' specification.</a>
   */
  @Nonnull
  public native Promise<Void> addModule(@Nonnull String moduleURL);
}
