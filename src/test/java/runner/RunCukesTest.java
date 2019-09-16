package runner;

import core.selenium.WebDriverManager;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterTest;
import phptravels.report.Report;

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
        WebDriverManager.getInstance().getWebDriver().quit();
        Report.getInstance().generateReport();
    }
}
