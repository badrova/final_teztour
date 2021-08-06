package elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

public class Div extends BaseElement {
    public Div(By by) {
        super(by);
    }

    public Div(SelenideElement wrappedElement) {
        super(wrappedElement);
    }

    public void click() {
        this.logAction("Click");
        this.getWrappedElement().click();
    }

    public List<SelenideElement> getChildrenElements() {
        return super.getChildrenElements();
    }

    public String getText() {
        return getWrappedElement().getText();
    }



}
