Feature: Home page functionality
Scenario: validate title
Given User is at the landing page
Then Page title should contains "Shopping"

Scenario: verify cart icon
Given User is at the landing page
Then Cart icon should get display

Scenario: Checkout the deals section
Given User is at the landing page
When User click on summer section deal

Scenario: Login to app
Given User is at the landing page
When User click on signin button
And User enter username as "8176867662"
And User enters password as "123456" with Signin
