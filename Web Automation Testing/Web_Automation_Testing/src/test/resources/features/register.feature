Feature: As a user i want to register so that i can see login page

  Background:
    Given user on product page
    And user click logout button
    And user on login page
    And user click register link
    And user on register page

  @TCR1.1
  Scenario: As a user i success register with input valid fullname, valid email, and valid password
    When user input valid fullname for register
    And user input valid email for register
    And user input valid password for register
    And user click register button
    Then user on login page successfully

  @TCR1.2
  Scenario: As a user i failed register with input valid fullname, empty email, and valid password
    When user input valid fullname for register
    And user input empty email for register
    And user input valid password for register
    And user click register button
    Then user see error message register

  @TCR1.3
  Scenario: As a user i failed register with input valid fullname, valid email, and empty password
    When user input valid fullname for register
    And user input valid email for register
    And user input empty password for register
    And user click register button
    Then user see error message register

  @TCR1.4
  Scenario: As a user i failed register with input empty fullname, valid email, and valid password
    When user input empty fullname for register
    And user input valid email for register
    And user input valid password for register
    And user click register button
    Then user see error message register

  @TCR1.5
  Scenario: As a user i failed register with input empty all fields
    When user input empty fullname for register
    And user input empty email for register
    And user input empty password for register
    And user click register button
    Then user see error message register

  @TCR1.6
  Scenario: As a user i failed register with input fullname, email, and password that have been registered
    When user input fullname for register
    And user input email for register
    And user input password for register
    And user click register button
    Then user see error message register