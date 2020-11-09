
Feature: Validate the Login function
Scenario: Successful Login and Logout with valid credentials
	Given user open the chrome browser
	When user open "https://admin-demo.nopcommerce.com/login"
	And enter username as "admin@yourstore.com" and password as "admin"
	And click on login button
	Then Page title should be "Dashboard / nopCommerce administration"
	When user ckick on logout button
	Then Page title should be "Your store. Login"
	And close the browser