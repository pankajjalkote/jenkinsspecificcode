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
And User enters username
And User enters password with Signin
Then User should get logged into app



