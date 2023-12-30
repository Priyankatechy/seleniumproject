#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@LF
Feature: Login
  

  @login
  
  Scenario: Successful Login with Valid Credentials
     
    Given User Launch Chrome Browser
    
    And User opens URL "https://dsportalapp.herokuapp.com"
    And Page Title should be "Numpy Ninja"
    And  Get Started button appeared
    And User clicks on the Get Started button
   	And User clicks on Sign in button
    When User enters Valid Username as "phoenixteam" and Password as "phoenix123/"
    
    
    Then User should be logged in and can see home page
    
	And Click on Get Started button in Queue section
#	And Click on "Implementation of Queue in Python" link under Topics Covered section
#	And Click on "Try here" button on Implementation of Queue in Python page
#	And Type "print('Hello World')" on Assessment page
#	And Click on Run button
#	And Verify Hello World should be printed
#	
#	And Go to the page for "queue"
#	And Click on the "Implementation using collections.deque" link under Topics Covered section
#	And Click on "Try here" button on Implementation using collections.deque page
#	And Type "print('Hello World')" on Assessment page
#	And Click on Run button
#	And Verify Hello World should be printed
#	
#	And Go to the page for "queue"
#	And Click on the "Implementation using array" link under Topics Covered section
#	And Click on "Try here" button on Implementation using array page
#	And Type "print('Hello World')" on Assessment page
#	And Click on Run button
#	And Verify Hello World should be printed
#	
#	And Go to the page for "queue"
#	And Click on the "Queue Operations" link under Topics Covered section
#	And Click on "Try here" button on Queue Operations page
#	And Type "print('Hello World')" on Assessment page
#	And Click on Run button
#	And Verify Hello World should be printed

	And verify editor is working for following pages:
	|implementation-lists|
	|implementation-collections|
	|Implementation-array|
	|QueueOp|
	
	
    
