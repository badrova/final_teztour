package stepdefs.pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.HomePageService;
import utils.Logger;

public class AuthorizationPageStepdefs {

    private final HomePageService homePageService = new HomePageService();

    @Then("click the My account button")
    public void clickTheMyAccountButton() {
        Logger.info("\tGo to the login page");
        assert homePageService.isMyOfficeButtonVisible();

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
