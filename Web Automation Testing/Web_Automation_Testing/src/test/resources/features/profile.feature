Feature: As a user i want to see my transactions so that i can logout

  @TCPR5.1
  Scenario: As a user i want to see my transactions
    Given user are login
    And user on product page
    When user click profile icon
    And user click transaksi button
    Then user see the transactions

  @TCPR5.2
  Scenario: As a user i want to logout
    Given user are login
    And user on product page
    When user click profile icon
    And user click logout icon
    Then user on login page