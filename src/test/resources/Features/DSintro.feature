Feature: Data Structures Introduction Page features of the DSAlgoApplication

  Background: 
    Given user has already logged in to application
      | username   | password         |
      | Numpyninja | Codecrafters@123 |

  Scenario Outline: Navigating to Data Structures Introduction Page
    Given User is on the Data Structures Introduction Page
    When User clicks on link Time Complexity
    Then User lands on Data Structures Introduction Page with title  "Time Complexity"
    When User clicks on Data Structures Introduction Page Try Here Button
    Then User lands on the Editor page with title "Assessment"
    When User enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And Clicks on run button
    Then User should be able to see the output

    Examples: 
      | Sheetname | RowNumber |
      | ValidCode |         0 |
