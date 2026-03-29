package automation.stepDefs;

import automation.steps.DemoLoginPageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.annotations.Steps;

import static net.serenitybdd.core.Serenity.getDriver;

@Slf4j
public class DemoLoginPageDefinitions {

    @Steps
    DemoLoginPageSteps demoLoginPageSteps;

    @Given("User launches the main page")
    public void userLaunchesThePage() {
        getDriver().navigate().to("https://practicetestautomation.com");
    }

    @When("User type {string} in {string} field")
    public void userTypeStudentInUsernameField(String text, String field) {
        demoLoginPageSteps.enteringTextInTheField(text, field);
    }

    @And("User click {string} button")
    public void userClickSubmitButton(String button) {
        demoLoginPageSteps.submitClick(button);
    }

    @Then("System displays a message {string}")
    public void systemDisplaysAMessageLoggedInSuccessfully(String message) {
        demoLoginPageSteps.displayMessage(message);
    }
}
