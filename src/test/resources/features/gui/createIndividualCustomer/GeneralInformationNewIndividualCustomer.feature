@VFALFT-18396 @regression @generalInformationForIndividualCustomer
Feature:New Individual Customer -General Information

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User clicks Create Individual Customer on Home page
    Given I click General Information on new business customer page

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
    And    User enters "123BILGE" as middle name into the middle name field   on New Individual Customer page
    Then   User should see that the entered  numbers  are not seen on middle name field on New Individual Customer page
    And   User deletes the entered middle name as "123BILGE"  on New Individual Customer page
    And    User enters "*.,BILGE(/" as middle name into the middle name field with characters  on New Individual Customer page
    Then   User should see that background is red of middle name  picture on New Individual Customer page
    And   User deletes the entered middle name with characters "*.,BILGE/)"  on New Individual Customer page
    Given  User wants to enter " BILGE" as middle name with one space at the beginning on New Individual Customer page
    Then   User should see the left space at the beginning of middle name is eliminated on New Individual Customer page
