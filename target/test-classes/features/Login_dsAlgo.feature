
@dsalgo
Feature: Review Data Structure

  @queue
  Scenario: Review Queue section     
    Given User logged in to dsportalapp
    When User reviews queue section
    Then user is able to navigate to following pages:
    	| implementation-lists       |
      | implementation-collections |
      | Implementation-array       |
      | QueueOp                    |
    