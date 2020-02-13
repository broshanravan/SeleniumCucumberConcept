Feature: scanning the barcode

  Scenario: valid scan
    Given customer scant the bar code
     When bar code is valid
     Then the system will display goods details

  Scenario: invalid scan
    Given customer scant the bar code
    When bar code is not valid
    Then the system will indicates an error