Feature: Create new address after login

  Scenario Outline: Create new address and verify if the data is correct

    Given User is logged in to MyStore
    When User goes in to https://mystore-testlab.coderslab.pl/index.php?controller=addresses by
    And User clicks on "+ Create new address
    And User fills the form "New address" with <alias>, <address>, <city>, <zip/postal code>, <country> <phone>
    And User saves the data
    Then check if the data in the added address is correct

    Examples:
    |alias |address |city |zip/postal code |country |phone|
    |CR7   |Av. Verde|Funchal|9000-265     |Portugal|351 300 587|
