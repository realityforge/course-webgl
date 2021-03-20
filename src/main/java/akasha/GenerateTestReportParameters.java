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
public interface GenerateTestReportParameters {
  @JsOverlay
  @Nonnull
  static GenerateTestReportParameters create(@Nonnull final String message) {
    return Js.<GenerateTestReportParameters>uncheckedCast( JsPropertyMap.of() ).message( message );
  }

  @JsProperty(
      name = "group"
  )
  String group();

  @JsProperty
  void setGroup(@Nonnull String group);

  @JsOverlay
  @Nonnull
  default GenerateTestReportParameters group(@Nonnull final String group) {
    setGroup( group );
    return this;
  }

  @JsProperty(
      name = "message"
  )
  @Nonnull
  String message();

  @JsProperty
  void setMessage(@Nonnull String message);

  @JsOverlay
  @Nonnull
  default GenerateTestReportParameters message(@Nonnull final String message) {
    setMessage( message );
    return this;
  }
}
