@Tag_1
Feature: Main page tests on demoSitePractise

  Scenario: Main page tests
    Given User launches the main page
    Then System displays menu bar with items:
      | HOME     |
      | PRACTICE |
      | COURSES  |
      | BLOG     |
      | CONTACT  |
    And System in header displays image with the title "Practice Test Automation"