#VFALFT-22205
#Feature: Existing Customer-Admin Information
#
#
#  Scenario: As a user,I want to enter existing ID number into the Identification Number field
#    Given User is on the "Admin Information"  page
#    And User cliks on the Identifcation Number field
#    When User enters one existing "M12345678C" ID number into the Identification Number field on Admin Information page
#    Then User should see "Please click search icon!" warning under the Identification Number field
#    And User clicks the search icon in Identification Number field on Admin Information page
#
#    And User sees some ID related information were fetched
#      | Identification Number | M12345678C |
#      | First Name            | MECNUN     |
#      | Last Name             | CINAR      |
#      | Gender                | MALE       |
#      | Birth Date            | 1/10/2005  |
#      | Citizenship           | ALBANIAN   |
#      | Country Of Birth      | ALBANIA    |
#      | Place Of Birth        | BERAT      |
#      |                       |            |
#    And User was not given the "Email" and "Mobile Phone Number"
#    And User clicks the "add" button
#    And  User selects any pdf "file" of which size less than 5mb
#    And User should appload the admin document
#    And User clicks the Next button on Admin Information page
#    Then User is on the "Contact Information" page
#
#
