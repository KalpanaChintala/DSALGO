Feature: Validating Login page

Scenario: The user success login
    Given The user is on Login Page
    When The user clicks Login button after entering "username" and "password"
      | username       | password     |
      | Numpyninja | Codecrafters@123 |
    Then User should be landed on homepage
      
Scenario: Validating with Invalid username and password
    Given The user is on Login Page
    When The user clicks Login button after entering "username" and "password"
      | username       | password     |
      | Kalpana | Ninjas@456 |
    Then User should be able to see the message displayed "Invalid Username and Password"

Scenario: Validating with empty username and password
    Given The user is on Login Page
    When The user clicks Login button
    Then User should be able to see the alert message "Please fill out this field."   