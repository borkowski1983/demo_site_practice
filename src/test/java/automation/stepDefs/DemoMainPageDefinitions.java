package automation.stepDefs;

import automation.steps.DemoMainPageSteps;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.annotations.Steps;

@Slf4j
public class DemoMainPageDefinitions {

    @Steps
    DemoMainPageSteps demoMainPageSteps;

    @When("User click {string} on main bar")
    public void userClickMainBar(String buttonName) {
        demoMainPageSteps.clickOnMainBar(buttonName);
    }

    @When("User click {string} on Practice page")
    public void userClickTestLoginPageOnPracticePage(String articleButton) {
        demoMainPageSteps.clickOnPracticePage(articleButton);
    }
}
