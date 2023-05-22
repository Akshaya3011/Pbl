Feature: Searching Brand names

Background:
   Given Hello from background

@Brands
Scenario: Search Valid Brand Name
Given I Launched the application
When I Hovered over the Brands Tab
When I Searched for a valid BrandName
Then I Verified that brandname got searched successfully
 
 
@Brands-Invalid
Scenario: Search Invalid Brand Name
Given I Launched the application
When I Hovered over the Brands Tab
When I Searched for a valid BrandName
Then I Verified that brandname got searched successfully




 
  