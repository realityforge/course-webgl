package akasha.core;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * JavaScript Date objects represent a single moment in time in a platform-independent format.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date">Date - MDN</a>
 * @see <a href="https://tc39.es/ecma262/#sec-date-objects">Date - ECMAScript (ECMA-262)</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Date"
)
public class JsDate {
  public JsDate() {
  }

  public JsDate(@Nonnull final String date) {
  }

  public JsDate(final double date) {
  }

  public JsDate(final int year, final int month, final int date, final int hours, final int minute,
      final int second, final int ms) {
  }

  public JsDate(final int year, final int month, final int date, final int hours, final int minute,
      final int second) {
  }

  public JsDate(final int year, final int month, final int date, final int hours,
      final int minute) {
  }

  public JsDate(final int year, final int month, final int date, final int hours) {
  }

  public JsDate(final int year, final int month, final int date) {
  }

  public JsDate(final int year, final int month) {
  }

  /**
   * The Date.UTC() method accepts parameters similar to the Date constructor, but treats them as UTC. It returns the number of milliseconds since January 1, 1970, 00:00:00 UTC.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/UTC">Date.UTC - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.utc">Date.UTC - ECMAScript (ECMA-262)</a>
   */
  public static native double UTC(int year, int month, int date, int hours, int minute, int second,
      int ms);

  /**
   * The Date.UTC() method accepts parameters similar to the Date constructor, but treats them as UTC. It returns the number of milliseconds since January 1, 1970, 00:00:00 UTC.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/UTC">Date.UTC - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.utc">Date.UTC - ECMAScript (ECMA-262)</a>
   */
  public static native double UTC(int year, int month, int date, int hours, int minute, int second);

  /**
   * The Date.UTC() method accepts parameters similar to the Date constructor, but treats them as UTC. It returns the number of milliseconds since January 1, 1970, 00:00:00 UTC.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/UTC">Date.UTC - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.utc">Date.UTC - ECMAScript (ECMA-262)</a>
   */
  public static native double UTC(int year, int month, int date, int hours, int minute);

  /**
   * The Date.UTC() method accepts parameters similar to the Date constructor, but treats them as UTC. It returns the number of milliseconds since January 1, 1970, 00:00:00 UTC.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/UTC">Date.UTC - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.utc">Date.UTC - ECMAScript (ECMA-262)</a>
   */
  public static native double UTC(int year, int month, int date, int hours);

  /**
   * The Date.UTC() method accepts parameters similar to the Date constructor, but treats them as UTC. It returns the number of milliseconds since January 1, 1970, 00:00:00 UTC.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/UTC">Date.UTC - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.utc">Date.UTC - ECMAScript (ECMA-262)</a>
   */
  public static native double UTC(int year, int month, int date);

  /**
   * The Date.UTC() method accepts parameters similar to the Date constructor, but treats them as UTC. It returns the number of milliseconds since January 1, 1970, 00:00:00 UTC.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/UTC">Date.UTC - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.utc">Date.UTC - ECMAScript (ECMA-262)</a>
   */
  public static native double UTC(int year, int month);

  /**
   * The Date.UTC() method accepts parameters similar to the Date constructor, but treats them as UTC. It returns the number of milliseconds since January 1, 1970, 00:00:00 UTC.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/UTC">Date.UTC - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.utc">Date.UTC - ECMAScript (ECMA-262)</a>
   */
  public static native double UTC(int year);

  /**
   * The static Date.now() method returns the number of milliseconds elapsed since January 1, 1970 00:00:00 UTC.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/now">Date.now - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.now">Date.now - ECMAScript (ECMA-262)</a>
   */
  public static native double now();

  /**
   * The Date.parse() method parses a string representation of a date, and returns the number of milliseconds since January 1, 1970, 00:00:00 UTC or NaN if the string is unrecognized or, in some cases, contains illegal date values (e.g. 2015-02-31).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/parse">Date.parse - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.parse">Date.parse - ECMAScript (ECMA-262)</a>
   */
  public static native double parse(@Nonnull String date);

  /**
   * The getDate() method returns the day of the month for the specified date according to local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getDate">Date.getDate - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.getdate">Date.prototype.getDate - ECMAScript (ECMA-262)</a>
   */
  public native int getDate();

  /**
   * The getDay() method returns the day of the week for the specified date according to local time, where 0 represents Sunday.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getDay">Date.getDay - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.getday">Date.prototype.getDay - ECMAScript (ECMA-262)</a>
   */
  public native int getDay();

  /**
   * The getFullYear() method returns the year of the specified date according to local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getFullYear">Date.getFullYear - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.getfullyear">Date.prototype.getFullYear - ECMAScript (ECMA-262)</a>
   */
  public native int getFullYear();

  /**
   * The getHours() method returns the hour for the specified date, according to local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getHours">Date.getHours - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.gethours">Date.prototype.getHours - ECMAScript (ECMA-262)</a>
   */
  public native int getHours();

  /**
   * The getMilliseconds() method returns the milliseconds in the specified date according to local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getMilliseconds">Date.getMilliseconds - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.getmilliseconds">Date.prototype.getMilliseconds - ECMAScript (ECMA-262)</a>
   */
  public native int getMilliseconds();

  /**
   * The getMinutes() method returns the minutes in the specified date according to local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getMinutes">Date.getMinutes - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.getminutes">Date.prototype.getMinutes - ECMAScript (ECMA-262)</a>
   */
  public native int getMinutes();

  /**
   * The getMonth() method returns the month in the specified date according to local time, as a zero-based value (where zero indicates the first month of the year).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getMonth">Date.getMonth - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.getmonth">Date.prototype.getMonth - ECMAScript (ECMA-262)</a>
   */
  public native int getMonth();

  /**
   * The getSeconds() method returns the seconds in the specified date according to local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getSeconds">Date.getSeconds - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.getseconds">Date.prototype.getSeconds - ECMAScript (ECMA-262)</a>
   */
  public native int getSeconds();

  /**
   * The getTime() method returns the number of milliseconds* since the Unix Epoch.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTime">Date.getTime - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.gettime">Date.prototype.getTime - ECMAScript (ECMA-262)</a>
   */
  public native double getTime();

  /**
   * The getTimezoneOffset() method returns the time zone difference, in minutes, from current locale (host system settings) to UTC.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTimezoneOffset">Date.getTimezoneOffset - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.gettimezoneoffset">Date.prototype.getTimezoneOffset - ECMAScript (ECMA-262)</a>
   */
  public native int getTimezoneOffset();

  /**
   * The getUTCDate() method returns the day of the month(from 1 to 31) in the specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getUTCDate">Date.getUTCDate - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.getutcdate">Date.prototype.getUTCDate - ECMAScript (ECMA-262)</a>
   */
  public native int getUTCDate();

  /**
   * The getUTCDay() method returns the day of the week in the specified date according to universal time, where 0 represents Sunday.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getUTCDay">Date.getUTCDay - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.getutcday">Date.prototype.getUTCDay - ECMAScript (ECMA-262)</a>
   */
  public native int getUTCDay();

  /**
   * The getUTCFullYear() method returns the year in the specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getUTCFullYear">Date.getUTCFullYear - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.getutcfullyear">Date.prototype.getUTCFullYear - ECMAScript (ECMA-262)</a>
   */
  public native int getUTCFullYear();

  /**
   * The getUTCHours() method returns the hours in the specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getUTCHours">Date.getUTCHours - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.getutchours">Date.prototype.getUTCHours - ECMAScript (ECMA-262)</a>
   */
  public native int getUTCHours();

  /**
   * The getUTCMilliseconds() method returns the milliseconds portion of the time object's value.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getUTCMilliseconds">Date.getUTCMilliseconds - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.getutcmilliseconds">Date.prototype.getUTCMilliseconds - ECMAScript (ECMA-262)</a>
   */
  public native int getUTCMilliseconds();

  /**
   * The getUTCMinutes() method returns the minutes in the specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getUTCMinutes">Date.getUTCMinutes - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.getutcminutes">Date.prototype.getUTCMinutes - ECMAScript (ECMA-262)</a>
   */
  public native int getUTCMinutes();

  /**
   * The getUTCMonth() returns the month of the specified date according to universal time, as a zero-based value (where zero indicates the first month of the year).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getUTCMonth">Date.getUTCMonth - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.getutcmonth">Date.prototype.getUTCMonth - ECMAScript (ECMA-262)</a>
   */
  public native int getUTCMonth();

  /**
   * The getUTCSeconds() method returns the seconds in the specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getUTCSeconds">Date.getUTCSeconds - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.getutcseconds">Date.prototype.getUTCSeconds - ECMAScript (ECMA-262)</a>
   */
  public native int getUTCSeconds();

  /**
   * The setDate() method sets the day of the Date object relative to the beginning of the currently set month.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setDate">Date.setDate - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setdate">Date.prototype.setDate - ECMAScript (ECMA-262)</a>
   */
  public native double setDate(int dayValue);

  /**
   * The setFullYear() method sets the full year for a specified date according to local time. Returns new timestamp.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setFullYear">Date.setFullYear - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setfullyear">Date.prototype.setFullYear - ECMAScript (ECMA-262)</a>
   */
  public native double setFullYear(int yearValue, int monthValue, int dayValue);

  /**
   * The setFullYear() method sets the full year for a specified date according to local time. Returns new timestamp.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setFullYear">Date.setFullYear - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setfullyear">Date.prototype.setFullYear - ECMAScript (ECMA-262)</a>
   */
  public native double setFullYear(int yearValue, int monthValue);

  /**
   * The setFullYear() method sets the full year for a specified date according to local time. Returns new timestamp.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setFullYear">Date.setFullYear - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setfullyear">Date.prototype.setFullYear - ECMAScript (ECMA-262)</a>
   */
  public native double setFullYear(int yearValue);

  /**
   * The setHours() method sets the hours for a specified date according to local time, and returns the number of milliseconds since January 1, 1970 00:00:00 UTC until the time represented by the updated Date instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setHours">Date.setHours - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.sethours">Date.prototype.setHours - ECMAScript (ECMA-262)</a>
   */
  public native double setHours(int hoursValue, int minutesValue, int secondsValue, int msValue);

  /**
   * The setHours() method sets the hours for a specified date according to local time, and returns the number of milliseconds since January 1, 1970 00:00:00 UTC until the time represented by the updated Date instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setHours">Date.setHours - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.sethours">Date.prototype.setHours - ECMAScript (ECMA-262)</a>
   */
  public native double setHours(int hoursValue, int minutesValue, int secondsValue);

  /**
   * The setHours() method sets the hours for a specified date according to local time, and returns the number of milliseconds since January 1, 1970 00:00:00 UTC until the time represented by the updated Date instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setHours">Date.setHours - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.sethours">Date.prototype.setHours - ECMAScript (ECMA-262)</a>
   */
  public native double setHours(int hoursValue, int minutesValue);

  /**
   * The setHours() method sets the hours for a specified date according to local time, and returns the number of milliseconds since January 1, 1970 00:00:00 UTC until the time represented by the updated Date instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setHours">Date.setHours - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.sethours">Date.prototype.setHours - ECMAScript (ECMA-262)</a>
   */
  public native double setHours(int hoursValue);

  /**
   * The setMilliseconds() method sets the milliseconds for a specified date according to local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setMilliseconds">Date.setMilliseconds - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setmilliseconds">Date.prototype.setMilliseconds - ECMAScript (ECMA-262)</a>
   */
  public native double setMilliseconds(int millisecondsValue);

  /**
   * The setMinutes() method sets the minutes for a specified date according to local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setMinutes">Date.setMinutes - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setminutes">Date.prototype.setMinutes - ECMAScript (ECMA-262)</a>
   */
  public native double setMinutes(int minutesValue, int secondsValue, int msValue);

  /**
   * The setMinutes() method sets the minutes for a specified date according to local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setMinutes">Date.setMinutes - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setminutes">Date.prototype.setMinutes - ECMAScript (ECMA-262)</a>
   */
  public native double setMinutes(int minutesValue, int secondsValue);

  /**
   * The setMinutes() method sets the minutes for a specified date according to local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setMinutes">Date.setMinutes - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setminutes">Date.prototype.setMinutes - ECMAScript (ECMA-262)</a>
   */
  public native double setMinutes(int minutesValue);

  /**
   * The setMonth() method sets the month for a specified date according to the currently set year.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setMonth">Date.setMonth - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setmonth">Date.prototype.setMonth - ECMAScript (ECMA-262)</a>
   */
  public native double setMonth(int monthValue, int dayValue);

  /**
   * The setMonth() method sets the month for a specified date according to the currently set year.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setMonth">Date.setMonth - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setmonth">Date.prototype.setMonth - ECMAScript (ECMA-262)</a>
   */
  public native double setMonth(int monthValue);

  /**
   * The setSeconds() method sets the seconds for a specified date according to local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setSeconds">Date.setSeconds - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setseconds">Date.prototype.setSeconds - ECMAScript (ECMA-262)</a>
   */
  public native double setSeconds(int secondsValue, int msValue);

  /**
   * The setSeconds() method sets the seconds for a specified date according to local time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setSeconds">Date.setSeconds - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setseconds">Date.prototype.setSeconds - ECMAScript (ECMA-262)</a>
   */
  public native double setSeconds(int secondsValue);

  /**
   * The setTime() method sets the Date object to the time represented by a number of milliseconds since January 1, 1970, 00:00:00 UTC.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setTime">Date.setTime - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.settime">Date.prototype.setTime - ECMAScript (ECMA-262)</a>
   */
  public native double setTime(double timeValue);

  /**
   * The setUTCDate() method sets the day of the month for a specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCDate">Date.setUTCDate - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setutcdate">Date.prototype.setUTCDate - ECMAScript (ECMA-262)</a>
   */
  public native double setUTCDate(int dayValue);

  /**
   * The setUTCFullYear() method sets the full year for a specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCFullYear">Date.setUTCFullYear - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setutcfullyear">Date.prototype.setUTCFullYear - ECMAScript (ECMA-262)</a>
   */
  public native double setUTCFullYear(int yearValue, int monthValue, int dayValue);

  /**
   * The setUTCFullYear() method sets the full year for a specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCFullYear">Date.setUTCFullYear - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setutcfullyear">Date.prototype.setUTCFullYear - ECMAScript (ECMA-262)</a>
   */
  public native double setUTCFullYear(int yearValue, int monthValue);

  /**
   * The setUTCFullYear() method sets the full year for a specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCFullYear">Date.setUTCFullYear - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setutcfullyear">Date.prototype.setUTCFullYear - ECMAScript (ECMA-262)</a>
   */
  public native double setUTCFullYear(int yearValue);

  /**
   * The setUTCHours() method sets the hour for a specified date according to universal time, and returns the number of milliseconds since January 1, 1970 00:00:00 UTC until the time represented by the updated Date instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCHours">Date.setUTCHours - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setutchours">Date.prototype.setUTCHours - ECMAScript (ECMA-262)</a>
   */
  public native double setUTCHours(int hoursValue, int minutesValue, int secondsValue, int msValue);

  /**
   * The setUTCHours() method sets the hour for a specified date according to universal time, and returns the number of milliseconds since January 1, 1970 00:00:00 UTC until the time represented by the updated Date instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCHours">Date.setUTCHours - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setutchours">Date.prototype.setUTCHours - ECMAScript (ECMA-262)</a>
   */
  public native double setUTCHours(int hoursValue, int minutesValue, int secondsValue);

  /**
   * The setUTCHours() method sets the hour for a specified date according to universal time, and returns the number of milliseconds since January 1, 1970 00:00:00 UTC until the time represented by the updated Date instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCHours">Date.setUTCHours - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setutchours">Date.prototype.setUTCHours - ECMAScript (ECMA-262)</a>
   */
  public native double setUTCHours(int hoursValue, int minutesValue);

  /**
   * The setUTCHours() method sets the hour for a specified date according to universal time, and returns the number of milliseconds since January 1, 1970 00:00:00 UTC until the time represented by the updated Date instance.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCHours">Date.setUTCHours - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setutchours">Date.prototype.setUTCHours - ECMAScript (ECMA-262)</a>
   */
  public native double setUTCHours(int hoursValue);

  /**
   * The setUTCMilliseconds() method sets the milliseconds for a specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCMilliseconds">Date.setUTCMilliseconds - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setutcmilliseconds">Date.prototype.setUTCMilliseconds - ECMAScript (ECMA-262)</a>
   */
  public native double setUTCMilliseconds(int millisecondsValue);

  /**
   * The setUTCMinutes() method sets the minutes for a specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCMinutes">Date.setUTCMinutes - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setutcminutes">Date.prototype.setUTCMinutes - ECMAScript (ECMA-262)</a>
   */
  public native double setUTCMinutes(int minutesValue, int secondsValue, int msValue);

  /**
   * The setUTCMinutes() method sets the minutes for a specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCMinutes">Date.setUTCMinutes - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setutcminutes">Date.prototype.setUTCMinutes - ECMAScript (ECMA-262)</a>
   */
  public native double setUTCMinutes(int minutesValue, int secondsValue);

  /**
   * The setUTCMinutes() method sets the minutes for a specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCMinutes">Date.setUTCMinutes - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setutcminutes">Date.prototype.setUTCMinutes - ECMAScript (ECMA-262)</a>
   */
  public native double setUTCMinutes(int minutesValue);

  /**
   * The setUTCMonth() method sets the month for a specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCMonth">Date.setUTCMonth - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setutcmonth">Date.prototype.setUTCMonth - ECMAScript (ECMA-262)</a>
   */
  public native double setUTCMonth(int monthValue, int dayValue);

  /**
   * The setUTCMonth() method sets the month for a specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCMonth">Date.setUTCMonth - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setutcmonth">Date.prototype.setUTCMonth - ECMAScript (ECMA-262)</a>
   */
  public native double setUTCMonth(int monthValue);

  /**
   * The setUTCSeconds() method sets the seconds for a specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCSeconds">Date.setUTCSeconds - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setutcseconds">Date.prototype.setUTCSeconds - ECMAScript (ECMA-262)</a>
   */
  public native double setUTCSeconds(int secondsValue, int msValue);

  /**
   * The setUTCSeconds() method sets the seconds for a specified date according to universal time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/setUTCSeconds">Date.setUTCSeconds - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.setutcseconds">Date.prototype.setUTCSeconds - ECMAScript (ECMA-262)</a>
   */
  public native double setUTCSeconds(int secondsValue);

  /**
   * The toDateString() method returns the date portion of a Date object in English in the following format separated by spaces:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toDateString">Date.toDateString - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.todatestring">Date.prototype.toDateString - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String toDateString();

  /**
   * The toISOString() method returns a string in simplified extended ISO format (ISO 8601), which is always 24 or 27 characters long (YYYY-MM-DDTHH:mm:ss.sssZ or &plusmn;YYYYYY-MM-DDTHH:mm:ss.sssZ, respectively). The timezone is always zero UTC offset, as denoted by the suffix &quot;Z&quot;.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toISOString">Date.toISOString - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.toisostring">Date.prototype.toISOString - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String toISOString();

  /**
   * The toJSON() method returns a string representation of the Date object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toJSON">Date.toJSON - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.tojson">Date.prototype.toJSON - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String toJSON();

  /**
   * The toTimeString() method returns the time portion of a Date object in human readable form in English.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toTimeString">Date.toTimeString - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.totimestring">Date.prototype.toTimeString - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String toTimeString();

  /**
   * The toUTCString() method converts a date to a string, using the UTC time zone.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toUTCString">Date.toUTCString - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.toutcstring">Date.prototype.toUTCString - ECMAScript (ECMA-262)</a>
   */
  @Nonnull
  public native String toUTCString();

  /**
   * The valueOf() method returns the primitive value of a Date object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/valueOf">Date.valueOf - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.valueof">Date.prototype.valueOf - ECMAScript (ECMA-262)</a>
   */
  public native double valueOf();

  /**
   * The toString() method returns a string representing the specified Date object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toString">Date.toString - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-date.prototype.tostring">Date.prototype.toString - ECMAScript (ECMA-262)</a>
   */
  @JsMethod(
      name = "toString"
  )
  @Nonnull
  public native String toString_();
}
