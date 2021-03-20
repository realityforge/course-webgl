package akasha;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

/**
 * An enumeration describing the whether elements can have their values automatically completed by the browser.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/autocomplete">autocomplete - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/form-control-infrastructure.html#autofill">autocomplete - Specification</a>
 */
@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = AutocompleteType.class
)
public @interface AutocompleteType {
  /**
   * The middle name.
   */
  @Nonnull
  String additional_name = "additional-name";

  /**
   * The first administrative level in the address. This is typically the province in which the address is located. In the United States, this would be the state. In Switzerland, the canton. In the United Kingdom, the post town.
   */
  @Nonnull
  String address_level1 = "address-level1";

  /**
   * The second administrative level, in addresses with at least two of them. In countries with two administrative levels, this would typically be the city, town, village, or other locality in which the address is located.
   */
  @Nonnull
  String address_level2 = "address-level2";

  /**
   * The third administrative level, in addresses with at least three administrative levels.
   */
  @Nonnull
  String address_level3 = "address-level3";

  /**
   * The finest-grained administrative level, in addresses which have four levels.
   */
  @Nonnull
  String address_level4 = "address-level4";

  /**
   * Each individual line of the street address. These should only be present if the "street-address" is not present.
   */
  @Nonnull
  String address_line1 = "address-line1";

  /**
   * Each individual line of the street address. These should only be present if the "street-address" is not present.
   */
  @Nonnull
  String address_line2 = "address-line2";

  /**
   * Each individual line of the street address. These should only be present if the "street-address" is not present.
   */
  @Nonnull
  String address_line3 = "address-line3";

  /**
   * A birth date, as a full date.
   */
  @Nonnull
  String bday = "bday";

  /**
   * The day of the month of a birth date.
   */
  @Nonnull
  String bday_day = "bday-day";

  /**
   * The month of the year of a birth date.
   */
  @Nonnull
  String bday_month = "bday-month";

  /**
   * The year of a birth date.
   */
  @Nonnull
  String bday_year = "bday-year";

  /**
   * A middle name as given on a payment instrument or credit card.
   */
  @Nonnull
  String cc_additional_name = "cc-additional-name";

  /**
   * The security code for the payment instrument; on credit cards, this is the 3-digit verification number on the back of the card.
   */
  @Nonnull
  String cc_csc = "cc-csc";

  /**
   * A payment method expiration date, typically in the form "MM/YY" or "MM/YYYY".
   */
  @Nonnull
  String cc_exp = "cc-exp";

  /**
   * The month in which the payment method expires.
   */
  @Nonnull
  String cc_exp_month = "cc-exp-month";

  /**
   * The year in which the payment method expires.
   */
  @Nonnull
  String cc_exp_year = "cc-exp-year";

  /**
   * A family name, as given on a credit card.
   */
  @Nonnull
  String cc_family_name = "cc-family-name";

  /**
   * A given (first) name as given on a payment instrument like a credit card.
   */
  @Nonnull
  String cc_given_name = "cc-given-name";

  /**
   * The full name as printed on or associated with a payment instrument such as a credit card. Using a full name field is preferred, typically, over breaking the name into pieces.
   */
  @Nonnull
  String cc_name = "cc-name";

  /**
   * A credit card number or other number identifying a payment method, such as an account number.
   */
  @Nonnull
  String cc_number = "cc-number";

  /**
   * The type of payment instrument (such as "Visa" or "Master Card").
   */
  @Nonnull
  String cc_type = "cc-type";

  /**
   * A country or territory code.
   */
  @Nonnull
  String country = "country";

  /**
   * A country or territory name.
   */
  @Nonnull
  String country_name = "country-name";

  /**
   * The user's current password.
   */
  @Nonnull
  String current_password = "current-password";

  /**
   * An email address.
   */
  @Nonnull
  String email = "email";

  /**
   * The family (or "last") name.
   */
  @Nonnull
  String family_name = "family-name";

  /**
   * The value describes a fax machine's contact details.
   */
  @Nonnull
  String fax = "fax";

  /**
   * The given (or "first") name.
   */
  @Nonnull
  String given_name = "given-name";

  /**
   * The value is for contacting someone at their residence.
   */
  @Nonnull
  String home = "home";

  /**
   * The prefix or title, such as "Mrs.", "Mr.", "Miss", "Ms.", "Dr.", or "Mlle.".
   */
  @Nonnull
  String honorific_prefix = "honorific-prefix";

  /**
   * The suffix, such as "Jr.", "B.Sc.", "PhD.", "MBASW", or "IV".
   */
  @Nonnull
  String honorific_suffix = "honorific-suffix";

  /**
   * A URL for an instant messaging protocol endpoint, such as "xmpp:username@example.net".
   */
  @Nonnull
  String impp = "impp";

  /**
   * A preferred language, given as a valid <a href="https://en.wikipedia.org/wiki/IETF_language_tag">BCP 47 language tag</a>.
   */
  @Nonnull
  String language = "language";

  /**
   * The value is for contacting someone regardless of location.
   */
  @Nonnull
  String mobile = "mobile";

  /**
   * The field expects the value to be a person's full name. Using "name" rather than breaking the name down into its components is generally preferred because it avoids dealing with the wide diversity of human names and how they are structured.
   */
  @Nonnull
  String name = "name";

  /**
   * A new password. When creating a new account or changing passwords, this should be used for an "Enter your new password" or "Confirm new password" field, as opposed to a general "Enter your current password" field that might be present. This may be used by the browser both to avoid accidentally filling in an existing password and to offer assistance in creating a secure password.
   */
  @Nonnull
  String new_password = "new-password";

  /**
   * A nickname or handle.
   */
  @Nonnull
  String nickname = "nickname";

  /**
   * The browser is not permitted to automatically enter or select a value for this field. It is possible that the document or application provides its own autocomplete feature, or that security concerns require that the field's value not be automatically entered.
   * <p>Note: In most modern browsers, setting autocomplete to "off" will not prevent a password manager from asking the user if they would like to save username and password information, or from automatically filling in those values in a site's login form. See the
   * <a href="https://developer.mozilla.org/en-US/docs/Web/Security/Securing_your_site/Turning_off_form_autocompletion#The_autocomplete_attribute_and_login_fields">autocomplete attribute and login fields</a>.
   */
  @Nonnull
  String off = "off";

  /**
   * The browser is allowed to automatically complete the input. No guidance is provided as to the type of data expected in the field, so the browser may use its own judgement.
   */
  @Nonnull
  String on = "on";

  /**
   * A one-time code used for verifying user identity.
   */
  @Nonnull
  String one_time_code = "one-time-code";

  /**
   * A company or organization name, such as "Acme Widget Company" or "Girl Scouts of America".
   */
  @Nonnull
  String organization = "organization";

  /**
   * A job title, or the title a person has within an organization, such as "Senior Technical Writer", "President", or "Assistant Troop Leader".
   */
  @Nonnull
  String organization_title = "organization-title";

  /**
   * The value describes a pager's or beeper's contact details.
   */
  @Nonnull
  String pager = "pager";

  /**
   * The URL of an image representing the person, company, or contact information given in the other fields in the form.
   */
  @Nonnull
  String photo = "photo";

  /**
   * A postal code (in the United States, this is the ZIP code).
   */
  @Nonnull
  String postal_code = "postal-code";

  /**
   * A gender identity (such as "Female", "Fa'afafine", "Male"), as freeform text without newlines.
   */
  @Nonnull
  String sex = "sex";

  /**
   * A street address. This can be multiple lines of text, and should fully identify the location of the address within its second administrative level (typically a city or town), but should not include the city name, ZIP or postal code, or country name.
   */
  @Nonnull
  String street_address = "street-address";

  /**
   * A full telephone number, including the country code.
   */
  @Nonnull
  String tel = "tel";

  /**
   * The area code, with any country-internal prefix applied if appropriate.
   */
  @Nonnull
  String tel_area_code = "tel-area-code";

  /**
   * The country code, such as "1" for the United States, Canada, and other areas in North America and parts of the Caribbean.
   */
  @Nonnull
  String tel_country_code = "tel-country-code";

  /**
   * A telephone extension code within the phone number, such as a room or suite number in a hotel or an office extension in a company.
   */
  @Nonnull
  String tel_extension = "tel-extension";

  /**
   * The phone number without the country or area code. This can be split further into two parts, for phone numbers which have an exchange number and then a number within the exchange. For the phone number "555-6502", use "tel-local-prefix" for "555" and "tel-local-suffix" for "6502".
   */
  @Nonnull
  String tel_local = "tel-local";

  /**
   * The entire phone number without the country code component, including a country-internal prefix. For the phone number "1-855-555-6502", this field's value would be "855-555-6502".
   */
  @Nonnull
  String tel_national = "tel-national";

  /**
   * The amount, given in the currency specified by "transaction-currency", of the transaction, for a payment form.
   */
  @Nonnull
  String transaction_amount = "transaction-amount";

  /**
   * The currency in which the transaction is to take place.
   */
  @Nonnull
  String transaction_currency = "transaction-currency";

  /**
   * A URL, such as a home page or company web site address as appropriate given the context of the other fields in the form.
   */
  @Nonnull
  String url = "url";

  /**
   * A username or account name.
   */
  @Nonnull
  String username = "username";

  /**
   * The value is for contacting someone at their workplace.
   */
  @Nonnull
  String work = "work";

  final class Util {
    private Util() {
    }

    @AutocompleteType
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return AutocompleteType.additional_name.equals( value ) || AutocompleteType.address_level1.equals( value ) || AutocompleteType.address_level2.equals( value ) || AutocompleteType.address_level3.equals( value ) || AutocompleteType.address_level4.equals( value ) || AutocompleteType.address_line1.equals( value ) || AutocompleteType.address_line2.equals( value ) || AutocompleteType.address_line3.equals( value ) || AutocompleteType.bday.equals( value ) || AutocompleteType.bday_day.equals( value ) || AutocompleteType.bday_month.equals( value ) || AutocompleteType.bday_year.equals( value ) || AutocompleteType.cc_additional_name.equals( value ) || AutocompleteType.cc_csc.equals( value ) || AutocompleteType.cc_exp.equals( value ) || AutocompleteType.cc_exp_month.equals( value ) || AutocompleteType.cc_exp_year.equals( value ) || AutocompleteType.cc_family_name.equals( value ) || AutocompleteType.cc_given_name.equals( value ) || AutocompleteType.cc_name.equals( value ) || AutocompleteType.cc_number.equals( value ) || AutocompleteType.cc_type.equals( value ) || AutocompleteType.country.equals( value ) || AutocompleteType.country_name.equals( value ) || AutocompleteType.current_password.equals( value ) || AutocompleteType.email.equals( value ) || AutocompleteType.family_name.equals( value ) || AutocompleteType.fax.equals( value ) || AutocompleteType.given_name.equals( value ) || AutocompleteType.home.equals( value ) || AutocompleteType.honorific_prefix.equals( value ) || AutocompleteType.honorific_suffix.equals( value ) || AutocompleteType.impp.equals( value ) || AutocompleteType.language.equals( value ) || AutocompleteType.mobile.equals( value ) || AutocompleteType.name.equals( value ) || AutocompleteType.new_password.equals( value ) || AutocompleteType.nickname.equals( value ) || AutocompleteType.off.equals( value ) || AutocompleteType.on.equals( value ) || AutocompleteType.one_time_code.equals( value ) || AutocompleteType.organization.equals( value ) || AutocompleteType.organization_title.equals( value ) || AutocompleteType.pager.equals( value ) || AutocompleteType.photo.equals( value ) || AutocompleteType.postal_code.equals( value ) || AutocompleteType.sex.equals( value ) || AutocompleteType.street_address.equals( value ) || AutocompleteType.tel.equals( value ) || AutocompleteType.tel_area_code.equals( value ) || AutocompleteType.tel_country_code.equals( value ) || AutocompleteType.tel_extension.equals( value ) || AutocompleteType.tel_local.equals( value ) || AutocompleteType.tel_national.equals( value ) || AutocompleteType.transaction_amount.equals( value ) || AutocompleteType.transaction_currency.equals( value ) || AutocompleteType.url.equals( value ) || AutocompleteType.username.equals( value ) || AutocompleteType.work.equals( value );
    }
  }
}
