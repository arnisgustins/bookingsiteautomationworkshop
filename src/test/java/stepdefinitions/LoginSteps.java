package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import general.User;
import pages.login.LoginPageObject;

public class LoginSteps {


    private LoginPageObject login = new LoginPageObject();
    private User existingUser = new User("Existing", "User");



    @And("^I enter existing Email$")
    public void iEnterLoginEmail() throws Throwable {
        existingUser.setEmail("email@email.com");
        login.enterExistingEmail(existingUser.getEmail());
    }

    @And("^I enter existing Password$")
    public void iEnterLoginPassword() throws Throwable {
        existingUser.setPassword("password");
        login.enterExistingPassword(existingUser.getPassword());
    }

    @And("^I try to Login$")
    public void iTryToLogin() throws Throwable {
        login.selectLoginButton();
    }
}
