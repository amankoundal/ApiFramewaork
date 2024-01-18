Feature: Validating Place API's

  Scenario: Verify if Place is being Succesfully added using AddPlaceApi
    Given Add Place Payload
    When user calls "AddPlaceAPI" with Post http request
    Then the API call id success with status code 200
    And status in response body is OK


    When user calls "AddPlaceAPI" with Post http request
    Then the API call id success with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"

