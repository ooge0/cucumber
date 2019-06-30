Feature: Checking user entity creation, deletion

  Scenario: Create a new person on the List of person page and delete it
    Given I am on people with jobs page
    And I click "add a new" button using PO
    And I fill the form using PO
      | Name | Surname | Job | DOB        | Language | Gender | Employee_Status |
      | Max  | Wax     | QA  | 11/02/1999 | english  | Male   | employee        |
    And I click Add button using PO
    And I click "add a new" button using PO
    And I fill the form using PO
      | Name | Surname | Job | DOB        | Language | Gender | Employee_Status |
      | Juli | Watson  | DEV | 11/02/1999 | french   | female | contractor      |
    And I click Add button using PO
    Then I check that table contains "4" records using PO
    Then I delete last created user using PO


