package stepdefs.pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.HomePageService;
import services.LoginPageService;
import utils.Logger;

public class LoginPageStepdefs {

    private final HomePageService homePageService = new HomePageService();
    private final LoginPageService loginPageService = new LoginPageService();

    @Then("click the My account button")
    public void clickTheMyAccountButton() {
        Logger.info("\tGo to the login page");
        assert homePageService.isMyOfficeButtonVisible();

    }

    @And("check that the login form is visible")
    public void checkThatTheLoginFormIsVisible() {
        assert loginPageService.isLoginPageVisible();
    }

    @When("the login form is open")
    public void theLoginFormIsOpen() {

    }

    @Then("add email to the email field")
    public void addEmailToTheEmailField() {

    }

    @And("click the continue button")
    public void clickTheContinueButton() {

    }

    @Then("check the transition to my account")
    public void checkTheTransitionToMyAccount() {
    }


}
