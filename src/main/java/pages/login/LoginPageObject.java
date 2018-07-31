package pages.login;

import com.codeborne.selenide.SelenideElement;
import com.sun.jna.platform.win32.Advapi32Util;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPageObject {


    private SelenideElement getExistingEmailField() {
        return $("input[name='username']");
    }

    private SelenideElement getExistingPasswordField() {
        return $("input[name='password']");
    }

    private SelenideElement getLoginButton() {
        return $(".loginbtn");
    }

    private SelenideElement getUserAccountButton(String username) {
        return $("//nav/");
    }

    public void enterExistingEmail(String email) {
        getExistingEmailField().sendKeys(email);
    }

    public void enterExistingPassword(String password) {
        getExistingPasswordField().sendKeys(password);
    }

    public AccountPageObject selectLoginButton() {
        getLoginButton().click();
        return page(AccountPageObject.class);
    }

    public AccountPageObject

}

