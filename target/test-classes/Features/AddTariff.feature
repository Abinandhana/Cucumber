Feature: Add Tariff

  Scenario: 
    Given user should be in the telecom home page to add tariff
    And user click on add customer button to enter the datas
    When user enters all the fields with valid data to click submit.
    And user clicks on submit button to get successful message
    Then user should be displayed successful message
@smoke
  Scenario: 
    Given user should be in the telecom home page to add tariff
    And user click on add customer button to enter the datas
    When user enters all the fields with valid data to click submit
      | 1000 | 600 | 700 | 100 | 64 | 45 | 1 |
    And user clicks on submit button to get successful message
    Then user should be displayed successful message

  Scenario: 
    Given user should be in the telecom home page to add tariff
    And user click on add customer button to enter the datas
    When user enter all the fields with valid data to click submit
      | field1 | 2000 |
      | field2 |  600 |
      | field3 |  700 |
      | field4 |  100 |
      | field5 |   66 |
      | field6 |   46 |
      | field7 |    2 |
    And user clicks on submit button to get successful message
    Then user should be displayed successful message
