Feature: To Valitdate the login functionality 

Background:
Given User have to lanuch chrome and hit the FB url  

@Smoke
Scenario:
To verify login functionality with valid username and with password  in FB 
	When enter the username and password
	|username|password|
	|john|john@123|
	|Arun|Arun@123|
	|Mathi|Mathi@123|
	And click the login button 
	
	
	@Sanity
Scenario: To validate the forgot the password link
	When user has to click the forget password link
	And user has to entre the mobileNo
	And click thw search button
	
	
	
	
	
	
	