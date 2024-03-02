Feature: Verifying the Array Functionalities

  Background: 
    Given User has already logged in to application
      | username   | password         |
      | Numpyninja | Codecrafters@123 |

  Scenario Outline: Navigating to the Arrays in Python link from Home Page
    Given User navigates to Array page by using dropdown menu in Home page
    When User set click on Arrays in Python link
    Then User will be navigated to tryeditor Page
    When User enters valid python code in tryEditor from text file "<FilePath>"
    Then User should get appropriate output "Hello, World!"

    Examples: 
      | FilePath                                 |
      | src/test/resources//SamplePythonCode.txt |

  Scenario: Checking the functionality of Array Using List
    Given User is on Array Page
    When User click on Arrays Using List link
    Then User lands on Arrays page with title "Arrays Using List"
    When User clicks on Try Here Button
    Then User lands on the Editor page with title "Assessment"

  Scenario: Checking the functionality of Basic Operations in Lists
    Given User is on Array Page
    When User click on Basic Operations in Lists link
    Then User lands on Arrays page with title "Basic Operations in Lists"
    When User clicks on Try Here Button
    Then User lands on the Editor page with title "Assessment"

  Scenario: Checking the functionality of Applications of Array
    Given User is on Array Page
    When User click on Basic Applications of Array link
    Then User lands on Arrays page with title "Applications of Array"
    When User clicks on Try Here Button
    Then User lands on the Editor page with title "Assessment"
