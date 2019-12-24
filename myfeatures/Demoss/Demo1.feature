Feature: test code by srini


Scenario Outline: testpass verfication 
Given I enter username "<MYUn>"
And I enter the valid password "<MyPass>"
Examples:
		|MYUn|MyPass|
		|sriniin|Pass123|
		|srgn|Pass4523|