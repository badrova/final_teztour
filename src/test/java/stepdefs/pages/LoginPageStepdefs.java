package stepdefs.pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import services.HomePageService;
import services.LoginPageService;
import utils.Logger;
import static com.codeborne.selenide.Selenide.actions;

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

    @Then("add email to the email field")
    public void addEmailToTheEmailField() {
        Logger.info("\tAdd email to the email field");
        loginPageService.addEmail("alia_asya@tut.by");
    }

    @And("click the continue button")
    public void clickTheContinueButton() {
        Logger.info("\tClick the continue button");
        loginPageService.clickTheContinueButton();
    }

    @Then("add password to password field")
    public void addPasswordToPasswordField() {
        Logger.info("\tAdd password to password field");
        assert loginPageService.isLoginPageVisible();
        loginPageService.addPassword("123456789");
    }

    @Then("click the enter button")
    public void clickTheEnterButton() {
        Logger.info("\tClick the enter button");
        loginPageService.clickTheEnterButton();
    }

    @Then("check the transition to my account")
    public void checkTheTransitionToMyAccount() {
    }


    @Then("click the  office icon")
    public void clickTheOfficeIcon() {

    }

    @And("click the logout button")
    public void clickTheLogoutButton() {

    }

    @Then("check logout")
    public void checkLogout() {
    }

}
