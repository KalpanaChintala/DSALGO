Feature: Homepage features of the DSAlgoApplication

  Scenario Outline: User clicks on  GetStarted button "<option>" on home page without sign in
    Given User is on the Home page
    When User clicks on Get Started button on homepage "<option>" without login
    Then User gets warning message "You are not logged in"

    Examples: 
      | option         |
      | Datastructures |
      | Arrays         |
      | Linkedlist     |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          |

  Scenario Outline: User clicks on dropdown "<option>" without sign in
    Given User is on the Home page
    When User clicks on DatastructuresDropdown "<option>"
    Then User gets warning message "You are not logged in"
    Examples: 
      | option     |
      | Arrays     |
      | Linkedlist |
      | Stack      |
      | Queue      |
      | Tree       |
      | Graph      |

  Scenario: Homepage Sign-in link
    Given User is on the Home page
    Then Sign in link should be displayed

  Scenario: Homepage register link
    Given User is on the Home page
    Then Register link should be displayed

  Scenario: Click on Signin takes you to Signin page
    Given User is on the Home page
    When User click on signin link
    Then User lands on Signin page with title "Login"

  Scenario: Click on Register takes you to Register page
    Given User is on the Home page
    When User click on register link
    Then User lands on Register page with title "Registration"
