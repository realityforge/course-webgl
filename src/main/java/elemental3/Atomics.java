package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;

/**
 * The Atomics object provides atomic operations as static methods. They are used with SharedArrayBuffer and ArrayBuffer objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics">Atomics - MDN</a>
 * @see <a href="https://tc39.es/ecma262/#sec-atomics-object">Atomics - ECMA</a>
 */
@Generated("org.realityforge.webtack")
public final class Atomics {
  private Atomics() {
  }

  /**
   * Add the provided value to the existing value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/add">Atomics.add() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.add">Atomics.add() - ECMA</a>
   */
  public static int add(@Nonnull IntegerTypedArray typedArray, int index, int value) {
    return namespace().add(typedArray, index, value);
  }

  /**
   * Add the provided value to the existing value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/add">Atomics.add() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.add">Atomics.add() - ECMA</a>
   */
  public static int add(@Nonnull Int8Array typedArray, int index, int value) {
    return namespace().add(typedArray, index, value);
  }

  /**
   * Add the provided value to the existing value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/add">Atomics.add() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.add">Atomics.add() - ECMA</a>
   */
  public static int add(@Nonnull Int16Array typedArray, int index, int value) {
    return namespace().add(typedArray, index, value);
  }

  /**
   * Add the provided value to the existing value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/add">Atomics.add() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.add">Atomics.add() - ECMA</a>
   */
  public static int add(@Nonnull Int32Array typedArray, int index, int value) {
    return namespace().add(typedArray, index, value);
  }

  /**
   * Add the provided value to the existing value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/add">Atomics.add() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.add">Atomics.add() - ECMA</a>
   */
  public static int add(@Nonnull Uint8Array typedArray, int index, int value) {
    return namespace().add(typedArray, index, value);
  }

  /**
   * Add the provided value to the existing value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/add">Atomics.add() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.add">Atomics.add() - ECMA</a>
   */
  public static int add(@Nonnull Uint16Array typedArray, int index, int value) {
    return namespace().add(typedArray, index, value);
  }

  /**
   * Add the provided value to the existing value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/add">Atomics.add() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.add">Atomics.add() - ECMA</a>
   */
  public static int add(@Nonnull Uint32Array typedArray, int index, int value) {
    return namespace().add(typedArray, index, value);
  }

  /**
   * Add the provided value to the existing value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/add">Atomics.add() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.add">Atomics.add() - ECMA</a>
   */
  public static int add(@Nonnull Uint8ClampedArray typedArray, int index, int value) {
    return namespace().add(typedArray, index, value);
  }

  /**
   * Computes a bitwise AND on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/and">Atomics.and() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.and">Atomics.and() - ECMA</a>
   */
  public static int and(@Nonnull IntegerTypedArray typedArray, int index, int value) {
    return namespace().and(typedArray, index, value);
  }

  /**
   * Computes a bitwise AND on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/and">Atomics.and() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.and">Atomics.and() - ECMA</a>
   */
  public static int and(@Nonnull Int8Array typedArray, int index, int value) {
    return namespace().and(typedArray, index, value);
  }

  /**
   * Computes a bitwise AND on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/and">Atomics.and() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.and">Atomics.and() - ECMA</a>
   */
  public static int and(@Nonnull Int16Array typedArray, int index, int value) {
    return namespace().and(typedArray, index, value);
  }

  /**
   * Computes a bitwise AND on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/and">Atomics.and() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.and">Atomics.and() - ECMA</a>
   */
  public static int and(@Nonnull Int32Array typedArray, int index, int value) {
    return namespace().and(typedArray, index, value);
  }

  /**
   * Computes a bitwise AND on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/and">Atomics.and() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.and">Atomics.and() - ECMA</a>
   */
  public static int and(@Nonnull Uint8Array typedArray, int index, int value) {
    return namespace().and(typedArray, index, value);
  }

  /**
   * Computes a bitwise AND on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/and">Atomics.and() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.and">Atomics.and() - ECMA</a>
   */
  public static int and(@Nonnull Uint16Array typedArray, int index, int value) {
    return namespace().and(typedArray, index, value);
  }

  /**
   * Computes a bitwise AND on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/and">Atomics.and() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.and">Atomics.and() - ECMA</a>
   */
  public static int and(@Nonnull Uint32Array typedArray, int index, int value) {
    return namespace().and(typedArray, index, value);
  }

  /**
   * Computes a bitwise AND on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/and">Atomics.and() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.and">Atomics.and() - ECMA</a>
   */
  public static int and(@Nonnull Uint8ClampedArray typedArray, int index, int value) {
    return namespace().and(typedArray, index, value);
  }

  /**
   * Stores a value at the specified index of the array, if it equals a value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/compareExchange">Atomics.compareExchange - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.compareExchange">Atomics.compareExchange() - ECMA</a>
   */
  public static int compareExchange(@Nonnull IntegerTypedArray typedArray, int index,
      int expectedValue, int replacementValue) {
    return namespace().compareExchange(typedArray, index, expectedValue, replacementValue);
  }

  /**
   * Stores a value at the specified index of the array, if it equals a value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/compareExchange">Atomics.compareExchange - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.compareExchange">Atomics.compareExchange() - ECMA</a>
   */
  public static int compareExchange(@Nonnull Int8Array typedArray, int index, int expectedValue,
      int replacementValue) {
    return namespace().compareExchange(typedArray, index, expectedValue, replacementValue);
  }

  /**
   * Stores a value at the specified index of the array, if it equals a value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/compareExchange">Atomics.compareExchange - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.compareExchange">Atomics.compareExchange() - ECMA</a>
   */
  public static int compareExchange(@Nonnull Int16Array typedArray, int index, int expectedValue,
      int replacementValue) {
    return namespace().compareExchange(typedArray, index, expectedValue, replacementValue);
  }

  /**
   * Stores a value at the specified index of the array, if it equals a value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/compareExchange">Atomics.compareExchange - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.compareExchange">Atomics.compareExchange() - ECMA</a>
   */
  public static int compareExchange(@Nonnull Int32Array typedArray, int index, int expectedValue,
      int replacementValue) {
    return namespace().compareExchange(typedArray, index, expectedValue, replacementValue);
  }

  /**
   * Stores a value at the specified index of the array, if it equals a value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/compareExchange">Atomics.compareExchange - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.compareExchange">Atomics.compareExchange() - ECMA</a>
   */
  public static int compareExchange(@Nonnull Uint8Array typedArray, int index, int expectedValue,
      int replacementValue) {
    return namespace().compareExchange(typedArray, index, expectedValue, replacementValue);
  }

  /**
   * Stores a value at the specified index of the array, if it equals a value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/compareExchange">Atomics.compareExchange - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.compareExchange">Atomics.compareExchange() - ECMA</a>
   */
  public static int compareExchange(@Nonnull Uint16Array typedArray, int index, int expectedValue,
      int replacementValue) {
    return namespace().compareExchange(typedArray, index, expectedValue, replacementValue);
  }

  /**
   * Stores a value at the specified index of the array, if it equals a value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/compareExchange">Atomics.compareExchange - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.compareExchange">Atomics.compareExchange() - ECMA</a>
   */
  public static int compareExchange(@Nonnull Uint32Array typedArray, int index, int expectedValue,
      int replacementValue) {
    return namespace().compareExchange(typedArray, index, expectedValue, replacementValue);
  }

  /**
   * Stores a value at the specified index of the array, if it equals a value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/compareExchange">Atomics.compareExchange - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.compareExchange">Atomics.compareExchange() - ECMA</a>
   */
  public static int compareExchange(@Nonnull Uint8ClampedArray typedArray, int index,
      int expectedValue, int replacementValue) {
    return namespace().compareExchange(typedArray, index, expectedValue, replacementValue);
  }

  /**
   * Stores a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/exchange">Atomics.exchange() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.exchange">Atomics.exchange() - ECMA</a>
   */
  public static int exchange(@Nonnull IntegerTypedArray typedArray, int index, int value) {
    return namespace().exchange(typedArray, index, value);
  }

  /**
   * Stores a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/exchange">Atomics.exchange() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.exchange">Atomics.exchange() - ECMA</a>
   */
  public static int exchange(@Nonnull Int8Array typedArray, int index, int value) {
    return namespace().exchange(typedArray, index, value);
  }

  /**
   * Stores a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/exchange">Atomics.exchange() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.exchange">Atomics.exchange() - ECMA</a>
   */
  public static int exchange(@Nonnull Int16Array typedArray, int index, int value) {
    return namespace().exchange(typedArray, index, value);
  }

  /**
   * Stores a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/exchange">Atomics.exchange() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.exchange">Atomics.exchange() - ECMA</a>
   */
  public static int exchange(@Nonnull Int32Array typedArray, int index, int value) {
    return namespace().exchange(typedArray, index, value);
  }

  /**
   * Stores a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/exchange">Atomics.exchange() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.exchange">Atomics.exchange() - ECMA</a>
   */
  public static int exchange(@Nonnull Uint8Array typedArray, int index, int value) {
    return namespace().exchange(typedArray, index, value);
  }

  /**
   * Stores a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/exchange">Atomics.exchange() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.exchange">Atomics.exchange() - ECMA</a>
   */
  public static int exchange(@Nonnull Uint16Array typedArray, int index, int value) {
    return namespace().exchange(typedArray, index, value);
  }

  /**
   * Stores a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/exchange">Atomics.exchange() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.exchange">Atomics.exchange() - ECMA</a>
   */
  public static int exchange(@Nonnull Uint32Array typedArray, int index, int value) {
    return namespace().exchange(typedArray, index, value);
  }

  /**
   * Stores a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/exchange">Atomics.exchange() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.exchange">Atomics.exchange() - ECMA</a>
   */
  public static int exchange(@Nonnull Uint8ClampedArray typedArray, int index, int value) {
    return namespace().exchange(typedArray, index, value);
  }

  /**
   * An optimization primitive that can be used to determine whether to use locks or atomic operations.
   *
   * @return true if an atomic operation on arrays of the given element size will be implemented using a hardware atomic operation (as opposed to a lock).
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/isLockFree">MDN - Atomics.isLockFree</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.isLockFree">Atomics.isLockFree() - ECMA</a>
   */
  public static int isLockFree(int size) {
    return namespace().isLockFree(size);
  }

  /**
   * Returns the value at the specified index of the array.
   *
   * @return the value at the index
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/load">Atomics.load() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.load">Atomics.load() - ECMA</a>
   */
  public static int load(@Nonnull IntegerTypedArray typedArray, int index) {
    return namespace().load(typedArray, index);
  }

  /**
   * Returns the value at the specified index of the array.
   *
   * @return the value at the index
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/load">Atomics.load() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.load">Atomics.load() - ECMA</a>
   */
  public static int load(@Nonnull Int8Array typedArray, int index) {
    return namespace().load(typedArray, index);
  }

  /**
   * Returns the value at the specified index of the array.
   *
   * @return the value at the index
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/load">Atomics.load() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.load">Atomics.load() - ECMA</a>
   */
  public static int load(@Nonnull Int16Array typedArray, int index) {
    return namespace().load(typedArray, index);
  }

  /**
   * Returns the value at the specified index of the array.
   *
   * @return the value at the index
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/load">Atomics.load() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.load">Atomics.load() - ECMA</a>
   */
  public static int load(@Nonnull Int32Array typedArray, int index) {
    return namespace().load(typedArray, index);
  }

  /**
   * Returns the value at the specified index of the array.
   *
   * @return the value at the index
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/load">Atomics.load() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.load">Atomics.load() - ECMA</a>
   */
  public static int load(@Nonnull Uint8Array typedArray, int index) {
    return namespace().load(typedArray, index);
  }

  /**
   * Returns the value at the specified index of the array.
   *
   * @return the value at the index
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/load">Atomics.load() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.load">Atomics.load() - ECMA</a>
   */
  public static int load(@Nonnull Uint16Array typedArray, int index) {
    return namespace().load(typedArray, index);
  }

  /**
   * Returns the value at the specified index of the array.
   *
   * @return the value at the index
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/load">Atomics.load() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.load">Atomics.load() - ECMA</a>
   */
  public static int load(@Nonnull Uint32Array typedArray, int index) {
    return namespace().load(typedArray, index);
  }

  /**
   * Returns the value at the specified index of the array.
   *
   * @return the value at the index
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/load">Atomics.load() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.load">Atomics.load() - ECMA</a>
   */
  public static int load(@Nonnull Uint8ClampedArray typedArray, int index) {
    return namespace().load(typedArray, index);
  }

  /**
   * Computes a bitwise OR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/or">Atomics.or() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.or">Atomics.or() - ECMA</a>
   */
  public static int or(@Nonnull IntegerTypedArray typedArray, int index, int value) {
    return namespace().or(typedArray, index, value);
  }

  /**
   * Computes a bitwise OR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/or">Atomics.or() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.or">Atomics.or() - ECMA</a>
   */
  public static int or(@Nonnull Int8Array typedArray, int index, int value) {
    return namespace().or(typedArray, index, value);
  }

  /**
   * Computes a bitwise OR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/or">Atomics.or() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.or">Atomics.or() - ECMA</a>
   */
  public static int or(@Nonnull Int16Array typedArray, int index, int value) {
    return namespace().or(typedArray, index, value);
  }

  /**
   * Computes a bitwise OR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/or">Atomics.or() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.or">Atomics.or() - ECMA</a>
   */
  public static int or(@Nonnull Int32Array typedArray, int index, int value) {
    return namespace().or(typedArray, index, value);
  }

  /**
   * Computes a bitwise OR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/or">Atomics.or() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.or">Atomics.or() - ECMA</a>
   */
  public static int or(@Nonnull Uint8Array typedArray, int index, int value) {
    return namespace().or(typedArray, index, value);
  }

  /**
   * Computes a bitwise OR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/or">Atomics.or() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.or">Atomics.or() - ECMA</a>
   */
  public static int or(@Nonnull Uint16Array typedArray, int index, int value) {
    return namespace().or(typedArray, index, value);
  }

  /**
   * Computes a bitwise OR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/or">Atomics.or() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.or">Atomics.or() - ECMA</a>
   */
  public static int or(@Nonnull Uint32Array typedArray, int index, int value) {
    return namespace().or(typedArray, index, value);
  }

  /**
   * Computes a bitwise OR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/or">Atomics.or() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.or">Atomics.or() - ECMA</a>
   */
  public static int or(@Nonnull Uint8ClampedArray typedArray, int index, int value) {
    return namespace().or(typedArray, index, value);
  }

  /**
   * Stores a value at the specified index of the array.
   *
   * @return value that has been stored.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/store">Atomics.store() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.store">Atomics.store() - ECMA</a>
   */
  public static int store(@Nonnull IntegerTypedArray typedArray, int index, int value) {
    return namespace().store(typedArray, index, value);
  }

  /**
   * Stores a value at the specified index of the array.
   *
   * @return value that has been stored.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/store">Atomics.store() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.store">Atomics.store() - ECMA</a>
   */
  public static int store(@Nonnull Int8Array typedArray, int index, int value) {
    return namespace().store(typedArray, index, value);
  }

  /**
   * Stores a value at the specified index of the array.
   *
   * @return value that has been stored.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/store">Atomics.store() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.store">Atomics.store() - ECMA</a>
   */
  public static int store(@Nonnull Int16Array typedArray, int index, int value) {
    return namespace().store(typedArray, index, value);
  }

  /**
   * Stores a value at the specified index of the array.
   *
   * @return value that has been stored.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/store">Atomics.store() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.store">Atomics.store() - ECMA</a>
   */
  public static int store(@Nonnull Int32Array typedArray, int index, int value) {
    return namespace().store(typedArray, index, value);
  }

  /**
   * Stores a value at the specified index of the array.
   *
   * @return value that has been stored.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/store">Atomics.store() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.store">Atomics.store() - ECMA</a>
   */
  public static int store(@Nonnull Uint8Array typedArray, int index, int value) {
    return namespace().store(typedArray, index, value);
  }

  /**
   * Stores a value at the specified index of the array.
   *
   * @return value that has been stored.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/store">Atomics.store() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.store">Atomics.store() - ECMA</a>
   */
  public static int store(@Nonnull Uint16Array typedArray, int index, int value) {
    return namespace().store(typedArray, index, value);
  }

  /**
   * Stores a value at the specified index of the array.
   *
   * @return value that has been stored.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/store">Atomics.store() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.store">Atomics.store() - ECMA</a>
   */
  public static int store(@Nonnull Uint32Array typedArray, int index, int value) {
    return namespace().store(typedArray, index, value);
  }

  /**
   * Stores a value at the specified index of the array.
   *
   * @return value that has been stored.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/store">Atomics.store() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.store">Atomics.store() - ECMA</a>
   */
  public static int store(@Nonnull Uint8ClampedArray typedArray, int index, int value) {
    return namespace().store(typedArray, index, value);
  }

  /**
   * Subtracts a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/sub">Atomics.sub() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.sub">Atomics.sub() - ECMA</a>
   */
  public static int sub(@Nonnull IntegerTypedArray typedArray, int index, int value) {
    return namespace().sub(typedArray, index, value);
  }

  /**
   * Subtracts a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/sub">Atomics.sub() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.sub">Atomics.sub() - ECMA</a>
   */
  public static int sub(@Nonnull Int8Array typedArray, int index, int value) {
    return namespace().sub(typedArray, index, value);
  }

  /**
   * Subtracts a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/sub">Atomics.sub() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.sub">Atomics.sub() - ECMA</a>
   */
  public static int sub(@Nonnull Int16Array typedArray, int index, int value) {
    return namespace().sub(typedArray, index, value);
  }

  /**
   * Subtracts a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/sub">Atomics.sub() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.sub">Atomics.sub() - ECMA</a>
   */
  public static int sub(@Nonnull Int32Array typedArray, int index, int value) {
    return namespace().sub(typedArray, index, value);
  }

  /**
   * Subtracts a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/sub">Atomics.sub() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.sub">Atomics.sub() - ECMA</a>
   */
  public static int sub(@Nonnull Uint8Array typedArray, int index, int value) {
    return namespace().sub(typedArray, index, value);
  }

  /**
   * Subtracts a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/sub">Atomics.sub() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.sub">Atomics.sub() - ECMA</a>
   */
  public static int sub(@Nonnull Uint16Array typedArray, int index, int value) {
    return namespace().sub(typedArray, index, value);
  }

  /**
   * Subtracts a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/sub">Atomics.sub() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.sub">Atomics.sub() - ECMA</a>
   */
  public static int sub(@Nonnull Uint32Array typedArray, int index, int value) {
    return namespace().sub(typedArray, index, value);
  }

  /**
   * Subtracts a value at the specified index of the array.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/sub">Atomics.sub() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.sub">Atomics.sub() - ECMA</a>
   */
  public static int sub(@Nonnull Uint8ClampedArray typedArray, int index, int value) {
    return namespace().sub(typedArray, index, value);
  }

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @AtomicWaitResult
  @Nonnull
  public static String wait_(@Nonnull IntegerTypedArray typedArray, int index, int value,
      int timeout) {
    return namespace().wait_(typedArray, index, value, timeout);
  }

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @AtomicWaitResult
  @Nonnull
  public static String wait_(@Nonnull Int8Array typedArray, int index, int value, int timeout) {
    return namespace().wait_(typedArray, index, value, timeout);
  }

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @AtomicWaitResult
  @Nonnull
  public static String wait_(@Nonnull Int16Array typedArray, int index, int value, int timeout) {
    return namespace().wait_(typedArray, index, value, timeout);
  }

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @AtomicWaitResult
  @Nonnull
  public static String wait_(@Nonnull Int32Array typedArray, int index, int value, int timeout) {
    return namespace().wait_(typedArray, index, value, timeout);
  }

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @AtomicWaitResult
  @Nonnull
  public static String wait_(@Nonnull Uint8Array typedArray, int index, int value, int timeout) {
    return namespace().wait_(typedArray, index, value, timeout);
  }

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @AtomicWaitResult
  @Nonnull
  public static String wait_(@Nonnull Uint16Array typedArray, int index, int value, int timeout) {
    return namespace().wait_(typedArray, index, value, timeout);
  }

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @AtomicWaitResult
  @Nonnull
  public static String wait_(@Nonnull Uint32Array typedArray, int index, int value, int timeout) {
    return namespace().wait_(typedArray, index, value, timeout);
  }

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @AtomicWaitResult
  @Nonnull
  public static String wait_(@Nonnull Uint8ClampedArray typedArray, int index, int value,
      int timeout) {
    return namespace().wait_(typedArray, index, value, timeout);
  }

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @AtomicWaitResult
  @Nonnull
  public static String wait_(@Nonnull IntegerTypedArray typedArray, int index, int value) {
    return namespace().wait_(typedArray, index, value);
  }

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @AtomicWaitResult
  @Nonnull
  public static String wait_(@Nonnull Int8Array typedArray, int index, int value) {
    return namespace().wait_(typedArray, index, value);
  }

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @AtomicWaitResult
  @Nonnull
  public static String wait_(@Nonnull Int16Array typedArray, int index, int value) {
    return namespace().wait_(typedArray, index, value);
  }

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @AtomicWaitResult
  @Nonnull
  public static String wait_(@Nonnull Int32Array typedArray, int index, int value) {
    return namespace().wait_(typedArray, index, value);
  }

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @AtomicWaitResult
  @Nonnull
  public static String wait_(@Nonnull Uint8Array typedArray, int index, int value) {
    return namespace().wait_(typedArray, index, value);
  }

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @AtomicWaitResult
  @Nonnull
  public static String wait_(@Nonnull Uint16Array typedArray, int index, int value) {
    return namespace().wait_(typedArray, index, value);
  }

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @AtomicWaitResult
  @Nonnull
  public static String wait_(@Nonnull Uint32Array typedArray, int index, int value) {
    return namespace().wait_(typedArray, index, value);
  }

  /**
   * Verifies that the specified index of the array still contains a value and sleeps awaiting or times out.
   * Returns either "ok", "not-equal", or "timed-out".
   * If waiting is not allowed in the calling agent then it throws an Error exception. Most browsers will not
   * allow wait() on the browser's main thread.
   *
   * @return the result state.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/wait">Atomics.wait() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.wait">Atomics.wait() - ECMA</a>
   */
  @AtomicWaitResult
  @Nonnull
  public static String wait_(@Nonnull Uint8ClampedArray typedArray, int index, int value) {
    return namespace().wait_(typedArray, index, value);
  }

  /**
   * Computes a bitwise XOR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/xor">Atomics.xor() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.xor">Atomics.xor() - ECMA</a>
   */
  public static int xor(@Nonnull IntegerTypedArray typedArray, int index, int value) {
    return namespace().xor(typedArray, index, value);
  }

  /**
   * Computes a bitwise XOR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/xor">Atomics.xor() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.xor">Atomics.xor() - ECMA</a>
   */
  public static int xor(@Nonnull Int8Array typedArray, int index, int value) {
    return namespace().xor(typedArray, index, value);
  }

  /**
   * Computes a bitwise XOR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/xor">Atomics.xor() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.xor">Atomics.xor() - ECMA</a>
   */
  public static int xor(@Nonnull Int16Array typedArray, int index, int value) {
    return namespace().xor(typedArray, index, value);
  }

  /**
   * Computes a bitwise XOR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/xor">Atomics.xor() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.xor">Atomics.xor() - ECMA</a>
   */
  public static int xor(@Nonnull Int32Array typedArray, int index, int value) {
    return namespace().xor(typedArray, index, value);
  }

  /**
   * Computes a bitwise XOR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/xor">Atomics.xor() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.xor">Atomics.xor() - ECMA</a>
   */
  public static int xor(@Nonnull Uint8Array typedArray, int index, int value) {
    return namespace().xor(typedArray, index, value);
  }

  /**
   * Computes a bitwise XOR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/xor">Atomics.xor() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.xor">Atomics.xor() - ECMA</a>
   */
  public static int xor(@Nonnull Uint16Array typedArray, int index, int value) {
    return namespace().xor(typedArray, index, value);
  }

  /**
   * Computes a bitwise XOR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/xor">Atomics.xor() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.xor">Atomics.xor() - ECMA</a>
   */
  public static int xor(@Nonnull Uint32Array typedArray, int index, int value) {
    return namespace().xor(typedArray, index, value);
  }

  /**
   * Computes a bitwise XOR on the value at the specified index of the array with the provided value.
   *
   * @return the old value at the position.
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Atomics/xor">Atomics.xor() - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-atomics.xor">Atomics.xor() - ECMA</a>
   */
  public static int xor(@Nonnull Uint8ClampedArray typedArray, int index, int value) {
    return namespace().xor(typedArray, index, value);
  }

  /**
   * Return the 'Atomics' namespace object.
   *
   * @return the 'Atomics' namespace object
   */
  @Nonnull
  public static AtomicsNamespace namespace() {
    return Global.atomics();
  }
}
