#language: en

Feature: Pia Aggregation Customer Search Api Tests


  @regression @pia @aggreationcustomersearchapi @VFALFT-XXXX
  Scenario: Search Aggregated Residential Customer ID
    When I Create Customer "R"
    When I Search Residential Customer with ID

  @regression @pia @aggreationcustomersearchapi @VFALFT-XXXX
  Scenario: Search Aggregated Residential Customer Name
    When I Create Customer "R"
    When I Search Residential Customer with Name

  @regression @pia @aggreationcustomersearchapi @VFALFT-XXXX
  Scenario: Search Aggregated Residential Customer Status
    When I Create Customer "R"
    When I Search Residential Customer with Status

  @regression @pia @aggreationcustomersearchapi @VFALFT-XXXX
  Scenario: Search Aggregated Residential Customer HREF
    When I Create Customer "R"
    When I Search Residential Customer with HREF

  @regression @pia @aggreationcustomersearchapi @VFALFT-XXXX
  Scenario: Search Aggregated Residential Customer EngagedParty ID
    When I Create Customer "R"
    When I Search Residential Customer with EngagedParty ID

  @regression @pia @aggreationcustomersearchapi @VFALFT-XXXX
  Scenario: Search Aggregated Residential Customer EngagedParty GivenName
    When I Create Customer "R"
    When I Search Residential Customer with EngagedParty GivenName

  @regression @pia @aggreationcustomersearchapi @VFALFT-XXXX
  Scenario: Search Aggregated Residential Customer EngagedParty FamilyName
    When I Create Customer "R"
    When I Search Residential Customer with EngagedParty FamilyName

