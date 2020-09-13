package elemental3;

import javax.annotation.Generated;
import javax.annotation.Nonnull;

/**
 * An enumeration describing the whether elements can have their values automatically completed by the browser.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/autocomplete">autocomplete - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/form-control-infrastructure.html#autofill">autocomplete - Specification</a>
 */
@Generated("org.realityforge.webtack")
public final class AutocompleteType {
  /**
   * The browser is not permitted to automatically enter or select a value for this field. It is possible that the document or application provides its own autocomplete feature, or that security concerns require that the field's value not be automatically entered.
   * <p>Note: In most modern browsers, setting autocomplete to "off" will not prevent a password manager from asking the user if they would like to save username and password information, or from automatically filling in those values in a site's login form. See the
   * <a href="https://developer.mozilla.org/en-US/docs/Web/Security/Securing_your_site/Turning_off_form_autocompletion#The_autocomplete_attribute_and_login_fields">autocomplete attribute and login fields</a>.
   */
  @Nonnull
  public static final String off = "off";

  /**
   * The browser is allowed to automatically complete the input. No guidance is provided as to the type of data expected in the field, so the browser may use its own judgement.
   */
  @Nonnull
  public static final String on = "on";

  /**
   * The field expects the value to be a person's full name. Using "name" rather than breaking the name down into its components is generally preferred because it avoids dealing with the wide diversity of human names and how they are structured.
   */
  @Nonnull
  public static final String name = "name";

  /**
   * The prefix or title, such as "Mrs.", "Mr.", "Miss", "Ms.", "Dr.", or "Mlle.".
   */
  @Nonnull
  public static final String honorific_prefix = "honorific-prefix";

  /**
   * The given (or "first") name.
   */
  @Nonnull
  public static final String given_name = "given-name";

  /**
   * The middle name.
   */
  @Nonnull
  public static final String additional_name = "additional-name";

  /**
   * The family (or "last") name.
   */
  @Nonnull
  public static final String family_name = "family-name";

  /**
   * The suffix, such as "Jr.", "B.Sc.", "PhD.", "MBASW", or "IV".
   */
  @Nonnull
  public static final String honorific_suffix = "honorific-suffix";

  /**
   * A nickname or handle.
   */
  @Nonnull
  public static final String nickname = "nickname";

  /**
   * An email address.
   */
  @Nonnull
  public static final String email = "email";

  /**
   * A username or account name.
   */
  @Nonnull
  public static final String username = "username";

  /**
   * A new password. When creating a new account or changing passwords, this should be used for an "Enter your new password" or "Confirm new password" field, as opposed to a general "Enter your current password" field that might be present. This may be used by the browser both to avoid accidentally filling in an existing password and to offer assistance in creating a secure password.
   */
  @Nonnull
  public static final String new_password = "new-password";

  /**
   * The user's current password.
   */
  @Nonnull
  public static final String current_password = "current-password";

  /**
   * A one-time code used for verifying user identity.
   */
  @Nonnull
  public static final String one_time_code = "one-time-code";

  /**
   * A job title, or the title a person has within an organization, such as "Senior Technical Writer", "President", or "Assistant Troop Leader".
   */
  @Nonnull
  public static final String organization_title = "organization-title";

  /**
   * A company or organization name, such as "Acme Widget Company" or "Girl Scouts of America".
   */
  @Nonnull
  public static final String organization = "organization";

  /**
   * A street address. This can be multiple lines of text, and should fully identify the location of the address within its second administrative level (typically a city or town), but should not include the city name, ZIP or postal code, or country name.
   */
  @Nonnull
  public static final String street_address = "street-address";

  /**
   * Each individual line of the street address. These should only be present if the "street-address" is not present.
   */
  @Nonnull
  public static final String address_line1 = "address-line1";

  /**
   * Each individual line of the street address. These should only be present if the "street-address" is not present.
   */
  @Nonnull
  public static final String address_line2 = "address-line2";

  /**
   * Each individual line of the street address. These should only be present if the "street-address" is not present.
   */
  @Nonnull
  public static final String address_line3 = "address-line3";

  /**
   * The finest-grained administrative level, in addresses which have four levels.
   */
  @Nonnull
  public static final String address_level4 = "address-level4";

  /**
   * The third administrative level, in addresses with at least three administrative levels.
   */
  @Nonnull
  public static final String address_level3 = "address-level3";

  /**
   * The second administrative level, in addresses with at least two of them. In countries with two administrative levels, this would typically be the city, town, village, or other locality in which the address is located.
   */
  @Nonnull
  public static final String address_level2 = "address-level2";

  /**
   * The first administrative level in the address. This is typically the province in which the address is located. In the United States, this would be the state. In Switzerland, the canton. In the United Kingdom, the post town.
   */
  @Nonnull
  public static final String address_level1 = "address-level1";

  /**
   * A country or territory code.
   */
  @Nonnull
  public static final String country = "country";

  /**
   * A country or territory name.
   */
  @Nonnull
  public static final String country_name = "country-name";

  /**
   * A postal code (in the United States, this is the ZIP code).
   */
  @Nonnull
  public static final String postal_code = "postal-code";

  /**
   * The full name as printed on or associated with a payment instrument such as a credit card. Using a full name field is preferred, typically, over breaking the name into pieces.
   */
  @Nonnull
  public static final String cc_name = "cc-name";

  /**
   * A given (first) name as given on a payment instrument like a credit card.
   */
  @Nonnull
  public static final String cc_given_name = "cc-given-name";

  /**
   * A middle name as given on a payment instrument or credit card.
   */
  @Nonnull
  public static final String cc_additional_name = "cc-additional-name";

  /**
   * A family name, as given on a credit card.
   */
  @Nonnull
  public static final String cc_family_name = "cc-family-name";

  /**
   * A credit card number or other number identifying a payment method, such as an account number.
   */
  @Nonnull
  public static final String cc_number = "cc-number";

  /**
   * A payment method expiration date, typically in the form "MM/YY" or "MM/YYYY".
   */
  @Nonnull
  public static final String cc_exp = "cc-exp";

  /**
   * The month in which the payment method expires.
   */
  @Nonnull
  public static final String cc_exp_month = "cc-exp-month";

  /**
   * The year in which the payment method expires.
   */
  @Nonnull
  public static final String cc_exp_year = "cc-exp-year";

  /**
   * The security code for the payment instrument; on credit cards, this is the 3-digit verification number on the back of the card.
   */
  @Nonnull
  public static final String cc_csc = "cc-csc";

  /**
   * The type of payment instrument (such as "Visa" or "Master Card").
   */
  @Nonnull
  public static final String cc_type = "cc-type";

  /**
   * The currency in which the transaction is to take place.
   */
  @Nonnull
  public static final String transaction_currency = "transaction-currency";

  /**
   * The amount, given in the currency specified by "transaction-currency", of the transaction, for a payment form.
   */
  @Nonnull
  public static final String transaction_amount = "transaction-amount";

  /**
   * A preferred language, given as a valid <a href="https://en.wikipedia.org/wiki/IETF_language_tag">BCP 47 language tag</a>.
   */
  @Nonnull
  public static final String language = "language";

  /**
   * A birth date, as a full date.
   */
  @Nonnull
  public static final String bday = "bday";

  /**
   * The day of the month of a birth date.
   */
  @Nonnull
  public static final String bday_day = "bday-day";

  /**
   * The month of the year of a birth date.
   */
  @Nonnull
  public static final String bday_month = "bday-month";

  /**
   * The year of a birth date.
   */
  @Nonnull
  public static final String bday_year = "bday-year";

  /**
   * A gender identity (such as "Female", "Fa'afafine", "Male"), as freeform text without newlines.
   */
  @Nonnull
  public static final String sex = "sex";

  /**
   * A full telephone number, including the country code.
   */
  @Nonnull
  public static final String tel = "tel";

  /**
   * The country code, such as "1" for the United States, Canada, and other areas in North America and parts of the Caribbean.
   */
  @Nonnull
  public static final String tel_country_code = "tel-country-code";

  /**
   * The entire phone number without the country code component, including a country-internal prefix. For the phone number "1-855-555-6502", this field's value would be "855-555-6502".
   */
  @Nonnull
  public static final String tel_national = "tel-national";

  /**
   * The area code, with any country-internal prefix applied if appropriate.
   */
  @Nonnull
  public static final String tel_area_code = "tel-area-code";

  /**
   * The phone number without the country or area code. This can be split further into two parts, for phone numbers which have an exchange number and then a number within the exchange. For the phone number "555-6502", use "tel-local-prefix" for "555" and "tel-local-suffix" for "6502".
   */
  @Nonnull
  public static final String tel_local = "tel-local";

  /**
   * A telephone extension code within the phone number, such as a room or suite number in a hotel or an office extension in a company.
   */
  @Nonnull
  public static final String tel_extension = "tel-extension";

  /**
   * A URL for an instant messaging protocol endpoint, such as "xmpp:username@example.net".
   */
  @Nonnull
  public static final String impp = "impp";

  /**
   * A URL, such as a home page or company web site address as appropriate given the context of the other fields in the form.
   */
  @Nonnull
  public static final String url = "url";

  /**
   * The URL of an image representing the person, company, or contact information given in the other fields in the form.
   */
  @Nonnull
  public static final String photo = "photo";

  /**
   * The value is for contacting someone at their residence.
   */
  @Nonnull
  public static final String home = "home";

  /**
   * The value is for contacting someone at their workplace.
   */
  @Nonnull
  public static final String work = "work";

  /**
   * The value is for contacting someone regardless of location.
   */
  @Nonnull
  public static final String mobile = "mobile";

  /**
   * The value describes a fax machine's contact details.
   */
  @Nonnull
  public static final String fax = "fax";

  /**
   * The value describes a pager's or beeper's contact details.
   */
  @Nonnull
  public static final String pager = "pager";

  private AutocompleteType() {
  }
}
