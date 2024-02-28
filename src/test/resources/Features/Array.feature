Feature: Verifying the Array Functionalities

  Background: 
  Given User has already logged in to application 

  Scenario Outline: Navigating to the Arrays in Python link from Home Page
    Given User navigates to Array page by using dropdown menu in Home page
    When User set click on Arrays in Python link
    Then User will be navigated to tryeditor Page
    Then User enters valid python code in tryEditor from text file "<FilePath>"
    Then User should get appropriate output
     
    Examples:
    |FilePath|
    |src/test/resources//SamplePythonCode.txt|
