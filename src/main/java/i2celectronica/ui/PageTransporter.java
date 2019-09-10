package i2celectronica.ui;

import core.selenium.WebDriverManager;
import i2celectronica.common.ReadAppProperties;
import i2celectronica.ui.pages.LoginPage;
import org.openqa.selenium.WebDriver;

/**
 * This class is used to navigate the page.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public class PageTransporter {
    private static PageTransporter pageTransporter;
    private WebDriver webDriver;

    /**
     * This method is used for initializes the variables.
     */
    public PageTransporter() {
        initialize();
    }

    /**
     * This method is used for initializes the variables.
     */
    public void initialize() {
        webDriver = WebDriverManager.getInstance().getWebDriver();
    }

    /**
     * This method is used for instantiate the PageTransporter class.
     *
     * @return a pageTransporter.
     */
    public static PageTransporter getInstance() {
        if (pageTransporter == null) {
            pageTransporter = new PageTransporter();
        }
        return pageTransporter;
    }

    /**
     * This method is used for go to a page.
     *
     * @param url The parameter url defines a input url.
     */
    public void goToUrl(final String url) {
        webDriver.navigate().to(url);
        webDriver.get(url);
    }

    /**
     * This method is used for go to a page login.
     *
     * @return a LoginPage.
     */
    public LoginPage goToUrlLogin() {
        goToUrl(ReadAppProperties.getInstance().getUrlLogin());
        return new LoginPage();
    }
}
