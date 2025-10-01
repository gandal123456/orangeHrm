Feature: Login functionality

Background: user is on main page
Given user opens "webdriver.chrome.driver" chrome browser with exe "F:\\Automation Support 2025\\chromedriver.exe"
Given user enter url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" 


Scenario: Login functinality with valid username and valid password
When user enter "Admin" as username
When user enter "admin123" as password
When user click on  login button
Then Application shows user profile to user


