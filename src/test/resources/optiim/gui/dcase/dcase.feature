#language: en

Feature: Pia dCase Test Cases

  #@regression @pia @dcase @C0001
  @regression @pia @dcase @VFALFT-8598 @ignore
  #Scenario: Verify if a user will be able to login with a valid username and valid password
  Scenario: DCase Login
    Given I have opened the "DCase" application
    When I click login field
    When I enter a valid username "faveo" in the user name field
    And I enter a valid password "wa7upRlsIpu_" in the password field
    And I press the login button
    Then I should be seeing have successfully logged in

#test
#    #Short login for other tests
#  @regression @pia @dcase @CLogin
#  Scenario: Verify if a user will be able to login with a valid username and valid password
#    Given I open the dCase application
#    When I login
#    Then I should be seeing have successfully logged in
#
#  @regression @pia @dcase @C2
#  Scenario: Logout
#    Given I open the dCase application
#    When I click login field
#    Then I should be seeing login page
#    When I enter a valid username "faveo" in the user name field
#    And I enter a valid password "orbitant123" in the password field
#    And I press the login button
#    Then I should be seeing have successfully logged in
#    When I logout
#    Then I should see home page
#
#  @regression @pia @dcase @C3
#  Scenario: Verify if a user cannot login with a valid username and an invalid password
#    Given I open the dCase application
#    When I click login field
#    Then I should be seeing login page
#    When I enter a valid username "faveo" in the user name field
#    And I enter a invalid password "xxxxxxxxxx" in the password field
#    And I press the login button
#    Then I should be seeing "Invalid Credentials" alert message
#
#  @regression @pia @dcase @C4
#  Scenario: Verify if a user cannot login with a invalid username and an invalid password
#    Given I open the dCase application
#    When I click login field
#    When I enter a invalid username "xxxxxxxxx" in the user name field
#    And I enter a invalid password "xxxxxxxxxx" in the password field
#    And I press the login button
#    Then I should be seeing "Email/username is not registered" alert message
#
#  @regression @pia @dcase @C5
#  Scenario: Open Create Ticket Page
#    Given I open the dCase application
#    When I click login field
#    When I enter a valid username "faveo" in the user name field
#    And I enter a valid password "orbitant123" in the password field
#    And I press the login button
#    Then I should be seeing have successfully logged in
#    When I open "Create Ticket" menu
#    Then I should be seeing "Create Ticket" page
#
#  @regression @pia @dcase @C6
#  Scenario: Open My Tickets Page
#    Given I open the dCase application
#    When I click login field
#    When I enter a valid username "faveo" in the user name field
#    And I enter a valid password "orbitant123" in the password field
#    And I press the login button
#    Then I should be seeing have successfully logged in
#    When I open "My Tickets" menu
#    Then I should be seeing "My Tickets" page
#
#  @regression @pia @dcase @C7
#  Scenario: Create User
#    Given I open the dCase application
#    When I login
#    Then I should be seeing have successfully logged in
#    When I open "User Directory" menu
#    Then I should be seeing "User Directory" page
#    When I press create user button
#    Then I should be seeing user create form
#    When I enter a first name "Sezai" in the first name field
#    And I enter a last name "Çelik" in the last name field
#    And I enter an username "sezaicelik" in the username field
#    And I enter an email "sezai.celik@optiim.com" in the email field
#    And I enter an address "İstanbul Turkey" in the address field
#    And I press submit button
#    Then I should be seeing the user created in the list of users table