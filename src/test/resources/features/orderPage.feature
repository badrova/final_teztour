@smoke
Feature: OrderPage feature

#  Background:
#    Given start order page is open


  @regression
  Scenario: fill order
    Given start order page is open
    Then go to tourist information
    Then fill all fields on the page: Surname=<surname>, Name=<name>, NationalityId=<nationalityId>, Birthday=<birthday>, IsFemale=<isFemale>, IsMale=<isMale>, PassportSeria=<passportSeria>, PassportNumber=<passportNumber>, PassportExpirationDate=<passportExpirationDate>, Inn=<inn>, Phone=<phone>
    Then click the data validation button
    Then check validation success

    Examples:
      |surname |name   |nationalityId|birthday   |isFemale |isMale|passportSeria|passportNumber |passportExpirationDate |inn            |phone         |
      |Badrova |Alesia |BELARUS      |01.01.1990 |true     |false |     MP      |2525185        |25.09.2025             |1002525A007PB2 |+375291234545 |
#
#
#  @regression
#  Scenario: checking tourist data
#    When check surname and passport number
#    Then click the checkout button
#
#
#  @regression
#  Scenario: selection of the type of purchase of the tour
#    When the form for choosing the type of purchase has opened
#    Then click the continue button without registration
#
#  @regression
#  Scenario Outline: filling in buyer's personal data
#    When fill all fields on the page: Surname=<surname>, Name=<name>, MName=<mName>, Birthday=<birthday>, PassportSeria=<passportSeria>, PassportNumber=<passportNumber>, PassportExpirationDate=<passportExpirationDate>, nationalityId=<nationalityId> , Phone=<phone>, Email=<email>
#    And select the checkbox I agree with the terms of the agreement
#    Then click the pay button
#
#    Examples:
#      |surname |name   |mName     |birthday   |passportSeria|passportNumber |passportExpirationDate | nationalityId | phone         | email               |
#      |Badrova |Alesia |Sergeevna |01.01.1990 |     MP      |2525185        |25.09.2025             | BELARUS       | +375291234545 | a.badrova@gmail.com |

