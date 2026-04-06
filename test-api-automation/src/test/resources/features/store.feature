Feature: Inventory

  Scenario: Validate available pets count
    When I get store inventory
    Then I count available pets
    And validate with findByStatus API