Feature: Successful Login

  Scenario: Verify successful login
    Given the user navigate to the URL
    When the user enter valid "h_iltas@yahoo.com" and "12345Hi"
    Then the user should verify the home page