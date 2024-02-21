Feature: Login scenarios of the DSALGO Application

  Scenario: Login into DSALGO Application without password
    Given User opens homepage
    When User clicks on "Sign In" button on right side
    Then User should land on page with "UserName and Password" boxes
    When User clicks on "Login" button
    Then Assert: It should display an error "Please fill out this field" below Username textbox
    And User enters Userrname and clicks "Login" button
    Then Assert:It should display an error "Please fill out this field" below Password textbox
    

  Scenario: Login into DSALGO Application with valid username and password
    Given User opens "Login" page
    When User enters into Textbox "Username" "Numpyninja"
    And User enters into Textbox "Password" "Codecrafters@123"
    And User clicks on "Login" button
    Then User should land on page with message "You are logged in" and with the user name on the top.
    

  Scenario: Login into DSALGO Application with invalid username and password
    Given User opens "Login" page
    When User enters invalid Username and Password
    And User clicks on "Login" button
    Then It should display an error "Invalid Username and Password"
    And User enters valid Username and invalid Password
    And User clicks on "Login" button
    Then It should display an error "Invalid Username and Password"
    When User enters invalid Username and valid Password
    And User clicks on "Login" button
    Then It should display an error "Invalid Username and Password"
  
  Scenario: Signout from DSALGO Application
    Given User should land on page with message "You are logged in" and with the user name on the top.
    When User clicks on "Signout" button
    Then User should be redirected to the page with messgae "You are loggedout successfully"
    
   

  