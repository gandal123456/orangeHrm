Feature: Add user functionality

Background: user is on Admin page
Given user opens "chrome" chrome browser
Given user enter url  
When user enter "Admin" as username
When user enter "admin123" as password
When user click on  login button


Scenario: Add user with valid data
When user click on Admin button
When user click on Add user
When user select "Admin" as user role      
When user select "Enabled" as status
When user enter "Demo@123" as a password
When user enter "ra" as employee name
When user enter "ravi1" as a username
When user confirm "Demo@123" as password
When user click on save button
Then Application shows message as user successfully saved


  