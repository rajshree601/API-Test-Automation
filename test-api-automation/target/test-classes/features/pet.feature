Feature: Pet Lifecycle

  Scenario: CRUD operations on pet
    Given I create a pet
    When I get the pet
    Then validate pet details
    When I update pet status to sold
    Then I delete the pet