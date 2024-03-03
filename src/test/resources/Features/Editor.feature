Feature: Editor page features of the DSAlgoApplication

  Scenario Outline: Verifying output for valid python code
    Given User is on the editor page
    When User enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And Clicks on run button
    Then User should be able to see the output

    Examples: 
      | Sheetname | RowNumber |
      | ValidCode   |         0 |
      | ValidCode   |         1 |
