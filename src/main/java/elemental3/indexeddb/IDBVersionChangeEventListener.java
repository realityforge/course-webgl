package elemental3.indexeddb;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Listener for events of type IDBVersionChangeEvent
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "?"
)
@FunctionalInterface
public interface IDBVersionChangeEventListener {
  /**
   * Handle event of type IDBVersionChangeEvent
   */
  void handleEvent(@Nonnull IDBVersionChangeEvent event);
}
