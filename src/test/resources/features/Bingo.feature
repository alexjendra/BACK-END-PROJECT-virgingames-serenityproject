@regression
Feature: Testing different request on the virgin currency application

  Scenario: Check if the virgin games application can be accessed by users
    When User sends a GET request to list endpoint
    Then User must get back a valid status code 200