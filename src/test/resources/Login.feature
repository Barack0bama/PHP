@regressiontest 
Feature: Validate login function phptravels and for 
	Dubai, United Arab Emirates book the room for adult  and child 
and fiend out the total price
Scenario: Login successful and room booking 
	Given user open web browser and navigate to phptravels login screen 
	Then user Navigate to Page and verify the Page Title Is "PhpTravels" 
	And user enter a valid username and Password 
	And user click the Loing button 
	And user click on the Home button 
	Then user Select destination as Dubai, United Arab Emirates 
	And Check-in date next month and check out next month 
	And user Select how maney pepole and click search button 
	And user able to see all price in descending order 
	Then user can Select the second hotel from the list by clicking the DETAILS button 
	And user click on see price and date button on the top right and select the first room and remember the price 
	Then user Then click BOOK NOW button for checkout 
	And user On the next page verify Total Amount is greater than Room Price, 
	When user close the window and logout 
   Then user navigate to page and verify the page title is "PhpTravels"