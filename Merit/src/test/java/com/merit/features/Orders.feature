
Feature: This is the login feature for Merit Gift Shop
Scenario: To login user webpage in Merit Gift Shop
	Given user is on login page
	When the user enters the "username"and "password" credentials
	And clicks on the login button
	Then the user should be navigate to home page

	
Scenario: To place a order in Merit Gift Shop 	
Given User is on Home Page 
When the user click "Shop Now" 
And clicks on the product "add to Cart" 
And open Cart and click "Check Out"
And click "place order"
Then the user should be navigate to invoice copy

Scenario: To order a product in Merit Gift Shop
Given user is on user login page
When the user enter username and password and click the submilt button
And click the product
Then user give the seller information 

#2
#new
Scenario: To add track order and update delivery status in pending
Given admin logged in with valid credentials
Then select pending orders from orders
Then search order id to add track order 
And change delivery status to processing
And confirm the status change  
#3
#new
Scenario: To update track order and delivery status in processsing
Given admin logged in with valid credentials
Then select processing orders from orders
Then search order id to update track order 
And change delivery status to completed
And confirm the status update 
#4 
#new
Scenario: To delete track order in completed orders
Given admin logged in with valid credentials
Then select completed orders from orders
Then search order id to delete track order 
And confirm the delete order status  

Scenario: To move the pending order product from pending status to declined status
Given user is on admin login page
When user enter orderid in pending order searchbox 
And click the delivery satus option in action
And Enter the delivery status and save the page
Then check the declined id in declined order 

 