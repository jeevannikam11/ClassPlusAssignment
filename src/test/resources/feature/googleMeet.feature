Feature: GoogleMeet assignment tests

  @TestNow
  Scenario Outline: Test google meet functionality for mute button
    Given Open google meet app on browser "<browserName>"
    And Click on start meeting button
    And Enter user email "<emailId>" and password "<password>"
    And Click on mute microphone button
    Examples:
      | browserName | emailId                     | password  |
      | chrome      | test.jeevan.nikam@gmail.com | Test@1234 |
