Feature: Register in the application

  Scenario: Register in the Demo Web Shop
    Given Iam on the Demo Web Shop Page
    Then I click on the Register link in the header of the page
    Then I should be on the register page
    Then click on the female radio button
    Then Fill in the First Name field as Aurora
    Then Fill in the Last Name field as Jackson
    Then Fill in the email field as jackson.aurora@gmail.com
    Then Fill in the password field as Test$123
    And Fill in the confirm password field as Test$123
    Then click on the register button
    Then verify Toast Message exists on page
