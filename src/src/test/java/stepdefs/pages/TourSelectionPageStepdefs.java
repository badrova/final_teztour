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
        homePageService.selectGomelCity();
        assert homePageService.checkSelectedCity("Гомель");
    }

    @Then("open the countries list")
    public void open_the_countries_list() {
        homePageService.goToTourSelection();
        assert !homePageService.isCountriesListOpened();
        homePageService.goToSelectCountry();
        assert homePageService.isCountriesListOpened();
    }

    @Then("select the country in the countries list")
    public void select_the_country_in_the_countries_list() {
        homePageService.selectCountryEgypt();
        assert homePageService.checkSelectedCountry("Египет");
    }

    @Then("open the level list")
    public void open_the_level_list() {

        throw new io.cucumber.java.PendingException();
    }

    @Then("select a level in the level list")
    public void select_a_level_in_the_level_list() {

        throw new io.cucumber.java.PendingException();
    }

    @Then("open the food list")
    public void open_the_food_list() {

        throw new io.cucumber.java.PendingException();
    }

    @Then("select the type of food in the food list")
    public void select_the_type_of_food_in_the_food_list() {

        throw new io.cucumber.java.PendingException();
    }

    @Then("select check-in date from in the calendar")
    public void select_check_in_date_from_in_the_calendar() {

        throw new io.cucumber.java.PendingException();
    }

    @Then("select check-in date to in the calendar")
    public void select_check_in_date_to_in_the_calendar() {

        throw new io.cucumber.java.PendingException();
    }

    @Then("add nights number from")
    public void add_nights_number_from() {

        throw new io.cucumber.java.PendingException();
    }

    @Then("add nights number to")
    public void add_nights_number_to() {

        throw new io.cucumber.java.PendingException();
    }

    @Then("open the accommodation list")
    public void open_the_accommodation_list() {

        throw new io.cucumber.java.PendingException();
    }

    @Then("select accommodation in the accommodation list")
    public void select_accommodation_in_the_accommodation_list() {

        throw new io.cucumber.java.PendingException();
    }

    @When("fill fields on the tourSelectionPage page")
    public void fill_fields_on_the_tour_selection_page_page() {

        throw new io.cucumber.java.PendingException();
    }

    @Then("click the find button")
    public void click_the_find_button() {

        throw new io.cucumber.java.PendingException();
    }

    @When("check the result set")
    public void check_the_result_set() {

        throw new io.cucumber.java.PendingException();
    }

    @Then("click the card price")
    public void click_the_card_price() {

        throw new io.cucumber.java.PendingException();
    }

    @Then("in a box buy tour click buy button")
    public void in_a_box_buy_tour_click_buy_button() {

        throw new io.cucumber.java.PendingException();
    }
}
