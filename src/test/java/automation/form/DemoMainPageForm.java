package automation.form;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

import static java.lang.String.format;

public class DemoMainPageForm extends PageObject {

    @FindBy(xpath = "//ul[@class='menu-primary-items']")
    WebElementFacade mainBarOptions;

    @FindBy(xpath = "//header")
    public WebElementFacade getHeader;

    @FindBy(xpath = "//h1")
    public WebElementFacade getPageName;

    public void clickOnMainBarOptions(String button) {
        mainBarOptions.then(format("//li//a[contains(.,'%s')]", button)).click();
    }

    public WebElementFacade clickOnArticle(String articleButton) {
        return findBy(format("//article//a[normalize-space(text()) = '%s']", articleButton));
    }

    public List<WebElementFacade> getMainBarItems() {
        return mainBarOptions.thenFindAll("//li//a");
    }
}
