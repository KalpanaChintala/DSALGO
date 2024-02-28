Feature: DSIntro feature

Background: 
    Given user has already logged in to application
    
Scenario: Validating DSIntroduction attribute
  
  When User clicks Data-Structures Introduction "Get Started" button
  Then User should land on page with QA and Time Complexity down
  Given User on DataStructure Introduction page
  When User clicks on "Time Complexity"
  Then User should land "Time Complexity " with "Try here" button down
  When User clicks on "Try here" button
  Then User should land on page with try editor box and Run button to test
  When User clicks on "Practice Questions"
  Then User should be redirected to the practice questions page
  
  