package i2celectronica.ui;

import core.selenium.WebDriverManager;
import i2celectronica.common.ReadAppProperties;
import org.openqa.selenium.WebDriver;

/**
 * This class is used to navigate the page.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public class PageTransporter {
    private static WebDriver webDriver;
    /**
     * This method is used for go to a page.
     *
     * @param url The parameter url defines a input url.
     */
    public static void goToUrl(final String url) {
        webDriver = WebDriverManager.getInstance().getWebDriver();
        webDriver.navigate().to(ReadAppProperties.getInstance().getUrl(url));
    }
}
