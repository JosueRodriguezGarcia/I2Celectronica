package core.selenium;

import core.selenium.webdrivers.Browsers;
import core.selenium.webdrivers.Chrome;
import core.selenium.webdrivers.FireFox;
import org.openqa.selenium.WebDriver;

/**
 * This class implements the logic for select a browser.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public class WebDriverFactory {
    private static final String BROWSER_DOES_NOT_EXIST = "The Browser does not exist";
    private static WebDriver webDriver;

    /**
     * This method is used for select a Browser.
     *
     * @param browser The browser parameter defines a input Browser
     * @return a webDriver.
     */
    public static WebDriver getWebDriver(final Browsers browser) {

        switch (browser) {
            case CHROME:
                webDriver = new Chrome().initDriver();
                break;
            case FIREFOX:
                webDriver = new FireFox().initDriver();
                break;
            default:
                throw new RuntimeException(BROWSER_DOES_NOT_EXIST);
        }
        return webDriver;
    }
}
