Feature: This is login feature of Booking Hostel 
Scenario: This is login scenario of hostel 
	Given user in Hostel Login page 
	When user enter valid cendentials 
		|UserName | Password|
		|MathiJohn | Mathi1612|
	And click login button 