Feature: Login functionality

Background: user is on main page
Given user opens "chrome" chrome browser
Given user enter url  

@SmokeTest
Scenario: Login functinality with valid username and valid password
When user enter "Admin" as username
When user enter "admin123" as password
When user click on  login button
Then Application shows user profile to  user

  