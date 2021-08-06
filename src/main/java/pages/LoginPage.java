package pages;

import elements.Div;
import org.openqa.selenium.By;

public class LoginPage {

    private final Div entranceFormIsVisible = new Div(By.xpath("//*[@id=\"content\"]/div[2]/div/div[1]/div[2]/div"));

    public Div getEntranceFormIsVisible() {
        return entranceFormIsVisible;
    }
}
