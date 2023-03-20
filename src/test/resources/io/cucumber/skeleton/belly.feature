Feature: Belly

  Scenario: ate few cakes
    Given I have 42 cakes in my belly
    When I wait 1 minutes
    Then my belly should growl
