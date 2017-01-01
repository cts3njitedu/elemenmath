Feature: Performing elementary mathemtic functions

  Scenario: lcm of list of numbers
    Given a list of numbers
    When I attempt to find the least common multiple
    Then I should receive the correct result
