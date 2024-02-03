#language: en

Feature: Pia Ticket Api Tests

  @regression @pia @ticketapi @VFALFT-8541
  Scenario: List Trouble Tickets
    When I List Trouble Tickets

#  @regression @pia @ticketapi @VFALFT-8551
#  Scenario: Create After Sales Issues Case Type
#    When I Create Ticket
#      |name                  |description          |severity |priority |ticketType                     |custom1Value   |custom1ID|custom2Value|custom2ID|custom3Value   |custom3ID|custom4Value|custom4ID|
#      |After Sales Issue Type|Deniz Hosgeldin|1        |Medium   |After Sales Incident Case Type |Network Issues |72       |Service loss|73       |switch problems|79       |7878        |80       |

  @regression @pia @ticketapi @VFALFT-9048
  Scenario: Retrieve After Sales Issues Case Type
    When I Retrieve Ticket "3"

#  @regression @pia @ticketapi @VFALFT-8549
#  Scenario: Create Fix Line Sales Case Type
#    When I Create Ticket
#      |name                    |description          |severity |priority |ticketType                     |custom1Value   |custom1ID|custom2Value|custom2ID|
#      |Fix Line Sales Case Type|Created By Automation|1        |High     |Fix Line Sales Case Type       |TV Products    |66       |test1       |67       |

  @regression @pia @ticketapi @VFALFT-9054 @smoke
  Scenario: Retrieve Fix Line Sales Case Type
    When I Retrieve Ticket "32"

#  @regression @pia @ticketapi @VFALFT-8553
#  Scenario: Create Customer Self Service Case Type
#    When I Create Ticket
#      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|custom2Value                                 |custom2ID|custom3Value|custom3ID|
#      |Customer Self Service Case Type|Created By Automation|1        |Medium     |Customer Self-Service Case Type|Registration & Account|82       |I Need Help Using My Vodafone, Online Account|83       |test1       |85       |
#
  @regression @pia @ticketapi @VFALFT-9052
  Scenario: Retrieve Customer Self Service Case Type
    When I Retrieve Ticket "14"

#  @regression @pia @ticketapi @VFALFT-8550
#  Scenario: Create Installations Case Type
#    When I Create Ticket
#      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|customm2Value  |custom2ID|
#      |Installations Case Type        |Created By Automation|1        |Urgent     |Installation Issues Case Type  |Software Issues       |68       |test1          |71       |
#
  @regression @pia @ticketapi @VFALFT-9058
  Scenario: Retrieve Installations Case Type
    When I Retrieve Ticket "2"

#  @regression @pia @ticketapi @VFALFT-8552
#  Scenario: Create Billing Issues Case Type
#    When I Create Ticket
#      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|custom2Value  |custom2ID|custom3Value  |custom3ID|
#      |Billing Issues Case Type       |Created By Automation|1        |Low        |Billing Issues Case Type       |Deposits              |86       |TL30           |92       |TL10           |93       |
#
  @regression @pia @ticketapi @VFALFT-9050
  Scenario: Retrieve Billing Issues Case Type
    When I Retrieve Ticket "9"

#  @regression @pia @ticketapi @VFALFT-8554
#  Scenario: Create General Info Case Type
#    When I Create Ticket
#      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|custom2Value  |custom2ID|
#      |General Info Case Type         |Created By Automation|1        |High       |General Info Case Type         |Support Question      |62       |test1         |64       |
#
  @regression @pia @ticketapi @VFALFT-9056
  Scenario: Retrieve General Info Case Type
    When I Retrieve Ticket "1"

#  @regression @pia @ticketapi @VFALFT-8555
#  Scenario: Create Partner Case Type
#    When I Create Ticket
#      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|
#      |Partner Services Case Type     |Created By Automation|1        |High       |Partner Services Case Type     |Partner Account Issues|94       |
#
  @regression @pia @ticketapi @VFALFT-9061
  Scenario: Retrieve Partner Case Type
    When I Retrieve Ticket "27"

#  @regression @pia @ticketapi @VFALFT-10096
#  Scenario: Create Support Query Case Type
#    When I Create Ticket
#      |name                           |description          |severity |priority   |ticketType                     |custom1Value          |custom1ID|
#      |Support Query    Case Type     |Created By Automation|1        |High       |Support query                  |test1                 |64       |
#
#  @regression @pia @ticketapi @VFALFT-10095
#  Scenario: Retrieve Support Query Case Type
#    When I Retrieve Ticket "247"

#  @regression @pia @ticketapi @VFALFT-8548
#  Scenario: Delete Trouble Tickets
#    When I Delete Ticket "333"

  @regression @pia @ticketapi @VFALFT-8544
  Scenario: Get Trouble Ticket Specification
    When I Get Trouble Ticket Specification

  @regression @pia @ticketapi @VFALFT-10099
  Scenario: Land Widget Page
    When I Land Widget Page "ui/customerCaseManagement/widget"


