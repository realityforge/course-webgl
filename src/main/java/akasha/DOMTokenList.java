package akasha;

import akasha.lang.JsArray;
import akasha.lang.JsIterator;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The DOMTokenList interface represents a set of space-separated tokens. Such a set is returned by Element.classList, HTMLLinkElement.relList, HTMLAnchorElement.relList, HTMLAreaElement.relList, HTMLIframeElement.sandbox, or HTMLOutputElement.htmlFor. It is indexed beginning with 0 as with JavaScript Array objects. DOMTokenList is always case-sensitive.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList">DOMTokenList - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#interface-domtokenlist">DOMTokenList - DOM</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DOMTokenList"
)
public class DOMTokenList {
  /**
   * The value property of the DOMTokenList interface is a stringifier that returns the value of the list as a DOMString, or clears and sets the list to the given value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList/value">DOMTokenList.value - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-domtokenlist-value">value - DOM</a>
   */
  @Nonnull
  public String value;

  protected DOMTokenList() {
  }

  /**
   * The length read-only property of the DOMTokenList interface is an integer representing the number of objects stored in the object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList/length">DOMTokenList.length - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-domtokenlist-length">length - DOM</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The add() method of the DOMTokenList interface adds the given token to the list.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList/add">DOMTokenList.add - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-domtokenlist-add">add() - DOM</a>
   */
  public native void add(@Nonnull String... tokens);

  /**
   * The contains() method of the DOMTokenList interface returns a Boolean &mdash; true if the underlying list contains the given token, otherwise false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList/contains">DOMTokenList.contains - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-domtokenlist-contains">contains() - DOM</a>
   */
  public native boolean contains(@Nonnull String token);

  /**
   * The remove() method of the DOMTokenList interface removes the specified tokens from the list.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList/remove">DOMTokenList.remove - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-domtokenlist-remove">remove() - DOM</a>
   */
  public native void remove(@Nonnull String... tokens);

  /**
   * The replace() method of the DOMTokenList interface replaces an existing token with a new token. If the first token doesn't exist, replace() returns false immediately, without adding the new token to the token list.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList/replace">DOMTokenList.replace - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-domtokenlist-replace">replace() - DOM</a>
   */
  public native boolean replace(@Nonnull String token, @Nonnull String newToken);

  /**
   * The supports() method of the DOMTokenList interface returns true if a given token is in the associated attribute's supported tokens. This method is intended to support feature detection.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList/supports">DOMTokenList.supports - MDN</a>
   * @see <a href="https://w3c.github.io/webappsec-credential-management/">Credential Management Level 1</a>
   */
  public native boolean supports(@Nonnull String token);

  /**
   * The toggle() method of the DOMTokenList interface removes a given token from the list and returns false. If token doesn't exist it's added and the function returns true.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList/toggle">DOMTokenList.toggle - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-domtokenlist-toggle">toggle() - DOM</a>
   */
  public native boolean toggle(@Nonnull String token, boolean force);

  /**
   * The toggle() method of the DOMTokenList interface removes a given token from the list and returns false. If token doesn't exist it's added and the function returns true.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList/toggle">DOMTokenList.toggle - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-domtokenlist-toggle">toggle() - DOM</a>
   */
  public native boolean toggle(@Nonnull String token);

  /**
   * The item() method of the DOMTokenList interface returns an item in the list by its index.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList/item">DOMTokenList.item - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-domtokenlist-item">item() - DOM</a>
   */
  @Nullable
  public native String item(int index);

  /**
   * The keys() method of the DOMTokenList interface returns an iterator allowing to go through all keys contained in this object. The keys are of type unsigned integer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList/keys">DOMTokenList.keys - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#domtokenlist">keys() (as iterable&lt;Node&gt;) - DOM</a>
   */
  @Nonnull
  public native JsIterator<Double> keys();

  /**
   * The values() method of the DOMTokenList interface returns an iterator allowing developers to go through all values contained in the DOMTokenList. The individual values are DOMString objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList/values">DOMTokenList.values - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#domtokenlist">values() (as iterable&lt;Node&gt;) - DOM</a>
   */
  @Nonnull
  public native JsIterator<String> values();

  /**
   * The DOMTokenList.entries() method returns an iterator allowing you to go through all key/value pairs contained in this object. The values are DOMString objects, each representing a single token.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList/entries">DOMTokenList.entries - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#domtokenlist">entries() (as iterable&lt;Node&gt;) - DOM</a>
   */
  @Nonnull
  public native JsIterator<Entry> entries();

  /**
   * The forEach() method of the DOMTokenList interface calls the callback given in parameter once for each value pair in the list, in insertion order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList/forEach">DOMTokenList.forEach - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#domtokenlist">forEach() (as iterable&lt;Node&gt;) - DOM</a>
   */
  public native void forEach(@Nonnull ForEachCallback callback);

  /**
   * The forEach() method of the DOMTokenList interface calls the callback given in parameter once for each value pair in the list, in insertion order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList/forEach">DOMTokenList.forEach - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#domtokenlist">forEach() (as iterable&lt;Node&gt;) - DOM</a>
   */
  public native void forEach(@Nonnull ForEachCallback2 callback);

  /**
   * The forEach() method of the DOMTokenList interface calls the callback given in parameter once for each value pair in the list, in insertion order.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList/forEach">DOMTokenList.forEach - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#domtokenlist">forEach() (as iterable&lt;Node&gt;) - DOM</a>
   */
  public native void forEach(@Nonnull ForEachCallback3 callback);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Array"
  )
  public static final class Entry extends JsArray<Object> {
    @JsOverlay
    public int index() {
      return getAtAsAny( 0 ).asInt();
    }

    @JsOverlay
    @Nonnull
    public String value() {
      return getAtAsAny( 1 ).asString();
    }
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback {
    void item(@Nonnull String value);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback2 {
    void item(@Nonnull String value, int index);
  }

  @JsFunction
  @FunctionalInterface
  public interface ForEachCallback3 {
    void item(@Nonnull String value, int index, @Nonnull DOMTokenList iterable);
  }
}
