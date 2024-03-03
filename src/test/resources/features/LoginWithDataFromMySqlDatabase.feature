@DataFromMySqlFeature 
Feature: Codefios page login functionality validation

Background: 
	Given User is on the codefios login page
	

@DBScenario1 
Scenario: User should be able to login with valid credential
	When User enters "username" from mysql database
	When User enters "password" from mysql database
	And User clicks on sign in button
	Then User should be able to land on dashboard page