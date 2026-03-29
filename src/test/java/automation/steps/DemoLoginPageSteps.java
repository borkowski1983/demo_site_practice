package automation.steps;

import automation.form.DemoLoginPageForm;
import net.serenitybdd.annotations.Step;

public class DemoLoginPageSteps {

    DemoLoginPageForm demoLoginPageForm;

    @Step
    public void enteringTextInTheField(String text, String field) {
        demoLoginPageForm.getFieldElement(field).type(text);
    }

    @Step
    public void submitClick(String button) {
        demoLoginPageForm.getSubmit(button).click();
    }

    @Step
    public void displayMessage(String message) {
        demoLoginPageForm.assertMessage(message);
    }
}
