Feature: Login Functionality Testing

  Scenario Outline: Login with multiple sets of test data
    Given User opens the application
    When User clicks on the signin link
    When User eneters "<username>" and "<password>"
    Then User will click on Login Button
    Then Demo webshop homepage will be displayed

    Examples: 
      | username                | password |
      | wanderingkesh@gmail.com | Test$123 |
      | jackson.aurora@aol.com  | Test$123 |
