#language: en

Feature: Pia customer management 360 Api Tests

  @regression @pia @customermanagement360api @VFALFT-8568 @smoke
  Scenario: Land Customer 360 Page
    When I Land Customer Management Page "ui/customerManagement/customer360"

  @regression @pia @customermanagement360api @VFALFT-8571
  Scenario: Available Customer Search via 360 Screen with CustomerName
    When I Customer Search via 360 Screen with CustomerName "TESTRESIDENTIAL1 KAYİS"


  @regression @pia @customermanagement360api @VFALFT-8572
  Scenario: Not Available Customer Search via 360 Screen with CustomerName
    When I Customer Search via 360 Screen with CustomerName "TESTRESIDENTIAL1 KAYİSX"


  @regression @pia @customermanagement360api @VFALFT-8509
  Scenario: Available Customer Search via 360 Screen with PersonelNumber
    When I Customer Search via 360 Screen with PersonelNumber "P96521862R"

  @regression @pia @customermanagement360api @VFALFT-8507
  Scenario: Not Available Customer Search via 360 Screen with PersonelNumber
    When I Customer Search via 360 Screen with PersonelNumber "P96521862RX"


  @regression @pia @customermanagement360api @VFALFT-8505 @smoke
  Scenario: Create Residential Customer and Search Billing Account
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    Then I Customer Search via 360 Screen with CustomerName ""
    #When I Get Related Party ""
    #Then I Get Billing Account ""

  @regression @pia @customermanagement360api @VFALFT-8504
  Scenario: Create Residential Customer,TroubleTicket and Fix Line Sales Case Type
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                    |description          |severity |priority |ticketType                     |custom1Value   |custom1ID|custom2Value|custom2ID|
      |Fix Line Sales Case Type|Created By Automation|1        |High     |Fix Line Sales Case Type       |TV Products    |66       |test1       |67       |
    #Then I Retrieve Ticket ""

  @regression @pia @customermanagement360api @VFALFT-8479
  Scenario: Create Residential Customer,TroubleTicket and After Sales Issue Type
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                  |description          |severity |priority |ticketType                     |custom1Value   |custom1ID|custom2Value|custom2ID|custom3Value   |custom3ID|custom4Value|custom4ID|
      |After Sales Issue Type|Deniz Hosgeldin|1        |Medium   |After Sales Incident Case Type |Network Issues |72       |Service loss|73       |switch problems|79       |7878        |80       |
    #Then I Retrieve Ticket ""

  @regression @pia @customermanagement360api @VFALFT-9738
  Scenario: Create Residential Customer,TroubleTicket and Customer Self Service Case Type
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|custom2Value                                 |custom2ID|custom3Value|custom3ID|
      |Customer Self Service Case Type|Created By Automation|1        |Medium     |Customer Self-Service Case Type|Registration & Account|82       |I Need Help Using My Vodafone, Online Account|83       |test1       |85       |
    #Then I Retrieve Ticket ""


  @regression @pia @customermanagement360api @VFALFT-9739
  Scenario: Create Residential Customer,TroubleTicket and Installations Case Type
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|customm2Value  |custom2ID|
      |Installations Case Type        |Created By Automation|1        |Urgent     |Installation Issues Case Type  |Software Issues       |68       |test1          |71       |
    #Then I Retrieve Ticket ""

  @regression @pia @customermanagement360api @VFALFT-9740
  Scenario: Create Residential Customer,TroubleTicket and Billing Issues Case Type
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|custom2Value  |custom2ID|custom3Value  |custom3ID|
      |Billing Issues Case Type       |Created By Automation|1        |Low        |Billing Issues Case Type       |Deposits              |86       |TL30           |92       |TL10           |93       |
    #Then I Retrieve Ticket ""

  @regression @pia @customermanagement360api @VFALFT-9741
  Scenario: Create Residential Customer,TroubleTicket and General Info Case Type
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|custom2Value  |custom2ID|
      |General Info Case Type         |Created By Automation|1        |High       |General Info Case Type         |Support Question      |62       |test1         |64       |
    #Then I Retrieve Ticket ""

  @regression @pia @customermanagement360api @VFALFT-9786
  Scenario: Create Residential Customer,TroubleTicket and Partner Services Case Type
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|
      |Partner Services Case Type     |Created By Automation|1        |High       |Partner Services Case Type     |Partner Account Issues|94       |
    #Then I Retrieve Ticket ""

#  @regression @pia @customermanagement360api @VFALFT-10120
#  Scenario: Create Residential Customer,TroubleTicket and Support Query    Case Type
#    When I Create Aggregated Residential Customer
#      |name               |
#      |Residential        |
#    Then I Customer Search via 360 Screen with CustomerName ""
#    When I Create Ticket
#      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|
#      |Support Query    Case Type     |Created By Automation|1        |High       |Support query                  |test1                 |64       |
#    #Then I Retrieve Ticket ""


  @regression @pia @customermanagement360api @VFALFT-10751
  Scenario: Create Residential Customer,Multiple Trouble Tickets
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                    |description          |severity |priority |ticketType                     |custom1Value   |custom1ID|custom2Value|custom2ID|
      |Fix Line Sales Case Type|Created By Automation|1        |High     |Fix Line Sales Case Type       |TV Products    |66       |test1       |67       |
    When I Create Ticket
      |name                  |description          |severity |priority |ticketType                     |custom1Value   |custom1ID|custom2Value|custom2ID|custom3Value   |custom3ID|custom4Value|custom4ID|
      |After Sales Issue Type|Deniz Hosgeldin|1        |Medium   |After Sales Incident Case Type |Network Issues |72       |Service loss|73       |switch problems|79       |7878        |80       |
#    When I Create Ticket
#      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|
#      |Support Query    Case Type     |Created By Automation|1        |High       |Support query                  |test1                 |64       |
    #Then I Retrieve Ticket ""




#  @regression @pia @customermanagement360api @VFALFT-XXXX
#  Scenario: Create Residential Customer, Create ProductOrder

    @regression @pia @customermanagement360api @VFALFT-8502
    Scenario: Create Foreigner Customer and Search Billing Account
      When I Create Aggregated Foreigner Customer
        |name               |
        |Foreigner          |
    Then I Customer Search via 360 Screen with CustomerName ""
#    When I Get Related Party ""
#    Then I Get Billing Account ""

  @regression @pia @customermanagement360api @VFALFT-8480
  Scenario: Create Foreigner Customer,TroubleTicket and Fix Line Sales Case Type
    When I Create Aggregated Foreigner Customer
      |name               |
      |Foreigner          |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                    |description          |severity |priority |ticketType                     |custom1Value   |custom1ID|custom2Value|custom2ID|
      |Fix Line Sales Case Type|Created By Automation|1        |High     |Fix Line Sales Case Type       |TV Products    |66       |test1       |67       |
    #Then I Retrieve Ticket ""


  @regression @pia @customermanagement360api @VFALFT-10119
  Scenario: Create Foreigner Customer,TroubleTicket and After Sales Issue Type
    When I Create Aggregated Foreigner Customer
      |name               |
      |Foreigner          |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                  |description          |severity |priority |ticketType                     |custom1Value   |custom1ID|custom2Value|custom2ID|custom3Value   |custom3ID|custom4Value|custom4ID|
      |After Sales Issue Type|Deniz Hosgeldin|1        |Medium   |After Sales Incident Case Type |Network Issues |72       |Service loss|73       |switch problems|79       |7878        |80       |
    #Then I Retrieve Ticket ""

  @regression @pia @customermanagement360api @VFALFT-10118
  Scenario: Create Foreigner Customer,TroubleTicket and Customer Self Service Case Type
    When I Create Aggregated Foreigner Customer
      |name               |
      |Foreigner          |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|custom2Value                                 |custom2ID|custom3Value|custom3ID|
      |Customer Self Service Case Type|Created By Automation|1        |Medium     |Customer Self-Service Case Type|Registration & Account|82       |I Need Help Using My Vodafone, Online Account|83       |test1       |85       |
    #Then I Retrieve Ticket ""


  @regression @pia @customermanagement360api @VFALFT-8620
  Scenario: Create Foreigner Customer,TroubleTicket and Installations Case Type
    When I Create Aggregated Foreigner Customer
      |name               |
      |Foreigner          |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|customm2Value  |custom2ID|
      |Installations Case Type        |Created By Automation|1        |Urgent     |Installation Issues Case Type  |Software Issues       |68       |test1          |71       |
    #Then I Retrieve Ticket ""

  @regression @pia @customermanagement360api @VFALFT-8621
  Scenario: Create Foreigner Customer,TroubleTicket and Billing Issues Case Type
    When I Create Aggregated Foreigner Customer
      |name               |
      |Foreigner          |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|custom2Value  |custom2ID|custom3Value  |custom3ID|
      |Billing Issues Case Type       |Created By Automation|1        |Low        |Billing Issues Case Type       |Deposits              |86       |TL30           |92       |TL10           |93       |
    #Then I Retrieve Ticket ""

  @regression @pia @customermanagement360api @VFALFT-8622
  Scenario: Create Foreigner Customer,TroubleTicket and General Info Case Type
    When I Create Aggregated Foreigner Customer
      |name               |
      |Foreigner          |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|custom2Value  |custom2ID|
      |General Info Case Type         |Created By Automation|1        |High       |General Info Case Type         |Support Question      |62       |test1         |64       |
    #Then I Retrieve Ticket ""

  @regression @pia @customermanagement360api @VFALFT-8623
  Scenario: Create Foreigner Customer,TroubleTicket and Partner Services Case Type
    When I Create Aggregated Foreigner Customer
      |name               |
      |Foreigner          |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|
      |Partner Services Case Type     |Created By Automation|1        |High       |Partner Services Case Type     |Partner Account Issues|94       |
    #Then I Retrieve Ticket ""

#  @regression @pia @customermanagement360api @VFALFT-8670
#  Scenario: Create Foreigner Customer,TroubleTicket and Support Query Case Type
#    When I Create Aggregated Foreigner Customer
#      |name               |
#      |Foreigner          |
#    Then I Customer Search via 360 Screen with CustomerName ""
#    When I Create Ticket
#      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|
#      |Support Query    Case Type     |Created By Automation|1        |High       |Support query                  |test1                 |64       |
#    #Then I Retrieve Ticket ""

  @regression @pia @customermanagement360api @VFALFT-10752
  Scenario: Create Foreigner Customer,Multiple Trouble Tickets
    When I Create Aggregated Foreigner Customer
      |name               |
      |Foreigner          |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                    |description          |severity |priority |ticketType                     |custom1Value   |custom1ID|custom2Value|custom2ID|
      |Fix Line Sales Case Type|Created By Automation|1        |High     |Fix Line Sales Case Type       |TV Products    |66       |test1       |67       |
    When I Create Ticket
      |name                  |description          |severity |priority |ticketType                     |custom1Value   |custom1ID|custom2Value|custom2ID|custom3Value   |custom3ID|custom4Value|custom4ID|
      |After Sales Issue Type|Deniz Hosgeldin|1        |Medium   |After Sales Incident Case Type |Network Issues |72       |Service loss|73       |switch problems|79       |7878        |80       |
#    When I Create Ticket
#      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|
#      |Support Query    Case Type     |Created By Automation|1        |High       |Support query                  |test1                 |64       |
    #Then I Retrieve Ticket ""

  @regression @pia @customermanagementapi @VFALFT-10763
  Scenario: Create Corporate Customer,TroubleTicket and Fix Line Sales Case Type
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                    |description          |severity |priority |ticketType                     |custom1Value   |custom1ID|custom2Value|custom2ID|
      |Fix Line Sales Case Type|Created By Automation|1        |High     |Fix Line Sales Case Type       |TV Products    |66       |test1       |67       |
    #Then I Retrieve Ticket ""

  @regression @pia @customermanagementapi @VFALFT-10764
  Scenario: Create Corporate Customer,TroubleTicket and After Sales Issue Type
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                  |description          |severity |priority |ticketType                     |custom1Value   |custom1ID|custom2Value|custom2ID|custom3Value   |custom3ID|custom4Value|custom4ID|
      |After Sales Issue Type|Deniz Hosgeldin|1        |Medium   |After Sales Incident Case Type |Network Issues |72       |Service loss|73       |switch problems|79       |7878        |80       |
    #Then I Retrieve Ticket ""

  @regression @pia @customermanagementapi @VFALFT-10765
  Scenario: Create Corporate Customer,TroubleTicket and Customer Self Service Case Type
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|custom2Value                                 |custom2ID|custom3Value|custom3ID|
      |Customer Self Service Case Type|Created By Automation|1        |Medium     |Customer Self-Service Case Type|Registration & Account|82       |I Need Help Using My Vodafone, Online Account|83       |test1       |85       |
    #Then I Retrieve Ticket ""

  @regression @pia @customermanagementapi @VFALFT-10766
  Scenario: Create Corporate Customer,TroubleTicket and Installations Case Type
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|customm2Value  |custom2ID|
      |Installations Case Type        |Created By Automation|1        |Urgent     |Installation Issues Case Type  |Software Issues       |68       |test1          |71       |
    #Then I Retrieve Ticket ""

  @regression @pia @customermanagementapi @VFALFT-10767
  Scenario: Create Corporate Customer,TroubleTicket and Billing Issues Case Type
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|custom2Value  |custom2ID|custom3Value  |custom3ID|
      |Billing Issues Case Type       |Created By Automation|1        |Low        |Billing Issues Case Type       |Deposits              |86       |TL30           |92       |TL10           |93       |
    #Then I Retrieve Ticket ""

  @regression @pia @customermanagementapi @VFALFT-10772
  Scenario: Create Corporate Customer,TroubleTicket and General Info Case Type
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|custom2Value  |custom2ID|
      |General Info Case Type         |Created By Automation|1        |High       |General Info Case Type         |Support Question      |62       |test1         |64       |
    #Then I Retrieve Ticket ""

  @regression @pia @customermanagementapi @VFALFT-10773
  Scenario: Create Corporate Customer,TroubleTicket and Partner Services Case Type
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|
      |Partner Services Case Type     |Created By Automation|1        |High       |Partner Services Case Type     |Partner Account Issues|94       |
    #Then I Retrieve Ticket ""

  @regression @pia @customermanagementapi @VFALFT-10774 @smoke
  Scenario: Create Corporate Customer,TroubleTicket and Support Query Case Type
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                   |description          |severity |priority   |ticketType             |custom1Value             |custom1ID|custom2Value|custom2ID|custom3Value|custom3ID|
      |Installation Management|Created By Automation|1        |Medium     |Installation Management|New Installation         |56       |25          |108      |BERAT       |109      |
#    #Then I Retrieve Ticket ""

  @regression @pia @customermanagementapi @VFALFT-10775
  Scenario: Create Corporate Customer,Multiple Trouble Tickets
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    Then I Customer Search via 360 Screen with CustomerName ""
    When I Create Ticket
      |name                    |description          |severity |priority |ticketType                     |custom1Value   |custom1ID|custom2Value|custom2ID|
      |Fix Line Sales Case Type|Created By Automation|1        |High     |Fix Line Sales Case Type       |TV Products    |66       |test1       |67       |
    When I Create Ticket
      |name                  |description          |severity |priority |ticketType                     |custom1Value   |custom1ID|custom2Value|custom2ID|custom3Value   |custom3ID|custom4Value|custom4ID|
      |After Sales Issue Type|Deniz Hosgeldin|1        |Medium   |After Sales Incident Case Type |Network Issues |72       |Service loss|73       |switch problems|79       |7878        |80       |
#    When I Create Ticket
#      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|
#      |Support Query    Case Type     |Created By Automation|1        |High       |Support query                  |test1                 |64       |
    #Then I Retrieve Ticket ""




#  @regression @pia @customermanagement360api @VFALFT-XXXX
#  Scenario: Available Customer Search via 360 Screen with NIPT
#
#  @regression @pia @customermanagement360api @VFALFT-XXXX
#  Scenario: Not Available Customer Search via 360 Screen with NIPT


  #  @regression @pia @customermanagement360api @VFALFT-XXXX
#  Scenario: Create Foreigner Customer, Create ProductOrder

