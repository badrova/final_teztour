package elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class Option extends BaseElement {
    public Option(By by) {
        super(by);
    }

    public Option(SelenideElement wrappedElement) {
        super(wrappedElement);
    }

    public void click() {
        this.logAction("Click");
        this.getWrappedElement().click();
    }
}
