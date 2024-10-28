Feature: Login
Scenario: Successful login with valid input credentials

Given user launch chrome browser
When user open url "https://practicetestautomation.com/practice-test-login/"
And user enter  the username "student" and password as "Password123"
And click on the submit button
Then page title should be "Logged In Successfully | Practice Test Automation"
When user click on logout button
And close browser


