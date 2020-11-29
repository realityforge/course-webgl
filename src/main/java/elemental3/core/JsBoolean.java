package elemental3.core;

import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The Boolean object is an object wrapper for a boolean value.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Boolean">Boolean - MDN</a>
 * @see <a href="https://tc39.es/ecma262/#sec-boolean-objects">The definition of 'Boolean' in the 'ECMAScript (ECMA-262)' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Boolean"
)
public class JsBoolean {
  /**
   * The Boolean() constructor is used to create Boolean objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Boolean/Boolean">Boolean.Boolean - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-boolean-constructor">The definition of 'Boolean constructor' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public JsBoolean(@DoNotAutobox @Nullable final Object value) {
  }

  /**
   * The Boolean() constructor is used to create Boolean objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Boolean/Boolean">Boolean.Boolean - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-boolean-constructor">The definition of 'Boolean constructor' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public JsBoolean() {
  }

  /**
   * The valueOf() method returns the primitive value of a Boolean object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Boolean/valueOf">Boolean.valueOf - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-boolean.prototype.valueof">The definition of 'Boolean.prototype.valueOf' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  public native boolean valueOf();

  /**
   * The toString() method returns a string representing the specified Boolean object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Boolean/toString">Boolean.toString - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-boolean.prototype.tostring">The definition of 'Boolean.prototype.toString' in the 'ECMAScript (ECMA-262)' specification.</a>
   */
  @JsMethod(
      name = "toString"
  )
  @Nonnull
  public native String toString_();
}
