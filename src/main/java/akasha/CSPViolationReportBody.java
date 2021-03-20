package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CSPViolationReportBody"
)
public class CSPViolationReportBody extends ReportBody {
  protected CSPViolationReportBody() {
  }

  @JsProperty(
      name = "blockedURL"
  )
  @Nullable
  public native String blockedURL();

  @JsProperty(
      name = "columnNumber"
  )
  @Nullable
  public native Double columnNumber();

  @JsProperty(
      name = "disposition"
  )
  @Nonnull
  @SecurityPolicyViolationEventDisposition
  public native String disposition();

  @JsProperty(
      name = "documentURL"
  )
  @Nonnull
  public native String documentURL();

  @JsProperty(
      name = "effectiveDirective"
  )
  @Nonnull
  public native String effectiveDirective();

  @JsProperty(
      name = "lineNumber"
  )
  @Nullable
  public native Double lineNumber();

  @JsProperty(
      name = "originalPolicy"
  )
  @Nonnull
  public native String originalPolicy();

  @JsProperty(
      name = "referrer"
  )
  @Nullable
  public native String referrer();

  @JsProperty(
      name = "sample"
  )
  @Nullable
  public native String sample();

  @JsProperty(
      name = "sourceFile"
  )
  @Nullable
  public native String sourceFile();

  @JsProperty(
      name = "statusCode"
  )
  public native int statusCode();
}
