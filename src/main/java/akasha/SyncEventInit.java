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
public interface SyncEventInit extends ExtendableEventInit {
  @JsOverlay
  @Nonnull
  static SyncEventInit create(@Nonnull final String tag) {
    return Js.<SyncEventInit>uncheckedCast( JsPropertyMap.of() ).tag( tag );
  }

  @JsProperty(
      name = "lastChance"
  )
  boolean lastChance();

  @JsProperty
  void setLastChance(boolean lastChance);

  @JsOverlay
  @Nonnull
  default SyncEventInit lastChance(final boolean lastChance) {
    setLastChance( lastChance );
    return this;
  }

  @JsProperty(
      name = "tag"
  )
  @Nonnull
  String tag();

  @JsProperty
  void setTag(@Nonnull String tag);

  @JsOverlay
  @Nonnull
  default SyncEventInit tag(@Nonnull final String tag) {
    setTag( tag );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SyncEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SyncEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default SyncEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
