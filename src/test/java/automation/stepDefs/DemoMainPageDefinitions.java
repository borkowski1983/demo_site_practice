package automation.stepDefs;

import automation.steps.DemoMainPageSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
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

    @Then("System displays menu bar with items:")
    public void systemDisplaysMenuBarWithItems(DataTable table) {
        demoMainPageSteps.checkMainBarTable(table.asList(String.class));
    }

    @And("System in header displays image with the title {string}")
    public void systemInHeaderDisplaysImageWithTheTitle(String title) {
        demoMainPageSteps.checkTitleInHeader(title);
    }

    @Then("System displays {string} page")
    public void systemDisplaysPage(String pageName) {
        demoMainPageSteps.assertPageName(pageName);
    }
}
