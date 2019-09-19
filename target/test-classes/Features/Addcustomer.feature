
Feature: Add Customer flow
	
  Scenario: 
    Given user should be in the telecom home page
    And user click on add customer button
    When user enters all the fields with valid data
    And user clicks on submit button
    Then user should be displayed customer id is generated

  Scenario: 
    Given user should be in the telecom home page
    And user click on add customer button
    When user enters all the field with valid data.
      | Abi | Aravind | abi@gmail.com | Chennai | 8575857583 |
    And user clicks on submit button
    Then user should be displayed customer id is generated

  Scenario: 
    Given user should be in the telecom home page
    And user click on add customer button
    When user enter all the field with valid data.
      | fname   | Dhakshu           |
      | lname   | Abi               |
      | email   | Dhakshu@gmail.com |
      | address | Chennai           |
      | phno    |        8684584848 |
    And user clicks on submit button
    Then user should be displayed customer id is generated
