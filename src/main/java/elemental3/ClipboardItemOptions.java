package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
public interface ClipboardItemOptions {
  @JsOverlay
  @Nonnull
  static ClipboardItemOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "presentationStyle"
  )
  @MagicConstant(
      valuesFromClass = PresentationStyle.class
  )
  String presentationStyle();

  @JsProperty
  void setPresentationStyle(
      @MagicConstant(valuesFromClass = PresentationStyle.class) @Nonnull String presentationStyle);

  @JsOverlay
  @Nonnull
  default ClipboardItemOptions presentationStyle(
      @MagicConstant(valuesFromClass = PresentationStyle.class) @Nonnull final String presentationStyle) {
    setPresentationStyle( presentationStyle );
    return this;
  }
}
