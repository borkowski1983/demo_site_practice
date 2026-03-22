package automation.stepDefs;

import automation.steps.DemoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.annotations.Steps;
import org.openqa.selenium.support.PageFactory;

import static net.serenitybdd.core.Serenity.getDriver;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
public class DemoSiteDef extends PageFactory {

    @Steps
    DemoSteps demoSteps;

    @Given("User launches the page")
    public void userLaunchesThePage() {
        getDriver().navigate().to("https://practicetestautomation.com/practice-test-login/");
    }

    @When("User type {string} in {string} field")
    public void userTypeStudentInUsernameField(String text, String field) {
        demoSteps.enteringTextInTheField(text, field);
    }

    @And("User click {string} button")
    public void userClickSubmitButton(String button) {
        demoSteps.submitClick(button);
    }
}
