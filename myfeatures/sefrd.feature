Feature: my validation on Mercury application
@Sanity
Scenario: user access to signup in website
Given Mercury website is launched
And user clicks on sign up button
When user enters proper data
Then click on submit button for account creation
@Smoke, @Regression
Scenario: user login to login for registered Member
Given registered user click on cignin button
Then he provides valid data for login input fields
And Click on submit button for the login validation
@Smoke 
Scenario: user access to book flight
Given user verifies the flights available
Then select the desired flight
When user makes payment
Then Tickets are generated