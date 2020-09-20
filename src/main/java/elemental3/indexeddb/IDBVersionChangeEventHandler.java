package elemental3.indexeddb;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

/**
 * Handle events of type IDBVersionChangeEvent
 */
@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface IDBVersionChangeEventHandler {
  void onInvoke(@Nonnull IDBVersionChangeEvent event);
}
