package general;

import lombok.Data;
import pages.account.AccountPageObject;
import pages.header.NavigationPageObject;
import pages.hoteldetails.ConfirmHotelBookingPageObject;
import pages.hoteldetails.HotelDetailsPageObject;
import pages.landingpage.LandingPageObject;
import pages.login.LoginPageObject;
import pages.singup.SignUpPageObject;

@Data
public class TestContext {

    private User user;
    private AccountPageObject accountPage;
    private NavigationPageObject navigationPage;
    private LandingPageObject landingPage;
    private LoginPageObject loginPage;
    private SignUpPageObject signUpPage;
    private HotelDetailsPageObject hotelDetailPage;
    private ConfirmHotelBookingPageObject confirmHotelBookingPage;

    public TestContext() {
        user = new User();
        accountPage = new AccountPageObject();
        navigationPage = new NavigationPageObject();
        landingPage = new LandingPageObject();
        loginPage = new LoginPageObject();
        signUpPage = new SignUpPageObject();
        hotelDetailPage = new HotelDetailsPageObject();
        confirmHotelBookingPage = new ConfirmHotelBookingPageObject();
    }

}
