package automation.steps;

import automation.form.DemoMainPageForm;
import net.serenitybdd.annotations.Step;

public class DemoMainPageSteps {

    DemoMainPageForm demoMainPageForm;

    @Step
    public void clickOnMainBar(String buttonName) {
        demoMainPageForm.clickOnMainBarOptions(buttonName);
    }

    @Step
    public void clickOnPracticePage(String articleButton) {
        demoMainPageForm.clickOnArticle(articleButton).click();
    }
}
