package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The DOMTokenList interface represents a set of space-separated tokens. Such a set is returned by Element.classList, HTMLLinkElement.relList, HTMLAnchorElement.relList, HTMLAreaElement.relList, HTMLIframeElement.sandbox, or HTMLOutputElement.htmlFor. It is indexed beginning with 0 as with JavaScript Array objects. DOMTokenList is always case-sensitive.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList">DOMTokenList - MDN</a>
 * @see <a href="https://dom.spec.whatwg.org/#interface-domtokenlist">The definition of 'DOMTokenList' in the 'DOM' specification.</a>
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
   * @see <a href="https://dom.spec.whatwg.org/#dom-domtokenlist-value">The definition of 'value' in the 'DOM' specification.</a>
   */
  @Nonnull
  public String value;

  protected DOMTokenList() {
  }

  /**
   * The length read-only property of the DOMTokenList interface is an integer representing the number of objects stored in the object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList/length">DOMTokenList.length - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-domtokenlist-length">The definition of 'length' in the 'DOM' specification.</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The add() method of the DOMTokenList interface adds the given token to the list.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList/add">DOMTokenList.add - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-domtokenlist-add">The definition of 'add()' in the 'DOM' specification.</a>
   */
  public native void add(@Nonnull String... tokens);

  /**
   * The contains() method of the DOMTokenList interface returns a Boolean &mdash; true if the underlying list contains the given token, otherwise false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList/contains">DOMTokenList.contains - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-domtokenlist-contains">The definition of 'contains()' in the 'DOM' specification.</a>
   */
  public native boolean contains(@Nonnull String token);

  /**
   * The remove() method of the DOMTokenList interface removes the specified tokens from the list.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList/remove">DOMTokenList.remove - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-domtokenlist-remove">The definition of 'remove()' in the 'DOM' specification.</a>
   */
  public native void remove(@Nonnull String... tokens);

  /**
   * The replace() method of the DOMTokenList interface replaces an existing token with a new token. If the first token doesn't exist, replace() returns false immediately, without adding the new token to the token list.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList/replace">DOMTokenList.replace - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-domtokenlist-replace">The definition of 'replace()' in the 'DOM' specification.</a>
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
   * @see <a href="https://dom.spec.whatwg.org/#dom-domtokenlist-toggle">The definition of 'toggle()' in the 'DOM' specification.</a>
   */
  public native boolean toggle(@Nonnull String token, boolean force);

  /**
   * The toggle() method of the DOMTokenList interface removes a given token from the list and returns false. If token doesn't exist it's added and the function returns true.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList/toggle">DOMTokenList.toggle - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-domtokenlist-toggle">The definition of 'toggle()' in the 'DOM' specification.</a>
   */
  public native boolean toggle(@Nonnull String token);

  /**
   * The item() method of the DOMTokenList interface returns an item in the list by its index.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/DOMTokenList/item">DOMTokenList.item - MDN</a>
   * @see <a href="https://dom.spec.whatwg.org/#dom-domtokenlist-item">The definition of 'item()' in the 'DOM' specification.</a>
   */
  @Nullable
  public native String item(int index);
}
