package services;

import com.codeborne.selenide.WebDriverRunner;
import pages.OrderPage;

import java.util.ArrayList;

public class OrderPageService {
    private final OrderPage orderPage = new OrderPage();

    public void goToInfoAboutTourist() {
        orderPage.getInfoAboutTouristButton().click();
    }

    public boolean isInfoAboutTouristReady() {
        return orderPage.getInfoAboutTouristButton().isVisible();
    }

    public void fillInfoAboutTourist(int touristId, String surname, String name, String nationalityId, String birthday,
                                     String isFemale, String isMale, String passportSeria,  String passportNumber,
                                     String passportExpirationDate, String inn, String phone) {
        orderPage.getSurnameInput(touristId).clearAndType(surname);
        orderPage.getNameInput(touristId).clearAndType(name);
        orderPage.getNationalitySelect(touristId).select(nationalityId);
        orderPage.getBirthdayInput(touristId).clearAndType(birthday);
        clickName();
        if (Boolean.parseBoolean(isFemale)) {
            orderPage.getGenderSelectorFemale(touristId).click();
        }
        if (Boolean.parseBoolean(isMale)) {
            orderPage.getGenderSelectorMale(touristId).click();
        }
        orderPage.getPassportSeria(touristId).clearAndType(passportSeria);
        orderPage.getPassportNumber(touristId).clearAndType(passportNumber);
        orderPage.getPassportExpirationDate(touristId).clearAndType(passportExpirationDate);
        clickName();
        if (orderPage.getInnInput(touristId).isVisible()) {
            orderPage.getInnInput(touristId).clearAndType(inn);
        }
        orderPage.getPhone(touristId).clearAndType(phone);

    }

    private void clickName() {
        orderPage.getSurnameInput(0).click();
    }

    public void checkData() {
        orderPage.getCheckDataButton().click();
    }

    public String getHomeAddress() {
        return orderPage.getHomeAddress();
    }

    public void switchToFirstTab() {
        ArrayList<String> tabs2 = new ArrayList<>(WebDriverRunner.getWebDriver().getWindowHandles());
        WebDriverRunner.getWebDriver().switchTo().window(tabs2.get(0));
    }

    public void switchToSecondTab() {
        ArrayList<String> tabs2 = new ArrayList<>(WebDriverRunner.getWebDriver().getWindowHandles());
        WebDriverRunner.getWebDriver().switchTo().window(tabs2.get(1));
    }

    public boolean isPassportsDivVisible() {
        return orderPage.getPassportsDiv().isVisible();
    }
}
