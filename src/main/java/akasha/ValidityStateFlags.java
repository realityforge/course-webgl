package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
public interface ValidityStateFlags {
  @JsOverlay
  @Nonnull
  static ValidityStateFlags create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "badInput"
  )
  boolean badInput();

  @JsProperty
  void setBadInput(boolean badInput);

  @JsOverlay
  @Nonnull
  default ValidityStateFlags badInput(final boolean badInput) {
    setBadInput( badInput );
    return this;
  }

  @JsProperty(
      name = "customError"
  )
  boolean customError();

  @JsProperty
  void setCustomError(boolean customError);

  @JsOverlay
  @Nonnull
  default ValidityStateFlags customError(final boolean customError) {
    setCustomError( customError );
    return this;
  }

  @JsProperty(
      name = "patternMismatch"
  )
  boolean patternMismatch();

  @JsProperty
  void setPatternMismatch(boolean patternMismatch);

  @JsOverlay
  @Nonnull
  default ValidityStateFlags patternMismatch(final boolean patternMismatch) {
    setPatternMismatch( patternMismatch );
    return this;
  }

  @JsProperty(
      name = "rangeOverflow"
  )
  boolean rangeOverflow();

  @JsProperty
  void setRangeOverflow(boolean rangeOverflow);

  @JsOverlay
  @Nonnull
  default ValidityStateFlags rangeOverflow(final boolean rangeOverflow) {
    setRangeOverflow( rangeOverflow );
    return this;
  }

  @JsProperty(
      name = "rangeUnderflow"
  )
  boolean rangeUnderflow();

  @JsProperty
  void setRangeUnderflow(boolean rangeUnderflow);

  @JsOverlay
  @Nonnull
  default ValidityStateFlags rangeUnderflow(final boolean rangeUnderflow) {
    setRangeUnderflow( rangeUnderflow );
    return this;
  }

  @JsProperty(
      name = "stepMismatch"
  )
  boolean stepMismatch();

  @JsProperty
  void setStepMismatch(boolean stepMismatch);

  @JsOverlay
  @Nonnull
  default ValidityStateFlags stepMismatch(final boolean stepMismatch) {
    setStepMismatch( stepMismatch );
    return this;
  }

  @JsProperty(
      name = "tooLong"
  )
  boolean tooLong();

  @JsProperty
  void setTooLong(boolean tooLong);

  @JsOverlay
  @Nonnull
  default ValidityStateFlags tooLong(final boolean tooLong) {
    setTooLong( tooLong );
    return this;
  }

  @JsProperty(
      name = "tooShort"
  )
  boolean tooShort();

  @JsProperty
  void setTooShort(boolean tooShort);

  @JsOverlay
  @Nonnull
  default ValidityStateFlags tooShort(final boolean tooShort) {
    setTooShort( tooShort );
    return this;
  }

  @JsProperty(
      name = "typeMismatch"
  )
  boolean typeMismatch();

  @JsProperty
  void setTypeMismatch(boolean typeMismatch);

  @JsOverlay
  @Nonnull
  default ValidityStateFlags typeMismatch(final boolean typeMismatch) {
    setTypeMismatch( typeMismatch );
    return this;
  }

  @JsProperty(
      name = "valueMissing"
  )
  boolean valueMissing();

  @JsProperty
  void setValueMissing(boolean valueMissing);

  @JsOverlay
  @Nonnull
  default ValidityStateFlags valueMissing(final boolean valueMissing) {
    setValueMissing( valueMissing );
    return this;
  }
}
