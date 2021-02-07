package elemental3;

import elemental3.core.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * provides a way to asynchronously observe changes in the intersection of a target element with an ancestor element or with a top-level document's viewport.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IntersectionObserver">IntersectionObserver - MDN</a>
 * @see <a href="https://w3c.github.io/IntersectionObserver/#intersection-observer-interface">IntersectionObserver - Intersection Observer</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IntersectionObserver"
)
public class IntersectionObserver {
  /**
   * The IntersectionObserver() constructor creates and returns a new IntersectionObserver object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IntersectionObserver/IntersectionObserver">IntersectionObserver.IntersectionObserver - MDN</a>
   * @see <a href="https://w3c.github.io/IntersectionObserver/#dom-intersectionobserver-intersectionobserver">IntersectionObserver constructor - Intersection Observer</a>
   */
  public IntersectionObserver(@Nonnull final IntersectionObserverCallback callback,
      @Nonnull final IntersectionObserverInit options) {
  }

  /**
   * The IntersectionObserver() constructor creates and returns a new IntersectionObserver object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IntersectionObserver/IntersectionObserver">IntersectionObserver.IntersectionObserver - MDN</a>
   * @see <a href="https://w3c.github.io/IntersectionObserver/#dom-intersectionobserver-intersectionobserver">IntersectionObserver constructor - Intersection Observer</a>
   */
  public IntersectionObserver(@Nonnull final IntersectionObserverCallback callback) {
  }

  /**
   * The IntersectionObserver interface's read-only root property identifies the Element or Document whose bounds are treated as the bounding box of the viewport for the element which is the observer's target.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IntersectionObserver/root">IntersectionObserver.root - MDN</a>
   * @see <a href="https://w3c.github.io/IntersectionObserver/#dom-intersectionobserver-root">IntersectionObserver - Intersection Observer</a>
   */
  @JsProperty(
      name = "root"
  )
  @Nullable
  public native ElementOrDocumentUnion root();

  /**
   * The IntersectionObserver interface's read-only rootMargin property is a string with syntax similar to that of the CSS margin property. Each side of the rectangle represented by rootMargin is added to the corresponding side in the root element's bounding box before the intersection test is performed. This lets you, for example, adjust the bounds outward so that the target element is considered 100% visible even if a certain number of pixels worth of width or height is clipped away, or treat the target as partially hidden if an edge is too close to the edge of the root's bounding box.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IntersectionObserver/rootMargin">IntersectionObserver.rootMargin - MDN</a>
   * @see <a href="https://w3c.github.io/IntersectionObserver/#dom-intersectionobserverinit-rootmargin">IntersectionObserver.rootMargin - Intersection Observer</a>
   */
  @JsProperty(
      name = "rootMargin"
  )
  @Nonnull
  public native String rootMargin();

  /**
   * The IntersectionObserver interface's read-only thresholds property returns the list of intersection thresholds that was specified when the observer was instantiated with IntersectionObserver(). If only one threshold ratio was provided when instanitating the object, this will be an array containing that single value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IntersectionObserver/thresholds">IntersectionObserver.thresholds - MDN</a>
   * @see <a href="https://w3c.github.io/IntersectionObserver/#dom-intersectionobserver-thresholds">IntersectionObserver.thresholds - Intersection Observer</a>
   */
  @JsProperty(
      name = "thresholds"
  )
  @Nonnull
  public native JsArray<Double> thresholds();

  /**
   * The IntersectionObserver method disconnect() stops watching all of its target elements for visibility changes.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IntersectionObserver/disconnect">IntersectionObserver.disconnect - MDN</a>
   * @see <a href="https://w3c.github.io/IntersectionObserver/#dom-intersectionobserver-disconnect">IntersectionObserver.disconnect() - Intersection Observer</a>
   */
  public native void disconnect();

  /**
   * The IntersectionObserver method observe() adds an element to the set of target elements being watched by the IntersectionObserver. One observer has one set of thresholds and one root, but can watch multiple target elements for visibility changes in keeping with those.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IntersectionObserver/observe">IntersectionObserver.observe - MDN</a>
   * @see <a href="https://w3c.github.io/IntersectionObserver/#dom-intersectionobserver-observe">IntersectionObserver.observe() - Intersection Observer</a>
   */
  public native void observe(@Nonnull Element target);

  /**
   * The IntersectionObserver method takeRecords() returns an array of IntersectionObserverEntry objects, one for each targeted element which has experienced an intersection change since the last time the intersections were checked, either explicitly through a call to this method or implicitly by an automatic call to the observer's callback.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IntersectionObserver/takeRecords">IntersectionObserver.takeRecords - MDN</a>
   * @see <a href="https://w3c.github.io/IntersectionObserver/#dom-intersectionobserver-takerecords">IntersectionObserver.takeRecords() - Intersection Observer</a>
   */
  @Nonnull
  public native JsArray<IntersectionObserverEntry> takeRecords();

  /**
   * The IntersectionObserver method unobserve() instructs the IntersectionObserver to stop observing the specified target element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IntersectionObserver/unobserve">IntersectionObserver.unobserve - MDN</a>
   * @see <a href="https://w3c.github.io/IntersectionObserver/#dom-intersectionobserver-unobserve">IntersectionObserver.unobserve() - Intersection Observer</a>
   */
  public native void unobserve(@Nonnull Element target);
}
