package automation.steps;

import automation.form.DemoForm;
import net.serenitybdd.annotations.Step;

public class DemoSteps extends DemoForm {

    @Step
    public void enteringTextInTheField(String text, String field) {
        getFieldElement(field).type(text);
    }

    @Step
    public void submitClick(String button) {
        getSubmit(button).click();
    }
}
