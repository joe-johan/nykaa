Feature: Adding a product to cart

Scenario: Add to cart Module

Given user can navigate to nykaa.com
When user is in the homepage of nykaa
And user can select the face wash from header
And user can select the required product
And user can click the button add to cart 
Then the product is successfully added in the cart