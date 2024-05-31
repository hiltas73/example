Feature: Login
  Background:
    Given the user navigate to the URL

  Scenario: Verify successful login - happy path
    When the user enter valid "h_iltas@yahoo.com" and "12345Hi"
    Then the user should verify the home page

  @wip
  Scenario Outline: Verify negative scenario
    When the user enters "<email>" and "<password>"
    Then the user should see "<error message>"

    Examples:
      | email             | password | error message                                             |
      | h_iltas@yahoo.com | 123456   | E-posta adresi veya şifre hatalı, kontrol edebilir misin? |
      | h_iltas@yahoo.com | 654321   | E-posta adresi veya şifre hatalı, kontrol edebilir misin? |

# Will work on BVA and/or ECP for test data later
