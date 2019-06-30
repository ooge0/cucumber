Feature: Checking calculation

Scenario Outline: a new scenario outline with PO for oogeO web site

Given I am on enter a number page
When I enter "<number>" using PO
Then I check invalid "<number>" using PO
And I click "submit" button using PO
Then I see warning message: "<message>" using PO
Examples:
| number | message             |
| 43     | Number is too small |
| 101    | Number is too big   |
