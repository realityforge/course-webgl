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
public interface PointerEventInit extends MouseEventInit {
  @JsOverlay
  @Nonnull
  static PointerEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "height"
  )
  double height();

  @JsProperty
  void setHeight(double height);

  @JsOverlay
  @Nonnull
  default PointerEventInit height(final double height) {
    setHeight( height );
    return this;
  }

  @JsProperty(
      name = "isPrimary"
  )
  boolean isPrimary();

  @JsProperty
  void setIsPrimary(boolean isPrimary);

  @JsOverlay
  @Nonnull
  default PointerEventInit isPrimary(final boolean isPrimary) {
    setIsPrimary( isPrimary );
    return this;
  }

  @JsProperty(
      name = "pointerId"
  )
  int pointerId();

  @JsProperty
  void setPointerId(int pointerId);

  @JsOverlay
  @Nonnull
  default PointerEventInit pointerId(final int pointerId) {
    setPointerId( pointerId );
    return this;
  }

  @JsProperty(
      name = "pointerType"
  )
  String pointerType();

  @JsProperty
  void setPointerType(@Nonnull String pointerType);

  @JsOverlay
  @Nonnull
  default PointerEventInit pointerType(@Nonnull final String pointerType) {
    setPointerType( pointerType );
    return this;
  }

  @JsProperty(
      name = "pressure"
  )
  float pressure();

  @JsProperty
  void setPressure(float pressure);

  @JsOverlay
  @Nonnull
  default PointerEventInit pressure(final float pressure) {
    setPressure( pressure );
    return this;
  }

  @JsProperty(
      name = "tangentialPressure"
  )
  float tangentialPressure();

  @JsProperty
  void setTangentialPressure(float tangentialPressure);

  @JsOverlay
  @Nonnull
  default PointerEventInit tangentialPressure(final float tangentialPressure) {
    setTangentialPressure( tangentialPressure );
    return this;
  }

  @JsProperty(
      name = "tiltX"
  )
  int tiltX();

  @JsProperty
  void setTiltX(int tiltX);

  @JsOverlay
  @Nonnull
  default PointerEventInit tiltX(final int tiltX) {
    setTiltX( tiltX );
    return this;
  }

  @JsProperty(
      name = "tiltY"
  )
  int tiltY();

  @JsProperty
  void setTiltY(int tiltY);

  @JsOverlay
  @Nonnull
  default PointerEventInit tiltY(final int tiltY) {
    setTiltY( tiltY );
    return this;
  }

  @JsProperty(
      name = "twist"
  )
  int twist();

  @JsProperty
  void setTwist(int twist);

  @JsOverlay
  @Nonnull
  default PointerEventInit twist(final int twist) {
    setTwist( twist );
    return this;
  }

  @JsProperty(
      name = "width"
  )
  double width();

  @JsProperty
  void setWidth(double width);

  @JsOverlay
  @Nonnull
  default PointerEventInit width(final double width) {
    setWidth( width );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit button(final short button) {
    setButton( button );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit buttons(final int buttons) {
    setButtons( buttons );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit relatedTarget(@Nullable final EventTarget relatedTarget) {
    setRelatedTarget( relatedTarget );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit clientX(final double clientX) {
    setClientX( clientX );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit clientY(final double clientY) {
    setClientY( clientY );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit screenX(final double screenX) {
    setScreenX( screenX );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit screenY(final double screenY) {
    setScreenY( screenY );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit movementX(final int movementX) {
    setMovementX( movementX );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit movementY(final int movementY) {
    setMovementY( movementY );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit altKey(final boolean altKey) {
    setAltKey( altKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit ctrlKey(final boolean ctrlKey) {
    setCtrlKey( ctrlKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit metaKey(final boolean metaKey) {
    setMetaKey( metaKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit modifierAltGraph(final boolean modifierAltGraph) {
    setModifierAltGraph( modifierAltGraph );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit modifierCapsLock(final boolean modifierCapsLock) {
    setModifierCapsLock( modifierCapsLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit modifierFn(final boolean modifierFn) {
    setModifierFn( modifierFn );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit modifierFnLock(final boolean modifierFnLock) {
    setModifierFnLock( modifierFnLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit modifierHyper(final boolean modifierHyper) {
    setModifierHyper( modifierHyper );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit modifierNumLock(final boolean modifierNumLock) {
    setModifierNumLock( modifierNumLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit modifierScrollLock(final boolean modifierScrollLock) {
    setModifierScrollLock( modifierScrollLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit modifierSuper(final boolean modifierSuper) {
    setModifierSuper( modifierSuper );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit modifierSymbol(final boolean modifierSymbol) {
    setModifierSymbol( modifierSymbol );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit modifierSymbolLock(final boolean modifierSymbolLock) {
    setModifierSymbolLock( modifierSymbolLock );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit shiftKey(final boolean shiftKey) {
    setShiftKey( shiftKey );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit detail(final int detail) {
    setDetail( detail );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit view(@Nullable final Window view) {
    setView( view );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PointerEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
