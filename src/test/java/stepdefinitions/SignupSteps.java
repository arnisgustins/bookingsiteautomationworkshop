package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import general.User;
import pages.signup.SignUpPageObject;

import static utils.RandomGenerator.*;

public class SignupSteps {

    private SignUpPageObject signup = new SignUpPageObject();
    private User user = new User();

    @And("^I enter First name$")
    public void iEnterFirstName() throws Throwable {
        signup.enterFirstName(user.getFirstName());
    }

    @And("^I enter Last name$")
    public void iEnterLastName() throws Throwable {
        signup.enterLastName(user.getLastName());
    }

    @And("^I enter Mobile number$")
    public void iEnterMobileNumber() throws Throwable {
        signup.enterMobileNumber(user.getMobileNumber());
    }

    @And("^I enter Email address$")
    public void iEnterEmailAddress() throws Throwable {
        signup.enterEmail(user.getEmail());
    }

    @And("^I enter Password$")
    public void iEnterPassword() throws Throwable {
        signup.enterPassword(user.getPassword());
    }

    @And("^I confirm Password$")
    public void iConfirmPassword() throws Throwable {
        signup.enterConfirmationPassword(user.getPassword());
    }


    @And("^I try to Sign Up$")
    public void iTryToSignUp() throws Throwable {
        signup.selectSignupButton();
    }
}
