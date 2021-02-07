package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * A StorageEvent is sent to a window when a storage area it has access to is changed within the context of another document.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/StorageEvent">StorageEvent - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/webstorage.html#the-storageevent-interface">The StorageEvent interface - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "StorageEvent"
)
public class StorageEvent extends Event {
  public StorageEvent(@Nonnull final String type, @Nonnull final StorageEventInit eventInitDict) {
    super( null );
  }

  public StorageEvent(@Nonnull final String type) {
    super( null );
  }

  @JsProperty(
      name = "key"
  )
  @Nullable
  public native String key();

  @JsProperty(
      name = "newValue"
  )
  @Nullable
  public native String newValue();

  @JsProperty(
      name = "oldValue"
  )
  @Nullable
  public native String oldValue();

  @JsProperty(
      name = "storageArea"
  )
  @Nullable
  public native Storage storageArea();

  @JsProperty(
      name = "url"
  )
  @Nonnull
  public native String url();

  public native void initStorageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @Nullable String key, @Nullable String oldValue, @Nullable String newValue,
      @Nonnull String url, @Nullable Storage storageArea);

  public native void initStorageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @Nullable String key, @Nullable String oldValue, @Nullable String newValue,
      @Nonnull String url);

  public native void initStorageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @Nullable String key, @Nullable String oldValue, @Nullable String newValue);

  public native void initStorageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @Nullable String key, @Nullable String oldValue);

  public native void initStorageEvent(@Nonnull String type, boolean bubbles, boolean cancelable,
      @Nullable String key);

  public native void initStorageEvent(@Nonnull String type, boolean bubbles, boolean cancelable);

  public native void initStorageEvent(@Nonnull String type, boolean bubbles);

  public native void initStorageEvent(@Nonnull String type);
}
