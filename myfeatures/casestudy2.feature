Feature: my validation for aws login

Scenario: Registraton in AWS b
Given user is given AWS site access b
Then user enters valid data for registration b
And user clicks on signup button b


Scenario Outline: Login validation in AWS site b
Given Application is launched and user have access to login site b
Then user enters valid credentials "<userID>"
And user enter the password "<passW>"
Then user clicks on login button b

Examples:
|userID |passW|
|Raway@123|Rawat123|
|kumar@gmail.com|Kumar123|
