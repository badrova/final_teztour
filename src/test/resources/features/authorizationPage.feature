@smoke
Feature: AuthorizationPage feature

  Background:
    Given start page is open

  @regression
  Scenario: go to the login page
    Then click the My account button

  @regression
  Scenario: authorization in my office
    When the login form is open
    Then add email to the email field
    And click the continue button
    Then check the transition to my account
