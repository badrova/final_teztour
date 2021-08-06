package services;

import pages.OldSiteHomePage;

public class OldSiteService {
    private final OldSiteHomePage oldSiteHomePage = new OldSiteHomePage();

    public boolean isTourSelectionLinkSelected() {
        return oldSiteHomePage.getExtendedSelectionLink().isVisible();
    }

    public void clickExtendedSelectionLink() {
        oldSiteHomePage.getExtendedSelectionLink().click();
    }

    public void openCityList() {
        oldSiteHomePage.getCitySelector().click();
    }

    public void selectCity(String option) {
        oldSiteHomePage.getCitySelector().select(option);
    }

    public void openCountriesList() {
        oldSiteHomePage.getCountrySelector().click();
    }

    public void selectCountry(String country) {
        oldSiteHomePage.getCountrySelector().select(country);
    }

    public void openLevelList() {
        oldSiteHomePage.getLevelSelector().click();
    }

    public void selectLevel(String level) {
        oldSiteHomePage.getLevelSelector().select(level);
    }

    public void openTheFoodList() {
        oldSiteHomePage.getFoodTypeSelector().click();
    }

    public void selectTheFood(String food) {
        oldSiteHomePage.getFoodTypeSelector().select(food);
    }

    public void selectDateFrom(String date) {
        oldSiteHomePage.getDateFromInput().clearAndType(date);
    }

    public void selectDateTo(String date) {
        oldSiteHomePage.getDateToInput().clearAndType(date);
    }

    public void selectNightsFrom(String nights) {
        oldSiteHomePage.getNightsMin().clearAndType(nights);
    }

    public void selectNightsTo(String nights) {
        oldSiteHomePage.getNightsMax().clearAndType(nights);
    }

    public void openAccommodationList() {
        oldSiteHomePage.getAccommodationSelect().click();
    }

    public void selectAccommodation(String option) {
        oldSiteHomePage.getAccommodationSelect().select(option);
    }

    public void findTour() {
        oldSiteHomePage.getSearchButton().click();
    }

    public boolean isVisibleSelectTourDiv() {
        return oldSiteHomePage.getSelectTourPriceDiv().isVisible();
    }

    public void selectTheTourPrice() {
        oldSiteHomePage.getSelectTourPriceDiv().click();
    }

    public void buyTour() {
        oldSiteHomePage.getBuyTourButton().click();
    }
}
