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
public interface MouseEventInit extends EventModifierInit {
  @JsOverlay
  @Nonnull
  static MouseEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "button"
  )
  short button();

  @JsProperty
  void setButton(short button);

  @JsOverlay
  @Nonnull
  default MouseEventInit button(final short button) {
    setButton( button );
    return this;
  }

  @JsProperty(
      name = "buttons"
  )
  int buttons();

  @JsProperty
  void setButtons(int buttons);

  @JsOverlay
  @Nonnull
  default MouseEventInit buttons(final int buttons) {
    setButtons( buttons );
    return this;
  }

  @JsProperty(
      name = "relatedTarget"
  )
  @Nullable
  EventTarget relatedTarget();

  @JsProperty
  void setRelatedTarget(@Nullable EventTarget relatedTarget);

  @JsOverlay
  @Nonnull
  default MouseEventInit relatedTarget(@Nullable final EventTarget relatedTarget) {
    setRelatedTarget( relatedTarget );
    return this;
  }

  @JsProperty(
      name = "clientX"
  )
  double clientX();

  @JsProperty
  void setClientX(double clientX);

  @JsOverlay
  @Nonnull
  default MouseEventInit clientX(final double clientX) {
    setClientX( clientX );
    return this;
  }

  @JsProperty(
      name = "clientY"
  )
  double clientY();

  @JsProperty
  void setClientY(double clientY);

  @JsOverlay
  @Nonnull
  default MouseEventInit clientY(final double clientY) {
    setClientY( clientY );
    return this;
  }

  @JsProperty(
      name = "screenX"
  )
  double screenX();

  @JsProperty
  void setScreenX(double screenX);

  @JsOverlay
  @Nonnull
  default MouseEventInit screenX(final double screenX) {
    setScreenX( screenX );
    return this;
  }

  @JsProperty(
      name = "screenY"
  )
  double screenY();

  @JsProperty
  void setScreenY(double screenY);

  @JsOverlay
  @Nonnull
  default MouseEventInit screenY(final double screenY) {
    setScreenY( screenY );
    return this;
  }

  @JsProperty(
      name = "movementX"
  )
  int movementX();

  @JsProperty
  void setMovementX(int movementX);

  @JsOverlay
  @Nonnull
  default MouseEventInit movementX(final int movementX) {
    setMovementX( movementX );
    return this;
  }

  @JsProperty(
      name = "movementY"
  )
  int movementY();

  @JsProperty
  void setMovementY(int movementY);

  @JsOverlay
  @Nonnull
  default MouseEventInit movementY(final int movementY) {
    setMovementY( movementY );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MouseEventInit altKey(final boolean altKey) {
    setAltKey( altKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MouseEventInit ctrlKey(final boolean ctrlKey) {
    setCtrlKey( ctrlKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MouseEventInit metaKey(final boolean metaKey) {
    setMetaKey( metaKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MouseEventInit modifierAltGraph(final boolean modifierAltGraph) {
    setModifierAltGraph( modifierAltGraph );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MouseEventInit modifierCapsLock(final boolean modifierCapsLock) {
    setModifierCapsLock( modifierCapsLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MouseEventInit modifierFn(final boolean modifierFn) {
    setModifierFn( modifierFn );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MouseEventInit modifierFnLock(final boolean modifierFnLock) {
    setModifierFnLock( modifierFnLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MouseEventInit modifierHyper(final boolean modifierHyper) {
    setModifierHyper( modifierHyper );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MouseEventInit modifierNumLock(final boolean modifierNumLock) {
    setModifierNumLock( modifierNumLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MouseEventInit modifierScrollLock(final boolean modifierScrollLock) {
    setModifierScrollLock( modifierScrollLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MouseEventInit modifierSuper(final boolean modifierSuper) {
    setModifierSuper( modifierSuper );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MouseEventInit modifierSymbol(final boolean modifierSymbol) {
    setModifierSymbol( modifierSymbol );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MouseEventInit modifierSymbolLock(final boolean modifierSymbolLock) {
    setModifierSymbolLock( modifierSymbolLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MouseEventInit shiftKey(final boolean shiftKey) {
    setShiftKey( shiftKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MouseEventInit detail(final int detail) {
    setDetail( detail );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MouseEventInit view(@Nullable final Window view) {
    setView( view );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MouseEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MouseEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default MouseEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
