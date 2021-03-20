package akasha;

import akasha.lang.JsArray;
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
    name = "Object"
)
public interface TouchEventInit extends EventModifierInit {
  @JsOverlay
  @Nonnull
  static TouchEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "changedTouches"
  )
  JsArray<Touch> changedTouches();

  @JsProperty
  void setChangedTouches(@Nonnull JsArray<Touch> changedTouches);

  @JsOverlay
  @Nonnull
  default TouchEventInit changedTouches(@Nonnull final JsArray<Touch> changedTouches) {
    setChangedTouches( changedTouches );
    return this;
  }

  @JsOverlay
  default void setChangedTouches(@Nonnull final Touch... changedTouches) {
    setChangedTouches( Js.<JsArray<Touch>>uncheckedCast( changedTouches ) );
  }

  @JsOverlay
  @Nonnull
  default TouchEventInit changedTouches(@Nonnull final Touch... changedTouches) {
    setChangedTouches( changedTouches );
    return this;
  }

  @JsProperty(
      name = "targetTouches"
  )
  JsArray<Touch> targetTouches();

  @JsProperty
  void setTargetTouches(@Nonnull JsArray<Touch> targetTouches);

  @JsOverlay
  @Nonnull
  default TouchEventInit targetTouches(@Nonnull final JsArray<Touch> targetTouches) {
    setTargetTouches( targetTouches );
    return this;
  }

  @JsOverlay
  default void setTargetTouches(@Nonnull final Touch... targetTouches) {
    setTargetTouches( Js.<JsArray<Touch>>uncheckedCast( targetTouches ) );
  }

  @JsOverlay
  @Nonnull
  default TouchEventInit targetTouches(@Nonnull final Touch... targetTouches) {
    setTargetTouches( targetTouches );
    return this;
  }

  @JsProperty(
      name = "touches"
  )
  JsArray<Touch> touches();

  @JsProperty
  void setTouches(@Nonnull JsArray<Touch> touches);

  @JsOverlay
  @Nonnull
  default TouchEventInit touches(@Nonnull final JsArray<Touch> touches) {
    setTouches( touches );
    return this;
  }

  @JsOverlay
  default void setTouches(@Nonnull final Touch... touches) {
    setTouches( Js.<JsArray<Touch>>uncheckedCast( touches ) );
  }

  @JsOverlay
  @Nonnull
  default TouchEventInit touches(@Nonnull final Touch... touches) {
    setTouches( touches );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default TouchEventInit altKey(final boolean altKey) {
    setAltKey( altKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default TouchEventInit ctrlKey(final boolean ctrlKey) {
    setCtrlKey( ctrlKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default TouchEventInit metaKey(final boolean metaKey) {
    setMetaKey( metaKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default TouchEventInit modifierAltGraph(final boolean modifierAltGraph) {
    setModifierAltGraph( modifierAltGraph );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default TouchEventInit modifierCapsLock(final boolean modifierCapsLock) {
    setModifierCapsLock( modifierCapsLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default TouchEventInit modifierFn(final boolean modifierFn) {
    setModifierFn( modifierFn );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default TouchEventInit modifierFnLock(final boolean modifierFnLock) {
    setModifierFnLock( modifierFnLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default TouchEventInit modifierHyper(final boolean modifierHyper) {
    setModifierHyper( modifierHyper );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default TouchEventInit modifierNumLock(final boolean modifierNumLock) {
    setModifierNumLock( modifierNumLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default TouchEventInit modifierScrollLock(final boolean modifierScrollLock) {
    setModifierScrollLock( modifierScrollLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default TouchEventInit modifierSuper(final boolean modifierSuper) {
    setModifierSuper( modifierSuper );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default TouchEventInit modifierSymbol(final boolean modifierSymbol) {
    setModifierSymbol( modifierSymbol );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default TouchEventInit modifierSymbolLock(final boolean modifierSymbolLock) {
    setModifierSymbolLock( modifierSymbolLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default TouchEventInit shiftKey(final boolean shiftKey) {
    setShiftKey( shiftKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default TouchEventInit detail(final int detail) {
    setDetail( detail );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default TouchEventInit view(@Nullable final Window view) {
    setView( view );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default TouchEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default TouchEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default TouchEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
