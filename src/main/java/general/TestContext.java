package general;

import lombok.Data;
import pages.account.AccountPageObject;
import pages.header.NavigationPageObject;
import pages.login.LoginPageObject;
import pages.signup.SignUpPageObject;

@Data
public class TestContext {

    private User user;
    private AccountPageObject accountPage;
    private NavigationPageObject navigation;
    private LoginPageObject loginPage;
    private SignUpPageObject signupPage;

    public TestContext() {
        this.user = new User();
        this.accountPage = new AccountPageObject();
        this.navigation = new NavigationPageObject();
        this,loginPage = new LoginPageObject();
        this.signupPage = new SignUpPageObject();
    }
}
