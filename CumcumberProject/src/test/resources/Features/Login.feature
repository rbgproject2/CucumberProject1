Feature: feature to test login functionality

  Scenario: Check login is successful with valid crendentials
    Given user is on login page
    When user enters username and password
    And Click on login button
    Then user is the navigated to the home page
