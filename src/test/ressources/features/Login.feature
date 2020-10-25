Feature: Testing Facebook Login
  Scenario: User should not be able to login with invalid credentials
    Given User is on the facebook Login page
    And user logs in with username,password
    Then user should see a message error
