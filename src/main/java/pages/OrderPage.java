package pages;

import elements.Button;
import elements.Input;
import elements.Selector;
import org.openqa.selenium.By;

public class OrderPage {
    private final Button infoAboutTouristButton = new Button(By.id("stepTo2"));

    private Input surnameInput;
    private Input nameInput;
    private Selector nationalitySelect;
    private Input birthdayInput;
    private Input genderInputFemale;
    private Input genderInputMale;
    private Input passportSeria;
    private Input passportNumber;
    private Input passportExpirationDate;
    private Input phone;

    private Button checkDataButton = new Button(
            By.id("/html/body/div[5]/div[1]/div[2]/div[1]/div[2]/form/div[2]/table/tbody/tr/td[3]/input"));
    private Button confirmButton = new Button(
            By.id("/html/body/div[5]/div[1]/div[2]/div[1]/div[2]/form/div[3]/table[5]/tbody/tr/td[3]/input"));

    public Button getInfoAboutTouristButton() {
        return infoAboutTouristButton;
    }

    public Input getSurnameInput(int touristId) {
        return new Input(By.id("tourists" + touristId + ".surname"));
    }

    public Input getNameInput(int touristId) {
        return new Input(By.id("tourists" + touristId + ".name"));
    }

    public Selector getNationalitySelect(int touristId) {
        return new Selector(By.id("tourists" + touristId + ".nationalityId"));
    }

    public Input getBirthdayInput(int touristId) {
        return new Input(By.id("tourists" + touristId + ".birthday"));
    }

    public Input getGenderInputFemale(int touristId) {
        return new Input(By.id("tourists" + touristId + ".genderId1"));
    }

    public Input getGenderInputMale(int touristId) {
        return new Input(By.id("tourists" + touristId +".genderId2"));
    }

    public Input getPassportSeria(int touristId) {
        return new Input(By.id("tourists" + touristId +".passportSeria"));
    }

    public Input getPassportNumber(int touristId) {
        return new Input(By.id("tourists" + touristId +".passportNumber"));
    }

    public Input getPassportExpirationDate(int touristId) {
        return new Input(By.id("tourists" + touristId +".passportExpirationDate"));
    }

    public Input getPhone(int touristId) {
        return new Input(By.id("tourists" + touristId +".phone"));
    }

    public Button getCheckDataButton() {
        return checkDataButton;
    }

    public Button getConfirmButton() {
        return confirmButton;
    }
}
