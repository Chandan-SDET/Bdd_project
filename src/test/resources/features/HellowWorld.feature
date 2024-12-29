Feature: Hello World Scenario

  Scenario: Say hello to the world
    Given I say "Hello World"
    Then I should see "Hello World"



  Scenario Outline: Say hello to the world
    Given I say "<User>"
    Then I should see "<password>"

    Examples:
    |User | password |
    |tom| dream boy |
    |jerry|handsome |
    |Ben| bigben    |



