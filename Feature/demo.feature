Feature: Testing demo web shop login

  Scenario: User enters Username and Password
    Given the login page is opened
    When user eneters wanderingkesh@gmail.com as username
    And user enters Test$123 as password
    Then user will click on login button
    Then demo webshop home page appears
