package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
    name = "?"
)
public interface KeyboardEventInit extends EventModifierInit {
  @JsOverlay
  @Nonnull
  static KeyboardEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "code"
  )
  String code();

  @JsProperty
  void setCode(@Nonnull String code);

  @JsOverlay
  @Nonnull
  default KeyboardEventInit code(@Nonnull final String code) {
    setCode( code );
    return this;
  }

  @JsProperty(
      name = "isComposing"
  )
  boolean isComposing();

  @JsProperty
  void setIsComposing(boolean isComposing);

  @JsOverlay
  @Nonnull
  default KeyboardEventInit isComposing(final boolean isComposing) {
    setIsComposing( isComposing );
    return this;
  }

  @JsProperty(
      name = "key"
  )
  String key();

  @JsProperty
  void setKey(@Nonnull String key);

  @JsOverlay
  @Nonnull
  default KeyboardEventInit key(@Nonnull final String key) {
    setKey( key );
    return this;
  }

  @JsProperty(
      name = "location"
  )
  int location();

  @JsProperty
  void setLocation(int location);

  @JsOverlay
  @Nonnull
  default KeyboardEventInit location(final int location) {
    setLocation( location );
    return this;
  }

  @JsProperty(
      name = "repeat"
  )
  boolean repeat();

  @JsProperty
  void setRepeat(boolean repeat);

  @JsOverlay
  @Nonnull
  default KeyboardEventInit repeat(final boolean repeat) {
    setRepeat( repeat );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyboardEventInit altKey(final boolean altKey) {
    setAltKey( altKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyboardEventInit ctrlKey(final boolean ctrlKey) {
    setCtrlKey( ctrlKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyboardEventInit metaKey(final boolean metaKey) {
    setMetaKey( metaKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyboardEventInit modifierAltGraph(final boolean modifierAltGraph) {
    setModifierAltGraph( modifierAltGraph );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyboardEventInit modifierCapsLock(final boolean modifierCapsLock) {
    setModifierCapsLock( modifierCapsLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyboardEventInit modifierFn(final boolean modifierFn) {
    setModifierFn( modifierFn );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyboardEventInit modifierFnLock(final boolean modifierFnLock) {
    setModifierFnLock( modifierFnLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyboardEventInit modifierHyper(final boolean modifierHyper) {
    setModifierHyper( modifierHyper );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyboardEventInit modifierNumLock(final boolean modifierNumLock) {
    setModifierNumLock( modifierNumLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyboardEventInit modifierScrollLock(final boolean modifierScrollLock) {
    setModifierScrollLock( modifierScrollLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyboardEventInit modifierSuper(final boolean modifierSuper) {
    setModifierSuper( modifierSuper );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyboardEventInit modifierSymbol(final boolean modifierSymbol) {
    setModifierSymbol( modifierSymbol );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyboardEventInit modifierSymbolLock(final boolean modifierSymbolLock) {
    setModifierSymbolLock( modifierSymbolLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyboardEventInit shiftKey(final boolean shiftKey) {
    setShiftKey( shiftKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyboardEventInit detail(final int detail) {
    setDetail( detail );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyboardEventInit view(@Nullable final Window view) {
    setView( view );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyboardEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyboardEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default KeyboardEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
