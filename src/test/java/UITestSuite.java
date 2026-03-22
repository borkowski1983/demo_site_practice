import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;

@CucumberOptions(features = "src/test/resources/features")
public class UITestSuite extends AbstractTestNGCucumberTests {

    @BeforeClass
    public static void setSystemProperties() {
        System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\drivers\\os\\firefox\\geckodriver.exe");
    }
}
