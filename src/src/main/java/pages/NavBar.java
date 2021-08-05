package pages;

import com.codeborne.selenide.SelenideElement;
import elements.Button;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NavBar {

    private final SelenideElement root = $(By.id("navbar"));

    private final Button productsBtn = new Button(root.$(By.id("navbar-products-btn")));
    //..

    public void openProducts() {
        productsBtn.click();
    }
}
