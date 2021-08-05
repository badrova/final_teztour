package stepdefs.pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.HomePageService;
import utils.Logger;

public class CheckoutStepdefs {
    private final HomePageService homePageService = new HomePageService();

    @Given("start page is open")
    public void start_page_is_open() {
        Logger.info("\tSTART PAGE IS OPEN TEST");
        assert homePageService.isMainPageLinkVisible();

    }

    @Then("start page is open than")
    public void start_page_is_open_then() {
        Logger.info("\tSTART PAGE IS OPEN THEN TEST");
        assert homePageService.isMainPageLinkVisible();
    }
}
