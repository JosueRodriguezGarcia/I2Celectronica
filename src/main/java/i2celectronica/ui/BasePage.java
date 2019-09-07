package i2celectronica.ui;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class is used like base of the Page.
 *
 * @author Josue Rodriguez Garcia.
 * @version 0.0.1
 */
public class BasePage {
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    /**
     * This method is used for initializes a page.
     */
    public BasePage() {
        this.webDriver = WebDriverManager.getInstance().getWebDriver();
        PageFactory.initElements(webDriver, this);
    }
}
