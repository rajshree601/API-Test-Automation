Feature: User Negative Testing

  Scenario: Invalid user operations
    When I create user with invalid email
    Then I get non existing user
    And validate login failure