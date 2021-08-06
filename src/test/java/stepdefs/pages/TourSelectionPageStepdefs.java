package stepdefs.pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.HomePageService;
import services.OldSiteService;
import utils.Constants;
import utils.Logger;

public class TourSelectionPageStepdefs {
    private final HomePageService homePageService = new HomePageService();
    private final OldSiteService oldSiteService = new OldSiteService();

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
        homePageService.goToOldSite();
        Logger.info("\tOn the old site");
        assert oldSiteService.isTourSelectionLinkSelected();
//        assert homePageService.isTourSelectionLinkVisible();
    }

    @Then("click the extended selection link")
    public void click_the_extended_selection_link() {
        Logger.info("\tTour selection page, click the extended selection link");
        oldSiteService.clickExtendedSelectionLink();
        Logger.info("\tOn the extended selection");
//        homePageService.goToTourSelection();
//        assert !homePageService.isTourSelectionLinkVisible();
    }

    @Then("open the cities list")
    public void open_the_cities_list() {
        oldSiteService.openCityList();

//        homePageService.goToTourSelection();
//        assert !homePageService.isCitiesListOpened();
//        homePageService.goToSelectCity();
//        assert homePageService.isCitiesListOpened();
    }

    @Then("select a city in the  cities list")
    public void select_a_city_in_the_cities_list() {
        oldSiteService.selectCity("Гомель");

//        homePageService.selectGomelCity();
//        assert homePageService.checkSelectedCity("Гомель");
    }

    @Then("open the countries list")
    public void open_the_countries_list() {
        oldSiteService.openCountriesList();

//        homePageService.goToTourSelection();
//        assert !homePageService.isCountriesListOpened();
//        homePageService.goToSelectCountry();
//        assert homePageService.isCountriesListOpened();
    }

    @Then("select the country in the countries list")
    public void select_the_country_in_the_countries_list() {
        homePageService.goToOldSite();
        oldSiteService.clickExtendedSelectionLink();

        oldSiteService.selectCountry("Египет");

//        homePageService.selectCountryEgypt();
//        assert homePageService.checkSelectedCountry("Египет");
    }

    @Then("open the level list")
    public void open_the_level_list() {
        homePageService.goToOldSite();
        oldSiteService.clickExtendedSelectionLink();

        oldSiteService.openLevelList();
    }

    @Then("select a level in the level list")
    public void select_a_level_in_the_level_list() {
        oldSiteService.selectLevel("5 *");
    }

    @Then("open the food list")
    public void open_the_food_list() {
        homePageService.goToOldSite();
        oldSiteService.clickExtendedSelectionLink();

        oldSiteService.openTheFoodList();
    }

    @Then("select the type of food in the food list")
    public void select_the_type_of_food_in_the_food_list() {
        oldSiteService.selectTheFood("Все включено");
    }

    @Then("select check-in date from in the calendar")
    public void select_check_in_date_from_in_the_calendar() {
        homePageService.goToOldSite();
        oldSiteService.clickExtendedSelectionLink();

        oldSiteService.selectDateFrom("09.09.2021");
    }

    @Then("select check-in date to in the calendar")
    public void select_check_in_date_to_in_the_calendar() {
        oldSiteService.selectDateTo("20.09.2021");
    }

    @Then("add nights number from")
    public void add_nights_number_from() {
        homePageService.goToOldSite();
        oldSiteService.clickExtendedSelectionLink();

        oldSiteService.selectNightsFrom("10");
    }

    @Then("add nights number to")
    public void add_nights_number_to() {
        oldSiteService.selectNightsTo("14");
    }

    @Then("open the accommodation list")
    public void open_the_accommodation_list() {
        homePageService.goToOldSite();
        oldSiteService.clickExtendedSelectionLink();

        oldSiteService.openAccommodationList();
    }

    @Then("select accommodation in the accommodation list")
    public void select_accommodation_in_the_accommodation_list() {
        oldSiteService.selectAccommodation("2 Взрослых");
    }

    @When("fill fields on the tourSelectionPage page")
    public void fill_fields_on_the_tour_selection_page_page() {
        homePageService.goToOldSite();
        oldSiteService.clickExtendedSelectionLink();

        oldSiteService.selectCity("Гомель");
        oldSiteService.selectCountry("Египет");
        oldSiteService.selectLevel("5 *");
        oldSiteService.selectTheFood("Все включено");
        oldSiteService.selectDateFrom("09.09.2021");
        oldSiteService.selectDateTo("09.20.2021");
        oldSiteService.selectNightsFrom("10");
        oldSiteService.selectNightsTo("14");
        oldSiteService.selectAccommodation("2 Взрослых");
    }

    @Then("click the find button")
    public void click_the_find_button() {
        oldSiteService.findTour();
        Logger.info("\tThe Find button is pressed");
    }

    @Then("check the result set")
    public void check_the_result_set() {
        Logger.info("\tCheck the result set");
        boolean result = false;
        int secondsToWait = 0;

        while (!result) {
            if (secondsToWait > Constants.TOUR_SEARCH_MAX_WAITING_SECONDS) {
                throw new io.cucumber.java.PendingException();
            }
            try {
                Thread.sleep(Constants.ONE_SECOND);
            } catch (InterruptedException exception) {
                Logger.error(exception.toString());
            }
            secondsToWait++;
            result = oldSiteService.isVisibleSelectTourDiv();
        }
    }

    @Then("click the card price")
    public void click_the_card_price() {
        oldSiteService.selectTheTourPrice();
    }

    @Then("in a box buy tour click buy button")
    public void in_a_box_buy_tour_click_buy_button() {
        try {
            Thread.sleep(Constants.ONE_SECOND * Constants.BUY_TOUR_DELAY_SECONDS);
        } catch (InterruptedException exception) {
            Logger.error(exception.toString());
        }

        oldSiteService.buyTour();

        Logger.info("\tBuy tour.");
    }
}
