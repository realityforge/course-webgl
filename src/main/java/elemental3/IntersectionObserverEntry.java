package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The IntersectionObserverEntry interface of the Intersection Observer API describes the intersection between the target element and its root container at a specific moment of transition.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IntersectionObserverEntry">IntersectionObserverEntry - MDN</a>
 * @see <a href="https://w3c.github.io/IntersectionObserver/#intersection-observer-entry">The definition of 'IntersectionObserverEntry' in the 'Intersection Observer' specification.</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IntersectionObserverEntry"
)
public class IntersectionObserverEntry {
  public IntersectionObserverEntry(
      @Nonnull final IntersectionObserverEntryInit intersectionObserverEntryInit) {
  }

  /**
   * The IntersectionObserverEntry interface's read-only boundingClientRect property returns a DOMRectReadOnly which in essence describes a rectangle describing the smallest rectangle that contains the entire target element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IntersectionObserverEntry/boundingClientRect">IntersectionObserverEntry.boundingClientRect - MDN</a>
   * @see <a href="https://w3c.github.io/IntersectionObserver/#dom-intersectionobserverentry-boundingclientrect">The definition of 'IntersectionObserverEntry.boundingClientRect' in the 'Intersection Observer' specification.</a>
   */
  @JsProperty(
      name = "boundingClientRect"
  )
  @Nonnull
  public native DOMRectReadOnly boundingClientRect();

  /**
   * The IntersectionObserverEntry interface's read-only intersectionRatio property tells you how much of the target element is currently visible within the root's intersection ratio, as a value between 0.0 and 1.0.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IntersectionObserverEntry/intersectionRatio">IntersectionObserverEntry.intersectionRatio - MDN</a>
   * @see <a href="https://w3c.github.io/IntersectionObserver/#dom-intersectionobserverentry-intersectionratio">The definition of 'IntersectionObserverEntry.intersectionratio' in the 'Intersection Observer' specification.</a>
   */
  @JsProperty(
      name = "intersectionRatio"
  )
  public native double intersectionRatio();

  /**
   * The IntersectionObserverEntry interface's read-only intersectionRect property is a DOMRectReadOnly object which describes the smallest rectangle that contains the entire portion of the target element which is currently visible within the intersection root.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IntersectionObserverEntry/intersectionRect">IntersectionObserverEntry.intersectionRect - MDN</a>
   * @see <a href="https://w3c.github.io/IntersectionObserver/#dom-intersectionobserverentry-intersectionrect">The definition of 'IntersectionObserverEntry.intersectionRect' in the 'Intersection Observer' specification.</a>
   */
  @JsProperty(
      name = "intersectionRect"
  )
  @Nonnull
  public native DOMRectReadOnly intersectionRect();

  /**
   * The IntersectionObserverEntry interface's read-only isIntersecting property is a Boolean value which is true if the target element intersects with the intersection observer's root. If this is true, then, the IntersectionObserverEntry describes a transition into a state of intersection; if it's false, then you know the transition is from intersecting to not-intersecting.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IntersectionObserverEntry/isIntersecting">IntersectionObserverEntry.isIntersecting - MDN</a>
   * @see <a href="https://w3c.github.io/IntersectionObserver/#dom-intersectionobserverentry-isintersecting">The definition of 'IntersectionObserverEntry.isIntersecting' in the 'Intersection Observer' specification.</a>
   */
  @JsProperty(
      name = "isIntersecting"
  )
  public native boolean isIntersecting();

  /**
   * The IntersectionObserverEntry interface's read-only rootBounds property is a DOMRectReadOnly corresponding to the target's root intersection rectangle, offset by the IntersectionObserver.rootMargin if one is specified.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IntersectionObserverEntry/rootBounds">IntersectionObserverEntry.rootBounds - MDN</a>
   * @see <a href="https://w3c.github.io/IntersectionObserver/#dom-intersectionobserverentry-rootbounds">The definition of 'IntersectionObserverEntry.rootBounds' in the 'Intersection Observer' specification.</a>
   */
  @JsProperty(
      name = "rootBounds"
  )
  @Nullable
  public native DOMRectReadOnly rootBounds();

  /**
   * The IntersectionObserverEntry interface's read-only target property indicates which targeted Element has changed its amount of intersection with the intersection root.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IntersectionObserverEntry/target">IntersectionObserverEntry.target - MDN</a>
   * @see <a href="https://w3c.github.io/IntersectionObserver/#dom-intersectionobserverentry-target">The definition of 'IntersectionObserverEntry.target' in the 'Intersection Observer' specification.</a>
   */
  @JsProperty(
      name = "target"
  )
  @Nonnull
  public native Element target();

  /**
   * The IntersectionObserverEntry interface's read-only time property is a DOMHighResTimeStamp that indicates the time at which the intersection change occurred relative to the time at which the document was created.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IntersectionObserverEntry/time">IntersectionObserverEntry.time - MDN</a>
   * @see <a href="https://w3c.github.io/IntersectionObserver/#dom-intersectionobserverentry-time">The definition of 'IntersectionObserverEntry.time' in the 'Intersection Observer' specification.</a>
   */
  @JsProperty(
      name = "time"
  )
  public native double time();
}
