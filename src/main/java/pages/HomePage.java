package pages;

import elements.Button;
import elements.Div;
import elements.Link;
import org.openqa.selenium.By;

public class HomePage {
    private final Button oldSiteButton = new Button(By.xpath("//*[@id=\"firstlevel\"]/li[5]/a"));
    private final Link mainPageLink = new Link(By.xpath("/html/body/div[5]/div[1]/div[1]/header/div/div/div/div[1]/a"));
    private final Link tourSelectionLink = new Link(By.xpath("/html/body/div[5]/footer/div/div[1]/ul/li[1]/ul/li[1]/a"));
    private final Div oldSiteDiv = new Div(By.id("ny217-snow-medium"));
    private final Div selectCityDiv = new Div(
            By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[2]/div/div/div/div[2]/form/div[1]/div/div[1]/div[1]/div/div/div/div/div[1]/div"));
    private final Div citiesWrapperDiv = new Div(
            By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[2]/div/div/div/div[2]/form/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div/div[1]"));
    private final Div cityGrodno = new Div(
            By.xpath("//*[@id=\"mCSB_1_container\"]/div/div[1]/div[5]/div/div"));
    private final Div cityCheckedPlace = new Div(
            By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div[2]/div/div/div/div[2]/form/div[1]/div/div[1]/div[1]/div/div/div/div/div[1]/div"));

    public Button getOldSiteButton() {
        return oldSiteButton;
    }

    public Link getMainPageLink() {
        return mainPageLink;
    }

    public Link getTourSelectionLink() {
        return tourSelectionLink;
    }

    public Div getOldSiteDiv() {
        return oldSiteDiv;
    }

    public Div getCitiesWrapperDiv() {
        return citiesWrapperDiv;
    }

    public Div getSelectCityDiv() {
        return selectCityDiv;
    }

    public Div getCityCheckedPlace() {
        return cityCheckedPlace;
    }

    public Div getCityGrodno() {
        return cityGrodno;
    }
}
