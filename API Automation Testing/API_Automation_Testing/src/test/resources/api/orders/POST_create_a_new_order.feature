Feature: POST - Create a new order
  As a user
  I want to see list of orders
  So that i can create a new order

  Background:
    Given user set authentication endpoint
    And user send authentication endpoint

  @TCO1.1
  Scenario: POST - as a user i want to create a new order with valid endpoint
    When user set POST valid endpoint for create new order
    And user send POST HTTP request for create new order
    Then user received HTTP response code 200 for create new order

  @TCO1.2
  Scenario: POST - as a user i want to create a new order with invalid endpoint
    When user set POST invalid endpoint for create new order
    And user send POST HTTP request with invalid endpoint for create new order
    Then user received POST HTTP response code 404 for create new order

  @TCO1.3
  Scenario: POST - as a user i want to create a new order with empty request body
    When user set POST valid endpoint for create new order
    And user send POST HTTP request for create new order with empty request body
    Then user received HTTP response code 200 for create new order