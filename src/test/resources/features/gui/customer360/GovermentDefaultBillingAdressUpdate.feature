@VFALFT-22422 @regression @governmentDefaultBillingAddressUpdate
Feature: Government Default Billing Address Updating
  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page

  @accessId
  Scenario: As a user I want to access default billing address by using customer id
    Given User clicks select search Type field on Customer360 search page
    And   User selects Customer Id options on Customer360 search page
    And   User fills in enter Customer Id field with valid "F52115451" id on Customer360 search page
    And   User clicks Search Button on Customer360 search page
    And   User selects opened name of id on Customer360 search page

  @accessAddress
  Scenario:As a user I want to access Edit Button to update information
    Given User clicks select search Type field on Customer360 search page
    And   User selects Customer Id options on Customer360 search page
    And   User fills in enter Customer Id field with valid "F52115451" id on Customer360 search page
    And   User clicks Search Button on Customer360 search page
    And   User selects opened name of id on Customer360 search page
    And   User should  clicks Address button on Customer360 search page
    And   User clicks on the three dots near the DEFAULT_BILLING_ADDRESS on Customer360 search page
    And   User clicks Edit Button on DEFAULT_BILLING_ADDRESS Customer360 search page

  @updateDefaultBillingAddress
  Scenario Outline:As a user I want to update Default Billing Address with using CustomerId
    Given User clicks select search Type field on Customer360 search page
    And   User selects Customer Id options on Customer360 search page
    And   User fills in enter Customer Id field with valid "F52115451" id on Customer360 search page
    And   User clicks Search Button on Customer360 search page
    And   User selects opened name of id on Customer360 search page
    And   User should  clicks Address button on Customer360 search page
    And   User clicks on the three dots near the DEFAULT_BILLING_ADDRESS on Customer360 search page
    And   User clicks Edit Button on DEFAULT_BILLING_ADDRESS Customer360 search page
    And   User rewrite Address Line1 as "ISTANBUL"  on Customer360 search page
    And   User rewrite Address Line2 as "KARTAL-54" on Customer360 search page
    And   User rewrite Post Code as "0005" on Customer360 search page
    And   User clicks Save Button on Customer360 search page
    Then  User should see this  "Address updated successfully!" pop up message top of screen on Customer360 search page

    Given Get Authorization for API
    When Create an endpoint component
      | Type        | Value                                            | parameters        |
      | endpoint    | /api/si-bpmn/camunda/start/BrmCustomerInfoUpdate |                   |
      | requestType | POST                                             |                   |
      | plainParam  | body                                             | <body>            |
      | type1       | apiCamundaBaseURI                                | apiCamundaBaseURI |


    When Send a request
    Then Status code is 200
    When Create an endpoint component
      | Type          | Value           | parameters    |
      | endpoint      | getFromPost     |               |
      | requestType   | GET_RequestBill |               |
      |               |                 |               |
      | ApiBrmBaseURI | apiBrmBaseURI   | apiBrmBaseURI |

    When Send a request
    Then Status code is 200
    Examples:
      | body                        |
      | {"customerId": "F52115451"} |
