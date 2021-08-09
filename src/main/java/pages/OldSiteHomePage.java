package pages;

import elements.*;
import org.openqa.selenium.By;

public class OldSiteHomePage {

    private final Link tourSelectionLink = new Link(
            By.xpath("//*[@id=\"ts-form-last-tr\"]/td[1]/a"));
    private final Link extendedSelectionLink = new Link(
            By.xpath("//*[@id=\"ts-form-last-tr\"]/td[1]/a"));
    private final Selector citySelector = new Selector(
            By.id("cities"));
    private final Selector countrySelector = new Selector(
            By.id("countries"));
    private final Selector levelSelector = new Selector(
            By.id("st-hc"));
    private final Selector foodTypeSelector = new Selector(
            By.id("st-rb"));
    private final Input dateFromInput = new Input(
            By.id("st-after"));
    private final Input dateToInput = new Input(
            By.id("st-before"));
    private final Input nightsMin = new Input(
            By.id("st-nights-min"));
    private final Input nightsMax = new Input(
            By.id("st-nights-max"));
    private final Selector accommodationSelect = new Selector(By.id("accommodation"));
    private final Button searchButton = new Button(
            By.xpath("/html/body/div[5]/div[1]/div[2]/div/div[1]/div[3]/div/input"));
    private final Div selectTourPriceDiv = new Div(
            By.xpath("//*[@id=\"st-result-table\"]/tbody/tr[2]/td[9]/h5/a/div[1]"));
    private final Link buyOnlineTourLink = new Link(By.xpath("/html/body/div[1]/div/div[1]/div[1]/a"));
    private final Option cityGomel = new Option(
            By.xpath("/html/body/div[5]/div[1]/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/select/optgroup[1]/option[3]"));
    private final Option firstAccommodation = new Option(
            By.xpath("/html/body/div[5]/div[1]/div[2]/div/div[1]/div[2]/div[2]/div[3]/div[2]/select/option[1]"));

    public Link getTourSelectionLink() {
        return tourSelectionLink;
    }

    public Link getExtendedSelectionLink() {
        return extendedSelectionLink;
    }

    public Selector getCitySelector() {
        return citySelector;
    }

    public Selector getCountrySelector() {
        return countrySelector;
    }

    public Selector getLevelSelector() {
        return levelSelector;
    }

    public Selector getFoodTypeSelector() {
        return foodTypeSelector;
    }

    public Input getDateFromInput() {
        return dateFromInput;
    }

    public Input getDateToInput() {
        return dateToInput;
    }

    public Input getNightsMin() {
        return nightsMin;
    }

    public Input getNightsMax() {
        return nightsMax;
    }

    public Selector getAccommodationSelect() {
        return accommodationSelect;
    }

    public Button getSearchButton() {
        return searchButton;
    }

    public Div getSelectTourPriceDiv() {
        return selectTourPriceDiv;
    }

    public Link getBuyOnlineTourLink() {
        return buyOnlineTourLink;
    }

    public Option getCityGomel() {
        return cityGomel;
    }

    public Option getFirstAccommodation() {
        return firstAccommodation;
    }
}
