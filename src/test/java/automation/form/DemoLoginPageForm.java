package automation.form;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DemoLoginPageForm extends PageObject {

    @FindBy(xpath = "//article//h1")
    private WebElementFacade messageBox;

    public WebElementFacade getFieldElement(String field) {
        return findBy(String.format("//input[@id='%s']", field.toLowerCase()));
    }

    public WebElementFacade getSubmit(String button) {
        return findBy(String.format("//button[(@id='submit') and contains(text(),'%s')]", button));
    }

    public void assertMessage(String message) {
        Assert.assertEquals(messageBox.getText(), message);
    }
}
