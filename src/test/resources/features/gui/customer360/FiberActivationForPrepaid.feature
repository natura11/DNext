@VFALFT-22389 @fiber @regression
Feature: Fiber Activation for Prepaid

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
    When User clicks the Account tab on Customer360 search page
    When User clicks the New Order for prepaid rating type on Customer360 search page
    Then User is redirected to the  product catalog on Customer360 search page
    When User selects Internet option from products on Customer360 search page
    And  User clicks the search button under product list on Customer360 search page
    When User selects the Vodafone Gigafibra 200 Mbps on Customer360 search page
    Then User is directed to the Vodafone GigaFibra 200 Mbps page for details of equipments on Customer360 search page
    When User selects cash methods as ALL12600 6Month for Vodafone Gigafibra 100 Mbpson Customer360 search page
    And User clicks the Infrusructure dropdown button  Customer360 search page
    And User selects the FIBER as Infrustructure on Customer360 search page
    And User selects Basic Enterprise Modem on Customer360 search page
    And User selects ALL0 6Month  cash method from Akses Fee per Modem Basic on Customer360 search page
    And User enters PPPoEUser and ONTSerialNumber  into the PPPoEUser and ONTSerialNumber field on Customer360 search page
#    Then User should see warning as "Shopping cart created successfully!"on Customer360 search page
    When User clicks the Shopping Cart icon on Customer360 search page
    Then User sees the name of "Basic Enterprise Modem" which was selected product on Fiber is in the Shopping Cart on Customer360 search page
    When User clicks the CHECKOUT button on Customer360 search page
    And User clicks the save button after checkout action on Customer360 search page
    And User clicks the activation form on top of the opened screen on Customer360 search page
    And User clicks the Collected radio button on Customer360 search page
    And User clicks the COMPLATE CHECKOUT button on Customer360 search page
    Then user sees one pop up warning as "Checkout is successfully completed" on Customer360 search page
    When User clicks the Go Back to Customer360 button on Customer360 search page
    Then User is on the Customer360 page
    And User clicks the Order button on Customer360 search page
    And User sees the Order id of the selected product on Customer360 search page
    And User can control the Order Status of the selected product on Customer360 search page
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
    And User clicks the Order button on Customer360 search page
    Then User should see the Order Status OF Fiber Activation turned to completed  on Customer360 search page
    And User compares the AgreementId on Order with AgreementId on Fiscalization Receipts on Customer360 search page
   # When User get the Agreement Id from Order part on Customer360 search page
#    And User clicks the Fiscalization Receipt on Customer360 search page
#    And User get the Agreement Id from Fiscalization Receipts part on Customer360 search page
#    When User should ensure that both Agreement Id's of Order part and Fiscalization Receipts part are equal








