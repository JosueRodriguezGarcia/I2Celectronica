package phptravels.ui;

import core.selenium.WebDriverManager;
import phptravels.common.ReadAppProperties;
import org.openqa.selenium.WebDriver;

/**
 * This class is used to navigate the page.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public final class PageTransporter {
    /**
     * This method is used for initializes the global variables.
     */
    private PageTransporter() {
        //There are no global variables to initialize.
    }

    /**
     * This method is used for go to a page.
     *
     * @param url The parameter url defines a input url.
     */
    public static void goToUrl(final String url) {
        WebDriver webDriver = WebDriverManager.getInstance().getWebDriver();
        webDriver.navigate().to(ReadAppProperties.getInstance().getUrl(url));
    }
}
