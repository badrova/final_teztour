package stepdefs.pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.HomePageService;
import utils.Logger;

public class HomePageCheckTourSelectionStepdefs {
    private final HomePageService homePageService = new HomePageService();

    @Given("start page is open")
    public void start_page_is_open() {
        Logger.info("\t\t\t >>> START PAGE IS OPEN TEST");
        assert homePageService.isMainPageLinkVisible();
    }

    @Then("press to the old site button on the start page")
    public void press_to_the_old_site_button_on_the_start_page() {
        Logger.info("\t\t\t >>> PRESS TO THE OLD SITE BUTTON ON THE START PAGE");

        assert !homePageService.isOldSiteDivVisible();
        assert homePageService.isMainPageLinkVisible();

        homePageService.goToOldSite();
        assert homePageService.isOldSiteDivVisible();
        assert !homePageService.isMainPageLinkVisible();
    }

    @When("tour selected block is shown")
    public void tour_selected_block_is_shown() {

    }

    @Then("click the extended selection link")
    public void click_the_extended_selection_link() {

    }

    @Then("open the cities list")
    public void open_the_cities_list() {

    }

    @Then("select a city in the  cities list")
    public void select_a_city_in_the_cities_list() {

    }

    @Then("open the countries list")
    public void open_the_countries_list() {

    }

    @Then("select the country in the countries list")
    public void select_the_country_in_the_countries_list() {

    }

    @Then("open the level list")
    public void open_the_level_list() {

    }

    @Then("select a level in the level list")
    public void select_a_level_in_the_level_list() {

    }

    @Then("open the food list")
    public void open_the_food_list() {

    }

    @Then("select the type of food in the food list")
    public void select_the_type_of_food_in_the_food_list() {

    }

    @Then("select check-in date from in the calendar")
    public void select_check_in_date_from_in_the_calendar() {

    }

    @Then("select check-in date to in the calendar")
    public void select_check_in_date_to_in_the_calendar() {

    }

    @Then("add nights number from")
    public void add_nights_number_from() {

    }

    @Then("add nights number to")
    public void add_nights_number_to() {

    }

    @Then("open the accommodation list")
    public void open_the_accommodation_list() {

    }

    @Then("select accommodation in the accommodation list")
    public void select_accommodation_in_the_accommodation_list() {

    }

    @When("fill fields on the tourSelectionPage page")
    public void fill_fields_on_the_tour_selection_page_page() {

    }

    @Then("press the find button")
    public void press_the_find_button() {

    }
}
