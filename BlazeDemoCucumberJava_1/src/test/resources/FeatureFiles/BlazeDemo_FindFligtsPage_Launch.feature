#Author: sushma.gbb@gmail.com
Feature: BlazeDemo>>Find Flights Page Validations

  #Scenario: Validate if the BlazeDemo URL is launched successfully
  #Given The Web Browser is open
  #And the user launches BlazeDemo URL
  #Then the user lands on BlazeDemo page successfully
  @SmokeTest
  Scenario Outline: Validate if the Find Flights Page allows user to Find flights for selected Departure and Destination cities
    Given The Web Browser is open
    And the user launches BlazeDemo URL
    Then the user lands on BlazeDemo page successfully
    And the user selects <departure> and <destination>
    And user clicks on Find Flight button
    Then user is navigated to Flights reserve page

    Examples: 
      | departure | destination |
      | Paris     | Rome        |
      | Boston    | London      |
