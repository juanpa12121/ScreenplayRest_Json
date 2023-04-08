Feature: Get list of users on JSON Placeholder API
  Me as Product Owner
  I need an API by GET method
  That consults a list of users

  Background:
    Given The user is in API

  @Scenario1
  Scenario: Request list of users correctly
    When The user makes the query request
    Then The user validates the status code 200

  @Scenario2
  Scenario Outline: Request list of users in the API and validate the response fields
    When The user makes the query request
    Then The user validates that get response contains data expected
      | id   | name   | username   | email   | street   | suite   | city   | zipCode   | lat   | lng   | phone   | website   | companyName   | catchPhrase   | bs   |
      | <id> | <name> | <username> | <email> | <street> | <suite> | <city> | <zipCode> | <lat> | <lng> | <phone> | <website> | <companyName> | <catchPhrase> | <bs> |
    Examples:
      | id | name         | username  | email             | street        | suite | city        | zipCode    | lat      | lng      | phone               | website       | companyName  | catchPhrase                    | bs                               |
      | 2  | Ervin Howell | Antonette | Shanna@melissa.tv | Victor Plains | 879   | Wisokyburgh | 90566-7771 | -43.9509 | -34.4618 | 010-692-6593 x09125 | anastasia.net | Deckow-Crist | Proactive didactic contingency | synergize scalable supply-chains |

