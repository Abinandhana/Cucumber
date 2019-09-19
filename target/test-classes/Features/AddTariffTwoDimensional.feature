Feature: Add Tariff Two Dimensional
	
  Background: 
    Given Uuser should be in the telecom home page to add tariff
    And Uuser click on add customer button to enter the datas
@smoke
  Scenario: 
    When Uuser enters all the fields with valid data to click submit.
    And Uuser clicks on submit button to get successful message
    Then Uuser should be displayed successful message

  Scenario: 
    When Uusers Should enters all the  fields with valid data to click submit  submit.
      | 1000 | 600 | 700 |    10 | 64 | 45 | 1 |
      | 2000 | 500 | 800 |   100 | 54 | 35 | 2 |
      | 3000 | 300 | 100 |  1000 | 44 | 25 | 3 |
      | 4000 | 400 | 300 | 10000 | 34 | 15 | 4 |
    And Uuser clicks on submit button to get successful message
    Then Uuser should be displayed successful message

  Scenario: 
    When Uuserss Shouldd  enter all the  fields with valid data to click click  submit.
      | MonthlyRent | LM  | IM  | SMS | LC  | IC | SC |
      |        5000 | 200 | 540 |  46 | 454 | 44 |  6 |
      |        6000 | 100 | 949 |  35 | 545 | 64 |  4 |
      |        7000 | 300 | 344 |  23 | 242 | 76 |  5 |
      |        8000 | 400 |  35 |  12 | 676 | 72 |  2 |
    And Uuser clicks on submit button to get successful message
    Then Uuser should be displayed successful message

  Scenario Outline: 
    When Uuserss Shouldd  enter all the  fields with valid data to click click  submit."<MonthlyRent>","<LM>","<IM>","<SMS>","<LC>","<IC>","<SC>"
    And Uuser clicks on submit button to get successful message
    Then Uuser should be displayed successful message

    Examples: 
      | MonthlyRent | LM  | IM  | SMS | LC  | IC | SC |
      |        5000 | 200 | 540 |  46 | 454 | 44 |  6 |
      |        6000 | 100 | 949 |  35 | 545 | 64 |  4 |
      |        7000 | 300 | 344 |  23 | 242 | 76 |  5 |
      |        8000 | 400 |  35 |  12 | 676 | 72 |  2 |
