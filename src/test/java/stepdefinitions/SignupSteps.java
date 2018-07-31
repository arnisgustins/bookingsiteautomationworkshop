package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import general.TestContext;
import general.User;
import pages.signup.SignUpPageObject;

import static utils.RandomGenerator.*;

public class SignupSteps {

    TestContext test;

    public SignupSteps(TestContext testContext) {
        this.test = testContext;
    }

    @And("^I enter First name$")
    public void iEnterFirstName() {
        test.getSignupPage().enterFirstName(test.getUser().getFirstName());
    }

    @And("^I enter Last name$")
    public void iEnterLastName() {
        test.getSignupPage().enterLastName(test.getUser().getLastName());
    }

    @And("^I enter Mobile number$")
    public void iEnterMobileNumber() {
        test.getSignupPage().enterMobileNumber(test.getUser().getMobileNumber());
    }

    @And("^I enter Email address$")
    public void iEnterEmailAddress() {
        signup.enterEmail(test.getUser().getEmail());
    }

    @And("^I enter Password$")
    public void iEnterPassword() {
        signup.enterPassword(test.getUser().getPassword());
    }

    @And("^I confirm Password$")
    public void iConfirmPassword() {
        signup.enterConfirmationPassword(test.getUser().getPassword());
    }


    @And("^I try to Sign Up$")
    public void iTryToSignUp() throws Throwable {
        signup.selectSignupButton();
    }
}
