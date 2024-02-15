Feature: GetStartedPage Feature

  Scenario: Validating the message displayed on the GetStartedPage
    Given User is on GetStartedPage
    Then "You are at the right place" message should be displayed

 