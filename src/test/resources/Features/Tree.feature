Feature: Tree page features of the DSAlgoApplication

  Background: 
    Given user has already logged in to application
      | username   | password         |
      | Numpyninja | Codecrafters@123 |

  Scenario: Navigating to Overview of Trees page from Tree page
    Given User is on the tree page
    When User clicks on link Overview of Trees
    Then User lands on Tree page with title  "Overview of Trees"
    When User clicks on Tree page Try Here Button
    Then User lands on the Editor page with title "Assessment"
      When User enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And Clicks on run button
    Then User should be able to see the output

    Examples: 
      | Sheetname | RowNumber |
     | ValidCode |         0 |
     #| ValidCode |         1 |

  Scenario: Navigating to Terminologies page from Tree page
    Given User is on the tree page
    When User clicks on link Terminologies
    Then User lands on Tree page with title  "Terminologies"
    When User clicks on Tree page Try Here Button
    Then User lands on the Editor page with title "Assessment"
      When User enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And Clicks on run button
    Then User should be able to see the output

    Examples: 
      | Sheetname | RowNumber |
     | ValidCode |         0 |
     #| ValidCode |         1 |

  Scenario: Navigating to Types of Trees page from Tree page
    Given User is on the tree page
    When User clicks on link Types of Trees
    Then User lands on Tree page with title  "Types of Trees"
    When User clicks on Tree page Try Here Button
    Then User lands on the Editor page with title "Assessment"
      When User enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And Clicks on run button
    Then User should be able to see the output

    Examples: 
      | Sheetname | RowNumber |
     | ValidCode |         0 |
     #| ValidCode |         1 |

  Scenario: Navigating to Tree Traversals page from Tree page
    Given User is on the tree page
    When User clicks on link Tree Traversals
    Then User lands on Tree page with title  "Tree Traversals"
    When User clicks on Tree page Try Here Button
    Then User lands on the Editor page with title "Assessment"
      When User enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And Clicks on run button
    Then User should be able to see the output

    Examples: 
      | Sheetname | RowNumber |
     | ValidCode |         0 |
     #| ValidCode |         1 |

  Scenario: Navigating to Traversals-Illustration page from Tree page
    Given User is on the tree page
    When User clicks on link Traversals-Illustration
    Then User lands on Tree page with title  "Traversals-Illustration"
    When User clicks on Tree page Try Here Button
    Then User lands on the Editor page with title "Assessment"
      When User enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And Clicks on run button
    Then User should be able to see the output

    Examples: 
      | Sheetname | RowNumber |
     | ValidCode |         0 |
     #| ValidCode |         1 |

  Scenario: Navigating to Binary Trees page from Tree page
    Given User is on the tree page
    When User clicks on link Binary Trees
    Then User lands on Tree page with title  "Binary Trees"
    When User clicks on Tree page Try Here Button
    Then User lands on the Editor page with title "Assessment"
      When User enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And Clicks on run button
    Then User should be able to see the output

    Examples: 
      | Sheetname | RowNumber |
     | ValidCode |         0 |
     #| ValidCode |         1 |
    
    Scenario: Navigating to Types of Binary Trees page from Tree page
    Given User is on the tree page
    When User clicks on link Types of Binary Trees
    Then User lands on Tree page with title  "Types of Binary Trees"
    When User clicks on Tree page Try Here Button
    Then User lands on the Editor page with title "Assessment"
      When User enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And Clicks on run button
    Then User should be able to see the output

    Examples: 
      | Sheetname | RowNumber |
     | ValidCode |         0 |
     #| ValidCode |         1 |

  Scenario: Navigating to Implementation in Python page from Tree page
    Given User is on the tree page
    When User clicks on link Implementation in Python
    Then User lands on Tree page with title  "Implementation in Python"
    When User clicks on Tree page Try Here Button
    Then User lands on the Editor page with title "Assessment"
      When User enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And Clicks on run button
    Then User should be able to see the output

    Examples: 
      | Sheetname | RowNumber |
     | ValidCode |         0 |
     #| ValidCode |         1 |

  Scenario: Navigating to Binary Tree Traversals page from Tree page
    Given User is on the tree page
    When User clicks on link Binary Tree Traversals
    Then User lands on Tree page with title  "Binary Tree Traversals"
    When User clicks on Tree page Try Here Button
    Then User lands on the Editor page with title "Assessment"
      When User enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And Clicks on run button
    Then User should be able to see the output

    Examples: 
      | Sheetname | RowNumber |
     | ValidCode |         0 |
     #| ValidCode |         1 |

  Scenario: Navigating to Implementation of Binary Trees page from Tree page
    Given User is on the tree page
    When User clicks on link Implementation of Binary Trees
    Then User lands on Tree page with title  "Implementation of Binary Trees"
    When User clicks on Tree page Try Here Button
    Then User lands on the Editor page with title "Assessment"
      When User enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And Clicks on run button
    Then User should be able to see the output

    Examples: 
      | Sheetname | RowNumber |
     | ValidCode |         0 |
     #| ValidCode |         1 |

  Scenario: Navigating to Applications of Binary trees page from Tree page
    Given User is on the tree page
    When User clicks on link Applications of Binary trees
    Then User lands on Tree page with title  "Applications of Binary trees"
    When User clicks on Tree page Try Here Button
    Then User lands on the Editor page with title "Assessment"
      When User enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And Clicks on run button
    Then User should be able to see the output

    Examples: 
      | Sheetname | RowNumber |
     | ValidCode |         0 |
     #| ValidCode |         1 |

  Scenario: Navigating to Binary Search Trees page from Tree page
    Given User is on the tree page
    When User clicks on link Binary Search Trees
    Then User lands on Tree page with title  "Binary Search Trees"
    When User clicks on Tree page Try Here Button
    Then User lands on the Editor page with title "Assessment"
      When User enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And Clicks on run button
    Then User should be able to see the output

    Examples: 
      | Sheetname | RowNumber |
     | ValidCode |         0 |
     #| ValidCode |         1 |

  Scenario: Navigating to Implementation Of BST page from Tree page
    Given User is on the tree page
    When User clicks on link Implementation Of BST
    Then User lands on Tree page with title  "Implementation Of BST"
    When User clicks on Tree page Try Here Button
    Then User lands on the Editor page with title "Assessment"
      When User enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And Clicks on run button
    Then User should be able to see the output

    Examples: 
      | Sheetname | RowNumber |
     | ValidCode |         0 |
     #| ValidCode |         1 |
