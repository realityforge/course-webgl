package elemental3;

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
    name = "?"
)
public interface PushSubscriptionChangeEventInit extends ExtendableEventInit {
  @JsOverlay
  @Nonnull
  static PushSubscriptionChangeEventInit create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "newSubscription"
  )
  PushSubscription newSubscription();

  @JsProperty
  void setNewSubscription(@Nonnull PushSubscription newSubscription);

  @JsOverlay
  @Nonnull
  default PushSubscriptionChangeEventInit newSubscription(
      @Nonnull final PushSubscription newSubscription) {
    setNewSubscription( newSubscription );
    return this;
  }

  @JsProperty(
      name = "oldSubscription"
  )
  PushSubscription oldSubscription();

  @JsProperty
  void setOldSubscription(@Nonnull PushSubscription oldSubscription);

  @JsOverlay
  @Nonnull
  default PushSubscriptionChangeEventInit oldSubscription(
      @Nonnull final PushSubscription oldSubscription) {
    setOldSubscription( oldSubscription );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PushSubscriptionChangeEventInit bubbles(final boolean bubbles) {
    setBubbles( bubbles );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PushSubscriptionChangeEventInit cancelable(final boolean cancelable) {
    setCancelable( cancelable );
    return this;
  }

  @JsOverlay
  @Nonnull
  @Override
  default PushSubscriptionChangeEventInit composed(final boolean composed) {
    setComposed( composed );
    return this;
  }
}
