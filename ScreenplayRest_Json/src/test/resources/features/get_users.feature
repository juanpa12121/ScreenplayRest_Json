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