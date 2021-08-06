package services;

import pages.OrderPage;

public class OrderPageService {
    private final OrderPage orderPage = new OrderPage();

    public void goToInfoAboutTourist() {
        orderPage.getInfoAboutTouristButton().click();
    }

    public void fillInfoAboutTourist(int touristId, String surname, String name, String nationalityId, String birthday,
                                     boolean isFemale, boolean isMale, String passportSeria,  String passportNumber,
                                     String passportExpirationDate, String phone) {
        orderPage.getSurnameInput(touristId).clearAndType(surname);
        orderPage.getNameInput(touristId).clearAndType(name);
        orderPage.getNationalitySelect(touristId).select(nationalityId);
        orderPage.getBirthdayInput(touristId).clearAndType(birthday);
        if (isFemale) {
            orderPage.getGenderInputFemale(touristId).click();
        }
        if (isMale) {
            orderPage.getGenderInputMale(touristId).click();
        }
        orderPage.getPassportSeria(touristId).clearAndType(passportSeria);
        orderPage.getPassportNumber(touristId).clearAndType(passportNumber);
        orderPage.getPassportExpirationDate(touristId).clearAndType(passportExpirationDate);
        orderPage.getPhone(touristId).clearAndType(phone);

    }

    public void checkData() {
        orderPage.getCheckDataButton().click();
    }

    public void clickConfirmButton() {
        orderPage.getConfirmButton().click();
    }

    public boolean isInfoAboutTouristButtonVisible() {
        return orderPage.getInfoAboutTouristButton().isVisible();
    }
}
