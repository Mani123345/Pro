Feature: Registration Functionality
  As a New user,
  I want to Create a account to the Tesco UK website,
  So that I can Login with valid credentials

Scenario: Successful Registration 
When I enter my valid Details
And I click on the Create Account button
Then I should be successfully logged in to my Homepage

Scenario: UnSuccessful Registration 
When I enter my invalid Details
And I click on the Create Account button
Then I should not be successfully logged in to my Homepage
