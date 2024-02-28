Feature: Verifying Graph functionalites

 Background:
 Given: User is already logged into the application

    Scenario: Navigating to the Graph from Home Page
    Given User navigates to Graph page by using dropdown menu in Home page
    When User clicks on the Graph
   ##Then User is navigated to the Graph Page 
    When User clicks on Try here
    Then user will be navigated to the Tryeditor Page 

    Scenario: Navigating to the Graph Represtations from Home Page
    Given User navigates to Graph page by using dropdown menu in Home page
    When User clicks on the Graph Represtations
    Then User is navigated to the Graph Represtations
    When User clicks on Try here
    Then user will be navigated to the Tryeditor Page 

