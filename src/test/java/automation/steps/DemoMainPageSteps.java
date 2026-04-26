package automation.steps;

import automation.form.DemoMainPageForm;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.stream.Collectors;

import static java.lang.String.format;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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

    @Step
    public void checkMainBarTable(List<String> expectedList) {
        List<String> actualItem = demoMainPageForm.getMainBarItems()
                .stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());
        assertEquals(expectedList, actualItem, format(("The list are different: expected %s, actual %s"), expectedList, actualItem));
    }

    @Step
    public void checkTitleInHeader(String title) {
        assertTrue(demoMainPageForm.getHeader.then(format("//img[@alt = '%s']", title)).isVisible());
    }

    @Step
    public void assertPageName(String pageName) {
        assertEquals(pageName, demoMainPageForm.getPageName.getText());
    }
}
