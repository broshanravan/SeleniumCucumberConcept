#This a sample feature file

Background This in to manage the user login to the system

Feature: login feature
  User should be able to enter username.
  User should be able to insert password
  User should be authenticated if the credentials are valid

  Scenario: successful login
    Given user inserts username
    And user inserts password
    And users clicks log in button

    When username and password are valid
    Then the login should be successful

    When username or password are invalid
    Then the login should be unsuccessful

