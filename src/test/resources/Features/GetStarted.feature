Feature: GetStartedPage Feature

  Scenario: Validating the message displayed on the GetStartedPage
    Given User is on GetStartedPage
    Then You are at the right place message should be displayed
  
    Scenario: Click on GetStarted takes you to Home page
    Given User is on GetStartedPage
    When User click on GetStartedButton
    Then User lands on Homepage with title Numpyninja