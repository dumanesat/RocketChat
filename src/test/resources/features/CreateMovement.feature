Feature: Create Movement

  Scenario: Create a Movement
    Given User Logs in
    When User navigates to "Criar Movimentação" page
    And User fills required fields and create movement
    Then User gets "" message
