Feature: aFeature file for registration on TestMeApp

Background: aTestMeApp site is launched
Given aSite is opened on browser

@case1
Scenario Outline: auser have access to home page
Given aClick on SignUP button
Then auser enter username "<unamez>"
And auser enter first name "<fnamez>"
When auser enter the last name "<lnamez>"
Then auser fill required data
Then auser clicks om register button
Examples:
|unamez|fnamez|lnamez|
|nikhil|alpha|bravo|
|ekansha|ekansh|arora|
|kunalsh|kunal|sherawat|

@case2
Scenario Outline: aUser have access to sign in page
Given ause clicks on signin 
Then auser enter the username "<usname>"
And auser enters the password "<pword>"
Then auser click on login button

Examples:
|usname|pword|
|nikhil|password54|
|ekansha|password54|
|kunalsh|password54|

@case3
Scenario: auser logout from site
Given auser perform logout 
