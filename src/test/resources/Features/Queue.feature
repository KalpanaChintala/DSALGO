Feature: Queue page features of the DSAlgoApplication

  Background: 
    Given user has already logged in to application
      | username   | password         |
      | Numpyninja | Codecrafters@123 |

  Scenario: Navigating to Implementation of Queue in Python page from Queue page
    Given User is on the queue page
    When User clicks on link Implementation of Queue in Python
    Then User lands on Queue page with title  "Implementation of Queue in Python"
    When User clicks on Queue page Try Here Button
    Then User lands on the Editor page with title "Assessment"

  Scenario: Navigating to Implementation using collections.deque page from Queue page
    Given User is on the queue page
    When User clicks on link Implementation using collections.deque
    Then User lands on Queue page with title  "Implementation using collections.deque"
    When User clicks on Queue page Try Here Button
    Then User lands on the Editor page with title "Assessment"

  Scenario: Navigating to Implementation using array page from Queue page
    Given User is on the queue page
    When User clicks on link Implementation using array
    Then User lands on Queue page with title  "Implementation using array"
    When User clicks on Queue page Try Here Button
    Then User lands on the Editor page with title "Assessment"

  Scenario: Navigating to Queue Operations page from Queue page
    Given User is on the queue page
    When User clicks on link Queue Operations
    Then User lands on Queue page with title  "Queue Operations"
    When User clicks on Queue page Try Here Button
    Then User lands on the Editor page with title "Assessment"
    
    Scenario: Switching between different links on Queue
    Given User is on the queue page
   When User clicks on link Implementation of Queue in Python
    Then User lands on Queue page with title  "Implementation of Queue in Python"
    When User clicks on link Implementation using collections.deque
    Then User lands on Queue page with title  "Implementation using collections.deque"
    When User clicks on link Implementation using array
    Then User lands on Queue page with title  "Implementation using array"
    When User clicks on link Queue Operations
    Then User lands on Queue page with title  "Queue Operations"
     When User clicks on link Practice Questions
    Then User lands on Queue page with title  "Practice Questions"
