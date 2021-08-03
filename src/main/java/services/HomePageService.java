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

    public boolean isCitiesListOpened() {
        Div citiesWrapperDiv = homePage.getCitiesWrapperDiv();
        for (SelenideElement child : citiesWrapperDiv.getChildrenElements()) {
            if (!child.isDisplayed()) {
                return false;
            }
        }
        return true;
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

    public void selectGrodnoCity() {
        homePage.getCityGrodno().click();
    }

    public boolean checkSelectedCity(String city) {
        return homePage.getSelectCityDiv().getText().equals(city);
    }
}
