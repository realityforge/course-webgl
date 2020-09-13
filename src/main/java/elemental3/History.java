package elemental3;

import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import org.intellij.lang.annotations.MagicConstant;

/**
 * The History interface allows manipulation of the browser session history, that is the pages visited in the tab or frame that the current page is loaded in.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/History">History - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "History"
)
public class History {
  /**
   * The scrollRestoration property of History interface allows web applications to explicitly set default scroll restoration behavior on history navigation.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/History/scrollRestoration">History.scrollRestoration - MDN</a>
   */
  @Nonnull
  @MagicConstant(
      valuesFromClass = ScrollRestoration.class
  )
  public String scrollRestoration;

  History() {
  }

  /**
   * The History.length read-only property returns an integer representing the number of elements in the session history, including the currently loaded page.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/History/length">History.length - MDN</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  /**
   * The History.state property returns a value representing the state at the top of the history stack.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/History/state">History.state - MDN</a>
   */
  @JsProperty(
      name = "state"
  )
  @Nullable
  public native Any state();

  /**
   * The History.back() method causes the browser to move back one page in the session history.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/History/back">History.back - MDN</a>
   */
  public native void back();

  /**
   * The History.forward() method causes the browser to move forward one page in the session history. It has the same effect as calling history.go(1).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/History/forward">History.forward - MDN</a>
   */
  public native void forward();

  /**
   * The History.go() method loads a specific page from the session history. You can use it to move forwards and backwards through the history depending on the value of a parameter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/History/go">History.go - MDN</a>
   */
  public native void go(int delta);

  /**
   * The History.go() method loads a specific page from the session history. You can use it to move forwards and backwards through the history depending on the value of a parameter.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/History/go">History.go - MDN</a>
   */
  public native void go();

  /**
   * In an HTML document, the history.pushState() method adds a state to the browser's session history stack.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/History/pushState">History.pushState - MDN</a>
   */
  public native void pushState(@Nullable Any data, @Nonnull String title, @Nullable String url);

  /**
   * In an HTML document, the history.pushState() method adds a state to the browser's session history stack.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/History/pushState">History.pushState - MDN</a>
   */
  public native void pushState(@DoNotAutobox @Nullable Object data, @Nonnull String title,
      @Nullable String url);

  /**
   * In an HTML document, the history.pushState() method adds a state to the browser's session history stack.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/History/pushState">History.pushState - MDN</a>
   */
  public native void pushState(@Nullable Any data, @Nonnull String title);

  /**
   * In an HTML document, the history.pushState() method adds a state to the browser's session history stack.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/History/pushState">History.pushState - MDN</a>
   */
  public native void pushState(@DoNotAutobox @Nullable Object data, @Nonnull String title);

  /**
   * The History.replaceState() method modifies the current history entry, replacing it with the stateObj, title, and URL passed in the method parameters. This method is particularly useful when you want to update the state object or URL of the current history entry in response to some user action.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/History/replaceState">History.replaceState - MDN</a>
   */
  public native void replaceState(@Nullable Any data, @Nonnull String title, @Nullable String url);

  /**
   * The History.replaceState() method modifies the current history entry, replacing it with the stateObj, title, and URL passed in the method parameters. This method is particularly useful when you want to update the state object or URL of the current history entry in response to some user action.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/History/replaceState">History.replaceState - MDN</a>
   */
  public native void replaceState(@DoNotAutobox @Nullable Object data, @Nonnull String title,
      @Nullable String url);

  /**
   * The History.replaceState() method modifies the current history entry, replacing it with the stateObj, title, and URL passed in the method parameters. This method is particularly useful when you want to update the state object or URL of the current history entry in response to some user action.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/History/replaceState">History.replaceState - MDN</a>
   */
  public native void replaceState(@Nullable Any data, @Nonnull String title);

  /**
   * The History.replaceState() method modifies the current history entry, replacing it with the stateObj, title, and URL passed in the method parameters. This method is particularly useful when you want to update the state object or URL of the current history entry in response to some user action.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/History/replaceState">History.replaceState - MDN</a>
   */
  public native void replaceState(@DoNotAutobox @Nullable Object data, @Nonnull String title);
}
