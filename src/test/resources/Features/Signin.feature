Feature: Validating Login page

  Scenario: The user success login
    Given The user is on Login Page
    When The user clicks Login button after entering "username" and "password"
      | username   | password         |
      | Numpyninja | Codecrafters@123 |
