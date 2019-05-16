Feature: Check the google page using PO

  Scenario: Scenario with PO for Google web page
    When I am on Google homepage using PO
    Then I verify lucky button text using PO
    And I enter some text in searchBox using PO
    And I found something using PO



