package stepdefs.pages;

import io.cucumber.java.en.Given;
import utils.Logger;

public class HomePageStepdefs {

    @Given("start page is open")
    public void start_page_is_open() {
        Logger.info("\t\t\t >>> START PAGE IS OPEN TEST");
    }
}
