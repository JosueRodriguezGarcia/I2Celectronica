package phptravels.ui;

import core.selenium.WebDriverManager;
import phptravels.common.ReadAppProperties;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is used to navigate the page.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public final class PageTransporter {
    private static final String URL_BASE = "url-base";
    private static WebDriver webDriver;
    private static Map<String, String> endpoint = new HashMap<>();

    /**
     * This method is the constructor.
     */
    private PageTransporter() {
        //empty
    }

    /**
     * This method is used for go to a page.
     *
     * @param url The parameter url defines a input url.
     */
    public static void goToUrl(final String url) {
        endpoint.put("login", "login");
        webDriver = WebDriverManager.getInstance().getWebDriver();
        webDriver.navigate().to(ReadAppProperties.getInstance().getAppProperties().
                get(URL_BASE).concat(endpoint.get(url)));
    }
}
