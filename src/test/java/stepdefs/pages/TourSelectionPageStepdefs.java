package stepdefs.pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.HomePageService;
import utils.Logger;

public class TourSelectionPageStepdefs {
    private final HomePageService homePageService = new HomePageService();

    @Then("press to the old site button on the start page")
    public void press_to_the_old_site_button_on_the_start_page() {
        Logger.info("\tGo to the old site");

        assert !homePageService.isOldSiteDivVisible();
        assert homePageService.isMainPageLinkVisible();

        homePageService.goToOldSite();
        assert homePageService.isOldSiteDivVisible();
        assert !homePageService.isMainPageLinkVisible();

    }

    @When("tour selected block is shown")
    public void tour_selected_block_is_shown() {
        Logger.info("\tTour selection page, check tour selected block is shown");
        assert homePageService.isTourSelectionLinkVisible();
    }

    @Then("click the extended selection link")
    public void click_the_extended_selection_link() {
        Logger.info("\tTour selection page, click the extended selection link");
        homePageService.goToTourSelection();
        assert !homePageService.isTourSelectionLinkVisible();
    }

    @Then("open the cities list")
    public void open_the_cities_list() {
        homePageService.goToTourSelection();
        assert !homePageService.isCitiesListOpened();
        homePageService.goToSelectCity();
        assert homePageService.isCitiesListOpened();
    }

    @Then("select a city in the  cities list")
    public void select_a_city_in_the_cities_list() {
        homePageService.selectGrodnoCity();
        assert homePageService.checkSelectedCity("Гродно");
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

    @Then("click the find button")
    public void click_the_find_button() {

    }

    @When("check the result set")
    public void check_the_result_set() {

    }

    @Then("click the card price")
    public void click_the_card_price() {

    }

    @Then("in a box buy tour click buy button")
    public void in_a_box_buy_tour_click_buy_button() {

    }
}
