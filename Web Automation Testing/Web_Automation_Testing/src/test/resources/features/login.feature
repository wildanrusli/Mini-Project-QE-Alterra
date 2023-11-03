Feature: As a user i want to login so that i can see product page

  Background:
    Given user on product page
    And user click logout button
    And user on login page

  @TCL2.1
  Scenario: As a user i success login with input valid email and valid password
    When user input valid email
    And user input valid password
    And user click login button
    Then user on product page successfully

  @TCL2.2
  Scenario: As a user i failed login with input valid email and empty password
    When user input valid email
    And user input empty password
    And user click login button
    Then user see error message "password is required"

  @TCL2.3
  Scenario: As a user i failed login with input empty email and valid password
    When user input empty email
    And user input valid password
    And user click login button
    Then user view error message "email is required"

  @TCL2.4
  Scenario: As a user i failed login with input empty email and empty password
    When user input empty email
    And user input empty password
    And user click login button
    Then user view error message "email is required"

  @TCL2.5
  Scenario: As a user i failed login with input invalid email and valid password
    When user input invalid email
    And user input valid password
    And user click login button
    Then user can see error message "record not found"

  @TCL2.6
  Scenario: As a user i failed login with input valid email and invalid password
    When user input valid email
    And user input invalid password
    And user click login button
    Then user can view error message "email or password is invalid"

  @TCL2.7
  Scenario: As a user i failed login with input invalid email and invalid password
    When user input invalid email
    And user input invalid password
    And user click login button
    Then user can see error message "record not found"