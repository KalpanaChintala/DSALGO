Feature: Homepage features of the DSAlgoApplication

  Scenario: Validating Homepage
    Given User launches chrome browser
    When User opens DS-Algo Portal Link " https://dsportalapp.herokuapp.com/"
    Then User should see the page with "Get Started" button.
    
    Given User launches chrome browser
    When User clicks on "Get Started" button
    Then User should land on page with 6 panes with different data structures
    
    Given User opens homepage
    When User clicks "Data Structures" drop down
    Then I shouls see 6 different data structure entries in that dropdown
    
    Given User opens homepage
    When User selects any datastructure from dropdown
    Then It should alert the user with a message "You are not logged in"
    