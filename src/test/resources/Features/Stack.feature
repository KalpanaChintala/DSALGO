Feature: stackpage

Background: 
    Given user has already logged in to application with username "Numpyninja" and password "Codecrafters@123"

	Scenario: search for Stack struture
		Given User is on the Stack page after loggedin
		When User clicks on link "Operations in Stack"
		Then User lands on page with title "Operations in Stack"
		When User clicks on link "Try here>>>"
    Then User lands on page with title "Assessment"
      When User enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And Clicks on run button
    Then User should be able to see the output

    Examples: 
      | Sheetname | RowNumber |
     | ValidCode |         0 |
     #| ValidCode |         1 |
    
  Scenario: search for Stack struture
		Given User is on the Stack page after loggedin
		When User clicks on link "Implementation"
		Then User lands on page with title "Implementation"
		When User clicks on link "Try here>>>"
    Then User lands on page with title "Assessment"
      When User enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And Clicks on run button
    Then User should be able to see the output

    Examples: 
      | Sheetname | RowNumber |
     | ValidCode |         0 |
     #| ValidCode |         1 |
    
  Scenario: search for Stack struture
		Given User is on the Stack page after loggedin
		When User clicks on link "Applications"
		Then User lands on page with title "Applications"
		When User clicks on link "Try here>>>"
    Then User lands on page with title "Assessment" 
      When User enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And Clicks on run button
    Then User should be able to see the output

    Examples: 
      | Sheetname | RowNumber |
     | ValidCode |         0 |
     #| ValidCode |         1 | 
    
    Scenario: Switching between different links on Stack
    Given User is on the Stack page after loggedin
   When User clicks on link "Operations in Stack"
    Then User lands on page with title "Operations in Stack"
    When User clicks on link "Implementation"
  	Then User lands on page with title "Implementation"
    When User clicks on link "Applications"
    Then User lands on page with title "Applications"
     When User clicks on link "Practice Questions"
    Then User lands on page with title "Practice Questions"  
	 
	
	