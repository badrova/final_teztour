package services;

import pages.LoginPage;

public class LoginPageService {

    private final LoginPage loginPage = new LoginPage();

    public boolean isLoginPageVisible() {
        return loginPage.getEntranceFormIsVisible().isVisible();
    }

    public boolean theLoginFormIsOpen() {
        return loginPage.getLoginFormContent().isVisible();
    }

    public void addEmail(final String email) {
        loginPage.getEmailInput().click();
        loginPage.getEmailInput().clearAndType(email);
    }

    public void continueClick() {
        loginPage.getContinueButton().click();
    }

    public void addPass(final String password) {
        loginPage.getPassInput().click();
        loginPage.getPassInput().clearAndType(password);
    }

    public void enterClick() {
        loginPage.getEnterButton().click();
    }

    public boolean checkMyOffice() {
        return loginPage.getMyOfficePage().isVisible();
    }



}
