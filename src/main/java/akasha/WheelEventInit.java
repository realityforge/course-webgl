package akasha;

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
public interface WheelEventInit extends MouseEventInit {
  @JsOverlay
  @Nonnull
  static WheelEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "deltaMode"
  )
  int deltaMode();

  @JsProperty
  void setDeltaMode(int deltaMode);

  @JsOverlay
  @Nonnull
  default WheelEventInit deltaMode(final int deltaMode) {
    setDeltaMode( deltaMode );
    return this;
  }

  @JsProperty(
      name = "deltaX"
  )
  double deltaX();

  @JsProperty
  void setDeltaX(double deltaX);

  @JsOverlay
  @Nonnull
  default WheelEventInit deltaX(final double deltaX) {
    setDeltaX( deltaX );
    return this;
  }

  @JsProperty(
      name = "deltaY"
  )
  double deltaY();

  @JsProperty
  void setDeltaY(double deltaY);

  @JsOverlay
  @Nonnull
  default WheelEventInit deltaY(final double deltaY) {
    setDeltaY( deltaY );
    return this;
  }

  @JsProperty(
      name = "deltaZ"
  )
  double deltaZ();

  @JsProperty
  void setDeltaZ(double deltaZ);

  @JsOverlay
  @Nonnull
  default WheelEventInit deltaZ(final double deltaZ) {
    setDeltaZ( deltaZ );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit button(final short button) {
    setButton( button );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit buttons(final int buttons) {
    setButtons( buttons );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit relatedTarget(@Nullable final EventTarget relatedTarget) {
    setRelatedTarget( relatedTarget );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit clientX(final double clientX) {
    setClientX( clientX );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit clientY(final double clientY) {
    setClientY( clientY );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit screenX(final double screenX) {
    setScreenX( screenX );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit screenY(final double screenY) {
    setScreenY( screenY );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit movementX(final int movementX) {
    setMovementX( movementX );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit movementY(final int movementY) {
    setMovementY( movementY );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit altKey(final boolean altKey) {
    setAltKey( altKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit ctrlKey(final boolean ctrlKey) {
    setCtrlKey( ctrlKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit metaKey(final boolean metaKey) {
    setMetaKey( metaKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit modifierAltGraph(final boolean modifierAltGraph) {
    setModifierAltGraph( modifierAltGraph );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit modifierCapsLock(final boolean modifierCapsLock) {
    setModifierCapsLock( modifierCapsLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit modifierFn(final boolean modifierFn) {
    setModifierFn( modifierFn );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit modifierFnLock(final boolean modifierFnLock) {
    setModifierFnLock( modifierFnLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit modifierHyper(final boolean modifierHyper) {
    setModifierHyper( modifierHyper );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit modifierNumLock(final boolean modifierNumLock) {
    setModifierNumLock( modifierNumLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit modifierScrollLock(final boolean modifierScrollLock) {
    setModifierScrollLock( modifierScrollLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit modifierSuper(final boolean modifierSuper) {
    setModifierSuper( modifierSuper );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit modifierSymbol(final boolean modifierSymbol) {
    setModifierSymbol( modifierSymbol );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit modifierSymbolLock(final boolean modifierSymbolLock) {
    setModifierSymbolLock( modifierSymbolLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit shiftKey(final boolean shiftKey) {
    setShiftKey( shiftKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit detail(final int detail) {
    setDetail( detail );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit view(@Nullable final Window view) {
    setView( view );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default WheelEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
