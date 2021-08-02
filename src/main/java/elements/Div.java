package elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class Div extends BaseElement {
    public Div(By by) {
        super(by);
    }

    public Div(SelenideElement wrappedElement) {
        super(wrappedElement);
    }
}
