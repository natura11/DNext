#language: en

Feature: Pia Aggregation Customer Create Api Tests

  @regression @pia @aggreationresidentialcustomerapi @VFALFT-XXXX
  Scenario: Create Aggregated Residential Customer
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |


  @regression @pia @aggreationresidentialcustomerapi @VFALFT-XXXX
  Scenario: Create Aggregated Foreigner Customer
    When I Create Aggregated Foreigner Customer
      |name               |
      |Foreigner          |

  @regression @pia @aggreationresidentialcustomerapi @VFALFT-XXXX
  Scenario: Create Aggregated Corporate Customer
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |

  @regression @pia @aggreationresidentialcustomerapi @VFALFT-XXXX
  Scenario: Create Aggregated Institute Customer
    When I Create Aggregated Institute Customer
      |name               |
      |Institute          |