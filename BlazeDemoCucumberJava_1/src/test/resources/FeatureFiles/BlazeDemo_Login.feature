#Author: Sushma Shivananjappa
#Created on : 06/07/2021
#Description : BalzeDemo Login page validation
@Login_Feature
Feature: This Feature file consists of Test cases to validate BlazeDemo Login page

  @SmokeTest @RegressionTest
  Scenario: Validate if login page has all the necessary fields
    Given User is on Login Page
    Then login pane should have email address text field
    And login pane should have password text field
    And login pane should have remember me check box
    And login pane should have Forgot your password hyperlink
    And login page should have Login button
