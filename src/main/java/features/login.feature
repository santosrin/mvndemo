Feature: Free CRM Login Feature

# Without example keyword
#  Scenario: Free CRM Login Test Scenario
#
#    Given user is already on Login Page
#    When title of login page is free CRM
#    Then user enters "santosh310184@yahoo.co.in" and "Ragh_1234"
#    Then user clicks on login button
#    Then user is on home page


#With example keyword
  Scenario Outline: Free CRM Login Test Scenario

    Given user is already on Login Page
    When title of login page is free CRM
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user is on home page
    Then close the browswer

  Examples:
    |username|password|
    |santosh310184@yahoo.co.in|Ragh_1234|
    |tom                      |test456  |