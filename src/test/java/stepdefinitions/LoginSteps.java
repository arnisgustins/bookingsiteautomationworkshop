package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import general.TestContext;
import general.User;
import pages.login.LoginPageObject;

public class LoginSteps {


    private TestContext test;

    public LoginSteps(TestContext testContext) {
        this.test = testContext;
    }

    @And("^I enter existing Email$")
    public void iEnterLoginEmail() throws Throwable {
        test.getLoginPage().enterExistingEmail(test.getUser().getEmail());
    }

    @And("^I enter existing Password$")
    public void iEnterLoginPassword() throws Throwable {
        test.getLoginPage().enterExistingPassword(test.getUser().getPassword());
    }

    @And("^I try to Login$")
    public void iTryToLogin() throws Throwable {
        test.getLoginPage().selectLoginButton();
    }
}
