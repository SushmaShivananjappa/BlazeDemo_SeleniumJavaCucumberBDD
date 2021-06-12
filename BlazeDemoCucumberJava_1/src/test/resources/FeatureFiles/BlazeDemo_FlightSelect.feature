#Author: sushma.gbb@gmail.com

Feature: BlazeDemo>>Flight Select validation
  
Scenario Outline: Verify that the user lands to flight reserve page
 
Given The Web Browser is open
And the user launches BlazeDemo URL
Then the user lands on BlazeDemo page successfully
And the user selects <departure> and <destination>
And user clicks on Find Flight button
Then user is navigated to Flights reserve page
And user choose one of the flight for booking by clicking on Choose this flight button
Then user is navigated to Flights purchase page


Examples:
|departure|destination|
|Paris|Rome|
