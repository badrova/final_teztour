package pages;

import elements.Div;
import elements.Input;
import org.openqa.selenium.By;

public class LoginPage {

    private final Div entranceFormIsVisible = new Div(By.xpath("//*[@id=\"content\"]/div[2]/div/div[1]/div[2]/div"));
    private final Div loginFormContent = new Div(By.id("id=\"content\""));
    private final Input emailInput = new Input(By.xpath("/html/body/div[3]/div[1]/div/div/div/div/div[2]/div[2]/form/div[1]/input"));
    private final Input continueButton = new Input(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div/div[2]/div[2]/form/div[4]/input"));
    private final Input passInput = new Input(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div/div[2]/div[2]/form/div[2]/div[1]/input"));
    private final Input enterButton = new Input(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div/div[2]/div[2]/form/div[4]/input"));
    private final Div myOfficePage = new Div(By.xpath("//*[@id=\"content\"]/div[2]/div/div[1]/div[2]/div"));



    public Div getEntranceFormIsVisible() {
        return entranceFormIsVisible;
    }

    public Div getLoginFormContent() {
        return loginFormContent;
    }

    public Input getEmailInput() {
        return emailInput;
    }

    public Input getContinueButton() {
        return continueButton;
    }

    public Input getPassInput() {
        return passInput;
    }

    public Input getEnterButton() {
        return enterButton;
    }

    public Div getMyOfficePage() {
        return myOfficePage;
    }
}
