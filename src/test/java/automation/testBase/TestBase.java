package automation.testBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class TestBase {
    public WebDriver driver;

    @Before
    public WebDriver newDriver() {
        FirefoxOptions options = new FirefoxOptions();
        //options.addArguments("--headless");
        return driver = new FirefoxDriver(options);
    }

    @After
    public void endTest() {
        driver.close();
        driver.quit();
    }
}

