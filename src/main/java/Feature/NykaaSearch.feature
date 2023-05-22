Feature: 

Background:
Given I am from Nykaa Page Scenario

Scenario: Login in Nykaa website with Valid Data
Given I Launch the Application
When I Clicked on Search areas
When I verified that search results
And I Entered the productNames
Then I Selected the data from suggestions

Scenario: Login in Nykaa website without clicking on Valid Data
Given I Launch the Application
And I Entered the productNames
Then I Selected the data from suggestions
When I verified that search results