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
public interface ScrollIntoViewOptions extends ScrollOptions {
  @JsOverlay
  @Nonnull
  static ScrollIntoViewOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "block"
  )
  @MagicConstant(
      valuesFromClass = ScrollLogicalPosition.class
  )
  String block();

  @JsProperty
  void setBlock(
      @MagicConstant(valuesFromClass = ScrollLogicalPosition.class) @Nonnull String block);

  @JsOverlay
  @Nonnull
  default ScrollIntoViewOptions block(
      @MagicConstant(valuesFromClass = ScrollLogicalPosition.class) @Nonnull final String block) {
    setBlock( block );
    return this;
  }

  @JsProperty(
      name = "inline"
  )
  @MagicConstant(
      valuesFromClass = ScrollLogicalPosition.class
  )
  String inline();

  @JsProperty
  void setInline(
      @MagicConstant(valuesFromClass = ScrollLogicalPosition.class) @Nonnull String inline);

  @JsOverlay
  @Nonnull
  default ScrollIntoViewOptions inline(
      @MagicConstant(valuesFromClass = ScrollLogicalPosition.class) @Nonnull final String inline) {
    setInline( inline );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default ScrollIntoViewOptions behavior(
      @MagicConstant(valuesFromClass = ScrollBehavior.class) @Nonnull final String behavior) {
    setBehavior( behavior );
    return this;
  }
}
