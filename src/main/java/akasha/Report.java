package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Report interface of the Reporting API represents a single report.Reports can be accessed in a number of ways:Via the ReportingObserver.takeRecords() method &mdash; this returns all reports in an observer's report queue, and then empties the queue.Via the reports parameter of the callback function passed into the ReportingObserver() constructor upon creation of a new observer instance. This contains the list of reports currently contained in the observer's report queue.By sending requests to the endpoints defined via the Report-To HTTP header.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Report">Report - MDN</a>
 * @see <a href="https://w3c.github.io/reporting/#dom-report">Report - Reporting API</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Report"
)
public class Report {
  protected Report() {
  }

  /**
   * The body read-only property of the Report interface returns the body of the report, which is a ReportBody object containing the detailed report information.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Report/body">Report.body - MDN</a>
   * @see <a href="https://w3c.github.io/reporting/#dom-report-body">Report.body - Reporting API</a>
   */
  @JsProperty(
      name = "body"
  )
  @Nullable
  public native ReportBody body();

  /**
   * The type read-only property of the Report interface returns the type of report generated, e.g. deprecation or intervention.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Report/type">Report.type - MDN</a>
   * @see <a href="https://w3c.github.io/reporting/#dom-report-body">Report.body - Reporting API</a>
   */
  @JsProperty(
      name = "type"
  )
  @Nonnull
  public native String type();

  /**
   * The url read-only property of the Report interface returns the URL of the document that generated the report.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Report/url">Report.url - MDN</a>
   * @see <a href="https://w3c.github.io/reporting/#dom-report-url">Report.url - Reporting API</a>
   */
  @JsProperty(
      name = "url"
  )
  @Nonnull
  public native String url();

  @Nonnull
  public native Object toJSON();
}
