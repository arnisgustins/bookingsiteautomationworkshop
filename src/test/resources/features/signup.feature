Feature: This feature is about creating new account in the system

  Scenario: Successfull sign-up
    Given I have opened homepage
    When I select My Account menu
      And I select Sign up button
      And I enter First name
      And I enter Last name
      And I enter Mobile number
      And I enter Email address
      And I enter Password
      And I confirm Password
      And I try to Sign Up
    Then user account page is opened

  Scenario: Unsuccessfull sign-up
    Given I have opened homepage
    When I select My Account menu
      And I select Sign up button
      And I try to Sign Up
    Then user account page is opened