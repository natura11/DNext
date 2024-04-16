@VFALFT-22390 @fiberPostpaid @regression @activation
Feature: Fiber Activation for Postpaid

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page

  Scenario:As a user, I want complete fiber Activation process successfully  on Customer360 search page
    Then User is on the Customer360 page
    Given User clicks select Search Type field on Customer360 search page
    And   User selects Customer Name option from dropdown on Customer360 search page
    And   User fills in enter Customer name field with valid name as "KUHN GROUP"  on Customer360 search page
    And   User clicks Search Button on Customer360 search page
    And   User selects opened name of searched name on Customer360 search page
    And User clicks the Main Page button on Customer360 search page
    When User should be  General part  under  Main page  button on Customer360 search page
    And User clicks Load Tickets button on Customer360 search page
    And User cliks three dots right of opened block on Customer360 search page
    And User clicks Dnext option from the opened dropdown on Customer360 search page
    And User enters "faveo" as Username, "wa7upRlsIpu_" as password  and clicks the login button on FAVEO login page
    And User clicks the Change Status button on FAVEO page
    And User clicks the resolve option from the opened dropdown FAVEO  page
    And User clicks the Proceed button FAVEO  page
    And User should see "Ticket status changed successfully!!" warning on FAVEO page
    And User turns back to Customer Mangement page on Customer360 search page
    And User switches to Backoffice page
    And User should see the name of "KUHN GROUP"progressed customer on BackOffice page
    And User clicks the name of customer  on BackOffice page
    And User clicks the three dots on opened page  on Backoffice page
    And User clicks the ClaimEdit button on opened segent on BackOffice page
    And User should see the "Corporate Confirmation" text on BackOffice page
    And User clicks the isApprovved dropdown button on BackOffice page
    And User clicks the approved option from dropdown on BackOffice page
    And User clicks the Complate Task button on the right buttom of the on BackOffice page
    Then User should see "Task Completed" pop up message  on BackOffice page
    And User turns back to customer main page on Customer360 search page
    And User clicks the Order button on Customer360 search page
    And User clicks Order status button on Customer360 search page
    Then User should see the Order Status  turned to completed  on Customer360 search page
















