package pages;

import elements.Button;
import elements.Div;
import elements.Link;
import org.openqa.selenium.By;

public class HomePage {

    private final Button oldSiteButton = new Button(
            By.xpath("//*[@id=\"firstlevel\"]/li[5]/a"));
    private final Link mainPageLink = new Link(
            By.xpath("/html/body/div[5]/div[1]/div[1]/header/div/div/div/div[1]/a"));
    private final Div oldSiteDiv = new Div(
            By.id("ny217-snow-medium"));

    private final Div myOffice = new Div(By.id("userInfo-place"));

    public Button getOldSiteButton() {
        return oldSiteButton;
    }

    public Link getMainPageLink() {
        return mainPageLink;
    }

    public Div getOldSiteDiv() {
        return oldSiteDiv;
    }

    public Div getMyOffice() {
        return myOffice;
    }
}
