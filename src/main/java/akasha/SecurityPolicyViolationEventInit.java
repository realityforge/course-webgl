package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface SecurityPolicyViolationEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static SecurityPolicyViolationEventInit create(
      @SecurityPolicyViolationEventDisposition @Nonnull final String disposition,
      @Nonnull final String documentURL, @Nonnull final String effectiveDirective,
      @Nonnull final String originalPolicy, final int statusCode) {
    return Js.<SecurityPolicyViolationEventInit>uncheckedCast( JsPropertyMap.of() ).disposition( disposition ).documentURL( documentURL ).effectiveDirective( effectiveDirective ).originalPolicy( originalPolicy ).statusCode( statusCode );
  }

  @JsProperty(
      name = "blockedURL"
  )
  String blockedURL();

  @JsProperty
  void setBlockedURL(@Nonnull String blockedURL);

  @JsOverlay
  @Nonnull
  default SecurityPolicyViolationEventInit blockedURL(@Nonnull final String blockedURL) {
    setBlockedURL( blockedURL );
    return this;
  }

  @JsProperty(
      name = "colno"
  )
  int colno();

  @JsProperty
  void setColno(int colno);

  @JsOverlay
  @Nonnull
  default SecurityPolicyViolationEventInit colno(final int colno) {
    setColno( colno );
    return this;
  }

  @JsProperty(
      name = "disposition"
  )
  @SecurityPolicyViolationEventDisposition
  @Nonnull
  String disposition();

  @JsProperty
  void setDisposition(@SecurityPolicyViolationEventDisposition @Nonnull String disposition);

  @JsOverlay
  @Nonnull
  default SecurityPolicyViolationEventInit disposition(
      @SecurityPolicyViolationEventDisposition @Nonnull final String disposition) {
    setDisposition( disposition );
    return this;
  }

  @JsProperty(
      name = "documentURL"
  )
  @Nonnull
  String documentURL();

  @JsProperty
  void setDocumentURL(@Nonnull String documentURL);

  @JsOverlay
  @Nonnull
  default SecurityPolicyViolationEventInit documentURL(@Nonnull final String documentURL) {
    setDocumentURL( documentURL );
    return this;
  }

  @JsProperty(
      name = "effectiveDirective"
  )
  @Nonnull
  String effectiveDirective();

  @JsProperty
  void setEffectiveDirective(@Nonnull String effectiveDirective);

  @JsOverlay
  @Nonnull
  default SecurityPolicyViolationEventInit effectiveDirective(
      @Nonnull final String effectiveDirective) {
    setEffectiveDirective( effectiveDirective );
    return this;
  }

  @JsProperty(
      name = "lineno"
  )
  int lineno();

  @JsProperty
  void setLineno(int lineno);

  @JsOverlay
  @Nonnull
  default SecurityPolicyViolationEventInit lineno(final int lineno) {
    setLineno( lineno );
    return this;
  }

  @JsProperty(
      name = "originalPolicy"
  )
  @Nonnull
  String originalPolicy();

  @JsProperty
  void setOriginalPolicy(@Nonnull String originalPolicy);

  @JsOverlay
  @Nonnull
  default SecurityPolicyViolationEventInit originalPolicy(@Nonnull final String originalPolicy) {
    setOriginalPolicy( originalPolicy );
    return this;
  }

  @JsProperty(
      name = "referrer"
  )
  String referrer();

  @JsProperty
  void setReferrer(@Nonnull String referrer);

  @JsOverlay
  @Nonnull
  default SecurityPolicyViolationEventInit referrer(@Nonnull final String referrer) {
    setReferrer( referrer );
    return this;
  }

  @JsProperty(
      name = "sample"
  )
  String sample();

  @JsProperty
  void setSample(@Nonnull String sample);

  @JsOverlay
  @Nonnull
  default SecurityPolicyViolationEventInit sample(@Nonnull final String sample) {
    setSample( sample );
    return this;
  }

  @JsProperty(
      name = "sourceFile"
  )
  String sourceFile();

  @JsProperty
  void setSourceFile(@Nonnull String sourceFile);

  @JsOverlay
  @Nonnull
  default SecurityPolicyViolationEventInit sourceFile(@Nonnull final String sourceFile) {
    setSourceFile( sourceFile );
    return this;
  }

  @JsProperty(
      name = "statusCode"
  )
  int statusCode();

  @JsProperty
  void setStatusCode(int statusCode);

  @JsOverlay
  @Nonnull
  default SecurityPolicyViolationEventInit statusCode(final int statusCode) {
    setStatusCode( statusCode );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SecurityPolicyViolationEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SecurityPolicyViolationEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SecurityPolicyViolationEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
