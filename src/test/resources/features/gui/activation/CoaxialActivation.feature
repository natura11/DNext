@VFALFT-22309 @coaxial @regression
Feature: Coaxial Activation

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Then User is on the Customer360 page
    Given User clicks select Search Type field on Customer360 search page
    And   User selects Customer Name option from dropdown on Customer360 search page
    And   User fills in enter Customer name field with valid name as "BORER INC AUTOMATION" on Customer360 search page
    And   User clicks Search Button on Customer360 search page
    And   User selects opened name of searched name on Customer360 search page
    And   User clicks the "Account" button on Customer360 search page

  @coaxialActivationForPostpaid @activation
  Scenario:As a user, I want complete Coaxial Activation for Postpaid process successfully  on Customer360 search page
    When  User clicks the New Order button for "Postpaid" account
    Then  User is redirected to the  product catalog on DSales page
    And   User clicks the "Recurring Products" on on DSales Products page
    When  User selects "INTERNET" category option on DSales Products page
    And   User clicks the search button under product list on DSales Product page
    When  User selects random product on the filtered Product List
#    When  User selects the "Digitalb Premium Plus" product on DSales Product page
    Then  User should see the Product Detail page is opened
    When  User selects random Cash price on Product Detail page
    And   User clicks the Internet Infrusructure dropdown on Product Detail page
    And   User selects the "COAXIAL" as infrastructure on Product Detail page
    And   User selects "Basic Enterprise Modem" as resource and its price on Product Detail page
    When  User enters random Coaxial Mac number to Smart Card field on Product Offering Page
    And   User clicks the Add to Cart button on Product Detail page
    And   User checks the  Coaxial Mac Number is available for Sale on Product Offering Page
    Then  User should see the  Number is available with success message for Sale on Product Offering Page
    When  User clicks the Shopping Cart icon on DSales Product page
    Then  User should see the Shopping Cart Products number is correct on Shopping Cart Page
    Then  User should see the "Basic Enterprise Modem" product is added on Shopping Cart Page
    When  User clicks the CHECKOUT button on Shopping Cart Page
    And   User clicks the save button after checkout action on Shopping Cart Page
    And   User clicks the activation form on top of the opened screen on Before Checkout Popup
    Then  User should see the Activation Form open in a new window on Before Checkout Popup
    When  User go back to Shopping Cart Page on Before Checkout Popup
    And   User clicks the Complete Checkout button on Before Checkout Page
    Then  User sees one pop up warning as "Checkout is successfully completed" on Customer360 search page

    When User clicks the Go Back to Customer360 button on Customer360 search page
    Then User is on the Customer360 page
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

    And User switches to Backoffice page
    And User should see the name of "BORER INC AUTOMATION" progressed customer on BackOffice page
    And User clicks the name of "BORER INC AUTOMATION" customer on BackOffice page
    And User clicks the three dots on opened page  on Backoffice page
    And User clicks the ClaimEdit button on opened segment on BackOffice page
    And User should see the "Corporate Confirmation" text on BackOffice page
    And User clicks the isApprovved dropdown button on BackOffice page
    And User clicks the "APPROVED" option from dropdown on BackOffice page
    And User clicks the Complete Task button on the right button of the on BackOffice page
    Then User should see "Task Completed" pop up message  on BackOffice page
    And User turns back to Customer Management after task completion on BackOffice page
    And   User clicks the "Order" button on Customer360 search page
    Then  User gets the error message if "Order Status" is not "completed"
    And User clicks the first Order Id within Order
    Given Get Authorization for API
    When Create an endpoint component
      | Type          | Value                            | parameters    |
      | endpoint      | getOrderDetailForCoaxialPostpaid |               |
      | requestType   | getRequestOfCoaxialBrmOrder      |               |
      |               |                                  |               |
      | ApiBrmBaseURI | apiBrmBaseURI                    | apiBrmBaseURI |
    When Send a request
    Then Status code is 200


  @coaxialActivationForPrepaid @activation
  Scenario:As a user, I want complete COAXIAL Activation for Prepaid process successfully  on Customer360 search page
    When  User clicks the New Order button for "Prepaid" account
    Then  User is redirected to the  product catalog on DSales page
    When  User selects "INTERNET" category option on DSales Products page
    And   User clicks the search button under product list on DSales Product page
    When  User selects random product on the filtered Product List
#    When  User selects the "Digitalb Premium Plus" product on DSales Product page
    Then  User should see the Product Detail page is opened
    When  User selects random Cash price on Product Detail page
    And   User clicks the Internet Infrusructure dropdown on Product Detail page
    And   User selects the "COAXIAL" as infrastructure on Product Detail page
    And   User selects "Basic Enterprise Modem" as resource and its price on Product Detail page
    When  User enters random Coaxial Mac number to Smart Card field on Product Offering Page
    And   User clicks the Add to Cart button on Product Detail page
    And   User checks the  Coaxial Mac Number is available for Sale on Product Offering Page
    Then  User should see the  Number is available with success message for Sale on Product Offering Page
    When  User clicks the Shopping Cart icon on DSales Product page
    Then  User should see the Shopping Cart Products number is correct on Shopping Cart Page
    Then  User should see the "Basic Enterprise Modem" product is added on Shopping Cart Page
    When  User clicks the CHECKOUT button on Shopping Cart Page
    And   User clicks the save button after checkout action on Shopping Cart Page
    And   User clicks the Collected radio button for "Business" on Shopping Cart Page
    And   User clicks the activation form on top of the opened screen on Before Checkout Popup
    Then  User should see the Activation Form open in a new window on Before Checkout Popup
    When  User go back to Shopping Cart Page on Before Checkout Popup
    And   User clicks the Complete Checkout button on Before Checkout Page
    Then  User sees one pop up warning as "Checkout is successfully completed" on Customer360 search page

    And User clicks the create receipt button

    When User clicks the Go Back to Customer360 button on Customer360 search page
    Then User is on the Customer360 page
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
      | Type                 | Value                                      | parameters           |
      | endpoint             | getCoaxialPrepaid_ForFiscalization         |                      |
      | requestType          | getRequestOfCoaxialPrepaidForFiscalization |                      |
      |                      |                                            |                      |
      | fiscalizationBaseURI | fiscalizationBaseURI                       | fiscalizationBaseURI |

    When Send a request
    Then Status code is 200
    And   User clicks the "Order" button on Customer360 search page
    Then  User gets the error message if "Order Status" is not "completed"

















