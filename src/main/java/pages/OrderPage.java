package pages;

import elements.Button;
import elements.Div;
import elements.Input;
import elements.Selector;
import org.openqa.selenium.By;

public class OrderPage {

    private final String homeAddress = "https://old.tez-tour.com/ru/minsk/search.html#result%7B%22priceMin%22%3A0%2C%22priceMax%22%3A1500000%2C%22currency%22%3A%22533067%22%2C%22nightsMin%22%3A6%2C%22nightsMax%22%3A14%2C%22hotelClassId%22%3A2568%2C%22accommodationId%22%3A1%2C%22rAndBId%22%3A5737%2C%22tourType%22%3A%221%22%2C%22locale%22%3A%22ru%22%2C%22cityId%22%3A12384%2C%22countryId%22%3A%225732%22%2C%22after%22%3A%2224.08.2021%22%2C%22before%22%3A%2228.08.2021%22%2C%22hotelInStop%22%3Afalse%2C%22specialInStop%22%3Afalse%2C%22version%22%3A2%2C%22tourId%22%3A%5B%5B115387%5D%2C%5B26313%5D%2C%5B26576%5D%2C%5B14355%5D%2C%5B111466%5D%2C%5B14353%5D%2C%5B416623%5D%2C%5B14354%5D%2C%5B5734%5D%2C%5B5735%5D%2C%5B14351%5D%5D%2C%22hotelClassBetter%22%3Atrue%2C%22rAndBBetter%22%3Atrue%2C%22hotelId%22%3A%5B%5D%2C%22gdsHotelId%22%3A%5B%5D%2C%22noTicketsTo%22%3Afalse%2C%22noTicketsFrom%22%3Afalse%2C%22searchTypeId%22%3A3%2C%22recommendedFlag%22%3Afalse%2C%22salePrivateFlag%22%3Afalse%2C%22onlineConfirmFlag%22%3Afalse%2C%22promoFlag%22%3Atrue%2C%22birthdays%22%3A%22%22%2C%22contentCountryId%22%3A15147%7D";
    private final Button infoAboutTouristButton = new Button(By.id("stepTo2"));
    private Button checkDataButton = new Button(
            By.xpath("/html/body/div[5]/div[1]/div[2]/div[1]/div[2]/form/div[2]/table/tbody/tr/td[3]/input"));
    private Div passportsDiv = new Div(
            By.xpath("/html/body/div[5]/div[1]/div[2]/div[1]/div[2]/form/div[3]/div[1]"));
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

    public Selector getGenderSelectorFemale(int touristId) {
        return new Selector(By.id("tourists" + touristId + ".genderId1"));
    }

    public Selector getGenderSelectorMale(int touristId) {
        return new Selector(By.id("tourists" + touristId +".genderId2"));
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

    public Input getInnInput(int touristId) {
        return new Input(By.id("tourists" + touristId + ".inn"));
    }

    public Input getPhone(int touristId) {
        return new Input(By.id("tourists" + touristId +".phone"));
    }

    public Button getCheckDataButton() {
        return checkDataButton;
    }

    public Div getPassportsDiv() {
        return passportsDiv;
    }

    public String getHomeAddress() {
        return homeAddress;
    }
}
