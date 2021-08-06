package pages;

import elements.Div;
import elements.Input;
import io.cucumber.java.bs.I;
import io.cucumber.java.sl.In;
import org.openqa.selenium.By;

public class LoginPage {

    private final Div entranceFormIsVisible = new Div(By.xpath("//*[@id=\"content\"]/div[2]/div/div[1]/div[2]/div"));
    private final Input emailInput = new Input(By.xpath("/html/body/div[3]/div[1]/div/div/div/div/div[2]/div[2]/form/div[1]/input"));
    private final Div continueButton = new Div(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div/div[2]/div[2]/form/div[4]"));
    private final Div passFormIsVisible = new Div(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div/div[2]/div[2]/form/div[2]/div[1]"));
    private final Input passwordInput = new Input(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div/div[2]/div[2]/form/div[2]/div[1]/input"));
    private final Div enterButton = new Div(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div/div[2]/div[2]/form/div[4]"));

    public Div getEntranceFormIsVisible() {
        return entranceFormIsVisible;
    }

    public Input getEmailInput() {
        return emailInput;
    }

    public Div getContinueButton() {
        return continueButton;
    }

    public Div getPassFormIsVisible() {
        return passFormIsVisible;
    }

    public Input getPasswordInput() {
        return passwordInput;
    }

    public Div getEnterButton() {
        return enterButton;
    }
}


