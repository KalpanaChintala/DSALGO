Feature: Homepage features of the DSAlgoApplication

  Scenario: Select  drop down menu for Data Structures
    Given User is on the "GetStartedPage"
    Then Assert: Message should be displayed "Message" "You are at the right place"
    When User clicks on element "GetStartedButton"
    Given User is on the "HomePage"
    When User clicks on element "DatastructuresDropdown"
    Then Assert link in "DataStructureNavMenuItems" 
      | Arrays      |
      | Linked List |
      | Stack       |
      | Queue       |
      | Tree        |
      | Graph       |
