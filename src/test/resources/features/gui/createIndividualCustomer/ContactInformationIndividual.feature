@VFALFT-23461 @regression @contactInformationForIndividual
Feature:New Individual Customer-Contact Information

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User clicks Create Individual Customer on Home page
    Given User clicks the Contact Information button for Individual
    Given User is on the Individual Contact Information page

  @continueWithoutAddingContactForIndividualContact
  Scenario: As a user I want to continue without adding any Contact on Contact Information Page for Individual
    Given User is on the Individual Contact Information page
    And   User clicks Next button on Individual Contact Information Page
    Then  User is on the Individual Invoice Account page

  @backToPreviousPageWithoutAddingContactForIndividualContact
  Scenario: As a user I want to go previous page without adding any Contact on Contact Information Page for Individual
    Given User is on the Individual Contact Information page
    And   User clicks Back button on Individual Contact Information Page
    Then  User should see the Individual Address Information Page

  @addLegalCustodianWithExistingPersonForIndividualContact
  Scenario:As a user I want to add random type of Authorization with existing person on Individual Contact Information Page
    Given User should see the Type of Authorization dropdown on Individual Contact Information Page
    And   User clicks Type of Authorization dropdown on Individual Contact Information Page
    Then  User should ensure each options in Type of Authorization dropdown are selectable on Individual Contact Information Page
    And   User selects "Legal Custodian" option in the Authorization dropdown on Individual Contact Information Page

    Then  User should see Identification Number textbox on Individual Contact Information Page
    Then  User should see that background is red for the Identification Number textbox on Individual Contact Information Page
    Then  User should see First Name textbox on Individual Contact Information Page
    Then  User should see that background is red for the First Name textbox on Individual Contact Information Page
    Then  User should see Last Name textbox on Individual Contact Information Page
    Then  User should see that background is red for the Last Name textbox on Individual Contact Information Page
    Then  User should see Birth Date input on Individual Contact Information Page
    Then  User should see that background is red for the Birth Date input on Individual Contact Information Page
    Then  User should see Gender dropdown on Individual Contact Information Page
    Then  User should see that background is red for the Gender dropdown on Individual Contact Information Page
    Then  User should see that Citizenship dropdown on Individual Contact Information Page
    Then  User should see that Citizenship dropdown is disabled on Individual Contact Information Page
    Then  User should see Document Type dropdown on Individual Contact Information Page
    Then  User should see Add button on Individual Contact Information Page
    Then  User should see the document "You have to add customers ATTORNEY LETTER document!" warning message on Individual Contact Information Page

    When  User clicks Identification Number textbox on Contact Information Page
    And   User enters "M12345678C" for the Identification Number textbox on Individual Contact Information Page
    And   User clicks search button on Individual Contact Information Page
    Then  User should see the person is shown in the list on Individual Contact Information Page
    When  User clicks the displayed Customer on Individual Contact Information Page
    Then  User should see some ID related information were autofilled with person data on Individual Contact Information Page
      | Identification Number | M12345678C |
      | First Name            | MECNUN     |
      | Last Name             | CINAR      |
      | Birth Date            | 1/10/2005  |
      | Gender                | MALE       |
      | Citizenship           | ALBANIAN   |

    Then  User should see that Citizenship dropdown is enabled on Individual Contact Information Page
    When  User should see the document "You have to add customers ATTORNEY LETTER document!" warning message on Individual Contact Information Page
    And   User adds a valid "dummy.pdf" document for Letter of Attorney on Individual Contact Information Page
    Then  User should see the name of "dummy.pdf" added pdf document on Individual Contact Information Page
    When  User clicks Next button on Individual Contact Information Page
    Then  User is on the Individual Invoice Account page


  @addDifferentTypeOfAuthorizationForIndividualContact
  Scenario Outline: As a user I want to add different type of Authorizations on Individual Contact Information Page
    Given User should see the Type of Authorization dropdown on Individual Contact Information Page
    And   User clicks Type of Authorization dropdown on Individual Contact Information Page
    Then  User should ensure each options in Type of Authorization dropdown are selectable on Individual Contact Information Page
    And   User selects "<Authorization Type>" option in the Authorization dropdown on Individual Contact Information Page

    When  User clicks Identification Number textbox on Contact Information Page
    And   User enters "<Identification Numbers>" for the Identification Number textbox on Individual Contact Information Page
    And   User clicks search button on Individual Contact Information Page
    Then  User should see the entered person is new party on Individual Contact Information Page
    Then  User should see that background is not red for the Identification Number textbox on Individual Contact Information Page
    When  User clicks First Name textbox on Individual Contact Information Page
    And   User enters "<First Name>" for the First Name textbox on Individual Contact Information Page
    Then  User should see that background is not red for the First Name textbox on Individual Contact Information Page
    When  User clicks Last Name textbox on Individual Contact Information Page
    And   User enters "<Last Name>" for the Last Name textbox on Individual Contact Information Page
    Then  User should see that background is not red for the Last Name textbox on Individual Contact Information Page
    When  User clicks Birth Date input on Individual Contact Information Page
    And   User enters "<Birth Date>" for the Birth Date input on Individual Contact Information Page
    Then  User should see that background is not red for the Birth Date input on Individual Contact Information Page
    When  User clicks Gender dropdown on Individual Contact Information Page
    And   User selects "<Gender>" for the Gender dropdown on Individual Contact Information Page
    Then  User should see that background is red for the Citizenship dropdown on Individual Contact Information Page
    Then  User should see that Citizenship dropdown is enabled on Individual Contact Information Page
    When  User clicks Citizenship dropdown on Individual Contact Information Page
    And   User selects "<Citizenship>" for the Citizenship dropdown on Individual Contact Information Page

    When  User should see Document Type dropdown on Individual Contact Information Page
    And   User should see Add button on Individual Contact Information Page
    And   User should see the document "You have to add customers ATTORNEY LETTER document!" warning message on Individual Contact Information Page
    And   User adds a valid "dummy.pdf" document for Letter of Attorney on Individual Contact Information Page
    Then  User should see the name of "dummy.pdf" added pdf document on Individual Contact Information Page
    When  User clicks Next button on Individual Contact Information Page
    Then  User is on the Individual Invoice Account page

    Examples:
      | Authorization Type | Identification Numbers | First Name | Last Name | Birth Date | Gender | Citizenship |
      | Legal Custodian    | H34296055D             | Tauno      | Aalto     | 14/03/2000 | MALE   | ALBANIAN    |
      | Authorized Person  | ABC7124458CBA          | Virve      | Turunen   | 14/03/2000 | FEMALE | FINNISH     |

  @addMultipleTypeOfAuthorizationForIndividualCustomer
  Scenario: As a user I want to add Multiple Type of Authorization on Individual Contact Information Page
    Given User should see the Type of Authorization dropdown on Individual Contact Information Page
    And   User clicks Type of Authorization dropdown on Individual Contact Information Page
    Then  User should ensure each options in Type of Authorization dropdown are selectable on Individual Contact Information Page
    And   User selects "Legal Custodian" option in the Authorization dropdown on Individual Contact Information Page
    When  User clicks Identification Number textbox on Contact Information Page
    And   User enters "M12345678C" for the Identification Number textbox on Individual Contact Information Page
    And   User clicks search button on Individual Contact Information Page
    Then  User should see the person is shown in the list on Individual Contact Information Page
    When  User clicks the displayed Customer on Individual Contact Information Page
    Then  User should see some ID related information were autofilled with person data on Individual Contact Information Page
      | Identification Number | M12345678C |
      | First Name            | MECNUN     |
      | Last Name             | CINAR      |
      | Birth Date            | 1/10/2005  |
      | Gender                | MALE       |
      | Citizenship           | ALBANIAN   |

    Then  User should see that Citizenship dropdown is enabled on Individual Contact Information Page
    When  User should see the document "You have to add customers ATTORNEY LETTER document!" warning message on Individual Contact Information Page
    And   User adds a valid "dummy.pdf" document for Letter of Attorney on Individual Contact Information Page
    Then  User should see the name of "dummy.pdf" added pdf document on Individual Contact Information Page

    And   User clicks Add+ button to add Additional Type of Authorization on Individual Contact Information Page
    And   User clicks additional Type of Authorization dropdown on Individual Contact Information Page
    Then  User should ensure each options in additional Type of Authorization dropdown are selectable on Individual Contact Information Page
    And   User selects "Authorized Person" option in the Authorization dropdown on Individual Contact Information Page
    When  User clicks additional Identification Number textbox on Contact Information Page
    And   User enters "H34296055D" for the additional Identification Number textbox on Individual Contact Information Page
    And   User clicks search button on Individual Contact Information Page
    Then  User should see the additional entered person is new party on Individual Contact Information Page
    When  User clicks additional First Name textbox on Individual Contact Information Page
    And   User enters "Tauno" for the additional First Name textbox on Individual Contact Information Page
    When  User clicks additional Last Name textbox on Individual Contact Information Page
    And   User enters "Aalto" for the additional Last Name textbox on Individual Contact Information Page
    When  User clicks additional Birth Date input on Individual Contact Information Page
    And   User enters "14/03/2000" for the additional Birth Date input on Individual Contact Information Page
    When  User clicks additional Gender dropdown on Individual Contact Information Page
    And   User selects "MALE" for the Gender dropdown on Individual Contact Information Page
    Then  User should see that additional Citizenship dropdown is enabled on Individual Contact Information Page
    When  User clicks additional Citizenship dropdown on Individual Contact Information Page
    And   User selects "ALBANIAN" for the Citizenship dropdown on Individual Contact Information Page
    #And   User adds a valid "sample2.pdf" document for additional Letter of Attorney on Individual Contact Information Page
    #Then  User should see the name of "sample2.pdf" added additional pdf document on Individual Contact Information Page

    When  User clicks Next button on Individual Contact Information Page
    Then  User is on the Individual Invoice Account page

  @addDifferentTypeOfContactsForIndividualContact
  Scenario Outline: As a user I want to add different type of Contacts on Individual Contact Information Page
    Given User should see the Type of Contact dropdown on Individual Contact Information Page
    And   User clicks Type of Contact dropdown on Individual Contact Information Page
    Then  User should ensure each options in Type of Contact dropdown are selectable on Individual  Contact Information Page
    And   User selects "<Contact Type>" option in the Contact dropdown on Individual Contact Information Page
    Then  User should see Country Code dropdown on Individual Contact Information Page
    Then  User should see Mobile Phone Number textbox on Individual Contact Information Page
    Then  User should see Email textbox on Individual Contact Information Page
    And   User clicks Country Code dropdown Individual Contact Information Page
    When  User selects "+355" option in the Country Code dropdown on Individual Contact Information page
    And   User clicks mobile phone number field on Individual Contact Information page
    And   User enters valid "628641593" into the phone number field on Individual Contact Information page
    Then  User should not see the warning background on phone field on Individual Contact Information page
    When  User clicks Email textbox on Individual Contact Information Page
    And   User enters valid "abc123@gmail.com" in to the email field on Individual Contact Information Page
    Then  User should see "." and "@" and "abc123@gmail.com" inside of email structure on Individual Contact Information Page
    Then  User should see that background is not red for the email field on Individual Contact Information Page
    And   User clicks Next button on Individual Contact Information Page
    Then  User is on the Individual Invoice Account page

    Examples:
      | Contact Type        |
      | Contact Person      |
      | Payment Responsible |
      | Technical Contact   |


  @addMultipleContactForIndividualCustomer
  Scenario: As a user I want to add Multiple Contacts on Individual Contact Information Page
    Given User should see the Type of Contact dropdown on Individual Contact Information Page
    And   User clicks Type of Contact dropdown on Individual Contact Information Page
    Then  User should ensure each options in Type of Contact dropdown are selectable on Individual  Contact Information Page
    And   User selects "Contact Person" option in the Contact dropdown on Individual Contact Information Page
    Then  User should see Country Code dropdown on Individual Contact Information Page
    Then  User should see Mobile Phone Number textbox on Individual Contact Information Page
    Then  User should see Email textbox on Individual Contact Information Page
    And   User clicks Country Code dropdown Individual Contact Information Page
    When  User selects "+355" option in the Country Code dropdown on Individual Contact Information page
    And   User clicks mobile phone number field on Individual Contact Information page
    And   User enters valid "628641593" into the phone number field on Individual Contact Information page
    Then  User should not see the warning background on phone field on Individual Contact Information page
    When  User clicks Email textbox on Individual Contact Information Page
    And   User enters valid "abc123@gmail.com" in to the email field on Individual Contact Information Page
    Then  User should see "." and "@" and "abc123@gmail.com" inside of email structure on Individual Contact Information Page
    Then  User should see that background is not red for the email field on Individual Contact Information Page
    And   User clicks Add+ button to add Additional Contact on Individual Contact Information Page
    Then  User should see the new Contact Type section
    Given User should see the additional Type of Contact dropdown on Contact Information Page
    And   User clicks additional Type of Contact dropdown on Contact Information Page
    Then  User should ensure each options in additional Type of Contact dropdown are selectable on Contact Information Page
    And   User selects "Contact Person" option in the Contact dropdown on Individual Contact Information Page
    Then  User should see the same contact type error message on Contact Information Page
    And   User clicks additional Type of Contact dropdown on Contact Information Page
    And   User selects "Payment Responsible" option in the Contact dropdown on Individual Contact Information Page
    Then  User should not see the same contact type error message on Contact Information Page
    Then  User should see additional Country Code dropdown on Contact Information Page
    Then  User should see additional Mobile Phone Number textbox on Contact Information Page
    Then  User should see additional Email textbox on Contact Information Page
    And   User clicks additional Country Code dropdown Contact Information Page
    When  User selects "+355" option in the Country Code dropdown on Individual Contact Information page
    And   User clicks additional mobile phone number field on Contact Information page
    And   User enters valid "628641594" into the additional phone number field on Contact Information page
    Then  User should not see the additional warning background on phone field on Contact Information page
    When  User clicks additional Email textbox on Contact Information Page
    And   User enters valid "abc1234@gmail.com" in to the additional email field on Contact Information Page
    Then  User should see "." and "@" and "abc123@gmail.com" inside of email structure on Individual Contact Information Page
    Then  User should see that additional background is not red for the email field on Contact Information Page
    And   User clicks Next button on Individual Contact Information Page
    Then  User is on the Individual Invoice Account page