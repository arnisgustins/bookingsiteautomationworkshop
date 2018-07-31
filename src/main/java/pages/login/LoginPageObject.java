package pages.login;

import com.codeborne.selenide.SelenideElement;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPageObject {


    private SelenideElement getExistingEmailField() {
        return $("test");
    }

    private SelenideElement getExistingPasswordField() {
        return $("test");
    }

    private SelenideElement getLoginButton() {
        return $("test");
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

}

