Feature: As a user i want to see product so that i can order product

  @TCP3.1
  Scenario: As a user i want to see detail product but not login
    Given user on product page
    When user click detail button
    Then user see detail product successfully

  @TCP3.2
  Scenario: As a user i want add product to cart but not login
    Given user on product page
    When user click beli button
    And user click cart button
    Then user see product in cart

  @TCP3.3
  Scenario: As a user i want to see detail product
    Given user are login
    And user on product page
    When user click detail button
    Then user see detail product successfully

  @TCP3.4
  Scenario: As a user i want add product to cart
    Given user are login
    And user on product page
    When user click beli button
    And user click cart button
    Then user see product in cart