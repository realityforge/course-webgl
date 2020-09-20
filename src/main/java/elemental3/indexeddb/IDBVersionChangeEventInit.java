package elemental3.indexeddb;

import elemental3.EventInit;
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
public interface IDBVersionChangeEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static IDBVersionChangeEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "newVersion"
  )
  @Nullable
  Double newVersion();

  @JsProperty
  void setNewVersion(@Nullable Double newVersion);

  @JsOverlay
  @Nonnull
  default IDBVersionChangeEventInit newVersion(@Nullable final Double newVersion) {
    setNewVersion( newVersion );
    return this;
  }

  @JsProperty(
      name = "oldVersion"
  )
  int oldVersion();

  @JsProperty
  void setOldVersion(int oldVersion);

  @JsOverlay
  @Nonnull
  default IDBVersionChangeEventInit oldVersion(final int oldVersion) {
    setOldVersion( oldVersion );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default IDBVersionChangeEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default IDBVersionChangeEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default IDBVersionChangeEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
