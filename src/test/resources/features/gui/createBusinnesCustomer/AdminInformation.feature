VFALFT-22205
Feature: Existing Customer-Admin Information


  Scenario: As a user,I want to check information of any customer by using an existing ID number
    Given User is on the "Admin Information"  page
    When User enters one existing "M12345678C" ID number into the Identification Number field on Admin Information page
    And User clicks the search icon in Identification Number field on Admin Information page
    And User sees some ID related information were fetched
    And User was not given the "Email" and "Mobile Phone Number"


