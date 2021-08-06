package services;

import pages.LoginPage;

public class LoginPageService {

    private final LoginPage loginPage = new LoginPage();

    public boolean isLoginPageVisible() {
        return loginPage.getEntranceFormIsVisible().isVisible();
    }

}
