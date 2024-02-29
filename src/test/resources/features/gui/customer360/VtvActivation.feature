@regression
Feature: TVT Activation

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page

  Scenario:As a user, I want to access Customer360 Search page on Customer360 search page
    Then User is on the Customer360 page

  Scenario:As a user, I want to search customer  by using  Search button on Customer360 search page
    Given User clicks select Search Type field on Customer360 search page
    And   User selects Customer Name option from dropdown on Customer360 search page
    And   User fills in enter Customer name field with valid name as "KEMAL SUNAL"  on Customer360 search page
    And   User clicks Search Button on Customer360 search page

  Scenario:As a user, I want to select customer  after clicking  Search button on Customer360 search page
    Given User clicks select Search Type field on Customer360 search page
    And   User selects Customer Name option from dropdown on Customer360 search page
    And   User fills in enter Customer name field with valid name as "KEMAL SUNAL"  on Customer360 search page
    And   User clicks Search Button on Customer360 search page
    And   User selects opened name of searched name on Customer360 search page

  Scenario:As a user, I want to reach Account tab on Customer360 search page
    Given User clicks select Search Type field on Customer360 search page
    And   User selects Customer Name option from dropdown on Customer360 search page
    And   User fills in enter Customer name field with valid name as "KEMAL SUNAL"  on Customer360 search page
    And   User clicks Search Button on Customer360 search page
    And   User selects opened name of searched name on Customer360 search page
    When User clicks the Account tab on Customer360 search page


  Scenario:As a user, I want to select one new order from Invoice Accounts on Customer360 search page
    Given User clicks select Search Type field on Customer360 search page
    And   User selects Customer Name option from dropdown on Customer360 search page
    And   User fills in enter Customer name field with valid name as "KEMAL SUNAL"  on Customer360 search page
    And   User clicks Search Button on Customer360 search page
    And   User selects opened name of searched name on Customer360 search page
    When User clicks the Account tab on Customer360 search page
    When User clicks the New Order for prepaid rating type on Customer360 search page
    Then User is redirected to the  product catalog on Customer360 search page

  Scenario:As a user, I want to chose product from product list on Customer360 search page
    Given User clicks select Search Type field on Customer360 search page
    And   User selects Customer Name option from dropdown on Customer360 search page
    And   User fills in enter Customer name field with valid name as "KEMAL SUNAL"  on Customer360 search page
    And   User clicks Search Button on Customer360 search page
    And   User selects opened name of searched name on Customer360 search page
    When User clicks the Account tab on Customer360 search page
    When User clicks the New Order for prepaid rating type on Customer360 search page
    Then User is redirected to the  product catalog on Customer360 search page
    When User selects TV option from products on Customer360 search page
    And User clicks the search button under product list on Customer360 search page

  Scenario:As a user, I want to chose product from product list on Customer360 search page
    Given User clicks select Search Type field on Customer360 search page
    And   User selects Customer Name option from dropdown on Customer360 search page
    And   User fills in enter Customer name field with valid name as "KEMAL SUNAL"  on Customer360 search page
    And   User clicks Search Button on Customer360 search page
    And   User selects opened name of searched name on Customer360 search page
    When User clicks the Account tab on Customer360 search page
    When User clicks the New Order for prepaid rating type on Customer360 search page
    Then User is redirected to the  product catalog on Customer360 search page
    When User selects TV option from products on Customer360 search page
    And User clicks the search button under product list on Customer360 search page
    When User selects the Digitalb Premium Plus on Customer360 search page
    Then User is directed to the Digitalb Premium Plus page for details of equipments on Customer360 search page

  Scenario:As a user, I want to select some features as  part of equipments on Customer360 search page
    Given User clicks select Search Type field on Customer360 search page
    And   User selects Customer Name option from dropdown on Customer360 search page
    And   User fills in enter Customer name field with valid name as "KEMAL SUNAL"  on Customer360 search page
    And   User clicks Search Button on Customer360 search page
    And   User selects opened name of searched name on Customer360 search page
    When User clicks the Account tab on Customer360 search page
    When User clicks the New Order for prepaid rating type on Customer360 search page
    Then User is redirected to the  product catalog on Customer360 search page
    When User selects TV option from products on Customer360 search page
    And User clicks the search button under product list on Customer360 search page
    When User selects the Digitalb Premium Plus on Customer360 search page
    Then User is directed to the Digitalb Premium Plus page for details of equipments on Customer360 search page
    When User selects cash methods as ALL7900 3Month on Customer360 search page
    And user clicks the TVInfrusructure dropdown button  Customer360 search page
    And User selects the Vtv as TVInfrustructure on Customer360 search page
    And User selects Akses Fee per Dekoder Premium on Customer360 search page
    And User selects the ALL0 3Month option as cash option on Customer360 search page
    And User enters "135759852456" as CasId on Customer360 search page
    And User selects Tarife Instalimi from Purchasable Addons part on Customer360 search page
    And User selects ALL4000 3Month option as cash  method on Customer360 search page
    And User clicks the ADD to Cart button on Customer360 search page

  Scenario:As a user, I want to access the Shopping Cart on Customer360 search page
    Given User clicks select Search Type field on Customer360 search page
    And   User selects Customer Name option from dropdown on Customer360 search page
    And   User fills in enter Customer name field with valid name as "KEMAL SUNAL"  on Customer360 search page
    And   User clicks Search Button on Customer360 search page
    And   User selects opened name of searched name on Customer360 search page
    When User clicks the Account tab on Customer360 search page
    When User clicks the New Order for prepaid rating type on Customer360 search page
    Then User is redirected to the  product catalog on Customer360 search page
    When User selects TV option from products on Customer360 search page
    And User clicks the search button under product list on Customer360 search page
    When User selects the Digitalb Premium Plus on Customer360 search page
    Then User is directed to the Digitalb Premium Plus page for details of equipments on Customer360 search page
    When User selects cash methods as ALL7900 3Month on Customer360 search page
    And user clicks the TVInfrusructure dropdown button  Customer360 search page
    And User selects the Vtv as TVInfrustructure on Customer360 search page
    And User selects Akses Fee per Dekoder Premium on Customer360 search page
    And User selects the ALL0 3Month option as cash option on Customer360 search page
    And User enters "135759852456" as CasId on Customer360 search page
    And User selects Tarife Instalimi from Purchasable Addons part on Customer360 search page
    And User selects ALL4000 3Month option as cash  method on Customer360 search page
    And User clicks the ADD to Cart button on Customer360 search page
    Then User should see warning as "Shopping cart created successfully!"on Customer360 search page
    When User clicks the Shopping Cart icon on Customer360 search page
    Then User sees the selected product is in the Shopping Cart on Customer360 search page

  Scenario:As a user,I want to maintain the process by clicking CHECKOUT button on Customer360 search page
    Given User clicks select Search Type field on Customer360 search page
    And   User selects Customer Name option from dropdown on Customer360 search page
    And   User fills in enter Customer name field with valid name as "KEMAL SUNAL"  on Customer360 search page
    And   User clicks Search Button on Customer360 search page
    And   User selects opened name of searched name on Customer360 search page
    When User clicks the Account tab on Customer360 search page
    When User clicks the New Order for prepaid rating type on Customer360 search page
    Then User is redirected to the  product catalog on Customer360 search page
    When User selects TV option from products on Customer360 search page
    And User clicks the search button under product list on Customer360 search page
    When User selects the Digitalb Premium Plus on Customer360 search page
    Then User is directed to the Digitalb Premium Plus page for details of equipments on Customer360 search page
    When User selects cash methods as ALL7900 3Month on Customer360 search page
    And user clicks the TVInfrusructure dropdown button  Customer360 search page
    And User selects the Vtv as TVInfrustructure on Customer360 search page
    And User selects Akses Fee per Dekoder Premium on Customer360 search page
    And User selects the ALL0 3Month option as cash option on Customer360 search page
    And User enters "135759852456" as CasId on Customer360 search page
    And User selects Tarife Instalimi from Purchasable Addons part on Customer360 search page
    And User selects ALL4000 3Month option as cash  method on Customer360 search page
    And User clicks the ADD to Cart button on Customer360 search page
    Then User should see warning as "Shopping cart created successfully!"on Customer360 search page
    When User clicks the Shopping Cart icon on Customer360 search page
    Then User sees the selected product is in the Shopping Cart on Customer360 search page
    When User clicks the CHECKOUT button on Customer360 search page
    And User clicks the Collected radio button on Customer360 search page
    And User clicks the COMPLATE CHECKOUT button on Customer360 search page
    Then user sees one pop up warning as "Checkout is successfully completed" on Customer360 search page

  @run1
  Scenario:As a user, I want go back to Customer360 to observe the process on Customer360 search page
    Given User clicks select Search Type field on Customer360 search page
    And   User selects Customer Name option from dropdown on Customer360 search page
    And   User fills in enter Customer name field with valid name as "KEMAL SUNAL"  on Customer360 search page
    And   User clicks Search Button on Customer360 search page
    And   User selects opened name of searched name on Customer360 search page
    When User clicks the Account tab on Customer360 search page
    When User clicks the New Order for prepaid rating type on Customer360 search page
    Then User is redirected to the  product catalog on Customer360 search page
    When User selects TV option from products on Customer360 search page
    And User clicks the search button under product list on Customer360 search page
    When User selects the Digitalb Premium Plus on Customer360 search page
    Then User is directed to the Digitalb Premium Plus page for details of equipments on Customer360 search page
    When User selects cash methods as ALL7900 3Month on Customer360 search page
    And user clicks the TVInfrusructure dropdown button  Customer360 search page
    And User selects the Vtv as TVInfrustructure on Customer360 search page
    And User selects Akses Fee per Dekoder Premium on Customer360 search page
    And User selects the ALL0 3Month option as cash option on Customer360 search page
    And User enters "135759852456" as CasId on Customer360 search page
    And User selects Tarife Instalimi from Purchasable Addons part on Customer360 search page
    And User selects ALL4000 3Month option as cash  method on Customer360 search page
    And User clicks the ADD to Cart button on Customer360 search page
    Then User should see warning as "Shopping cart created successfully!"on Customer360 search page
    When User clicks the Shopping Cart icon on Customer360 search page
    Then User sees the selected product is in the Shopping Cart on Customer360 search page
    When User clicks the CHECKOUT button on Customer360 search page
    And User clicks the Collected radio button on Customer360 search page
    And User clicks the COMPLATE CHECKOUT button on Customer360 search page
    Then user sees one pop up warning as "Checkout is successfully completed" on Customer360 search page
    When User clicks the Go Back to Customer360 button on Customer360 search page
    Then User is on the Customer360 page
    And User clicks the Order button on Customer360 search page
    And User sees the Order id of the selected product on Customer360 search page
    And User can control the Order Status of the selected product on Customer360 search page
#
#  Scenario: As a user, I want to set the installation ticket status is resolved on Customer360 search page
#    When User clicks Main Page button on Customer360 search page
#    And User clicks Load Tickets button on Customer360 search page
#    And User cliks three dots right of opened block on Customer360 search page
#    And User clicks Dnext option from the opened dropdown on Customer360 search page
#    And User enters login credetials on FAVEO login page
#    And User clicks the Change Status button on FAVEO page
#    And User clicks the resolve option from the opened dropdown FAVEO  page
#    And User clicks the Proceed button FAVEO  page
#    And User should see "" warning on FAVEO page
#    And User turns back to Customer Mangement page on Customer360 search page
#    Then User should see the Order Status turned to " completed " on Customer360 search page
#
#  Scenario: As a User ,I want to check the process in Fiscalization side on Customer360 search page
#    When User get the Agreement Id from Order part on Customer360 search page
#    And User clicks the Fiscalization Receipt on Customer360 search page
#    And User get the Agreement Id from Fiscalization Receipts part on Customer360 search page
#    When User should ensure that both Agreement Id's of Order part and Fiscalization Receipts part are equal
#
#
#
#
#
#


