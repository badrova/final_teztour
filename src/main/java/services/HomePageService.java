package services;

import com.codeborne.selenide.SelenideElement;
import elements.Div;
import pages.HomePage;

public class HomePageService {
    private final HomePage homePage = new HomePage();

    public void goToOldSite() {
        homePage.getOldSiteButton().click();
    }

    public void goToTourSelection() {
        homePage.getTourSelectionLink().click();
    }

    public void goToSelectCity() {
        homePage.getSelectCityDiv().click();
    }

    public void goToSelectCountry() {
        homePage.getSelectCountryDiv().click();
    }

    public boolean isCitiesListOpened() {
        Div citiesWrapperDiv = homePage.getCitiesWrapperDiv();
        for (SelenideElement child : citiesWrapperDiv.getChildrenElements()) {
            if (!child.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    public boolean isCountriesListOpened() {
        Div countriesWrapperDiv = homePage.getCountriesWrapperDiv();
        for (SelenideElement child : countriesWrapperDiv.getChildrenElements()) {
            if (child.getText().equals("Куда угодно") && child.isDisplayed()) {
                return true;
            }
        }
        return false;
    }

    public boolean isMainPageLinkVisible() {
        return homePage.getMainPageLink().isVisible();
    }

    public boolean isTourSelectionLinkVisible() {
        return homePage.getTourSelectionLink().isVisible();
    }

    public boolean isOldSiteDivVisible() {
        return homePage.getOldSiteDiv().isVisible();
    }

    public void selectGomelCity() {
        homePage.getCityGomel().click();
    }

    public void selectCountryEgypt() {
        homePage.getCountryEgypt().click();
    }

    public boolean checkSelectedCity(String city) {
        return homePage.getSelectCityDiv().getText().equals(city);
    }

    public boolean checkSelectedCountry(String country) {
        return homePage.getSelectCountryDiv().getText().equals(country);
    }

    public boolean isMyOfficeButtonVisible () {
        return homePage.getMyOffice().isVisible();
    }
}
