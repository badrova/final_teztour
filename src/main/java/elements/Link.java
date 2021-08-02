package elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class Link extends BaseElement {
    public Link(By by) {
        super(by);
    }

    public Link(SelenideElement wrappedElement) {
        super(wrappedElement);
    }
}
