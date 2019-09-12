package core.selenium;

import core.selenium.webdrivers.Browsers;
import core.selenium.webdrivers.Chrome;
import core.selenium.webdrivers.FireFox;
import core.selenium.webdrivers.IBrowser;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

import static core.selenium.webdrivers.Browsers.CHROME;
import static core.selenium.webdrivers.Browsers.FIREFOX;


/**
 * This class implements the logic for select a browser.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public final class WebDriverFactory {

    /**
     * This method is used for initializes the global variables.
     */
    private WebDriverFactory() {
        //There are no global variables to initialize.
    }

    /**
     * This method is used for select a Browser.
     *
     * @param browser The browser parameter defines a input Browser
     * @return a webDriver.
     */

    public static WebDriver getWebDriver(final Browsers browser) {
        Map<Browsers, IBrowser> map;
        map = new HashMap<>();
        map.put(CHROME, new Chrome());
        map.put(FIREFOX, new FireFox());
        return map.get(browser).initDriver();

    }
}
