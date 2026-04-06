Feature: Cross Endpoint Validation

  Scenario: Validate pet in sold list
    Given I create pet with category
    When I update pet to sold
    Then validate pet exists in sold list