package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class LoginSteps {
    @And("^I select Login button$")
    public void iSelectLoginButton() throws Throwable {
        selectLoginButton()
    }

    @And("^I enter Login Email$")
    public void iEnterLoginEmail() throws Throwable {
        enterLoginEmail();
    }

    @And("^I enter Login Password$")
    public void iEnterLoginPassword() throws Throwable {
        enterLoginPassword();
    }

    @And("^I try to Login$")
    public void iTryToLogin() throws Throwable {
        tryToLogin();
    }
}
