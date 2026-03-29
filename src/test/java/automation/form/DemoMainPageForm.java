package automation.form;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static java.lang.String.format;

public class DemoMainPageForm extends PageObject {

    @FindBy(xpath = "//ul[@class='menu-primary-items']")
    WebElementFacade mainBarOptions;

    public void clickOnMainBarOptions(String button) {
        mainBarOptions.then(format("//li//a[contains(.,'%s')]", button)).click();
    }

    public WebElementFacade clickOnArticle(String articleButton) {
        return findBy(format("//article//a[normalize-space(text()) = '%s']", articleButton));
    }
}
