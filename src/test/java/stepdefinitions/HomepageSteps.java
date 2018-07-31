package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import general.TestContext;
import pages.header.NavigationPageObject;

public class HomepageSteps {

    private TestContext test;

    public HomepageSteps(TestContext testContext) {
        this.test = testContext;
    }


    @Given("^I have opened homepage$")
    public void iHaveOpenedHomepage() throws Throwable {
        System.out.println("Navigation is visible");
    }

    @When("^I select My Account menu$")
    public void iSelectMyAccountMenu() throws Throwable {
       test.getNavigation().selectMyAccountButton();
    }

    @And("^I select Sign up button$")
    public void iSelectSignUpButton() throws Throwable {
        test.getNavigation().selectSignUpButton();
    }

    @And("^I select Login button$")
    public void iSelectLoginButton() throws Throwable {
        test.getNavigation().selectLoginButton();
    }




}
