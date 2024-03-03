Feature: LinkedListpage 

  Background: 
    Given user has already logged in to application with username "Numpyninja" and password "Codecrafters@123"
    
      
  Scenario: Search for LinkedList structure
    Given User is on the LinkedList page after loggedin
    When User clicks on link "Introduction"     
    Then User lands on page with title "Introduction"
    When User clicks on link "Try here>>>"
    Then User lands on page with title "Assessment"

	Scenario: Search for LinkedList structure
    Given User is on the LinkedList page after loggedin
    When User clicks on link "Types of Linked List"     
    Then User lands on page with title "Types of Linked List"
     When User clicks on link "Try here>>>"
    Then User lands on page with title "Assessment"
    
	Scenario: Search for LinkedList structure
    Given User is on the LinkedList page after loggedin
    When User clicks on link "Implement Linked List in Python"     
    Then User lands on page with title "Implement Linked List in Python"
     When User clicks on link "Try here>>>"
    Then User lands on page with title "Assessment"

	Scenario: Search for LinkedList structure
    Given User is on the LinkedList page after loggedin
    When User clicks on link "Traversal"     
    Then User lands on page with title "Traversal"
     When User clicks on link "Try here>>>"
    Then User lands on page with title "Assessment"


	Scenario: Search for LinkedList structure
    Given User is on the LinkedList page after loggedin
    When User clicks on link "Insertion"     
    Then User lands on page with title "Insertion"
     When User clicks on link "Try here>>>"
    Then User lands on page with title "Assessment"


  Scenario: Search for LinkedList structure
    Given User is on the LinkedList page after loggedin
    When User clicks on link "Deletion"   
    Then User lands on page with title "Deletion"
    When User clicks on link "Try here>>>"
    Then User lands on page with title "Assessment"
    
     Scenario: Switching between different links on Stack
    Given User is on the LinkedList page after loggedin
     When User clicks on link "Introduction"
    Then User lands on page with title "Introduction"
    When User clicks on link "Types of Linked List"
  	Then User lands on page with title "Types of Linked List"
    When User clicks on link "Implement Linked List in Python"
    Then User lands on page with title "Implement Linked List in Python"
    When User clicks on link "Traversal"
    Then User lands on page with title "Traversal"
    When User clicks on link "Insertion"
  	Then User lands on page with title "Insertion"
    When User clicks on link "Deletion"
    Then User lands on page with title "Deletion"
     When User clicks on link "Practice Questions"
    Then User lands on page with title "Practice Questions"  
	 
	
	

    

     

	

  
  