@VFALFT-22205 @regression @adminInfo
Feature: Existing Customer-Admin Information-Existing Customer

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User opens Create Business Customer page on Home page
    Given User clicks the Admin Information button
    Given User is on the Admin Information  page
    And   User clicks on the Identification Number field
    When  User enters one existing "M12345678C" ID number into the Identification Number field on Admin Information page

  @smoke @existingIDusage
  Scenario: As a user,I want to enter existing ID number into the Identification Number field
    Then  User should see "Please click search icon!" warning under the Identification Number field
    And   User clicks the search icon in Identification Number field on Admin Information page
    And User sees some ID related information were fetched
      | Identification Number | M12345678C |
      | First Name            | MECNUN     |
      | Last Name             | CINAR      |
      | Gender                | MALE       |
      | Birth Date            | 1/10/2005  |
      | Citizenship           | ALBANIAN   |
      | Country Of Birth      | ALBANIA    |
      | Place Of Birth        | BERAT      |
      | Email                 |            |
      | Mobile Phone Number   |            |
    Then User should see the "Phone number must be like 6XXXXXXXX !"warning message  under number field

#  @addingFile
#  Scenario:As a user I want to add only one file which could be pdf and image format with smaller than 5MB
#    Given User should see this " You have to add customers ID document!" warning message near to add button on Admin Information Page
#    Given User clicks the "Add" button on Admin Information Page
#    And   User adds a document of which format is image on Admin Information Page
#    And   User should see the name of added image document on the screenon Admin Information Page
#    And   User deletes added image documenton Admin Information Page
#    Given User clicks the "Add" button on Admin Information Page
#    And   User adds a document of which format is pdf on Admin Information Page
#    And   User should see the name of added pdf document on the screen on Admin Information Page
#    And   User clicks next Button on Admin Information Page
#    Then  User should be on the Contact Information Page



