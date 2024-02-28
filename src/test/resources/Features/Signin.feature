Feature: SignIn features of the DSAlgoApplication

  Scenario: Validating Signin button with all fields empty
    Given User is on the LoginPage
    When User clicks on Signin button
    Then An error message "Please fill out this field."  is displayed below Username textbox

  Scenario: Validating Signin button after entering Username and all other fields empty
    Given User is on the LoginPage
    When User enters valid Username into the username textbox
      | Username |
      | Numpyninja  |
    And User clicks on Signin button
    Then An error message "Please fill out this field."  is displayed below Password textbox

  Scenario: Validating Signin button with valid username and password
    Given User is on the LoginPage
    When User enters valid username and password
      | Username |   |Password|
      | Numpyninja  || Codecrafters@123 |
    And User clicks on Signin button
    Then A message You are logged in is displayed 
    
  Scenario: Validating Signout button 
    Given User is on the LoginPage
    When User clicks signout button
    Then A message You are logged out is displayed 
    
  Scenario: Validating Signin button with invalid username and password
    Given User is on the LoginPage
    When User enters Invalid username and password
       | Username|
       |djhdbchbd|
       |Password|
       |nnnmnfgsfgs|
    And User clicks on Signin button
    Then An error message Invalid username and password is displayed