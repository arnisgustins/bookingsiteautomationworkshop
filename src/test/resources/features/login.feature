Feature: This feature is about loging in

  Scenario: Successfull login
    Given I have opened homepage
    When I select My Account menu
      And I select Login button
      And I enter existing Email
      And I enter existing Password
      And I try to Login
    Then user account page is opened

  Scenario: Unsuccessfull login
    Given I have opened homepage
    When I select My Account menu
      And I select Login button
      And I try to Login
    Then user account page is opened