@VFALFT-22443 @vtv @regression @activation
Feature: VTV Activation

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page

  @vtvActivationForPrepaid
  Scenario:As a user, I want complete VTV Activation process successfully  on Customer360 search page
    Then  User is on the Customer360 page
    Given User clicks select Search Type field on Customer360 search page
    And   User selects Customer Name option from dropdown on Customer360 search page
    And   User fills in enter Customer name field with valid name as "OLLIE TROMP AUTOMATION" on Customer360 search page
    And   User clicks Search Button on Customer360 search page
    And   User selects opened name of searched name on Customer360 search page
    And   User clicks the "Account" button on Customer360 search page
    When  User clicks the New Order button for "Prepaid" account
    Then  User is redirected to the  product catalog on DSales page
    When  User selects "TV" category option on DSales Products page
    And   User clicks the search button under product list on DSales Product page
    When  User selects random product on the filtered Product List
#    When  User selects the "Digitalb Premium Plus" product on DSales Product page
    Then  User should see the Product Detail page is opened
    When  User selects random Cash price on Product Detail page
    And   User clicks the TV Infrusructure dropdown on Product Detail page
    And   User selects the "Vtv" as infrastructure on Product Detail page
    And   User selects "Akses Fee per Dekoder Premium" as resource and its price on Product Detail page
    And   User enters CasId on Product Detail page
    And   User adds "Tarife Instalimi" from Purchasable Addons and its price on Product Detail page
    And   User clicks the Add to Cart button on Product Detail page
#    And   User checks the Vtv Number is available for Sale on Product Offering Page
    Then  User should see the  Number is available with success message for Sale on Product Offering Page
    When  User clicks the Shopping Cart icon on DSales Product page
    Then  User should see the Shopping Cart Products number is correct on Shopping Cart Page
    Then  User should see the "Akses Fee per Dekoder Premium" product is added on Shopping Cart Page
    Then  User should see the "Tarife Instalimi" product is added on Shopping Cart Page
    When  User clicks the CHECKOUT button on Shopping Cart Page
    And   User clicks the Collected radio button for "Individual" on Shopping Cart Page
    And   User clicks the Complete Checkout button on Before Checkout Page
    Then  User sees one pop up warning as "Checkout is successfully completed" on Customer360 search page
    When  User clicks the Go Back to Customer360 button on Customer360 search page
    Then  User is on the Customer360 page
    And   User clicks the "Order" button on Customer360 search page
    Then  User should see the "Order Id" of the selected product on Customer360 Order page
    Then  User should see the "Order Status" as "inProgress" on Customer360 Order page
    And   User clicks the "Main Page" button on Customer360 search page
    When  User should be  General part  under  Main page  button on Customer360 search page

    And User clicks Load Tickets button on Customer360 search page
    And User cliks three dots right of opened block on Customer360 search page
    And User clicks Dnext option from the opened dropdown on Customer360 search page
    And User enters "faveo" as Username, "wa7upRlsIpu_" as password  and clicks the login button on FAVEO login page
    And User clicks the Change Status button on FAVEO page
    And User clicks the resolve option from the opened dropdown FAVEO  page
    And User clicks the Proceed button FAVEO  page
    And User should see "Ticket status changed successfully!!" warning on FAVEO page
    And User turns back to Customer Management page on Customer360 search page
    And User compares the AgreementId on Order with AgreementId on Fiscalization Receipts on Customer360 search page
    And User click the detail button on Fiscalization Receipt Page
    Given Get Authorization for API
    When Create an endpoint component
      | Type                 | Value                           | parameters           |
      | endpoint             | getFromVtvForFiscalization      |                      |
      | requestType          | getRequestOfVtvForFiscalization |                      |
      |                      |                                 |                      |
      | fiscalizationBaseURI | fiscalizationBaseURI            | fiscalizationBaseURI |

    When Send a request
    Then Status code is 200
    And   User clicks the "Order" button on Customer360 search page
    Then  User gets the error message if "Order Status" is not "completed"









