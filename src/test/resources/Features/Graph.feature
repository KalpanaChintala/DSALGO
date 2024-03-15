Feature: Verifying Graph functionalites

  Background: 
    Given user has already logged in to application
      | username   | password         |
      | Numpyninja | Codecrafters@123 |

  Scenario Outline: Navigating to the Graph link from Home Page
    Given User navigates to Graph page by using dropdown menu in Home page
    When User clicks on the Graph
    And User clicks on Try here
    When User enters python code in tryEditor from text file "<FilePath>"
    Then User should get output "Hello, World!"

    Examples: 
      | FilePath                                 |
      | src/test/resources//SamplePythonCode.txt |

  Scenario: Navigating to the Graph Represtations link from Home Page
    Given User navigates to Graph page by using dropdown menu in Home page
    When User clicks on the Graph Represtations
    Then User is navigated to the Graph Represtations
