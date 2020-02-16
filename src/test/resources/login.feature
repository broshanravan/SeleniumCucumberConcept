#This a sample feature file


Feature: login feature
  User should be able to enter username.
  User should be able to insert password
  User should be authenticated if the credentials are valid

  Background This is to manage the user login to the system

  Scenario: successful login
    Given user inserts username
    And user inserts password
    And users clicks log in button

    When username and password are valid
    Then the login should be successful

    When username or password are invalid
    Then the login should be unsuccessful

