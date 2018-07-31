package pages.header;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.login.LoginPageObject;
import pages.signup.SignUpPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class NavigationPageObject {

    private SelenideElement getMyAcountButton() {
        return $(By.xpath("//nav/descendant::li[@id='li_myaccount']/a"));
    }

    private SelenideElement getSignUpButton() {
        return $(By.xpath("//nav/descendant::a[contains(text(), 'Sign Up')]"));
    }

    private SelenideElement getLoginButton() {
        return $("//nav/descendant::a[contains(text(), 'Login')]");
    }

    public void selectMyAccountButton() {
        getMyAcountButton().click();
    }

    public SignUpPageObject selectSignUpButton() {
        getSignUpButton().click();
        return page(SignUpPageObject.class);
    }

    public LoginPageObject selectLoginButton() {
        getLoginButton().click();
        return page(LoginPageObject.class);
    }
}

