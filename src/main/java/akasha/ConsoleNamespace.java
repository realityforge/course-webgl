package akasha;

import akasha.lang.JsArray;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The console object provides access to the browser's debugging console (e.g. the Web Console in Firefox). The specifics of how it works varies from browser to browser, but there is a de facto set of features that are typically provided.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console">console - MDN</a>
 * @see <a href="https://console.spec.whatwg.org/">Console API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "console"
)
public final class ConsoleNamespace {
  private ConsoleNamespace() {
  }

  @JsMethod(
      name = "assert"
  )
  public native void assert_(boolean condition, @DoNotAutobox @Nullable Object... data);

  @JsMethod(
      name = "assert"
  )
  public native void assert_(boolean condition);

  /**
   * The console.clear() method clears the console if the environment allows it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/clear">console.clear - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#clear">console.clear() - Console API</a>
   */
  public native void clear();

  /**
   * The console.count() method logs the number of times that this particular call to count() has been called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/count">console.count - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#count">console.count() - Console API</a>
   */
  public native void count(@Nonnull String label);

  /**
   * The console.count() method logs the number of times that this particular call to count() has been called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/count">console.count - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#count">console.count() - Console API</a>
   */
  public native void count();

  /**
   * The console.countReset() method resets counter used with console.count().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/countReset">console.countReset - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#count">console.countReset() - Console API</a>
   */
  public native void countReset(@Nonnull String label);

  /**
   * The console.countReset() method resets counter used with console.count().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/countReset">console.countReset - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#count">console.countReset() - Console API</a>
   */
  public native void countReset();

  /**
   * The console method debug() outputs a message to the web console at the &quot;debug&quot; log level. The message is only displayed to the user if the console is configured to display debug output.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/debug">console.debug - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#debug">console.debug() - Console API</a>
   */
  public native void debug(@DoNotAutobox @Nullable Object... data);

  /**
   * The Console method dir() displays an interactive list of the properties of the specified JavaScript object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/dir">console.dir - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#dir">console.dir() - Console API</a>
   */
  public native void dir(@DoNotAutobox @Nullable Object item, @Nullable Object options);

  /**
   * The Console method dir() displays an interactive list of the properties of the specified JavaScript object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/dir">console.dir - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#dir">console.dir() - Console API</a>
   */
  public native void dir(@DoNotAutobox @Nullable Object item);

  /**
   * The Console method dir() displays an interactive list of the properties of the specified JavaScript object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/dir">console.dir - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#dir">console.dir() - Console API</a>
   */
  public native void dir();

  /**
   * Displays an interactive tree of the descendant elements of the specified XML/HTML element. If it is not possible to display as an element the JavaScript Object view is shown instead. The output is presented as a hierarchical listing of expandable nodes that let you see the contents of child nodes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/dirxml">console.dirxml - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#dirxml">console.dirxml() - Console API</a>
   */
  public native void dirxml(@DoNotAutobox @Nullable Object... data);

  /**
   * Outputs an error message to the Web Console.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/error">console.error - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#error">console.error() - Console API</a>
   */
  public native void error(@DoNotAutobox @Nullable Object... data);

  /**
   * Creates a new inline group in the Web Console log. This indents following console messages by an additional level, until console.groupEnd() is called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/group">console.group - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#group">console.group() - Console API</a>
   */
  public native void group(@DoNotAutobox @Nullable Object... data);

  /**
   * Creates a new inline group in the Web Console. Unlike console.group(), however, the new group is created collapsed. The user will need to use the disclosure button next to it to expand it, revealing the entries created in the group.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/groupCollapsed">console.groupCollapsed - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#groupcollapsed">console.groupCollapsed() - Console API</a>
   */
  public native void groupCollapsed(@DoNotAutobox @Nullable Object... data);

  /**
   * Exits the current inline group in the Web Console. See Using groups in the console in the console documentation for details and examples.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/groupEnd">console.groupEnd - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#groupend">console.groupEnd() - Console API</a>
   */
  public native void groupEnd();

  /**
   * The console.info() method outputs an informational message to the Web Console. In Firefox, a small &quot;i&quot; icon is displayed next to these items in the Web Console's log.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/info">console.info - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#info">console.info() - Console API</a>
   */
  public native void info(@DoNotAutobox @Nullable Object... data);

  /**
   * The Console method log() outputs a message to the web console.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/log">console.log - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#log">console.log() - Console API</a>
   */
  public native void log(@DoNotAutobox @Nullable Object... data);

  /**
   * Displays tabular data as a table.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/table">console.table - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#table">console.table() - Console API</a>
   */
  public native void table(@DoNotAutobox @Nullable Object tabularData,
      @Nonnull JsArray<String> properties);

  /**
   * Displays tabular data as a table.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/table">console.table - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#table">console.table() - Console API</a>
   */
  public native void table(@DoNotAutobox @Nullable Object tabularData,
      @Nonnull String[] properties);

  /**
   * Displays tabular data as a table.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/table">console.table - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#table">console.table() - Console API</a>
   */
  public native void table(@DoNotAutobox @Nullable Object tabularData);

  /**
   * Displays tabular data as a table.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/table">console.table - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#table">console.table() - Console API</a>
   */
  public native void table();

  /**
   * Starts a timer you can use to track how long an operation takes. You give each timer a unique name, and may have up to 10,000 timers running on a given page. When you call console.timeEnd() with the same name, the browser will output the time, in milliseconds, that elapsed since the timer was started.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/time">console.time - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#time">console.time() - Console API</a>
   */
  public native void time(@Nonnull String label);

  /**
   * Starts a timer you can use to track how long an operation takes. You give each timer a unique name, and may have up to 10,000 timers running on a given page. When you call console.timeEnd() with the same name, the browser will output the time, in milliseconds, that elapsed since the timer was started.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/time">console.time - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#time">console.time() - Console API</a>
   */
  public native void time();

  /**
   * Stops a timer that was previously started by calling console.time().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/timeEnd">console.timeEnd - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#timeend">console.timeEnd() - Console API</a>
   */
  public native void timeEnd(@Nonnull String label);

  /**
   * Stops a timer that was previously started by calling console.time().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/timeEnd">console.timeEnd - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#timeend">console.timeEnd() - Console API</a>
   */
  public native void timeEnd();

  /**
   * Logs the current value of a timer that was previously started by calling console.time() to the console.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/timeLog">console.timeLog - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#timelog">console.timeLog() - Console API</a>
   */
  public native void timeLog(@Nonnull String label, @DoNotAutobox @Nullable Object... data);

  /**
   * Logs the current value of a timer that was previously started by calling console.time() to the console.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/timeLog">console.timeLog - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#timelog">console.timeLog() - Console API</a>
   */
  public native void timeLog(@Nonnull String label);

  /**
   * The console interface's trace() method outputs a stack trace to the Web Console.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/trace">console.trace - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#trace">console.trace() - Console API</a>
   */
  public native void trace(@DoNotAutobox @Nullable Object... data);

  /**
   * Outputs a warning message to the Web Console.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/warn">console.warn - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#warn">console.warn() - Console API</a>
   */
  public native void warn(@DoNotAutobox @Nullable Object... data);
}
