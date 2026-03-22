package automation.form;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DemoForm extends PageObject {

    public WebElementFacade getFieldElement(String field) {
        return findBy(String.format("//input[@id='%s']", field.toLowerCase()));
    }

    public WebElementFacade getSubmit(String button) {
        return findBy(String.format("//button[(@id='submit') and contains(text(),'%s')]", button));
    }
}
