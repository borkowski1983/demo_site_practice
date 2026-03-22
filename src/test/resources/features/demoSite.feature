Feature: Login function on demoSitePractise

  Scenario: Login to page
    Given User launches the page
    When User type 'student' in 'username' field
    And User type 'Password123' in 'password' field
    And User click 'Submit' button
#    Then System displays a message 'Logged In Successfully'