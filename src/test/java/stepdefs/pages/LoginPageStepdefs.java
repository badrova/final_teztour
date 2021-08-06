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
        Logger.info("\tCheck that the login form is visible");
        assert loginPageService.isLoginPageVisible();
    }

    @When("the login form is open")
    public void theLoginFormIsOpen() {
        Logger.info("\tThe login form is open");
        assert loginPageService.theLoginFormIsOpen();

    }

    @Then("add email to the email field")
    public void addEmailToTheEmailField() {
        Logger.info("\tAdd email to the email field");
        loginPageService.addEmail("alia_asya@tut.by");
    }

    @And("click the continue button")
    public void clickTheContinueButton() {
        Logger.info("\tClick the continue button");
        loginPageService.continueClick();
    }

    @Then("add password to the password field")
    public void addPasswordToThePasswordField() {
        Logger.info("\tAdd password to the password field");
        loginPageService.addPass("123456789");
    }

    @And("click the enter button")
    public void clickTheEnterButton() {
        Logger.info("\tClick the enter button");
        loginPageService.enterClick();
    }

    @Then("check the transition to my account")
    public void checkTheTransitionToMyAccount() {
        Logger.info("\tCheck the transition to my account");
        assert loginPageService.checkMyOffice();
    }


}
