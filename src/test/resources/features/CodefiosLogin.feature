@CodefiosLoginRun
Feature: Techfios billing page login functionality validation

  Scenario: User sould be able to login with valid credential
    Given User is on the techfios login page
    When User enters the username as "demo@codefios.com"
    When User enters the password as "abc123"
    And User clicks on the signin button
    Then User should be able to land on dashboard page
