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
public interface BlobPropertyBag {
  @JsOverlay
  @Nonnull
  static BlobPropertyBag create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "endings"
  )
  @MagicConstant(
      valuesFromClass = EndingType.class
  )
  String endings();

  @JsProperty
  void setEndings(@MagicConstant(valuesFromClass = EndingType.class) @Nonnull String endings);

  @JsOverlay
  @Nonnull
  default BlobPropertyBag endings(
      @MagicConstant(valuesFromClass = EndingType.class) @Nonnull final String endings) {
    setEndings( endings );
    return this;
  }

  @JsProperty(
      name = "type"
  )
  String type();

  @JsProperty
  void setType(@Nonnull String type);

  @JsOverlay
  @Nonnull
  default BlobPropertyBag type(@Nonnull final String type) {
    setType( type );
    return this;
  }
}
