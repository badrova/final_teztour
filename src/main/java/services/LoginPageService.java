package services;

import pages.LoginPage;

public class LoginPageService {

    private final LoginPage loginPage = new LoginPage();

    public boolean isLoginPageVisible() {
        return loginPage.getEntranceFormIsVisible().isVisible();
    }

    public void addEmail(final String email) {
        loginPage.getEmailInput().clearAndType(email);
    }

    public void clickTheContinueButton() {
        loginPage.getContinueButton().click();
    }

    public void passFormIsVisible() {
        loginPage.getPassFormIsVisible();
    }

    public void addPassword(final String password) {
        loginPage.getPasswordInput().clearAndType(password);
    }

    public void clickTheEnterButton() {
        loginPage.getEnterButton().click();
    }

}
