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
public interface DragEventInit extends MouseEventInit {
  @JsOverlay
  @Nonnull
  static DragEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "dataTransfer"
  )
  @Nullable
  DataTransfer dataTransfer();

  @JsProperty
  void setDataTransfer(@Nullable DataTransfer dataTransfer);

  @JsOverlay
  @Nonnull
  default DragEventInit dataTransfer(@Nullable final DataTransfer dataTransfer) {
    setDataTransfer( dataTransfer );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit button(final short button) {
    setButton( button );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit buttons(final int buttons) {
    setButtons( buttons );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit relatedTarget(@Nullable final EventTarget relatedTarget) {
    setRelatedTarget( relatedTarget );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit clientX(final double clientX) {
    setClientX( clientX );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit clientY(final double clientY) {
    setClientY( clientY );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit screenX(final double screenX) {
    setScreenX( screenX );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit screenY(final double screenY) {
    setScreenY( screenY );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit movementX(final int movementX) {
    setMovementX( movementX );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit movementY(final int movementY) {
    setMovementY( movementY );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit altKey(final boolean altKey) {
    setAltKey( altKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit ctrlKey(final boolean ctrlKey) {
    setCtrlKey( ctrlKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit metaKey(final boolean metaKey) {
    setMetaKey( metaKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit modifierAltGraph(final boolean modifierAltGraph) {
    setModifierAltGraph( modifierAltGraph );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit modifierCapsLock(final boolean modifierCapsLock) {
    setModifierCapsLock( modifierCapsLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit modifierFn(final boolean modifierFn) {
    setModifierFn( modifierFn );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit modifierFnLock(final boolean modifierFnLock) {
    setModifierFnLock( modifierFnLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit modifierHyper(final boolean modifierHyper) {
    setModifierHyper( modifierHyper );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit modifierNumLock(final boolean modifierNumLock) {
    setModifierNumLock( modifierNumLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit modifierScrollLock(final boolean modifierScrollLock) {
    setModifierScrollLock( modifierScrollLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit modifierSuper(final boolean modifierSuper) {
    setModifierSuper( modifierSuper );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit modifierSymbol(final boolean modifierSymbol) {
    setModifierSymbol( modifierSymbol );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit modifierSymbolLock(final boolean modifierSymbolLock) {
    setModifierSymbolLock( modifierSymbolLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit shiftKey(final boolean shiftKey) {
    setShiftKey( shiftKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit detail(final int detail) {
    setDetail( detail );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit view(@Nullable final Window view) {
    setView( view );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default DragEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
