
package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import general.TestContext;

import static org.assertj.core.api.Assertions.assertThat;

public class SignupSteps {

    private TestContext test;

    public SignupSteps(TestContext testContext) {
        this.test = testContext;
    }

    @And("^I enter First name$")
    public void iEnterFirstName() {
        test.getSignUpPage().enterFirstName(test.getUser().getFirstName());
    }

    @And("^I enter Last name$")
    public void iEnterLastName() {
        test.getSignUpPage().enterLastName(test.getUser().getLastName());
    }

    @And("^I enter Mobile number$")
    public void iEnterMobileNumber() {
        test.getSignUpPage().enterMobileNumber(test.getUser().getMobileNumber());
    }

    @And("^I enter Email address$")
    public void iEnterEmailAddress() {
        test.getSignUpPage().enterEmail(test.getUser().getEmailAddress());
    }

    @And("^I enter Password$")
    public void iEnterPassword() {
        test.getSignUpPage().enterPassword(test.getUser().getPassword());
    }

    @And("^I confirm Password$")
    public void iConfirmPassword() {
        test.getSignUpPage().enterConfirmationPassword(test.getUser().getPassword());
    }

    @And("^I select Sign Up button$")
    public void iSelectSignUpButtonInSignUpPage() {
        test.getSignUpPage().selectSignUpButton();
    }

    @And("I have created new account")
    public void newAccountCreated() {
        iEnterFirstName();
        iEnterLastName();
        iEnterMobileNumber();
        iEnterEmailAddress();
        iEnterPassword();
        iConfirmPassword();
        iSelectSignUpButtonInSignUpPage();
    }

    @And("^Sign Up page is opened$")
    public void signUpPageIsOpened() {
        test.getNavigationPage().waitUntilPageLoadingIsFinished();

        assertThat(test.getSignUpPage().getFormTitleText()).isEqualTo("SIGN UP");
        assertThat(test.getSignUpPage().isSignUpButtonVisible()).isTrue();
    }

    @Then("^error messages are displayed$")
    public void errorMessagesAreDisplayed() {
        assertThat(test.getSignUpPage().getErrorMessageCount()).isEqualTo(5);
        assertThat(test.getSignUpPage().getAllErrorMessages().toString()).contains("The First name field is required.");
    }
}