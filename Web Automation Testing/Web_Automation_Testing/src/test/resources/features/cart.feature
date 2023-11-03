Feature: As a user i want to see product in cart so that i can buy it

  @TCC4.1
  Scenario: As a user i want to add quantity of product but not login
    Given user on product page
    And user click beli button
    And user click cart button
    And user on cart page
    When user click plus icon
    Then user see quantity of product increases successfully

  @TCC4.2
  Scenario: As a user i want to substract quantity of product but not login
    Given user on product page
    And user click beli button
    And user click cart button
    And user on cart page
    And user click plus icon
    When user click min icon
    Then user see quantity of product reduces successfully

  @TCC4.3
  Scenario: As a user i want to remove product form cart but not login
    Given user on product page
    And user click beli button
    And user click cart button
    And user on cart page
    When user click min icon
    Then user see "Order Is Empty!"

  @TCC4.4
  Scenario: As a user i want to checkout product but not login
    Given user on product page
    And user click beli button
    And user click cart button
    And user on cart page
    When user click bayar button
    Then user on login page

  @TCC4.5
  Scenario: As a user i want to add quantity of product
    Given user are login
    And user on product page
    And user click beli button
    And user click cart button
    And user on cart page
    When user click plus icon
    Then user see quantity of product increases successfully

  @TCC4.6
  Scenario: As a user i want to substract quantity of product
    Given user are login
    And user on product page
    And user click beli button
    And user click cart button
    And user on cart page
    And user click plus icon
    When user click min icon
    Then user see quantity of product reduces successfully

  @TCC4.7
  Scenario: As a user i want to remove product form cart
    Given user are login
    And user on product page
    And user click beli button
    And user click cart button
    And user on cart page
    When user click min icon
    Then user see "Order Is Empty!"

  @TCC4.8
  Scenario: As a user i want to checkout product
    Given user are login
    And user on product page
    And user click beli button
    And user click cart button
    And user on cart page
    When user click bayar button
    Then user on transactions page