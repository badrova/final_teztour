@smoke
Feature: TourSelectionPage feature

#  Background:
#    Given start page is open


  @smoke
  Scenario: go to the old site
    Then press to the old site button on the start page

  @smoke
  Scenario: go to the tour selection page
    When tour selected block is shown
    Then click the extended selection link

  @smoke
  Scenario: select a city
    Then open the cities list
    Then select a city in the  cities list

  @smoke
  Scenario: select the country
    Then open the countries list
    Then select the country in the countries list

  @smoke
  Scenario: select a level in the list
    Then open the level list
    Then select a level in the level list

  @smoke
  Scenario: select the type of food
    Then open the food list
    Then select the type of food in the food list

  @smoke
  Scenario: hotel check-in date range
    Then select check-in date from in the calendar
    Then select check-in date to in the calendar

  @smoke
  Scenario: choose the number of nights
    Then add nights number from
    Then add nights number to

  @smoke
  Scenario: select accommodation in the accommodation list
    Then open the accommodation list
    Then select accommodation in the accommodation list

  @regression
  Scenario: selection of a tour by parameters
    When fill fields on the tourSelectionPage page
    Then click the find button
    Then check the result set
    Then click the card price
    Then in a box buy tour click buy button









