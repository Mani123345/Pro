Feature: Login Functionality

  As a registered user,
  I want to be able to login to the Tesco UK website,
  So that I can access my account and personalized features.
Background: 
Given I am on the Tesco UK login page
  
@Smoke  
Scenario: Successful Login
    
    When I enter my valid username"smanikandanm271@gmail.com" and valid password"Mani@123"
    And I click on the Login"valid login" button
    Then I should be successfully logged in to my account
    
@Sanity 
Scenario: Login with invalid username
   
    When I enter an invalid username"mani" and invalid password"123"
    And I click on the Login"invalid login" button
    Then I should see an error message indicating invalid username or login credentials

