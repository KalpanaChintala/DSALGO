Feature: Homepage features of the DSAlgoApplication

  Scenario: Select  drop down menu for Data Structures
    Given User is on the HomePage
    When User clicks on element DatastructuresDropdown
    Then Verify all the links in DataStructureNavMenuItems"
      | Arrays      |
      | Linked List |
      | Stack       |
      | Queue       |
      | Tree        |
      | Graph       |
      And Dropdown section count should be 6

   Scenario: Homepage Sign-in link 
    Given User is on the HomePage
    Then Sign in link should be displayed
    
    Scenario: Homepage register link
    Given User is on the HomePage
    Then Register link should be displayed 
    
    Scenario: Select  an item from the  drop down menu for Data Structures
    Given User is on the HomePage
    When User clicks on element DatastructuresDropdown
    And User clicks on link Arrays
    Then You are not logged in message should be displayed
    
    Scenario: Homepage Data Structures-Introduction GetStartedButton
    Given User is on the HomePage
    When User clicks on Data Structures-Introduction GetStartedButton
    Then You are not logged in message should be displayed
    
    Scenario: Click on Signin takes you to Signin page
    Given User is on HomePage
    When User click on signin link
    Then User lands on Signin page with title ........
    
    Scenario: Click on Register takes you to Register page
    Given User is on HomePage
    When User click on register link
    Then User lands on Register page with title ........