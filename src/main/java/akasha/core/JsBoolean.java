package akasha.core;

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
 * @see <a href="https://tc39.es/ecma262/#sec-boolean-objects">Boolean - ECMAScript (ECMA-262)</a>
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
   * @see <a href="https://tc39.es/ecma262/#sec-boolean-constructor">Boolean constructor - ECMAScript (ECMA-262)</a>
   */
  public JsBoolean(@DoNotAutobox @Nullable final Object value) {
  }

  /**
   * The Boolean() constructor is used to create Boolean objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Boolean/Boolean">Boolean.Boolean - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-boolean-constructor">Boolean constructor - ECMAScript (ECMA-262)</a>
   */
  public JsBoolean() {
  }

  /**
   * The valueOf() method returns the primitive value of a Boolean object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Boolean/valueOf">Boolean.valueOf - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-boolean.prototype.valueof">Boolean.prototype.valueOf - ECMAScript (ECMA-262)</a>
   */
  public native boolean valueOf();

  /**
   * The toString() method returns a string representing the specified Boolean object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Boolean/toString">Boolean.toString - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-boolean.prototype.tostring">Boolean.prototype.toString - ECMAScript (ECMA-262)</a>
   */
  @JsMethod(
      name = "toString"
  )
  @Nonnull
  public native String toString_();
}
