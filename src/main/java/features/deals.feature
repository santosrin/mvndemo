Feature: Deal data creation

  Scenario: Free CRM Create a new Deal Scenario

    Given user is already on Login Page
    When title of login page is free CRM
    Then user enters username and password
    |santosh310184@yahoo.co.in|Ragh_1234|

    Then user clicks on login button
    Then user is on home page
    Then user moves to new deal page
    Then user enters deal details
    |test deal|1000|50|10|
    Then close the browswer