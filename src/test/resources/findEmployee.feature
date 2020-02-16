#this is the feature file to search foor an employee via the username


Feature: search feature
  #User should be able to enter username.
  #User should be able to fine employee if the username is valid

  Scenario: successful search
    Given user inserts username
    And users clicks search button
    When username is valid
    Then employee details are displayed
    When username is not valid
    Then Display an error message

