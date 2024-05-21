#Author: rbalaji0605@gmail.com
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
@tag
Feature: To test the drawing functionality in canvas webpage
  

@demo
  Scenario: Verify if user ables to draw line and rectangle
    Given User navigates to canvas webpage
    When User clicks draw a line option
    And User draws a vertical line
    And User draws a horizontal line
    When User clicks draw a rectangle option
    And User draws a rectangle
    When User clicks eraser option
    And User erases the horizontal line
  