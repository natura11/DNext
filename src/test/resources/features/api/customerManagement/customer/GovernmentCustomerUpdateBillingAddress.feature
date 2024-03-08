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
    When Create an endpoint component
      | Type          | Value           | parameters    |
      | endpoint      | getFromPost     |               |
      | requestType   | GET_RequestBill |               |
      |               |                 |               |
      | ApiBrmBaseURI | apiBrmBaseURI   | apiBrmBaseURI |

    When Send a request
    Then Status code is 200
    Examples:
      | body                        |
      | {"customerId": "F52115451"} |

#@t121
#  https://brm-gateway-api.uat.dnext.al.vodafone.com/api/brm-gateway/v4/brm-integration/view-log-enhanced/7c6cc327-d969-11ee-a3d8-0263f2d2b57b
#  https://brm-gateway-api.uat.dnext.al.vodafone.com/api/brm-gateway/v4/brm-integration/view-log-enhanced/2afeecc5-d968-11ee-90e5-3afa04f98415
#  Scenario: Gov customer Update current Billing Address-Get
#    When Create an endpoint component
#      | Type          | Value                                | parameters    |
#      | endpoint      | 2afeecc5-d968-11ee-90e5-3afa04f98415 |               |
#      | requestType   | GET_RequestBill                      |               |
#      |               |                                      |               |
#      | ApiBrmBaseURI | apiBrmBaseURI                        | apiBrmBaseURI |
#
#    When Send a request
#    Then Status code is 200







