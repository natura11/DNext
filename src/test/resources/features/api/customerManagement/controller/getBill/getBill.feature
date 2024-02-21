Feature:name

  Background: User is logged in
    Given Get Authorization for API

#  /api/accountManagement/v4/billingAccount
#  api/customerManagement/v4/customer
  @tag
  Scenario: Agency - api/agencies - GET Positive Test1
    When Create an endpoint component
      | Type        | Value                   | parameters  |
      | endpoint    | /api/customerManagement |             |
      | requestType | GET                     |             |
      | PathParam   | v4/customer             | v4/customer |

    When Send a request
    Then Status code is 206




#
#    #Endpoint: api/agencies
#  Scenario Outline: Agency - api/agencies - POST Negative Test5
#    When Create an endpoint component
#      | Type                   | Value    | parameters |
#      | endpoint               | /api     |            |
#      | requestTypeAppointment | UNPOST   |            |
#      | AgenciesBody_POST      | body     | <body>     |
#      | PathParam              | agencies | agencies   |
#
#
#    When Send a request
#    Then Status code is 422
#
#    Examples:
#      | body                                                                                                                                                                                                                                                                      |
#      | {"name": "Kiersten Halvorson","description": "string","agencyTypeId": 11,"countryId": 1,"address": "string","telephone": "string","email": "christophermail.com","cityName": "string","invoiceNumber": "string","authPersonName": "string","authPersonSurname": "string"} |