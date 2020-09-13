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
public interface EventModifierInit extends UIEventInit {
  @JsOverlay
  @Nonnull
  static EventModifierInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "altKey"
  )
  boolean altKey();

  @JsProperty
  void setAltKey(boolean altKey);

  @JsOverlay
  @Nonnull
  default EventModifierInit altKey(final boolean altKey) {
    setAltKey( altKey );
    return this;
  }

  @JsProperty(
      name = "ctrlKey"
  )
  boolean ctrlKey();

  @JsProperty
  void setCtrlKey(boolean ctrlKey);

  @JsOverlay
  @Nonnull
  default EventModifierInit ctrlKey(final boolean ctrlKey) {
    setCtrlKey( ctrlKey );
    return this;
  }

  @JsProperty(
      name = "metaKey"
  )
  boolean metaKey();

  @JsProperty
  void setMetaKey(boolean metaKey);

  @JsOverlay
  @Nonnull
  default EventModifierInit metaKey(final boolean metaKey) {
    setMetaKey( metaKey );
    return this;
  }

  @JsProperty(
      name = "modifierAltGraph"
  )
  boolean modifierAltGraph();

  @JsProperty
  void setModifierAltGraph(boolean modifierAltGraph);

  @JsOverlay
  @Nonnull
  default EventModifierInit modifierAltGraph(final boolean modifierAltGraph) {
    setModifierAltGraph( modifierAltGraph );
    return this;
  }

  @JsProperty(
      name = "modifierCapsLock"
  )
  boolean modifierCapsLock();

  @JsProperty
  void setModifierCapsLock(boolean modifierCapsLock);

  @JsOverlay
  @Nonnull
  default EventModifierInit modifierCapsLock(final boolean modifierCapsLock) {
    setModifierCapsLock( modifierCapsLock );
    return this;
  }

  @JsProperty(
      name = "modifierFn"
  )
  boolean modifierFn();

  @JsProperty
  void setModifierFn(boolean modifierFn);

  @JsOverlay
  @Nonnull
  default EventModifierInit modifierFn(final boolean modifierFn) {
    setModifierFn( modifierFn );
    return this;
  }

  @JsProperty(
      name = "modifierFnLock"
  )
  boolean modifierFnLock();

  @JsProperty
  void setModifierFnLock(boolean modifierFnLock);

  @JsOverlay
  @Nonnull
  default EventModifierInit modifierFnLock(final boolean modifierFnLock) {
    setModifierFnLock( modifierFnLock );
    return this;
  }

  @JsProperty(
      name = "modifierHyper"
  )
  boolean modifierHyper();

  @JsProperty
  void setModifierHyper(boolean modifierHyper);

  @JsOverlay
  @Nonnull
  default EventModifierInit modifierHyper(final boolean modifierHyper) {
    setModifierHyper( modifierHyper );
    return this;
  }

  @JsProperty(
      name = "modifierNumLock"
  )
  boolean modifierNumLock();

  @JsProperty
  void setModifierNumLock(boolean modifierNumLock);

  @JsOverlay
  @Nonnull
  default EventModifierInit modifierNumLock(final boolean modifierNumLock) {
    setModifierNumLock( modifierNumLock );
    return this;
  }

  @JsProperty(
      name = "modifierScrollLock"
  )
  boolean modifierScrollLock();

  @JsProperty
  void setModifierScrollLock(boolean modifierScrollLock);

  @JsOverlay
  @Nonnull
  default EventModifierInit modifierScrollLock(final boolean modifierScrollLock) {
    setModifierScrollLock( modifierScrollLock );
    return this;
  }

  @JsProperty(
      name = "modifierSuper"
  )
  boolean modifierSuper();

  @JsProperty
  void setModifierSuper(boolean modifierSuper);

  @JsOverlay
  @Nonnull
  default EventModifierInit modifierSuper(final boolean modifierSuper) {
    setModifierSuper( modifierSuper );
    return this;
  }

  @JsProperty(
      name = "modifierSymbol"
  )
  boolean modifierSymbol();

  @JsProperty
  void setModifierSymbol(boolean modifierSymbol);

  @JsOverlay
  @Nonnull
  default EventModifierInit modifierSymbol(final boolean modifierSymbol) {
    setModifierSymbol( modifierSymbol );
    return this;
  }

  @JsProperty(
      name = "modifierSymbolLock"
  )
  boolean modifierSymbolLock();

  @JsProperty
  void setModifierSymbolLock(boolean modifierSymbolLock);

  @JsOverlay
  @Nonnull
  default EventModifierInit modifierSymbolLock(final boolean modifierSymbolLock) {
    setModifierSymbolLock( modifierSymbolLock );
    return this;
  }

  @JsProperty(
      name = "shiftKey"
  )
  boolean shiftKey();

  @JsProperty
  void setShiftKey(boolean shiftKey);

  @JsOverlay
  @Nonnull
  default EventModifierInit shiftKey(final boolean shiftKey) {
    setShiftKey( shiftKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default EventModifierInit detail(final int detail) {
    setDetail( detail );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default EventModifierInit view(@Nullable final Window view) {
    setView( view );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default EventModifierInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default EventModifierInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default EventModifierInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
