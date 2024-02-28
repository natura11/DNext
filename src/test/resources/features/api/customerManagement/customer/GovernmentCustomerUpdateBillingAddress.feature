@regresyon @VFALFT-22422 @12
Feature:Government customer Update Billing Address

  Background: User is logged in
    Given Get Authorization for API

  @tag1
  Scenario Outline: Gov customer Update current Billing Address - POST
    When Create an endpoint component
      | Type        | Value                                            | parameters        |
      | endpoint    | /api/si-bpmn/camunda/start/BrmCustomerInfoUpdate |                   |
      | requestType | POST                                             |                   |
      | plainParam  | body                                             | <body>            |
      | type1       | apiCamundaBaseURI                                | apiCamundaBaseURI |


    When Send a request
    Then Status code is 200
#    When Create an endpoint component
#      | Type          | Value           | parameters    |
#      | endpoint      | getFromPost     |               |
#      | requestType   | GET_RequestBill |               |
#      |               |                 |               |
#      | ApiBrmBaseURI | apiBrmBaseURI   | apiBrmBaseURI |
#
#    When Send a request
#    Then Status code is 200
    Examples:
      | body                        |
      | {"customerId": "F52115451"} |

@t1
  Scenario: Gov customer Update current Billing Address-Get
    When Create an endpoint component
      | Type          | Value                                | parameters    |
      | endpoint      | 736300cc-d636-11ee-9d7d-922486ec82e4 |               |
      | requestType   | GET_RequestBill                      |               |
      |               |                                      |               |
      | ApiBrmBaseURI | apiBrmBaseURI                        | apiBrmBaseURI |

    When Send a request
    Then Status code is 200







