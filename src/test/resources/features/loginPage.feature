@regression
Feature: AuthorizationPage feature

  Background:
    Given start page is open

  @regression
  Scenario: go to the login page
    Then click the My account button
    And check that the login form is visible

  @regression
  Scenario: authorization in my office
    When the login form is open
    Then add email to the email field
    And click the continue button
    Then add password to the password field
    And click the enter button
    Then check the transition to my account
