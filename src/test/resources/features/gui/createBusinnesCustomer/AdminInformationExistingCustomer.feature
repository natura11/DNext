@VFALFT-22205 @regression @adminInfoExistCustomer
Feature: Existing Customer-Admin Information-Existing Customer

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User opens Create Business Customer page on Home page
    Given User clicks the Admin Information button
    Given User is on the Admin Information  page
    And   User clicks on the Identification Number field on Admin Information Page
    When  User enters one existing "M12345678C" ID number into the Identification Number field on Admin Information page

  @smoke @existingIDusageForBusinessAdmin
  Scenario: As a user,I want to enter existing ID number into the Identification Number field on Admin Information Page
    Then  User should see "Please click search icon!" warning under the Identification Number field on Admin Information Page
    And   User clicks the search icon in Identification Number field on Admin Information page
    And   User sees some ID related information were fetched on Admin Information Page
      | Identification Number | M12345678C |
      | First Name            | MECNUN     |
      | Last Name             | CINAR      |
      | Gender                | MALE       |
      | Birth Date            | 1/10/2005  |
      | Citizenship           | ALBANIAN   |
      | Country Of Birth      | ALBANIA    |
      | Place Of Birth        | BERAT      |
    Then User should see the "Phone number must be like 6XXXXXXXX !"warning message  under number field on Admin Information Page

  @smoke @addingEmailPhoneNumberForBusinessAdmin
  Scenario: As a user ,I want to add email and mobile phone number into the fields on Admin Information Page
    Given User clicks the search icon in Identification Number field on Admin Information page
    And   User enters "alibaba11@gmail.com" on email field  and "624687659" to the phone number field


  @smoke @addingFileForBusinessAdmin
  Scenario:As a user I want to add only one file which could be pdf and image format with smaller than 5MB on Admin Information page
    Given User clicks the search icon in Identification Number field on Admin Information page
    Then  User should see this "You have to add customers ID document!" warning message near to add button on Admin Information Page
    And   User tries to add "example.xlsx" of which format is out of image or pdf that connat be uploded on Admin Information Page
    And   User adds "bigger5MB.pdf"  which are image or pdf  which is bigger than five MB and should see "File size can not be bigger than 5 MB!" warning on Admin Information Page
    And   User add "smaller5MB.pdf" document file on Admin Information Page
    Then  User should see the name of "smaller5MB.pdf" added jpg document on the screen on Admin Information Page
    And   User deletes already added valid pdf documentation Admin Information Page
    And   User add "document.jpg" document file on Admin Information Page
    Then  User should see the name of "document.jpg" added jpg document on the screen on Admin Information Page

  @smoke @nextToContactPageForBusinessAdmin
  Scenario: As a user I want to click next button and pass to Contact Information Page
    Given User clicks the search icon in Identification Number field on Admin Information page
    And   User add "smaller5MB.pdf" document file on Admin Information Page
    Then  User should see the name of "smaller5MB.pdf" added jpg document on the screen on Admin Information Page
    And   User enters "alibaba11@gmail.com" on email field  and "624687659" to the phone number field
    And   User clicks next Button on Admin Information Page
    Then  User is on the Contact Information page



