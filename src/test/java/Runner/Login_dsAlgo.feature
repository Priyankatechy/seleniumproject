
@LF
Feature: Login

  @login
  Scenario: fsdfsdfsd Login with Valid Credentials
    Given User Launch Chrome Browser
    And User opens URL "https://dsportalapp.herokuapp.com"
    And Page Title should be "Numpy Ninja"
    And Get Started button appeared
    And User clicks on the Get Started button
    And User clicks on Sign in button
    When User enters Valid Username as "phoenixteam" and Password as "phoenix123/"
    Then User should be logged in and can see home page
    And Click on Get Started button in Queue section
    And verify editor is working for following pages:
      | implementation-lists       |
      | implementation-collections |
      | Implementation-array       |
      | QueueOp                    |
