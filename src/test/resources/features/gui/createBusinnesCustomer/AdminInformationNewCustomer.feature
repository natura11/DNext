@VFALFT-22629 @regression @adminInfoNewCustomer
Feature:Admin Information-New Customer Creation

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User opens Create Business Customer page on Home page
    Given User clicks the Admin Information button
    Given User is on the Admin Information  page

  @fillingNames
  Scenario:As a user,I want to enter new-not existing ID number and fill the First Name and Last Name fields into the required fields on Admin Information Page
    And  User  clicks the First Name field and enters the  first name as "Kemal" into the First Name field on Admin Information Page
    And  User  clicks the First Name field and enters the  first name as "Sunal" into the First Name field on Admin Information Page
    Then User cannot see the red warning backround colour after entering the the name into the name field on Admin Information Page

  @fillingEmails
  Scenario Outline: As a user I want to enter invalid and valid characters based email into email field on Admin Information Page
    Given User clicks email field on  Admin Information Page
    And   User enters "<emails>" on on Admin Information Page
    And   User should see that background is red on on Admin Information Page
    Given User enters valid "abc123@gmail.com" in to the email field on  Admin Information Page
    Then  User should see "." and "@" and "abc123@gmail.com" inside of email structure on Admin Information Page

    Examples:
      | emails       |
      | abcgmailcom  |
      | emails@com   |
      | emails@123.c |

  @fillingOtherFields
  Scenario:As a user I want to fill the gender,birth date ,citizenship, country ,place of birth fields and work phone number into the related fields on Admin Information Page
    Given User Male option from gender on Admin Information Page
    And   User selects of birth date as "15/05/1990" on Admin Information Page
    And   User selects the country as Albania as country of birth on Admin Information Page
    And   User selects Berat as place of birth on Admin Information Page
    And   User fill "12345678" the work number into the work phone number on Admin Information Page

  @fillinngNIPTnumber
  Scenario: As a user,I want to enter valid  new - not existing NIPT number into  the Identification Number field
    And   User clicks on the Identification Number field on Admin Information Page
    When  User enters one non existing valid "A19898589T" ID number into the Identification Number field on Admin Information page
    Then  User should see "Please click search icon!" warning under the Identification Number field on Admin Information Page
    And   User clicks the search icon in Identification Number field on Admin Information page
    Then  User sees the search icon turns into the cancel icon