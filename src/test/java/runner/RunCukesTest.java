package runner;

import core.selenium.WebDriverManager;
import org.testng.annotations.AfterMethod;
import phptravels.report.Report;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterTest;

/**
 * RunCukesTest class.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        glue = {"steps", "phptravels"},
        features = {"src/test/resources/features"})

public class RunCukesTest extends AbstractTestNGCucumberTests {
    /**
     * This method afterExecution executes the project and generate it report.
     */
    @AfterTest
    public void afterExecution() {
        WebDriverManager.getInstance().getWebDriver().close();
        Report.getInstance().generateReport();
    }
}
