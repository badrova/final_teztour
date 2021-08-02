package services;

import pages.HomePage;

public class HomePageService {
    private final HomePage homePage = new HomePage();

    public void goToOldSite() {
        homePage.getOldSiteButton().click();
    }

    public boolean isMainPageLinkVisible() {
        return homePage.getMainPageLink().isVisible();
    }

    public boolean isOldSiteDivVisible() {
        return homePage.getOldSiteDiv().isVisible();
    }
}
