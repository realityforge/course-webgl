package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The Report interface of the Reporting API represents a single report.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Report">Report - MDN</a>
 * @see <a href="https://w3c.github.io/reporting/#dom-report">The definition of 'Report' in the 'Reporting API' specification.</a>
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
   * @see <a href="https://w3c.github.io/reporting/#dom-report-body">The definition of 'Report.body' in the 'Reporting API' specification.</a>
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
   * @see <a href="https://w3c.github.io/reporting/#dom-report-body">The definition of 'Report.body' in the 'Reporting API' specification.</a>
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
   * @see <a href="https://w3c.github.io/reporting/#dom-report-url">The definition of 'Report.url' in the 'Reporting API' specification.</a>
   */
  @JsProperty(
      name = "url"
  )
  @Nonnull
  public native String url();

  @Nonnull
  public native Object toJSON();
}
