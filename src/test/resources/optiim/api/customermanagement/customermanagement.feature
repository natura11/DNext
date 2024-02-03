#language: en

Feature: Pia customer management Api Test

  @regression @pia @customermanagementapi @VFALFT-10225
  Scenario: Land Customer Management Page
    When I Land Customer Management Page "ui/customerManagement/"

  @regression @pia @customermanagementapi @VFALFT-10227
  Scenario: Customer List Offset 0
    When I Customer List Offset "0"

  @regression @pia @customermanagementapi @VFALFT-10228
  Scenario: Customer List Offset 10
    When I Customer List Offset "10"

  @regression @pia @customermanagementapi @VFALFT-10231
  Scenario: Available Customer Search via New Customer Creation Screen
    When I Customer Search via New Customer Creation "A12345678B"

  @regression @pia @customermanagementapi @VFALFT-10233
  Scenario: Not Available Customer Search via New Customer Creation Screen
    When I Customer Search via New Customer Creation "A12345678B7777"

#  @regression @pia @customermanagementapi @VFALFT-XXXX
#  Scenario: Full Customer List

#    get customer list one item then put here
  @regression @pia @customermanagementapi @VFALFT-10234 @smoke
  Scenario: Customer Details
#    When I Customer Details "cb42b04a-52bf-485b-a3ea-d4926fdff106"
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    Then I Customer Search via 360 Screen with CustomerName ""

  @regression @pia @customermanagementapi @VFALFT-10496 @smoke
  Scenario: Create Residential Customer
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |

  @regression @pia @customermanagementapi @VFALFT-10498 @smoke
  Scenario: Create Foreigner Customer
    When I Create Aggregated Foreigner Customer
      |name               |
      |Foreigner          |

  @regression @pia @customermanagementapi @VFALFT-10753 @smoke
  Scenario: Create Corporate Customer
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |

  @regression @pia @customermanagementapi @VFALFT-11368 @smoke
  Scenario: Create Institute Customer
    When I Create Aggregated Institute Customer
      |name               |
      |Institute          |
