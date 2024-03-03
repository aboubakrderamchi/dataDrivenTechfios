@CodefiosOtherLoginRun
Feature: Techfios billing page login functionality validation

  Background: 
    Given User is on the techfios login page

  @OtherScenario
  Scenario Outline: User should be able to login with valid credential
    When User enters the username as "<username>"
    When User enters the password as "<password>"
    And User clicks on the signIin button
    Then User should be able to land on dashboard page

    Examples: 
      | username           | password |
      | demo@codefiod.com  | abc123   |
      | demo1@codefiod.com | abc123   |
      | demo@codefiod.com  | abc124   |
