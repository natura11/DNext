@VFALFT-18396 @regression @generalInformationForIndividualCustomer
Feature:New Individual Customer - General Information

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User clicks Create Individual Customer on Home page
    Given User enters "K12345678R" identification ID for ALBANIAN to the identification number field on Create Individual Customer page
    And   User clicks search button on Create Individual Customer page
    And   User clicks next Button in Search Individual on Create Individual Customer page
    #Given I click General Information on new business customer page

  Scenario: As a user, I want to enter numbers and special characters in to Firstname and Lastname fields
    Given User wants to enter "1235Ali" as firstname on New Individual Customer page
    Then  User should see that the entered  numbers  are not seen on  firstname field on New Individual Customer page
    And   User deletes the entered the firstname field on New Individual Customer page
    And   User wants to enter "Sunal25" as lastname into the lastname field on New Individual Customer page
    Then  User should see that the entered  numbers  are not seen  in the lastname field on New Individual Customer page
    And   User deletes the entered the lastname field on New Individual Customer page
    And   User wants to enter "**,#Ali#" as firstname with characters  into the firstname field on New Individual Customer page
    Then  User should see that background is red of the firstname picture on New Individual Customer page
    And   User wants to enter "Suna/.%" as surname with characters in to the lastname  field on New Individual Customer page
    Then  User should see that background is red of the lastname picture on New Individual Customer page

  Scenario: As a user, I want to leave one space at the beginning of firstname and lastname
    Given User wants to enter " Ali" as firstname with one space at the beginning on New Individual Customer page
    Then   User should see the left space at the beginning of firstname is eliminated on New Individual Customer page
    And   User wants to enter" Sunal" as lastname with one space at the beginning  on New Individual Customer page
    Then  User should see the left space at the beginning of  lastname is eliminated on New Individual Customer page

  Scenario: As a user, I want leave more than one spaces between my firstname nouns and between my lastname nouns on New Individual Customer page
    Given   User wants to enter "Ali  Kemal" as firstname into the firstname field on New Individual Customer page
    Then    User should not be allowed to write more than one spaced firstname nouns into the firstname field on New Individual Customer page
    Given   User wants to enter "Komik  Sunal" as a lastname into the lastname field on New Individual Customer page
    Then    User should not be allowed to write more than one spaced lastname nouns into the lastname field on New Individual Customer page

  Scenario: As a user, I want to write middle name into the middle name field on New Individual Customer page
    And    User enters "123BILGE" as middle name into the middle name field on New Individual Customer page
    Then   User should see that the entered  numbers  are not seen on middle name field on New Individual Customer page
    And   User deletes the entered middle name as "123BILGE"  on New Individual Customer page
    And    User enters "*.,BILGE(/" as middle name into the middle name field with characters  on New Individual Customer page
    Then   User should see that background is red of middle name  picture on New Individual Customer page
    And   User deletes the entered middle name with characters "*.,BILGE/)"  on New Individual Customer page
    Given  User wants to enter " BILGE" as middle name with one space at the beginning on New Individual Customer page
    Then   User should see the left space at the beginning of middle name is eliminated on New Individual Customer page

  Scenario: As a user I want to select one option from Segment dropdown on New Individual Customer page
    Given User clicks Segment dropdown on New Individual Customer page
    And   User should ensure each options in Segment dropdown are selectable on New Individual Customer page
    Then  User should selects any options in the Segment dropdown on New Individual Customer page

  Scenario Outline: As a user I want to enter invalid and valid characters based email into email field on New Individual Customer page
    Given User clicks email field on New Individual Customer page
    And   User enters "<emails>" on New Individual Customer page
    And   User should see that background is red on email field on New Individual Customer page
    Given User enters valid "abc123@gmail.com" in to the email field on New Individual Customer page
    Then  User should see "." and "@" and "abc123@gmail.com" inside of email structure on New Individual Customer page

    Examples:
      | emails       |
      | abcgmailcom  |
      | emails@com   |
      | emails@123.c |

  Scenario: As a user I want to fill the gender, birth date, citizenship, country, place of birth fields and work phone number into the related fields on New Individual Customer page
    Given User Male option from gender on New Individual Customer page
    And   User selects of invalid birth date as "15/05/2020" on New Individual Customer page
    And   User should see that background is red on birth date on New Individual Customer page
    And   User deletes the already entered invalid date of birth on New Individual Customer page
    And   User selects of valid birth date as "15/05/2000" on New Individual Customer page
    And   User clicks Citizenship dropdown on Create Individual Customer page
    And   User selects ALBANIAN citizenship from dropdown on Create Individual Customer page
    Then  User should see background is not red on Create Individual Customer page
    And   User selects the country as Albania as country of birth on New Individual Customer page
    And   User selects Berat as place of birth on New Individual Customer page
    And   User adds "623456789" the Mobile Phone Number into the Mobile Phone Number on New Individual Customer page

  Scenario: As a user I want to select one option from Communication Method dropdown on New Individual Customer page
    Given User clicks Communication Method dropdown on New Individual Customer page
    And   User should ensure each options in Communication Method dropdown ara selectable on New Individual Customer page
    Then  User should selects SMS option in the Communication Method dropdown on New Individual Customer page
#    And   User clicks Next button on Individual General Information Page