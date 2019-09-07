package core.selenium.webdrivers;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * This class implements the configuration of the Chrome browser.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public class Chrome {
    /**
     * This method is used for configure the Chrome browser.
     * @return a WebDriver with configuration the Chrome browser.
     */
    public WebDriver initDriver() {
        ChromeDriverManager.getInstance().version("76.0.3809.126").setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        return new ChromeDriver(chromeOptions);
    }
}
