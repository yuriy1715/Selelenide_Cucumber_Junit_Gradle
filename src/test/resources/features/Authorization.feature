Feature: Authorization in main page

  Background:
    Given an open browser on the page https://github.com

  Scenario: user should correct sign in on main page
      And Create new user name test1 with password test1 with email test@test.com
@t
  Scenario: sign up as a correct user
      And open Sign In form
      And Login as user test with password test
