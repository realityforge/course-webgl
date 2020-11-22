package elemental3;

import elemental3.core.JsArray;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * The console object provides access to the browser's debugging console (e.g. the Web Console in Firefox). The specifics of how it works varies from browser to browser, but there is a de facto set of features that are typically provided.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console">console - MDN</a>
 * @see <a href="https://console.spec.whatwg.org/">Console API</a>
 */
@Generated("org.realityforge.webtack")
public final class Console {
  private Console() {
  }

  public static void assert_(boolean condition, @DoNotAutobox @Nullable Object... data) {
    namespace().assert_(condition, data);
  }

  public static void assert_(boolean condition) {
    namespace().assert_(condition);
  }

  /**
   * The console.clear() method clears the console if the environment allows it.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/clear">console.clear - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#clear">The definition of 'console.clear()' in the 'Console API' specification.</a>
   */
  public static void clear() {
    namespace().clear();
  }

  /**
   * The console.count() method logs the number of times that this particular call to count() has been called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/count">console.count - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#count">The definition of 'console.count()' in the 'Console API' specification.</a>
   */
  public static void count(@Nonnull String label) {
    namespace().count(label);
  }

  /**
   * The console.count() method logs the number of times that this particular call to count() has been called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/count">console.count - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#count">The definition of 'console.count()' in the 'Console API' specification.</a>
   */
  public static void count() {
    namespace().count();
  }

  /**
   * The console.countReset() method resets counter used with console.count().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/countReset">console.countReset - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#count">The definition of 'console.countReset()' in the 'Console API' specification.</a>
   */
  public static void countReset(@Nonnull String label) {
    namespace().countReset(label);
  }

  /**
   * The console.countReset() method resets counter used with console.count().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/countReset">console.countReset - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#count">The definition of 'console.countReset()' in the 'Console API' specification.</a>
   */
  public static void countReset() {
    namespace().countReset();
  }

  /**
   * The console method debug() outputs a message to the web console at the &quot;debug&quot; log level. The message is only displayed to the user if the console is configured to display debug output.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/debug">console.debug - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#debug">The definition of 'console.debug()' in the 'Console API' specification.</a>
   */
  public static void debug(@DoNotAutobox @Nullable Object... data) {
    namespace().debug(data);
  }

  /**
   * The Console method dir() displays an interactive list of the properties of the specified JavaScript object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/dir">console.dir - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#dir">The definition of 'console.dir()' in the 'Console API' specification.</a>
   */
  public static void dir(@DoNotAutobox @Nullable Object item, @Nullable Object options) {
    namespace().dir(item, options);
  }

  /**
   * The Console method dir() displays an interactive list of the properties of the specified JavaScript object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/dir">console.dir - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#dir">The definition of 'console.dir()' in the 'Console API' specification.</a>
   */
  public static void dir(@DoNotAutobox @Nullable Object item) {
    namespace().dir(item);
  }

  /**
   * The Console method dir() displays an interactive list of the properties of the specified JavaScript object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/dir">console.dir - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#dir">The definition of 'console.dir()' in the 'Console API' specification.</a>
   */
  public static void dir() {
    namespace().dir();
  }

  /**
   * Displays an interactive tree of the descendant elements of the specified XML/HTML element. If it is not possible to display as an element the JavaScript Object view is shown instead. The output is presented as a hierarchical listing of expandable nodes that let you see the contents of child nodes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/dirxml">console.dirxml - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#dirxml">The definition of 'console.dirxml()' in the 'Console API' specification.</a>
   */
  public static void dirxml(@DoNotAutobox @Nullable Object... data) {
    namespace().dirxml(data);
  }

  /**
   * Outputs an error message to the Web Console.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/error">console.error - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#error">The definition of 'console.error()' in the 'Console API' specification.</a>
   */
  public static void error(@DoNotAutobox @Nullable Object... data) {
    namespace().error(data);
  }

  /**
   * Creates a new inline group in the Web Console log. This indents following console messages by an additional level, until console.groupEnd() is called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/group">console.group - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#group">The definition of 'console.group()' in the 'Console API' specification.</a>
   */
  public static void group(@DoNotAutobox @Nullable Object... data) {
    namespace().group(data);
  }

  /**
   * Creates a new inline group in the Web Console. Unlike console.group(), however, the new group is created collapsed. The user will need to use the disclosure button next to it to expand it, revealing the entries created in the group.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/groupCollapsed">console.groupCollapsed - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#groupcollapsed">The definition of 'console.groupCollapsed()' in the 'Console API' specification.</a>
   */
  public static void groupCollapsed(@DoNotAutobox @Nullable Object... data) {
    namespace().groupCollapsed(data);
  }

  /**
   * Exits the current inline group in the Web Console. See Using groups in the console in the console documentation for details and examples.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/groupEnd">console.groupEnd - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#groupend">The definition of 'console.groupEnd()' in the 'Console API' specification.</a>
   */
  public static void groupEnd() {
    namespace().groupEnd();
  }

  /**
   * The console.info() method outputs an informational message to the Web Console. In Firefox, a small &quot;i&quot; icon is displayed next to these items in the Web Console's log.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/info">console.info - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#info">The definition of 'console.info()' in the 'Console API' specification.</a>
   */
  public static void info(@DoNotAutobox @Nullable Object... data) {
    namespace().info(data);
  }

  /**
   * The Console method log() outputs a message to the web console.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/log">console.log - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#log">The definition of 'console.log()' in the 'Console API' specification.</a>
   */
  public static void log(@DoNotAutobox @Nullable Object... data) {
    namespace().log(data);
  }

  /**
   * Displays tabular data as a table.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/table">console.table - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#table">The definition of 'console.table()' in the 'Console API' specification.</a>
   */
  public static void table(@DoNotAutobox @Nullable Object tabularData,
      @Nonnull JsArray<String> properties) {
    namespace().table(tabularData, properties);
  }

  /**
   * Displays tabular data as a table.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/table">console.table - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#table">The definition of 'console.table()' in the 'Console API' specification.</a>
   */
  public static void table(@DoNotAutobox @Nullable Object tabularData,
      @Nonnull String[] properties) {
    namespace().table(tabularData, properties);
  }

  /**
   * Displays tabular data as a table.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/table">console.table - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#table">The definition of 'console.table()' in the 'Console API' specification.</a>
   */
  public static void table(@DoNotAutobox @Nullable Object tabularData) {
    namespace().table(tabularData);
  }

  /**
   * Displays tabular data as a table.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/table">console.table - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#table">The definition of 'console.table()' in the 'Console API' specification.</a>
   */
  public static void table() {
    namespace().table();
  }

  /**
   * Starts a timer you can use to track how long an operation takes. You give each timer a unique name, and may have up to 10,000 timers running on a given page. When you call console.timeEnd() with the same name, the browser will output the time, in milliseconds, that elapsed since the timer was started.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/time">console.time - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#time">The definition of 'console.time()' in the 'Console API' specification.</a>
   */
  public static void time(@Nonnull String label) {
    namespace().time(label);
  }

  /**
   * Starts a timer you can use to track how long an operation takes. You give each timer a unique name, and may have up to 10,000 timers running on a given page. When you call console.timeEnd() with the same name, the browser will output the time, in milliseconds, that elapsed since the timer was started.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/time">console.time - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#time">The definition of 'console.time()' in the 'Console API' specification.</a>
   */
  public static void time() {
    namespace().time();
  }

  /**
   * Stops a timer that was previously started by calling console.time().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/timeEnd">console.timeEnd - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#timeend">The definition of 'console.timeEnd()' in the 'Console API' specification.</a>
   */
  public static void timeEnd(@Nonnull String label) {
    namespace().timeEnd(label);
  }

  /**
   * Stops a timer that was previously started by calling console.time().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/timeEnd">console.timeEnd - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#timeend">The definition of 'console.timeEnd()' in the 'Console API' specification.</a>
   */
  public static void timeEnd() {
    namespace().timeEnd();
  }

  /**
   * Logs the current value of a timer that was previously started by calling console.time() to the console.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/timeLog">console.timeLog - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#timelog">The definition of 'console.timeLog()' in the 'Console API' specification.</a>
   */
  public static void timeLog(@Nonnull String label, @DoNotAutobox @Nullable Object... data) {
    namespace().timeLog(label, data);
  }

  /**
   * Logs the current value of a timer that was previously started by calling console.time() to the console.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/timeLog">console.timeLog - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#timelog">The definition of 'console.timeLog()' in the 'Console API' specification.</a>
   */
  public static void timeLog(@Nonnull String label) {
    namespace().timeLog(label);
  }

  /**
   * The console interface's trace() method outputs a stack trace to the Web Console.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/trace">console.trace - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#trace">The definition of 'console.trace()' in the 'Console API' specification.</a>
   */
  public static void trace(@DoNotAutobox @Nullable Object... data) {
    namespace().trace(data);
  }

  /**
   * Outputs a warning message to the Web Console.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/console/warn">console.warn - MDN</a>
   * @see <a href="https://console.spec.whatwg.org/#warn">The definition of 'console.warn()' in the 'Console API' specification.</a>
   */
  public static void warn(@DoNotAutobox @Nullable Object... data) {
    namespace().warn(data);
  }

  /**
   * Return the 'console' namespace object.
   *
   * @return the 'console' namespace object
   */
  @Nonnull
  public static ConsoleNamespace namespace() {
    return Global.console();
  }
}
