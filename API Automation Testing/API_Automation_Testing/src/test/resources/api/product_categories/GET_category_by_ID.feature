Feature: GET - Category by ID
  As a user
  I want to see list of product categories
  So that i can see category by ID

  @TCC2.1
  Scenario: GET - As a user i want to get category by ID with valid endpoint
    Given user set GET valid endpoint for category by ID
    When user send GET HTTP request with valid endpoint for category by ID
    Then user received valid GET HTTP response code 200 for category by ID

  @TCC2.2
  Scenario: GET - As a user i want to get category by ID with invalid endpoint
    Given user set GET invalid endpoint for category by ID
    When user send GET HTTP request with invalid endpoint for category by ID
    Then user received GET HTTP response code 404 for category by ID

  @TCC2.3
  Scenario: GET - As a user i want to get category by ID
    Given user set GET valid endpoint for category by ID
    When user send GET HTTP request with valid endpoint for category by ID
    Then user received valid GET HTTP response code 200 for category by ID
    And user received valid data for category by ID