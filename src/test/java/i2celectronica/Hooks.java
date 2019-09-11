package i2celectronica;

import core.selenium.WebDriverManager;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

/**
 * This class is used for defines the hooks.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public class Hooks {
    private WebDriver webDriver;

    /**
     * This method is used for initializes the variables.
     */
    public Hooks() {
        this.webDriver = WebDriverManager.getInstance().getWebDriver();
    }

    /**
     * This method is used for implement After.
     * @param scenario The parameter scenario defines a input scenario.
     */
    @After
    public void endTest(final Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException e) {
                e.printStackTrace();
            }
        }
    }
}
