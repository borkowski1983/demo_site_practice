@Tag_2
Feature: Login function on demoSitePractise

  Scenario: Login to page
    Given User launches the main page
    When User click 'Practice' on main bar
    Then System displays "Practice" page
    When User click 'Test Login Page' on Practice page
    And User type 'student' in 'username' field
    And User type 'Password123' in 'password' field
    And User click 'Submit' button
    Then System displays a message 'Logged In Successfully'