package core.selenium.webdrivers;

import org.openqa.selenium.WebDriver;

/**
 * This interface is used for defines the behavior of the browsers.
 */
public interface IBrowser {
    /**
     * This method defines the behavior for browser.
     *
     * @return a IBrowser
     */
    WebDriver initDriver();
}
